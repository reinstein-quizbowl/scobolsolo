<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2022" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2022()).asTopLevel().output(request, \"results\") %>" />
	<jsp:param name="h1" value="Scobol Solo 2022" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>Scobol Solo 2022 will be Saturday, October&nbsp;29 at Carl Sandburg High School in Orland Park, Illinois.</p>
		
		<p><a class="primary button" href="/register/">Register</a></p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
