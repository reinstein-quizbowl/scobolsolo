<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="org.apache.commons.lang3.Validate" %>
<%@ page import="com.opal.cma.OpalForm" %>
<%@ page import="com.opal.cma.OpalMainForm" %>
<%@ page import="com.scobolsolo.application.Card" %>
<%@ page import="com.scobolsolo.application.Game" %>
<%@ page import="com.scobolsolo.application.GameFactory" %>
<%@ page import="com.scobolsolo.application.Match" %>
<%@ page import="com.scobolsolo.application.MatchFactory" %>
<%@ page import="com.scobolsolo.application.Performance" %>
<%@ page import="com.scobolsolo.application.PerformanceFactory" %>
<%@ page import="com.scobolsolo.application.Placement" %>
<%@ page import="com.scobolsolo.application.Player" %>
<%@ page import="com.scobolsolo.application.Phase" %>
<%@ page import="com.scobolsolo.application.Question" %>
<%@ page import="com.scobolsolo.application.Response" %>
<%@ page import="com.scobolsolo.application.ResponseFactory" %>
<%@ page import="com.scobolsolo.application.ResponseType" %>
<%@ page import="com.scobolsolo.application.ResponseTypeFactory" %>
<%@ page import="com.scobolsolo.application.Room" %>
<%@ page import="com.scobolsolo.application.Round" %>
<%@ page import="com.scobolsolo.application.Staff" %>
<%@ page import="com.scobolsolo.application.Tournament" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.HTMLUtility" %>

<%
OpalMainForm<Game> lclOF = OpalForm.create(
	session,
	request,
	"/OpalFormController",
	GameFactory.getInstance(),
	"game_id"
);
lclOF.setDeleteURI("/delete-confirmation.jsp?class_name=game");

Game lclG = Validate.notNull(lclOF.getUserFacing());

String lclTitle = "Edit Game #" + lclG.getId();

OpalForm<Match> lclMOF = lclOF.targetForm("Match", MatchFactory.getInstance());
Match lclM = Validate.notNull(lclMOF.getUserFacing());
Round lclRound = lclM.getRound();
Room lclRoom = lclM.getRoom();
Phase lclPhase = lclRound.getPhase();

Tournament lclT = lclM.getTournament();
%>
<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="<%= lclTitle %>" />
	<jsp:param name="pageDescription" value="<%= lclTitle %>" />
	<jsp:param name="topMenu" value="<%= Menus.ADMIN().asTopLevel().output(request, \"games\") %>" />
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
	<%= lclMOF.open() %>
		<div class="small-12 columns">
			<h2>Match Data</h2>
		</div>
		<div class="small-12 medium-6 columns">
			<label>
				Round
				<%= lclMOF.<Round>dropdown("Round").filter(argR -> argR.getTournament() == lclT) %>
			</label>
		</div>
		<div class="small-12 medium-6 columns">
			<label>
				Room
				<%= lclMOF.<Room>dropdown("Room").filter(argR -> argR.getTournament() == lclT) %>
			</label>
		</div>
		<div class="small-12 medium-6 columns">
			<label>
				Winning Card
				<%= lclMOF.<Card>dropdown("WinningCard").filter(argC -> argC.getPhase() == lclPhase) %>
			</label>
		</div>
		<div class="small-12 medium-6 columns">
			<label>
				Losing Card
				<%= lclMOF.<Card>dropdown("LosingCard").filter(argC -> argC.getPhase() == lclPhase) %>
			</label>
		</div>
	<%= lclMOF.close() %>
</div>

<div class="row">
	<div class="small-12 columns">
		<h2>Game Data</h2>
	</div>
	
	<div class="small-12 medium-5 columns">
		<label>
			Moderator
			<%= lclOF.<Staff>dropdown("ModeratorStaff").query("tournament_code = ?", lclT.getCode()) %>
		</label>
	</div>
	<div class="small-12 medium-5 columns">
		<label>
			Scorekeeper
			<%= lclOF.<Staff>dropdown("ScorekeeperStaff").query("tournament_code = ?", lclT.getCode()) %>
		</label>
	</div>
	<div class="small-12 medium-2 columns">
		<label>
			Tossups Heard
			<%= lclOF.number("TossupsHeard").min(0) %>
		</label>
	</div>
	
	<div class="small-12 medium-6 large-3 columns">
		<label>
			Incoming Player with Winning Card
			<%= lclOF.<Player>dropdown("IncomingWinningCardPlayer").filter(argP -> argP.getTournament() == lclT) %>
		</label>
	</div>
	<div class="small-12 medium-6 large-3 columns">
		<label>
			Incoming Player with Losing Card
			<%= lclOF.<Player>dropdown("IncomingLosingCardPlayer").filter(argP -> argP.getTournament() == lclT) %>
		</label>
	</div>
	<div class="small-12 medium-6 large-3 columns">
		<label>
			Outgoing Player with Winning Card
			<%= lclOF.<Player>dropdown("OutgoingWinningCardPlayer").filter(argP -> argP.getTournament() == lclT) %>
		</label>
	</div>
	<div class="small-12 medium-6 large-3 columns">
		<label>
			Outgoing Player with Losing Card
			<%= lclOF.<Player>dropdown("OutgoingLosingCardPlayer").filter(argP -> argP.getTournament() == lclT) %>
		</label>
	</div>
</div>

<div class="row"><%
	List<OpalForm<Performance>> lclPOFs = lclOF.children("Performance", PerformanceFactory.getInstance(), 1, Performance.PlayerNameComparator.getInstance());
	for (OpalForm<Performance> lclPOF : lclPOFs) {
		Performance lclPerf = lclPOF.getUserFacing(); // may be null
		Player lclPlayer = lclPOF.isNew() ? null : lclPerf.getPlayer();
		%><div class="small-12 large-6 columns">
			<%= lclPOF.open() %><%
				if (lclPOF.isNew()) {
					%><h2>Add Performance</h2><%
				} else {
					%><div class="small-9 medium-10 columns">
						<h2><%= lclPlayer.getName() %></h2>
					</div>
					<div class="small-3 medium-2 columns">
						Delete?&nbsp;<%= HTMLUtility.deleteWidget(lclPOF) %>
					</div><%
				}
				%><div>
					<label>
						Player
						<%= lclPOF.<Player>dropdown("Player").filter(argP -> argP.getTournament() == lclT).namer(Player::getNameWithSchoolShortName) %>
					</label>
				</div>
				<table>
					<thead>
						<tr>
							<th>Question</th>
							<th>Response</th>
							<th>Location</th>
							<th>Replaced With</th>
							<th>Del?</th>
						</tr>
					</thead>
					<tbody><%
						List<OpalForm<Response>> lclROFs = lclPOF.children("Response", ResponseFactory.getInstance(), 1, Response.BASE_PLACEMENT_COMPARATOR);
						for (OpalForm<Response> lclROF : lclROFs) {
							%><%= lclROF.open() %>
								<tr>
									<td><%= lclROF.<Placement>dropdown("BasePlacement").filter(argPL -> argPL.getPacket() == lclRound.getPacket()).namer(Placement::getNumberStringWithQuestionDescription) %></td>
									<td><%= lclROF.<ResponseType>dropdown("ResponseType").namer(ResponseType::getShortName) %></td>
									<td><%= lclROF.number("Location").min(0) %></td>
									<td><%= lclROF.<Placement>dropdown("ReplacementPlacement").filter(argPL -> argPL.getPacket() == lclRound.getPacket().getReplacementPacket()).namer(Placement::getNumberStringWithQuestionDescription) %></td>
									<td><%= HTMLUtility.deleteWidget(lclROF) %></td>
								</tr>
							<%= lclROF.close() %><%
						}
					%></tbody>
				</table>
			<%= lclPOF.close() %>
		</div><%
	}
%></div>

<div class="row">
	<div class="small-12 columns">
		<%= lclOF.submit() %> <%= lclOF.delete() %> <%= lclOF.cancel() %>
	</div>
</div>

<%= lclOF.close() %>

<jsp:include page="/template/footer.jsp" />