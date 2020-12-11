<%@ page import="java.util.Comparator" %>
<%@ page import="java.util.List" %>
<%@ page import="org.apache.commons.lang3.Validate" %>
<%@ page import="com.opal.DatabaseQuery" %>
<%@ page import="com.opal.ImplicitTableDatabaseQuery" %>
<%@ page import="com.opal.cma.OpalForm" %>
<%@ page import="com.opal.cma.OpalMainForm" %>
<%@ page import="com.scobolsolo.application.*" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.opalforms.updater.BuzzerUnassigningUpdater" %>
<%@ page import="com.scobolsolo.opalforms.updater.RoomUpdater" %>
<%@ page import="com.scobolsolo.HTMLUtility" %>

<%
OpalMainForm<Room> lclOF = OpalForm.create(
	session,
	request,
	"/OpalFormController",
	RoomFactory.getInstance(),
	"room_id"
);
lclOF.setUpdaterClass(RoomUpdater.class);
Room lclR = lclOF.getUserFacing();
Tournament lclT = lclR.getTournament();
lclOF.setDeleteURI("/tournament/cancel-confirmation.jsp?object=" + lclT.getUniqueString() + "&class_name=room");

String lclTitle = lclR.getName() + " at " + lclT.getName();
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="<%= lclT.getCode() %>" />
	<jsp:param name="pageTitle" value="<%= lclTitle %>" />
	<jsp:param name="pageDescription" value="<%= lclTitle %>" />
	<jsp:param name="topMenu" value="<%= Menus.tournamentAdmin(lclT).asTopLevel().output(request, \"rooms-\" + lclT.getUniqueString()) %>" />
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
	<div class="small-12 medium-6 columns">
		<label>
			Short name
			<%= lclOF.text("ShortName", 10) %>
		</label>
	</div>
	
	<div class="small-12 medium-6 columns">
		<label>
			Sequence
			<%= lclOF.number("Sequence") %>
		</label>
	</div>
	<div class="small-12 medium-6 columns">
		<label>
			Note
			<%= lclOF.textarea("Note", 60, 3) %>
		</label>
	</div>
</div><%

if (lclOF.alreadyExists()) {
	for (final Phase lclPhase : lclT.getPhases()) {
		%><div class="row">
			<div class="small-12 columns">
				<h2>Matches in <%= lclPhase.getName() %> (<%= lclR.countMatchesIn(lclPhase) %>)</h2>
				<table>
					<thead>
						<tr>
							<th>Round</th>
							<th>Winning Card</th>
							<th>Losing Card</th>
							<th>Status</th>
						</tr>
					</thead>
					<tbody><%
						for (final Round lclRound : lclPhase.getRounds()) {
							final List<Match> lclMatches = lclR.findMatches(lclRound);
							if (lclMatches.isEmpty()) {
								%><tr>
									<th><%= lclRound.getName() %></th>
									<td>-</td>
									<td>-</td>
									<td>No match</td>
								</tr><%
							} else {
								for (final Match lclM : lclMatches) {
									%><tr>
										<th><%= lclRound.getName() %></th>
										<td><%= lclPhase.isCardSystem() ? lclM.getWinningCard().getName() : "n/a" %></td>
										<td><%= lclPhase.isCardSystem() ? lclM.getLosingCard().getName() : "n/a" %></td>
										<td><%= lclM.determineStatus() %></td>
									</tr><%
								}
							}
						}
					%></tbody>
				</table>
			</div>
		</div><%
	}
}
%>

<div class="row">
	<div class="small-12 columns">
		<h2>Staff</h2>
	</div>
	
	<div class="small-12 columns">
		<table>
			<thead>
				<tr>
					<th>Phase</th>
					<th>Staffer</th>
					<th>Role</th>
					<th>Note</th>
					<th>Unassign?</th>
				</tr>
			</thead>
			<tbody><%
				List<OpalForm<StaffAssignment>> lclSAOFs = lclOF.children(
					"StaffAssignment",
					StaffAssignmentFactory.getInstance(),
					1, // rows for a new staff assignment
					StaffAssignment.STAFF_NAME_COMPARATOR
				);
			
				for (OpalForm<StaffAssignment> lclSAOF : lclSAOFs) {
					%><%= lclSAOF.open() %>
					<tr>
						<td><%= lclSAOF.<Phase>dropdown("Phase").filter(argP -> argP.getTournament() == lclT).namer(Phase::getShortName) %></td>
						<td><%= lclSAOF.dropdown("Staff", Staff.NameComparator.getInstance()).filter(argS -> argS.getTournament() == lclT).namer(argS -> argS.getContact().getName()) %></td>
						<td><%= lclSAOF.<StaffRole>dropdown("Role") %></td>
						<td><%= lclSAOF.textarea("Note", 40, 1) %></td>
						<td><%= HTMLUtility.deleteWidget(lclSAOF) %></td>
					</tr>
					<%= lclSAOF.close() %><%
				}
			%></tbody>
		</table>
	</div>
</div>

<div class="row">
	<div class="small-12 columns">
		<h2>Buzzers (<%= lclR.getBuzzerSet().size() %>)</h2>
	</div>
	
	<div class="small-12 columns">
		<table>
			<thead>
				<tr>
					<th>System</th>
					<th>Unassign?</th>
				</tr>
			</thead>
			<tbody><%
				for (OpalForm<Buzzer> lclBOF : lclOF.children("Buzzer", BuzzerFactory.getInstance(), Buzzer.NameComparator.getInstance())) {
					lclBOF.setUpdaterClass(BuzzerUnassigningUpdater.class);
					Buzzer lclB = lclBOF.getUserFacing();
					%><tr>
						<%= lclBOF.open() %>
						<td><%= lclBOF.getUserFacing().getName() %></td>
						<td><%= HTMLUtility.deleteWidget(lclBOF) %></td>
						<%= lclBOF.close() %>
					</tr><%
				}
			%></tbody>
		</table>
	</div>
</div>

<div class="row">
	<div class="small-12 columns">
		<%= lclOF.submit() %> <%= lclOF.delete("Delete") %> <%= lclOF.cancel() %>
	</div>
</div>

<%= lclOF.close() %>

<jsp:include page="/template/footer.jsp" />