<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2024" />
	<jsp:param name="pageTitle" value="Championship Match" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2024()).asTopLevel().output(request, \"championship-match\") %>" />
	<jsp:param name="h1" value="Championship Match" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>The participants in the Championship Match are the one player who won all seven preliminary matches (the Morning Champion), the seven players who won six of their preliminary matches, and the <a href="/instructions/championship-match.jsp#tiebreaker-criterion">top player</a> among those who won five of their preliminary matches.</p>
		
		<p>Unlike in the preliminary rounds, all incorrect answers result in a deduction of 1&nbsp;point. This is true regardless of whether the incorrect answer interrupted the question; it is thus different from ordinary “negs”.</p>
		
		<p>Each player starts with 3&nbsp;points. A player whose score reaches 0 is immediately removed from the match.</p>
		
		<p>If any player reaches a score of 10 during the first 20&nbsp;tossups, they sit out until tossup&nbsp;21.</p>
		
		<p>The Morning Champion sits out for the first 20&nbsp;tossups, and enters at tossup&nbsp;21 with a score equal to that of the leader at that time. After tossup&nbsp;40, the lowest-scoring players are removed until four remain; if necessary, tiebreaker tossups are used, but they do not count in the overall score of the championship match. After tossup&nbsp;50, the lowest-scoring remaining players are eliminated until two remain; the tiebreaker procedure is the same as before. At the conclusion of the match, tiebreaker tossups are read if and as necessary.</p>
		
		<table class="even-spacing unsortable championship-scoresheet">
			<thead>
				<tr class="player-names">
					<th>&nbsp;</th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1490#player_3370">Anirudh Srinivasan</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1490#player_3369">Spencer Manning</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1494#player_3397">Evan Ting</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1492#player_3383">Ryan Dai</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1492#player_3382">Steven Long</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1491#player_3375">Felix Sacks</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1484">Sam Kemeny</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1475">Winnie Nutkowitz</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1471#player_3299">Abigail AuYeung</a></th>
					<!-- <th class="answer" rowspan="2">Answer</th> -->
				</tr>
				<tr class="player-schools">
					<th>&nbsp;</th>
					<th class="player-school">Stevenson (Lincolnshire)</th><!-- Anirudh Srinivasan -->
					<th class="player-school">Stevenson</th><!-- Spencer Manning -->
					<th class="player-school">Park Tudor (Indianapolis, Indiana)</th><!-- Evan Ting -->
					<th class="player-school">Carbondale</th><!-- Ryan Dai -->
					<th class="player-school">Fremd (Palatine)</th><!-- Steven Long -->
					<th class="player-school">Lincoln-Way East (Frankfort)</th><!-- Felix Sacks -->
					<th class="player-school">Evanston</th><!-- Sam Kemeny -->
					<th class="player-school">Northside (Chicago)</th><!-- Winnie Nutkowitz -->
					<th class="player-school">Hinsdale Central (Darien)</th><!-- Abigail AuYeung -->
				</tr>
			</thead>
			<tbody>
				<tr class="score-check">
					<th class="score-check-label">Initial scores</th>
					<td class="player-score-check">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-score-check">3</td><!-- Spencer Manning -->
					<td class="player-score-check">3</td><!-- Evan Ting -->
					<td class="player-score-check">3</td><!-- Ryan Dai -->
					<td class="player-score-check">3</td><!-- Steven Long -->
					<td class="player-score-check">3</td><!-- Felix Sacks -->
					<td class="player-score-check">3</td><!-- Sam Kemeny -->
					<td class="player-score-check">3</td><!-- Winnie Nutkowitz -->
					<td class="player-score-check">3</td><!-- Abigail AuYeung -->
					<!-- <td class="answer-blank">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">1</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-correct-response">1</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">2</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-correct-response">1</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">3</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-incorrect-response">&minus;1</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-correct-response">1</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">4</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-correct-response">1</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">5</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-correct-response">1</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">6</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-incorrect-response">&minus;1</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">7</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-correct-response">1</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">8</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-correct-response">1</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				<tr>
					<th class="question-number">9</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-correct-response">1</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">10</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-correct-response">1</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-incorrect-response">&minus;1</td><!-- Sam Kemeny -->
					<td class="player-incorrect-response">&minus;1</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">11</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">12</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-correct-response">1</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">13</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-incorrect-response">&minus;1</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-correct-response">1</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">14</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-correct-response">1</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">15</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-correct-response">1</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">16</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-incorrect-response">&minus;1</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-correct-response">1</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">17</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-correct-response">1</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">18</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-correct-response">1</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">19</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-correct-response">1</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">20</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-incorrect-response">&minus;1</td><!-- Steven Long -->
					<td class="player-correct-response">1</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr class="score-check">
					<th class="score-check-label">Scores through 20</th>
					<td class="player-score-check">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-score-check">6</td><!-- Spencer Manning -->
					<td class="player-score-check">5</td><!-- Evan Ting -->
					<td class="player-score-check">3</td><!-- Ryan Dai -->
					<td class="player-score-check">5</td><!-- Steven Long -->
					<td class="player-score-check">5</td><!-- Felix Sacks -->
					<td class="player-score-check">4</td><!-- Sam Kemeny -->
					<td class="player-score-check">2</td><!-- Winnie Nutkowitz -->
					<td class="player-score-check">5</td><!-- Abigail AuYeung -->
					<!-- <td class="answer-blank">&nbsp;</td> -->
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="9" class="note">
						Anirudh Srinivasan, as Morning Champion, entered the game with a score equal to that of the then-leader, Spencer Manning: 6.
					</td>
				</tr>
				<tr>
					<th class="question-number">21</td>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-correct-response">1</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">22</td>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-correct-response">1</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">23</td>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-correct-response">1</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">24</td>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-correct-response">1</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">25</td>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-correct-response">1</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">26</td>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-correct-response">1</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">27</td>
					<td class="player-correct-response">1</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">28</td>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-correct-response">1</td><!-- Ryan Dai -->
					<td class="player-incorrect-response">&minus;1</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">29</td>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-correct-response">1</td><!-- Spencer Manning -->
					<td class="player-incorrect-response">&minus;1</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-incorrect-response">&minus;1</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">30</td>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-incorrect-response">&minus;1</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-incorrect-response">&minus;1</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-correct-response">1</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">31</td>
					<td class="player-correct-response">1</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-incorrect-response">&minus;1</td><!-- Felix Sacks -->
					<td class="player-incorrect-response">&minus;1</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">32</td>
					<td class="player-correct-response">1</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">33</td>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-correct-response">1</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">34</td>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-correct-response">1</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">35</td>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-correct-response">1</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">36</td>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-incorrect-response">&minus;1</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">37</td>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-correct-response">1</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">38</td>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-incorrect-response">&minus;1</td><!-- Steven Long -->
					<td class="player-incorrect-response">&minus;1</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-correct-response">1</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">39</td>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-correct-response">1</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-incorrect-response">&minus;1</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">40</td>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-incorrect-response">&minus;1</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-incorrect-response">&minus;1</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr class="score-check">
					<th class="score-check-label">Scores through 40</th>
					<td class="player-score-check">9</td><!-- Anirudh Srinivasan -->
					<td class="player-score-check">8</td><!-- Spencer Manning -->
					<td class="player-score-check">6</td><!-- Evan Ting -->
					<td class="player-score-check">4</td><!-- Ryan Dai -->
					<td class="player-score-check">2</td><!-- Steven Long -->
					<td class="player-score-check">6</td><!-- Felix Sacks -->
					<td class="player-score-check">3</td><!-- Sam Kemeny -->
					<td class="player-score-check">2</td><!-- Winnie Nutkowitz -->
					<td class="player-score-check">6</td><!-- Abigail AuYeung -->
					<!-- <td class="answer-blank">&nbsp;</td> -->
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="9" class="note">
						The players with the lowest scores were eliminated until four players remained. Evan Ting, Felix Sacks, and Abigail AuYeung were tied for the last two positions, so tiebreaker questions were read. Abigail AuYeung answered the first tiebreaker question correctly to secure a spot in the next phase. Evan Ting answered the second tiebreaker question incorrectly, eliminating himself. Therefore, Evan Ting, Ryan Dai, Steven Long, Sam Kemeny, and Winnie Nutkowitz were eliminated. Anirudh Srinivasan, Spencer Manning, Felix Sacks, and Abigail AuYeung remained.
					</td>
				</tr>
				<tr>
					<th class="question-number">41</td>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-correct-response">1</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">42</td>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-correct-response">1</td><!-- Spencer Manning -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">43</td>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-correct-response">1</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">44</td>
					<td class="player-incorrect-response">&minus;1</td><!-- Anirudh Srinivasan -->
					<td class="player-correct-response">1</td><!-- Spencer Manning -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">45</td>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">46</td>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-correct-response">1</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">47</td>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-correct-response">1</td><!-- Spencer Manning -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">48</td>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-correct-response">1</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">49</td>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-correct-response">1</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">50</td>
					<td class="player-correct-response">1</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr class="score-check">
					<th class="score-check-label">Scores through 50</th>
					<td class="player-score-check">9</td><!-- Anirudh Srinivasan -->
					<td class="player-score-check">11</td><!-- Spencer Manning -->
					<td class="player-eliminated">eliminated</td><!-- Evan Ting -->
					<td class="player-eliminated">eliminated</td><!-- Ryan Dai -->
					<td class="player-eliminated">eliminated</td><!-- Steven Long -->
					<td class="player-score-check">10</td><!-- Felix Sacks -->
					<td class="player-eliminated">eliminated</td><!-- Sam Kemeny -->
					<td class="player-eliminated">eliminated</td><!-- Winnie Nutkowitz -->
					<td class="player-score-check">7</td><!-- Abigail AuYeung -->
					<!-- <td class="answer-blank">&nbsp;</td> -->
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="9" class="note">
						The players with the lowest scores were eliminated until two players remained. Therefore, Anirudh Srinivasan and Abigail AuYeung were eliminated. Spencer Manning and Felix Sacks remained.
					</td>
					<!-- <td>&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">51</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-correct-response">1</td><!-- Spencer Manning -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-not-in-game">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">52</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-correct-response">1</td><!-- Spencer Manning -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-not-in-game">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">53</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-correct-response">1</td><!-- Spencer Manning -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-not-in-game">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">54</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-correct-response">1</td><!-- Spencer Manning -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-not-in-game">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">55</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-correct-response">1</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-not-in-game">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">56</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-correct-response">1</td><!-- Spencer Manning -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-not-in-game">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">57</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-correct-response">1</td><!-- Spencer Manning -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-not-in-game">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">58</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-correct-response">1</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-not-in-game">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">59</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-incorrect-response">&minus;1</td><!-- Spencer Manning -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-correct-response">1</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-not-in-game">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">60</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-correct-response">1</td><!-- Spencer Manning -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-not-in-game">&nbsp;</td><!-- Abigail AuYeung -->
					<!-- <td class="answer">&nbsp;</td> -->
				</tr>
			</tbody>
			<tfoot>
				<tr class="score-check">
					<th class="score-check-label">Final scores</th>
					<td class="player-score-check">17</td><!-- Anirudh Srinivasan -->
					<td class="player-score-check">13</td><!-- Spencer Manning -->
					<td class="player-eliminated">eliminated</td><!-- Evan Ting -->
					<td class="player-eliminated">eliminated</td><!-- Ryan Dai -->
					<td class="player-eliminated">eliminated</td><!-- Steven Long -->
					<td class="player-eliminated">eliminated</td><!-- Felix Sacks -->
					<td class="player-eliminated">eliminated</td><!-- Sam Kemeny -->
					<td class="player-eliminated">eliminated</td><!-- Winnie Nutkowitz -->
					<td class="player-eliminated">eliminated</td><!-- Abigail AuYeung -->
					<!-- <td class="answer-blank">&nbsp;</td> -->
				</tr>
			</tfoot>
		</table>
		
		<p>Spencer Manning of Adlai E. Stevenson High School (Lincolnshire) is the champion of the 2024 Scobol Solo. This is the fourth championship by a Stevenson player.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
