<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<meta http-equiv="refresh" content="0;url=/stats/standings.jsp?object=2018" />

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2018" />
	<jsp:param name="pageTitle" value="Scobol Solo 2018" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2018()).asTopLevel().output(request, \"results\") %>" />
	<jsp:param name="h1" value="Scobol Solo 2018" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>Scobol Solo 2018 is going on now! Use the links above to see stats live as they come in.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />