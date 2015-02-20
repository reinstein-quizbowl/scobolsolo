<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.stream.Collectors" %>
<%@ page import="com.scobolsolo.application.Category" %>
<%@ page import="com.scobolsolo.application.CategoryFactory" %>
<%@ page import="com.scobolsolo.application.CategoryUse" %>
<%@ page import="com.scobolsolo.application.Tournament" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="Categories" />
	<jsp:param name="pageDescription" value="Category List" />
	<jsp:param name="topMenu" value="<%= Menus.ADMIN().asTopLevel().output(request, \"categories\") %>" />
	<jsp:param name="h1" value="Categories" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<table class="responsive">
			<thead>
				<tr>
					<th>Name</th>
					<th>Group</th>
					<th>Used&nbsp;in</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><a href="category-edit.jsp">Create</a></td>
					<td><a href="category-group-edit.jsp">Create group</a></td>
					<td>&nbsp;</td>
				</tr><%
				Category[] lclCs = CategoryFactory.getInstance().createAllArray();
				Arrays.sort(lclCs, Category.StandardComparator.getInstance());
				for (Category lclC : lclCs) {
					%><tr>
						<td><a href="category-edit.jsp?object=<%= lclC.getUniqueString() %>"><%= lclC.getName() %></a></td>
						<td><a href="category-group-edit.jsp?object=<%= lclC.getCategoryGroup().getUniqueString() %>"><%= lclC.getCategoryGroup().getName() %></a></td>
						<td><%= lclC.streamCategoryUse().sorted(CategoryUse.TournamentComparator.getInstance()).map(CategoryUse::getTournament).map(argT -> "<span class=\"stealth-tool-tip\" title=\"" + argT.getName() + "\">" + argT.getShortName() + "</span>").collect(Collectors.joining(", ")) %></td></td>
					</tr><%
				}
			%></tbody>
		</table>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />