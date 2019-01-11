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
	<jsp:param name="pageTitle" value="Message staff" />
	<jsp:param name="topMenu" value="<%= Menus.tournamentAdmin(lclT).asTopLevel().output(request, \"message-\" + lclT.getUniqueString()) %>" />
	<jsp:param name="h1" value="Message staff" />
</jsp:include>

<style type="text/css">
	.checkbuttons a {
		margin-left: 1rem;
		margin-bottom: 0.5rem;
	}
	
	.message-entry {
		line-height: 1.25rem;
	}
	
	.message-entry label {
		padding: 0.5rem;
		line-height: inherit;
	}
	
	.message-entry label input[type=checkbox] {
		margin-bottom: 0;
		line-height: inherit;
	}
</style>

<form action="BulkMessage" method="post">
	<input type="hidden" name="tournament_code" value="<%= lclT.getCode() %>" />
	
	<div class="row">
		<div class="small-12 columns">
			<p>Which staff do you wish to message? (Only staff with accounts are shown.)</p>
		</div>
	</div><%
	
	List<Staff> lclNonTeamStaff = new ArrayList<>();
	List<Staff> lclTeamStaff = new ArrayList<>();
	
	for (Staff lclS : lclT.getStaffSet()) {
		if (lclS.getContact().getAccount() != null) {
			if (lclS.getSchoolRegistration() == null) {
				lclNonTeamStaff.add(lclS);
			} else {
				lclTeamStaff.add(lclS);
			}
		}
	}
	
	if (lclTeamStaff.isEmpty() == false) {
		lclTeamStaff.sort(Staff.NameComparator.getInstance());
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
					Contact lclC = lclS.getContact();
					%><div class="small-12 medium-6 large-4 columns email-entry">
						<label><input type="checkbox" name="account_id" value="<%= lclC.getAccount().getId() %>" id="teamstaff_to_<%= lclC.getAccount().getId() %>" />&nbsp;<%= lclC.getName() %> (<%= lclS.getSchoolRegistration().getSchool().getShortName() %>)</label>
					</div><%
				}
			%></div>
		</section><%
	}
	
	if (lclNonTeamStaff.isEmpty() == false) {
		lclNonTeamStaff.sort(Staff.NameComparator.getInstance());
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
					Contact lclC = lclS.getContact();
					%><div class="small-12 medium-6 large-4 columns email-entry">
						<label><input type="checkbox" name="account_id" value="<%= lclC.getAccount().getId() %>" id="teamstaff_to_<%= lclC.getAccount().getId() %>" />&nbsp;<%= lclC.getName() %></label>
					</div><%
				}
			%></div>
		</section><%
	}
	
	%><section>
		<div class="row">
			<div class="small-12 columns">
				<h2>Message</h2>
			</div>
		</div>
		
		<div class="row">
			<div class="small-12 columns">
				<textarea rows="3" name="message" id="message"></textarea>
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