<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.Utility" %>

<jsp:include page="/template/header.jsp">
    <jsp:param name="pageTitle" value="Login Error" />
    <jsp:param name="pageDescription" value="Login Error" />
	<jsp:param name="topMenu" value="<%= Menus.TOURNAMENTS().asTopLevel().output(request, \"login-error\") %>" />
	<jsp:param name="h1" value="Login Error" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>The credentials you provided were not valid. You may <a href="/login.jsp">try again</a>. If you have forgotten your login information, you may <a href="/password-reset/">reset your password</a>.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />