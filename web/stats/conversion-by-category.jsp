<%@ page import="java.text.DecimalFormat" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.stream.Collectors" %>
<%@ page import="org.apache.commons.lang3.ObjectUtils" %>
<%@ page import="org.apache.commons.lang3.Validate" %>
<%@ page import="com.google.common.collect.Table" %>
<%@ page import="com.google.common.collect.ArrayTable" %>
<%@ page import="com.siliconage.util.Tally" %>
<%@ page import="com.opal.ImplicitTableDatabaseQuery" %>
<%@ page import="com.scobolsolo.application.Category" %>
<%@ page import="com.scobolsolo.application.CategoryFactory" %>
<%@ page import="com.scobolsolo.application.CategoryUse" %>
<%@ page import="com.scobolsolo.application.CategoryConversionV" %>
<%@ page import="com.scobolsolo.application.CategoryConversionVFactory" %>
<%@ page import="com.scobolsolo.application.ResponseType" %>
<%@ page import="com.scobolsolo.application.ResponseTypeFactory" %>
<%@ page import="com.scobolsolo.application.Tournament" %>
<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<%
Tournament lclT = Validate.notNull(TournamentFactory.getInstance().forUniqueString(request.getParameter("object")));

DecimalFormat lclDF = new DecimalFormat("0.00");
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="<%= lclT.getCode() %>" />
	<jsp:param name="pageTitle" value="Conversion by Category" />
	<jsp:param name="topMenu" value="<%= Menus.stats(lclT).asTopLevel().output(request, \"conversion-by-category\") %>" />
	<jsp:param name="h1" value="Conversion by Category" />
</jsp:include>

<div class="row">
	<div class="small-12 columns"><%
		List<ResponseType> lclRTs = ResponseTypeFactory.getInstance().getAll().stream()
			.filter(ResponseType::isShowInReports)
			.sorted()
			.collect(Collectors.toList());
		lclRTs.sort(null);
		
		List<Category> lclCategories = CategoryFactory.getInstance().acquireForQuery(
			new ArrayList<>(),
			new ImplicitTableDatabaseQuery(
				"code IN (SELECT category_code FROM Category_Use WHERE tournament_code = ?) AND 0=1", 
				lclT.getCode()
			)
		);
		lclCategories.sort(null);

		%><table data-fixed-columns="2">
			<thead>
				<tr>
					<th>Group</th>
					<th>Category</th><%
					for (ResponseType lclRT : lclRTs) {
						%><th class="number"><%= lclRT.getShortName() %></th><%
					}
					%><th class="number"><abbr title="points per 20 tossups heard">PP20TUH</abbr></th>
				</tr>
			</thead>
			<tbody><%
				List<CategoryConversionV> lclCCVs = new ArrayList<>();
				CategoryConversionVFactory.getInstance().acquireForQuery(
					lclCCVs, 
					new ImplicitTableDatabaseQuery("tournament_code = ? AND 0=1", lclT.getCode())
				);
				
				Table<Category, ResponseType, Integer> lclTable = ArrayTable.create(lclCategories, lclRTs);
				for (CategoryConversionV lclCCV : lclCCVs) {
					if (lclTable.containsRow(lclCCV.getCategory())) {
						lclTable.put(lclCCV.getCategory(), lclCCV.getResponseType(), lclCCV.getResponseTypeCountAsObject());
					}
				}
				
				Tally<ResponseType> lclRTTally = new Tally<>();
				
				for (Category lclC : lclCategories) {
					%><tr>
						<th><%= lclC.getCategoryGroup().getName() %></th>
						<th><%= lclC.getName() %></th><%
						int lclPoints = 0, lclHeard = 0;
						for (ResponseType lclRT : lclRTs) {
							Integer lclResponseCount = lclTable.get(lclC, lclRT);
							if (lclResponseCount != null) {
								if (lclRT.isAttempt()) {
									lclPoints += lclResponseCount.intValue() * lclRT.getPoints();
									lclHeard += lclResponseCount.intValue();
								}
								
								lclRTTally.tally(lclRT, lclResponseCount);
							}
							%><td class="number"><%= lclResponseCount == null ? "0" : lclResponseCount %></td><%
						}
						%><td class="number"><%
							if (lclHeard > 0) {
								%><%= lclDF.format(20.0d * lclPoints / lclHeard) %><%
							} else {
								%>-<%
							}
						%></td>
					</tr><%
				}
			%></tbody>
			<tfoot>
				<tr>
					<th>Total</th>
					<th>&nbsp;</th><%
					int lclPoints = 0, lclHeard = 0;
					for (ResponseType lclRT : lclRTs) {
						int lclCount = lclRTTally.get(lclRT);
						if (lclRT.isAttempt()) {
							lclPoints += lclCount * lclRT.getPoints();
							lclHeard += lclCount;
						}
						%><td class="number"><%= lclCount %></td><%
					}
					%><td class="number"><%
						if (lclHeard > 0) {
							%><%= lclDF.format(20.0d * lclPoints / lclHeard) %><%
						} else {
							%>-<%
						}
					%></td>
				</tr>
			</tfoot>
		</table>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
