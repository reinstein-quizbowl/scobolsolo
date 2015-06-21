<%@ page import="com.scobolsolo.application.Account" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.AccountUtility" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="Account Home" />
	<jsp:param name="pageDescription" value="Account Home" />
	<jsp:param name="topMenu" value="<%= Menus.TOURNAMENTS().asTopLevel().output(request, \"account\") %>" />
	<jsp:param name="h1" value="Account Home" />
</jsp:include>

<div class="row">
	<div class="small-12 columns"><%
		Account lclUser = AccountUtility.demandLoggedInAccount(request);
		%><p>You are logged in as <%= lclUser.getContact().getName() %> (<code><%= lclUser.getUsername() %></code>).</p>
		
		<p>You may <a href="change-password.jsp">change your password</a>.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />