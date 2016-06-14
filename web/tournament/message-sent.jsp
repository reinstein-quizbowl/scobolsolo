<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.scobolsolo.application.*" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<%
Tournament lclT = TournamentFactory.getInstance().fromHttpRequest(request, "object");

int lclRecipientCount = Integer.parseInt(request.getParameter("recipient_count"));
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="<%= lclT.getCode() %>" />
	<jsp:param name="pageTitle" value="Message sent" />
	<jsp:param name="topMenu" value="<%= Menus.tournamentAdmin(lclT).asTopLevel().output(request, \"message-\" + lclT.getUniqueString()) %>" />
	<jsp:param name="h1" value="Message sent" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>Your message has been sent to <%= lclRecipientCount == 1 ? "one recipient" : String.valueOf(lclRecipientCount) + " recipients" %>.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />