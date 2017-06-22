<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2017" />
	<jsp:param name="pageTitle" value="Scobol Solo 2017" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2017()).asTopLevel().output(request, \"home\") %>" />
	<jsp:param name="h1" value="Scobol Solo 2017" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>Scobol Solo 2017 will be held on Saturday, October&nbsp;28.</p>
		
		<p>Register by emailing David Reinstein at <a href="mailto:reinsted@newtrier.k12.il.us">reinsted@newtrier.k12.il.us</a>.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />