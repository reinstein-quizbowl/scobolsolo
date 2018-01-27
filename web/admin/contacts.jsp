<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="org.apache.commons.lang3.StringUtils" %>
<%@ page import="com.google.common.collect.ListMultimap" %>
<%@ page import="com.google.common.collect.ArrayListMultimap" %>
<%@ page import="com.opal.ImplicitTableDatabaseQuery" %>
<%@ page import="com.scobolsolo.application.Account" %>
<%@ page import="com.scobolsolo.application.Contact" %>
<%@ page import="com.scobolsolo.application.ContactFactory" %>
<%@ page import="com.scobolsolo.application.Player" %>
<%@ page import="com.scobolsolo.application.School" %>
<%@ page import="com.scobolsolo.application.SchoolRegistration" %>
<%@ page import="com.scobolsolo.application.Staff" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="Contacts" />
	<jsp:param name="pageDescription" value="Contact List" />
	<jsp:param name="topMenu" value="<%= Menus.ADMIN().asTopLevel().output(request, \"contacts\") %>" />
	<jsp:param name="h1" value="Contacts" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<table data-fixed-columns="1">
			<thead>
				<tr>
					<th>Name</th>
					<th>Email&nbsp;address</th>
					<th>Advance&nbsp;phone</th>
					<th>Day&#8209;of&nbsp;phone</th>
					<th>Active?</th>
					<th>Roles</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td colspan="5"><a href="contact-edit.jsp">Create</a></td>
				</tr><%
				List<Contact> lclCs = new ArrayList<>(ContactFactory.getInstance().getAll());
				lclCs.sort(null);
				
				for (Contact lclC : lclCs) {
					%><tr>
						<td><a href="contact-edit.jsp?contact_id=<%= lclC.getId() %>"><%= lclC.getName() %></a></td>
						<td><%
							if (lclC.getEmailAddress() != null) {
								%><a href="mailto:<%= lclC.getEmailAddress() %>"><%= lclC.getEmailAddress() %></a><%
							} else {
								%>none<%
							}
						%></td>
						<td><%= lclC.getAdvancePhone("none") %></td>
						<td><%= lclC.getDayOfPhone("none") %></td>
						<td><%= lclC.isActive() ? "&#10003;" : "&nbsp;" %></td>
						<td><%
							Account lclA = lclC.getAccount();
							if (lclA != null) {
								%><%= lclA.isAdministrator() ? "Administrator" : "User" %> (username: <%= lclA.getUsername() %>)<br />
								<%= lclA.isWriter() ? "Writer" : "" %><br /><%
							}
							
							List<SchoolRegistration> lclMainContactFor = new ArrayList<>(lclC.getMainSchoolRegistrationSet());
							if (lclMainContactFor.isEmpty() == false) {
								lclMainContactFor.sort(SchoolRegistration.TournamentDateComparator.getInstance());
								
								ListMultimap<School, String> lclFor = ArrayListMultimap.create(1, lclMainContactFor.size());
								
								for (SchoolRegistration lclR : lclMainContactFor) {
									lclFor.put(lclR.getSchool(), lclR.getTournament().getShortName());
								}
								
								for (School lclS : lclFor.keySet()) {
									%>Main contact for <%= lclS.getShortName() %> (<%= StringUtils.join(lclFor.get(lclS), ", ") %>)<br /><%
								}
							}
							
							List<Staff> lclSs = new ArrayList<>(lclC.getStaffSet());
							if (lclSs.isEmpty() == false) {
								lclSs.sort(Staff.TournamentDateComparator.getInstance());
								
								ListMultimap<School, String> lclFor = ArrayListMultimap.create(1, lclSs.size());
								
								for (Staff lclS : lclSs) {
									School lclSchool = lclS.getSchoolRegistration() == null ? null : lclS.getSchoolRegistration().getSchool();
									lclFor.put(lclSchool, lclS.getTournament().getShortName());
									// lclSchool may be null; ArrayListMultimap allows a null key
								}
								
								for (School lclS : lclFor.keySet()) {
									if (lclS == null) {
										%>Staffer (<%= StringUtils.join(lclFor.get(lclS), ", ") %>)<br /><%
									} else {
										%>Staffer on behalf of <%= lclS.getShortName() %> (<%= StringUtils.join(lclFor.get(lclS), ", ") %>)<br /><%
									}
								}
							}
							
							List<Player> lclPs = new ArrayList<>(lclC.getPlayerSet());
							if (lclPs.isEmpty() == false) {
								lclPs.sort(Player.TournamentDateComparator.getInstance());
								
								ListMultimap<School, String> lclFor = ArrayListMultimap.create(1, lclSs.size());
								
								for (Player lclP : lclPs) {
									lclFor.put(lclP.getSchoolRegistration().getSchool(), lclP.getSchoolRegistration().getTournament().getShortName());
								}
								
								for (School lclS : lclFor.keySet()) {
									%>Player for <%= lclS.getShortName() %> (<%= StringUtils.join(lclFor.get(lclS), ", ") %>)<br /><%
								}
							}
						%></td>
					</tr><%
				}
			%></tbody>
		</table>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />