<%@ page import="java.math.BigDecimal" %>
<%@ page import="java.text.NumberFormat" %>
<%@ page import="java.util.List" %>
<%@ page import="com.opal.cma.OpalForm" %>
<%@ page import="com.opal.cma.OpalMainForm" %>
<%@ page import="com.scobolsolo.application.*" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.opalforms.updater.SchoolRegistrationUpdater" %>
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
	<jsp:param name="pageTitle" value="Schools" />
	<jsp:param name="topMenu" value="<%= Menus.tournamentAdmin(lclT).asTopLevel().output(request, \"schools-\" + lclT.getUniqueString()) %>" />
	<jsp:param name="h1" value="Schools" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<%= lclOF.open() %><%
		if (lclOF.hasErrors()) {
			%><p class="form-error-intro">Error:</p><%
			%><div class="form-errors"><%= lclOF.errors() %></div><%
		}
		
		int lclSpotsReserved = 0;
		int lclDefinedPlayers = 0;
		
		int lclWaitlistPlayers = 0;
		int lclStandbyPlayers = 0;
		
		int lclSchoolStaff = 0;
		
		int lclBuzzers = 0;
		
		BigDecimal lclOwed = BigDecimal.ZERO;
		BigDecimal lclPaid = BigDecimal.ZERO;
		
		%><table class="responsive">
			<thead>
				<tr>
					<th>Name</th>
					<th>Contact</th>
					<th>Reserved</th>
					<th>Players</th>
					<th>Staff</th>
					<th>Buzzers</th>
					<th>Owed</th>
					<th>Paid</th>
					<th>Cancel?</th>
				</tr>
			</thead>
			<tbody><%
				List<OpalForm<SchoolRegistration>> lclSROFs = lclOF.children(
					"SchoolRegistration",
					SchoolRegistrationFactory.getInstance(),
					-1, // One row for a new school, at the top
					SchoolRegistration.SchoolShortNameComparator.getInstance()
				);
				for (OpalForm<SchoolRegistration> lclSROF : lclSROFs) {
					lclSROF.setUpdaterClass(SchoolRegistrationUpdater.class);
					SchoolRegistration lclSR = lclSROF.getUserFacing();
					
					if (lclSR != null) {
						lclSpotsReserved += lclSR.getSpotsReserved();
						lclDefinedPlayers += lclSR.getPlayerCount();
						
						for (WaitlistEntry lclWE : lclSR.createWaitlistEntryArray()) {
							lclWaitlistPlayers += lclWE.getPlayerCount();
						}
						
						for (StandbyEntry lclSE : lclSR.createStandbyEntryArray()) {
							lclStandbyPlayers += lclSE.getPlayerCount();
						}
						
						lclSchoolStaff += lclSR.getStaffCount();
						
						lclBuzzers += lclSR.getBuzzerCount();
						
						lclOwed = lclOwed.add(lclSR.getAmountOwed());
						lclPaid = lclPaid.add(lclSR.getAmountPaid());
					}
					
					%><tr>
						<%= lclSROF.open() %>
						<td><%
							if (lclSR == null) {
								%><%= lclSROF.dropdown("School", School.ShortNameComparator.getInstance()).filter(argS -> !argS.attending(lclT)) %><%
							} else {
								%><a href="school-registration-edit.jsp?school_registration_id=<%= lclSR.getId() %>" class="stealth-tooltip" title="<%= lclSR.getSchool().getName() %>"><%= lclSR.getSchool().getShortName() %></a><%
							}
						%></td>
						<td data-tablesorter="<%= lclSR == null ? "" : lclSR.getMainContact().getSortBy() %>"><%= lclSROF.<Contact>dropdown("MainContact").filter(Contact::isActive) %></td>
						<td data-tablesorter="<%= lclSR == null ? "0" : lclSR.getSpotsReserved() %>"><%= lclSROF.text("SpotsReserved", 2) %></td>
						<td data-tablesorter="<%= lclSR == null ? "0" : lclSR.getPlayerCount() %>"><%= lclSR == null ? "&nbsp;" : "<a href=\"school-registration-edit.jsp?school_registration_id=" + lclSR.getId() + "#players\">" + lclSR.getPlayerCount() + "</a>" %></td>
						<td data-tablesorter="<%= lclSR == null ? "0" : lclSR.getStaffCount() %>"><%= lclSR == null ? "&nbsp;" : "<a href=\"school-registration-edit.jsp?school_registration_id=" + lclSR.getId() + "#staff\">" + lclSR.getStaffCount() + "</a>" %></td>
						<td data-tablesorter="<%= lclSR == null ? "0" : lclSR.getBuzzerCount() %>"><%= lclSR == null ? "&nbsp;" : "<a href=\"school-registration-edit.jsp?school_registration_id=" + lclSR.getId() + "#buzzers\">" + lclSR.getBuzzerCount() + "</a>" %></td>
						<td data-tablesorter="<%= lclSR == null ? "0.00" : lclSR.getAmountOwed() %>"><%= lclSROF.money("AmountOwed") %></td>
						<td data-tablesorter="<%= lclSR == null ? "0.00" : lclSR.getAmountPaid() %>"><%= lclSROF.money("AmountPaid") %></td>
						<td><%= HTMLUtility.deleteWidget(lclSROF) %></td>
						<%= lclSROF.close() %>
					</tr><%
				}
			%></tbody>
			<tfoot>
				<tr>
					<td><a href="/admin/school-edit.jsp">Add a new school</a></td>
					<td colspan="8"><a href="/admin/contact-edit.jsp">Add a new contact (player or coach)</a></td>
				</tr>
				<tr>
					<th>&nbsp;</th><!-- Name -->
					<th>&nbsp;</th><!-- Contact -->
					<th><span title="Spots reserved"><%= lclSpotsReserved %></span></th>
					<th><span title="Players defined"><%= lclDefinedPlayers %></span></th>
					<th><span title="Staff (school-provided and non-)"><%= lclT.getStaffCount() %></span></th>
					<th><span title="Buzzers"><%= lclBuzzers %></span></th>
					<th><span title="Owed"><%= NumberFormat.getCurrencyInstance().format(lclOwed) %></span></th>
					<th><span title="Paid"><%= NumberFormat.getCurrencyInstance().format(lclPaid) %></span></th>
					<th>&nbsp;</th><!-- Cancel -->
				</tr>
			</tfoot>
		</table>
		
		<h2>Other totals</h2>
		<ul>
			<li>Spaces filled: <%= (lclSpotsReserved + lclDefinedPlayers) %></li>
			<li>Waitlist players: <%= lclWaitlistPlayers %></li>
			<li>Standby players: <%= lclStandbyPlayers %></li>
			<li>School staff: <%= lclSchoolStaff %></li>
			<li>Money anticipated: <%= NumberFormat.getCurrencyInstance().format(lclOwed.add(lclPaid)) %></li>
		</ul>
		
		<div class="submit btn-group">
			<%= lclOF.submit() %>
			<%= lclOF.cancel() %>
		</div>
		
		<%= lclOF.close() %>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />