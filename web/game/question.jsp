<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.List" %>
<%@ page import="org.apache.commons.lang3.ObjectUtils" %>
<%@ page import="org.apache.commons.lang3.StringUtils" %>
<%@ page import="org.apache.commons.lang3.StringEscapeUtils" %>
<%@ page import="org.apache.commons.lang3.Validate" %>
<%@ page import="com.google.common.collect.ListMultimap" %>
<%@ page import="com.siliconage.util.Tally" %>
<%@ page import="com.siliconage.web.ControllerServlet" %>
<%@ page import="com.scobolsolo.application.Account" %>
<%@ page import="com.scobolsolo.application.Diff" %>
<%@ page import="com.scobolsolo.application.Game" %>
<%@ page import="com.scobolsolo.application.GameFactory" %>
<%@ page import="com.scobolsolo.application.Match" %>
<%@ page import="com.scobolsolo.application.Packet" %>
<%@ page import="com.scobolsolo.application.Performance" %>
<%@ page import="com.scobolsolo.application.Placement" %>
<%@ page import="com.scobolsolo.application.Player" %>
<%@ page import="com.scobolsolo.application.PlayerFactory" %>
<%@ page import="com.scobolsolo.application.Question" %>
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

Performance lclLeftPerf = lclGame.findPerformance(lclLeftPlayer);
Performance lclRightPerf = lclGame.findPerformance(lclRightPlayer);

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

Response lclLeftResponse = lclLeftPerf == null ? null : lclLeftPerf.findResponseForBasePlacement(lclBasePL);
Response lclRightResponse = lclRightPerf == null ? null : lclRightPerf.findResponseForBasePlacement(lclBasePL);
boolean lclExtantResponses = (lclLeftResponse != null && lclLeftResponse.hasLocation()) || (lclRightResponse != null && lclRightResponse.hasLocation());

Diff lclDiff;
if (lclExtantResponses) {
	if (lclLeftResponse != null && lclLeftResponse.getDiff() != null && lclRightResponse != null && lclRightResponse.getDiff() != null) {
		Validate.isTrue(lclLeftResponse.getDiff() == lclRightResponse.getDiff(), "Players responded to different versions of the question: " + lclLeftResponse.getDiff().getId() + " and " + lclRightResponse.getDiff().getId());
		lclDiff = lclLeftResponse.getDiff();
	} else {
		// Should this be a warning or something?
		lclDiff = lclActualPlacement.getQuestion().getCurrentDiff();
	}
} else {
	lclDiff = lclActualPlacement.getQuestion().getCurrentDiff();
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
		<p>The score going into this question is <%= lclLeftPlayer.getContact().getName() %> <%= lclScores.get(lclLeftPerf) %>, <%= lclRightPlayer.getContact().getName() %> <%= lclScores.get(lclRightPerf) %>.</p>
	</div>
</div><%

if (lclOvertime == false && lclPreviousPL == null && StringUtils.isNotBlank(lclRound.getGameStartMessageHtml())) {
	%><section id="game-end-message" class="row columns">
		<div class="primary callout" data-closable>
			<button class="large close-button" aria-label="Close" type="button" data-close onclick="$(this).trigger('close.zf.trigger')">
				<span aria-hidden="true">&times;</span>
			</button>
			<%= lclRound.getGameStartMessageHtml() %>
		</div>
	</section><%
}

%><div class="row">
	<div class="small-12 columns">
		<%= GameEntryQuestionMenu.outputFoundationMenu(
			lclGame,
			"Question&nbsp;#" + lclBasePL.getNumber() + (lclReplacement ? " (REPLACEMENT)" : ""),
			lclLeftPlayer,
			lclRightPlayer,
			lclIndex,
			lclReplacement,
			lclBasePL.isReplaceable(),
			lclOvertime
		) %><%
		
		if (lclPreviousPL != null && lclPreviousPL.isScorecheckAfter()) {
			%><div class="primary callout" data-closable>
				<button class="large close-button" aria-label="Close" type="button" data-close onclick="$(this).trigger('close.zf.trigger')">
					<span aria-hidden="true">&times;</span>
				</button>
				<p>Before reading this question, please announce the score: <%= lclLeftPlayer.getContact().getName() %> <%= lclScores.get(lclGame.findPerformance(lclLeftPlayer)) %>, <%= lclRightPlayer.getContact().getName() %> <%= lclScores.get(lclGame.findPerformance(lclRightPlayer)) %>.</p>
				<p>If either player believes the score is otherwise, please resolve the discrepancy.</p>
			</div><%
		}
		
		if (lclOvertime && lclPacket != null && lclBasePL == lclPacket.getOvertimePlacements().get(0)) {
			%><div class="secondary callout" data-closable>
				<button class="large close-button" aria-label="Close" type="button" data-close onclick="$(this).trigger('close.zf.trigger')">
					<span aria-hidden="true">&times;</span>
				</button>
				<p>Before reading this question, tell the players the following: &#8220;Please remember that you are expected to attempt to answer each question if you think you know it. Deliberately missing questions is unsportsmanlike behavior and will be reported to your coach, your school administration, and other quizbowl organizations.&#8221;</p>
			</div><%
		}
		
		if (lclUser.mayViewQuestions(lclMatch)) {
			if (lclActualPlacement.getQuestion().getText() != null) {
				%><p class="question-text"><%= Question.outputTextHTML(lclDiff, Question.SHOW_BUZZ_LINKS | (lclUser.showPronunciationGuidesFor(lclActualPlacement) ? Question.SHOW_PRONUNCIATION_GUIDES : 0)) %></p><%
			}
			if (lclActualPlacement.getQuestion().getAnswer() != null) {
				%><p class="question-answer"><%= Question.outputAnswerHTML(lclDiff, lclUser.showPronunciationGuidesFor(lclActualPlacement)) %></p><%
			}
		}
	%></div>
</div>
<div class="row">
	<div class="small-12 columns">
		<button class="button" id="continueButton" onclick="goOn()">Continue&hellip;</button><%
		if (lclExtantResponses) {
			%> <button class="button" id="resetButton" onclick="usePersisted()">Restore Saved Data</button><%
		}
		%> <button class="button" id="clearButton" onclick="clearResponses()">Clear</button>
	</div>
</div>

<div id="buzzMenuContainer"></div>

<script>
	var lclOriginalData = {
		'game_id': <%= lclGame.getId() %>,
		'replacement': <%= lclReplacement %>,
		'overtime': <%= lclOvertime %>,
		'index': <%= lclIndex %>,
		'base_placement_id': <%= lclBasePL.getId() %>,
		'replacement_placement_id': <%= lclReplacementPL == null ? null : lclReplacementPL.getId() %>,
		'diff_id': <%= lclDiff.getId() %>,
		'left': {
			'player_id': <%= lclLeftPlayer.getId() %>,
			'name': '<%= StringEscapeUtils.escapeEcmaScript(lclLeftPlayer.getContact().getName()) %>',
			'buzzed': false
		},
		'right': {
			'player_id': <%= lclRightPlayer.getId() %>,
			'name': '<%= StringEscapeUtils.escapeEcmaScript(lclRightPlayer.getContact().getName()) %>',
			'buzzed': false
		}
	};
	
	function recordPersistedBuzzes() {<%
		if (lclLeftResponse != null && lclLeftResponse.hasLocation()) { // THINK: This won’t show anything if there’s no location. What should we do then?
			%>buzz('left', findWordId(<%= lclLeftResponse.getWordStartIndex(-1) %>), <%= lclLeftResponse.getType().isCorrect() %>);<%
		}
		
		if (lclRightResponse != null && lclRightResponse.hasLocation()) { // THINK: This won’t show anything if there’s no location. What should we do then?
			%>buzz('right', findWordId(<%= lclRightResponse.getWordStartIndex(-1) %>), <%= lclRightResponse.getType().isCorrect() %>);<%
		}
		
		if (lclLeftResponse != null && lclRightResponse != null) {
			%>removeCloseWarning();<%
		}
	%>}
</script>

<jsp:include page="/template/footer.jsp">
	<jsp:param name="loadScript" value="/game/response.js" />
	<jsp:param name="loadScript" value="/game/question.js" />
</jsp:include>
