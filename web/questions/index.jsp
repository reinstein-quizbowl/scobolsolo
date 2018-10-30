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
<%@ page import="org.apache.commons.lang3.StringUtils" %>
<%@ page import="org.apache.commons.lang3.Validate" %>
<%@ page import="org.apache.commons.lang3.tuple.Pair" %>
<%@ page import="com.google.common.collect.Multimaps" %>
<%@ page import="com.google.common.collect.ListMultimap" %>
<%@ page import="com.siliconage.util.WebDataFilter" %>
<%@ page import="com.opal.DatabaseQuery" %>
<%@ page import="com.opal.ImplicitTableDatabaseQuery" %>
<%@ page import="com.scobolsolo.application.Category" %>
<%@ page import="com.scobolsolo.application.Diff" %>
<%@ page import="com.scobolsolo.application.Placement" %>
<%@ page import="com.scobolsolo.application.PlacementFactory" %>
<%@ page import="com.scobolsolo.application.Question" %>
<%@ page import="com.scobolsolo.application.QuestionFactory" %>
<%@ page import="com.scobolsolo.application.Tournament" %>
<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.HTMLUtility" %>
<%@ page import="com.scobolsolo.Utility" %>

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
		List<Tournament> lclTs = TournamentFactory.getInstance().getAll().stream()
			.filter(argT -> argT.getPacketSet().isEmpty() == false)
			.sorted()
			.collect(Collectors.toList());
		
		for (Tournament lclT : lclTs) {
			%><div class="small-6 medium-4 large-2 columns">
				<label>
					<input type="checkbox" name="tournament_code" value="<%= lclT.getCode() %>"<%= lclSelectedTournaments.contains(lclT) ? " checked=\"checked\"" : "" %>>&nbsp;used in <%= lclT.getShortName() %>
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
	
	if (lclShowUnused) {
		List<Question> lclUnused = QuestionFactory.getInstance().acquireForQuery(
			new ArrayList<>(),
			new ImplicitTableDatabaseQuery("id NOT IN (SELECT question_id FROM Placement WHERE question_id IS NOT NULL)")
		);
		lclUnused.sort(Question.CATEGORY_COMPARATOR);
		
		%><div class="row">
			<div class="small-12 columns">
				<h2>
					<a onclick="$('#unused').toggle('slow'); flipIcon(this)" class="fa fa-compress"></a>
					Unused (<%= lclUnused.size() %>)
				</h2>
				<div id="unused"><%= outputUnusedQuestionTables(Multimaps.index(lclUnused, Question::getCategory)) %></div>
			</div>
		</div><%
	}
	
	for (Tournament lclT : lclSelectedTournaments) {
		// In principle, this will run n queries for n selected tournaments (plus the one query for unused questions, if applicable).  This is inefficient and not really necessary, but it makes the code cleaner and it's pretty unusual to use this page with multiple selected tournaments.
		List<Placement> lclPLs = PlacementFactory.getInstance().acquireForQuery(
			new ArrayList<>(),
			new DatabaseQuery("SELECT PL.* FROM Placement PL JOIN Packet P ON PL.packet_id = P.id WHERE PL.question_id IS NOT NULL AND P.tournament_code = ?", lclT.getCode())
		);
		lclPLs.sort(null);
		
		%><div class="row">
			<div class="small-12 columns"><%
				if (lclPLs.isEmpty()) {
					%><h2><%= lclT.getName() %>: No Questions</h2><%
				} else {
					%><h2>
						<a onclick="$('#<%= lclT.getCode() %>').toggle('slow'); flipIcon(this)" class="fa fa-compress"></a>
						<%= lclT.getName() %> (<%= lclPLs.size() %>)
					</h2>
					<div id="<%= lclT.getCode() %>"><%= outputTournamentCategoryTables(lclT, Multimaps.index(lclPLs, Placement::getCategory)) %></div><%
				}
			%></div>
		</div><%
	}
%></form>

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
String outputUnusedQuestionTables(ListMultimap<Category, Question> argMM) {
	// argT may be null; this indicates unused questions
	Validate.notNull(argMM);
	
	if (argMM.isEmpty()) {
		return "<p>[no questions]</p>";
	} else {
		StringBuilder lclSB = new StringBuilder();
		List<Category> lclCategories = new ArrayList<>(argMM.keySet());
		lclCategories.sort(null);
		
		for (Category lclC : lclCategories) {
			appendBeginning(lclSB, null, lclC, argMM.get(lclC).size());
			appendUnusedQuestionRows(lclSB, argMM.get(lclC));
			lclSB.append("</tbody></table>");
		}
		
		return lclSB.toString();
	}
}

String outputTournamentCategoryTables(Tournament argT, ListMultimap<Category, Placement> argMM) {
	Validate.notNull(argT);
	Validate.notNull(argMM);
	
	if (argMM.isEmpty()) {
		return "<p>[no questions]</p>";
	} else {
		StringBuilder lclSB = new StringBuilder();
		List<Category> lclCategories = new ArrayList<>(argMM.keySet());
		lclCategories.sort(null);
		
		for (Category lclC : lclCategories) {
			appendBeginning(lclSB, argT, lclC, argMM.get(lclC).size());
			appendPlacedQuestionRows(lclSB, argMM.get(lclC));
			lclSB.append("</tbody></table>");
		}
		
		return lclSB.toString();
	}
}

void appendBeginning(StringBuilder argSB, Tournament argT, Category argCat, int argCount) {
	Validate.notNull(argSB);
	// argT may be null, which indicates unused questions
	Validate.notNull(argCat);
	
	String lclTableId = argT == null ? "unused_" + argCat.getCode() : argT.getCode() + '_' + argCat.getCode();
	String lclCollapseToggleLinkId = "collapse_toggle_" + lclTableId;
	
	argSB.append("<h3><a onclick=\"$('#").append(lclTableId).append("').toggle('slow'); flipIcon(this)\" class=\"fa fa-compress\"></a> ").append(argCat.getName()).append(" (").append(argCount).append(")</h3>")
	.append("<table id=\"").append(lclTableId).append("\">")
		.append("<thead>")
			.append("<tr>")
				.append("<th>ID</th>")
				.append("<th><span title=\"Typically the answer to the question. Could be something longer, like 'France from opera clues'.\">Description</span></th>")
				.append("<th>Status</th>")
				.append("<th>Preview</th>")
				.append("<th>Last Updated</th>")
				.append(argT == null ? "" : "<th>Packet</th>")
			.append("</tr>")
		.append("</thead>")
		.append("<tbody>");
}

void appendUnusedQuestionRows(StringBuilder argSB, List<Question> argQs) {
	Validate.notNull(argSB);
	Validate.notEmpty(argQs);
	
	for (Question lclQ : argQs) {
		appendRow(argSB, lclQ);
	}
}

void appendPlacedQuestionRows(StringBuilder argSB, List<Placement> argPLs) {
	Validate.notNull(argSB);
	Validate.notEmpty(argPLs);
	
	for (Placement lclPL : argPLs) {
		appendRow(argSB, lclPL);
	}
}

void appendRow(StringBuilder argSB, Question argQ) {
	Validate.notNull(argSB);
	Validate.notNull(argQ);
	
	argSB.append("<tr>");
	appendQuestionData(argSB, argQ);
	argSB.append("</tr>");
}

void appendRow(StringBuilder argSB, Placement argPL) {
	Validate.notNull(argSB);
	Validate.notNull(argPL);
	Validate.isTrue(argPL.isFilled());
	
	Question lclQ = argPL.getQuestion();
	
	argSB.append("<tr>");
	appendQuestionData(argSB, lclQ);
	argSB.append("<td>").append(argPL.getString()).append("</td>");
	argSB.append("</tr>");
}

void appendQuestionData(StringBuilder argSB, Question argQ) {
	Validate.notNull(argSB);
	Validate.notNull(argQ);
	
	argSB.append("<td><a href=\"question-edit.jsp?question_id=").append(argQ.getId()).append("\">").append(argQ.getId()).append("</a></td>")
	.append("<td>").append(argQ.getDescription()).append("</td>")
	.append("<td>").append(argQ.getStatus().getName()).append("</td>");
	
	List<Pair<String, String>> lclPreviews = new ArrayList<>(2);
	if (StringUtils.isNotBlank(argQ.getAnswer())) {
		lclPreviews.add(Pair.of("Answer", argQ.getAnswer()));
	}
	if (StringUtils.isNotBlank(argQ.getNote())) {
		lclPreviews.add(Pair.of("Note", argQ.getNote()));
	}
	
	if (lclPreviews.isEmpty()) {
		argSB.append("<td>&nbsp;</td>");
	} else {
		argSB.append("<td>");
		Iterator<Pair<String, String>> lclPreviewI = lclPreviews.iterator();
		while (lclPreviewI.hasNext()) {
			Pair<String, String> lclPair = lclPreviewI.next();
			String lclLabel = lclPair.getLeft();
			String lclFull = lclPair.getRight();
			argSB.append("<span title=\"").append(WebDataFilter.scrub(lclFull)).append("\">").append(lclLabel).append("</span>");
			
			if (lclPreviewI.hasNext()) {
				argSB.append("&nbsp;/&nbsp;");
			}
		}
		argSB.append("</td>");
	}
	
	Diff lclLastChange = argQ.getCurrentDiff();
	if (lclLastChange == null) {
		argSB.append("<td>&nbsp;</td>");
	} else {
		argSB.append("<td>").append(lclLastChange.getTimestamp() == null ? "&nbsp;" : DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).format(lclLastChange.getTimestamp())).append(" by ").append(lclLastChange.getEditor().getName()).append("</td>");
	}
}
%>