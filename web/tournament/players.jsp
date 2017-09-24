<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.scobolsolo.application.*" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<%
Tournament lclT = TournamentFactory.getInstance().fromHttpRequest(request, "object");

boolean lclCardsAssigned = lclT.hasCardsAssigned();
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="<%= lclT.getCode() %>" />
	<jsp:param name="pageTitle" value="Players" />
	<jsp:param name="topMenu" value="<%= Menus.tournamentAdmin(lclT).asTopLevel().output(request, \"players-\" + lclT.getUniqueString()) %>" />
	<jsp:param name="h1" value="Players" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>Drag the rows to rearrange players' seeds. Your changes will not be saved until you hit &#8216;Save'.</p>
		
		<form action="RearrangeSeeds" method="post" onsubmit="javascript:populateSeeds()">
		<input type="hidden" name="tournament_code" value="<%= lclT.getCode() %>">
		
		<table class="responsive">
			<thead>
				<tr>
					<th>New&nbsp;seed</th>
					<th>Name</th>
					<th>School</th>
					<th>Grade</th>
					<th>Rank&nbsp;within&nbsp;school</th>
					<th>Saved&nbsp;seed</th>
					<%= lclCardsAssigned ? "<th>Initial&nbsp;card</th>" : "" %>
				</tr>
			</thead>
			<tbody class="reorderable"><%
				List<Player> lclPlayers = lclT.getPlayers();
				lclPlayers.sort(Player.SeedComparator.getInstance());
				
				for (Player lclP : lclPlayers) {
					%><tr class="ui-state-default">
						<td><input type="number" readonly="readonly" class="number-widget" id="player_<%= lclP.getId() %>_seed" name="player_<%= lclP.getId() %>_seed" value="<%= lclP.getSeed("?") %>" /></td>
						<td data-tablesorter="<%= lclP.getContact().getSortBy() %>"><a href="player-edit.jsp?player_id=<%= lclP.getId() %>"><%= lclP.getContact().getName() %></a></td>
						<td data-tablesorter="<%= lclP.getSchoolRegistration().getSchool().getShortName() %>"><a href="school-registration-edit.jsp?school_registration_id=<%= lclP.getSchoolRegistration().getId() %>"><%= lclP.getSchoolRegistration().getSchool().getShortName() %></a></td>
						<td data-tablesorter="<%= lclP.getSchoolYear() == null ? 0 : lclP.getSchoolYear().getSequence() %>"><%= lclP.getSchoolYear() == null ? "?" : lclP.getSchoolYear().getShortName() %></td>
						<td><%= lclP.getRankWithinSchool("?") %></td>
						<td class="saved-seed"><%= lclP.getSeed("?") %></td><%
						if (lclCardsAssigned) {
							%><td><a href="card-edit.jsp?card_id=<%= lclP.getInitialCard().getId() %>"><%= lclP.getInitialCard().getShortName() %></a></td><%
						}
					%></tr><%
				}
			%></tbody>
		</table>
		
		<input type="submit" value="Save" />
		
		</form>
	</div>
</div><%

Phase lclP = lclT.findFirstPhase();
if (lclP != null && lclP.isCardSystem()) {
	%><div class="row">
		<div class="small-12 columns">
			<h2 id="assign-cards">Assign Initial Cards</h2><%
			int lclCardCount = lclP.getCardSet().size();
			
			if (lclPlayers.size() != lclCardCount) {
				%><p>This is not currently possible because <%= lclPlayers.size() == 1 ? "there is one player" : "there are " + lclPlayers.size() + " players" %> but <%= lclCardCount == 1 ? "one card" : String.valueOf(lclCardCount) + " cards" %>. Ensure that the number of players is equal to the number of cards.</p><%
			} else if (lclT.hasValidSeeds() == false) {
				%><p>This tournament's seeds are not valid. Ensure that there are <%= lclPlayers.size() %> distinct seeds, and every player has a seed.</p><%
			} else {
				%><form action="AssignCards" method="post">
				<input type="hidden" name="phase_id" value="<%= lclP.getId() %>">
				
				<p>Cards will be randomized so that seeds are hidden (but the correct matchups are preserved).</p><%
				if (lclCardsAssigned) {
					%><p>The existing card assignments will be deleted and new ones created.<%
				}
				
				%><div class="submit btn-group btn-group-1">
					<input type="submit" name="Submit" value="Assign" />
				</div>
				</form><%
			}
		%></div>
	</div>
	
	<div class="row">
		<div class="small-12 columns">
			<h2 id="assign-cards">Unassign Initial Cards</h2>
			<form action="UnassignCards" method="post">
				<input type="hidden" name="phase_id" value="<%= lclP.getId() %>">
				<div class="submit btn-group btn-group-1">
					<input type="submit" name="Submit" value="Assign" />
				</div>
			</form>
		</div>
	</div><%
}

%><style type="text/css">
	.reorderable tr {
		background-color: #fff;
		cursor: grab;
	}
	
	.reorderable a {
		cursor: pointer;
	}
	
	input[readonly].number-widget {
		width: 4em;
		cursor: not-allowed;
		background-color: inherit !important;
		border: none;
	}
</style>

<script>
	var renumber = function(argMoved) {
		var lclCurrentNumber = 1;
		extractNumberWidgets(argMoved.parent()).each(
			function(argI, argWidget) {
				$(argWidget).val(lclCurrentNumber);
				++lclCurrentNumber;
			}
		);
	};
	
	var extractNumberWidgets = function(argParent) {
		return argParent.find("input[type=number].number-widget");
	};
	
	$(
		function() {
			$('.reorderable').sortable(
				{
					axis: 'y',
					containment: 'parent',
					cursor: 'grabbing',
					update: function(argEvent, argUI) {
						renumber(argUI.item);
					},
					helper: function(argEvent, argRow) {
						// from http://stackoverflow.com/questions/1307705/jquery-ui-sortable-with-table-and-tr-width
						var lclOriginals = argRow.children();
						
						var lclHelper = argRow.clone();
						
						lclHelper.children().each(
							function(argIndex, argChild) {
								$(this).width(lclOriginals.eq(argIndex).width());
							}
						);
						
						return lclHelper;
					}
				}
			);
			$('.reorderable').disableSelection();
		}
	);
</script>

<jsp:include page="/template/footer.jsp" />