<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="Change Password: Error" />
	<jsp:param name="pageDescription" value="Change Password: Error" />
	<jsp:param name="topMenu" value="<%= Menus.TOURNAMENTS().asTopLevel().output(request, \"change-password-error\") %>" />
	<jsp:param name="h1" value="Change Password: Error" />
</jsp:include>

<div class="row">
	<div class="small-12 columns"><%
		String lclError = (String) session.getAttribute("error");
		session.removeAttribute("error");
		
		%><p>Sorry, your password could not be changed because <%= lclError %>. You may <a href="change-password.jsp">try again</a>.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
