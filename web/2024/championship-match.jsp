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
					<th class="answer" rowspan="2">Answer</th>
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
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr>
					<th class="question-number">1</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-correct-response">1</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">Reynolds number</td>
				</tr>
				<tr>
					<th class="question-number">2</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-correct-response">1</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">Hesiod</td>
				</tr>
				<tr>
					<th class="question-number">3</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-incorrect-response">&minus;1</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-correct-response">1</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">Tiberius</td>
				</tr>
				<tr>
					<th class="question-number">4</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-correct-response">1</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">Baruch Spinoza</td>
				</tr>
				<tr>
					<th class="question-number">5</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-correct-response">1</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">“The Rain in Spain”</td>
				</tr>
				<tr>
					<th class="question-number">6</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-incorrect-response">&minus;1</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">ketone bodies</td>
				</tr>
				<tr>
					<th class="question-number">7</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-correct-response">1</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">Rudkus family</td>
				</tr>
				<tr>
					<th class="question-number">8</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-correct-response">1</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">Lake Titicaca</td>
				<tr>
					<th class="question-number">9</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-correct-response">1</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">Artemisia Gentileschi</td>
				</tr>
				<tr>
					<th class="question-number">10</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-correct-response">1</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-incorrect-response">&minus;1</td><!-- Sam Kemeny -->
					<td class="player-incorrect-response">&minus;1</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">Kwame Nkrumah</td>
				</tr>
				<tr>
					<th class="question-number">11</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">centaurs (astronomical objects)</td>
				</tr>
				<tr>
					<th class="question-number">12</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-correct-response">1</td><!-- Abigail AuYeung -->
					<td class="answer"><i>The Turn of the Screw</i></td>
				</tr>
				<tr>
					<th class="question-number">13</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-incorrect-response">&minus;1</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-correct-response">1</td><!-- Abigail AuYeung -->
					<td class="answer">Anton Webern</td>
				</tr>
				<tr>
					<th class="question-number">14</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-correct-response">1</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">Henry A. Wallace</td>
				</tr>
				<tr>
					<th class="question-number">15</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-correct-response">1</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">Ishtar</td>
				</tr>
				<tr>
					<th class="question-number">16</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-incorrect-response">&minus;1</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-correct-response">1</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">salicylic acid</td>
				</tr>
				<tr>
					<th class="question-number">17</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-correct-response">1</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer"><i>The Master and Margarita</i></td>
				</tr>
				<tr>
					<th class="question-number">18</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-correct-response">1</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">Creek War</td>
				</tr>
				<tr>
					<th class="question-number">19</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-correct-response">1</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">Giorgia Meloni</td>
				</tr>
				<tr>
					<th class="question-number">20</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-incorrect-response">&minus;1</td><!-- Steven Long -->
					<td class="player-correct-response">1</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">cotangent function</td>
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
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="10" class="note">
						Anirudh Srinivasan, as Morning Champion, entered the game with a score equal to that of the then-leader, Spencer Manning: 6.
					</td>
				</tr>
				<tr>
					<th class="question-number">21</th>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-correct-response">1</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">Carl Rogers</td>
				</tr>
				<tr>
					<th class="question-number">22</th>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-correct-response">1</td><!-- Abigail AuYeung -->
					<td class="answer">Don DeLillo</td>
				</tr>
				<tr>
					<th class="question-number">23</th>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-correct-response">1</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">substitution reaction</td>
				</tr>
				<tr>
					<th class="question-number">24</th>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-correct-response">1</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">Ella Fitzgerald</td>
				</tr>
				<tr>
					<th class="question-number">25</th>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-correct-response">1</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">Battle of Red Cliffs</td>
				</tr>
				<tr>
					<th class="question-number">26</th>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-correct-response">1</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer"><i>The Golden Notebook</i></td>
				</tr>
				<tr>
					<th class="question-number">27</th>
					<td class="player-correct-response">1</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">histones</td>
				</tr>
				<tr>
					<th class="question-number">28</th>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-correct-response">1</td><!-- Ryan Dai -->
					<td class="player-incorrect-response">&minus;1</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">Eric Adams</td>
				</tr>
				<tr>
					<th class="question-number">29</th>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-correct-response">1</td><!-- Spencer Manning -->
					<td class="player-incorrect-response">&minus;1</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-incorrect-response">&minus;1</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">Sukarno</td>
				</tr>
				<tr>
					<th class="question-number">30</th>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-incorrect-response">&minus;1</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-incorrect-response">&minus;1</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-correct-response">1</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer"><i>The Well-Tempered Clavier</i></td>
				</tr>
				<tr>
					<th class="question-number">31</th>
					<td class="player-correct-response">1</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-incorrect-response">&minus;1</td><!-- Felix Sacks -->
					<td class="player-incorrect-response">&minus;1</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">feldspars</td>
				</tr>
				<tr>
					<th class="question-number">32</th>
					<td class="player-correct-response">1</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">golden calf</td>
				</tr>
				<tr>
					<th class="question-number">33</th>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-correct-response">1</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">Juan Carlos&nbsp;I</td>
				</tr>
				<tr>
					<th class="question-number">34</th>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-correct-response">1</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer"><i>A Personal Matter</i></td>
				</tr>
				<tr>
					<th class="question-number">35</th>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-correct-response">1</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">piezoelectricity</td>
				</tr>
				<tr>
					<th class="question-number">36</th>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-incorrect-response">&minus;1</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">Fra Angelico</td>
				</tr>
				<tr>
					<th class="question-number">37</th>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-correct-response">1</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">Shenandoah Valley</td>
				</tr>
				<tr>
					<th class="question-number">38</th>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-incorrect-response">&minus;1</td><!-- Steven Long -->
					<td class="player-incorrect-response">&minus;1</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-correct-response">1</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">Edna St.&nbsp;Vincent Millay</td>
				</tr>
				<tr>
					<th class="question-number">39</th>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-correct-response">1</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-no-response">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-incorrect-response">&minus;1</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer"><i>Schenck v. United States</i></td>
				</tr>
				<tr>
					<th class="question-number">40</th>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-incorrect-response">&minus;1</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-incorrect-response">&minus;1</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">&nbsp;</td>
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
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="10" class="note">
						The players with the lowest scores were eliminated until four players remained. Evan Ting, Felix Sacks, and Abigail AuYeung were tied for the last two positions, so tiebreaker questions were read. Abigail AuYeung answered the first tiebreaker question correctly to secure a spot in the next phase. Evan Ting answered the second tiebreaker question incorrectly, eliminating himself. Therefore, Evan Ting, Ryan Dai, Steven Long, Sam Kemeny, and Winnie Nutkowitz were eliminated. Anirudh Srinivasan, Spencer Manning, Felix Sacks, and Abigail AuYeung remained.
					</td>
				</tr>
				<tr>
					<th class="question-number">41</th>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-correct-response">1</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">Dorothea Dix</td>
				</tr>
				<tr>
					<th class="question-number">42</th>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-correct-response">1</td><!-- Spencer Manning -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">interferometers</td>
				</tr>
				<tr>
					<th class="question-number">43</th>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-correct-response">1</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">Sergei Rachmaninoff</td>
				</tr>
				<tr>
					<th class="question-number">44</th>
					<td class="player-incorrect-response">&minus;1</td><!-- Anirudh Srinivasan -->
					<td class="player-correct-response">1</td><!-- Spencer Manning -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">sirens (mythological creatures)</td>
				</tr>
				<tr>
					<th class="question-number">45</th>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">John Osborne</td>
				</tr>
				<tr>
					<th class="question-number">46</th>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-correct-response">1</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">Cretaceous period</td>
				</tr>
				<tr>
					<th class="question-number">47</th>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-correct-response">1</td><!-- Spencer Manning -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">Paraguay</td>
				</tr>
				<tr>
					<th class="question-number">48</th>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-correct-response">1</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">allegory of the cave</td>
				</tr>
				<tr>
					<th class="question-number">49</th>
					<td class="player-no-response">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-correct-response">1</td><!-- Abigail AuYeung -->
					<td class="answer">Saul Bellow</td>
				</tr>
				<tr>
					<th class="question-number">50</th>
					<td class="player-correct-response">1</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-no-response">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">center of mass</td>
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
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="10" class="note">
						The players with the lowest scores were eliminated until two players remained. Therefore, Anirudh Srinivasan and Abigail AuYeung were eliminated. Spencer Manning and Felix Sacks remained.
					</td>
					<!-- <td>&nbsp;</td> -->
				</tr>
				<tr>
					<th class="question-number">51</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-correct-response">1</td><!-- Spencer Manning -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-not-in-game">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">Giuseppe Mazzini</td>
				</tr>
				<tr>
					<th class="question-number">52</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-correct-response">1</td><!-- Spencer Manning -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-not-in-game">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">Jean-Michel Basquiat and Andy Warhol</td>
				</tr>
				<tr>
					<th class="question-number">53</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-correct-response">1</td><!-- Spencer Manning -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-not-in-game">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">Houthis</td>
				</tr>
				<tr>
					<th class="question-number">54</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-correct-response">1</td><!-- Spencer Manning -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-not-in-game">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">plankton</td>
				</tr>
				<tr>
					<th class="question-number">55</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-correct-response">1</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-not-in-game">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer"><i>Lysistrata</i></td>
				</tr>
				<tr>
					<th class="question-number">56</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-correct-response">1</td><!-- Spencer Manning -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-not-in-game">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">Khufu</td>
				</tr>
				<tr>
					<th class="question-number">57</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-correct-response">1</td><!-- Spencer Manning -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-not-in-game">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">Antonio Canova</td>
				</tr>
				<tr>
					<th class="question-number">58</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-no-response">&nbsp;</td><!-- Spencer Manning -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-correct-response">1</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-not-in-game">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">phosphate ion</td>
				</tr>
				<tr>
					<th class="question-number">59</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-incorrect-response">&minus;1</td><!-- Spencer Manning -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-correct-response">1</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-not-in-game">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">Ranier Maria Rilke</td>
				</tr>
				<tr>
					<th class="question-number">60</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Anirudh Srinivasan -->
					<td class="player-correct-response">1</td><!-- Spencer Manning -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ryan Dai -->
					<td class="player-not-in-game">&nbsp;</td><!-- Steven Long -->
					<td class="player-no-response">&nbsp;</td><!-- Felix Sacks -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- Winnie Nutkowitz -->
					<td class="player-not-in-game">&nbsp;</td><!-- Abigail AuYeung -->
					<td class="answer">Bangkok</td>
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
					<td class="answer-blank">&nbsp;</td>
				</tr>
			</tfoot>
		</table>
		
		<p>Spencer Manning of Adlai E. Stevenson High School (Lincolnshire) is the champion of the 2024 Scobol Solo. This is the fourth championship by a Stevenson player.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
