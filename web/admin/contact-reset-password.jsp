<%@ page import="org.apache.commons.lang3.Validate" %>
<%@ page import="com.scobolsolo.application.Account" %>
<%@ page import="com.scobolsolo.application.AccountFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.ScobolSoloConfiguration" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="Password Reset" />
	<jsp:param name="pageDescription" value="Password Reset" />
	<jsp:param name="topMenu" value="<%= Menus.ADMIN().asTopLevel().output(request, \"home\") %>" />
	<jsp:param name="h1" value="Password Reset" />
</jsp:include>

<div class="row"><%
	Account lclUser = Account.demand(request);
	Validate.isTrue(lclUser.isAdministrator());
	
	Account lclResetFor = Validate.notNull(AccountFactory.getInstance().fromHttpRequest(request));
	
	int lclMinLength = ScobolSoloConfiguration.getInstance().getInt("PASSWORD_LENGTH_MIN");
	int lclMaxLength = ScobolSoloConfiguration.getInstance().getInt("PASSWORD_LENGTH_MAX");
	
	%><form method="post" action="PasswordReset">
		<input type="hidden" name="account_id" id="account_id" value="<%= lclResetFor.getId() %>" />
		<div class="small-12 medium-5 columns">
			<label>
				New password
				<input type="password" id="new_password" name="new_password" autocomplete="off" size="16" maxlength="<%= lclMaxLength %>" />
				<div class="form-annotation alert-box info">Passwords must be between <%= lclMinLength %> and <%= lclMaxLength %> characters.</div>
			</label>
		</div>
		
		<div class="small-12 medium-5 columns">
			<label>
				Confirm new password:
				<input type="password" id="new_password_confirm" name="new_password_confirm" autocomplete="off" size="16" maxlength="<%= lclMaxLength %>" />
			</label>
		</div>
		
		<div class="small-12 medium-2 columns">
			<input type="submit" value="Reset Password" />
		</div>
	</form>
</div>

<div class="row">
	<form action="javascript:putRandomString(document.getElementById('random_length').value, document.getElementById('random_chars').value);">
		<div class="small-12 columns">
			<h2>Generate a random password</h2>
			<p class="explanation">Generating a random password will place the generated password in the above password boxes, and show you it in the below field to the right of &#8220;Generate.&#8221;</p>
		</div>
		<div class="small-12 medium-6 large-3 columns">
			<label>
				Length
				<input type="text" id="random_length" value="8" size="2" maxlength="2" />
			</label>
		</div>
		<div class="small-12 medium-6 large-5 columns">
			<label>
				Characters from
				<textarea id="random_chars" rows="3" cols="25">2345678923456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnpqrstuvwxyz</textarea>
			</label>
		</div>
		<div class="small-12 medium-6 large-4 columns">
			<input type="submit" value="Generate" />
			<div id="random_destination"></div>
		</div>
	</form>
</div>

<script type="text/javascript">
	function getRandomString(argLength, argChars) {
		var lclRandomString = '';
		for (var lclI = 0; lclI < argLength; ++lclI) {
			var lclRand = Math.floor(Math.random() * argChars.length);
			lclRandomString += argChars.substring(lclRand, lclRand + 1);
		}
		return lclRandomString;
	}

	function putRandomString(argLength, argChars) {
		if (!isNaN(argLength) && (argLength < 6 || argLength > 16)) {
			alert('Passwords must be between 6 and 16 characters long. Defaulting to 12.');
			argLength = 12;
		}
		
		
		if ((parseFloat(argLength) != parseInt(argLength)) || isNaN(argLength)) {
			argLength = 12;
		}
		
		if (argChars.length < 1) {
			argChars = "01234567890123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		}
		
		var lclShow  = document.getElementById('random_destination');
		var lclPass1 = document.getElementById('new_password');
		var lclPass2 = document.getElementById('new_password_confirm');
		
		var lclRandomString = getRandomString(argLength, argChars);
		
		lclShow.innerHTML = lclRandomString;
		lclPass1.value    = lclRandomString;
		lclPass2.value    = lclRandomString;
	}
</script>


<jsp:include page="/template/footer.jsp" />
