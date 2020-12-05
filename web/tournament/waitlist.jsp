<%@ page import="java.util.List" %>
<%@ page import="com.opal.cma.OpalForm" %>
<%@ page import="com.opal.cma.OpalMainForm" %>
<%@ page import="com.scobolsolo.application.*" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.opalforms.updater.WaitlistEntryDefaultToEndOfList" %>

<%
Tournament lclT = TournamentFactory.getInstance().fromHttpRequest(request, "object");
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="<%= lclT.getCode() %>" />
	<jsp:param name="pageTitle" value="Waitlist" />
	<jsp:param name="topMenu" value="<%= Menus.tournamentAdmin(lclT).asTopLevel().output(request, \"waitlist-\" + lclT.getUniqueString()) %>" />
	<jsp:param name="h1" value="Waitlist" />
</jsp:include>

<div class="row">
	<div class="small-12 columns"><%
		List<WaitlistEntry> lclWEs = lclT.getWaitlistEntries();
		if (lclWEs.isEmpty()) {
			%><p>There are currently no waitlist entries.</p><%
		} else {
			if (lclWEs.size() > 1) {
				%><p>Drag the rows to rearrange waitlist entries. Your changes will not be saved until you hit the “Save” button <em>at the bottom of this section</em> (not the one for any individual row).</p><%
			}
			
			%><table>
				<thead>
					<tr>
						<th>New&nbsp;position</th>
						<th>School</th>
						<th>Players</th>
						<th>Note</th>
						<th>Saved&nbsp;position</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody id="sortable"><%
					for (WaitlistEntry lclWE : lclWEs) {
						OpalMainForm<WaitlistEntry> lclWEOF = OpalForm.create(session, request, "/OpalFormController", lclWE, WaitlistEntryFactory.getInstance());
						lclWEOF.setContinueURI("/tournament/waitlist.jsp?object=" + lclT.getUniqueString());
						lclWEOF.setDeleteURI("/tournament/waitlist.jsp?object=" + lclT.getUniqueString());
						lclWEOF.setSuccessURI("/tournament/waitlist.jsp?object=" + lclT.getUniqueString());
						
						%><tr>
							<input type="hidden" form="rearrange" class="generated-position-target" name="position-<%= lclWE.getId() %>" id="position-<%= lclWE.getId() %>" />
							<%= lclWEOF.open() %>
							<td class="generated-position">&nbsp;</td>
							<th data-order="<%= lclWE.getSchoolRegistration().getSchool().getName() %>"><a href="school-registration-edit.jsp?school_registration_id=<%= lclWE.getSchoolRegistration().getId() %>"><%= lclWE.getSchoolRegistration().getSchool().getName() %></a></th>
							<td><%= lclWEOF.number("PlayerCount").min(1) %></td>
							<td><%= lclWEOF.text("Note", 40) %></td>
							<td class="saved-position"><%= lclWE.getSequence() %></td>
							<td>
								<%= lclWEOF.submit("Save").style("tiny") %>&nbsp;<%= lclWEOF.delete("Cancel").style("tiny") %></td><%
								
								if (lclWEOF.hasErrors()) {
									%><div>
										<p class="form-error-intro">Error:</p>
										<div class="form-errors"><%= lclWEOF.displayResultOrErrors() %></div>
									</div><%
								}
							%><%= lclWEOF.close() %>
						</tr><%
					}
				%></tbody>
			</table><%
			
			if (lclWEs.size() > 1) {
				%><form action="RearrangeWaitlist" id="rearrange" method="post" onsubmit="javascript:update()">
					<input type="hidden" form="rearrange" name="tournament_code" value="<%= lclT.getCode() %>">
					<div class="submit btn-group btn-group-1">
						<input type="submit" value="Save" />
					</div>
				</form><%
			}
		}
	%></div>
</div>

<div class="row">
	<div class="small-12 columns">
		<h2 id="new">Create a new waitlist entry</h2><%
		OpalMainForm<WaitlistEntry> lclNewWEOF = OpalForm.create(session, request, "/OpalFormController", WaitlistEntryFactory.getInstance());
		lclNewWEOF.setUpdaterClass(WaitlistEntryDefaultToEndOfList.class);
		lclNewWEOF.setContinueURI("/tournament/waitlist.jsp?object=" + lclT.getUniqueString());
		lclNewWEOF.setSuccessURI("/tournament/waitlist.jsp?object=" + lclT.getUniqueString());
		%><%= lclNewWEOF.open() %><%
			if (lclNewWEOF.hasErrors()) {
				%><div class="row columns">
					<p class="form-error-intro">Error:</p>
					<div class="form-errors"><%= lclNewWEOF.displayResultOrErrors() %></div>
				</div><%
			}
			%><div class="row">
				<div class="small-12 medium-6 large-3 columns">
					<label>
						School
						<%= lclNewWEOF.dropdown("SchoolRegistration", SchoolRegistration.SchoolShortNameComparator.getInstance()).filter(argSR -> argSR.getTournament() == lclT).namer(argSR -> argSR.getSchool().getShortName()) %>
					</label>
				</div>
				<div class="small-12 medium-3 large-2 columns">
					<label>
						Players
						<%= lclNewWEOF.text("PlayerCount", 3) %>
					</label>
				</div>
				
				<div class="small-12 medium-3 large-2 columns">
					<label>
						Position
						<%= lclNewWEOF.text("Sequence", 3).style("annotated") %>
						<div class="form-annotation alert-box info">defaults to the end of the list</div>
					</label>
				</div>
				<div class="small-12 medium-6 large-3 columns">
					<label>
						Note
						<%= lclNewWEOF.textarea("Note", 40, 3) %>
					</label>
				</div>
				<div class="small-12 medium-6 large-2 columns">
					<%= lclNewWEOF.submit("Add Entry") %>
				</div>
			</div>
		<%= lclNewWEOF.close() %>
	</div>
</div>

<style type="text/css">
	#sortable {
		counter-reset: generatedposition;
	}
	
	#sortable td {
		cursor: grab;
	}
	
	#sortable a {
		cursor: pointer;
	}
	
	#sortable .generated-position:after {
		content: "\00a0 " counter(generatedposition);
		counter-increment: generatedposition;
	}
</style>

<jsp:include page="/template/footer.jsp">
	<jsp:param name="loadScript" value="reordering.js" />
</jsp:include>
