<meta http-equiv="refresh" content="0; url=/2017/">

<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="Home" />
	<jsp:param name="pageDescription" value="Home Page" />
	<jsp:param name="topMenu" value="<%= Menus.TOURNAMENTS().asTopLevel().output(request, \"home\") %>" />
	<jsp:param name="h1" value="Scobol Solo" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>Welcome to the home page for Scobol Solo!</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />