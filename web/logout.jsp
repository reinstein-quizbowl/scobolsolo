<%@ page import="com.scobolsolo.menu.Menus" %>

<%
session.invalidate();
%>

<jsp:include page="/template/header.jsp">
    <jsp:param name="pageTitle" value="Home" />
    <jsp:param name="pageDescription" value="Home Page" />
	<jsp:param name="topMenu" value="<%= Menus.TOURNAMENTS().asTopLevel().output(request, \"logout\") %>" />
	<jsp:param name="h1" value="Logged Out" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>You have logged out.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />