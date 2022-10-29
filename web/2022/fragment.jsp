<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.time.format.FormatStyle" %>
<%@ page import="com.opal.LocalDateCache" %>
<%@ page import="com.scobolsolo.application.Tournament" %>
<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%

Tournament lclTourn = TournamentFactory._2022();

%>
<div class="row">
	<div class="small-12 columns"><%
		if (lclTourn.getDate().isAfter(LocalDateCache.today())) {
			%><p>Scobol Solo 2022 will be <%= lclTourn.getDate().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)) %> at <%= lclTourn.getSiteSchool().getExplainedName() %>.</p>
			
			<p><a class="primary button" href="/register/">Register</a></p><%
		} else if (lclTourn.getDate().equals(LocalDateCache.today())) {
			%><p>Scobol Solo 2022 is today at <%= lclTourn.getSiteSchool().getExplainedName() %>.</p>
			
			<p>Results are being posted live.</p>
			
			<p><a class="primary button" href="/stats/standings?object=<%= lclTourn.getUniqueString() %>">Standings</a></p><%
		} else {
			%><p>Scobol Solo 2022 was <%= lclTourn.getDate().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)) %> at <%= lclTourn.getSiteSchool().getExplainedName() %>.</p>
			
			<p>Full and final results will be posted soon.</p>
			
			<p><a class="primary button" href="/stats/standings?object=<%= lclTourn.getUniqueString() %>">Standings</a></p><%
		}
	%></div>
</div>
