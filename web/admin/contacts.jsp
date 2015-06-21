<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="org.apache.commons.lang3.StringUtils" %>
<%@ page import="com.google.common.collect.ListMultimap" %>
<%@ page import="com.google.common.collect.ArrayListMultimap" %>
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
		<table class="responsive">
			<thead>
				<tr>
					<th>Name</th>
					<th>Email&nbsp;address</th>
					<th>Advance&nbsp;phone</th>
					<th>Day&#8209;of&nbsp;phone</th>
					<th>Roles</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td colspan="5"><a href="contact-edit.jsp">Create</a></td>
				</tr><%
				List<Contact> lclCs = ContactFactory.getInstance().acquireAll(new ArrayList<>());
				lclCs.removeIf(Contact::isInactive);
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
						<td><%
							Account lclA = lclC.getAccount();
							if (lclA != null) {
								%><%= lclA.isAdministrator() ? "Administrator" : "User" %> (username: <%= lclA.getUsername() %>)<br /><%
							}
							
							SchoolRegistration[] lclMainContactFor = lclC.createMainSchoolRegistrationArray();
							if (lclMainContactFor != null && lclMainContactFor.length > 0) {
								Arrays.sort(lclMainContactFor, SchoolRegistration.TournamentDateComparator.getInstance());
								
								ListMultimap<School, String> lclFor = ArrayListMultimap.create(1, lclMainContactFor.length);
								
								for (SchoolRegistration lclR : lclMainContactFor) {
									lclFor.put(lclR.getSchool(), lclR.getTournament().getShortName());
								}
								
								for (School lclS : lclFor.keySet()) {
									%>Main contact for <%= lclS.getShortName() %> (<%= StringUtils.join(lclFor.get(lclS), ", ") %>)<br /><%
								}
							}
							
							Staff[] lclSs = lclC.createStaffArray();
							if (lclSs != null && lclSs.length > 0) {
								Arrays.sort(lclSs, Staff.TournamentDateComparator.getInstance());
								
								ListMultimap<School, String> lclFor = ArrayListMultimap.create(1, lclSs.length);
								
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
							
							Player[] lclPs = lclC.createPlayerArray();
							if (lclPs != null && lclPs.length > 0) {
								Arrays.sort(lclPs, Player.TournamentDateComparator.getInstance());
								
								ListMultimap<School, String> lclFor = ArrayListMultimap.create(1, lclSs.length);
								
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