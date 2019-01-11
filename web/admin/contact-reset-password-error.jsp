<%@ page import="org.apache.commons.lang3.Validate" %>
<%@ page import="com.scobolsolo.application.Account" %>
<%@ page import="com.scobolsolo.application.AccountFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="Password Reset Error" />
	<jsp:param name="pageDescription" value="Password Reset Error" />
	<jsp:param name="topMenu" value="<%= Menus.ADMIN().asTopLevel().output(request, \"home\") %>" />
	<jsp:param name="h1" value="Password Reset Error" />
</jsp:include>

<div class="row">
	<div class="small-12 columns"><%
		Account lclResetAttemptedFor = Validate.notNull(AccountFactory.getInstance().fromHttpRequest(request));
		
		%><p>The password for <%= lclResetAttemptedFor.getUsername() %> (<%= lclResetAttemptedFor.getContact().getName() %>) could not be reset:</p>
		
		<blockquote class="error"><%
			String lclError = (String) session.getAttribute("error");
			session.removeAttribute("error");
			%><%= lclError %>
		</blockquote>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
