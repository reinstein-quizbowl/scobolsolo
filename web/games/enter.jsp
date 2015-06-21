<%@ page import="java.util.Collections" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="org.apache.commons.lang3.Validate" %>
<%@ page import="com.siliconage.util.WebDataFilter" %>
<%@ page import="com.siliconage.web.ControllerServlet" %>
<%@ page import="com.siliconage.web.PriorInput" %>
<%@ page import="com.opal.cma.OpalForm" %>
<%@ page import="com.opal.cma.OpalMainForm" %>
<%@ page import="com.scobolsolo.application.*" %>
<%@ page import="com.scobolsolo.matches.GameEntryResult" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.opalforms.compare.MatchEnteringPriority" %>
<%@ page import="com.scobolsolo.opalforms.nce.*" %>
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
	
	.current-score th, .current-score-value {
		font-size: 200%;
		vertical-align: middle;
		font-weight: 700;
	}
	
	.current-score-value {
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
</style>

<div class="row">
	<div class="small-12 columns"><%
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
				lclClass = "alert-danger";
				lclMayDismiss = false;
				lclHeader = "Error!";
				lclGlyphIcon = "glyphicon glyphicon-exclamation-sign";
			} else if (lclHasMessages) {
				lclClass = "alert-warning";
				lclMayDismiss = false;
				lclHeader = "Warning!";
				lclGlyphIcon = "glyphicon glyphicon-warning-sign";
			} else {
				lclClass = "alert-success alert-dismissable";
				lclMayDismiss = true;
				lclHeader = "Success!";
				lclGlyphIcon = "glyphicon glyphicon-ok";
			}
			
			%><div class="alert <%= lclClass %>" role="alert"><%
				if (lclMayDismiss) {
					%><div class="pull-right">
						<button type="button" class="close" data-dismiss="alert"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
					</div><%
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

		<div class="row">
			<div class="col-md-6">
				<div class="form-group">
					<label for="/Room" class="col-sm-6 control-label">Room</label>
					<div class="col-sm-6" style="margin-bottom: 1em;">
						<%= lclOF.dropdown("Room", Room.SequenceComparator.getInstance()).filter(argR -> argR.getTournament() == lclT) %>
					</div>
				</div>
				
				<div class="form-group">
					<label for="/Game/ModeratorStaff" class="col-sm-6 control-label">Moderator</label>
					<div class="col-sm-6">
						<%= lclGOF.dropdown("ModeratorStaff", Staff.NameComparator.getInstance()).filter(argS -> argS.getTournament() == lclT).namer(StaffNCE.getInstance()) %>
					</div>
				</div>
			</div>

			<div class="col-md-6">
				<div class="form-group">
					<label for="/Game/IncomingWinningCardPlayer" class="col-sm-6 control-label">Incoming Holder of <%= lclM.getWinningCard().getName() %></label>
					<div class="col-sm-6">
						<%= lclGOF.dropdown("IncomingWinningCardPlayer", Player.NameComparator.getInstance()).filter(argP -> argP.getTournament() == lclT).namer(PlayerNCE.getInstance()) %>
					</div>
				</div>
				
				<div class="form-group">
					<label for="/Game/IncomingLosingCardPlayer" class="col-sm-6 control-label">Incoming Holder of <%= lclM.getLosingCard().getName() %></label>
					<div class="col-sm-6">
						<%= lclGOF.dropdown("IncomingLosingCardPlayer", Player.NameComparator.getInstance()).filter(argP -> argP.getTournament() == lclT).namer(PlayerNCE.getInstance()) %>
					</div>
				</div>
			</div>

			<div class="col-md-12 text-center" style="margin-bottom: 3em;">
				<div class="submit btn-group btn-group-3">
					<%= lclOF.submit("Save") %>
					<%= lclOF.cancel() %>
				</div>
			</div>
		</div>

		<%= lclGOF.close() %>
		<%= lclOF.close() %>

		<div class="col-md-12"><%
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
					
					<table class="responsive">
						<thead>
							<tr>
								<%= lclMultiplePackets ? "<th>Packet</th>" : "" %>
								<th>Answer</th>
								<th>Category</th>
								<th class="response-column">Response for <%= lclLeftPlayer.getContact().getName() %></th>
								<th class="center"><a href="enter.jsp?match_id=<%= lclM.getId() %>&flip=<%= !lclFlip %>" title="Swap sides" class="btn btn-default btn-xs"><span class="glyphicon glyphicon-resize-horizontal"></span></a></th>
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
										<div class="responses btn-group btn-group-justified" width="100%" data-toggle="buttons"><%
											String lclFieldName = lclPL.generateResponseKey(lclLeftPlayer);
											
											lclLeftPlayerResponseFieldNames.add(lclFieldName);
											
											for (ResponseType lclRT : RESPONSE_TYPES) {
												String lclRadioId = lclFieldName + "_" + lclRT.getCode();
												lclLeftPlayerResponseRadioIds.add(lclRadioId);
												
												boolean lclSelected = lclLeftResponse == null ? lclRT == DEFAULT_RESPONSE_TYPE : lclRT == lclLeftResponse.getResponseType();
												%><label title="<%= lclRT.getName() %>" class="response btn btn-xs <%= lclRT.getBootstrapButtonClass() %>">
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
										<div class="responses btn-group btn-group-justified" width="100%" data-toggle="buttons"><%
											lclFieldName = lclPL.generateResponseKey(lclRightPlayer);
											
											lclRightPlayerResponseFieldNames.add(lclFieldName);
											
											for (ResponseType lclRT : RESPONSE_TYPES) {
												String lclRadioId = lclFieldName + "_" + lclRT.getCode();
												lclRightPlayerResponseRadioIds.add(lclRadioId);
												
												boolean lclSelected = lclRightResponse == null ? lclRT == DEFAULT_RESPONSE_TYPE : lclRT == lclRightResponse.getResponseType();
												%><label title="<%= lclRT.getName() %>" class="response btn btn-xs <%= lclRT.getBootstrapButtonClass() %>">
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
										%><span title="Use <%= lclReplacement.getPacket().getName() %> #<%= lclReplacement.getSequence() %> (<%= WebDataFilter.scrub(lclReplacement.getQuestion().getDescription()) %>)">Which?</span>&nbsp;
											<%= lclPI.checkbox("replaced_placement_unique_string_" + lclPL.getUniqueString(), lclReplacement.getUniqueString()) %>
											<!-- FIXME How can we figure out how to display the right thing when loading a page that displays already-entered results including a replacement question? --><%
										// TODO: One of the Responses could be a replacement question but the other not. We currently have no way to indicate this on the web interface.
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
							<tr class="current-score info">
								<th colspan="2">Score</th>
								<td class="current-score-value" id="current_score_left">&nbsp;</td>
								<td>&nbsp;</td>
								<td class="current-score-value" id="current_score_right">&nbsp;</td>
								<td>&nbsp;</td>
							</tr>
						</tfoot>
					</table>
					
					<div class="row">
						<div class="col-md-3">
							<div class="input-group">
								<span class="input-group-addon">Tossups Heard</span>
								<%= lclPI.text("tossups_heard", lclG.getTossupsHeardAsObject() != null ? String.valueOf(lclG.getTossupsHeard()) : String.valueOf(lclTotalRegulationQuestions)) %>
								<!-- FIXME Use input type=number when PriorInput supports that -->
							</div>
						</div>
						
						<div class="col-md-3">
							<div class="submit btn-group-1">
								<input type="submit" value="Save" />
							</div>
						</div>
					</div>
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
					
					$(document).ready(function() {
						$('form').addClass('form-horizontal');
						
						$('select#\\/Game\\/ModeratorStaff').addClass('no-combobox');
						
						$('.responses label:has(input[type=radio]:checked)').addClass('active active-response').siblings().removeClass('active active-response');
						
						$('.responses label').click( function() {
							$(this).addClass('active active-response').siblings().removeClass('active active-response');
						});
						
						// $('input[type=checkbox]').bootstrapSwitch({size: 'mini', onText: '&#10004;', offText: '&#10008;'});
						
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
				</script><%
				// TODO: only allow tiebreaker if tied after regulation
			}
		%></div>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
