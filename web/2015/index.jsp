<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2015" />
	<jsp:param name="pageTitle" value="Scobol Solo 2015" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2015()).asTopLevel().output(request, \"home\") %>" />
	<jsp:param name="h1" value="Scobol Solo 2015" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>Scobol Solo 2015 will be held at New Trier High School in Winnetka, Illinois, probably on Saturday, October 31. More details will be posted when they become available.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />