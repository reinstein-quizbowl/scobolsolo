<%@ page import="com.scobolsolo.application.Account" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.Utility" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="Password Reset Error" />
	<jsp:param name="pageDescription" value="Password Reset Error" />
	<jsp:param name="topMenu" value="<%= Menus.TOURNAMENTS().asTopLevel().output(request, \"password-reset-error\") %>" />
	<jsp:param name="h1" value="Password Reset Error" />
</jsp:include>

<div class="row">
	<div class="small-12 columns"><%
		Account lclUser = Account.determineCurrent(request);
		
		if (lclUser == null) {
			%><p><%
				String lclErrorText = (String) session.getAttribute("PASSWORD_RESET_ERROR");
				session.removeAttribute("PASSWORD_RESET_ERROR");
				if (lclErrorText != null) {
					%><%= lclErrorText %> <%
				} else {
					%>Sorry, it is not possible to reset your password at this time. <%
				}
			%></p>
			
			<p>For further assistance, you may contact <%= Utility.getAdminContact() %>.</p><%
		} else {
			// The user is logged in, so it doesn’t make sense to generate a password reset token for them. They can go through the “I know my password and want to change it” flow.
			%><jsp:forward page="/account/change-password.jsp" /><%
		}
	%></div>
</div>

<jsp:include page="/template/footer.jsp" />