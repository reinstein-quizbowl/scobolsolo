<%@ page import="java.text.NumberFormat" %>
<%@ page import="java.text.DecimalFormat" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.time.format.FormatStyle" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.Collection" %>
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
<%@ page import="com.scobolsolo.Utility" %>

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
	Collection<QuestionStatus> lclChosenStatuses = QuestionStatusFactory.getInstance().multipleFromHttpRequest(request);
	if (lclChosenStatuses.isEmpty()) {
		lclChosenStatuses = new ArrayList<>(QuestionStatusFactory.getInstance().getAll());
		lclChosenStatuses.remove(QuestionStatusFactory.ANSWER_CHOSEN());
	}
	Validate.notEmpty(lclChosenStatuses);
	
	List<QuestionStatus> lclAllStatuses = new ArrayList<>(QuestionStatusFactory.getInstance().getAll());
	lclAllStatuses.sort(null);
	
	%><div class="row">
		<div class="small-12 columns text-center">
			<form action="progress.jsp" method="get">
				<p>
					Consider questions whose status is...
					&nbsp;&nbsp;&nbsp;&nbsp;<%
					for (QuestionStatus lclS : lclAllStatuses) {
						%><label class="my-inline">
							<input type="checkbox" name="question_status_code" value="<%= lclS.getCode() %>"<%= lclChosenStatuses.contains(lclS) ? " checked=\"checked\"" : "" %> />&nbsp;<%= lclS.getName() %>
						</label>
						&nbsp;&nbsp;&nbsp;&nbsp;<%
					}
					%><input type="submit" value="Recalculate" />
				</p>
			</form>
		</div>
	</div><%
	
	List<Diff> lclUnusedQuestionDiffs = DiffFactory.getInstance().acquireForQuery(
		new ArrayList<>(),
		new DatabaseQuery(
			"SELECT CD.* FROM Current_Diff CD WHERE " +
			"( " +
				"question_id NOT IN (SELECT question_id FROM Placement WHERE question_id IS NOT NULL) OR " +
				"question_id IN (SELECT question_id FROM Placement PL JOIN Packet P ON PL.packet_id = P.id JOIN Tournament T ON P.tournament_code = T.code WHERE PL.question_id IS NOT NULL AND T.questions_complete = false) " + 
			") AND question_status_code IN (" + Utility.nParameters(lclChosenStatuses.size()) + ")",
			lclChosenStatuses.stream().map(QuestionStatus::getCode).collect(Collectors.toList())
		)
	);
	
	Tally<Category> lclWritten = Tally.of(lclUnusedQuestionDiffs, Diff::getCategory);
	
	Tally<Category> lclNeeded = new Tally<>();
	for (Tournament lclT : lclIncompleteTournaments) {
		lclT.streamCategoryUse().forEach(argCU -> lclNeeded.tally(argCU.getCategory(), argCU.getNeeds(0)));
	}
	
	Set<Category> lclAllRelevantCategories = lclNeeded.keySet();
	
	List<CategoryGroup> lclCategoryGroups = lclAllRelevantCategories.stream()
		.map(Category::getCategoryGroup)
		.distinct()
		.sorted()
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
			
			int lclWrittenTotal = 0;
			int lclNeededTotal = 0;
			int lclCappedWrittenTotal = 0;
			
			for (CategoryGroup lclCG : lclCategoryGroups) {
				%><h2><%= lclCG.getName() %></h2>
				<table class="responsive full-width data-freeze-1">
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
						Arrays.sort(lclCs);
						
						int lclWrittenThisCG = 0;
						int lclNeededThisCG = 0;
						int lclCappedWrittenThisCG = 0;
						for (Category lclC : lclCs) {
							if (lclAllRelevantCategories.contains(lclC)) {
								Validate.isTrue(lclWritten.get(lclC) >= 0, "Written in " + lclC.getName() + ": " + lclWritten.get(lclC));
								Validate.isTrue(lclNeeded.get(lclC) >= 0, "Needed in " + lclC.getName() + ": " + lclNeeded.get(lclC));
								
								int lclWrittenThisCategory = lclWritten.get(lclC);
								int lclNeededThisCategory = lclNeeded.get(lclC);
								int lclCappedWrittenThisCategory = Math.min(lclWrittenThisCategory, lclNeededThisCategory); // Prevent overages from screwing with averages
								
								double lclCompletion = lclNeededThisCategory == 0 ? 0.0d : 1.0d * lclCappedWrittenThisCategory / lclNeededThisCategory;
								
								%><tr class="<%= determineClass(lclCompletion) %>">
									<td><%= lclC.getName() %></td>
									<td><%= lclWrittenThisCategory %></td>
									<td><%= lclNeededThisCategory %></td>
									<td><%= lclPct.format(lclCompletion) %></td>
									<td><%= outputProgressBar(lclCappedWrittenThisCategory, lclNeededThisCategory) %></td>
								</tr><%
								
								lclWrittenThisCG += lclWrittenThisCategory;
								lclNeededThisCG += lclNeededThisCategory;
								lclCappedWrittenThisCG += lclCappedWrittenThisCategory;
								
								lclWrittenTotal += lclWrittenThisCategory;
								lclNeededTotal += lclNeededThisCategory;
								lclCappedWrittenTotal += lclCappedWrittenThisCategory;
							}
						}
					%></tbody><%
					if (lclCs.length > 1) {
						Validate.isTrue(lclWrittenThisCG >= 0, "Written in " + lclCG.getName() + ": " + lclWrittenThisCG);
						Validate.isTrue(lclNeededThisCG >= 0, "Needed in " + lclCG.getName() + ": " + lclNeededThisCG);
						double lclCompletion = lclNeededThisCG == 0 ? 0.0d : 1.0d * lclCappedWrittenThisCG / lclNeededThisCG;
						%><tfoot>
							<tr class="<%= determineClass(lclCompletion) %>">
								<th><%= lclCG.getName() %> Total</th>
								<th><%= lclWrittenThisCG %></th>
								<th><%= lclNeededThisCG %></th>
								<th><%= lclPct.format(lclCompletion) %></th>
								<td><%= outputProgressBar(lclCappedWrittenThisCG, lclNeededThisCG) %></td>
							</tr>
						</tfoot><%
					}
				%></table><%
			}
			
			if (lclAllRelevantCategories.size() > 1) {
				double lclCompletion = lclNeededTotal == 0 ? 0.0d : 1.0d * lclCappedWrittenTotal / lclNeededTotal;
				
				%><h2>Total</h2>
				<table class="responsive full-width data-freeze-1">
					<thead>
						<tr>
							<th style="width: 20%">&nbsp;</th>
							<th style="width: 10%">Written</th>
							<th style="width: 10%">Needed</th>
							<th style="width: 10%">Completion</th>
							<th style="width: 50%">&nbsp;</th>
						</tr>
					</thead>
					<tbody>
						<tr class="<%= determineClass(lclCompletion) %>">
							<td>&nbsp;</td>
							<td><%= lclWrittenTotal %></td>
							<td><%= lclNeededTotal %></td>
							<td><%= lclPct.format(lclCompletion) %></td>
							<td><%= outputProgressBar(lclCappedWrittenTotal, lclNeededTotal) %></td>
						</tr>
					</tbody>
				</table><%
			}
		%></div>
	 </div><%
}

