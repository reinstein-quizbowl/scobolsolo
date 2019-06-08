<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2019" />
	<jsp:param name="pageTitle" value="Scobol Solo 2019" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2019()).asTopLevel().output(request, \"results\") %>" />
	<jsp:param name="h1" value="Scobol Solo 2019" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>Scobol Solo 2019 is scheduled for Saturday, November &nbsp;16.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
