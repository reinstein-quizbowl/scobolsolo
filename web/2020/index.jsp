<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2020" />
	<jsp:param name="pageTitle" value="Scobol Solo 2020" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2020()).asTopLevel().output(request, \"day-of\") %>" />
	<jsp:param name="h1" value="Scobol Solo 2020" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>Scobol Solo 2020 is being held online, via Discord, on the afternoons of Saturday, December&nbsp;5 and Saturday, December&nbsp;12.</p>
		
		<p>
			<a class="large primary button" href="/stats/standings.jsp?object=2020">Live Results</a>
		</p>
		
		<p>The Championship Match will be streamed live on Twitch starting at approximately 4:00&nbsp;pm on Saturday, December&nbsp;12.</p>
			<p>
				<a class="large primary button" href="https://www.twitch.tv/DavidReinstein"><i class="fa fa-twitch"></i> Championship Match Livestream on Twitch</a>
				<a class="large primary button" href="https://docs.google.com/spreadsheets/d/1_C_u4FLa3KGJ7mu6RLiM4x0uJWIJBH_ONX8liJv_uFc"><i class="fa fa-trophy"></i> Championship Match Scoreboard</a>
				<a class="large secondary button" href="/instructions/championship-match.jsp"><i class="fa fa-list-ol"></i> Rules and Structure</a>
			</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
