<%@ page import="com.opal.cma.OpalForm" %>
<%@ page import="com.opal.cma.OpalMainForm" %>
<%@ page import="com.scobolsolo.application.*" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.opalforms.updater.ContactUpdater" %>
<%@ page import="com.scobolsolo.HTMLUtility" %>

<%
OpalMainForm<Round> lclOF = OpalForm.create(
	session,
	request,
	"/OpalFormController",
	RoundFactory.getInstance(),
	"round_id"
);
Round lclR = lclOF.getUserFacing();
Tournament lclT = lclR.getTournament();
lclOF.setDeleteURI("/tournament/cancel-confirmation.jsp?object=" + lclT.getUniqueString() + "&class_name=round");

String lclTitle = lclR.getName();
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="<%= lclT.getCode() %>" />
	<jsp:param name="pageTitle" value="<%= lclTitle %>" />
	<jsp:param name="pageDescription" value="<%= lclTitle %>" />
	<jsp:param name="topMenu" value="<%= Menus.tournamentAdmin(lclT).asTopLevel().output(request, \"rounds-\" + lclR.getUniqueString()) %>" />
	<jsp:param name="h1" value="<%= lclTitle %>" />
</jsp:include>

<%= lclOF.open() %><%
if (lclOF.hasErrors()) {
	%><div class="row">
		<div class="small-12 columns">
			<p class="form-error-intro">Error:</p>
			<div class="form-errors"><%= lclOF.displayResultOrErrors() %></div>
		</div>
	</div><%
}

%><div class="row">
	<div class="small-12 medium-6 columns">
		<label>
			Name
			<%= lclOF.text("Name", 30) %>
		</label>
	</div>
	<div class="small-10 medium-4 columns">
		<label>
			Short name
			<%= lclOF.text("ShortName", 30) %>
		</label>
	</div>
	<div class="small-2 columns">
		<label>
			Sequence
			<%= lclOF.number("Sequence") %>
		</label>
	</div>
	
	<div class="small-12 large-4 columns">
		<label>
			Start time
			<%= lclOF.text("StartTime", 20) %>
		</label>
	</div>
	<div class="small-12 large-4 columns">
		<label>
			Earliest entry allowed
			<%= lclOF.datetime("EarliestEntryAllowed").placeholder("yyyy-mm-dd hh:mm") %>
		</label>
	</div>
	<div class="small-6 large-4 columns">
		<label>
			Lunch after?
			<%= HTMLUtility.switchWidget(lclOF, "LunchAfter") %>
		</label>
	</div>
</div>

<div class="row">
	<div class="small-12 columns">
		<label>
			Message to display at start of game (HTML okay)
			<%= lclOF.textarea("GameStartMessageHtml", 60, 3) %>
		</label>
	</div>
</div>

<div class="row">
	<div class="small-12 columns">
		<label>
			Message to display at end of game (HTML okay)
			<%= lclOF.textarea("GameEndMessageHtml", 60, 3) %>
		</label>
	</div>
</div>

<div class="row">
	<div class="small-12 columns">
		<%= lclOF.submit() %> <%= lclOF.delete() %> <%= lclOF.cancel() %>
	</div>
</div>

<%= lclOF.close() %>

<jsp:include page="/template/footer.jsp" />