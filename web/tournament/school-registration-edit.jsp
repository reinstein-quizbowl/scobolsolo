<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="org.apache.commons.lang3.StringUtils" %>
<%@ page import="com.opal.ImplicitTableDatabaseQuery" %>
<%@ page import="com.opal.cma.OpalForm" %>
<%@ page import="com.opal.cma.OpalMainForm" %>
<%@ page import="com.scobolsolo.application.Buzzer" %>
<%@ page import="com.scobolsolo.application.BuzzerFactory" %>
<%@ page import="com.scobolsolo.application.Contact" %>
<%@ page import="com.scobolsolo.application.ContactFactory" %>
<%@ page import="com.scobolsolo.application.Player" %>
<%@ page import="com.scobolsolo.application.PlayerFactory" %>
<%@ page import="com.scobolsolo.application.Room" %>
<%@ page import="com.scobolsolo.application.School" %>
<%@ page import="com.scobolsolo.application.SchoolYear" %>
<%@ page import="com.scobolsolo.application.SchoolRegistration" %>
<%@ page import="com.scobolsolo.application.SchoolRegistrationFactory" %>
<%@ page import="com.scobolsolo.application.Staff" %>
<%@ page import="com.scobolsolo.application.StaffFactory" %>
<%@ page import="com.scobolsolo.application.StandbyEntry" %>
<%@ page import="com.scobolsolo.application.StandbyEntryFactory" %>
<%@ page import="com.scobolsolo.application.Tournament" %>
<%@ page import="com.scobolsolo.application.WaitlistEntry" %>
<%@ page import="com.scobolsolo.application.WaitlistEntryFactory" %>
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

lclOF.setDeleteURI("/tournament/cancel-confirmation.jsp?object=" + lclT.getUniqueString() + "&class_name=school_registration");

String lclTitle = lclS.getName() + " at " + lclT.getName();

List<Contact> lclActiveContacts = ContactFactory.getInstance().acquireForQuery(
	new ArrayList<>(),
	new ImplicitTableDatabaseQuery("active = true")
);
lclActiveContacts.sort(null);
lclActiveContacts.removeIf(argC -> argC.isOccupiedAt(lclT));
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
			<div class="form-errors"><%= lclOF.displayResultOrErrors() %></div>
		</div>
	</div><%
}

boolean lclSplitMainContact = lclOF.alreadyExists() && lclC != null && (lclC.getEmailAddress() != null || lclC.getAdvancePhone() != null || lclC.getDayOfPhone() != null);

%><div class="row">
	<div class="<%= lclSplitMainContact ? "small-12 medium-4 large-3 columns" : "small-12 medium-8 large-6 columns" %>">
		<label>
			Main contact
			<%= lclOF.dropdown("MainContact", Contact.NameComparator.getInstance()).filter(Contact::isActive) %>
		</label>
	</div><%
	if (lclSplitMainContact) {
		%><div class="small-12 medium-4 large-3 columns">
			<br /><!-- spacer for the "Main contact" label --><%
			if (lclC.getEmailAddress() != null) {
				%><a href="mailto:<%= lclC.getEmailAddress() %>"><%= lclC.getEmailAddress() %></a><br /><%
			}
			if (lclC.getAdvancePhone() != null) {
				%>Advance:&nbsp;<a href="tel://<%= lclC.getAdvancePhone() %>"><%= lclC.getAdvancePhone() %></a><br /><%
			}
			if (lclC.getDayOfPhone() != null) {
				%>Day&nbsp;Of:&nbsp;<a href="tel://<%= lclC.getDayOfPhone() %>"><%= lclC.getDayOfPhone() %></a><%
			}
		%></div><%
	}
	%><div class="small-12 medium-4 large-2 columns">
		<label>
			Spots reserved
			<%= lclOF.number("SpotsReserved").min(0) %>
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
		<h2 id="players">Players (<%= lclSR.getPlayerSet().size() %>)</h2>
		<table>
			<thead>
				<tr>
					<th>&nbsp;</th>
					<th>Name</th>
					<th>Year</th>
					<th>Rank&nbsp;w/in&nbsp;<%= lclS.getVeryShortName() %></th>
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
						<td><%
							if (lclPOF.alreadyExists()) {
								%><a href="player-edit.jsp?player_id=<%= lclP.getId() %>">Edit</a><%
							} else {
								%>&nbsp;<%
							}
						%></td>
						<td><%= lclPOF.<Contact>dropdown("Contact").choices(lclActiveContacts) %></td>
						<td><%= lclPOF.<SchoolYear>dropdown("SchoolYear").namer(SchoolYear::getVeryShortName) %></td>
						<td><%= lclPOF.number("RankWithinSchool").range(1, lclSR.getPlayerSet().isEmpty() ? 1 : lclSR.getPlayerSet().size() + 1) %></td>
						<td><%= lclPOF.number("Seed").min(1) %></td>
						<td><%= lclPOF.text("Note", 40) %></td>
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
		<table>
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
					1
				);
				
				for (OpalForm<WaitlistEntry> lclWEOF : lclWEOFs) {
					if (lclWEOF.isNew()) {
						lclWEOF.setUpdaterClass(WaitlistEntryDefaultToEndOfList.class);
					}
					
					WaitlistEntry lclWE = lclWEOF.getUserFacing();
					%><tr>
						<%= lclWEOF.open() %>
						<td data-order="<%= lclWE == null ? "0" : lclWE.getPlayerCount() %>"><%= lclWEOF.number("PlayerCount").min(1) %></td>
						<td data-order="<%= lclWE == null ? "0" : lclWE.getSequence() %>"><%= lclWEOF.number("Sequence") %></td>
						<td><%= lclWEOF.textarea("Note", 60, 3) %></td>
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
		<table>
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
					1
				);
				
				for (OpalForm<StandbyEntry> lclSEOF : lclSEOFs) {
					if (lclSEOF.isNew()) {
						lclSEOF.setUpdaterClass(StandbyEntryDefaultToEndOfList.class);
					}
					
					StandbyEntry lclSE = lclSEOF.getUserFacing();
					%><tr>
						<%= lclSEOF.open() %>
						<td data-order="<%= lclSE == null ? "0" : lclSE.getPlayerCount() %>"><%= lclSEOF.number("PlayerCount").min(1) %></td>
						<td data-order="<%= lclSE == null ? "0" : lclSE.getSequence() %>"><%= lclSEOF.number("Sequence") %></td>
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
		<h2 id="staff">Staff (<%= lclSR.getStaffSet().size() %>)</h2>
		<table>
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
							%><td><%= lclSOF.<Contact>dropdown("Contact").choices(lclActiveContacts) %></td><%
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
		<h2 id="buzzers">Buzzers (<%= lclSR.getBuzzerSet().size() %>)</h2>
		<table>
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
						<td><%= lclBOF.<Room>dropdown("Room").filter(argR -> argR.getTournament() == lclT) %></td>
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