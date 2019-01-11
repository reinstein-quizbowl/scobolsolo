<%@ page import="org.apache.commons.lang3.Validate" %>
<%@ page import="com.scobolsolo.application.Account" %>
<%@ page import="com.scobolsolo.application.AccountFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="Password Reset Confirmation" />
	<jsp:param name="pageDescription" value="Password Reset Confirmation" />
	<jsp:param name="topMenu" value="<%= Menus.ADMIN().asTopLevel().output(request, \"home\") %>" />
	<jsp:param name="h1" value="Password Reset Confirmation" />
</jsp:include>

<div class="row">
	<div class="small-12 columns"><%
		Account lclResetAttemptedFor = Validate.notNull(AccountFactory.getInstance().fromHttpRequest(request));
		
		%><p>The password for <%= lclResetAttemptedFor.getUsername() %> (<%= lclResetAttemptedFor.getContact().getName() %>) has been reset.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
