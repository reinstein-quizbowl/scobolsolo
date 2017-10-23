<%@ page import="java.util.Comparator" %>
<%@ page import="java.util.List" %>
<%@ page import="com.opal.cma.OpalForm" %>
<%@ page import="com.opal.cma.OpalMainForm" %>
<%@ page import="com.scobolsolo.application.*" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.opalforms.updater.RoomUpdater" %>
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
	<jsp:param name="pageTitle" value="Rooms" />
	<jsp:param name="topMenu" value="<%= Menus.tournamentAdmin(lclT).asTopLevel().output(request, \"rooms-\" + lclT.getUniqueString()) %>" />
	<jsp:param name="h1" value="Rooms" />
</jsp:include>

<%= lclOF.open() %><%
if (lclOF.hasErrors()) {
	%><div class="row">
		<div class="small-12 columns">
			<p class="form-error-intro">Error:</p>
			<div class="form-errors"><%= lclOF.errors() %></div>
		</div>
	</div><%
}

%><div class="row">
	<div class="small-12 columns">
		<table class="responsive" data-fixed-columns="1">
			<thead>
				<tr>
					<th>Name</th>
					<th>Short&nbsp;name</th>
					<th>Note</th>
					<th><span title="Buzzers">Bz</span></th>
					<th><span title="Sequence">Seq</span></th>
					<th>Staff</th>
					<th>Edit</th>
					<th><span title="Delete this room?">Del</span></th>
				</tr>
			</thead>
			<tbody><%
				List<OpalForm<Room>> lclROFs = lclOF.children(
					"Room",
					RoomFactory.getInstance(),
					1 // row for a new room
				);
				
				for (OpalForm<Room> lclROF : lclROFs) {
					lclROF.setUpdaterClass(RoomUpdater.class);
					Room lclR = lclROF.getUserFacing();
					
					%><tr>
						<%= lclROF.open() %>
						<td><%= lclROF.text("Name", 20) %></td>
						<td><%= lclROF.text("ShortName", 10) %></td>
						<td><%= lclROF.textarea("Note", 30, 1) %></td>
						<td><%= lclR == null ? "-" : lclR.getBuzzerSet().size() %></td>
						<td><%= lclROF.number("Sequence") %></td>
						<td><%
							for (OpalForm<StaffAssignment> lclSAOF : lclROF.children("StaffAssignment", StaffAssignmentFactory.getInstance(), StaffAssignment.STAFF_NAME_COMPARATOR)) {
								StaffAssignment lclSA = lclSAOF.getUserFacing();
								Staff lclS = lclSA.getStaff();
								%><%= lclSAOF.open() %>
									<a href="staff-edit.jsp?staff_id=<%= lclS.getId() %>" title="<%= lclSA.getRole().getName() %> during <%= lclSA.getPhase().getShortName() %><%= lclSA.getNote() == null ? "" : " (" + lclSA.getNote() + ")" %>"><%= lclS.getContact().getName() %></a><br />
								<%= lclSAOF.close() %><%
							}
							
							if (lclR != null && lclR.getStaffAssignmentSet().isEmpty()) {
								%>(none)<%
							}
						%></td>
						<td><%= lclR == null ? "&nbsp;" : "<a href=\"room-edit.jsp?room_id=" + lclR.getId() + "\">Edit</a>" %></td>
						<td><%= HTMLUtility.deleteWidget(lclROF) %></td>
						<%= lclROF.close() %>
					</tr><%
				}
			%></tbody>
		</table>
	</div>
</div>

<div class="row">
	<div class="small-12 columns">
		<%= lclOF.submit() %>
		<%= lclOF.cancel() %>
	</div>
</div>

<%= lclOF.close() %>

<jsp:include page="/template/footer.jsp" />