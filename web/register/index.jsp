<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.time.format.FormatStyle" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Comparator" %>
<%@ page import="com.opal.LocalDateCache" %>
<%@ page import="com.scobolsolo.application.SchoolYear" %>
<%@ page import="com.scobolsolo.application.SchoolYearFactory" %>
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
	<jsp:param name="h1" value="<%= \"Register for \" + lclTourn.getName() %>" />
</jsp:include>

<div class="row columns">
	<p><%= lclTourn.getName() %> will take place on <%= lclTourn.getDate().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)) %> at <%= lclTourn.getSiteSchool().getExplainedName() %>.</p>
</div><%

if (lclTourn.getPlayerCountIncludingUnnamedReservedSpots() >= lclTourn.getFieldCap()) {
	%><div class="row columns">
		<p class="warning">The tournament is full. Use this form to register for the waitlist.</p>
	</div><%
}

if (LocalDateCache.today().isAfter(lclTourn.getDate().minusWeeks(1))) {
	%><div class="row columns">
		<p class="warning">The tournament is coming up very soon, so registrations at this point should be considered tentative and will be discussed by email.</p>
	</div><%
}

%><div class="row">
	<div class="small-12 medium-8 large-6 columns">
		
		<form method="post" action="Register" accept-charset="utf-8">
			<section id="school">
				<h2>School</h2>
				
				<div class="row">
					<div class="small-12 columns">
						<label>
							School Name
							<input type="text" name="school_name" id="school_name" autocorrect="off" required="required" />
						</label>
					</div>
				</div>
				<div class="row">
					<div class="small-12 columns">
						<label>
							School City and State
							<div style="display: flex; flex-direction: row;">
								<input type="text" name="school_city" required="required" style="flex: 4; width: unset; margin-right: 1em;" />
								<input type="text" name="school_state" required="required" value="IL" size="2" maxlength="2" style="flex: 1; width: unset;" />
							</div>
						</label>
					</div>
				</div>
			</section>
			
			<section id="contact">
				<h2>Coach/Contact Information</h2>
				
				<div class="row">
					<div class="small-12 columns">
						<label>
							Name
							<input type="text" name="contact_name" required="required" />
						</label>
					</div>
				</div>
				<div class="row">
					<div class="small-12 columns">
						<label>
							Email Address
							<input type="email" name="contact_email" required="required" />
						</label>
					</div>
				</div>
				<div class="row">
					<div class="small-12 columns">
						<label>
							Work Phone
							<input type="tel" name="contact_work_phone" />
						</label>
					</div>
				</div>
				<div class="row">
					<div class="small-12 columns">
						<label>
							Cell Phone
							<input type="tel" name="contact_cell_phone" required="required" />
						</label>
					</div>
				</div>
			</section>
			
			<section id="players">
				<h2>Players</h2>
				
				<p>The cost is $<%= Register.PRICE_PER_PLAYER %> per player.</p>
				
				<p>Please list your most likely players. Try to put them in order from best to least good. Use &#8220;TBD&#8221; to reserve a spot without picking a player yet. Even if you do give player names, you can still change players later on.</p>
				
				<table>
					<thead>
						<tr>
							<th>Name</th>
							<th>Grade</th>
						</tr>
					</thead>
					<tbody><%
						final List<SchoolYear> lclYearChoices = new ArrayList<>(SchoolYearFactory.getInstance().getAll());
						lclYearChoices.sort(Comparator.<SchoolYear>naturalOrder().reversed());
						
						for (int i = 1; i <= Register.MAX_DEFAULT_PLAYERS; ++i) {
							%><tr>
								<th>
									<input type="text" name="player_<%= i %>_name" class="player-name" <%= i == 1 ? " required='required'" : "" %> onchange="changeHandler()" />
								</th>
								<td>
									<select name="player_<%= i %>_school_year_code" <%= i == 1 ? " required='required'" : "" %>>
										<option value="" selected="selected" disabled="disabled">Choose&hellip;</option><%
										for (final SchoolYear y : lclYearChoices) {
											%><option value="<%= y.getCode() %>"><%= y.getShortName() %></option><%
										}
									%></select>
								</td>
							</tr><%
						}
					%></tbody>
				</table>
				
				<div class="row">
					<div class="small-12 columns">
						<label>
							If there is enough room, how many additional players would you like to enter?
							<input type="number" name="players_additional_desired" min="0" max="128" value="0" required="required" />
						</label>
					</div>
				</div>
			</section>
			
			<section id="moderators">
				<h2>Moderators</h2>
				
				<p>Moderators earn $<%= Register.DISCOUNT_PER_MODERATOR %> each, which can be paid to them directly or applied as a credit toward your players&#8217; entry fees.</p>
				
				<div class="row">
					<div class="small-12 columns">
						<label>
							How many moderators can you provide (perhaps including yourself)?
							<input type="number" name="moderator_count" id="moderator_count" min="0" max="32" value="0" required="required" onchange="changeHandler()" />
						</label>
					</div>
				</div>
				<div class="row">
					<div class="small-12 columns">
						<label>
							What are their names?
							<textarea name="moderator_names"></textarea>
						</label>
					</div>
				</div>
			</section>
			
			<section id="end">
				<h2>Finishing Up</h2>
				
				<div class="row">
					<div class="small-12 columns">
						<label>
							How many buzzer systems can you provide?
							<input type="number" name="buzzer_system_count" id="buzzer_system_count" min="0" max="32" value="0" required="required" onchange="changeHandler()" />
						</label>
					</div>
				</div>
				
				<div class="row">
					<div class="small-12 columns">
						<label>
							Do you have any questions or concerns?
							<textarea name="note"></textarea>
						</label>
					</div>
				</div>
				
				<div class="row columns">
					<p><strong>Total amount owed: $<span id="amount_owed">0</span>.</strong></p>
					
					<input type="text" name="winnie" style="position: absolute; overflow: hidden; clip: rect(0, 0, 0, 0); width: 1px; height: 1px; margin: -1px; border: 0; padding: 0;" tabindex="-1" autocomplete="off" />
					
					<p class="no-bottom-margin">We will send you a confirmation email containing all this information. Make checks payable to Reinstein QuizBowl and send them to&hellip;</p>
					<address style="margin-bottom: 1rem;">
						Reinstein QuizBowl<br />
						P.O.&nbsp;Box 57<br />
						125 Schelter Rd<br />
						Lincolnshire, IL 60069&ndash;0057
					</address>
					
					<p>If you have any questions, write to <%= lclTourn.getTournamentDirectorContact().getName() %> at <a href="mailto:<%= lclTourn.getTournamentDirectorContact().getEmailAddress() %>"><%= lclTourn.getTournamentDirectorContact().getEmailAddress() %></a>.</p>
				</div>
				
				<div class="row columns">
					<input type="submit" value="Submit Registration" class="medium" />
				</div>
			</section>
		</form>
	</div>
</div>

<script>
	document.getElementById('school_name').focus({ preventScroll: true });
	
	function changeHandler() {
		var playerCount = 0;
		var playerNames = document.querySelectorAll('.player-name');
		for (var i = 0; i < playerNames.length; ++i) {
			var playerName = playerNames[i].value;
			if (playerName && !!playerName.trim()) {
				++playerCount;
			}
		}
		
		var moderatorCount = +document.getElementById('moderator_count').value;
		
		var amountOwed = Math.max(0, <%= Register.PRICE_PER_PLAYER %> * playerCount - <%= Register.DISCOUNT_PER_MODERATOR %> * moderatorCount);
		document.getElementById('amount_owed').innerHTML = amountOwed;
	}
</script>

<jsp:include page="/template/footer.jsp" />