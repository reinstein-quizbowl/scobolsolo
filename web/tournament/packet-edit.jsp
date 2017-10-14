<%@ page import="java.util.Comparator" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="org.apache.commons.lang3.Validate" %>
<%@ page import="com.opal.ImplicitTableDatabaseQuery" %>
<%@ page import="com.opal.cma.OpalForm" %>
<%@ page import="com.opal.cma.OpalMainForm" %>
<%@ page import="com.scobolsolo.application.Account" %>
<%@ page import="com.scobolsolo.application.Category" %>
<%@ page import="com.scobolsolo.application.Packet" %>
<%@ page import="com.scobolsolo.application.PacketFactory" %>
<%@ page import="com.scobolsolo.application.Placement" %>
<%@ page import="com.scobolsolo.application.PlacementFactory" %>
<%@ page import="com.scobolsolo.application.Round" %>
<%@ page import="com.scobolsolo.application.Question" %>
<%@ page import="com.scobolsolo.application.QuestionFactory" %>
<%@ page import="com.scobolsolo.application.Tournament" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.opalforms.specialhandler.QuestionHandler" %>
<%@ page import="com.scobolsolo.opalforms.updater.PlacementUpdater" %>
<%@ page import="com.scobolsolo.HTMLUtility" %>

<%
OpalMainForm<Packet> lclOF = OpalForm.create(
	session,
	request,
	"/OpalFormController",
	PacketFactory.getInstance(),
	"packet_id"
);
Packet lclP = Validate.notNull(lclOF.getUserFacing());
Tournament lclT = lclP.getTournament();
Account lclUser = Account.demand(request);
Validate.isTrue(lclUser.mayManageQuestions(lclT));
lclOF.setDeleteURI("/tournament/cancel-confirmation.jsp?object=" + lclT.getUniqueString() + "&class_name=packet");

String lclTitle = lclP.getName() + " at " + lclT.getName();
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="<%= lclT.getCode() %>" />
	<jsp:param name="pageTitle" value="<%= lclTitle %>" />
	<jsp:param name="pageDescription" value="<%= lclTitle %>" />
	<jsp:param name="topMenu" value="<%= Menus.tournamentAdmin(lclT).asTopLevel().output(request, \"packets-\" + lclT.getUniqueString()) %>" />
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
	<div class="small-12 medium-6 columns">
		<label>
			Name
			<%= lclOF.text("Name", 30) %>
		</label>
	</div>
	<div class="small-12 medium-6 columns">
		<label>
			Short name
			<%= lclOF.text("ShortName", 10) %>
		</label>
	</div>
	
	<div class="small-4 large-5 columns">
		<label>
			Round
			<%= lclOF.<Round>dropdown("Round").filter(argR -> argR.getTournament() == lclT) %>
		</label>
	</div>
	<div class="small-4 large-5 columns">
		<label>
			<span class="hide-for-medium">Replacements</span>
			<span class="show-for-medium">Replacements from</span>
			<%= lclOF.<Packet>dropdown("ReplacementPacket").filter(argP -> argP.getTournament() == lclT) %>
		</label>
	</div>
	<div class="small-4 large-2 columns">
		<label>
			<span class="hide-for-medium">Questions public?</span>
			<span class="show-for-medium">Are questions public?</span>
			<%= HTMLUtility.switchWidget(lclOF, "QuestionsPublic") %>
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
		<h2>Questions (<%= lclP.getPlacementSet().size() %>)</h2>
		<table class="responsive">
			<thead>
				<tr>
					<th>Question</th>
					<th>Number</th>
					<th>Category</th>
					<th>Tiebreaker?</th>
					<th>Score check after?</th>
					<th>Edit</th>
					<th>Remove?</th>
				</tr>
			</thead>
			<tbody><%
				List<OpalForm<Placement>> lclPOFs = lclOF.children(
					"Placement",
					PlacementFactory.getInstance(),
					1 // row for a new placement
				);
				
				for (OpalForm<Placement> lclPLOF : lclPOFs) {
					lclPLOF.setUpdaterClass(PlacementUpdater.class);
					Placement lclPL = lclPLOF.getUserFacing();
					%><tr>
						<%= lclPLOF.open() %>
						<td><%
							if (lclPLOF.isNew()) {
								%><%= lclPLOF.special("Question", 5, QuestionHandler.class) %><%
							} else {
								List<Question> lclCandidates = new ArrayList<>();
								lclCandidates.add(null); // so that we can empty the Placement
								
								if (lclPL.isFilled()) {
									lclCandidates.add(lclPL.getQuestion());
								}
								
								QuestionFactory.getInstance().acquireForQuery(
									lclCandidates,
									new ImplicitTableDatabaseQuery("id IN (SELECT question_id FROM Current_Diff WHERE category_code = ?) AND id NOT IN (SELECT question_id FROM Placement)", lclPL.getCategory().getCode())
								);
								%><%= lclPLOF.dropdown("Question", Question.DescriptionComparator.getInstance()).choices(lclCandidates).namer(Question::getDescriptionSafe) %><%
							}
						%></td>
						<td><%= lclPLOF.number("Number").min(1) %></td>
						<td><%= lclPLOF.<Category>dropdown("Category").filter(argC -> argC.isUsedAt(lclT)) %></td>
						<td><%= HTMLUtility.switchWidget(lclPLOF, "Tiebreaker") %></td>
						<td><%= HTMLUtility.switchWidget(lclPLOF, "ScorecheckAfter") %></td>
						<td><%
							if (lclPLOF.alreadyExists() && lclPL.isFilled()) {
								%><a href="/questions/question-edit.jsp?question_id=<%= lclPLOF.getUserFacing().getQuestion().getId() %>">Edit</a><%
							} else {
								%>&nbsp;<%
							}
						%></td>
						<td><%= HTMLUtility.deleteWidget(lclPLOF) %></td>
						<%= lclPLOF.close() %>
					</tr><%
				}
			%></tbody>
		</table>
	</div>
</div>

<div class="row">
	<div class="small-12 columns">
		<%= lclOF.submit() %> <%= lclOF.delete("Delete") %> <%= lclOF.cancel() %>
	</div>
</div>

<%= lclOF.close() %>

<jsp:include page="/template/footer.jsp" />
