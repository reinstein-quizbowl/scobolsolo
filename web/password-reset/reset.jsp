<%@ page import="java.time.LocalDateTime" %>
<%@ page import="org.apache.commons.lang3.StringUtils" %>
<%@ page import="com.opal.LocalDateCache" %>
<%@ page import="com.scobolsolo.application.Account" %>
<%@ page import="com.scobolsolo.application.AccountFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.ScobolSoloConfiguration" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="Password Reset" />
	<jsp:param name="pageDescription" value="Password Reset" />
	<jsp:param name="topMenu" value="<%= Menus.TOURNAMENTS().asTopLevel().output(request, \"password-reset-has-token\") %>" />
	<jsp:param name="h1" value="Password Reset" />
</jsp:include>

<div class="row"><%
	Account lclUser = Account.determineCurrent(request);
	
	int lclMinLength = ScobolSoloConfiguration.getInstance().getInt("PASSWORD_LENGTH_MIN");
	int lclMaxLength = ScobolSoloConfiguration.getInstance().getInt("PASSWORD_LENGTH_MAX");
	
	// It only makes sense to use this page if the user is not logged in; if he is, we can assume that he or she knows his password and won’t need it reset.
	if (lclUser == null) {
		/* For which account do we want to reset the password? */
		Account lclA = AccountFactory.getInstance().fromHttpRequest(request);
		if (lclA == null) {
			%><div class="small-12 columns">
				<p>No valid user account was specified.</p>
			</div><%
		} else {
			String lclProvidedToken = StringUtils.trimToNull(request.getParameter("token"));
			if (lclProvidedToken == null) {
				%><div class="small-12 columns">
					<p>No password reset token was provided.</p>
				</div><%
			} else {
				String lclCorrectToken = lclA.getPasswordResetToken();
				LocalDateTime lclCorrectTokenExpires = lclA.getPasswordResetTokenExpiration();
				if (lclCorrectToken == null || lclCorrectTokenExpires == null) {
					%><div class="small-12 columns">
						<p>This user account has not been issued a token for resetting its password.</p>
					</div><%
				} else {
					LocalDateTime lclNow = LocalDateCache.now();
					if (lclCorrectTokenExpires.isBefore(lclNow)) {
						%><div class="small-12 columns">
							<p>The password reset token has expired.</p>
						</div><%
					} else {
						if (lclProvidedToken.equals(lclCorrectToken)) {
							%><form method="post" action="FromToken">
								<input type="hidden" name="account_id" id="account_id" value="<%= lclA.getId() %>" />
								<input type="hidden" name="token" id="token" value="<%= lclProvidedToken %>" />
								<div class="small-12 medium-6 columns">
									<label>
										New password
										<input type="password" id="new_password" name="new_password" autocomplete="off" size="16" maxlength="<%= lclMaxLength %>" />
										<div class="form-annotation alert-box info">Passwords must be between <%= lclMinLength %> and <%= lclMaxLength %> characters.</div>
									</label>
								</div>
								<div class="small-12 medium-6 columns">
									<label>
										Repeat new password
										<input type="password" id="new_password_confirm" name="new_password_confirm" autocomplete="off" size="16" maxlength="<%= lclMaxLength %>" />
									</label>
								</div>
								<div class="small-12 columns">
									<input type="submit" value="Reset Password" /></td>
								</div>
							</form><%
						} else {
							%><div class="small-12 columns">
								<p>The password reset token is invalid.</p>
							</div><%
						}
					}
				}
			}
		}
	} else {
		// The user is logged in, so it doesn’t make sense to generate a password reset token for them. They can go through the “I know my password and want to change it” flow.
		%><jsp:forward page="/account/change-password.jsp" /><%
	}
%></div>

<jsp:include page="/template/footer.jsp" />