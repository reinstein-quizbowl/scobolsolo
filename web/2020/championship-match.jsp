<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2020" />
	<jsp:param name="pageTitle" value="Championship Match" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2020()).asTopLevel().output(request, \"championship-match\") %>" />
	<jsp:param name="h1" value="Championship Match" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>The participants in the Championship Match are the one player who won all 7 preliminary matches (the Morning Champion), the seven players who won 6 of their preliminary matches, and the top player among those who won 5 of their preliminary matches.</p>
		
		<p>Unlike in the preliminary rounds, all incorrect answers result in a deduction of 1&nbsp;point. This is true regardless of whether the incorrect answer interrupted the question; it is thus different from ordinary “negs”.</p>
		
		<p>Each player starts with 3&nbsp;points. A player whose score reaches 0 is immediately removed from the match.</p>
		
		<p>If any player reaches a score of 10 during the first 20&nbsp;tossups, they sit out until tossup&nbsp;21.</p>
		
		<p>The Morning Champion sits out for the first 20&nbsp;tossups, and enters at tossup&nbsp;21 with a score equal to that of the leader at that time. After tossup&nbsp;40, the lowest-scoring players are removed until four remain; if necessary, tiebreaker tossups are used, but they do not count in the overall score of the championship match. After tossup&nbsp;50, the lowest-scoring remaining players are eliminated until two remain; the tiebreaker procedure is the same as before. At the conclusion of the match, tiebreaker tossups are read if and as necessary.</p>
		
		<table class="even-spacing unsortable championship-scoresheet">
			<thead>
				<tr class="player-names">
					<th>&nbsp;</th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1381#player_2968">Arjun Nageswaran</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1378#player_2901">Jonathan Lau</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1369#player_2864">Charles Young</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1371#player_2917">Tejas Vadali</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1362#player_2856">Justin Abel</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1362#player_2983">Alex Crowell</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1375#player_2885">Jared Dong</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1359#player_2962">David Lingan</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1368">Jack Casey</a></th>
					<th class="answer" rowspan="2">Answer</th>
				</tr>
				<tr class="player-schools">
					<th>&nbsp;</th>
					<th class="player-school">Stevenson (Lincolnshire)</th><!-- Arjun -->
					<th class="player-school">University Lab (Urbana)</th><!-- Jonathan -->
					<th class="player-school">Barrington</th><!-- Charles -->
					<th class="player-school">Latin School of Chicago</th><!-- Tejas -->
					<th class="player-school">Auburn (Rockford)</th><!-- Justin -->
					<th class="player-school">Auburn</th><!-- Alex -->
					<th class="player-school">IMSA (Aurora)</th><!-- Jared -->
					<th class="player-school">Sandburg (Orland Park)</th><!-- David -->
					<th class="player-school">Springfield</th><!-- Jack -->
				</tr>
			</thead>
			<tbody>
				<tr class="score-check">
					<th class="score-check-label">Initial scores</th>
					<td class="player-score-check">&nbsp;</td><!-- Arjun -->
					<td class="player-score-check">3</td><!-- Jonathan -->
					<td class="player-score-check">3</td><!-- Charles -->
					<td class="player-score-check">3</td><!-- Tejas -->
					<td class="player-score-check">3</td><!-- Justin -->
					<td class="player-score-check">3</td><!-- Alex -->
					<td class="player-score-check">3</td><!-- Jared -->
					<td class="player-score-check">3</td><!-- David -->
					<td class="player-score-check">3</td><!-- Jack -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr>
					<th class="question-number">1</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-correct-response">1</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Charles -->
					<td class="player-no-response">&nbsp;</td><!-- Tejas -->
					<td class="player-no-response">&nbsp;</td><!-- Justin -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-no-response">&nbsp;</td><!-- David -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="answer">Eris</td>
				</tr>
				<tr>
					<th class="question-number">2</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-correct-response">1</td><!-- Charles -->
					<td class="player-no-response">&nbsp;</td><!-- Tejas -->
					<td class="player-no-response">&nbsp;</td><!-- Justin -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-no-response">&nbsp;</td><!-- David -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="answer">E.&nbsp;L. Doctorow</td>
				</tr>
				<tr>
					<th class="question-number">3</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Charles -->
					<td class="player-no-response">&nbsp;</td><!-- Tejas -->
					<td class="player-correct-response">1</td><!-- Justin -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-no-response">&nbsp;</td><!-- David -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="answer">John Crittenden</td>
				</tr>
				<tr>
					<th class="question-number">4</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-correct-response">1</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Charles -->
					<td class="player-no-response">&nbsp;</td><!-- Tejas -->
					<td class="player-no-response">&nbsp;</td><!-- Justin -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-no-response">&nbsp;</td><!-- David -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="answer">Azerbaijan</td>
				</tr>
				<tr>
					<th class="question-number">5</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-correct-response">1</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Charles -->
					<td class="player-no-response">&nbsp;</td><!-- Tejas -->
					<td class="player-no-response">&nbsp;</td><!-- Justin -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-no-response">&nbsp;</td><!-- David -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="answer">ethers</td>
				</tr>
				<tr>
					<th class="question-number">6</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Charles -->
					<td class="player-no-response">&nbsp;</td><!-- Tejas -->
					<td class="player-no-response">&nbsp;</td><!-- Justin -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-correct-response">1</td><!-- Jared -->
					<td class="player-no-response">&nbsp;</td><!-- David -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="answer">W.&nbsp;H. Auden</td>
				</tr>
				<tr>
					<th class="question-number">7</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-correct-response">1</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Charles -->
					<td class="player-no-response">&nbsp;</td><!-- Tejas -->
					<td class="player-no-response">&nbsp;</td><!-- Justin -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-no-response">&nbsp;</td><!-- David -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="answer">Thelonius Monk</td>
				</tr>
				<tr>
					<th class="question-number">8</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-correct-response">1</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Charles -->
					<td class="player-no-response">&nbsp;</td><!-- Tejas -->
					<td class="player-no-response">&nbsp;</td><!-- Justin -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-no-response">&nbsp;</td><!-- David -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="answer">Horatio Gates</td>
				<tr>
					<th class="question-number">9</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Charles -->
					<td class="player-no-response">&nbsp;</td><!-- Tejas -->
					<td class="player-correct-response">1</td><!-- Justin -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-no-response">&nbsp;</td><!-- David -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="answer">Carl Rogers</td>
				</tr>
				<tr>
					<th class="question-number">10</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-correct-response">1</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Charles -->
					<td class="player-no-response">&nbsp;</td><!-- Tejas -->
					<td class="player-no-response">&nbsp;</td><!-- Justin -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-no-response">&nbsp;</td><!-- David -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="answer">Koch snowflake</td>
				</tr>
				<tr>
					<th class="question-number">11</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-correct-response">1</td><!-- Charles -->
					<td class="player-no-response">&nbsp;</td><!-- Tejas -->
					<td class="player-no-response">&nbsp;</td><!-- Justin -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-no-response">&nbsp;</td><!-- David -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="answer">Georges Braque</td>
				</tr>
				<tr>
					<th class="question-number">12</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-correct-response">1</td><!-- Charles -->
					<td class="player-no-response">&nbsp;</td><!-- Tejas -->
					<td class="player-no-response">&nbsp;</td><!-- Justin -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-no-response">&nbsp;</td><!-- David -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="answer"><i>The Tin Drum</i></td>
				</tr>
				<tr>
					<th class="question-number">13</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-incorrect-response">&minus;1</td><!-- Charles -->
					<td class="player-correct-response">1</td><!-- Tejas -->
					<td class="player-no-response">&nbsp;</td><!-- Justin -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-no-response">&nbsp;</td><!-- David -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="answer">T&yacute;r</td>
				</tr>
				<tr>
					<th class="question-number">14</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-correct-response">1</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Charles -->
					<td class="player-no-response">&nbsp;</td><!-- Tejas -->
					<td class="player-no-response">&nbsp;</td><!-- Justin -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-no-response">&nbsp;</td><!-- David -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="answer">Davisson-Germer experiment</td>
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="10" class="note">Since Jonathan Lau reached a score of 10, he left the game through tossup&nbsp;20.</td>
				</tr>
				<tr>
					<th class="question-number">15</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Charles -->
					<td class="player-no-response">&nbsp;</td><!-- Tejas -->
					<td class="player-correct-response">1</td><!-- Justin -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-no-response">&nbsp;</td><!-- David -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="answer">Khartoum</td>
				</tr>
				<tr>
					<th class="question-number">16</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-correct-response">1</td><!-- Charles -->
					<td class="player-no-response">&nbsp;</td><!-- Tejas -->
					<td class="player-no-response">&nbsp;</td><!-- Justin -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-no-response">&nbsp;</td><!-- David -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="answer">Alexander Borodin</td>
				</tr>
				<tr>
					<th class="question-number">17</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Charles -->
					<td class="player-correct-response">1</td><!-- Tejas -->
					<td class="player-no-response">&nbsp;</td><!-- Justin -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-no-response">&nbsp;</td><!-- David -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="answer">Rachel Maddow</td>
				</tr>
				<tr>
					<th class="question-number">18</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Charles -->
					<td class="player-no-response">&nbsp;</td><!-- Tejas -->
					<td class="player-correct-response">1</td><!-- Justin -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-no-response">&nbsp;</td><!-- David -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="answer">Okazaki fragments</td>
				</tr>
				<tr>
					<th class="question-number">19</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-correct-response">1</td><!-- Charles -->
					<td class="player-no-response">&nbsp;</td><!-- Tejas -->
					<td class="player-no-response">&nbsp;</td><!-- Justin -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-no-response">&nbsp;</td><!-- David -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="answer">Miss Marple</td>
				</tr>
				<tr>
					<th class="question-number">20</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Charles -->
					<td class="player-incorrect-response">&minus;1</td><!-- Tejas -->
					<td class="player-incorrect-response">&minus;1</td><!-- Justin -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-no-response">&nbsp;</td><!-- David -->
					<td class="player-incorrect-response">&minus;1</td><!-- Jack -->
					<td class="answer">Henry&nbsp;III</td>
				</tr>
				<tr class="score-check">
					<th class="score-check-label">Scores through 20</th>
					<td class="player-score-check">&nbsp;</td><!-- Arjun -->
					<td class="player-score-check">10</td><!-- Jonathan -->
					<td class="player-score-check">7</td><!-- Charles -->
					<td class="player-score-check">4</td><!-- Tejas -->
					<td class="player-score-check">6</td><!-- Justin -->
					<td class="player-score-check">3</td><!-- Alex -->
					<td class="player-score-check">4</td><!-- Jared -->
					<td class="player-score-check">3</td><!-- David -->
					<td class="player-score-check">2</td><!-- Jack -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="10" class="note">Arjun Nageswaran, as Morning Champion, entered the game with a score equal to that of the then-leader, Jonathan Lau: 10.</td>
				</tr>
				<tr>
					<th class="question-number">21</td>
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-correct-response">1</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Charles -->
					<td class="player-no-response">&nbsp;</td><!-- Tejas -->
					<td class="player-no-response">&nbsp;</td><!-- Justin -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-no-response">&nbsp;</td><!-- David -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="answer">Tang dynasty</td>
				</tr>
				<tr>
					<th class="question-number">22</td>
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Charles -->
					<td class="player-no-response">&nbsp;</td><!-- Tejas -->
					<td class="player-no-response">&nbsp;</td><!-- Justin -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-correct-response">1</td><!-- Jared -->
					<td class="player-no-response">&nbsp;</td><!-- David -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="answer"><i>The Faerie Queene</i></td>
				</tr>
				<tr>
					<th class="question-number">23</td>
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-incorrect-response">&minus;1</td><!-- Jonathan -->
					<td class="player-correct-response">1</td><!-- Charles -->
					<td class="player-no-response">&nbsp;</td><!-- Tejas -->
					<td class="player-no-response">&nbsp;</td><!-- Justin -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-no-response">&nbsp;</td><!-- David -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="answer">[see note]</td>
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="10" class="note">Tossup&nbsp;23 was on NADPH, but was replaced due to a mistaken handling of Jonathan’s incorrect buzz. Charles’s correct buzz was on the replacement question, which was on Galileo.</td>
				</tr>
				<tr>
					<th class="question-number">24</td>
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Charles -->
					<td class="player-correct-response">1</td><!-- Tejas -->
					<td class="player-no-response">&nbsp;</td><!-- Justin -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-no-response">&nbsp;</td><!-- David -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="answer"><i>Broadway Boogie Woogie</i></td>
				</tr>
				<tr>
					<th class="question-number">25</td>
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-correct-response">1</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Charles -->
					<td class="player-no-response">&nbsp;</td><!-- Tejas -->
					<td class="player-no-response">&nbsp;</td><!-- Justin -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-no-response">&nbsp;</td><!-- David -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="answer">Druze</td>
				</tr>
				<tr>
					<th class="question-number">26</td>
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-correct-response">1</td><!-- Charles -->
					<td class="player-no-response">&nbsp;</td><!-- Tejas -->
					<td class="player-incorrect-response">&minus;1</td><!-- Justin -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-no-response">&nbsp;</td><!-- David -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="answer">Ida B. Wells</td>
				</tr>
				<tr>
					<th class="question-number">27</td>
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-correct-response">1</td><!-- Charles -->
					<td class="player-no-response">&nbsp;</td><!-- Tejas -->
					<td class="player-no-response">&nbsp;</td><!-- Justin -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-no-response">&nbsp;</td><!-- David -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="answer">Charlotte Perkins Gilman</td>
				</tr>
				<tr>
					<th class="question-number">28</td>
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-correct-response">1</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Charles -->
					<td class="player-incorrect-response">&minus;1</td><!-- Tejas -->
					<td class="player-no-response">&nbsp;</td><!-- Justin -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-no-response">&nbsp;</td><!-- David -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="answer">Erwin Madelung</td>
				</tr>
				<tr>
					<th class="question-number">29</td>
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Charles -->
					<td class="player-incorrect-response">&minus;1</td><!-- Tejas -->
					<td class="player-no-response">&nbsp;</td><!-- Justin -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-correct-response">1</td><!-- Jared -->
					<td class="player-no-response">&nbsp;</td><!-- David -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="answer">Simone de&nbsp;Beauvoir</td>
				</tr>
				<tr>
					<th class="question-number">30</td>
					<td class="player-correct-response">1</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Charles -->
					<td class="player-no-response">&nbsp;</td><!-- Tejas -->
					<td class="player-no-response">&nbsp;</td><!-- Justin -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-no-response">&nbsp;</td><!-- David -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="answer">Henry Purcell</td>
				</tr>
				<tr>
					<th class="question-number">31</td>
					<td class="player-correct-response">1</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Charles -->
					<td class="player-no-response">&nbsp;</td><!-- Tejas -->
					<td class="player-no-response">&nbsp;</td><!-- Justin -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-no-response">&nbsp;</td><!-- David -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="answer">House of Orange-Nassau</td>
				</tr>
				<tr>
					<th class="question-number">32</td>
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Charles -->
					<td class="player-correct-response">1</td><!-- Tejas -->
					<td class="player-no-response">&nbsp;</td><!-- Justin -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-no-response">&nbsp;</td><!-- David -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="answer">logistic functions</td>
				</tr>
				<tr>
					<th class="question-number">33</td>
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Charles -->
					<td class="player-correct-response">1</td><!-- Tejas -->
					<td class="player-no-response">&nbsp;</td><!-- Justin -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-no-response">&nbsp;</td><!-- David -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="answer"><i>Silas Marner</i></td>
				</tr>
				<tr>
					<th class="question-number">34</td>
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-correct-response">1</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Charles -->
					<td class="player-no-response">&nbsp;</td><!-- Tejas -->
					<td class="player-no-response">&nbsp;</td><!-- Justin -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-no-response">&nbsp;</td><!-- David -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="answer">Limpopo River</td>
				</tr>
				<tr>
					<th class="question-number">35</td>
					<td class="player-correct-response">1</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Charles -->
					<td class="player-no-response">&nbsp;</td><!-- Tejas -->
					<td class="player-no-response">&nbsp;</td><!-- Justin -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-no-response">&nbsp;</td><!-- David -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="answer">Anton Webern</td>
				</tr>
				<tr>
					<th class="question-number">36</td>
					<td class="player-correct-response">1</td><!-- Arjun -->
					<td class="player-incorrect-response">&minus;1</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Charles -->
					<td class="player-no-response">&nbsp;</td><!-- Tejas -->
					<td class="player-no-response">&nbsp;</td><!-- Justin -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-no-response">&nbsp;</td><!-- David -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="answer">Brian Josephson</td>
				</tr>
				<tr>
					<th class="question-number">37</td>
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-correct-response">1</td><!-- Charles -->
					<td class="player-no-response">&nbsp;</td><!-- Tejas -->
					<td class="player-no-response">&nbsp;</td><!-- Justin -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-no-response">&nbsp;</td><!-- David -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="answer">Derek Walcott</td>
				</tr>
				<tr>
					<th class="question-number">38</td>
					<td class="player-incorrect-response">&minus;1</td><!-- Arjun -->
					<td class="player-correct-response">1</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Charles -->
					<td class="player-no-response">&nbsp;</td><!-- Tejas -->
					<td class="player-no-response">&nbsp;</td><!-- Justin -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-no-response">&nbsp;</td><!-- David -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="answer">Battle of Sluys</td>
				</tr>
				<tr>
					<th class="question-number">39</td>
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-correct-response">1</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Charles -->
					<td class="player-no-response">&nbsp;</td><!-- Tejas -->
					<td class="player-no-response">&nbsp;</td><!-- Justin -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-no-response">&nbsp;</td><!-- David -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="answer">Chile (current events)</td>
				</tr>
				<tr>
					<th class="question-number">40</td>
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-correct-response">1</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Charles -->
					<td class="player-no-response">&nbsp;</td><!-- Tejas -->
					<td class="player-no-response">&nbsp;</td><!-- Justin -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-no-response">&nbsp;</td><!-- David -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="answer">Cretaceous period</td>
				</tr>
				<tr class="score-check">
					<th class="score-check-label">Scores through 40</th>
					<td class="player-score-check">13</td><!-- Arjun -->
					<td class="player-score-check">15</td><!-- Jonathan -->
					<td class="player-score-check">11</td><!-- Charles -->
					<td class="player-score-check">5</td><!-- Tejas -->
					<td class="player-score-check">5</td><!-- Justin -->
					<td class="player-score-check">3</td><!-- Alex -->
					<td class="player-score-check">6</td><!-- Jared -->
					<td class="player-score-check">3</td><!-- David -->
					<td class="player-score-check">2</td><!-- Jack -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="10" class="note">
						The players with the lowest scores were eliminated until four players remained. Therefore, Justin Abel, Jack Casey, Alex Crowell, David Lingan, and Tejas Vadali were eliminated. Jared Dong, Jonathan Lau, Arjun Nageswaran, and Charles Young remained.
					</td>
				</tr>
				<tr>
					<th class="question-number">41</td>
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-incorrect-response">&minus;1</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Charles -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tejas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Justin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-not-in-game">&nbsp;</td><!-- David -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="answer">Hot Springs, Arkansas</td>
				</tr>
				<tr>
					<th class="question-number">42</td>
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-correct-response">1</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Charles -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tejas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Justin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-not-in-game">&nbsp;</td><!-- David -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="answer">alkenes</td>
				</tr>
				<tr>
					<th class="question-number">43</td>
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-correct-response">1</td><!-- Charles -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tejas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Justin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-not-in-game">&nbsp;</td><!-- David -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="answer">Tom Stoppard</td>
				</tr>
				<tr>
					<th class="question-number">44</td>
					<td class="player-correct-response">1</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-incorrect-response">&minus;1</td><!-- Charles -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tejas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Justin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-not-in-game">&nbsp;</td><!-- David -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="answer"><i>Pagliacci</i></td>
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="10" class="note">Tossup&nbsp;44 was originally slated to be on Donatello, but due to a technical glitch, it was replaced with the tossup on <i>Pagliacci</i>. No substantive portion of the original tossup was heard by players; both buzzes occurred on the replacement.</td>
				</tr>
				<tr>
					<th class="question-number">45</td>
					<td class="player-correct-response">1</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Charles -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tejas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Justin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-not-in-game">&nbsp;</td><!-- David -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="answer"><i>Gideon v. Wainwright</i></td>
				</tr>
				<tr>
					<th class="question-number">46</td>
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-correct-response">1</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Charles -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tejas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Justin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-not-in-game">&nbsp;</td><!-- David -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="answer">graphs (the mathematical constructs involving vertices and edges)</td>
				</tr>
				<tr>
					<th class="question-number">47</td>
					<td class="player-incorrect-response">&minus;1</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Charles -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tejas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Justin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-correct-response">1</td><!-- Jared -->
					<td class="player-not-in-game">&nbsp;</td><!-- David -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="answer"><i>The Magic Mountain</i></td>
				</tr>
				<tr>
					<th class="question-number">48</td>
					<td class="player-correct-response">1</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Charles -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tejas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Justin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-not-in-game">&nbsp;</td><!-- David -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="answer">Vermont (current events)</td>
				</tr>
				<tr>
					<th class="question-number">49</td>
					<td class="player-correct-response">1</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Charles -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tejas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Justin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-not-in-game">&nbsp;</td><!-- David -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="answer">Angola</td>
				</tr>
				<tr>
					<th class="question-number">50</td>
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-correct-response">1</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Charles -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tejas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Justin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Jared -->
					<td class="player-not-in-game">&nbsp;</td><!-- David -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="answer">thermosphere</td>
				</tr>
				<tr class="score-check">
					<th class="score-check-label">Scores through 50</th>
					<td class="player-score-check">16</td><!-- Arjun -->
					<td class="player-score-check">17</td><!-- Jonathan -->
					<td class="player-score-check">11</td><!-- Charles -->
					<td class="player-eliminated">eliminated</td><!-- Tejas -->
					<td class="player-eliminated">eliminated</td><!-- Justin -->
					<td class="player-eliminated">eliminated</td><!-- Alex -->
					<td class="player-score-check">7</td><!-- Jared -->
					<td class="player-eliminated">eliminated</td><!-- David -->
					<td class="player-eliminated">eliminated</td><!-- Jack -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="10" class="note">
						The players with the lowest scores were eliminated until two players remained. Therefore, Jared Dong and Charles Young were eliminated. Jonathan Lau and Arjun Nageswaran remained.
					</td>
				</tr>
				<tr>
					<th class="question-number">51</td>
					<td class="player-correct-response">1</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Charles -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tejas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Justin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jared -->
					<td class="player-not-in-game">&nbsp;</td><!-- David -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="answer">Sergei Rachmaninoff</td>
				</tr>
				<tr>
					<th class="question-number">52</td>
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-correct-response">1</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Charles -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tejas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Justin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jared -->
					<td class="player-not-in-game">&nbsp;</td><!-- David -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="answer">Leah</td>
				</tr>
				<tr>
					<th class="question-number">53</td>
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-correct-response">1</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Charles -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tejas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Justin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jared -->
					<td class="player-not-in-game">&nbsp;</td><!-- David -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="answer">“Howl”</td>
				</tr>
				<tr>
					<th class="question-number">54</td>
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-correct-response">1</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Charles -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tejas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Justin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jared -->
					<td class="player-not-in-game">&nbsp;</td><!-- David -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="answer">Trajan</td>
				</tr>
				<tr>
					<th class="question-number">55</td>
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-correct-response">1</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Charles -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tejas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Justin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jared -->
					<td class="player-not-in-game">&nbsp;</td><!-- David -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="answer">Pieter Zeeman</td>
				</tr>
				<tr>
					<th class="question-number">56</td>
					<td class="player-correct-response">1</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Charles -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tejas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Justin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jared -->
					<td class="player-not-in-game">&nbsp;</td><!-- David -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="answer">Thomas Aquinas</td>
				</tr>
				<tr>
					<th class="question-number">57</td>
					<td class="player-correct-response">1</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Charles -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tejas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Justin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jared -->
					<td class="player-not-in-game">&nbsp;</td><!-- David -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="answer">Thomas Eakins</td>
				</tr>
				<tr>
					<th class="question-number">58</td>
					<td class="player-correct-response">1</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Charles -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tejas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Justin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jared -->
					<td class="player-not-in-game">&nbsp;</td><!-- David -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="answer">John Irving</td>
				</tr>
				<tr>
					<th class="question-number">59</td>
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-correct-response">1</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Charles -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tejas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Justin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jared -->
					<td class="player-not-in-game">&nbsp;</td><!-- David -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="answer">translation (DNA to RNA)</td>
				</tr>
				<tr>
					<th class="question-number">60</td>
					<td class="player-correct-response">1</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Charles -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tejas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Justin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jared -->
					<td class="player-not-in-game">&nbsp;</td><!-- David -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="answer">Jean-Baptiste Colbert</td>
				</tr>
			</tbody>
			<tfoot>
				<tr class="score-check">
					<th class="score-check-label">Final scores</th>
					<td class="player-score-check">21</td><!-- Arjun -->
					<td class="player-score-check">22</td><!-- Jonathan -->
					<td class="player-eliminated">eliminated</td><!-- Charles -->
					<td class="player-eliminated">eliminated</td><!-- Tejas -->
					<td class="player-eliminated">eliminated</td><!-- Justin -->
					<td class="player-eliminated">eliminated</td><!-- Alex -->
					<td class="player-eliminated">eliminated</td><!-- Jared -->
					<td class="player-eliminated">eliminated</td><!-- David -->
					<td class="player-eliminated">eliminated</td><!-- Jack -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
			</tfoot>
		</table>
		
		<p>Jonathan Lau of University Laboratory High School (Urbana, Illinois) is the champion of the 2020 Scobol Solo. He is the first player from University Lab to win the tournament.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
