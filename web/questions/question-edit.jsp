<%@ page import="java.util.Comparator" %>
<%@ page import="java.util.List" %>
<%@ page import="com.opal.DatabaseQuery" %>
<%@ page import="com.opal.ImplicitTableDatabaseQuery" %>
<%@ page import="com.opal.cma.OpalForm" %>
<%@ page import="com.opal.cma.OpalMainForm" %>
<%@ page import="com.scobolsolo.application.*" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.opalforms.updater.QuestionUpdater" %>
<%@ page import="com.scobolsolo.HTMLUtility" %>

<%
OpalMainForm<Question> lclOF = OpalForm.create(
	session,
	request,
	"/OpalFormController",
	QuestionFactory.getInstance(),
	"question_id"
);
lclOF.setUpdaterClass(QuestionUpdater.class);
lclOF.setDeleteURI("/delete-confirmation.jsp?class_name=question");
Question lclQ = lclOF.getUserFacing();

Account lclUser = Account.demand(request);
if (!lclUser.isAdministrator()) {
	lclOF.disable("Writer");
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
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="<%= lclTitle %>" />
	<jsp:param name="pageDescription" value="<%= lclTitle %>" />
	<jsp:param name="topMenu" value="<%= Menus.QUESTIONS().asTopLevel().output(request, \"edit\") %>" />
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
	<div class="small-12 medium-6 large-3 columns">
		<label>
			Description
			<%= lclOF.text("Description", 30) %>
		</label>
	</div>
	<div class="small-12 medium-6 large-3 columns">
		<label>
			Category
			<%= lclOF.<Category>dropdown("Category") %>
		</label>
	</div>
	<div class="small-12 medium-6 large-3 columns">
		<label>
			Writer
			<%= lclOF.dropdown("Writer", Account.NameComparator.getInstance()).filter(Account::isWriter) %>
		</label>
	</div>
	<div class="small-12 medium-6 large-3 columns">
		<label>
			Status
			<%= lclOF.<QuestionStatus>dropdown("Status").filter(new Question.StatusFilter(lclUser, lclQ)) %>
		</label>
	</div>
</div>

<div class="row">
	<div class="small-12 columns">
		<label>
			Text
			<%= lclOF.textarea("Text", 80, 5) %>
		</label>
	</div>
	<div class="small-12 columns">
		<label>
			Answer
			<%= lclOF.textarea("Answer", 80, 2) %>
		</label>
	</div>
	<div class="small-12 columns">
		<label>
			<span title="This note sticks with the question.">Question Note</span>
			<%= lclOF.textarea("Note", 80, 2) %>
		</label>
	</div>
	<!-- <div class="small-12 columns">
		<label>
			<span title="This note is associated with the particular revision to the question you are making.">Edit Remark</span>
			<%= false ? lclOF.getPriorInput().text("/DiffRemark", 60) : "" %>
		</label>
	</div> -->
</div>

<div class="row">
	<div class="small-12 columns">
		<%= lclOF.submit() %> <%= lclUser.isAdministrator() ? lclOF.delete("Delete") : "" %> <%= lclOF.cancel() %>
	</div>
</div>

<%= lclOF.close() %><%

if (lclOF.alreadyExists()) {
	%><div class="row">
		<div class="small-12 columns">
			<h2><%= lclQ.getPlacementCount() == 1 ? "Placement" : "Placements (" + lclQ.getPlacementCount() + ")" %></h2>
			<table class="responsive">
				<thead>
					<tr>
						<th>Packet</th>
						<th>Number</th>
						<th>Score check after?</th>
						<th>Tiebreaker?</th>
					</tr>
				</thead>
				<tbody><%
					for (Placement lclPL : lclQ.createPlacementArray()) {
						%><tr>
							<td><%= lclPL.getPacket().getShortNameWithTournament() %></td>
							<td><%= lclPL.getNumber() %></td>
							<td><%= lclPL.isScorecheckAfter() ? "<i class=\"fa fa-check\"></i>" : "-" %></td>
							<td><%= lclPL.isTiebreaker() ? "<i class=\"fa fa-check\"></i>" : "-" %></td>
						</tr><%
					}
				%></tbody>
			</table>
		</div>
	</div><%
}

if (lclOF.alreadyExists() && lclQ.getText() != null && lclQ.getAnswer() != null) {
	%><div class="row">
		<div class="small-12 columns">
			<h2>Rendered</h2>
			<p class="question-text"><%= lclQ.outputTextHTML(Question.SHOW_PRONUNCIATION_GUIDES) %></p>
			<p class="question-answer"><%= lclQ.outputAnswerHTML(true) %></p>
		</div>
	</div><%
}
%>

<jsp:include page="/template/footer.jsp" />
