<%@ page import="org.apache.commons.lang3.Validate" %>
<%@ page import="com.scobolsolo.application.*" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<%
Tournament lclT = Validate.notNull(TournamentFactory.getInstance().forUniqueString(request.getParameter("object")));
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="<%= lclT.getCode() %>" />
	<jsp:param name="pageTitle" value="Paperwork" />
	<jsp:param name="topMenu" value="<%= Menus.tournamentAdmin(lclT).asTopLevel().output(request, \"paperwork-\" + lclT.getUniqueString()) %>" />
	<jsp:param name="h1" value="Paperwork" />
</jsp:include>

<form action="GeneratePaperwork" method="post">
	<input type="hidden" name="tournament_code" value="<%= lclT.getCode() %>" />
	
	<div class="row">
		<div class="small-12 columns">
			<p>You may generate the following paperwork:</p>
			
			<h2>For the tournament as a whole:</h2>
			<ul class="no-bullet">
				<li><label><input type="checkbox" id="school_welcome_sheets" name="school_welcome_sheets" value="true" />&nbsp;School welcome sheets</label></li>
				<li><label><input type="checkbox" id="player_welcome_sheets" name="player_welcome_sheets" value="true" />&nbsp;Player welcome sheets</label></li>
				<li><label><input type="checkbox" id="staff_welcome_sheets" name="staff_welcome_sheets" value="true" />&nbsp;Staff welcome sheets</label></li>
				<li><label><input type="checkbox" id="championship_rules" name="championship_rules" value="true" />&nbsp;Championship rules</label></li>
				<li><label><input type="checkbox" id="replacement_guides" name="replacement_guides" value="true" />&nbsp;Replacement question guides</label></li>
			</ul><%
				
				for (Phase lclP : lclT.getPhases()) {
					%><h2>For the <%= lclP.getName() %>:</h2>
					<ul class="no-bullet"><%
						if (lclP.isCardSystem()) {
							%><li><label><input type="checkbox" id="player_cards_<%= lclP.getId() %>" name="player_cards_<%= lclP.getId() %>" value="true" />&nbsp;Player cards</label></li>
							<li><label><input type="checkbox" id="room_cards_<%= lclP.getId() %>" name="room_cards_<%= lclP.getId() %>" value="true" />&nbsp;Room cards</label></li>
							<li><label><input type="checkbox" id="master_by_card_<%= lclP.getId() %>" name="master_by_card_<%= lclP.getId() %>" value="true" />&nbsp;Master schedule by card</label></li>
							<li><label><input type="checkbox" id="master_by_room_<%= lclP.getId() %>" name="master_by_room_<%= lclP.getId() %>" value="true" />&nbsp;Master schedule by room</label></li><%
						}
						%><li><label><input type="checkbox" id="scoresheets_<%= lclP.getId() %>" name="scoresheets_<%= lclP.getId() %>" value="true" />&nbsp;Scoresheets</label></li>
					</ul><%
				}
				
			%><label><input type="checkbox" name="include_tex_files" value="true" class="no-bootstrap-switch" />&nbsp;Include <code>.tex</code> files</label>
			
			<input type="submit" value="Generate" />
		</div>
	</div>
</form>

<jsp:include page="/template/footer.jsp" />