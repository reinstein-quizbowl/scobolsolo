<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.time.format.FormatStyle" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.Comparator" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="org.apache.commons.lang3.tuple.Pair" %>
<%@ page import="com.siliconage.util.WebDataFilter" %>
<%@ page import="com.scobolsolo.application.*" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.HTMLUtility" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="Questions" />
	<jsp:param name="topMenu" value="<%= Menus.QUESTIONS().asTopLevel().output(request, \"all\") %>" />
	<jsp:param name="h1" value="Questions" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<table class="responsive">
			<thead>
				<tr>
					<th>ID</th>
					<th>Category</th>
					<th><span title="Typically the answer to the question. Could be something longer, like 'France from opera clues'.">Description</span></th>
					<th>Status</th>
					<th>Preview</th>
					<th>Last Updated</th>
					<th>Used?</th>
				</tr>
			</thead>
			<tbody><%
				List<Question> lclQs = QuestionFactory.getInstance().acquireAll(new ArrayList<>());
				lclQs.sort(Comparator.<Question>comparingInt(argQ -> argQ.isUsed() ? 1 : 0).thenComparing(Question.CATEGORY_COMPARATOR));
				
				DateTimeFormatter lclDTF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
				
				for (Question lclQ : lclQs) {
					%><tr>
						<td><a href="question-edit.jsp?question_id=<%= lclQ.getId() %>"><%= lclQ.getId() %></a></td>
						<td><%= lclQ.getCategory().getName() %></td>
						<td><%= lclQ.getDescription() %></td>
						<td><%= lclQ.getStatus().getName() %></td>
						<td><%
							List<Pair<String, String>> lclPreviews = new ArrayList<>(3);
							if (lclQ.getText() != null) {
								lclPreviews.add(Pair.of("Text", lclQ.getText()));
							}
							if (lclQ.getAnswer() != null) {
								lclPreviews.add(Pair.of("Answer", lclQ.getAnswer()));
							}
							if (lclQ.getNote() != null) {
								lclPreviews.add(Pair.of("Note", lclQ.getNote()));
							}
							
							if (lclPreviews.isEmpty()) {
								%>&nbsp;<%
							} else {
								Iterator<Pair<String, String>> lclPreviewI = lclPreviews.iterator();
								while (lclPreviewI.hasNext()) {
									Pair<String, String> lclPair = lclPreviewI.next();
									String lclLabel = lclPair.getLeft();
									String lclFull = lclPair.getRight();
									%><span title="<%= WebDataFilter.scrub(lclFull) %>"><%= lclLabel %></span><%
									
									if (lclPreviewI.hasNext()) {
										%>&nbsp;/&nbsp;<%
									}
								}
							}
						%></td>
						<td><%
							Diff lclLastChange = lclQ.getLastChange();
							if (lclLastChange == null) {
								%>&nbsp;<%
							} else {
								%><%= lclDTF.format(lclLastChange.getTimestamp()) %> by <%= lclLastChange.getEditor().getName() %><%
							}
						%></td>
						<td><%
							if (lclQ.getPlacementCount() == 0) {
								%>-<%
							} else {
								List<Placement> lclPLs = lclQ.acquirePlacement(new ArrayList<>(lclQ.getPlacementCount()));
								lclPLs.sort(null);
								for (Placement lclPL : lclPLs) {
									%><%= lclPL.getTournament().getShortName() %>: <%= lclPL.getString() %><br /><%
								}
							}
						%></td>
					</tr><%
				}
			%></tbody>
		</table>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
