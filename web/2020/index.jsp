<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2020" />
	<jsp:param name="pageTitle" value="Scobol Solo 2020" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2020()).asTopLevel().output(request, \"results\") %>" />
	<jsp:param name="h1" value="Scobol Solo 2020" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>Scobol Solo 2020 will be held online, via Discord, on the afternoons of Saturday, December&nbsp;5 and Saturday, December&nbsp;12.</p>
		<p>To register, email <a href="mailto:reinsteind@yahoo.com">David Reinstein (reinsteind@yahoo.com)</a>.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
