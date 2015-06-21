<%@ page import="java.util.List" %>
<%@ page import="com.opal.cma.OpalForm" %>
<%@ page import="com.opal.cma.OpalMainForm" %>
<%@ page import="com.scobolsolo.application.*" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.opalforms.updater.*" %>
<%@ page import="com.scobolsolo.HTMLUtility" %>

<%
OpalMainForm<SchoolRegistration> lclOF = OpalForm.create(
	session,
	request,
	"/OpalFormController",
	SchoolRegistrationFactory.getInstance(),
	"school_registration_id"
);
lclOF.setUpdaterClass(SchoolRegistrationUpdater.class);

SchoolRegistration lclSR = lclOF.getUserFacing();
Tournament lclT = lclSR.getTournament();
School lclS = lclSR.getSchool();
Contact lclC = lclSR.getMainContact();

lclOF.setDeleteURI("cancel-confirmation.jsp?object=" + lclT.getUniqueString() + "&class_name=school_registration");

String lclTitle = lclS.getName() + " at " + lclT.getName();
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="<%= lclT.getCode() %>" />
	<jsp:param name="pageTitle" value="<%= lclTitle %>" />
	<jsp:param name="pageDescription" value="<%= lclTitle %>" />
	<jsp:param name="topMenu" value="<%= Menus.tournamentAdmin(lclT).asTopLevel().output(request, \"schools-\" + lclT.getUniqueString()) %>" />
	<jsp:param name="h1" value="<%= lclTitle %>" />
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
	<div class="small-12 medium-8 large-6 columns">
		<label>
			Main contact
			<%= lclOF.dropdown("MainContact", Contact.NameComparator.getInstance()).filter(Contact::isActive) %>
		</label>
	</div>
	<div class="small-12 medium-4 large-2 columns">
		<label>
			Spots reserved
			<%= lclOF.text("SpotsReserved", 3) %>
		</label>
	</div>
	<div class="small-12 medium-6 large-2 columns">
		<label>
			Amount owed
			<%= lclOF.money("AmountOwed") %>
		</label>
	</div>
	<div class="small-12 medium-6 large-2 columns">
		<label>
			Amount paid
			<%= lclOF.money("AmountPaid") %>
		</label>
	</div>
	
	<div class="small-12 columns">
		<label>
			Note
			<%= lclOF.textarea("Note", 60, 3) %>
		</label>
	</div>
</div>

<div class="row">
	<div class="small-12 columns">
		<h2 id="players">Players (<%= lclSR.getPlayerCount() %>)</h2>
		<table class="full-width responsive">
			<thead>
				<tr>
					<th>Name</th>
					<th>Year</th>
					<th>Rank Among <%= lclS.getVeryShortName() %> Players</th>
					<th>Seed</th>
					<th>Note</th>
					<th>Cancel?</th>
				</tr>
			</thead>
			<tbody><%
				List<OpalForm<Player>> lclPOFs = lclOF.children(
					"Player",
					PlayerFactory.getInstance(),
					1,
					Player.RankWithinSchoolComparator.getInstance()
				);
				
				for (OpalForm<Player> lclPOF : lclPOFs) {
					Player lclP = lclPOF.getUserFacing();
					
					%><tr>
						<%= lclPOF.open() %>
						<td><%= lclPOF.dropdown("Contact", Contact.SortByComparator.getInstance()).filter(argC -> argC.isActive() && !argC.isPlayerAt(lclT)) %></td>
						<td><%= lclPOF.dropdown("SchoolYear", SchoolYear.SequenceComparator.getInstance()) %></td>
						<td><%= lclPOF.text("RankWithinSchool", 3) %></td>
						<td><%= lclPOF.text("Seed", 3) %></td>
						<td><%= lclPOF.text("Note", 60) %></td>
						<td><%= HTMLUtility.deleteWidget(lclPOF) %></td>
						<%= lclPOF.close() %>
					</tr><%
				}
			%></tbody>
			<tfoot>
				<tr>
					<td colspan="6"><a href="/admin/contact-edit.jsp">Add a new contact</a></td>
				</tr>
			</tfoot>
		</table>
	</div>
</div>

