<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.util.Comparator" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.google.common.collect.SortedSetMultimap" %>
<%@ page import="com.google.common.collect.TreeMultimap" %>
<%@ page import="com.siliconage.util.WebDataFilter" %>
<%@ page import="com.opal.ImplicitTableDatabaseQuery" %>
<%@ page import="com.scobolsolo.application.Account" %>
<%@ page import="com.scobolsolo.application.AccountFactory" %>
<%@ page import="com.scobolsolo.application.Message" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="Messages" />
	<jsp:param name="pageDescription" value="Messages" />
	<jsp:param name="topMenu" value="<%= Menus.TOURNAMENTS().asTopLevel().output(request, \"account\") %>" />
	<jsp:param name="h1" value="Messages" />
	<jsp:param name="suppressMessagesModal" value="true" />
</jsp:include><%

Account lclUser = Account.demand(request);

Account lclOpenOnLoad = AccountFactory.getInstance().fromHttpRequest(request, "respond_to_account_id"); // may be null

SortedSetMultimap<Account, Message> lclByCorrespondent = TreeMultimap.create(Account.NameComparator.getInstance(), Comparator.naturalOrder());
for (Message lclM : lclUser.createFromMessageArray()) {
	lclByCorrespondent.put(lclM.getRecipient(), lclM);
}
for (Message lclM : lclUser.createToMessageArray()) {
	lclByCorrespondent.put(lclM.getSender(), lclM);
}

if (lclByCorrespondent.isEmpty()) {
	%><div class="row">
		<div class="small-12 columns">
			<p>You do not have any messages.</p>
		</div>
	</div><%
} else {
	List<Account> lclMostRecentFirst = new ArrayList<>(lclByCorrespondent.keySet());
	lclMostRecentFirst.sort(
		Comparator.<Account, LocalDateTime>comparing(argA -> lclByCorrespondent.get(argA).last().getSentTimestamp()).reversed()
	);
	
	for (Account lclCorrespondent : lclMostRecentFirst) {
		%><div class="correspondent row" id="<%= lclCorrespondent.getId() %>">
			<div class="small-12 columns responses">
				<h2>From <%= lclCorrespondent.getContact().getName() %></h2><%
				Iterator<Message> lclMI = lclByCorrespondent.get(lclCorrespondent).iterator();
				while (lclMI.hasNext()) {
					Message lclM = lclMI.next();
					
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

List<Account> lclNewThreadRecipients = AccountFactory.getInstance().acquireForQuery(
	new ArrayList<>(),
	new ImplicitTableDatabaseQuery("can_receive_unsolicited_messages = true")
);
lclNewThreadRecipients.sort(Account.NameComparator.getInstance());
lclNewThreadRecipients.removeAll(lclByCorrespondent.keySet());
lclNewThreadRecipients.remove(lclUser);
for (Account lclRecipient : lclNewThreadRecipients) {
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
	function openResponse(argRecipientId, argFocus) {
		var lclName = 'message_to_' + argRecipientId;
		
		findResponseContainer(argRecipientId).html(
			'<form class="response" action="SendMessage" method="post">' +
				'<input type="hidden" name="recipient_account_id" value="' + argRecipientId + '" />' +
				'<div class="small-10 medium-11 columns">' +
					'<textarea id="' + lclName + '" name="message" placeholder="Reply&hellip;" rows="2" cols="80" required="required" wrap="soft"></textarea>' +
				'</div>' +
				'<div class="small-2 medium-1 columns">' +
					'<input type="submit" class="small button full-width" value="Send" />' +
					'<button class="small info button full-width" formnovalidate="formnovalidate" onclick="closeResponse(' + argRecipientId + ')">Cancel</button><br />' +
				'</div>' +
			'</form>'
		);
		
		if (argFocus) {
			$('#' + lclName).focus();
		}
	}
	
	function closeResponse(argRecipientId) {
		findResponseContainer(argRecipientId).html('');
	}
	
	function findResponseContainer(argRecipientId) {
		return $('#' + argRecipientId).find('div.response-container');
	}
	
	$(document).ready(
		function() {
			$('.response-container.open-on-load').each(
				function(argIndex) {
					openResponse($(this).parents('div.correspondent').attr('id'), false);
				}
			);
			
			$('.focus-on-load textarea').focus();
			
			// Submit on ctrl-enter in a textarea
			$(document).on(
				'keydown',
				'form.response textarea',
				function(argEvent) {
					console.log('key down');
					if (argEvent.ctrlKey && (argEvent.keyCode == 10 || argEvent.keyCode == 13)) {
						$(argEvent.target).parents('form').submit();
					}
				}
			);
		}
	);
</script>

<jsp:include page="/template/footer.jsp" />
