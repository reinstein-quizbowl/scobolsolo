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
<%@ page import="org.apache.commons.lang3.exception.ExceptionUtils" %>
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
	<jsp:param name="topMenu" value="<%= Menus.QUESTIONS().asTopLevel().output(request, \"render-all\") %>" />
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
			<label>Show&nbsp;questions&hellip;</label>
		</div><%
		List<Tournament> lclTs = TournamentFactory.getInstance().getAll().stream()
			.filter(argT -> argT.getPacketSet().isEmpty() == false)
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


List<Question> lclQs = QuestionFactory.getInstance().getAll().stream()
	.filter(argQ -> argQ.isUnused() ? lclShowUnused : argQ.streamPlacement().anyMatch(argPL -> lclSelectedTournaments.contains(argPL.getTournament())))
	.sorted(Comparator.<Question>comparingInt(argQ -> argQ.isUsed() ? 1 : 0).thenComparing(Question.CATEGORY_COMPARATOR))
	.collect(Collectors.toList());

Map<Tournament, ListMultimap<Category, Question>> lclUsed = new HashMap<>(lclSelectedTournaments.size());
ListMultimap<Category, Question> lclUnused = ArrayListMultimap.create();
for (Question lclQ : lclQs) {
	if (lclQ.isUsed()) {
		for (Placement lclPL : lclQ.getPlacementSet()) {
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
			<div id="unused"><%= renderAll(null, lclUnused) %></div>
		</div>
	</div><%
}

for (Tournament lclT : lclSelectedTournaments) {
	%><div class="row">
		<div class="small-12 columns">
			<h2>
				<a onclick="$('#<%= lclT.getCode() %>').toggle('slow'); flipIcon(this)" class="fa fa-compress"></a>
				<%= lclT.getName() %> (<%= lclUsed.get(lclT).size() %>)
			</h2>
			<div id="<%= lclT.getCode() %>"><%= renderAll(lclT, lclUsed.get(lclT)) %></div>
		</div>
	</div><%
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
String renderAll(Tournament argT, ListMultimap<Category, Question> argCategorizedQuestions) {
	// argT may be null; this indicates unused questions
	Validate.notNull(argCategorizedQuestions);
	
	if (argCategorizedQuestions.isEmpty()) {
		return "<p>[no questions]</p>";
	} else {
		StringBuilder lclSB = new StringBuilder();
		List<Category> lclCategories = new ArrayList<>(argCategorizedQuestions.keySet());
		lclCategories.sort(null);
		
		for (Category lclC : lclCategories) {
			String lclSectionId = argT == null ? "unused_" + lclC.getCode() : argT.getCode() + '_' + lclC.getCode();
			String lclCollapseToggleLinkId = "collapse_toggle_" + lclSectionId;
			
			lclSB.append("<h3><a onclick=\"$('#" + lclSectionId + "').toggle('slow'); flipIcon(this)\" class=\"fa fa-compress\"></a> " + lclC.getName() + " (" + argCategorizedQuestions.get(lclC).size() + ")</h3>")
				.append("<section id=\"").append(lclSectionId).append("\">");
			
			List<Question> lclQs = argCategorizedQuestions.get(lclC);
			if (argT != null) {
				lclQs = lclQs.stream()
					.map(argQ -> argQ.findPlacement(argT))
					.sorted()
					.map(Placement::getQuestion)
					.collect(Collectors.toList()); // This is pretty inelegant. The goal is to get the questions into the order they're actually used at the tournament (if any), but is there a better way?
			}
			
			for (Question lclQ : lclQs) {
				String lclPlacementString;
				if (argT == null) {
					lclPlacementString = "";
				} else {
					Placement lclPL = Validate.notNull(lclQ.findPlacement(argT));
					lclPlacementString = ": " + lclPL.getString();
				}
				
				try {
					lclSB.append("<h4>")
						.append("<a href=\"question-edit.jsp?question_id=").append(lclQ.getId()).append("\">").append(lclQ.getDescription()).append("</a>")
						.append(lclPlacementString)
						.append("</h4>")
						.append("<p class=\"question-text small\">").append(Question.outputTextHTML(lclQ.getCurrentDiff(), Question.SHOW_PRONUNCIATION_GUIDES)).append("</p>")
						.append("<p class=\"question-answer small\">").append(Question.outputAnswerHTML(lclQ.getCurrentDiff(), true)).append("</p>");
					if (lclQ.getNote() != null) {
						lclSB.append("<p class=\"question-note small\">").append(WebDataFilter.scrubForHTMLDisplay(lclQ.getNote())).append("</p>");
					}
				} catch (Exception lclE) {
					lclSB.append("<h4 class=\"error\">Couldn't output <a href=\"question-edit.jsp?question_id=").append(lclQ.getId()).append("\">#").append(lclQ.getId()).append("</a></h4>")
						.append("<p>").append(WebDataFilter.scrubForHTMLDisplay(lclE.getClass().getName())).append(": ").append(WebDataFilter.scrubForHTMLDisplay(lclE.getMessage())).append("</p>")
						.append("<pre>").append(ExceptionUtils.getStackTrace(lclE)).append("</pre>");
				}
			}
			
			lclSB.append("</section>");
		}
		
		return lclSB.toString();
	}
}
%>