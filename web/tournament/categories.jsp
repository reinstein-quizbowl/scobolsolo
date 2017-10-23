<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.Map" %>
<%@ page import="com.google.common.collect.Maps" %>
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
Arrays.sort(lclCs);

Map<Category, CategoryUse> lclUses = Maps.uniqueIndex(lclT.getCategoryUseSet(), CategoryUse::getCategory);

%>
<div class="row">
	<div class="small-12 columns">
		<form action="UpdateCategoryUses" method="post">
		<input type="hidden" name="tournament_code" value="<%= lclT.getCode() %>">
		
		<table class="responsive" data-fixed-columns="1">
			<thead>
				<tr>
					<th>Category</th>
					<th>Group</th>
					<th>In&nbsp;use?</th>
					<th>Needs</th>
				</tr>
			</thead>
			<tbody><%
				for (Category lclC : lclCs) {
					%><tr>
						<td><%= lclC.getName() %></td>
						<td><%= lclC.getCategoryGroup().getName() %></td>
						<td>
							<div class="switch tiny">
									<input type="checkbox" id="<%= lclC.getCode() %>" name="<%= lclC.getCode() %>" value="True"<%= lclUses.containsKey(lclC) ? " checked" : "" %>>
								<label for="<%= lclC.getCode() %>">
								</label>
							</div>
						</td>
						<td><input type="text" id="<%= lclC.getCode() %>_needs" name="<%= lclC.getCode() %>_needs" value="<%= lclUses.containsKey(lclC) ? lclUses.get(lclC).getNeeds("") : "" %>" size="2" /></td>
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