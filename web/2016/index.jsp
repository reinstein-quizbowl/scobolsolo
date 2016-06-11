<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2016" />
	<jsp:param name="pageTitle" value="Scobol Solo 2016" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2016()).asTopLevel().output(request, \"home\") %>" />
	<jsp:param name="h1" value="Scobol Solo 2016" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>Scobol Solo 2016 will be held on October 29.</p>
		
		<p>You can see the <a href="/stats/registrations.jsp?object=2016">list of registrations</a>.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />