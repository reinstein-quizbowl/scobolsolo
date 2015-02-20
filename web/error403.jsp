<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.Utility" %>

<jsp:include page="/template/header.jsp">
    <jsp:param name="pageTitle" value="403 Forbidden" />
    <jsp:param name="pageDescription" value="Error 403" />
	<jsp:param name="topMenu" value="<%= Menus.TOURNAMENTS().asTopLevel().output(request, \"error-403\") %>" />
	<jsp:param name="h1" value="Forbidden" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>You are not authorized to see that page. If you believe that to be incorrect, contact <%= Utility.getAdminContact() %>.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />