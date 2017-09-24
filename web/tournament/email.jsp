<%@ page import="java.util.Comparator" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.scobolsolo.application.*" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<%
Tournament lclT = TournamentFactory.getInstance().fromHttpRequest(request, "object");
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="<%= lclT.getCode() %>" />
	<jsp:param name="pageTitle" value="Email attendees" />
	<jsp:param name="topMenu" value="<%= Menus.tournamentAdmin(lclT).asTopLevel().output(request, \"email-\" + lclT.getUniqueString()) %>" />
	<jsp:param name="h1" value="Email attendees" />
</jsp:include>

<style type="text/css">
	.checkbuttons a {
		margin-left: 1rem;
		margin-bottom: 0.5rem;
	}
	
	.email-entry {
		line-height: 1.25rem;
	}
	
	.email-entry label {
		padding: 0.5rem;
		line-height: inherit;
	}
	
	.email-entry label input[type=checkbox] {
		margin-bottom: 0;
		line-height: inherit;
	}
</style>

<form action="EmailAttendees" method="post">
	<input type="hidden" name="tournament_code" value="<%= lclT.getCode() %>" />
	
	<div class="row">
		<div class="small-12 columns">
			<p>Whom do you wish to email?</p>
		</div>
	</div><%
	
	SchoolRegistration[] lclSRs = lclT.createSchoolRegistrationArray();
	if (lclSRs.length > 0) {
		Arrays.sort(
			lclSRs,
			Comparator.<SchoolRegistration>comparingInt(argSR -> argSR.getMainContact().getEmailAddress() == null ? 1 : 0)
				.<SchoolRegistration>thenComparing(SchoolRegistration.SchoolShortNameComparator.getInstance())
		);
		%><section>
			<div class="row">
				<div class="small-12 columns">
					<h2>School contacts</h2>
					<div class="row checkbuttons">
						<a class="button tiny" href="javascript:setCheckedState('school_contacts', true);">check all</a>
						<a class="button tiny" href="javascript:setCheckedState('school_contacts', false);">uncheck all</a>
					</div>
				</div>
			</div>
			<div id="school_contacts" class="row"><%
				for (SchoolRegistration lclSR : lclSRs) {
					%><div class="small-12 medium-6 large-4 columns email-entry"><%
					Contact lclC = lclSR.getMainContact();
					if (lclC.getEmailAddress() != null) {
						%><label><input type="checkbox" name="to" value="<%= lclC.getEmailAddress() %>" id="schoolcontact_to_<%= lclC.getEmailAddress() %>" />&nbsp;<%= lclC.getName() %> (<%= lclSR.getSchool().getShortName() %>)</label><%
					} else {
						%><div class="warning"><label><input type="checkbox" disabled />&nbsp;<a href="/admin/contact-edit.jsp?contact_id=<%= lclC.getId() %>">No email address for <%= lclC.getName() %> (<%= lclSR.getSchool().getShortName() %>)</label></div><%
					}
					%></div><%
				}
			%></div>
		</section><%
	}
	
	List<Staff> lclNonTeamStaff = new ArrayList<>();
	List<Staff> lclTeamStaff = new ArrayList<>();
	
	for (Staff lclS : lclT.getStaffSet()) {
		if (lclS.getSchoolRegistration() == null) {
			lclNonTeamStaff.add(lclS);
		} else {
			lclTeamStaff.add(lclS);
		}
	}
	
	if (lclTeamStaff.isEmpty() == false) {
		lclTeamStaff.sort(
			Comparator.<Staff>comparingInt(argS -> argS.getContact().getEmailAddress() == null ? 1 : 0)
				.<Staff>thenComparing(Staff.NameComparator.getInstance())
		);
		%><section>
			<div class="row">
				<div class="small-12 columns">
					<h2>Team staff</h2>
					<div class="row checkbuttons">
						<a class="button tiny" href="javascript:setCheckedState('team_staff', true);">check all</a>
						<a class="button tiny" href="javascript:setCheckedState('team_staff', false);">uncheck all</a>
					</div>
				</div>
			</div>
			<div id="team_staff" class="row"><%
				for (Staff lclS : lclTeamStaff) {
					%><div class="small-12 medium-6 large-4 columns email-entry"><%
					Contact lclC = lclS.getContact();
					if (lclC.getEmailAddress() != null) {
						%><label><input type="checkbox" name="to" value="<%= lclC.getEmailAddress() %>" id="teamstaff_to_<%= lclC.getEmailAddress() %>" />&nbsp;<%= lclC.getName() %> (<%= lclS.getSchoolRegistration().getSchool().getShortName() %>)</label><%
					} else {
						%><div class="warning"><label><input type="checkbox" disabled />&nbsp;No email address for <a href="/admin/contact-edit.jsp?contact_id=<%= lclC.getId() %>"><%= lclC.getName() %></a> (<%= lclS.getSchoolRegistration().getSchool().getShortName() %>)</label></div><%
					}
					%></div><%
				}
			%></div>
		</section><%
	}
	
	if (lclNonTeamStaff.isEmpty() == false) {
		lclNonTeamStaff.sort(
			Comparator.<Staff>comparingInt(argS -> argS.getContact().getEmailAddress() == null ? 1 : 0)
				.<Staff>thenComparing(Staff.NameComparator.getInstance())
		);
		%><section>
			<div class="row">
				<div class="small-12 columns">
					<h2>Non-team staff</h2>
					<div class="row checkbuttons">
						<a class="button tiny" href="javascript:setCheckedState('non_team_staff', true);">check all</a>
						<a class="button tiny" href="javascript:setCheckedState('non_team_staff', false);">uncheck all</a>
					</div>
				</div>
			</div>
			<div id="non_team_staff" class="row"><%
				for (Staff lclS : lclNonTeamStaff) {
					%><div class="small-12 medium-6 large-4 columns email-entry"><%
					Contact lclC = lclS.getContact();
					if (lclC.getEmailAddress() != null) {
						%><label><input type="checkbox" name="to" value="<%= lclC.getEmailAddress() %>" id="nonteamstaff_to_<%= lclC.getEmailAddress() %>" />&nbsp;<%= lclC.getName() %></label><%
					} else {
						%><div class="warning"><label><input type="checkbox" disabled />&nbsp;No email address for <a href="/admin/contact-edit.jsp?contact_id=<%= lclC.getId() %>"><%= lclC.getName() %></a></label></div><%
					}
					%></div><%
				}
			%></div>
		</section><%
	}
	
	List<Player> lclPlayersWithEmailAddresses = lclT.getPlayers();
	lclPlayersWithEmailAddresses.removeIf(argPlayer -> argPlayer.getContact().getEmailAddress() == null);
	if (!lclPlayersWithEmailAddresses.isEmpty()) {
		lclPlayersWithEmailAddresses.sort(
			Comparator.<Player>comparingInt(argP -> argP.getContact().getEmailAddress() == null ? 1 : 0)
				.<Player>thenComparing(Player.NameComparator.getInstance())
		);
		%><section>
			<div class="row">
				<div class="small-12 columns">
					<h2>Players</h2><%
						if (lclPlayersWithEmailAddresses.size() > 1) {
							%><div class="row checkbuttons">
								<a class="button tiny" href="javascript:setCheckedState('players', true);">check all</a>
								<a class="button tiny" href="javascript:setCheckedState('players', false);">uncheck all</a>
							</div><%
						}
				%></div>
			</div>
			<div id="players" class="row"><%
				for (Player lclP : lclPlayersWithEmailAddresses) {
					Contact lclC = lclP.getContact();
					%><div class="small-12 medium-6 large-4 columns email-entry">
						<label><input type="checkbox" name="to" value="<%= lclC.getEmailAddress() %>" id="nonteamstaff_to_<%= lclC.getEmailAddress() %>" />&nbsp;<%= lclC.getName() %> (<%= lclP.getSchoolRegistration().getSchool().getShortName() %>)</label>
					</div><%
				}
			%></div>
		</section><%
	}
	
	%><section>
		<div class="row">
			<div class="small-12 columns">
				<h2>Additional addresses</h2>
			</div>
		</div>
		<div id="additional_addresses" class="row">
			<div class="small-12 columns">
				<label>
					Enter additional email addresses to send to, separated by whitespace (and optionally, commas).
					<textarea rows="4" name="additional_to" id="additional_to"></textarea>
				</label>
			</div>
		</div>
	</section>
	
	<section>
		<div class="row">
			<div class="small-12 columns">
				<h2>Message</h2>
			</div>
		</div>
		
		<div class="row">
			<div class="small-12 medium-6 columns">
				<label>
					From address
					<input type="text" name="from" id="from" value="<%= lclT.getTournamentDirectorContact().getEmailAddress("") %>" />
				</label>
			</div>
			<div class="small-12 medium-6 columns">
				<label>
					From name
					<input type="text" name="from_description" id="from_description" value="<%= lclT.getTournamentDirectorContact().getName() %>" />
				</label>
			</div>
		</div>
		
		<div class="row">
			<div class="small-12 columns">
				<label>
					Subject
					<input type="text" name="subject" id="subject" />
				</label>
			</div>
		</div>
		
		<div class="row">
			<div class="small-12 columns">
				<label>
					Body
					<textarea rows="8" name="body" id="body"></textarea>
				</label>
			</div>
		</div>
		
		<div class="row">
			<div class="small-12 columns">
				<input type="submit" value="Send" />
			</div>
		</div>
	</section>
</form>

<script>
	function setCheckedState(argDivWhoseChildrenToCheck, argState) {
		var lclToCheck = document.querySelectorAll('#' + argDivWhoseChildrenToCheck + ' input[type=checkbox]');
		for (var lclI = 0; lclI < lclToCheck.length; ++lclI) {
			var lclCheckbox = lclToCheck[lclI]
			if (!lclCheckbox.disabled) {
				lclCheckbox.checked = argState;
			}
		}
	}
</script>

<jsp:include page="/template/footer.jsp" />