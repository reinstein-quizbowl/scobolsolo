<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.siliconage.util.Filter" %>
<%@ page import="com.siliconage.util.UnionFilter" %>
<%@ page import="com.siliconage.util.AutoAcceptFilter" %>
<%@ page import="com.opal.cma.OpalForm" %>
<%@ page import="com.opal.cma.OpalMainForm" %>
<%@ page import="com.scobolsolo.application.*" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.opalforms.filter.CategoryUsedAtTournament" %>
<%@ page import="com.scobolsolo.opalforms.filter.PacketForTournament" %>
<%@ page import="com.scobolsolo.opalforms.filter.QuestionUnused" %>
<%@ page import="com.scobolsolo.opalforms.filter.RoundAtTournament" %>
<%@ page import="com.scobolsolo.HTMLUtility" %>

<%
OpalMainForm<Packet> lclOF = OpalForm.create(
	session,
	request,
	"/OpalFormController",
	PacketFactory.getInstance(),
	"packet_id"
);
Packet lclP = lclOF.getUserFacing();
Tournament lclT = lclP.getTournament();
lclOF.setDeleteURI("cancel-confirmation.jsp?object=" + lclT.getUniqueString() + "&class_name=packet");

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
			<%= lclOF.dropdown("Round", Round.StandardComparator.getInstance()).filter(new RoundAtTournament(lclT)) %>
		</label>
	</div>
	<div class="small-4 large-5 columns">
		<label>
			<span class="hide-for-medium-up">Replacements</span>
			<span class="show-for-medium-up">Replacements from</span>
			<%= lclOF.dropdown("ReplacementPacket", Packet.StandardComparator.getInstance()).filter(new PacketForTournament(lclT)) %>
		</label>
	</div>
	<div class="small-4 large-2 columns">
		<label>
			<span class="hide-for-medium-up">Questions public?</span>
			<span class="show-for-medium-up">Are questions public?</span>
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
		<h2>Questions (<%= lclP.getPlacementCount() %>)</h2>
		<table class="responsive">
			<thead>
				<tr>
					<th>Question</th>
					<th>Sequence</th>
					<th>Category</th>
					<th>Description</th>
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
					1, // row for a new placement
					Placement.SequenceComparator.getInstance()
				);
				
				Filter<Category> lclCategoryUsedAtTournament = new CategoryUsedAtTournament(lclT);
				
				for (OpalForm<Placement> lclPOF : lclPOFs) {
					Placement lclPlacement = lclPOF.getUserFacing();
					
					OpalForm<Question> lclQOF = lclPOF.targetForm("Question", QuestionFactory.getInstance());
					Question lclQ = lclQOF.getUserFacing();
					
					Filter<Question> lclQuestionFilter;
					if (lclPOF.alreadyExists() && lclQ != null) {
						lclQuestionFilter = new UnionFilter<>(new AutoAcceptFilter<>(lclQ), QuestionUnused.getInstance());
					} else {
						lclQuestionFilter = QuestionUnused.getInstance();
					}
					
					%><tr>
						<%= lclPOF.open() %>
						<%= lclQOF.open() %>
						<td><%= lclPOF.dropdown("Question", Question.IdComparator.getInstance()).filter(lclQuestionFilter).namer(Question::getDescription) %></td>
						<td><%= lclPOF.text("Sequence", 3) %></td>
						<td><%= lclQOF.dropdown("Category", Category.StandardComparator.getInstance()).filter(lclCategoryUsedAtTournament) %></td>
						<td><%= lclQOF.text("Description", 30) %></td>
						<td><%= HTMLUtility.switchWidget(lclPOF, "Tiebreaker") %></td>
						<td><%= HTMLUtility.switchWidget(lclPOF, "ScorecheckAfter") %></td>
						<td><%
							if (lclPlacement != null && lclQ != null) {
								%><a href="question-edit.jsp?question_id=<%= lclQ.getId() %>">Edit</a><%
							} else {
								%>&nbsp;<%
							}
						%></td>
						<td><%= HTMLUtility.deleteWidget(lclPOF) %></td>
						<%= lclQOF.close() %>
						<%= lclPOF.close() %>
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
