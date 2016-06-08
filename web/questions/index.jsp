<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.time.format.FormatStyle" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.Comparator" %>
<%@ page import="java.util.Collection" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Set" %>
<%@ page import="java.util.HashSet" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.stream.Collectors" %>
<%@ page import="org.apache.commons.lang3.Validate" %>
<%@ page import="org.apache.commons.lang3.tuple.Pair" %>
<%@ page import="com.google.common.collect.ListMultimap" %>
<%@ page import="com.google.common.collect.ArrayListMultimap" %>
<%@ page import="com.siliconage.util.WebDataFilter" %>
<%@ page import="com.opal.ImplicitTableDatabaseQuery" %>
<%@ page import="com.scobolsolo.application.Category" %>
<%@ page import="com.scobolsolo.application.Diff" %>
<%@ page import="com.scobolsolo.application.Placement" %>
<%@ page import="com.scobolsolo.application.Question" %>
<%@ page import="com.scobolsolo.application.QuestionFactory" %>
<%@ page import="com.scobolsolo.application.Tournament" %>
<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.HTMLUtility" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="Questions" />
	<jsp:param name="topMenu" value="<%= Menus.QUESTIONS().asTopLevel().output(request, \"all\") %>" />
	<jsp:param name="h1" value="Questions" />
</jsp:include><%

Collection<Tournament> lclSelectedTournamentsFromRequest = Validate.notNull(TournamentFactory.getInstance().multipleFromHttpRequest(request));
boolean lclShowUnused = request.getParameter("unused") == null || Boolean.parseBoolean(request.getParameter("unused")); // i.e., if there is no parameter for this, default to true

Set<Tournament> lclSelectedTournaments = new HashSet<>(lclSelectedTournamentsFromRequest);
if (lclSelectedTournaments.isEmpty()) {
	TournamentFactory.getInstance().acquireForQuery(lclSelectedTournaments, new ImplicitTableDatabaseQuery("date > NOW()"));
}

%><form action="index.jsp" method="get">
	<div class="row">
		<div class="small-12 medium-4 large-2 columns">
			<label>Include&nbsp;questions&hellip;</label>
		</div><%
		List<Tournament> lclTs = TournamentFactory.getInstance().streamAll()
			.filter(argT -> argT.getPacketCount() > 0)
			.sorted()
			.collect(Collectors.toList());
		
		for (Tournament lclT : lclTs) {
			%><div class="small-6 medium-4 large-2 columns">
				<label>
					<input type="checkbox" name="tournament_code" value="<%= lclT.getCode() %>"<%= lclSelectedTournaments.contains(lclT) ? " checked=\"checked\"" : "" %>>&nbsp;used in <%= lclT.getShortName() %></label>
				</label>
			</div><%
		}
		
		%><div class="small-6 medium-4 large-2 columns">
			<label>
				<input type="checkbox" name="unused" value="<%= HTMLUtility.DEFAULT_TRUE_STRING %>"<%= lclShowUnused ? " checked=\"checked\"" : "" %> />&nbsp;that&nbsp;are&nbsp;unused
			</label>
		</div>
		
		<div class="small-6 medium-4 large-2 columns">
			<input type="submit" class="tiny" value="Reload" />
		</div>
	</div>
</div><%


List<Question> lclQs = QuestionFactory.getInstance().streamAll()
	.filter(argQ -> argQ.isUnused() ? lclShowUnused : argQ.streamPlacement().anyMatch(argPL -> lclSelectedTournaments.contains(argPL.getTournament())))
	.sorted(Comparator.<Question>comparingInt(argQ -> argQ.isUsed() ? 1 : 0).thenComparing(Question.CATEGORY_COMPARATOR))
	.collect(Collectors.toList());

Map<Tournament, ListMultimap<Category, Question>> lclUsed = new HashMap<>(lclSelectedTournaments.size());
ListMultimap<Category, Question> lclUnused = ArrayListMultimap.create();
for (Question lclQ : lclQs) {
	if (lclQ.isUsed()) {
		for (Placement lclPL : lclQ.createPlacementArray()) {
			if (!lclUsed.containsKey(lclPL.getTournament())) {
				lclUsed.put(lclPL.getTournament(), ArrayListMultimap.create());
			}
			lclUsed.get(lclPL.getTournament()).put(lclQ.getCategory(), lclQ);
		}
	} else {
		lclUnused.put(lclQ.getCategory(), lclQ);
	}
}

if (lclShowUnused) {
	%><div class="row">
		<div class="small-12 columns">
			<h2>
				<a onclick="$('#unused').toggle('slow'); flipIcon(this)" class="fa fa-compress"></a>
				Unused (<%= lclUnused.size() %>)
			</h2>
			<div id="unused"><%= outputTables(null, lclUnused) %></div>
		</div>
	</div><%
}

