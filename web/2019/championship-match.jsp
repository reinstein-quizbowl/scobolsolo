<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2019" />
	<jsp:param name="pageTitle" value="Championship Match" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2019()).asTopLevel().output(request, \"championship-match\") %>" />
	<jsp:param name="h1" value="Championship Match" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>The participants in the Championship Match are the one player who won all 7 preliminary matches (the Morning Champion), the seven players who won 6 of their preliminary matches, and the top player among those who won 5 of their preliminary matches. The latter is ordinarily chosen by points per tossup heard, but this year there was a tie for that position between Jonathan Lau (University Laboratory High School, Urbana) and Ashish Subramanian (Hoffman Estates); Jonathan Lau took his second loss later (round&nbsp;13, while Ashish took a second loss in round&nbsp;9), so Jonathan was selected to play in the Championship Match.</p>
		
		<p>Unlike in the preliminary rounds, all incorrect answers result in a deduction of 1&nbsp;point. This is true regardless of whether the incorrect answer interrupted the question; it is thus different from ordinary “negs”.</p>
		
		<p>Each player starts with 3&nbsp;points. A player whose score reaches 0 is immediately removed from the match.</p>
		
		<p>If any player reaches a score of 10 during the first 20&nbsp;tossups, he or she sits out until tossup&nbsp;21.</p>
		
		<p>The Morning Champion sits out for the first 20&nbsp;tossups, and enters at tossup&nbsp;21 with a score equal to that of the leader at that time. After tossup&nbsp;40, the lowest-scoring players are removed until four remain; if necessary, tiebreaker tossups are used, but they do not count in the overall score of the championship match. After tossup&nbsp;50, the lowest-scoring remaining players are eliminated until two remain; the tiebreaker procedure is the same as before. At the conclusion of the match, tiebreaker tossups are read if and as necessary.</p>
		
		<table class="even-spacing unsortable championship-scoresheet">
			<thead>
				<tr class="player-names">
					<th>&nbsp;</th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1353#player_2801">Dylan Bowman</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1329#player_2733">Sophie Netzel</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1353#player_2802">Jonathan Lau</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1350#player_2790">Govind Prabhakar</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1350#player_2791">Arjun Nageswaran</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1338#player_2761">Thomas Mercurio</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1341#player_2775">Roxanne Tang</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1339#player_2754">Ryan Tsau</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1331#player_2734">Ben Fry</a></th>
					<th class="answer" rowspan="2">Answer</th>
				</tr>
				<tr class="player-schools">
					<th>&nbsp;</th>
					<th class="player-school">University Lab (Urbana)</th><!-- Dylan -->
					<th class="player-school">Glenbard West (Glen Ellyn)</th><!-- Sophie -->
					<th class="player-school">University Lab (Urbana)</th><!-- Jonathan -->
					<th class="player-school">Stevenson (Lincolnshire) </th><!-- Govind -->
					<th class="player-school">Stevenson (Lincolnshire)</th><!-- Arjun -->
					<th class="player-school">Hinsdale Central</th><!-- Thomas -->
					<th class="player-school">Barrington</th><!-- Roxanne -->
					<th class="player-school">Palatine</th><!-- Ryan -->
					<th class="player-school">Chicago Christian (Palos Heights)</th><!-- Ben -->
				</tr>
			</thead>
			<tbody>
				<tr class="score-check">
					<th class="score-check-label">Initial scores</th>
					<td class="player-score-check">&nbsp;</td><!-- Dylan -->
					<td class="player-score-check">3</td><!-- Sophie -->
					<td class="player-score-check">3</td><!-- Jonathan -->
					<td class="player-score-check">3</td><!-- Govind -->
					<td class="player-score-check">3</td><!-- Arjun -->
					<td class="player-score-check">3</td><!-- Thomas -->
					<td class="player-score-check">3</td><!-- Roxanne -->
					<td class="player-score-check">3</td><!-- Ryan -->
					<td class="player-score-check">3</td><!-- Ben -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr>
					<th class="question-number">1</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Sophie -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas -->
					<td class="player-incorrect-response">&minus;1</td><!-- Roxanne -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="answer">Bragg’s law</td>
				</tr>
				<tr>
					<th class="question-number">2</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Sophie -->
					<td class="player-correct-response">1</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas -->
					<td class="player-no-response">&nbsp;</td><!-- Roxanne -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="answer"><i>Hard Times</i></td>
				</tr>
				<tr>
					<th class="question-number">3</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Sophie -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas -->
					<td class="player-no-response">&nbsp;</td><!-- Roxanne -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan -->
					<td class="player-correct-response">1</td><!-- Ben -->
					<td class="answer">Ymir</td>
				</tr>
				<tr>
					<th class="question-number">4</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Sophie -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-correct-response">1</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas -->
					<td class="player-no-response">&nbsp;</td><!-- Roxanne -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="answer">Battle of Manzikert</td>
				</tr>
				<tr>
					<th class="question-number">5</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Dylan -->
					<td class="player-incorrect-response">&minus;1</td><!-- Sophie -->
					<td class="player-incorrect-response">&minus;1</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-incorrect-response">&minus;1</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas -->
					<td class="player-incorrect-response">&minus;1</td><!-- Roxanne -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="answer">irises (flowers, based on appearances in paintings)</td>
				</tr>
				<tr>
					<th class="question-number">6</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Sophie -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas -->
					<td class="player-no-response">&nbsp;</td><!-- Roxanne -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan -->
					<td class="player-correct-response">1</td><!-- Ben -->
					<td class="answer">symmetry (particle physics)</td>
				</tr>
				<tr>
					<th class="question-number">7</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Sophie -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-correct-response">1</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas -->
					<td class="player-no-response">&nbsp;</td><!-- Roxanne -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="answer">Sri Lanka (current events)</td>
				</tr>
				<tr>
					<th class="question-number">8</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Sophie -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-correct-response">1</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas -->
					<td class="player-no-response">&nbsp;</td><!-- Roxanne -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="answer"><i>Dream of the Red Chamber</i></td>
				<tr>
					<th class="question-number">9</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Sophie -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-correct-response">1</td><!-- Thomas -->
					<td class="player-no-response">&nbsp;</td><!-- Roxanne -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="answer">Claudio Monteverdi</td>
				</tr>
				<tr>
					<th class="question-number">10</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Sophie -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-incorrect-response">&minus;1</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas -->
					<td class="player-no-response">&nbsp;</td><!-- Roxanne -->
					<td class="player-correct-response">1</td><!-- Ryan -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="answer">Diocletian</td>
				</tr>
				<tr>
					<th class="question-number">11</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Sophie -->
					<td class="player-correct-response">1</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas -->
					<td class="player-no-response">&nbsp;</td><!-- Roxanne -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="answer">chromatin</td>
				</tr>
				<tr>
					<th class="question-number">12</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Dylan -->
					<td class="player-correct-response">1</td><!-- Sophie -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas -->
					<td class="player-no-response">&nbsp;</td><!-- Roxanne -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="answer">Ludwig von&nbsp;Mises</td>
				</tr>
				<tr>
					<th class="question-number">13</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Sophie -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-correct-response">1</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas -->
					<td class="player-no-response">&nbsp;</td><!-- Roxanne -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="answer">Rainer Maria Rilke</td>
				</tr>
				<tr>
					<th class="question-number">14</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Sophie -->
					<td class="player-correct-response">1</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas -->
					<td class="player-no-response">&nbsp;</td><!-- Roxanne -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="answer">Phoenicia</td>
				</tr>
				<tr>
					<th class="question-number">15</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Sophie -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas -->
					<td class="player-no-response">&nbsp;</td><!-- Roxanne -->
					<td class="player-correct-response">1</td><!-- Ryan -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="answer">compression (gases)</td>
				</tr>
				<tr>
					<th class="question-number">16</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Sophie -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-correct-response">1</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas -->
					<td class="player-no-response">&nbsp;</td><!-- Roxanne -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="answer">Aram Khachaturian</td>
				</tr>
				<tr>
					<th class="question-number">17</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Sophie -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-correct-response">1</td><!-- Arjun -->
					<td class="player-incorrect-response">&minus;1</td><!-- Thomas -->
					<td class="player-no-response">&nbsp;</td><!-- Roxanne -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="answer">James Agee</td>
				</tr>
				<tr>
					<th class="question-number">18</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Sophie -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-correct-response">1</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas -->
					<td class="player-no-response">&nbsp;</td><!-- Roxanne -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="answer">Botswana</td>
				</tr>
				<tr>
					<th class="question-number">19</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Sophie -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas -->
					<td class="player-no-response">&nbsp;</td><!-- Roxanne -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan -->
					<td class="player-correct-response">1</td><!-- Ben -->
					<td class="answer">games (game theory)</td>
				</tr>
				<tr>
					<th class="question-number">20</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Dylan -->
					<td class="player-incorrect-response">&minus;1</td><!-- Sophie -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-correct-response">1</td><!-- Thomas -->
					<td class="player-no-response">&nbsp;</td><!-- Roxanne -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="answer">Brook Farm</td>
				</tr>
				<tr class="score-check">
					<th class="score-check-label">Scores through 20</th>
					<td class="player-score-check">&nbsp;</td><!-- Dylan -->
					<td class="player-score-check">2</td><!-- Sophie -->
					<td class="player-score-check">5</td><!-- Jonathan -->
					<td class="player-score-check">5</td><!-- Govind -->
					<td class="player-score-check">6</td><!-- Arjun -->
					<td class="player-score-check">4</td><!-- Thomas -->
					<td class="player-score-check">1</td><!-- Roxanne -->
					<td class="player-score-check">5</td><!-- Ryan -->
					<td class="player-score-check">6</td><!-- Ben -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="10" class="note">Dylan Bowman, as Morning Champion, entered the game with a score equal to that of the then-leaders, Arjun Nageswaran and Ben Fry: 6.</td>
				</tr>
				<tr>
					<th class="question-number">21</td>
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Sophie -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-correct-response">1</td><!-- Thomas -->
					<td class="player-no-response">&nbsp;</td><!-- Roxanne -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="answer">roses (the curve)</td>
				</tr>
				<tr>
					<th class="question-number">22</td>
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Sophie -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-correct-response">1</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas -->
					<td class="player-no-response">&nbsp;</td><!-- Roxanne -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="answer">Upanishads</td>
				</tr>
				<tr>
					<th class="question-number">23</td>
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Sophie -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-correct-response">1</td><!-- Arjun -->
					<td class="player-incorrect-response">&minus;1</td><!-- Thomas -->
					<td class="player-no-response">&nbsp;</td><!-- Roxanne -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="answer">Alfredo Stroessner</td>
				</tr>
				<tr>
					<th class="question-number">24</td>
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Sophie -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-correct-response">1</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas -->
					<td class="player-no-response">&nbsp;</td><!-- Roxanne -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="answer">Philip Sidney</td>
				</tr>
				<tr>
					<th class="question-number">25</td>
					<td class="player-correct-response">1</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Sophie -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas -->
					<td class="player-no-response">&nbsp;</td><!-- Roxanne -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="answer">Young’s modulus</td>
				</tr>
				<tr>
					<th class="question-number">26</td>
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-correct-response">1</td><!-- Sophie -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas -->
					<td class="player-no-response">&nbsp;</td><!-- Roxanne -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="answer">Heinrich Schliemann</td>
				</tr>
				<tr>
					<th class="question-number">27</td>
					<td class="player-incorrect-response">&minus;1</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Sophie -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-incorrect-response">&minus;1</td><!-- Thomas -->
					<td class="player-no-response">&nbsp;</td><!-- Roxanne -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="answer">Tomaso Albinoni</td>
				</tr>
				<tr>
					<th class="question-number">28</td>
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Sophie -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-incorrect-response">&minus;1</td><!-- Arjun -->
					<td class="player-correct-response">1</td><!-- Thomas -->
					<td class="player-no-response">&nbsp;</td><!-- Roxanne -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="answer">Thaddeus Stevens</td>
				</tr>
				<tr>
					<th class="question-number">29</td>
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Sophie -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas -->
					<td class="player-no-response">&nbsp;</td><!-- Roxanne -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan -->
					<td class="player-correct-response">1</td><!-- Ben -->
					<td class="answer"><i>Tender Is the Night</i></td>
				</tr>
				<tr>
					<th class="question-number">30</td>
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Sophie -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas -->
					<td class="player-incorrect-response">&minus;1</td><!-- Roxanne -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="answer">guyots</td>
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="10" class="note">
						As Roxanne Tang&#8217;s score reached 0, she was eliminated.
					</td>
				</tr>
				<tr>
					<th class="question-number">31</td>
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Sophie -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-incorrect-response">&minus;1</td><!-- Govind -->
					<td class="player-correct-response">1</td><!-- Arjun -->
					<td class="player-incorrect-response">&minus;1</td><!-- Thomas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Roxanne -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="answer">Ecuador (current events)</td>
				</tr>
				<tr>
					<th class="question-number">32</td>
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Sophie -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-correct-response">1</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Roxanne -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="answer">Pope Urban&nbsp;II</td>
				</tr>
				<tr>
					<th class="question-number">33</td>
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-incorrect-response">&minus;1</td><!-- Sophie -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Roxanne -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="answer">Coleman Hawkins</td>
				</tr>
				<tr>
					<th class="question-number">34</td>
					<td class="player-correct-response">1</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Sophie -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Roxanne -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="answer">“Rashomon”</td>
				</tr>
				<tr>
					<th class="question-number">35</td>
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Sophie -->
					<td class="player-correct-response">1</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Roxanne -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="answer">British Columbia</td>
				</tr>
				<tr>
					<th class="question-number">36</td>
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Sophie -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Roxanne -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="answer">fugacity</td>
				</tr>
				<tr>
					<th class="question-number">37</td>
					<td class="player-correct-response">1</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Sophie -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Roxanne -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="answer">Giorgione</td>
				</tr>
				<tr>
					<th class="question-number">38</td>
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Sophie -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-correct-response">1</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Roxanne -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="answer">Doris Lessing</td>
				</tr>
				<tr>
					<th class="question-number">39</td>
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Sophie -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-correct-response">1</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Thomas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Roxanne -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="answer">Carl Mannerheim</td>
				</tr>
				<tr>
					<th class="question-number">40</td>
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Sophie -->
					<td class="player-incorrect-response">&minus;1</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-incorrect-response">&minus;1</td><!-- Arjun -->
					<td class="player-incorrect-response">&minus;1</td><!-- Thomas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Roxanne -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="answer">acetyl-CoA</td>
				</tr>
				<tr class="score-check">
					<th class="score-check-label">Scores through 40</th>
					<td class="player-score-check">8</td><!-- Dylan -->
					<td class="player-score-check">2</td><!-- Sophie -->
					<td class="player-score-check">5</td><!-- Jonathan -->
					<td class="player-score-check">7</td><!-- Govind -->
					<td class="player-score-check">8</td><!-- Arjun -->
					<td class="player-score-check">2</td><!-- Thomas -->
					<td class="player-score-check">0</td><!-- Roxanne -->
					<td class="player-score-check">5</td><!-- Ryan -->
					<td class="player-score-check">7</td><!-- Ben -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="10" class="note">
						The players with the lowest scores were eliminated until four players remained. Therefore, Sophie Neztel, Jonathan Lau, Thomas Mercurio, and Ryan Tsau were eliminated (and Roxanne Tang had already been eliminated). Dylan Bowman, Govind Prabhakar, Arjun Nageswaran, and Ben Fry remained.
					</td>
				</tr>
				<tr>
					<th class="question-number">41</td>
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sophie -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-not-in-game">&nbsp;</td><!-- Thomas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Roxanne -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan -->
					<td class="player-correct-response">1</td><!-- Ben -->
					<td class="answer">chitin</td>
				</tr>
				<tr>
					<th class="question-number">42</td>
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sophie -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-correct-response">1</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-not-in-game">&nbsp;</td><!-- Thomas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Roxanne -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="answer">Djibouti</td>
				</tr>
				<tr>
					<th class="question-number">43</td>
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sophie -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-correct-response">1</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-not-in-game">&nbsp;</td><!-- Thomas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Roxanne -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="answer">Battle of the Teutoberg Forest</td>
				</tr>
				<tr>
					<th class="question-number">44</td>
					<td class="player-correct-response">1</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sophie -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-not-in-game">&nbsp;</td><!-- Thomas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Roxanne -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="answer">Athol Fugard</td>
				</tr>
				<tr>
					<th class="question-number">45</td>
					<td class="player-correct-response">1</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sophie -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-not-in-game">&nbsp;</td><!-- Thomas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Roxanne -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="answer">plasma</td>
				</tr>
				<tr>
					<th class="question-number">46</td>
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sophie -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-not-in-game">&nbsp;</td><!-- Thomas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Roxanne -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan -->
					<td class="player-correct-response">1</td><!-- Ben -->
					<td class="answer">Jacques Derrida</td>
				</tr>
				<tr>
					<th class="question-number">47</td>
					<td class="player-correct-response">1</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sophie -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-not-in-game">&nbsp;</td><!-- Thomas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Roxanne -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="answer">Ralph Vaughan Williams</td>
				</tr>
				<tr>
					<th class="question-number">48</td>
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sophie -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-correct-response">1</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-not-in-game">&nbsp;</td><!-- Thomas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Roxanne -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="answer">PATRIOT Act</td>
				</tr>
				<tr>
					<th class="question-number">49</td>
					<td class="player-correct-response">1</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sophie -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-not-in-game">&nbsp;</td><!-- Thomas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Roxanne -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan -->
					<td class="player-incorrect-response">&minus;1</td><!-- Ben -->
					<td class="answer"><i>The Age of Innocence</i></td>
				</tr>
				<tr>
					<th class="question-number">50</td>
					<td class="player-correct-response">1</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sophie -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-not-in-game">&nbsp;</td><!-- Thomas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Roxanne -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="answer">acetone</td>
				</tr>
				<tr class="score-check">
					<th class="score-check-label">Scores through 50</th>
					<td class="player-score-check">13</td><!-- Dylan -->
					<td class="player-eliminated">eliminated</td><!-- Sophie -->
					<td class="player-eliminated">eliminated</td><!-- Jonathan-->
					<td class="player-score-check">10</td><!-- Govind -->
					<td class="player-score-check">8</td><!-- Arjun -->
					<td class="player-eliminated">eliminated</td><!-- Thomas -->
					<td class="player-eliminated">eliminated</td><!-- Roxanne -->
					<td class="player-eliminated">eliminated</td><!-- Ryan -->
					<td class="player-score-check">8</td><!-- Ben -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="10" class="note">
						The players with the lowest scores were eliminated until two players remained. Therefore, Arjun Nageswaran and Ben Fry were eliminated. Dylan Bowman and Govind Prabhakar remained.
					</td>
				</tr>
				<tr>
					<th class="question-number">51</td>
					<td class="player-incorrect-response">&minus;1</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sophie -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-incorrect-response">&minus;1</td><!-- Govind -->
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-not-in-game">&nbsp;</td><!-- Thomas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Roxanne -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="answer">SETI</td>
				</tr>
				<tr>
					<th class="question-number">52</td>
					<td class="player-correct-response">1</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sophie -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-not-in-game">&nbsp;</td><!-- Thomas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Roxanne -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="answer">United Automobile Workers</td>
				</tr>
				<tr>
					<th class="question-number">53</td>
					<td class="player-correct-response">1</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sophie -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-not-in-game">&nbsp;</td><!-- Thomas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Roxanne -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="answer">Antoine Watteau</td>
				</tr>
				<tr>
					<th class="question-number">54</td>
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sophie -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-correct-response">1</td><!-- Govind -->
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-not-in-game">&nbsp;</td><!-- Thomas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Roxanne -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="answer">Alfred the Great</td>
				</tr>
				<tr>
					<th class="question-number">55</td>
					<td class="player-correct-response">1</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sophie -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-not-in-game">&nbsp;</td><!-- Thomas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Roxanne -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="answer">Harold Pinter</td>
				</tr>
				<tr>
					<th class="question-number">56</td>
					<td class="player-incorrect-response">&minus;1</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sophie -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-correct-response">1</td><!-- Govind -->
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-not-in-game">&nbsp;</td><!-- Thomas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Roxanne -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="answer">torus</td>
				</tr>
				<tr>
					<th class="question-number">57</td>
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sophie -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-correct-response">1</td><!-- Govind -->
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-not-in-game">&nbsp;</td><!-- Thomas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Roxanne -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="answer">Susanoo</td>
				</tr>
				<tr>
					<th class="question-number">58</td>
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sophie -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-correct-response">1</td><!-- Govind -->
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-not-in-game">&nbsp;</td><!-- Thomas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Roxanne -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="answer">Lisbon</td>
				</tr>
				<tr>
					<th class="question-number">59</td>
					<td class="player-incorrect-response">&minus;1</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sophie -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-correct-response">1</td><!-- Govind -->
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-not-in-game">&nbsp;</td><!-- Thomas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Roxanne -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="answer">Zhou dynasty</td>
				</tr>
				<tr>
					<th class="question-number">60</td>
					<td class="player-correct-response">1</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sophie -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-not-in-game">&nbsp;</td><!-- Thomas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Roxanne -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="answer">William Cullen Bryant</td>
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="10" class="note">
						As both remaining players were tied at 14, a tiebreaker tossup on the Carnatic Wars was read. Govind Prabhakar answered it to win the game.
					</td>
				</tr>
			</tbody>
			<tfoot>
				<tr class="score-check">
					<th class="score-check-label">Final scores</th>
					<td class="player-score-check">14</td><!-- Dylan -->
					<td class="player-eliminated">eliminated</td><!-- Sophie -->
					<td class="player-eliminated">eliminated</td><!-- Jonathan -->
					<td class="player-score-check">14&nbsp;+&nbsp;TB</td><!-- Govind -->
					<td class="player-eliminated">eliminated</td><!-- Govind -->
					<td class="player-eliminated">eliminated</td><!-- Thomas -->
					<td class="player-eliminated">eliminated</td><!-- Roxanne -->
					<td class="player-eliminated">eliminated</td><!-- Ryan -->
					<td class="player-eliminated">eliminated</td><!-- Ben -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
			</tfoot>
		</table>
		
		<p>Govind Prabhakar of Adlai E. Stevenson High School (Lincolnshire, Illinois) is the champion of the 2019 Scobol Solo. He is the third player from Stevenson to win the tournament (<a href="/stats/player-detail.jsp?school_registration_id=1226#player_2176">Kevin Malis</a>, 2010; <a href="/stats/player-detail.jsp?school_registration_id=1064#player_1323">Ali Saeed</a>, 2015).</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
