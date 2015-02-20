<%@ page import="java.util.Arrays" %>
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

School[] lclSs = SchoolFactory.getInstance().createAllArray();
Arrays.sort(lclSs);

boolean lclShowNotes = false;
for (School lclS : lclSs) {
	if (lclS.getNote() != null) {
		lclShowNotes = true;
	}
}

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