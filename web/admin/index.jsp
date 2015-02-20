<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="Admin Home" />
	<jsp:param name="pageDescription" value="Admin Home Page" />
	<jsp:param name="topMenu" value="<%= Menus.ADMIN().asTopLevel().output(request, \"home\") %>" />
	<jsp:param name="h1" value="Admin Home Page" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>Use the links above.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />