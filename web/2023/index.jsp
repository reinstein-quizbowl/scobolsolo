<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.time.format.FormatStyle" %>
<%@ page import="com.opal.LocalDateCache" %>
<%@ page import="com.scobolsolo.application.Tournament" %>
<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%

Tournament lclTourn = TournamentFactory.getInstance().forCode("2023");

%>
<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2023" />
	<jsp:param name="topMenu" value="<%= lclTourn == null ? Menus.TOURNAMENTS().asTopLevel().output(request, \"home\") : Menus.stats(lclTourn).asTopLevel().output(request, \"results\") %>" />
	<jsp:param name="h1" value="Scobol Solo 2023" />
</jsp:include>

<jsp:include page="/2023/fragment.jsp">
	<jsp:param name="show_header" value="false" />
</jsp:include>

<jsp:include page="/template/footer.jsp" />
