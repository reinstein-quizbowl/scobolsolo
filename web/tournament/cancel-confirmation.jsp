<%@ page import="org.apache.commons.lang3.StringUtils" %>
<%@ page import="org.apache.commons.lang3.Validate" %>
<%@ page import="org.apache.commons.lang3.text.WordUtils" %>
<%@ page import="com.google.common.base.Objects" %>
<%@ page import="com.scobolsolo.application.Tournament" %>
<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%
String lclObjectNameLC = StringUtils.replaceChars(Objects.firstNonNull(request.getParameter("class_name"), "object"), '_', ' ').toLowerCase();
String lclObjectNameUC = WordUtils.capitalizeFully(lclObjectNameLC);

String lclTitle = lclObjectNameUC + " Canceled";

Tournament lclT = Validate.notNull(TournamentFactory.getInstance().forUniqueString(request.getParameter("object")));
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="<%= lclTitle %>" />
	<jsp:param name="pageDescription" value="<%= lclTitle %>" />
	<jsp:param name="topMenu" value="<%= Menus.tournamentAdmin(lclT).asTopLevel().output(request, \"canceled-\" + lclT.getUniqueString()) %>" />
	<jsp:param name="h1" value="<%= lclObjectNameUC + \" Canceled\" %>" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>That <%= lclObjectNameLC %> has been canceled.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />