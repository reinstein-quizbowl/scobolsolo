<%@ page import="java.util.List" %>
<%@ page import="com.opal.cma.OpalForm" %>
<%@ page import="com.opal.cma.OpalMainForm" %>
<%@ page import="com.scobolsolo.application.*" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
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
	<jsp:param name="pageTitle" value="Packets" />
	<jsp:param name="topMenu" value="<%= Menus.tournamentAdmin(lclT).asTopLevel().output(request, \"packets-\" + lclT.getUniqueString()) %>" />
	<jsp:param name="h1" value="Packets" />
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
		<table class="responsive">
			<thead>
				<tr>
					<th>Name</th>
					<th>Short name</th>
					<th>Round</th>
					<th>Replacements from</th>
					<th><span title="May question-specific details be shown publicly?">Released?</span></th>
					<th>Note</th>
					<th><abbr title="Sequence">Seq</abbr></th>
					<th>Edit</th>
					<th>Delete?</th>
				</tr>
			</thead>
			<tbody><%
				List<OpalForm<Packet>> lclPOFs = lclOF.children(
					"Packet",
					PacketFactory.getInstance(),
					1, // row for a new packet
					Packet.StandardComparator.getInstance()
				);
				
				for (OpalForm<Packet> lclPOF : lclPOFs) {
					Packet lclP = lclPOF.getUserFacing();
					
					%><tr>
						<%= lclPOF.open() %>
						<td data-tablesorter="<%= lclP == null ? "" : lclP.getName() %>"><%= lclPOF.text("Name", 20) %></td>
						<td data-tablesorter="<%= lclP == null ? "" : lclP.getShortName() %>"><%= lclPOF.text("ShortName", 10) %></td>
						<td data-tablesorter="<%= lclP == null || lclP.getRound() == null ? "" : lclP.getRound().getName() %>"><%= lclPOF.dropdown("Round", Round.StandardComparator.getInstance()).filter(argR -> argR.getTournament() == lclT).namer(Round::getShortName) %></td>
						<td data-tablesorter="<%= lclP == null || lclP.getReplacementPacket() == null ? "" : lclP.getReplacementPacket().getName() %>"><%= lclPOF.dropdown("ReplacementPacket", Packet.StandardComparator.getInstance()).filter(argP -> argP.getTournament() == lclT).namer(Packet::getShortName) %></td>
						<td data-tablesorter="<%= lclP == null ? 0 : (lclP.isQuestionsPublic() ? 1 : 0) %>"><%= HTMLUtility.switchWidget(lclPOF, "QuestionsPublic") %></td>
						<td><%= lclPOF.textarea("Note", 60, 1) %></td>
						<td data-tablesorter="<%= lclP == null ? "" : lclP.getSequence() %>"><%= lclPOF.text("Sequence", 2) %></td>
						<td><%= lclP == null ? "&nbsp;" : "<a href=\"packet-edit.jsp?packet_id=" + lclP.getId() + "\">Edit</a>" %></td>
						<td><%= HTMLUtility.deleteWidget(lclPOF) %></td>
						<%= lclPOF.close() %>
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