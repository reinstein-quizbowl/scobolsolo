<%@ page import="java.util.List" %>
<%@ page import="com.opal.cma.OpalForm" %>
<%@ page import="com.opal.cma.OpalMainForm" %>
<%@ page import="com.scobolsolo.application.*" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.opalforms.updater.StandbyEntryDefaultToEndOfList" %>

<%
Tournament lclT = TournamentFactory.getInstance().fromHttpRequest(request, "object");
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="<%= lclT.getCode() %>" />
	<jsp:param name="pageTitle" value="Standby" />
	<jsp:param name="topMenu" value="<%= Menus.tournamentAdmin(lclT).asTopLevel().output(request, \"standby-\" + lclT.getUniqueString()) %>" />
	<jsp:param name="h1" value="Standby" />
</jsp:include>

<div class="row">
	<div class="small-12 columns"><%
		List<StandbyEntry> lclSEs = lclT.getStandbyEntries(); // already sorted
		if (lclSEs.isEmpty()) {
			%><p>There are currently no standby entries.</p><%
		} else {
			if (lclSEs.size() > 1) {
				%><p>Drag the rows to rearrange standby entries. Your changes will not be saved until you hit the “Save” button <em>at the bottom of this section</em> (not the one for any individual row).</p><%
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
					for (StandbyEntry lclSE : lclSEs) {
						OpalMainForm<StandbyEntry> lclSEOF = OpalForm.create(session, request, "/OpalFormController", lclSE, StandbyEntryFactory.getInstance());
						lclSEOF.setContinueURI("/tournament/standby.jsp?object=" + lclT.getUniqueString());
						lclSEOF.setDeleteURI("/tournament/standby.jsp?object=" + lclT.getUniqueString());
						lclSEOF.setSuccessURI("/tournament/standby.jsp?object=" + lclT.getUniqueString());
						
						%><tr>
							<input type="hidden" form="rearrange" class="generated-position-target" name="position-<%= lclSE.getId() %>" id="position-<%= lclSE.getId() %>" />
							<%= lclSEOF.open() %>
							<td class="generated-position">&nbsp;</td>
							<td data-order="<%= lclSE.getSchoolRegistration().getSchool().getName() %>"><a href="school-registration-edit.jsp?school_registration_id=<%= lclSE.getSchoolRegistration().getId() %>"><%= lclSE.getSchoolRegistration().getSchool().getName() %></a></td>
							<td><%= lclSEOF.number("PlayerCount").min(1) %></td>
							<td><%= lclSEOF.text("Note", 40) %></td>
							<td class="saved-position"><%= lclSE.getSequence() %></td>
							<td>
								<%= lclSEOF.submit("Save").style("tiny") %>&nbsp;<%= lclSEOF.delete("Cancel").style("tiny") %><%
								
								if (lclSEOF.hasErrors()) {
									%><div>
										<p class="form-error-intro">Error:</p>
										<div class="form-errors"><%= lclSEOF.displayResultOrErrors() %></div>
									</div><%
								}
							%></td>
							<%= lclSEOF.close() %>
						</tr><%
					}
				%></tbody>
			</table><%
			
			if (lclSEs.size() > 1) {
				%><form action="RearrangeStandby" id="rearrange" method="post" onsubmit="javascript:update()">
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
		<h2 id="new">Create a new standby entry</h2><%
		OpalMainForm<StandbyEntry> lclNewSEOF = OpalForm.create(session, request, "/OpalFormController", StandbyEntryFactory.getInstance());
		lclNewSEOF.setUpdaterClass(StandbyEntryDefaultToEndOfList.class);
		lclNewSEOF.setContinueURI("/tournament/standby.jsp?object=" + lclT.getUniqueString());
		lclNewSEOF.setSuccessURI("/tournament/standby.jsp?object=" + lclT.getUniqueString());
		%><%= lclNewSEOF.open() %>
			<div class="row">
				<div class="small-12 medium-6 large-3 columns">
					<label>
						School
						<%= lclNewSEOF.dropdown("SchoolRegistration", SchoolRegistration.SchoolShortNameComparator.getInstance()).filter(argSR -> argSR.getTournament() == lclT).namer(argSR -> argSR.getSchool().getShortName()) %>
					</label>
				</div>
				<div class="small-12 medium-3 large-2 columns">
					<label>
						Players
						<%= lclNewSEOF.text("PlayerCount", 3) %>
					</label>
				</div>
				
				<div class="small-12 medium-3 large-2 columns">
					<label>
						Position
						<%= lclNewSEOF.text("Sequence", 3).style("annotated") %>
						<div class="form-annotation alert-box info">defaults to the end of the list</div>
					</label>
				</div>
				<div class="small-12 medium-6 large-3 columns">
					<label>
						Note
						<%= lclNewSEOF.textarea("Note", 40, 3) %>
					</label>
				</div>
				<div class="small-12 medium-6 large-2 columns button-in-row">
					<%= lclNewSEOF.submit("Add Entry") %>
				</div>
			</div>
		<%= lclNewSEOF.close() %>
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