%><jsp:include page="/template/footer.jsp" />

<%!

private String determineClass(double argCompletion) {
	if (Double.compare(argCompletion, Double.NaN) == 0) {
		return "info";
	}
	
	Validate.isTrue(Double.compare(argCompletion, 0.0d) >= 0, "Completion is " + argCompletion + " but should be nonnegative"); // argCompletion must be nonnegative
	Validate.isTrue(Double.compare(argCompletion, 1.0d) <= 0, "Completion is " + argCompletion + " but should be <= 1"); // argCompletion must be <= 1
	
	if (Double.compare(argCompletion, 0.0d) == 0) {
		return "warning";
	} else if (Double.compare(argCompletion, 1.0d) == 0) {
		return "success";
	} else {
		return "info";
	}
}



NumberFormat lclIntPct = new DecimalFormat("#%");
private String outputProgressBar(int argDone, int argNeeded) {
	Validate.isTrue(argDone >= 0);
	Validate.isTrue(argNeeded > 0);
	
	return "<div class=\"progress\" role=\"progressbar\" aria-valuenow=\"" + argDone + "\" aria-valuemin=\"0\" aria-valuemax=\"" + argNeeded + "\">\n" +
	"	<div class=\"progress-meter\" style=\"width: " + lclIntPct.format(1.0d * argDone / argNeeded) + "\"></div>\n" +
	"</div>";
}

%>