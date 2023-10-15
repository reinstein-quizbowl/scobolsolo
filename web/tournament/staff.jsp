﻿<%@ page import="java.util.List" %>
<%@ page import="com.opal.cma.OpalForm" %>
<%@ page import="com.opal.cma.OpalMainForm" %>
<%@ page import="com.scobolsolo.application.*" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.opalforms.updater.ContactUpdater" %>
<%@ page import="com.scobolsolo.opalforms.updater.StaffAsTournamentChild" %>
<%@ page import="com.scobolsolo.HTMLUtility" %>

<%
OpalMainForm<Tournament> lclOF = OpalForm.create(
	session,
	request,
	"/OpalFormController",
	TournamentFactory.getInstance().forUniqueString(request.getParameter("object")),
	TournamentFactory.getInstance()
);

Tournament lclT = lclOF.getUserFacing();
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="<%= lclT.getCode() %>" />
	<jsp:param name="pageTitle" value="Staff" />
	<jsp:param name="topMenu" value="<%= Menus.tournamentAdmin(lclT).asTopLevel().output(request, \"staff-\" + lclT.getUniqueString()) %>" />
	<jsp:param name="h1" value="Staff" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<%= lclOF.open() %><%
		if (lclOF.hasErrors()) {
			%><p class="form-error-intro">Error:</p><%
			%><div class="form-errors"><%= lclOF.displayResultOrErrors() %></div><%
		}

		%><table>
			<thead>
				<tr>
					<th>Name</th>
					<th>School</th>
					<th>Note</th>
					<th>Assignment</th>
					<th>Edit</th>
					<th>Cancel?</th>
				</tr>
			</thead>
			<tbody><%
				List<OpalForm<Staff>> lclSOFs = lclOF.children(
					"Staff",
					StaffFactory.getInstance(),
					1,
					Staff.NameComparator.getInstance()
				);
				
				for (OpalForm<Staff> lclSOF : lclSOFs) {
					lclSOF.setUpdaterClass(StaffAsTournamentChild.class);
					Staff lclStaff = lclSOF.getUserFacing();
					
					%><tr>
						<%= lclSOF.open() %>
						<th data-order="<%= lclSOF.isNew() ? "" : lclStaff.getContact().getSortBy() %>"><%= lclSOF.<Contact>dropdown("Contact").filter(argC -> argC.isActive() && argC.isOccupiedAt(lclT) == false) %></th>
						<td data-order="<%= lclSOF.isNew() ? "" : (lclStaff.getSchoolRegistration() == null ? "" : lclStaff.getSchoolRegistration().getSchool().getName()) %>"><%= lclSOF.dropdown("SchoolRegistration", SchoolRegistration.SchoolShortNameComparator.getInstance()).filter(argSR -> argSR.getTournament() == lclT).namer(argSR -> argSR.getSchool().getShortName()) %></td>
						<td><%= lclSOF.text("Note", 30) %></td>
						<td><%
							for (OpalForm<StaffAssignment> lclSAOF : lclSOF.children("StaffAssignment", StaffAssignmentFactory.getInstance(), StaffAssignment.ROOM_COMPARATOR)) {
								Room lclR = lclSAOF.getUserFacing().getRoom();
								%><%= lclSAOF.open() %>
									<a href="room-edit.jsp?room_id=<%= lclR.getId() %>"><%= lclR.getShortName() %></a> <label class="my-inline">(Unassign?&nbsp;<%= lclSAOF.delete() %>)</label><br />
								<%= lclSAOF.close() %><%
							}
							
							if (lclStaff != null && lclStaff.getStaffAssignmentSet().isEmpty()) {
								%>(none)<%
							}
						%></td>
						<td><%= lclStaff == null ? "&nbsp;" : "<a href=\"staff-edit.jsp?staff_id=" + lclStaff.getId() + "\">Edit</a>" %></td>
						<td><%= HTMLUtility.deleteWidget(lclSOF) %></td>
						<%= lclSOF.close() %>
					</tr><%
				}
			%></tbody>
			<tfoot>
				<tr>
					<td colspan="7"><a href="/admin/contact-edit.jsp">Add a new contact</a></td>
				</tr>
			</tfoot>
		</table>
		
		<div class="row">
			<div class="small-12 columns submit-buttons">
				<%= lclOF.submit() %>
				<%= lclOF.cancel() %>
			</div>
		</div>
		
		<%= lclOF.close() %>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />