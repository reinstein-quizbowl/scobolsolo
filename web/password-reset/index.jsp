<%@ page import="com.scobolsolo.application.Account" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.AccountUtility" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="Password Reset" />
	<jsp:param name="pageDescription" value="Password Reset" />
	<jsp:param name="topMenu" value="<%= Menus.TOURNAMENTS().asTopLevel().output(request, \"password-reset\") %>" />
	<jsp:param name="h1" value="Password Reset" />
</jsp:include>

<div class="row"><%
		Account lclUser = AccountUtility.getLoggedInAccount(request);
		
		if (lclUser == null) {
			%><div class="small-12 columns">
				<p>To find your account, enter your username and/or the e-mail address you used to create the account. Note that usernames are case-sensitive.</p>
			</div>
			<form method="post" action="GenerateToken">
				<div class="small-12 medium-6 columns">
					<label>
						Username
						<input type="text" id="username" name="username" size="16" autocorrect="off" autocapitalize="off" />
					</label>
				</div>
				<div class="small-12 medium-6 columns">
					<label>
						Email address
						<input type="text" id="email" name="email" size="32" />
					</label>
				</div>
				<div class="small-12 columns">
					<input type="submit" value="Find Account" />
				</div>
			</form><%
		} else {
			// The user is logged in, so it doesn't make sense to generate a password reset token for them. They can go through the "I know my password and want to change it" flow.
			%><jsp:forward page="/account/change-password.jsp" /><%
		}
	%></div>
</div>

<jsp:include page="/template/footer.jsp" />