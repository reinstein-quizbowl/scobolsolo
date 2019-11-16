<%@ page import="java.io.PrintWriter" %>
<%@ page import="org.apache.commons.lang3.ObjectUtils" %>
<%@ page import="com.scobolsolo.application.Account" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.Utility" %>

<jsp:include page="/template/header.jsp">
    <jsp:param name="pageTitle" value="500 Internal Server Error" />
    <jsp:param name="pageDescription" value="Error 500" />
	<jsp:param name="topMenu" value="<%= Menus.TOURNAMENTS().asTopLevel().output(request, \"error-500\") %>" />
	<jsp:param name="h1" value="Internal Error" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>There was an internal problem. If you were doing something that clearly should have been possible, please notify <%= Utility.getAdminContact() %> with the details of what you were trying to do.</p><%
		Account lclUser = Account.determineCurrent(request);
		
		Throwable lclT = (Throwable) request.getAttribute("javax.servlet.error.exception");
		if (lclT != null) {
			final String lclReferer = request.getHeader("referer");
			final org.apache.log4j.Logger ourLogger = org.apache.log4j.Logger.getLogger(ObjectUtils.firstNonNull(lclReferer, "Website exception"));
			
			StringBuilder lclMessage = new StringBuilder("Exception when accessing ").append(request.getRequestURI()).append('\n')
				.append("Query string: ").append(request.getQueryString()).append('\n')
				.append("Referer: ").append(lclReferer).append('\n')
				.append("User: ").append(lclUser == null ? "[none]" : lclUser.getContact().getName() + " (" + lclUser.getUsername() + ")");
				// TODO: We could add more information, like session data, query string, etc.
			
			ourLogger.error(lclMessage.toString(), lclT);
			
			boolean lclShouldSeeStackTrace = lclUser != null;
			if (lclShouldSeeStackTrace) {
				%><p>In your email, please include the following:</p>
				
				<pre><%
				lclT.printStackTrace(new PrintWriter(out));
				%></pre><%
			}
		}
	%></div>
</div>

<jsp:include page="/template/footer.jsp" />