<%@ page import="java.util.Collections" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.siliconage.util.Filter" %>
<%@ page import="com.opal.cma.OpalForm" %>
<%@ page import="com.opal.cma.OpalMainForm" %>
<%@ page import="com.opal.cma.OpalFormComparator" %>
<%@ page import="com.scobolsolo.application.*" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.opalforms.filter.PlayerAtTournament" %>
<%@ page import="com.scobolsolo.opalforms.filter.RoomAtTournament" %>
<%@ page import="com.scobolsolo.opalforms.filter.RoundAtTournament" %>

<%
OpalMainForm<Card> lclOF = OpalForm.create(
	session,
	request,
	"/OpalFormController",
	CardFactory.getInstance(),
	"card_id"
);
Card lclC = lclOF.getUserFacing();
Tournament lclT = lclC.getTournament();
lclOF.setDeleteURI("cancel-confirmation.jsp?object=" + lclT.getUniqueString() + "&class_name=card");

String lclTitle = lclC.getName() + " at " + lclT.getName();
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="<%= lclT.getCode() %>" />
	<jsp:param name="pageTitle" value="<%= lclTitle %>" />
	<jsp:param name="pageDescription" value="<%= lclTitle %>" />
	<jsp:param name="topMenu" value="<%= Menus.tournamentAdmin(lclT).asTopLevel().output(request, \"cards-\" + lclT.getUniqueString()) %>" />
	<jsp:param name="h1" value="<%= lclTitle %>" />
</jsp:include>

<%= lclOF.open() %><%

if (lclOF.hasErrors()) {
	%><div class="row">
		<div class="small-12 columns">
			<p class="form-error-intro">Error:</p>
			<div class="form-errors"><%= lclOF.errors() %></div>
		</div>
	</div><%
}

%><div class="row">
	<div class="small-12 medium-6 columns">
		<label>
			Name
			<%= lclOF.text("Name", 30) %>
		</label>
	</div>
	<div class="small-12 medium-6 columns">
		<label>
			Short name
			<%= lclOF.text("ShortName", 10) %>
		</label>
	</div>
	
	<div class="small-6 medium-3 columns">
		<label>
			Sequence
			<%= lclOF.text("Sequence", 3) %>
		</label>
	</div>
	<div class="small-6 medium-9 columns">
		<label>
			Final message
			<%= lclOF.text("FinalMessage", 50) %>
		</label>
	</div>
</div>

<div class="row">
	<div class="small-12 columns">
		<h2>Matches (<%= (lclC.getWinningMatchCount() + lclC.getLosingMatchCount()) %>)</h2>
		<table class="responsive">
			<thead>
				<tr>
					<th>Round</th>
					<th>Room</th>
					<th>Opponent</th>
					<th>Status</th>
				</tr>
			</thead>
			<tbody><%
				List<OpalForm<Match>> lclWinOFs = lclOF.children("WinningMatch", MatchFactory.getInstance());
				List<OpalForm<Match>> lclLoseOFs = lclOF.children("LosingMatch", MatchFactory.getInstance());
				
				
				List<OpalForm<Match>> lclMOFs = new ArrayList<>(lclWinOFs.size() + lclLoseOFs.size());
				lclMOFs.addAll(lclWinOFs);
				lclMOFs.addAll(lclLoseOFs);
				lclMOFs.sort(new OpalFormComparator<>(Match.RoundComparator.getInstance()));
				
				Filter<Round> lclRoundAtTournament = new RoundAtTournament(lclT);
				Filter<Room> lclRoomAtTournament = new RoomAtTournament(lclT);
				
				for (OpalForm<Match> lclMOF : lclMOFs) {
					Match lclM = lclMOF.getUserFacing();
					%><tr>
						<%= lclMOF.open() %>
						<td><%= lclMOF.dropdown("Round", Round.StandardComparator.getInstance()).filter(lclRoundAtTournament) %></td>
						<td><%= lclMOF.dropdown("Room", Room.SequenceComparator.getInstance()).filter(lclRoomAtTournament) %></td>
						<td><%= lclM.getWinningCard() == lclC ? lclM.getLosingCard().getName() : lclM.getWinningCard().getName() %></td>
						<td><%= lclM.determineStatus() %></td>
						<%= lclMOF.close() %>
					</tr><%
				}
			%></tbody>
		</table>
	</div>
</div>

<div class="row">
	<div class="small-12 columns">
		<%= lclOF.submit() %> <%= lclOF.delete("Delete") %> <%= lclOF.cancel() %>
	</div>
</div>

<%= lclOF.close() %>

<jsp:include page="/template/footer.jsp" />