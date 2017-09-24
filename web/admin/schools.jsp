<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="org.apache.commons.lang3.StringUtils" %>
<%@ page import="com.siliconage.util.WebDataFilter" %>
<%@ page import="com.scobolsolo.application.School" %>
<%@ page import="com.scobolsolo.application.SchoolFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="Schools" />
	<jsp:param name="pageDescription" value="School List" />
	<jsp:param name="topMenu" value="<%= Menus.ADMIN().asTopLevel().output(request, \"schools\") %>" />
	<jsp:param name="h1" value="Schools" />
</jsp:include><%

List<School> lclSs = new ArrayList<>(SchoolFactory.getInstance().getAll());
lclSs.sort(null);

boolean lclShowNotes = lclSs.stream().anyMatch(argS -> StringUtils.isNotBlank(argS.getNote()));

%><div class="row">
	<div class="small-12 columns">
		<table class="responsive">
			<thead>
				<tr>
					<th>Name</th>
					<th>Location</th>
					<%= lclShowNotes ? "<th>Note</th>" : "" %>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><a href="school-edit.jsp">Create</a></td>
					<td>&nbsp;</td>
				</tr><%
				for (School lclS : lclSs) {
					%><tr>
						<td><a href="school-edit.jsp?school_id=<%= lclS.getId() %>"><%= lclS.getName() %></a></td>
						<td><%= lclS.getLocation("&nbsp;") %></td>
						<%= lclShowNotes ? "<td>" + WebDataFilter.scrub(lclS.getNote()) + "</td>" : "" %>
					</tr><%
				}
			%></tbody>
		</table>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />