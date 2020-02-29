<%@ page import="java.text.DecimalFormat" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Comparator" %>
<%@ page import="java.util.OptionalDouble" %>
<%@ page import="java.util.stream.Collectors" %>
<%@ page import="org.apache.commons.lang3.Validate" %>
<%@ page import="com.opal.DatabaseQuery" %>
<%@ page import="com.scobolsolo.application.Category" %>
<%@ page import="com.scobolsolo.application.CategoryFactory" %>
<%@ page import="com.scobolsolo.application.Player" %>
<%@ page import="com.scobolsolo.application.Response" %>
<%@ page import="com.scobolsolo.application.ResponseFactory" %>
<%@ page import="com.scobolsolo.application.ResponseTypeFactory" %>
<%@ page import="com.scobolsolo.application.School" %>
<%@ page import="com.scobolsolo.application.Tournament" %>
<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<%
Tournament lclT = Validate.notNull(TournamentFactory.getInstance().forUniqueString(request.getParameter("object")));
Category lclC = Validate.notNull(CategoryFactory.getInstance().fromHttpRequest(request));

List<Response> lclResponses = ResponseFactory.getInstance().acquireForQuery(
	new ArrayList<>(),
	new DatabaseQuery(
		"SELECT R.* " +
		"FROM Response R " + 
		"	JOIN Placement PL ON COALESCE(R.replacement_placement_id, R.base_placement_id) = PL.id " +
		"	JOIN Packet P ON PL.packet_id = P.id " +
		"WHERE PL.tiebreaker = false AND PL.category_code = ? AND P.tournament_code = ?",
		lclC.getCode(), lclT.getCode()
	)
);

Map<Player, List<Response>> lclGroupedResponses = lclResponses.stream()
	.collect(Collectors.groupingBy(it -> it.getPerformance().getPlayer()));

List<PlayerCategoryPerformance> lclResults = new ArrayList<>(lclGroupedResponses.size());
for (Map.Entry<Player, List<Response>> lclEntry : lclGroupedResponses.entrySet()) {
	lclResults.add(new PlayerCategoryPerformance(lclEntry));
}
lclResults.sort(null);

DecimalFormat lclDF = new DecimalFormat("0.00");
DecimalFormat lclPF = new DecimalFormat("0.0%");

%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="<%= lclT.getCode() %>" />
	<jsp:param name="pageTitle" value="<%= lclC.getName() %>" />
	<jsp:param name="topMenu" value="<%= Menus.stats(lclT).asTopLevel().output(request, \"points-\" + lclC.getCode()) %>" />
	<jsp:param name="h1" value="<%= lclC.getName() %>" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>Tiebreakers are excluded.</p><%
		
		if (lclResults.isEmpty()) {
			%><p>No results are available for this category.</p><%
		} else {
			boolean lclShowCategoryDepth = lclResults.stream().anyMatch(argR -> argR.getAverageCorrectBuzzDepth().isPresent());
			
			%><table>
				<thead>
					<tr>
						<th class="number"><abbr title="points">Pts</abbr></th>
						<th>Player</th>
						<th>Year</th>
						<th>School</th>
						<th class="number"><abbr title="tossups heard">TUH</abbr></th>
						<th class="number"><abbr title="points per tossup heard">PPTUH</abbr></th><%
						if (lclShowCategoryDepth) {
							%><th class="number"><abbr title="average distance into questions of correct buzzes">CDepth</abbr></th><%
						}
					%></tr>
				</thead>
				<tbody><%
					for (PlayerCategoryPerformance lclP : lclResults) {
						Player lclPlayer = lclP.getPlayer();
						School lclSchool = lclPlayer.getSchool();
						
						%><tr>
							<th class="number"><%= lclP.getPoints() %></th>
							<th data-order="<%= lclPlayer.getContact().getSortBy() %>"><a href="/stats/player-detail.jsp?school_registration_id=<%= lclPlayer.getSchoolRegistration().getId() %>#player_<%= lclPlayer.getId() %>"><%= lclPlayer.getContact().getName() %></a></th>
							<td><%= lclPlayer.getSchoolYear() == null ? "&nbsp;" : lclPlayer.getSchoolYear().getVeryShortName() %></td>
							<td data-order="<%= lclSchool.getShortName() %>"><a href="/stats/player-detail.jsp?school_registration_id=<%= lclPlayer.getSchoolRegistration().getId() %>#school_<%= lclPlayer.getSchoolRegistration().getSchool().getId() %>" title="<%= lclSchool.getExplainedName() %>"><%= lclSchool.getShortName() %></a></td>
							<td class="number"><%= lclP.getTUH() %></td>
							<td class="number"><%= lclDF.format(lclP.getPPTUH()) %></td><%
							if (lclShowCategoryDepth) {
								%><td class="number"><%
									if (lclP.getAverageCorrectBuzzDepth().isPresent()) {
										%><%= lclPF.format(lclP.getAverageCorrectBuzzDepth().getAsDouble()) %><%
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
static class PlayerCategoryPerformance implements Comparable<PlayerCategoryPerformance> {
	private final Player myPlayer;
	private final int myPoints;
	private final int myTUH;
	private final OptionalDouble myCDepth;
	
	PlayerCategoryPerformance(Map.Entry<Player, List<Response>> argEntry) {
		super();
		
		myPlayer = argEntry.getKey();
		
		int lclPoints = 0;
		int lclTUH = 0;
		for (Response lclR : argEntry.getValue()) {
			lclPoints += lclR.getType().getPoints();
			++lclTUH;
		}
		
		myPoints = lclPoints;
		myTUH = lclTUH;
		myCDepth = Response.calculateCDepth(argEntry.getValue());
	}
	
	Player getPlayer() {
		return myPlayer;
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
	
	double getPPTUH() {
		if (getTUH() == 0) {
			return 0.0d;
		}
		
		return 1.0d * getPoints() / getTUH();
	}
	
	Comparator<PlayerCategoryPerformance> NATURAL_COMPARATOR = Comparator.comparingDouble(PlayerCategoryPerformance::getPPTUH)
		.thenComparingInt(PlayerCategoryPerformance::getPoints)
		.reversed()
		.thenComparing(PlayerCategoryPerformance::getPlayer);
	
	@Override
	public int compareTo(PlayerCategoryPerformance that) {
		return NATURAL_COMPARATOR.compare(this, that);
	}
}
%>
