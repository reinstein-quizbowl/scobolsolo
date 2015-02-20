<%@ page import="java.util.List" %>
<%@ page import="com.siliconage.util.Filter" %>
<%@ page import="com.opal.DatabaseQuery" %>
<%@ page import="com.opal.ImplicitTableDatabaseQuery" %>
<%@ page import="com.opal.cma.OpalForm" %>
<%@ page import="com.opal.cma.OpalMainForm" %>
<%@ page import="com.scobolsolo.application.*" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.opalforms.filter.CategoryUsedAtTournament" %>
<%@ page import="com.scobolsolo.opalforms.filter.PacketForTournament" %>
<%@ page import="com.scobolsolo.HTMLUtility" %>

<%
OpalMainForm<Question> lclOF = OpalForm.create(
	session,
	request,
	"/OpalFormController",
	QuestionFactory.getInstance(),
	"question_id"
);
Question lclQ = lclOF.getUserFacing();
Tournament lclT = lclOF.isNew() ? null : lclQ.getTournament();

if (lclT != null) {
	lclOF.setDeleteURI("cancel-confirmation.jsp?object=" + lclT.getUniqueString() + "&class_name=question");
}

String lclTitle;
if (lclOF.alreadyExists()) {
	if (lclQ.getDescription() == null) {
		lclTitle = "Question";
	} else {
		lclTitle = '"' + lclQ.getDescription() + "\" question";
	}
} else {
	lclTitle = "New question";
}
if (lclT != null) {
	lclTitle += " for " + lclT.getName();
}
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="<%= lclT == null ? null : lclT.getCode() %>" />
	<jsp:param name="pageTitle" value="<%= lclTitle %>" />
	<jsp:param name="pageDescription" value="<%= lclTitle %>" />
	<jsp:param name="topMenu" value="<%= (lclT == null ? Menus.ADMIN() : Menus.tournamentAdmin(lclT)).asTopLevel().output(request, \"questions-\" + (lclT == null ? \"\" : lclT.getUniqueString())) %>" />
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

%><div class="row"><%
	if (lclOF.isNew()) {
		%><div class="small-12 columns">
			<label>
				Tournament
				<%= lclOF.dropdown("Tournament", Tournament.DateComparator.getInstance().reversed()) %>
			</label>
		</div><%
	}
	%><div class="small-12 medium-6 large-3 columns">
		<label>
			Description
			<%= lclOF.text("Description", 30) %>
		</label>
	</div>
	<div class="small-12 medium-6 large-3 columns">
		<label>
			Category
			<%= lclOF.dropdown("Category", Category.StandardComparator.getInstance()).filter(new CategoryUsedAtTournament(lclT)) %>
		</label>
	</div>
	<div class="small-12 large-6 columns">
		<label>
			Note
			<%= lclOF.textarea("Note", 60, 3) %>
		</label>
	</div>
</div><%

if (lclOF.alreadyExists()) {
	%><div class="row">
		<div class="small-12 columns">
			<h2><%= lclQ.getPlacementCount() == 1 ? "Placement" : "Placements (" + lclQ.getPlacementCount() + ")" %></h2>
			<table class="responsive">
				<thead>
					<tr>
						<th>Packet</th>
						<th>Sequence</th>
						<th>Score check after?</th>
						<th>Tiebreaker?</th>
						<th>Remove?</th>
					</tr>
				</thead>
				<tbody><%
					List<OpalForm<Placement>> lclPOFs = lclOF.children(
						"Placement",
						PlacementFactory.getInstance(),
						0, // rows for new placements
						Placement.StandardComparator.getInstance()
					);
					
					Filter<Packet> lclPacketForTournament = new PacketForTournament(lclT);
					
					for (OpalForm<Placement> lclPOF : lclPOFs) {
						Placement lclP = lclPOF.getUserFacing();
						%><tr>
							<%= lclPOF.open() %>
							<td><%= lclPOF.dropdown("Packet", Packet.StandardComparator.getInstance()).filter(lclPacketForTournament) %></td>
							<td><%= lclPOF.text("Sequence", 3) %></td>
							<td><%= HTMLUtility.switchWidget(lclPOF, "ScorecheckAfter") %></td>
							<td><%= HTMLUtility.switchWidget(lclPOF, "Tiebreaker") %></td>
							<td><%= HTMLUtility.deleteWidget(lclPOF) %>
							<%= lclPOF.close() %>
						</tr><%
					}
				%></tbody>
			</table>
		</div>
	</div><%
}

%><div class="row">
	<div class="small-12 columns">
		<%= lclOF.submit() %> <%= lclOF.delete("Delete") %> <%= lclOF.cancel() %>
	</div>
</div>

<%= lclOF.close() %>

<jsp:include page="/template/footer.jsp" />