<%@ page import="java.util.Comparator" %>
<%@ page import="java.util.Arrays" %>
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
	<jsp:param name="pageTitle" value="Questions" />
	<jsp:param name="topMenu" value="<%= Menus.tournamentAdmin(lclT).asTopLevel().output(request, \"questions-\" + lclT.getUniqueString()) %>" />
	<jsp:param name="h1" value="Questions" />
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
					<th>Category</th>
					<th><span title="Typically the answer to the question. Could be something longer, like 'France from opera clues'.">Description</span></th>
					<th>Used&nbsp;in</th>
					<th>Note</th>
					<th>Edit</th>
					<th>Delete?</th>
				</tr>
			</thead>
			<tbody><%
				List<OpalForm<Question>> lclQOFs = lclOF.children(
					"Question",
					QuestionFactory.getInstance(),
					1, // row for a new question
					Question.CATEGORY_COMPARATOR
				);
				
				for (OpalForm<Question> lclQOF : lclQOFs) {
					Question lclQ = lclQOF.getUserFacing();
					%><tr>
						<%= lclQOF.open() %>
						<td><%= lclQOF.dropdown("Category", Comparator.<Category>naturalOrder()) %></td>
						<td><%= lclQOF.text("Description", 20) %></td>
						<td><%
							if (lclQ == null) {
								%>&nbsp;<%
							} else {
								Placement[] lclPLs = lclQOF.getUserFacing().createPlacementArray();
								Arrays.sort(lclPLs);
								for (Placement lclPL : lclPLs) {
									%><%= lclPL.getString() %><br /><%
								}
							}
						%></td>
						<td><%= lclQOF.textarea("Note", 60, 1) %></td>
						<td><%= lclQOF.isNew() ? "&nbsp;" : "<a href=\"question-edit.jsp?question_id=" + lclQ.getId() + "\">Edit</a>" %></td>
						<td><%= HTMLUtility.deleteWidget(lclQOF) %></td>
						<%= lclQOF.close() %>
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