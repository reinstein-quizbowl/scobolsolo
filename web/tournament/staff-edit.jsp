<%@ page import="java.util.Comparator" %>
<%@ page import="java.util.List" %>
<%@ page import="com.opal.cma.OpalForm" %>
<%@ page import="com.opal.cma.OpalMainForm" %>
<%@ page import="com.scobolsolo.application.*" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.opalforms.updater.ContactUpdater" %>
<%@ page import="com.scobolsolo.HTMLUtility" %>

<%
OpalMainForm<Staff> lclOF = OpalForm.create(
	session,
	request,
	"/OpalFormController",
	StaffFactory.getInstance(),
	"staff_id"
);
Staff lclS = lclOF.getUserFacing();
Tournament lclT = lclS.getTournament();
lclOF.setDeleteURI("/tournament/cancel-confirmation.jsp?object=" + lclT.getUniqueString() + "&class_name=staff");

OpalForm<Contact> lclCOF = lclOF.targetForm("Contact", ContactFactory.getInstance());
lclCOF.setUpdaterClass(ContactUpdater.class);
Contact lclC = lclCOF.getUserFacing();

String lclTitle = lclC.getName() + " staffing " + lclT.getName();
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="<%= lclT.getCode() %>" />
	<jsp:param name="pageTitle" value="<%= lclTitle %>" />
	<jsp:param name="pageDescription" value="<%= lclTitle %>" />
	<jsp:param name="topMenu" value="<%= Menus.tournamentAdmin(lclT).asTopLevel().output(request, \"staff-\" + lclT.getUniqueString()) %>" />
	<jsp:param name="h1" value="<%= lclTitle %>" />
</jsp:include>

<%= lclOF.open() %>
<%= lclCOF.open() %><%
if (lclOF.hasErrors()) {
	%><div class="row">
		<p class="form-error-intro">Error:</p>
		<div class="form-errors"><%= lclOF.errors() %></div>
	</div><%
}

%><div class="row">
	<div class="small-12 medium-6 columns">
		<label>
			Name
			<%= lclCOF.text("Name", 30) %>
		</label>
	</div>
	<div class="small-12 medium-6 columns">
		<label>
			Sort as
			<%= lclCOF.text("SortBy", 30) %>
		</label>
	</div>
</div>

<div class="row">
	<div class="small-9 medium-6 columns">
		<label>
			School
			<%= lclOF.dropdown("SchoolRegistration", SchoolRegistration.SchoolShortNameComparator.getInstance()).filter(argSR -> argSR.getTournament() == lclT).namer(argSR -> argSR.getSchool().getShortName()) %>
		</label>
	</div>
	<div class="small-3 medium-6 columns">
		<label>
			Computer
			<%= lclOF.<TechnologyChoice>dropdown("TechnologyChoice") %>
		</label>
	</div>
</div>

<div class="row">
	<div class="small-12 medium-6 columns">
		<label>
			Note
			<%= lclOF.textarea("Note", 60, 3) %>
		</label>
	</div>
	<div class="small-12 medium-6 columns">
		<label>
			Address
			<%= lclCOF.textarea("Address", 60, 3) %>
		</label>
	</div>
</div><%

List<OpalForm<StaffAssignment>> lclSAOFs = lclOF.children(
	"StaffAssignment",
	StaffAssignmentFactory.getInstance(),
	1, // row for a new staff assignments
	StaffAssignment.ROOM_COMPARATOR
);

for (OpalForm<StaffAssignment> lclSAOF : lclSAOFs) {
	StaffAssignment lclSA = lclSAOF.getUserFacing();
	%><%= lclSAOF.open() %>
	
	<div class="row">
		<div class="small-12 columns">
			<h2><%= lclSAOF.isNew() ? "Add assignment" : "Assignment to " + lclSA.getRoom().getName() + " for " + lclSA.getPhase().getName() %></h2>
		</div>
	</div>
	
	<div class="row">
		<div class="small-12 large-4 columns">
			<label>
				Phase
				<%= lclSAOF.<Phase>dropdown("Phase").filter(argP -> argP.getTournament() == lclT) %>
			</label>
		</div>
		<div class="small-12 large-4 columns">
			<label>
				Room
				<%= lclSAOF.<Room>dropdown("Room").filter(argR -> argR.getTournament() == lclT) %>
			</label>
		</div>
		<div class="small-12 large-4 columns">
			<label>
				Role
				<%= lclSAOF.<StaffRole>dropdown("Role") %>
			</label>
		</div>
		
		<div class="small-10 large-5 columns">
			<label>
				Note
				<%= lclSAOF.textarea("Note", 60, 3) %>
			</label>
		</div>
		<div class="small-2 large-1 columns"><%
			if (lclSAOF.alreadyExists()) {
				%><label>
					Delete?
					<%= HTMLUtility.deleteWidget(lclSAOF) %>
				</label><%
			}
		%></div>
	</div>
	
	<%= lclSAOF.close() %><%
}

%><div class="row">
	<div class="small-12 columns">
		<%= lclOF.submit() %> <%= lclOF.delete() %> <%= lclOF.cancel() %>
	</div>
</div>

<%= lclCOF.close() %>
<%= lclOF.close() %>

<jsp:include page="/template/footer.jsp" />