<div class="row">
	<div class="small-12 columns">
		<h2 id="waitlist-entries">Waitlist Entries</h2>
		<table class="full-width responsive">
			<thead>
				<tr>
					<th>Count</th>
					<th>Sequence Within Tournament</th>
					<th>Note</th>
					<th>Cancel?</th>
				</tr>
			</thead>
			<tbody><%
				List<OpalForm<WaitlistEntry>> lclWEOFs = lclOF.children(
					"WaitlistEntry",
					WaitlistEntryFactory.getInstance(),
					1,
					WaitlistEntry.SequenceComparator.getInstance()
				);
				
				for (OpalForm<WaitlistEntry> lclWEOF : lclWEOFs) {
					if (lclWEOF.isNew()) {
						lclWEOF.setUpdaterClass(WaitlistEntryDefaultToEndOfList.class);
					}
					
					WaitlistEntry lclWE = lclWEOF.getUserFacing();
					%><tr>
						<%= lclWEOF.open() %>
						<td data-tablesorter="<%= lclWE == null ? "0" : lclWE.getPlayerCount() %>"><%= lclWEOF.text("PlayerCount", 2) %></td>
						<td data-tablesorter="<%= lclWE == null ? "0" : lclWE.getSequence() %>"><%= lclWEOF.text("Sequence", 2) %></td>
						<td><%= lclWEOF.textarea("Note", 60, 3) %></td>
						<td><%= lclWEOF.delete() %></td>
						<td><%= HTMLUtility.deleteWidget(lclWEOF) %></td>
					</tr><%
				}
			%></tbody>
		</table>
	</div>
</div>

<div class="row">
	<div class="small-12 columns">
		<h2 id="standby-entries">Standby List Entries</h2>
		<table class="full-width responsive">
			<thead>
				<tr>
					<th>Count</th>
					<th>Sequence Within Tournament</th>
					<th>Note</th>
					<th>Cancel?</th>
				</tr>
			</thead>
			<tbody><%
				List<OpalForm<StandbyEntry>> lclSEOFs = lclOF.children(
					"StandbyEntry",
					StandbyEntryFactory.getInstance(),
					1,
					StandbyEntry.SequenceComparator.getInstance()
				);
				
				for (OpalForm<StandbyEntry> lclSEOF : lclSEOFs) {
					if (lclSEOF.isNew()) {
						lclSEOF.setUpdaterClass(StandbyEntryDefaultToEndOfList.class);
					}
					
					StandbyEntry lclSE = lclSEOF.getUserFacing();
					%><tr>
						<%= lclSEOF.open() %>
						<td data-tablesorter="<%= lclSE == null ? "0" : lclSE.getPlayerCount() %>"><%= lclSEOF.text("PlayerCount", 2) %></td>
						<td data-tablesorter="<%= lclSE == null ? "0" : lclSE.getSequence() %>"><%= lclSEOF.text("Sequence", 2) %></td>
						<td><%= lclSEOF.textarea("Note", 60, 3) %></td>
						<td><%= HTMLUtility.deleteWidget(lclSEOF) %></td>
						<%= lclSEOF.close() %>
					</tr><%
				}
			%></tbody>
		</table>
	</div>
</div>

<div class="row">
	<div class="small-12 columns">
		<h2 id="staff">Staff (<%= lclSR.getStaffCount() %>)</h2>
		<table class="full-width responsive">
			<thead>
				<tr>
					<th>Name</th>
					<th>Note</th>
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
					lclSOF.setUpdaterClass(StaffAsSchoolRegistrationChild.class);
					Staff lclStaff = lclSOF.getUserFacing();
					
					%><tr>
						<%= lclSOF.open() %><%
						if (lclStaff == null) {
							%><td><%= lclSOF.dropdown("Contact", Contact.SortByComparator.getInstance()) %></td><%
						} else {
							%><td><%= lclStaff.getContact().getName() %></td><%
						}
						%>
						<td><%= lclSOF.textarea("Note", 60, 3) %></td>
						<td><%= HTMLUtility.deleteWidget(lclSOF) %></td>
						<%= lclSOF.close() %>
					</tr><%
				}
			%></tbody>
		</table>
	</div>
</div>

<div class="row">
	<div class="small-12 columns">
		<h2 id="buzzers">Buzzers (<%= lclSR.getBuzzerCount() %>)</h2>
		<table class="full-width responsive">
			<thead>
				<tr>
					<th>Name</th>
					<th>Room</th>
					<th>Cancel?</th>
				</tr>
			</thead>
			<tbody><%
				for (OpalForm<Buzzer> lclBOF : lclOF.children("Buzzer", BuzzerFactory.getInstance(), 1)) {
					Buzzer lclB = lclBOF.getUserFacing();
					%><tr>
						<%= lclBOF.open() %>
						<td><%= lclBOF.text("Name", 20) %></td>
						<td><%= lclBOF.dropdown("Room", Room.SequenceComparator.getInstance()).filter(argR -> argR.getTournament() == lclT) %></td>
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
		<%= lclOF.submit() %> <%= lclOF.delete() %> <%= lclOF.cancel() %>
	</div>
</div>

<%= lclOF.close() %>

<jsp:include page="/template/footer.jsp" />