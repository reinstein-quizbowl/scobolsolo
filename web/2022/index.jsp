<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.time.format.FormatStyle" %>
<%@ page import="com.opal.LocalDateCache" %>
<%@ page import="com.scobolsolo.application.Tournament" %>
<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%

Tournament lclTourn = TournamentFactory._2022();

%>
<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2022" />
	<jsp:param name="topMenu" value="<%= Menus.stats(lclTourn).asTopLevel().output(request, \"results\") %>" />
	<jsp:param name="h1" value="Scobol Solo 2022" />
</jsp:include>

<jsp:include page="/2022/fragment.jsp" />

<jsp:include page="/template/footer.jsp" />
