<%@ page import="java.util.Comparator" %>
<%@ page import="java.util.Collections" %>
<%@ page import="java.util.List" %>
<%@ page import="org.apache.commons.lang3.ObjectUtils" %>
<%@ page import="org.apache.commons.lang3.StringEscapeUtils" %>
<%@ page import="com.google.common.collect.SortedSetMultimap" %>
<%@ page import="com.google.common.collect.TreeMultimap" %>
<%@ page import="com.siliconage.util.WebDataFilter" %>
<%@ page import="com.siliconage.web.ControllerServlet" %>
<%@ page import="com.scobolsolo.application.Account" %>
<%@ page import="com.scobolsolo.application.Message" %>
<%@ page import="com.scobolsolo.application.Tournament" %>
<%@ page import="com.scobolsolo.application.TournamentFactory" %>

<%
final String TITLE_SEPARATOR = " | ";

final Tournament argTournament = TournamentFactory.getInstance().fromHttpRequest(request, "tournamentCode");

final String argTitle, argDescription;

final String argTitleParameter = request.getParameter("pageTitle");

if (argTitleParameter == null) {
	if (argTournament == null) {
		argTitle = "Scobol Solo";
	} else {
		argTitle = argTournament.getName();
	}
} else {
	if (argTournament == null) {
		argTitle = "Scobol Solo" + TITLE_SEPARATOR + argTitleParameter;
	} else {
		argTitle = argTournament.getName() + TITLE_SEPARATOR + argTitleParameter;
	}
}

String argDescriptionParameter = request.getParameter("pageDescription");
if (argDescriptionParameter == null) {
	argDescription = argTitle;
} else {
	if (argTournament == null) {
		argDescription = "Scobol Solo" + TITLE_SEPARATOR + argDescriptionParameter;
	} else {
		argDescription = argTournament.getName() + TITLE_SEPARATOR + argDescriptionParameter;
	}
}

final Account lclUser = Account.determineCurrent(request);
final List<Message> lclUnreadMessages;
if (lclUser == null || ControllerServlet.getBooleanParameter(request, "suppressMessagesModal")) {
	lclUnreadMessages = Collections.emptyList();
} else {
	lclUnreadMessages = lclUser.getUnreadMessages();
}

%>
<!doctype html>

<html lang="en">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
	
	<title><%= argTitle %></title>
	<meta name="author" content="Jonah Greenthal">
	<meta name="description" content="<%= StringEscapeUtils.escapeHtml4(argDescription) %>">
	
	<% /* Font Awesome */ %>
	<link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	
	<% /* Foundation */ %>
	<link rel="stylesheet" href="/template/style.css">
	
	<% /* Foundation Datepicker */ %>
	<link rel="stylesheet" href="/template/foundation/datepicker/foundation-datepicker.css">
</head>

<body>
<%= ObjectUtils.firstNonNull(request.getParameter("topMenu"), "") %><%

if (lclUnreadMessages.isEmpty() == false) {
	%><div class="reveal modal-open-on-load" id="messages-modal" data-reveal><%
		if (lclUnreadMessages.size() == 1) {
			Message lclM = lclUnreadMessages.get(0);
			
			%><h1>New message</h1>
			<p><span class="message-sender"><%= lclM.getSender().getContact().getName() %></span>&nbsp;<span class="message-timestamp"><%= Message.format(lclM.getSentTimestamp()) %></span><span class="message-separator">:</span> <%= WebDataFilter.scrub(lclM.getText()) %></p>
			<p>
				<button class="button" onclick="acknowledgeMessage(<%= lclM.getId() %>)">Acknowledge</button>
				<a class="button" href="/messages/?respond_to_account_id=<%= lclM.getSender().getId() %>#<%= lclM.getSender().getId() %>" target="_blank">Respond</a>
			</p><%
		} else {
			SortedSetMultimap<Account, Message> lclUnreadMessagesGrouped = TreeMultimap.create(Account.NameComparator.getInstance(), Comparator.naturalOrder());
			for (Message lclM : lclUnreadMessages) {
				lclUnreadMessagesGrouped.put(lclM.getSender(), lclM);
			}
			%><h1><%= lclUnreadMessages.size() + " new messages" %></h1><%
			for (Account lclFrom : lclUnreadMessagesGrouped.keySet()) {
				for (Message lclM : lclUnreadMessagesGrouped.get(lclFrom)) {
					%><p>
						<span class="message-sender"><%= lclM.getSender().getContact().getName() %></span>&nbsp;<span class="message-timestamp"><%= Message.format(lclM.getSentTimestamp()) %></span><span class="message-separator">:</span> <%= WebDataFilter.scrub(lclM.getText()) %>
						<button class="button" onclick="acknowledgeMessage(<%= lclM.getId() %>)">Acknowledge</button>
						<a class="button" href="/messages/?respond_to_account_id=<%= lclM.getSender().getId() %>#<%= lclM.getSender().getId() %>" target="_blank">Respond</a>
					</p><%
				}
			}
		}
	%></div><%
}

%><section role="main" class="scroll-container">
	<div class="row">
		<div class="small-12 columns">
			<h1 class="page-header" id="<%= ObjectUtils.firstNonNull(request.getParameter("h1Id"), "mainHeader") %>"><%= ObjectUtils.firstNonNull(request.getParameter("h1"), "") %></h1>
		</div>
	</div>
