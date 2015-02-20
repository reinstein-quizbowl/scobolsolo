<%@ page import="com.scobolsolo.application.Tournament" %>
<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%
Tournament lclT = TournamentFactory.getInstance().fromHttpRequest(request, "object");

if (lclT == null) {
	%><jsp:forward page="/" /><%
} else {
	%><jsp:forward page="<%= \"/stats/standings.jsp?object=\" + lclT.getUniqueString() %>" /><%
}
%>