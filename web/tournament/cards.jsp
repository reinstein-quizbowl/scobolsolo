<%@ page import="java.util.List" %>
<%@ page import="org.apache.commons.lang3.Validate" %>
<%@ page import="com.opal.cma.OpalForm" %>
<%@ page import="com.opal.cma.OpalMainForm" %>
<%@ page import="com.scobolsolo.application.*" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.opalforms.nce.PlayerNCE" %>
<%@ page import="com.scobolsolo.HTMLUtility" %>

<%
OpalMainForm<Phase> lclOF = OpalForm.create(
	session,
	request,
	"/OpalFormController",
	PhaseFactory.getInstance().forUniqueString(request.getParameter("object")),
	PhaseFactory.getInstance()
);
Phase lclP = Validate.notNull(lclOF.getUserFacing());
Tournament lclT = lclP.getTournament();
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="<%= lclT.getCode() %>" />
	<jsp:param name="pageTitle" value="<%= \"Cards for \" + lclP.getName() %>" />
	<jsp:param name="topMenu" value="<%= Menus.tournamentAdmin(lclT).asTopLevel().output(request, \"cards-\" + lclT.getUniqueString()) %>" />
	<jsp:param name="h1" value="<%= \"Cards for \" + lclP.getName() %>" />
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
	<div class="small-12 columns">
		<table class="responsive">
			<thead>
				<tr>
					<th>Name</th>
					<th>Short&nbsp;name</th>
					<th>Initial&nbsp;player</th>
					<th>Sequence</th>
					<th>Edit</th>
					<th>Delete?</th>
				</tr>
			</thead>
			<tbody><%
				List<OpalForm<Card>> lclCOFs = lclOF.children(
					"Card",
					CardFactory.getInstance(),
					1, // row for a new card
					Card.SequenceComparator.getInstance()
				);
				
				for (OpalForm<Card> lclCOF : lclCOFs) {
					Card lclC = lclCOF.getUserFacing();
					
					%><tr>
						<%= lclCOF.open() %>
						<td><%= lclCOF.text("Name", 20) %></td>
						<td><%= lclCOF.text("ShortName", 10) %></td>
						<td><%= lclCOF.dropdown("InitialPlayer", Player.NameComparator.getInstance()).filter(argP -> argP.getTournament() == lclT).namer(PlayerNCE.getInstance()) %></td>
						<td><%= lclCOF.text("Sequence", 3) %></td>
						<td><%= lclC == null ? "&nbsp;" : "<a href=\"card-edit.jsp?card_id=" + lclC.getId() + "\">Edit</a>" %></td>
						<td><%= HTMLUtility.deleteWidget(lclCOF) %></td>
						<%= lclCOF.close() %>
					</tr><%
				}
			%></tbody>
		</table>
	</div>
</div>

<div class="row">
	<div class="small-12 columns">
		<%= lclOF.submit() %> <%= lclOF.cancel() %>
	</div>
</div>

<%= lclOF.close() %>

<div class="row">
	<div class="small-12 columns">
		<h2 id="create">Create Cards</h2>
		<form action="CreateCards" method="post">
			<input type="hidden" name="phase_id" value="<%= lclP.getId() %>"><%
			if (lclP.getCardCount() > 0) {
				%><p>The <%= lclP.getCardCount() %> existing <%= lclP.getCardCount() == 1 ? "card" : "cards" %> will be deleted and new ones created.</p><%
			}
			
			%><div class="row">
				<div class="small-4 medium-5 columns">
					<label>
						Smallest number
						<input type="number" min="0" step="1" id="smallest_number" name="smallest_number" value="1" required />
					</label>
				</div>
				<div class="small-4 medium-5 columns">
					<label>
						Largest number
						<input type="number" min="1" step="1" id="largest_number" name="largest_number" required />
					</label>
				</div>
				<div class="small-4 medium-2 columns button-in-row">
					<input type="submit" value="Create" />
				</div>
			</div>
		</form>
	</div>
</div>

<div class="row">
	<div class="small-12 columns">
		<h2 id="set-up">Set Up Card System</h2>
		
		<form action="DownloadSpreadsheetForCardSystem" method="get">
			<input type="hidden" name="phase_id" value="<%= lclP.getId() %>" />
			
			<p>After creating <a href="rounds.jsp?object=<%= lclT.getUniqueString() %>">rounds</a>, <a href="rooms.jsp?object=<%= lclT.getUniqueString() %>">rooms</a>, and <a href="#create">cards</a>, download this spreadsheet and fill it in with the card system. Each cell should be the <span title="typically just the number">short name</span> of one of the two cards that will play in the indicated room during the indicated round.</p>
			
			<div class="row">
				<div class="small-12 columns">
					<input type="submit" value="Download spreadsheet" />
				</div>
			</div>
		</form>
	</div>
</div>

<div class="row">
	<div class="small-12 columns">
		<form action="UploadCardSystem" method="post" enctype="multipart/form-data">
			<input type="hidden" name="phase_id" value="<%= lclP.getId() %>" />
			<p>Having filled out the above spreadsheet, upload it here. Matches already assigned to rooms and rounds assigned in the uploaded spreadsheet will be deleted if they have no results; if they do have results, an error will occur.</p>
			
			<div class="row">
				<div class="small-12 columns">
					<label>
						File
						<input id="file" type="file" name="file">
					</label>
				</div>
			</div>
			<div class="row">
				<div class="small-12 columns" style="padding-top: 20px;">
					<input type="submit" value="Upload card system" style="margin-bottom: 0;" />
				</div>
			</div>
		</form>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
