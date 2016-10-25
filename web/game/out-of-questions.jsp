<%@ page import="java.util.Arrays" %>
<%@ page import="org.apache.commons.lang3.Validate" %>
<%@ page import="com.scobolsolo.application.Account" %>
<%@ page import="com.scobolsolo.application.Game" %>
<%@ page import="com.scobolsolo.application.GameFactory" %>
<%@ page import="com.scobolsolo.application.Match" %>
<%@ page import="com.scobolsolo.application.Performance" %>
<%@ page import="com.scobolsolo.application.Player" %>
<%@ page import="com.scobolsolo.application.PlayerFactory" %>
<%@ page import="com.scobolsolo.application.Tournament" %>
<%@ page import="com.scobolsolo.matches.QuestionResponse" %>
<%@ page import="com.scobolsolo.menu.GameEntryQuestionMenu" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.Utility" %>

<%
Game lclGame = Validate.notNull(GameFactory.getInstance().fromHttpRequest(request));
Match lclMatch = lclGame.getMatch();
Account lclUser = Account.demand(request);
Validate.isTrue(lclUser.mayEnter(lclMatch), "Not authorized");
Validate.isTrue(lclGame.isTied());

Tournament lclT = lclMatch.getTournament();

Player lclLeftPlayer = Validate.notNull(PlayerFactory.getInstance().fromHttpRequest(request, "left_player_id"));
Player lclRightPlayer = Validate.notNull(PlayerFactory.getInstance().fromHttpRequest(request, "right_player_id"));

int lclTieScore = lclGame.getTieScore().intValue();
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="<%= lclT.getCode() %>" />
    <jsp:param name="pageTitle" value="Out of Questions" />
	<jsp:param name="topMenu" value="<%= Menus.staff(lclUser.findStaff(lclT)).asTopLevel().output(request, \"match-\" + lclMatch.getUniqueString()) %>" />
	<jsp:param name="h1" value="Out of Questions" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<%= GameEntryQuestionMenu.outputFoundationMenu(lclGame, "Out of Questions", lclLeftPlayer, lclRightPlayer, -1, false, false, true) %>
		<p>
			The game <%
			Performance[] lclPerfs = lclGame.createPerformanceArray();
			Arrays.sort(lclPerfs, Performance.PlayerNameComparator.getInstance());
			Validate.isTrue(lclPerfs.length >= 2);
			if (lclPerfs.length == 2) {
				%> between <%= lclPerfs[0].getPlayer().getName() %> and <%= lclPerfs[1].getPlayer().getName() %><%
			} else {
				%> among <%= Utility.makeList(lclPerfs, argPerf -> argPerf.getPlayer().getName()) %><%
			}
			%> is tied at <%= lclTieScore == 1 ? "1 point" : lclTieScore + " points" %>, but there are no more tiebreaker questions available online. Please contact the control room (<%= lclT.getControlRoom().getShortName() %>) for further instructions.
		</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
