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
			<tbody id="sortable"><%
				List<Player> lclPlayers = lclT.getPlayers();
				lclPlayers.sort(Player.SeedComparator.getInstance());
				
				for (Player lclP : lclPlayers) {
					%><tr class="ui-state-default">
						<td class="generated-seed"><input type="hidden" class="generated-seed-target" name="seed-<%= lclP.getId() %>" value="" id="seed-<%= lclP.getId() %>" /></td>
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
			int lclCardCount = lclP.getCardCount();
			
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
	#sortable {
		counter-reset: generatedseed;
	}
	
	#sortable * {
		background-color: #fff;
		cursor: grab;
	}
	
	#sortable a {
		cursor: pointer;
	}
	
	#sortable .generated-seed:after {
		content: "\00a0 " counter(generatedseed);
		counter-increment: generatedseed;
	}
</style>

<script>
	$(function() {
		$("#sortable").sortable({
			axis: 'y',
			containment: 'parent',
			cursor: 'grabbing'
		});
		$("#sortable").disableSelection();
	});
	
	function populateSeeds() {
		var lclSeedTargets = document.getElementsByClassName('generated-seed-target');
		
		for (var lclSeed = 1; lclSeed <= lclSeedTargets.length; ++lclSeed) {
			lclSeedTargets[lclSeed-1].value = lclSeed;
		}
	}
</script>

<jsp:include page="/template/footer.jsp" />