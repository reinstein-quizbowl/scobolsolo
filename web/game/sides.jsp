<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.Collection" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.LinkedList" %>
<%@ page import="java.util.stream.Collectors" %>
<%@ page import="org.apache.commons.lang3.ObjectUtils" %>
<%@ page import="org.apache.commons.lang3.Validate" %>
<%@ page import="com.siliconage.web.form.DropdownField" %>
<%@ page import="com.siliconage.web.form.FunctionalNameCodeExtractor" %>
<%@ page import="com.siliconage.web.form.NameCodeExtractor" %>
<%@ page import="com.siliconage.web.form.RadioField" %>
<%@ page import="com.scobolsolo.application.Account" %>
<%@ page import="com.scobolsolo.application.Game" %>
<%@ page import="com.scobolsolo.application.Match" %>
<%@ page import="com.scobolsolo.application.MatchFactory" %>
<%@ page import="com.scobolsolo.application.Player" %>
<%@ page import="com.scobolsolo.application.Staff" %>
<%@ page import="com.scobolsolo.application.Tournament" %>
<%@ page import="com.scobolsolo.matches.MatchStatus" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<%
Match lclMatch = Validate.notNull(MatchFactory.getInstance().fromHttpRequest(request));
Account lclUser = Account.demand(request);
Validate.isTrue(lclMatch.mayBeEnteredBy(lclUser), "Not authorized");
Game lclGame = lclMatch.getGame(); // may be null

Tournament lclT = lclMatch.getTournament();
Staff lclS = lclUser.getContact().findStaff(lclT);
MatchStatus lclStatus = lclMatch.determineStatus();
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="<%= lclT.getCode() %>" />
    <jsp:param name="pageTitle" value="Game Entry" />
	<jsp:param name="topMenu" value="<%= Menus.staff(lclUser.findStaff(lclT)).asTopLevel().output(request, \"match-\" + lclMatch.getUniqueString()) %>" />
	<jsp:param name="h1" value="<%= lclMatch.getRound().getName() %>" />
</jsp:include>

<form action="SetSides" method="post">
	<input type="hidden" name="match_id" value="<%= lclMatch.getId() %>" />
	<div class="row" data-equalizer>
		<div class="small-12 medium-12 large-4 columns">
			<fieldset data-equalizer-watch>
				<legend>Moderator</legend><%
				if (lclUser.isAdministrator()) {
					Staff lclSelectedStaff = lclGame == null ? ObjectUtils.firstNonNull(lclMatch.determineLikelyModerator(), lclS) : lclGame.getModeratorStaff();
					%><label>
						<%= new DropdownField<>(
							"moderator_staff_id",
							lclT.getStaff(),
							lclSelectedStaff,
							new FunctionalNameCodeExtractor<>(Staff::getName, Staff::getUniqueString)
					) %></label><%
			%></fieldset><%
			} else {
				%><p>If the moderator for this match is someone other than you (<%= lclUser.getContact().getName() %>), contact the control room (<%= lclT.getControlRoom().getName() %>).</p><%
			}
		%></div><%
		List<Player> lclCandidates;
		NameCodeExtractor<Player> lclPlayerNCE = new FunctionalNameCodeExtractor<>(Player::getNameWithSchoolShortName, Player::getUniqueString); 
		
		switch (lclStatus) {
			case NO_DATA:
				lclCandidates = lclT.getPlayers();
				break;
			case ONE_PLAYER_KNOWN:
				Validate.notNull(lclGame);
				lclCandidates = new LinkedList<>(lclT.getPlayers());
				lclCandidates.add(0, lclGame.getSingleKnownPlayer());
				break;
			case READY:
			case IN_PROGRESS:
			case COMPLETE:
				lclCandidates = Arrays.asList(lclGame.getIncomingWinningCardPlayer(), lclGame.getIncomingLosingCardPlayer());
				break;
			default: throw new IllegalStateException("Unknown MatchStatus " + lclStatus);
		}
		
		%><div class="small-12 medium-6 large-4 columns"><%= makeChoices(lclCandidates, lclPlayerNCE, "left_player_id", "Left Player") %></div>
		<div class="small-12 medium-6 large-4 columns"><%= makeChoices(lclCandidates, lclPlayerNCE, "right_player_id", "Right Player") %></div>
	</div><%
	
	if (lclMatch.requiresIdentificationOfWinningAndLosingCardPlayers()) {
		%><div class="row">
			<div class="small-12 medium-6 columns">
				<fieldset>
					<legend>Which came in with the <em>winning</em> card&nbsp;(<%= lclMatch.getWinningCard().getShortName() %>)?</legend>
					<label><input type="radio" name="winning_card_holder" value="left" checked="checked" />&nbsp;the left player</label>
					<label><input type="radio" name="winning_card_holder" value="right" />&nbsp;the right player</label>
				</fieldset>
			</div>
		</div><%
	}
	
	%><div class="row">
		<div class="small-12 columns">
			<input type="submit" value="Continue..." />
		</div>
	</div>
