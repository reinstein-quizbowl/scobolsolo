<%@ page import="java.text.DecimalFormat" %>
<%@ page import="java.time.LocalDate" %>
<%@ page import="java.util.Collections" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Comparator" %>
<%@ page import="java.util.OptionalDouble" %>
<%@ page import="java.util.stream.Collectors" %>
<%@ page import="org.apache.commons.lang3.Validate" %>
<%@ page import="com.opal.ImplicitTableDatabaseQuery" %>
<%@ page import="com.opal.LocalDateCache" %>
<%@ page import="com.scobolsolo.application.Account" %>
<%@ page import="com.scobolsolo.application.Performance" %>
<%@ page import="com.scobolsolo.application.Player" %>
<%@ page import="com.scobolsolo.application.PlayerFactory" %>
<%@ page import="com.scobolsolo.application.Response" %>
<%@ page import="com.scobolsolo.application.ResponseTypeFactory" %>
<%@ page import="com.scobolsolo.application.SchoolRegistration" %>
<%@ page import="com.scobolsolo.application.Tournament" %>
<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.matches.MatchStatus" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<%
Tournament lclT = Validate.notNull(TournamentFactory.getInstance().forUniqueString(request.getParameter("object")));

Account lclUser = Account.determineCurrent(request);
boolean lclAdmin = lclUser != null && lclUser.mayActAsTournamentDirector(lclT);

List<PlayerStanding> lclStandings = lclT.streamSchoolRegistration()
	.flatMap(SchoolRegistration::streamPlayer)
	.filter(argP -> argP.isExhibition() == false)
	.map(PlayerStanding::new)
	.sorted(
		Comparator.<PlayerStanding>comparingInt(argPS -> argPS.getPlayer().getFinalPlace(Integer.MAX_VALUE))
			.thenComparingInt(argPS -> -1 * argPS.getWins())
			.thenComparingInt(argPS -> argPS.getLosses())
			.thenComparingDouble(argPS -> -1.0d * argPS.getPPTUH())
			.thenComparing(PlayerStanding::getPlayer)
	).collect(Collectors.toList());
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="<%= lclT.getCode() %>" />
	<jsp:param name="pageTitle" value="Standings" />
	<jsp:param name="topMenu" value="<%= Menus.stats(lclT).asTopLevel().output(request, \"standings\") %>" />
	<jsp:param name="h1" value="Standings" />
</jsp:include>

<div class="row">
	<div class="small-12 columns"><%
		if (lclStandings.isEmpty()) {
			LocalDate lclToday = LocalDateCache.today();
			if (lclT.getDate().equals(lclToday)) {
				%><p>There are no results available yet. Keep checking back!</p><%
			} else if (lclT.getDate().isBefore(lclToday)) {
				%><p>We don’t have full results available for this tournament. Sorry! We do have a <a href="<%= lclT.getUrl() %>">summary</a> available.</p><%
			} else {
				%><p>This tournament hasn’t started yet.</p><%
			}
		} else {
			boolean lclShowFinalPlaces = lclStandings.stream().anyMatch(it -> it.getPlayer().getFinalPlaceAsObject() != null);
			boolean lclShowYears = lclStandings.stream().anyMatch(it -> it.getPlayer().getSchoolYear() != null);
			boolean lclShowCategoryDepth = lclStandings.stream().anyMatch(it -> it.getAverageCorrectBuzzDepth().isPresent());
			
			%><table><%
				if (lclStandings.stream().anyMatch(PlayerStanding::hasAnyMatchesWithBothCardsGettingWin)) {
					%><caption>
						In some matches, both players are credited with a win. The actual results still affect category awards, seeds, and potentially tiebreakers to get into the Championship Match.
					</caption><%
				}
				%><thead>
					<tr>
						<%= lclShowFinalPlaces ? "<th><abbr title='final place'>#</abbr></th>" : "" %>
						<th>Player</th>
						<%= lclShowYears ? "<th>Year</th>" : "" %>
						<th>School</th>
						<th class="number">Record</th>
						<th class="number">Points</th>
						<th class="number"><abbr title="tossups heard">TUH</abbr></th>
						<th class="number"><abbr title="points per 20 tossups heard">PP20TUH</abbr></th><%
						if (lclShowCategoryDepth) {
							%><th class="number"><abbr title="average distance into questions of correct buzzes, weighted by game">CDepth</abbr></th><%
						}
					%></tr>
				</thead>
				<tbody><%
					DecimalFormat lclDF = new DecimalFormat("0.00");
					DecimalFormat lclPF = new DecimalFormat("0.0%");
					
					for (PlayerStanding lclS : lclStandings) {
						Player lclP = lclS.getPlayer();
						SchoolRegistration lclSR = lclP.getSchoolRegistration();
						
						%><tr><%
							if (lclShowFinalPlaces) {
								%><th data-order="<%= lclP.getFinalPlace("?") %>"><%= lclP.getFinalPlace("&nbsp;") %></th><%
							}
							%><th data-order="<%= lclP.getContact().getSortBy() %>">
								<a href="/stats/player-detail.jsp?school_registration_id=<%= lclSR.getId() %>#player_<%= lclP.getId() %>"><%= lclP.getContact().getName() %></a><%
								if (lclAdmin) {
									%> (<a href="/tournament/player-edit.jsp?player_id=<%= lclP.getId() %>">admin</a>)<%
								}
							%></th><%
							if (lclShowYears) {
								%><td><%= lclP.getSchoolYear() == null ? "&nbsp;" : lclP.getSchoolYear().getVeryShortName() %></td><%
							}
							%><td data-order="<%= lclSR.getSchool().getName() %>"><a href="/stats/player-detail.jsp?school_registration_id=<%= lclSR.getId() %>"><%= lclSR.getSchool().getExplainedName() %></a></td>
							<td class="number" data-order="<%= lclDF.format(lclS.getWinningPercentage()) %>"><%= lclS.getWins() %>&ndash;<%= lclS.getLosses() %></td>
							<td class="number"><%= lclS.getPoints() %></td>
							<td class="number"><%= lclS.getTUH() %></td>
							<td class="number"><%= lclDF.format(20.0d * lclS.getPPTUH()) %></td><%
							if (lclShowCategoryDepth) {
								%><td class="number"><%
									OptionalDouble lclACBD = lclS.getAverageCorrectBuzzDepth();
									if (lclACBD.isPresent()) {
										%><%= lclPF.format(lclACBD.getAsDouble()) %><%
									} else {
										%>n/a<%
									}
								%></td><%
							}
						%></tr><%
					}
				%></tbody>
			</table><%
		}
	%></div>
</div>

<jsp:include page="/template/footer.jsp" />

<%!
static class PlayerStanding {
	private final Player myPlayer;
	private final int myWins;
	private final int myLosses;
	private final int myPoints;
	private final int myTUH;
	private final OptionalDouble myCDepth;
	private final boolean myAnyMatchesWithBothCardsGettingWin;
	
	PlayerStanding(Player argP) {
		super();
		
		myPlayer = argP;
		
		int lclWins = 0;
		int lclLosses = 0;
		int lclPoints = 0;
		int lclTUH = 0;
		boolean lclAnyMatchesWithBothCardsGettingWin = false;
		
		List<Response> lclResponses = new ArrayList<>();
		for (Performance lclP : argP.getPerformanceSet()) {
			if (lclP.getGame().getMatch().determineStatus() == MatchStatus.COMPLETE) {
				if (argP == lclP.getGame().getOutgoingWinningCardPlayer() || lclP.getGame().getMatch().isBothCardsGetWin()) {
					++lclWins;
				} else {
					++lclLosses;
				}
				
				if (lclP.getGame().getMatch().isBothCardsGetWin()) {
					lclAnyMatchesWithBothCardsGettingWin = true;
				}
				
				lclPoints += lclP.getScore();
				lclTUH += lclP.getGame().getTossupsHeard(0);
				
				lclResponses.addAll(lclP.getResponseSet());
			}
		}
		
		myWins = lclWins;
		myLosses = lclLosses;
		myPoints = lclPoints;
		myTUH = lclTUH;
		myCDepth = Response.calculateCDepth(lclResponses);
		myAnyMatchesWithBothCardsGettingWin = lclAnyMatchesWithBothCardsGettingWin;
	}
	
	Player getPlayer() {
		return myPlayer;
	}
	
	int getWins() {
		return myWins;
	}
	
	int getLosses() {
		return myLosses;
	}
	
	int getPoints() {
		return myPoints;
	}
	
	int getTUH() {
		return myTUH;
	}
	
	OptionalDouble getAverageCorrectBuzzDepth() {
		return myCDepth;
	}
	
	double getWinningPercentage() {
		if (getWins() + getLosses() == 0) {
			return 0.0d;
		}
		
		return 1.0d * getWins() / (getWins() + getLosses());
	}
	
	double getPPTUH() {
		if (getTUH() == 0) {
			return 0.0d;
		}
		
		return 1.0d * getPoints() / getTUH();
	}
	
	boolean hasAnyMatchesWithBothCardsGettingWin() {
		return myAnyMatchesWithBothCardsGettingWin;
	}
}
%>
