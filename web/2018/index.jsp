<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2018" />
	<jsp:param name="pageTitle" value="Scobol Solo 2018" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2018()).asTopLevel().output(request, \"results\") %>" />
	<jsp:param name="h1" value="Scobol Solo 2018" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>Scobol Solo 2018 is <em>tentatively</em> scheduled for Saturday, October&nbsp;27. More details will be posted here when the date and other information are finalized.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />