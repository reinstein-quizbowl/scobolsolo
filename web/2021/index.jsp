<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2021" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2021()).asTopLevel().output(request, \"results\") %>" />
	<jsp:param name="h1" value="Scobol Solo 2021" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>Scobol Solo 2021 is being held today, Saturday, November&nbsp;13 at Carl Sandburg High School in Orland Park, Illinois.</p>
		
		<p><a class="primary button" href="/stats/standings.jsp?object=2021">View Results</a></p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />