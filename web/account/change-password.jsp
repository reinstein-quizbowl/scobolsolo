<%@ page import="com.scobolsolo.application.Account" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.ScobolSoloConfiguration" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="Change Password" />
	<jsp:param name="pageDescription" value="Change Password" />
	<jsp:param name="topMenu" value="<%= Menus.TOURNAMENTS().asTopLevel().output(request, \"change-password\") %>" />
	<jsp:param name="h1" value="Change Password" />
</jsp:include><%
int lclMinLength = ScobolSoloConfiguration.getInstance().getInt("PASSWORD_LENGTH_MIN");
int lclMaxLength = ScobolSoloConfiguration.getInstance().getInt("PASSWORD_LENGTH_MAX");
%><form method="post" action="ChangePassword">
	<input type="hidden" name="account_id" id="account_id" value="<%= Account.demand(request).getId() %>" />
	
	<div class="row">
		<div class="small-12 medium-6 columns">
			<label>
				Old password
				<input type="password" id="password_old" name="password_old" autocomplete="off" size="16" maxlength="<%= lclMaxLength %>" />
			</label>
		</div>
	</div>
	
	<div class="row">
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
	</div>
	
	<div class="row">
		<div class="small-12 columns">
			<input type="submit" value="Change Password" />
		</div>
	</div>
</form>

<jsp:include page="/template/footer.jsp" />
