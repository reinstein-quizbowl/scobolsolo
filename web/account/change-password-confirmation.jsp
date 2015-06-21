<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="Change Password Confirmation" />
	<jsp:param name="pageDescription" value="Change Password Confirmation" />
	<jsp:param name="topMenu" value="<%= Menus.TOURNAMENTS().asTopLevel().output(request, \"change-password-confirmation\") %>" />
	<jsp:param name="h1" value="Change Password Confirmation" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>Your password has been changed.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
