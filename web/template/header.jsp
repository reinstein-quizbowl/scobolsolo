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
	<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0, target-densitydpi=device-dpi">
	
	<title><%= argTitle %></title>
	<meta name="author" content="Jonah Greenthal">
	<meta name="description" content="<%= StringEscapeUtils.escapeHtml4(argDescription) %>">
	
	<!-- jQuery -->
	<script src="//code.jquery.com/jquery-2.2.4.min.js"></script>
	
	<!-- jQuery UI -->
	<script src="//code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>
	
	<!-- Font Awesome -->
	<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css">
	
	<!-- Tablesorter -->
	<script src="//cdnjs.cloudflare.com/ajax/libs/jquery.tablesorter/2.26.2/js/jquery.tablesorter.min.js"></script>
	
	<!-- Automatic smart quotes -->
	<script src="/template/js/smartquotes.min.js"></script>
	
	<!-- Foundation -->
	<link rel="stylesheet" href="/template/foundation/css/app.css">
	<script src="/template/foundation/js/foundation.min.js"></script>
	
	<!-- Foundation Datepicker -->
	<link rel="stylesheet" href="/template/foundation/datepicker/foundation-datepicker.css">
	<script src="/template/foundation/datepicker/foundation-datepicker.js"></script>
	
	<!-- Responsive Tables -->
	<link rel="stylesheet" href="/template/foundation/responsive-tables/responsive-tables.css">
	<script src="/template/foundation/responsive-tables/responsive-tables.js"></script>
	
	<!-- MathJax -->
	<script type="text/x-mathjax-config">
		MathJax.Hub.Config({
			extensions: ["tex2jax.js"],
			jax: ["input/TeX", "output/HTML-CSS"],
			tex2jax: {
				inlineMath: [ ["\\(","\\)"] ],
				displayMath: [ ['$$','$$'], ["\\[","\\]"] ],
				processEscapes: true,
			},
			"HTML-CSS": {
				availableFonts: ["TeX"],
				webFont: "STIX-Web",
			},
		});
	</script>
	<script src="//cdn.mathjax.org/mathjax/latest/MathJax.js?config=TeX-AMS-MML_HTMLorMML"></script>
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
