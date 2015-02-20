<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.Set" %>
<%@ page import="java.util.HashSet" %>
<%@ page import="java.util.stream.Collectors" %>
<%@ page import="com.scobolsolo.application.Category" %>
<%@ page import="com.scobolsolo.application.CategoryFactory" %>
<%@ page import="com.scobolsolo.application.CategoryUse" %>
<%@ page import="com.scobolsolo.application.Tournament" %>
<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<%
Tournament lclT = TournamentFactory.getInstance().fromHttpRequest(request, "object");
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="<%= lclT.getCode() %>" />
	<jsp:param name="pageTitle" value="Categories" />
	<jsp:param name="topMenu" value="<%= Menus.tournamentAdmin(lclT).asTopLevel().output(request, \"categories-\" + lclT.getUniqueString()) %>" />
	<jsp:param name="h1" value="Categories" />
</jsp:include>
<%

Category[] lclCs = CategoryFactory.getInstance().createAllArray();
Arrays.sort(lclCs, Category.StandardComparator.getInstance());

Set<Category> lclInUse = lclT.streamCategoryUse().map(CategoryUse::getCategory).collect(Collectors.toSet());

%>
<div class="row">
	<div class="small-12 columns">
		<form action="UpdateCategoryUses" method="post">
		<input type="hidden" name="tournament_code" value="<%= lclT.getCode() %>">
		
		<table class="responsive">
			<thead>
				<tr>
					<th>Category</th>
					<th>Group</th>
					<th>In&nbsp;use?</th>
				</tr>
			</thead>
			<tbody><%
				for (Category lclC : lclCs) {
					%><tr>
						<td><%= lclC.getName() %></td>
						<td><%= lclC.getCategoryGroup().getName() %></td>
						<td>
							<div class="switch tiny">
									<input type="checkbox" id="<%= lclC.getCode() %>" name="<%= lclC.getCode() %>" value="True"<%= lclInUse.contains(lclC) ? " checked" : "" %>>
								<label for="<%= lclC.getCode() %>">
								</label>
							</div>
						</td>
					</tr><%
				}
			%></tbody>
		</table>
		
		<div class="submit btn-group btn-group-1">
			<input type="submit" value="Save" />
		</div>
		
		</form>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />