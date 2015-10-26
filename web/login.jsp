<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
    <jsp:param name="pageTitle" value="Log In" />
    <jsp:param name="pageDescription" value="Login Page" />
	<jsp:param name="topMenu" value="<%= Menus.TOURNAMENTS().asTopLevel().output(request, \"login\") %>" />
	<jsp:param name="h1" value="Log In" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>You must log in. Both usernames and passwords are case-sensitive.</p>
	</div>
</div>

<div class="row">
	<div class="small-12 medium-8 large-6 columns">
		<form name="login" id="login" method="post" action="j_security_check" accept-charset="utf-8">
			<div class="row">
				<div class="small-12 columns">
					<label>
						Username
						<input type="text" id="j_username" name="j_username" autofocus autocorrect="off" autocapitalize="off" required="required" />
					</label>
				</div>
				<div class="small-12 columns">
					<label>
						Password
						<input type="password" id="j_password" name="j_password" maxlength="1024" required="required" />
					</label>
				</div>
				<div class="small-12 columns">
					<input type="submit" class="expand" value="Log In" />
				</div>
				<div class="small-12 columns">
					<p>If you have forgotten your login information, you may <a href="/password-reset/">reset your password</a>.</p>
				</div>
			</div>
		</form>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />