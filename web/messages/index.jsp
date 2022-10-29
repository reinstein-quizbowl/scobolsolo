<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.util.Comparator" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.stream.Collectors" %>
<%@ page import="org.apache.commons.lang3.StringUtils" %>
<%@ page import="com.google.common.collect.SortedSetMultimap" %>
<%@ page import="com.google.common.collect.TreeMultimap" %>
<%@ page import="com.siliconage.util.WebDataFilter" %>
<%@ page import="com.opal.ImplicitTableDatabaseQuery" %>
<%@ page import="com.opal.LocalDateCache" %>
<%@ page import="com.scobolsolo.application.Account" %>
<%@ page import="com.scobolsolo.application.AccountFactory" %>
<%@ page import="com.scobolsolo.application.Message" %>
<%@ page import="com.scobolsolo.application.Room" %>
<%@ page import="com.scobolsolo.application.Staff" %>
<%@ page import="com.scobolsolo.application.StaffAssignment" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="Messages" />
	<jsp:param name="pageDescription" value="Messages" />
	<jsp:param name="topMenu" value="<%= Menus.TOURNAMENTS().asTopLevel().output(request, \"account\") %>" />
	<jsp:param name="h1" value="Messages" />
	<jsp:param name="suppressMessagesModal" value="true" />
</jsp:include><%

final Account lclUser = Account.demand(request);

final Account lclOpenOnLoad = AccountFactory.getInstance().fromHttpRequest(request, "respond_to_account_id"); // may be null

final SortedSetMultimap<Account, Message> lclByCorrespondent = TreeMultimap.create(Account.NameComparator.getInstance(), Comparator.naturalOrder());
for (final Message lclM : lclUser.getFromMessageSet()) {
	if (lclM.isArchived() == false) {
		lclByCorrespondent.put(lclM.getRecipient(), lclM);
	}
}
for (final Message lclM : lclUser.getToMessageSet()) {
	if (lclM.isArchived() == false) {
		lclByCorrespondent.put(lclM.getSender(), lclM);
	}
}

if (lclByCorrespondent.isEmpty()) {
	%><div class="row">
		<div class="small-12 columns">
			<p>You do not have any messages.</p>
		</div>
	</div><%
} else {
	final List<Account> lclMostRecentFirst = new ArrayList<>(lclByCorrespondent.keySet());
	lclMostRecentFirst.sort(
		Comparator.<Account, LocalDateTime>comparing(argA -> lclByCorrespondent.get(argA).last().getSentTimestamp()).reversed()
	);
	
	for (final Account lclCorrespondent : lclMostRecentFirst) {
		%><div class="correspondent row" id="<%= lclCorrespondent.getId() %>">
			<div class="small-12 columns responses">
				<h2>
					With <%= lclCorrespondent.getContact().getName() %><%
					
					final String lclRelevantRoomNames = lclCorrespondent.getContact().getCurrentStaff().stream()
						.flatMap(Staff::streamStaffAssignment)
						.map(StaffAssignment::getRoom)
						.map(Room::getName)
						.collect(Collectors.joining(", "));
					if (StringUtils.isNotBlank(lclRelevantRoomNames)) {
						%> (<%= lclRelevantRoomNames %>)<%
					}
				%></h2><%
				final Iterator<Message> lclMI = lclByCorrespondent.get(lclCorrespondent).iterator();
				while (lclMI.hasNext()) {
					final Message lclM = lclMI.next();
					
					%><p<%= lclM.getRecipient() == lclUser && lclM.isUnread() ? " class=\"unread-message\"" : "" %>>
						<span class="message-sender"><%= lclM.getSender().getContact().getName() %></span>&nbsp;<span class="message-timestamp"><%= Message.format(lclM.getSentTimestamp()) %></span><span class="message-separator">:</span> <%= WebDataFilter.scrub(lclM.getText()) %><%
						if (lclM.getRecipient() == lclUser && lclM.isUnread()) {
							%>&nbsp;&nbsp;&nbsp;<button class="tiny" onclick="acknowledgeMessage(<%= lclM.getId() %>)">Acknowledge</button> <%
						}
						if (lclMI.hasNext() == false) {
							%>&nbsp;&nbsp;&nbsp;<button class="tiny" onclick="openResponse(<%= lclCorrespondent.getId() %>, true)">Respond</button><%
						}
					%></p><%
				}
				%><div class="response-container<%= lclOpenOnLoad != null && lclCorrespondent == lclOpenOnLoad ? " open-on-load focus-on-load" : "" %>"></div>
			</div>
		</div><%
	}
}

final List<Account> lclNewThreadRecipients = AccountFactory.getInstance().acquireForQuery(
	new ArrayList<>(),
	new ImplicitTableDatabaseQuery("active = true")
);
if (lclUser.isAdministrator() == false) {
	lclNewThreadRecipients.removeIf(it -> it.isCanReceiveUnsolicitedMessages() == false);
}

lclNewThreadRecipients.sort(Account.NameComparator.getInstance());
lclNewThreadRecipients.removeAll(lclByCorrespondent.keySet());
lclNewThreadRecipients.remove(lclUser);
for (final Account lclRecipient : lclNewThreadRecipients) {
	%><div class="correspondent row" id="<%= lclRecipient.getId() %>">
		<div class="small-12 columns responses">
			<h2>New Message to <%= lclRecipient.getContact().getName() %></h2>
			<div class="response-container open-on-load"></div>
		</div>
	</div><%
}

%><style>
	.response-container {
		padding-left: 1em;
	}
</style>

<script>
	var lclCurrentTimeString = '<%= DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(LocalDateCache.now()) %>';
</script>

<jsp:include page="/template/footer.jsp">
	<jsp:param name="loadScript" value="messages.js" />
</jsp:include>