for (Tournament lclT : lclSelectedTournaments) {
	if (lclUsed.containsKey(lclT)) {
		%><div class="row">
			<div class="small-12 columns">
				<h2>
					<a onclick="$('#<%= lclT.getCode() %>').toggle('slow'); flipIcon(this)" class="fa fa-compress"></a>
					<%= lclT.getName() %> (<%= lclUsed.get(lclT).size() %>)
				</h2>
				<div id="<%= lclT.getCode() %>"><%= outputTables(lclT, lclUsed.get(lclT)) %></div>
			</div>
		</div><%
	}
}
%>

<script type="text/javascript">
	function flipIcon(argElement) {
		if (argElement.className == "fa fa-compress") {
			argElement.className = "fa fa-expand";
		} else if (argElement.className == "fa fa-expand") {
			argElement.className = "fa fa-compress";
		}
	}
</script>

<jsp:include page="/template/footer.jsp" />
<%!
String outputTables(Tournament argT, ListMultimap<Category, Question> argCategorizedQuestions) {
	// argT may be null; this indicates unused questions
	Validate.notNull(argCategorizedQuestions);
	
	if (argCategorizedQuestions.isEmpty()) {
		return "<p>[no questions]</p>";
	} else {
		StringBuilder lclSB = new StringBuilder();
		List<Category> lclCategories = new ArrayList<>(argCategorizedQuestions.keySet());
		lclCategories.sort(null);
		
		for (Category lclC : lclCategories) {
			String lclTableId = argT == null ? "unused_" + lclC.getCode() : argT.getCode() + '_' + lclC.getCode();
			String lclCollapseToggleLinkId = "collapse_toggle_" + lclTableId;
			
			lclSB.append("<h3><a onclick=\"$('#" + lclTableId + "').toggle('slow'); flipIcon(this)\" class=\"fa fa-compress\"></a> " + lclC.getName() + " (" + argCategorizedQuestions.get(lclC).size() + ")</h3>")
			.append("<table id=\"" + lclTableId + "\" class=\"responsive full-width\">")
				.append("<thead>")
					.append("<tr>")
						.append("<th>ID</th>")
						.append("<th><span title=\"Typically the answer to the question. Could be something longer, like 'France from opera clues'.\">Description</span></th>")
						.append("<th>Status</th>")
						.append("<th>Preview</th>")
						.append("<th>Last Updated</th>")
						.append("<th>Packet</th>")
					.append("</tr>")
				.append("</thead>")
				.append("<tbody>");
				
				List<Question> lclQs = argCategorizedQuestions.get(lclC);
				if (argT != null) {
					lclQs = lclQs.stream()
						.map(argQ -> argQ.findPlacement(argT))
						.sorted()
						.map(Placement::getQuestion)
						.collect(Collectors.toList()); // This is pretty inelegant. The goal is to get the questions into the order they're actually used at the tournament (if any), but is there a better way?
				}
				
				for (Question lclQ : lclQs) {
					lclSB.append("<tr>")
							.append("<td><a href=\"question-edit.jsp?question_id=" + lclQ.getId() + "\">" + lclQ.getId() + "</a></td>")
							.append("<td>" + lclQ.getDescription() + "</td>")
							.append("<td>" + lclQ.getStatus().getName() + "</td>");
							
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
								lclSB.append("<td>&nbsp;</td>");
							} else {
								lclSB.append("<td>");
								Iterator<Pair<String, String>> lclPreviewI = lclPreviews.iterator();
								while (lclPreviewI.hasNext()) {
									Pair<String, String> lclPair = lclPreviewI.next();
									String lclLabel = lclPair.getLeft();
									String lclFull = lclPair.getRight();
									lclSB.append("<span title=\"" + WebDataFilter.scrubForHTMLDisplay(lclFull) + "\">" + lclLabel + "</span>");
									
									if (lclPreviewI.hasNext()) {
										lclSB.append("&nbsp;/&nbsp;");
									}
								}
								lclSB.append("</td>");
							}
							
							Diff lclLastChange = lclQ.getLastChange();
							if (lclLastChange == null) {
								lclSB.append("<td>&nbsp;</td>");
							} else {
								lclSB.append("<td>" + DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).format(lclLastChange.getTimestamp()) + " by " + lclLastChange.getEditor().getName() + "</td>");
							}
							
							if (argT == null) {
								lclSB.append("<td>&nbsp;</td>");
							} else {
								Placement lclPL = Validate.notNull(lclQ.findPlacement(argT));
								lclSB.append("<td>" + lclPL.getString() + "</td>");
							}
					lclSB.append("</tr>");
				}
				lclSB.append("</tbody>")
			.append("</table>");
		}
		
		return lclSB.toString();
	}
}
%>