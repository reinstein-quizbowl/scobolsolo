<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="Registration Closed" />
	<jsp:param name="topMenu" value="<%= Menus.TOURNAMENTS().asTopLevel().output(request, \"home\") %>" />
	<jsp:param name="h1" value="Registration Closed" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>Sorry, registration for Scobol Solo is not currently open.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
