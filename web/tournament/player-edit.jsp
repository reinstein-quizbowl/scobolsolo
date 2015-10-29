<%@ page import="com.opal.cma.OpalForm" %>
<%@ page import="com.opal.cma.OpalMainForm" %>
<%@ page import="com.scobolsolo.application.*" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.opalforms.updater.ContactUpdater" %>
<%@ page import="com.scobolsolo.HTMLUtility" %>

<%
OpalMainForm<Player> lclOF = OpalForm.create(
	session,
	request,
	"/OpalFormController",
	PlayerFactory.getInstance(),
	"player_id"
);
Player lclP = lclOF.getUserFacing();
Tournament lclT = lclP.getSchoolRegistration().getTournament();
lclOF.setDeleteURI("/tournament/cancel-confirmation.jsp?object=" + lclT.getUniqueString() + "&class_name=player");

OpalForm<Contact> lclCOF = lclOF.targetForm("Contact", ContactFactory.getInstance());
lclCOF.setUpdaterClass(ContactUpdater.class);
Contact lclC = lclCOF.getUserFacing();

SchoolRegistration lclSR = lclP.getSchoolRegistration();
School lclS = lclSR.getSchool();

String lclTitle = lclC.getName() + " (" + lclS.getShortName() + ") at " + lclT.getName();
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="<%= lclT.getCode() %>" />
	<jsp:param name="pageTitle" value="<%= lclTitle %>" />
	<jsp:param name="pageDescription" value="<%= lclTitle %>" />
	<jsp:param name="topMenu" value="<%= Menus.tournamentAdmin(lclT).asTopLevel().output(request, \"players-\" + lclT.getUniqueString()) %>" />
	<jsp:param name="h1" value="<%= lclTitle %>" />
</jsp:include>

<%= lclOF.open() %>
<%= lclCOF.open() %><%
if (lclOF.hasErrors()) {
	%><div class="row">
		<div class="small-12 columns">
			<p class="form-error-intro">Error:</p>
			<div class="form-errors"><%= lclOF.errors() %></div>
		</div>
	</div><%
}

%><div class="row">
	<div class="small-12 medium-6 columns">
		<label>
			Name
			<%= lclCOF.text("Name", 30) %>
		</label>
	</div>
	<div class="small-10 medium-4 columns">
		<label>
			Sort by
			<%= lclCOF.text("SortBy", 30) %>
		</label>
	</div>
	<div class="small-2 columns">
		<label>
			Exhibition?
			<%= HTMLUtility.switchWidget(lclOF, "Exhibition") %>
		</label>
	</div>
	
	<div class="small-6 large-3 columns">
		<label>
			School
			<%= lclOF.dropdown("SchoolRegistration", SchoolRegistration.SchoolShortNameComparator.getInstance()).filter(argSR -> argSR.getTournament() == lclT).namer(argSR -> argSR.getSchool().getShortName()) %>
		</label>
	</div>
	<div class="small-6 large-3 columns">
		<label>
			Grade
			<%= lclOF.<SchoolYear>dropdown("SchoolYear") %>
		</label>
	</div>
	
	<div class="small-6 large-3 columns">
		<label>
			<span class="hide-for-large-up" title="Rank within <%= lclS.getShortName() %>">Rank</span>
			<span class="show-for-large-up">Rank within <%= lclS.getShortName() %></span>
			<%= lclOF.text("RankWithinSchool", 3) %>
		</label>
	</div>
	<div class="small-6 large-3 columns">
		<label>
			Seed
			<%= lclOF.text("Seed", 3) %>
		</label>
	</div>
</div>

<div class="row">
	<div class="small-12 columns">
		<label>
			Note
			<%= lclOF.textarea("Note", 60, 3) %>
		</label>
	</div>
</div>

<div class="row">
	<div class="small-12 columns">
		<%= lclOF.submit() %> <%= lclOF.delete() %> <%= lclOF.cancel() %>
	</div>
</div>

<%= lclCOF.close() %>
<%= lclOF.close() %>

<jsp:include page="/template/footer.jsp" />