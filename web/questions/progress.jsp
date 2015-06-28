<%@ page import="java.text.NumberFormat" %>
<%@ page import="java.text.DecimalFormat" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.time.format.FormatStyle" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.Set" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.stream.Collectors" %>
<%@ page import="org.apache.commons.lang3.Validate" %>
<%@ page import="org.apache.commons.lang3.tuple.Pair" %>
<%@ page import="com.siliconage.util.Tally" %>
<%@ page import="com.siliconage.util.WebDataFilter" %>
<%@ page import="com.opal.DatabaseQuery" %>
<%@ page import="com.opal.ImplicitTableDatabaseQuery" %>
<%@ page import="com.scobolsolo.application.*" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="Progress" />
	<jsp:param name="topMenu" value="<%= Menus.QUESTIONS().asTopLevel().output(request, \"progress\") %>" />
	<jsp:param name="h1" value="Progress" />
</jsp:include><%

List<Tournament> lclIncompleteTournaments = TournamentFactory.getInstance().acquireForQuery(
	new ArrayList<>(),
	new ImplicitTableDatabaseQuery("questions_complete = false ORDER BY date")
);

if (lclIncompleteTournaments.isEmpty()) {
	%><div class="row">
		<div class="small-12 columns">
			<p>All tournaments are marked as having their questions completed.</p>
		</div>
	</div><%
} else {
	List<Question> lclUnusedQuestions = QuestionFactory.getInstance().acquireForQuery(
		new ArrayList<>(),
		new DatabaseQuery("SELECT Q.* FROM Question Q WHERE id NOT IN (SELECT question_id FROM Placement) or id IN (SELECT question_id FROM Placement PL JOIN Packet P ON PL.packet_id = P.id JOIN Tournament T ON P.tournament_code = T.code WHERE T.questions_complete = false)")
	);
	
	Tally<Category> lclWritten = new Tally<>();
	for (Question lclQ : lclUnusedQuestions) {
		lclWritten.tally(lclQ.getCategory());
	}
	
	Tally<Category> lclNeeded = new Tally<>();
	for (Tournament lclT : lclIncompleteTournaments) {
		lclT.streamCategoryUse().forEach(argCU -> lclNeeded.tally(argCU.getCategory(), argCU.getNeeds(0)));
	}
	
	Set<Category> lclAllRelevantCategories = lclNeeded.asLiveMap().keySet();
	
	List<CategoryGroup> lclCategoryGroups = lclAllRelevantCategories.stream()
		.map(Category::getCategoryGroup)
		.distinct()
		.sorted(CategoryGroup.SequenceComparator.getInstance())
		.collect(Collectors.toList());
	
	 %><div class="row">
		<div class="small-12 columns"><%
			if (lclIncompleteTournaments.size() > 1) {
				%><p>The following tournaments are currently being worked on:</p>
				<ol><%
					for (Tournament lclT : lclIncompleteTournaments) {
						%><li><%= lclT.getName() %>, which will take place on <%= DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(lclT.getDate()) %></li><%
					}
				%></ol><%
			}
			
			NumberFormat lclPct = new DecimalFormat("0.0%");
			NumberFormat lclIntPct = new DecimalFormat("#%");
			
			for (CategoryGroup lclCG : lclCategoryGroups) {
				%><h2><%= lclCG.getName() %></h2>
				<table class="responsive full-width">
					<thead>
						<tr>
							<th style="width: 20%">Category</th>
							<th style="width: 10%">Written</th>
							<th style="width: 10%">Needed</th>
							<th style="width: 10%">Completion</th>
							<th style="width: 50%">&nbsp;</th>
						</tr>
					</thead>
					<tbody><%
						Category[] lclCs = lclCG.createCategoryArray();
						Arrays.sort(lclCs, Category.StandardComparator.getInstance());
						for (Category lclC : lclCs) {
							if (lclAllRelevantCategories.contains(lclC)) {
								Validate.isTrue(lclNeeded.get(lclC) > 0);
								
								int lclWrittenThisCategory = lclWritten.get(lclC);
								int lclNeededThisCategory = lclNeeded.get(lclC);
								
								double lclCompletion = 1.0d * lclWrittenThisCategory / lclNeededThisCategory;
								
								%><tr class="<%= determineClass(lclCompletion) %>">
									<td><%= lclC.getName() %></td>
									<td><%= lclWritten.get(lclC) %></td>
									<td><%= lclNeeded.get(lclC) %></td>
									<td><%= lclPct.format(lclCompletion) %></td>
									<td>
										<div class="progress">
											<span class="meter" style="width: <%= lclIntPct.format(lclCompletion) %>;"></span>
										</div>
									</td>
								</tr><%
							}
						}
					%></tbody>
				</table><%
			}
		%></div>
	 </div><%
}

%><jsp:include page="/template/footer.jsp" />

<%!

private String determineClass(double argCompletion) {
	Validate.isTrue(Double.compare(argCompletion, 0.0d) >= 0); // argCompletion must be nonnegative
	Validate.isTrue(Double.compare(argCompletion, 1.0d) <= 0); // argCompletion must be <= 1
	
	if (Double.compare(argCompletion, 0.0d) == 0) {
		return "warning";
	} else if (Double.compare(argCompletion, 1.0d) == 0) {
		return "success";
	} else {
		return "info";
	}
}

%>