<%@ page import="com.scobolsolo.application.Tournament" %>
<%@ page import="com.scobolsolo.servlets.tournament.Register" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%

final Tournament lclTourn = Register.getTournamentToRegisterFor();
if (lclTourn == null) {
	%><jsp:forward page="none.jsp" /><%
}

%>
<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="<%= lclTourn.getCode() %>" />
	<jsp:param name="topMenu" value="<%= Menus.stats(lclTourn).asTopLevel().output(request, \"results\") %>" />
	<jsp:param name="h1" value="<%= \"Registration for \" + lclTourn.getName() %>" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>We have received your registration. Thanks!</p>
		
		<p>We have sent you an automated confirmation email and will be in touch if we have any questions or concerns. We will send more information when the tournament gets closer.</p>
		
		<p>If you need to change players or have any questions, reply to the confirmation email or write to <%= lclTourn.getTournamentDirectorContact().getName() %> at <a href="mailto:<%= lclTourn.getTournamentDirectorContact().getEmailAddress() %>"><%= lclTourn.getTournamentDirectorContact().getEmailAddress() %></a>.</p>
		
		<p>Make checks payable to Reinstein QuizBowl and send them to&hellip;</p>
		<address style="margin-bottom: 1rem;">
			Reinstein QuizBowl<br />
			P.O.&nbsp;Box 57<br />
			125 Schelter Rd<br />
			Lincolnshire, IL 60069&ndash;0057
		</address>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
