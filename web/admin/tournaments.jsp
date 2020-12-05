<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.scobolsolo.application.Tournament" %>
<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="Tournaments" />
	<jsp:param name="pageDescription" value="Tournament List" />
	<jsp:param name="topMenu" value="<%= Menus.ADMIN().asTopLevel().output(request, \"tournaments\") %>" />
	<jsp:param name="h1" value="Tournaments" />
</jsp:include><%

List<Tournament> lclTs = new ArrayList<>(TournamentFactory.getInstance().getAll());
lclTs.sort(Tournament.DateComparator.getInstance().reversed());

%><div class="row">
	<div class="small-12 columns">
		<table>
			<thead>
				<tr>
					<th>Name</th>
					<th>Date</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><a href="tournament-edit.jsp">Create</a></td>
					<td>&nbsp;</td>
				</tr><%
				DateTimeFormatter lclDF = DateTimeFormatter.ofPattern("MMMM d, yyyy");
				
				for (Tournament lclT : lclTs) {
					%><tr>
						<th><a href="tournament-edit.jsp?object=<%= lclT.getUniqueString() %>"><%= lclT.getName() %></a></th>
						<td><%= lclDF.format(lclT.getDate()) %></td>
					</tr><%
				}
			%></tbody>
		</table>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />