<%@ page import="java.util.Collections" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="org.apache.commons.lang3.Validate" %>
<%@ page import="com.siliconage.util.WebDataFilter" %>
<%@ page import="com.siliconage.web.ControllerServlet" %>
<%@ page import="com.siliconage.web.form.PriorInput" %>
<%@ page import="com.opal.cma.OpalForm" %>
<%@ page import="com.opal.cma.OpalMainForm" %>
<%@ page import="com.scobolsolo.application.*" %>
<%@ page import="com.scobolsolo.matches.GameEntryResult" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.opalforms.compare.MatchEnteringPriority" %>
<%@ page import="com.scobolsolo.matches.MatchStatus" %>
<%@ page import="com.scobolsolo.AccountUtility" %>

<%
Account lclUser = AccountUtility.demandLoggedInAccount(request);

OpalMainForm<Match> lclOF = OpalForm.create(
	session,
	request,
	"/OpalFormController",
	MatchFactory.getInstance(),
	"match_id"
);
Match lclM = lclOF.getUserFacing();
Tournament lclT = lclM.getRound().getRoundGroup().getPhase().getTournament();

Validate.isTrue(lclUser.mayUpdate(lclT));

OpalForm<Game> lclGOF = lclOF.targetForm("Game", GameFactory.getInstance());
Game lclG = lclGOF.getUserFacing();

if (lclUser.isAdministrator() == false) {
	lclOF.disable("Room");
}
if (lclG != null && lclUser.isAdministrator() == false && lclG.getIncomingWinningCardPlayer() != null) {
	lclGOF.disable("IncomingWinningCardPlayer");
}
if (lclG != null && lclUser.isAdministrator() == false && lclG.getIncomingLosingCardPlayer() != null) {
	lclGOF.disable("IncomingLosingCardPlayer");
}
if (lclG != null && lclUser.isAdministrator() == false && lclG.getModeratorStaff() != null) {
	lclGOF.disable("ModeratorStaff");
}

boolean lclFlip = Boolean.parseBoolean(request.getParameter("flip"));
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="<%= lclT.getCode() %>" />
    <jsp:param name="pageTitle" value="Match Entry" />
	<jsp:param name="topMenu" value="<%= Menus.tournamentAdmin(lclT).asTopLevel().output(lclUser, \"games-\" + lclT.getUniqueString()) %>" />
	<jsp:param name="h1" value="<%= lclM.getRound().getName() + \": \" + lclM.getWinningCard().getName() + \" v. \" + lclM.getLosingCard().getName() %>" />
</jsp:include>

<style type="text/css">
	.center {
		text-align: center;
	}
	
	.response-column {
		max-width: 480px;
	}
	
	.active-response {
		font-size: 115%;
		font-weight: 700 !important;
	}
	
	.current-score-header {
		padding-left: 0.5em !important;
	}
	
	.current-score-value {
		padding: 0.5em 0;
		vertical-align: middle;
		font-size: 200%;
		font-weight: 700;
		text-align: center;
	}
	
	.scorecheck {
		font-size: 150%;
		text-align: center;
	}
	
	.responses * {
		border-bottom: 0 !important;
	}
	
	.question-number {
		text-align: center;
	}
	
	.swap-button {
		color: #fff;
		font-size: 16pt;
	}
</style>

<div class="row"><%
	GameEntryResult lclGER = (GameEntryResult) session.getAttribute("com.scobolsolo.matches.GameEntryResult");
	String lclPassBackKey = "GAME_ENTRY" + (lclG == null ? "" : "_" + lclG.getId());
	if (lclGER != null && lclG != null && lclGER.getGame() == lclG) {
		String lclClass, lclHeader, lclGlyphIcon;
		boolean lclMayDismiss;
		
		String lclPassBackErrors = ControllerServlet.generatePassBackErrorHTML(session, lclPassBackKey, null);
		boolean lclHasErrors = lclGER.hasError() || (lclPassBackErrors != null && lclPassBackErrors.length() > 0);
		
		String lclPassBackMessages = ControllerServlet.generatePassBackMessageHTML(session, lclPassBackKey, null);
		boolean lclHasMessages = lclGER.getMessages().size() > 0 || (lclPassBackMessages != null && lclPassBackMessages.length() > 0);
		
		if (lclHasErrors) {
			lclClass = "alert";
			lclMayDismiss = false;
			lclHeader = "Error!";
			lclGlyphIcon = "fi-alert";
		} else if (lclHasMessages) {
			lclClass = "warning";
			lclMayDismiss = false;
			lclHeader = "Warning!";
			lclGlyphIcon = "fi-alert";
		} else {
			lclClass = "success";
			lclMayDismiss = true;
			lclHeader = "Success!";
			lclGlyphIcon = "fi-check";
		}
		
		%><div data-alert class="alert-box <%= lclClass %>" aria-live="assertive" role="dialogalert"><%
			if (lclMayDismiss) {
				%><a href="#" class="close" aria-label="Close Alert">&times;</a><%
			}
			%><p><span class="<%= lclGlyphIcon %>"></span> <strong><%= lclHeader %></strong> <%= lclGER.determineHeader(lclHasErrors) %></p><%
			
			if (lclPassBackErrors != null && lclPassBackErrors.length() > 0) {
				%><%= lclPassBackErrors %><br /><%
			}
			
			if (lclPassBackMessages != null && lclPassBackMessages.length() > 0) {
				%><%= lclPassBackMessages %><br /><%
			}
			
			List<String> lclGERMessages = lclGER.getMessages();
			if (lclGERMessages.size() > 0) {
				if (lclGERMessages.size() == 1) {
					%><p><%= lclGERMessages.get(0) %></p><%
				} else {
					%><ul><%
						for (String lclE : lclGERMessages) {
							%><li><%= lclE %></li><%
						}
					%></ul><%
				}
			}
			
			Player lclWinner = lclGER.getWinnerPlayer();
			Match lclNextForWinner = lclGER.getNextMatchForWinner();
			Player lclLoser = lclGER.getLoserPlayer();
			Match lclNextForLoser = lclGER.getNextMatchForLoser();
			
			if (lclWinner != null && lclNextForWinner != null) {
				%><p>
					<%= lclWinner.getContact().getName() %>'s next match is in <%= lclNextForWinner.getRoom().getName() %> during <%= lclNextForWinner.getRound().getNameWithStartTime() %><%
					if (lclNextForWinner.getGame() != null) {
						Player lclNextIWCPlayer = lclNextForWinner.getGame().getIncomingWinningCardPlayer();
						Player lclNextILCPlayer = lclNextForWinner.getGame().getIncomingLosingCardPlayer();
						
						if (lclNextIWCPlayer != null && lclNextIWCPlayer != lclWinner) {
							%> against <%= lclNextIWCPlayer.getContact().getName() %>.<% 
						} else if (lclNextILCPlayer != null && lclNextILCPlayer != lclWinner) {
							%> against <%= lclNextILCPlayer.getContact().getName() %>.<%
						} else {
							%>.<%
						}
					}
				%></p><%
			}
			
			if (lclLoser != null && lclNextForLoser != null) {
				%><p>
					<%= lclLoser.getContact().getName() %>'s next match is in <%= lclNextForLoser.getRoom().getName() %> during <%= lclNextForLoser.getRound().getNameWithStartTime() %><%
					if (lclNextForLoser.getGame() != null) {
						Player lclNextIWCPlayer = lclNextForLoser.getGame().getIncomingWinningCardPlayer();
						Player lclNextILCPlayer = lclNextForLoser.getGame().getIncomingLosingCardPlayer();
						
						if (lclNextIWCPlayer != null && lclNextIWCPlayer != lclLoser) {
							%> against <%= lclNextIWCPlayer.getContact().getName() %>.<% 
						} else if (lclNextILCPlayer != null && lclNextILCPlayer != lclLoser) {
							%> against <%= lclNextILCPlayer.getContact().getName() %>.<%
						} else {
							%>.<%
						}
					}
				%></p><%
			}
		%></div><%
		session.removeAttribute("com.scobolsolo.matches.GameEntryResult");
	}

	%><%= lclOF.open() %>
	<%= lclGOF.open() %>
</div>

<div class="row">
	<div class="small-12 medium-6 columns">
		<label>
			Room
			<%= lclOF.dropdown("Room", Room.SequenceComparator.getInstance()).filter(argR -> argR.getTournament() == lclT) %>
		</label>
	</div>
	
	<div class="small-12 medium-6 columns">
		<label>
			Moderator
			<%= lclGOF.dropdown("ModeratorStaff", Staff.NameComparator.getInstance()).filter(argS -> argS.getTournament() == lclT).namer(argS -> argS.getContact().getName()) %>
		</label>
	</div>
	
	<div class="small-12 medium-6 columns">
		<label>
			Incoming Holder of <%= lclM.getWinningCard().getName() %>
			<%= lclGOF.dropdown("IncomingWinningCardPlayer", Player.NameComparator.getInstance()).filter(argP -> argP.getTournament() == lclT).namer(argP -> argP.getContact().getName()) %>
		</label>
	</div>
	
	<div class="small-12 medium-6 columns">
		<label>
			Incoming Holder of <%= lclM.getLosingCard().getName() %>
			<%= lclGOF.dropdown("IncomingLosingCardPlayer", Player.NameComparator.getInstance()).filter(argP -> argP.getTournament() == lclT).namer(argP-> argP.getContact().getName()) %>
		</label>
	</div>
	
	<div class="small-12 columns text-center">
		<%= lclOF.submit("Save") %>
		<%= lclOF.cancel() %>
	</div>
</div>

<%= lclGOF.close() %>
<%= lclOF.close() %><%

if (lclM.determineStatus().mayEnterData()) {
	Player lclIncomingWinningCardPlayer = lclG.getIncomingWinningCardPlayer();
	Player lclIncomingLosingCardPlayer = lclG.getIncomingLosingCardPlayer();
	
	Player lclLeftPlayer, lclRightPlayer;
	if (lclFlip) {
		lclLeftPlayer = lclIncomingLosingCardPlayer;
		lclRightPlayer = lclIncomingWinningCardPlayer;
	} else {
		lclLeftPlayer = lclIncomingWinningCardPlayer;
		lclRightPlayer = lclIncomingLosingCardPlayer;
	}
	
	Performance lclLeftPerformance = lclLeftPlayer.findPerformance(lclG);
	Performance lclRightPerformance = lclRightPlayer.findPerformance(lclG);
	
	Packet[] lclPackets = lclM.getRound().createPacketArray();
	boolean lclMultiplePackets = lclPackets.length > 1;
	if (lclMultiplePackets) {
		Arrays.sort(lclPackets, Packet.StandardComparator.getInstance());
	}
	
	ResponseType[] RESPONSE_TYPES = ResponseTypeFactory.getInstance().createAllArray();
	Arrays.sort(RESPONSE_TYPES);
	ResponseType DEFAULT_RESPONSE_TYPE = null;
	for (ResponseType lclRT : RESPONSE_TYPES) {
		if (lclRT.isDefault()) {
			DEFAULT_RESPONSE_TYPE = lclRT;
		}
	}
	
	List<String> lclLeftPlayerResponseFieldNames = new ArrayList<>();
	List<String> lclLeftPlayerResponseRadioIds = new ArrayList<>();
	
	List<String> lclRightPlayerResponseFieldNames = new ArrayList<>();
	List<String> lclRightPlayerResponseRadioIds = new ArrayList<>();
	
	%><form name="game" action="GameEntry" method="post" accept-charset="utf-8">
		<%= ControllerServlet.generatePassBack(lclPassBackKey) %><%
		
		PriorInput lclPI = ControllerServlet.getPriorInput(session, lclPassBackKey);
		
		%><%= lclPI.hidden("game_id", String.valueOf(lclG.getId())) %>
		<%= lclPI.hidden("flip", String.valueOf(lclFlip)) %>
		
		<div class="row">
			<div class="small-12 columns">
				<table class="responsive">
					<thead>
						<tr>
							<%= lclMultiplePackets ? "<th>Packet</th>" : "" %>
							<th>Answer</th>
							<th>Category</th>
							<th class="response-column">Response for <%= lclLeftPlayer.getContact().getName() %></th>
							<th class="center">
								<a href="dual-game-enter.jsp?match_id=<%= lclM.getId() %>&flip=<%= !lclFlip %>" title="Swap sides" class="info button tiny stealth-tool-tip">
									<span class="fa fa-refresh"></span>
								</a>
							</th>
							<th class="response-column">Response for <%= lclRightPlayer.getContact().getName() %></th>
							<th>Replaced?</th>
						</tr>
					</thead>
					<tbody><%
					int lclTotalRegulationQuestions = 0;
					int lclTotalQuestions = 0;
					
					for (Packet lclPacket : lclPackets) {
						Placement[] lclPlacements = lclPacket.createPlacementArray();
						Arrays.sort(lclPlacements, Placement.StandardComparator.getInstance());
						
						for (Placement lclPL : lclPlacements) {
							Question lclQ = lclPL.getQuestion();
							Response lclLeftResponse = lclLeftPerformance == null ? null : lclLeftPerformance.findResponse(lclPL);
							Response lclRightResponse = lclRightPerformance == null ? null : lclRightPerformance.findResponse(lclPL);
							
							%><tr>
								<%= lclMultiplePackets ? "<td>" + lclPacket.getShortName() + "</td>" : "" %>
								<td><%= lclQ.getDescription() %></td>
								<td><%= lclQ.getCategory().getShortName() %></td>
								<td class="response-column">
									<div class="responses"><%
										String lclFieldName = lclPL.generateResponseKey(lclLeftPlayer);
										
										lclLeftPlayerResponseFieldNames.add(lclFieldName);
										
										for (ResponseType lclRT : RESPONSE_TYPES) {
											String lclRadioId = lclFieldName + "_" + lclRT.getCode();
											lclLeftPlayerResponseRadioIds.add(lclRadioId);
											
											boolean lclSelected = lclLeftResponse == null ? lclRT == DEFAULT_RESPONSE_TYPE : lclRT == lclLeftResponse.getResponseType();
											%><label title="<%= lclRT.getName() %>" class="response">
												<%= lclPI.radio(lclFieldName, lclRT.getCode(), lclSelected) %>
												<%= lclRT.getShortName() %>
											</label><%
										}
									%></div>
								</td>
								<td class="question-number">
									<%= lclPL.getSequence() %><%
									if (lclPL.isTiebreaker()) {
										%><sup>TB</sup><%
									}
								%></td>
								<td class="response-column">
									<div class="responses"><%
										lclFieldName = lclPL.generateResponseKey(lclRightPlayer);
										
										lclRightPlayerResponseFieldNames.add(lclFieldName);
										
										for (ResponseType lclRT : RESPONSE_TYPES) {
											String lclRadioId = lclFieldName + "_" + lclRT.getCode();
											lclRightPlayerResponseRadioIds.add(lclRadioId);
											
											boolean lclSelected = lclRightResponse == null ? lclRT == DEFAULT_RESPONSE_TYPE : lclRT == lclRightResponse.getResponseType();
											%><label title="<%= lclRT.getName() %>" class="response">
												<%= lclPI.radio(lclFieldName, lclRT.getCode(), lclSelected) %>
												<%= lclRT.getShortName() %>
											</label><%
										}
									%></div>
								</td>
								<td><%
								Placement lclReplacement = lclPL.findReplacement();
								if (lclReplacement == null) {
									%>No replacement available<%
								} else {
									%><label>
										<span title="Use <%= lclReplacement.getPacket().getName() %> #<%= lclReplacement.getSequence() %> (<%= WebDataFilter.scrub(lclReplacement.getQuestion().getDescription()) %>)">Which?</span>&nbsp;
										<%= lclPI.checkbox("replaced_placement_unique_string_" + lclPL.getUniqueString(), lclReplacement.getUniqueString()) %>
									</label>
									<!-- FIXME How can we figure out how to display the right thing when loading a page that displays already-entered results including a replacement question? -->
									<!-- TODO: One of the Responses could be a replacement question but the other not. We currently have no way to indicate this on the web interface. --><%
								}
								%></td>
							</tr><%
							
							if (lclPL.isTiebreaker() == false) {
								++lclTotalRegulationQuestions;
							}
							++lclTotalQuestions;
							
							if (lclPL.isScorecheckAfter()) {
								%><tr class="scorecheck-row warning">
									<td colspan="2">&nbsp;</td>
									<td class="scorecheck" colspan="3">Check the score.</td>
									<td>&nbsp;</td>
								</tr><%
							}
						}
					}
					%></tbody>
					<tfoot>
						<tr>
							<th colspan="2">&nbsp;</th>
							<th class="text-center"><%= lclLeftPlayer.getContact().getName() %></th>
							<th>&nbsp;</td>
							<th class="text-center"><%= lclRightPlayer.getContact().getName() %></th>
							<th>&nbsp;</td>
						</tr>
						<tr class="current-score info">
							<th colspan="2" class="current-score-header">Score</th>
							<th class="current-score-value" id="current_score_left">&nbsp;</th>
							<th>&nbsp;</th>
							<th class="current-score-value" id="current_score_right">&nbsp;</th>
							<th>&nbsp;</th>
						</tr>
					</tfoot>
				</table>
			</div>
		</div>
		
		<div class="row">
			<div class="small-2 small-centered text-center columns">
				<label>
					Tossups Heard
					<%= lclPI.number("tossups_heard", lclG.getTossupsHeard(lclTotalRegulationQuestions)).min(1) %>
				</label>
			</div>
		</div>
		
		<div>
			<div class="small-4 small-centered text-center columns">
				<input type="submit" value="Save" />
				<input type="submit" form="clear" value="Clear Game" />
			</div>
		</div>
	</form>
	
	<form id="clear" action="ClearGame" method="post" onsubmit="return confirm('Are you sure you want to destroy all data about this game that has already been entered? This action cannot be undone.');">
		<input type="hidden" name="game_id" value="<%= lclG.getId() %>" />
	</form>
	
	<script type="text/javascript">
		var lclPointValues = {};<%
		
		for (ResponseType lclRT : RESPONSE_TYPES) {
			%>lclPointValues["<%= lclRT.getCode() %>"] = <%= lclRT.getPoints() %>;<%
		}
		%>
		
		var lclLeftPlayerResponseFieldNames = [<%
		Iterator<String> lclFieldNameIterator = lclLeftPlayerResponseFieldNames.iterator();
		while (lclFieldNameIterator.hasNext()) {
			String lclFieldName = lclFieldNameIterator.next();
			%>"<%= lclFieldName %>"<%
			if (lclFieldNameIterator.hasNext()) {
				%>, <%
			}
		}
		%>];
		
		var lclLeftPlayerResponseRadioIds = [<%
		Iterator<String> lclRadioIdIterator = lclLeftPlayerResponseRadioIds.iterator();
		while (lclRadioIdIterator.hasNext()) {
			String lclRadioId = lclRadioIdIterator.next();
			%>"<%= lclRadioId %>"<%
			if (lclRadioIdIterator.hasNext()) {
				%>, <%
			}
		}
		%>];
		
		var lclRightPlayerResponseFieldNames = [<%
		lclFieldNameIterator = lclRightPlayerResponseFieldNames.iterator();
		while (lclFieldNameIterator.hasNext()) {
			String lclFieldName = lclFieldNameIterator.next();
			%>"<%= lclFieldName %>"<%
			if (lclFieldNameIterator.hasNext()) {
				%>, <%
			}
		}
		%>];
		
		var lclRightPlayerResponseRadioIds = [<%
		lclRadioIdIterator = lclRightPlayerResponseRadioIds.iterator();
		while (lclRadioIdIterator.hasNext()) {
			String lclRadioId = lclRadioIdIterator.next();
			%>"<%= lclRadioId %>"<%
			if (lclRadioIdIterator.hasNext()) {
				%>, <%
			}
		}
		%>];
		
		var lclHasChanged = false;
		
		$(document).ready(function() {
			$('.responses label:has(input[type=radio]:checked)')
				.addClass('active active-response')
				.siblings().removeClass('active active-response');
			
			$('.responses label').click(
				function() {
					$(this).addClass('active active-response').siblings().removeClass('active active-response');
					lclHasChanged = true;
				}
			);
			
			function calculateAndDisplayScores() {
				var lclLeftScore = 0;
				for (var lclI = 0; lclI < lclLeftPlayerResponseRadioIds.length; ++lclI) {
					var lclRadio = document.getElementById(lclLeftPlayerResponseRadioIds[lclI]);
					if (lclRadio.checked) {
						lclLeftScore += lclPointValues[lclRadio.value];
					}
				}
				
				var lclRightScore = 0;
				for (var lclI = 0; lclI < lclRightPlayerResponseRadioIds.length; ++lclI) {
					var lclRadio = document.getElementById(lclRightPlayerResponseRadioIds[lclI]);
					if (lclRadio.checked) {
						lclRightScore += lclPointValues[lclRadio.value];
					}
				}
				
				document.getElementById('current_score_left').innerHTML = lclLeftScore;
				document.getElementById('current_score_right').innerHTML = lclRightScore;
			};
			
			$('.response').on('click', function() {setTimeout(calculateAndDisplayScores, 75)});
			
			document.game.reset();
			calculateAndDisplayScores();
		});
		
		window.onbeforeunload = function() {if (lclHasChanged) {return "Data you have entered may not be saved.";}};
	</script><%
	// TODO: only allow tiebreaker if tied after regulation
}
	%></div>
</div>

<jsp:include page="/template/footer.jsp" />
