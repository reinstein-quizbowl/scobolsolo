<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="Password Reset Confirmation" />
	<jsp:param name="pageDescription" value="Password Reset Confirmation" />
	<jsp:param name="topMenu" value="<%= Menus.TOURNAMENTS().asTopLevel().output(request, \"password-reset-confirmation\") %>" />
	<jsp:param name="h1" value="Password Reset Confirmation" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>You have successfully reset your password. You may now <a href="/account/">log in</a>.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />