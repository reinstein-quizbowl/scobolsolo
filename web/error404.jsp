<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.Utility" %>

<jsp:include page="/template/header.jsp">
    <jsp:param name="pageTitle" value="404 Not Found" />
    <jsp:param name="pageDescription" value="Error 404" />
	<jsp:param name="topMenu" value="<%= Menus.TOURNAMENTS().asTopLevel().output(request, \"error-404\") %>" />
	<jsp:param name="h1" value="Not Found" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>The page you requested could not be found. If you followed an internal link, please notify <%= Utility.getAdminContact() %>.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />