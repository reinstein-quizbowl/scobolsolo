<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.List" %>
<%@ page import="org.apache.commons.lang3.ObjectUtils" %>
<%@ page import="org.apache.commons.lang3.Validate" %>
<%@ page import="com.google.common.collect.ListMultimap" %>
<%@ page import="com.siliconage.util.Tally" %>
<%@ page import="com.siliconage.web.ControllerServlet" %>
<%@ page import="com.scobolsolo.application.Account" %>
<%@ page import="com.scobolsolo.application.Game" %>
<%@ page import="com.scobolsolo.application.GameFactory" %>
<%@ page import="com.scobolsolo.application.Match" %>
<%@ page import="com.scobolsolo.application.Packet" %>
<%@ page import="com.scobolsolo.application.Performance" %>
<%@ page import="com.scobolsolo.application.Placement" %>
<%@ page import="com.scobolsolo.application.Player" %>
<%@ page import="com.scobolsolo.application.PlayerFactory" %>
<%@ page import="com.scobolsolo.application.Response" %>
<%@ page import="com.scobolsolo.application.ResponseType" %>
<%@ page import="com.scobolsolo.application.Round" %>
<%@ page import="com.scobolsolo.application.Staff" %>
<%@ page import="com.scobolsolo.application.Tournament" %>
<%@ page import="com.scobolsolo.matches.MatchStatus" %>
<%@ page import="com.scobolsolo.menu.GameEntryQuestionMenu" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.HTMLUtility" %>

<%
Game lclGame = Validate.notNull(GameFactory.getInstance().fromHttpRequest(request), "no game");
Match lclMatch = lclGame.getMatch();
Account lclUser = Account.demand(request);
Validate.isTrue(lclUser.mayEnter(lclMatch), "Not authorized");

Tournament lclT = lclMatch.getTournament();
Staff lclS = lclUser.getContact().findStaff(lclT);
// Validate.isTrue(lclMatch.determineStatus().mayEnterData(), "game is not enterable (" + lclMatch.determineStatus() + ")");

Player lclLeftPlayer = Validate.notNull(PlayerFactory.getInstance().fromHttpRequest(request, "left_player_id"));
Player lclRightPlayer = Validate.notNull(PlayerFactory.getInstance().fromHttpRequest(request, "right_player_id"));

boolean lclReplacement = ControllerServlet.getBooleanParameter(request, "needs_replacement");
boolean lclOvertime = ControllerServlet.getBooleanParameter(request, "overtime");

Round lclRound = lclMatch.getRound();
Packet lclPacket = lclRound.getPacket(); // may be null, in very exceptional situations
List<Placement> lclPlacements;
if (lclPacket == null) {
	lclPlacements = null;
} else if (lclOvertime) {
	lclPlacements = lclPacket.getOvertimePlacements();
} else {
	lclPlacements = lclPacket.getRegulationPlacements();
}

int lclIndex = ControllerServlet.getRequiredIntParameter(request, "index");
Validate.isTrue(lclIndex >= 0, "invalid index");
Validate.isTrue(lclPlacements == null || lclIndex < lclPlacements.size(), "index smaller than placements");
Placement lclBasePL = lclPlacements == null ? null : lclPlacements.get(lclIndex);
Placement lclReplacementPL = null;
if (lclPlacements == null) {
	lclReplacementPL = null;
} else if (lclReplacement) {
	lclReplacementPL = Validate.notNull(lclBasePL.findReplacement(), "no replacement available");
}
Placement lclActualPlacement = ObjectUtils.firstNonNull(lclReplacementPL, lclBasePL);

Placement lclPreviousPL;
if (lclPlacements == null) {
	lclPreviousPL = null;
} else if (lclIndex == 0) {
	lclPreviousPL = null;
} else {
	lclPreviousPL = lclPlacements.get(lclIndex - 1);
}

Tally<Performance> lclScores = lclGame.getScoresBefore(lclIndex, lclOvertime);
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="<%= lclT.getCode() %>" />
    <jsp:param name="pageTitle" value="Game Entry" />
	<jsp:param name="topMenu" value="<%= Menus.staff(lclUser.findStaff(lclT)).asTopLevel().output(request, \"match-\" + lclMatch.getUniqueString()) %>" />
	<jsp:param name="h1" value="<%= lclLeftPlayer.getContact().getName() + \" vs. \" + lclRightPlayer.getContact().getName() %>" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>You are reading <%= lclRound.getName() %>, question&nbsp;#<%= lclBasePL.getNumber() %>. On your left is <%= lclLeftPlayer.getNameWithSchool() %>; on your right is <%= lclRightPlayer.getNameWithSchool() %>. If any of this is incorrect, stop immediately and rectify the situation!</p>
		<p>The score going into this question is <%= lclLeftPlayer.getContact().getName() %> <%= lclScores.get(lclGame.findPerformance(lclLeftPlayer)) %>, <%= lclRightPlayer.getContact().getName() %> <%= lclScores.get(lclGame.findPerformance(lclRightPlayer)) %>.</p>
	</div>
</div>

<div class="row">
	<div class="small-12 columns">
		<%= GameEntryQuestionMenu.outputFoundationMenu(
			lclGame,
			"Question&nbsp;#" + lclBasePL.getNumber() + (lclReplacement ? " (REPLACEMENT)" : ""),
			lclLeftPlayer,
			lclRightPlayer,
			lclIndex,
			lclReplacement,
			lclOvertime
		) %><%
		
		if (lclPreviousPL != null && lclPreviousPL.isScorecheckAfter()) {
			%><div class="row">
				<div class="small-12 columns">
					<div data-alert class="row alert-box info">
						Before continuing, please announce the score: <%= lclLeftPlayer.getContact().getName() %> <%= lclScores.get(lclGame.findPerformance(lclLeftPlayer)) %>, <%= lclRightPlayer.getContact().getName() %> <%= lclScores.get(lclGame.findPerformance(lclRightPlayer)) %>. If either player believes the score is otherwise, please resolve the discrepancy.
						<a href="#" class="close">&times;</a>
					</div>
				</div>
			</div><%
		}
		
		if (lclUser.mayViewQuestions(lclMatch)) {
			if (lclActualPlacement.getQuestion().getText() != null) {
				%><p class="question-text"><%= lclActualPlacement.getQuestion().outputTextHTML() %></p><%
			}
			if (lclActualPlacement.getQuestion().getAnswer() != null) {
				%><p class="question-answer"><%= lclActualPlacement.getQuestion().outputAnswerHTML() %></p><%
			}
		}
	%></div>
</div><%

%><form action="QuestionResponse" method="post">
	<input type="hidden" name="game_id" value="<%= lclGame.getId() %>" />
	<input type="hidden" name="left_player_id" value="<%= lclLeftPlayer.getId() %>" />
	<input type="hidden" name="right_player_id" value="<%= lclRightPlayer.getId() %>" />
	<input type="hidden" name="index" value="<%= lclIndex %>" />
	<input type="hidden" name="overtime" value="<%= lclOvertime %>" />
	<input type="hidden" name="base_placement_id" value="<%= lclBasePL.getId() %>" /><%
	if (lclReplacementPL != null) {
		%><input type="hidden" name="replacement_placement_id" value="<%= lclReplacementPL.getId() %>" /><%
	}
	%><div class="row"><%
		for (Player lclPlayer : Arrays.asList(lclLeftPlayer, lclRightPlayer)) {
			String lclName;
			if (lclPlayer == lclLeftPlayer) {
				lclName = "left_player_response_type_code";
			} else if (lclPlayer == lclRightPlayer) {
				lclName = "right_player_response_type_code";
			} else {
				throw new IllegalStateException();
			}
			
			ResponseType lclSelectedRT = lclPlayer.determineDefaultResponseType();
			
			Performance lclPerf = lclGame.findPerformance(lclPlayer);
			if (lclPerf != null) {
				final Response lclR = lclPerf.findResponseForBasePlacement(lclBasePL);
				if (lclR != null) {
					lclSelectedRT = lclR.getResponseType();
				}
			}
			
			%><div class="small-12 medium-6 columns">
				<fieldset>
					<legend><%= lclPlayer.getNameWithSchoolShortName() %></legend><%
					for (ResponseType lclRT : lclPlayer.determineResponseTypesToOffer()) {
						%><label><input type="radio" name="<%= lclName %>" value="<%= lclRT.getCode() %>" <%= lclSelectedRT != null && lclRT == lclSelectedRT ? "checked=\"checked\"" : "" %> />&nbsp;<%= lclRT.getName() %></label><%
					}
				%></fieldset>
			</div><%
		}
	%></div>
	<div class="row">
		<div class="small-12 columns">
			<input type="submit" value="Continue..." />
		</div>
	</div>
</form>

<jsp:include page="/template/footer.jsp" />
