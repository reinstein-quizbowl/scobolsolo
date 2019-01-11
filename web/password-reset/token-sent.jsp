<%@ page import="com.scobolsolo.application.Account" %>
<%@ page import="com.scobolsolo.application.AccountFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="Password Reset Token Sent" />
	<jsp:param name="pageDescription" value="Password Reset Token Sent" />
	<jsp:param name="topMenu" value="<%= Menus.TOURNAMENTS().asTopLevel().output(request, \"password-reset-token-sent\") %>" />
	<jsp:param name="h1" value="Password Reset Token Sent" />
</jsp:include>

<div class="row">
	<div class="small-12 columns"><%
		Account lclUser = Account.determineCurrent(request);

		if (lclUser == null) {
			Account lclA = AccountFactory.getInstance().fromHttpRequest(request);
			if (lclA == null || lclA.getContact().getEmailAddress() == null) {
				%><jsp:forward page="error.jsp" /><%
			} else {
				%><p>A link to reset your password has been emailed to you.</p><%
			}
		} else {
			// The user is logged in, so it doesn’t make sense to generate a password reset token for them. They can go through the “I know my password and want to change it” flow.
			%><jsp:forward page="/account/change-password.jsp" /><%
		}
	%></div>
</div>

<jsp:include page="/template/footer.jsp" />