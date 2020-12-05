<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.Collection" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.LinkedList" %>
<%@ page import="java.util.stream.Collectors" %>
<%@ page import="org.apache.commons.lang3.StringUtils" %>
<%@ page import="org.apache.commons.lang3.Validate" %>
<%@ page import="com.siliconage.web.form.DropdownField" %>
<%@ page import="com.siliconage.web.form.FunctionalNameCodeExtractor" %>
<%@ page import="com.siliconage.web.form.NameCodeExtractor" %>
<%@ page import="com.siliconage.web.form.RadioField" %>
<%@ page import="com.scobolsolo.application.Account" %>
<%@ page import="com.scobolsolo.application.Game" %>
<%@ page import="com.scobolsolo.application.GameFactory" %>
<%@ page import="com.scobolsolo.application.Match" %>
<%@ page import="com.scobolsolo.application.Performance" %>
<%@ page import="com.scobolsolo.application.Player" %>
<%@ page import="com.scobolsolo.application.Round" %>
<%@ page import="com.scobolsolo.application.Staff" %>
<%@ page import="com.scobolsolo.application.Tournament" %>
<%@ page import="com.scobolsolo.matches.MatchStatus" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<%
Game lclGame = Validate.notNull(GameFactory.getInstance().fromHttpRequest(request));
Match lclMatch = lclGame.getMatch();
Account lclUser = Account.demand(request);
Validate.isTrue(lclUser.mayEnter(lclMatch), "Not authorized");

Round lclR = lclMatch.getRound();
Tournament lclT = lclMatch.getTournament();

Performance lclWinnerPerf = Validate.notNull(lclGame.determineWinner());
Performance lclLoserPerf = Validate.notNull(lclGame.determineLoser());

Player lclWinner = lclWinnerPerf.getPlayer();
Player lclLoser = lclLoserPerf.getPlayer();

Match lclNextForWinner = lclMatch.getNextForWinner();
Match lclNextForLoser = lclMatch.getNextForLoser();
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="<%= lclT.getCode() %>" />
    <jsp:param name="pageTitle" value="Game Over" />
	<jsp:param name="topMenu" value="<%= Menus.staff(lclUser.findStaff(lclT)).asTopLevel().output(request, \"match-\" + lclMatch.getUniqueString()) %>" />
	<jsp:param name="h1" value="<%= lclWinner.getNameWithSchoolShortName() + \" defeats \" + lclLoser.getNameWithSchoolShortName() %>" />
</jsp:include><%

if (StringUtils.isNotBlank(lclR.getGameEndMessageHtml())) {
	%><section id="game-end-message" class="row columns">
		<div class="primary callout" data-closable>
			<button class="large close-button" aria-label="Close" type="button" data-close>
				<span aria-hidden="true">&times;</span>
			</button>
			<%= lclR.getGameEndMessageHtml() %>
		</div>
	</section><%
}

%><div class="row">
	<div class="small-12 columns">
		<p>Congratulations to <%= lclWinner.getNameWithSchool() %> for defeating <%= lclLoser.getNameWithSchool() %>, <%= lclWinnerPerf.getScore() %>&ndash;<%= lclLoserPerf.getScore() %>.</p>
		
		<p>Give the winning card, <%= lclMatch.getWinningCard().getName() %>, to <%= lclWinner.getContact().getName() %>, and the losing card, <%= lclMatch.getLosingCard().getName() %>, to <%= lclLoser.getContact().getName() %>.</p><%
		
		if (lclNextForWinner == null) {
			%><p>
				<%= lclWinner.getContact().getName() %> is done for the <%= lclMatch.getPhase().getName() %>.<%
				if (lclMatch.getWinningCard().getFinalMessage() != null) {
					%> Please pass along the following message: “<%= lclMatch.getWinningCard().getFinalMessage() %>”<%
				}
			%></p><%
		} else {
			%><p>
				<%= lclWinner.getContact().getName() %>’s next match is during <%= lclNextForWinner.getRound().getName() %> at <%= lclNextForWinner.getRound().getStartTimeWithDateIfDifferent() %> in <%= lclNextForWinner.getRoom().getName() %><%
				if (lclNextForWinner.determineStatus().areAllPlayersKnown()) {
					Game lclG = Validate.notNull(lclNextForWinner.getGame());
					if (lclWinner == lclG.getIncomingWinningCardPlayer()) {
						%> against <%= lclG.getIncomingLosingCardPlayer().getNameWithSchool() %><%
					} else if (lclWinner == lclG.getIncomingLosingCardPlayer()) {
						%> against <%= lclG.getIncomingWinningCardPlayer().getNameWithSchool() %><%
					} // else, it’s not on the card system, or something along those lines
				}
				%>.
			</p><%
		}
		
		if (lclNextForLoser == null) {
			%><p>
				<%= lclLoser.getContact().getName() %> is done for the <%= lclMatch.getPhase().getName() %>.<%
				if (lclMatch.getLosingCard().getFinalMessage() != null) {
					%> Please pass along the following message: “<%= lclMatch.getLosingCard().getFinalMessage() %>”<%
				}
			%></p><%
		} else {
			%><p>
				<%= lclLoser.getContact().getName() %>’s next match is during <%= lclNextForLoser.getRound().getName() %> at <%= lclNextForLoser.getRound().getStartTimeWithDateIfDifferent() %> in <%= lclNextForLoser.getRoom().getName() %><%
				if (lclNextForLoser.determineStatus().areAllPlayersKnown()) {
					Game lclG = Validate.notNull(lclNextForLoser.getGame());
					if (lclLoser == lclG.getIncomingWinningCardPlayer()) {
						%> against <%= lclG.getIncomingLosingCardPlayer().getNameWithSchool() %><%
					} else if (lclLoser == lclG.getIncomingLosingCardPlayer()) {
						%> against <%= lclG.getIncomingWinningCardPlayer().getNameWithSchool() %><%
					} // else, it’s not on the card system, or something along those lines
				}
				%>.
			</p><%
		}
		
		%><p>Do you need to <a href="/game/index.jsp?object=<%= lclT.getUniqueString() %>">enter another game</a>?</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
