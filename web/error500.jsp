<%@ page import="java.io.PrintWriter" %>
<%@ page import="com.scobolsolo.application.Account" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.AccountUtility" %>
<%@ page import="com.scobolsolo.Utility" %>

<jsp:include page="/template/header.jsp">
    <jsp:param name="pageTitle" value="500 Internal Server Error" />
    <jsp:param name="pageDescription" value="Error 500" />
	<jsp:param name="topMenu" value="<%= Menus.TOURNAMENTS().asTopLevel().output(request, \"error-500\") %>" />
	<jsp:param name="h1" value="Internal Error" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>Your request produced an internal error. Please try again. If the error persists, please notify <%= Utility.getAdminContact() %>.</p><%
		Account lclA = AccountUtility.getLoggedInAccount(request);
		boolean lclShouldSeeStackTrace = lclA != null;
		
		Throwable lclT = (Throwable) request.getAttribute("javax.servlet.error.exception");
		if (lclShouldSeeStackTrace && lclT != null) {
			%><p>In your email, please include the following:</p>
			
			<pre><%
			lclT.printStackTrace(new PrintWriter(out));
			%></pre><%
		}
	%></div>
</div>

<jsp:include page="/template/footer.jsp" />