</form>

<script type="text/javascript">
	function radioSidesUpdated(argWhich) {
		var lclLeftButtons = $('input[name=left_player_id]:radio');
		var lclLeftChecked = $('input[name=left_player_id]:radio:checked').val();
		var lclRightButtons = $('input[name=right_player_id]:radio');
		var lclRightChecked = $('input[name=right_player_id]:radio:checked').val();
		
		var lclIsLeft = argWhich.getAttribute('name') == 'left_player_id';
		
		if (lclIsLeft) {
			if (lclRightButtons.length == 2) {
				// Find the value on the right side that isn't the left one's value, and check it
				for (var lclI = 0; lclI < lclRightButtons.length; ++lclI) { // Lame!
					if (lclRightButtons[lclI].getAttribute('value') != lclLeftChecked) {
						lclRightButtons[lclI].checked = true;
					}
				}
			}
		} else {
			if (lclLeftButtons.length == 2) {
				// Find the value on the left side that isn't the right one's value, and check it
				for (var lclI = 0; lclI < lclLeftButtons.length; ++lclI) { // Lame!
					if (lclLeftButtons[lclI].getAttribute('value') != lclRightChecked) {
						lclLeftButtons[lclI].checked = true;
					}
				}
			}
		}
	}
	
	function dropdownSidesUpdated(argWhich) {
		return;
	}
</script>

<jsp:include page="/template/footer.jsp" />
<%!

String makeChoices(Collection<Player> argCandidates, NameCodeExtractor<Player> argNCE, String argName, String argLabel) {
	Validate.notNull(argCandidates); // but it may be empty
	Validate.notNull(argNCE);
	Validate.notEmpty(argName);
	Validate.notEmpty(argLabel);
	
	boolean lclUseRadios = argCandidates.size() <= 4; // Magic number!
	
	if (lclUseRadios) {
		StringBuilder lclSB = new StringBuilder()
			.append("<fieldset data-equalizer-watch>")
			.append("<legend>").append(argLabel).append("</legend>");
		for (Player lclP : argCandidates) {
			lclSB.append("<label id=\"").append(argName).append("_label_").append(argNCE.extractCode(lclP)).append("\">")
				.append(new RadioField<>(argName, argNCE.extractCode(lclP), false, null).attribute("onchange", "radioSidesUpdated(this)").required())
				.append("&nbsp;")
				.append(argNCE.extractName(lclP))
				.append("</label>");
		}
		lclSB.append("</fieldset>");
		
		return lclSB.toString();
	} else {
		return "<fieldset data-equalizer-watch><legend>" + argLabel + "</legend>" + (new DropdownField<>(argName, argCandidates, argNCE).attribute("onchange", "dropdownSidesUpdated(this)")).required() + "</fieldset>";
	}
}

%>