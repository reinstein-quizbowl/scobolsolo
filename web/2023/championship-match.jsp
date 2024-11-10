<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2023" />
	<jsp:param name="pageTitle" value="Championship Match" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2023()).asTopLevel().output(request, \"championship-match\") %>" />
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
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1490#player_3370">Rohan Kher</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1490#player_3369">Charles Young</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1494#player_3397">Soren Gjesfjeld</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1492#player_3383">Dwij Bhatt</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1492#player_3382">Omkar Marathe</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1491#player_3375">Sam Kemeny</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1484">David Bertolasi</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1475">Anna-Maria Olarov</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1471#player_3299">Sriram Koritala</a></th>
					<th class="answer" rowspan="2">Answer</th>
				</tr>
				<tr class="player-schools">
					<th>&nbsp;</th>
					<th class="player-school">Barrington</th><!-- Rohan Kher -->
					<th class="player-school">Barrington</th><!-- Charles Young -->
					<th class="player-school">Bloomington</th><!-- Soren Gjesfjeld -->
					<th class="player-school">Fremd (Palatine)</th><!-- Dwij Bhatt -->
					<th class="player-school">Fremd</th><!-- Omkar Marathe -->
					<th class="player-school">Evanston</th><!-- Sam Kemeny -->
					<th class="player-school">Belvidere</th><!-- David Bertolasi -->
					<th class="player-school">Naperville North</th><!-- Anna-Maria Olarov -->
					<th class="player-school">Lisle</th><!-- Sriram Koritala -->
				</tr>
			</thead>
			<tbody>
				<tr class="score-check">
					<th class="score-check-label">Initial scores</th>
					<td class="player-score-check">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-score-check">3</td><!-- Charles Young -->
					<td class="player-score-check">3</td><!-- Soren Gjesfjeld -->
					<td class="player-score-check">3</td><!-- Dwij Bhatt -->
					<td class="player-score-check">3</td><!-- Omkar Marathe -->
					<td class="player-score-check">3</td><!-- Sam Kemeny -->
					<td class="player-score-check">3</td><!-- David Bertolasi -->
					<td class="player-score-check">3</td><!-- Anna-Maria Olarov -->
					<td class="player-score-check">3</td><!-- Sriram Koritala -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr>
					<th class="question-number">1</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-correct-response">1</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-no-response">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-no-response">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">permittivity</td>
				</tr>
				<tr>
					<th class="question-number">2</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-no-response">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-no-response">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">Jacques Derrida</td>
				</tr>
				<tr>
					<th class="question-number">3</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-correct-response">1</td><!-- Omkar Marathe -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-no-response">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-no-response">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">&#8220;The Song of Despair&#8221;</td>
				</tr>
				<tr>
					<th class="question-number">4</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-no-response">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-correct-response">1</td><!-- Sriram Koritala -->
					<td class="answer">Josip Broz Tito</td>
				</tr>
				<tr>
					<th class="question-number">5</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-no-response">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-no-response">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">urea</td>
				</tr>
				<tr>
					<th class="question-number">6</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-correct-response">1</td><!-- Anna-Maria Olarov -->
					<td class="player-no-response">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">cadenzas</td>
				</tr>
				<tr>
					<th class="question-number">7</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-correct-response">1</td><!-- Omkar Marathe -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-no-response">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-no-response">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">&#8220;The Garden of Forking Paths&#8221;</td>
				</tr>
				<tr>
					<th class="question-number">8</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-incorrect-response">&minus;1</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-correct-response">1</td><!-- David Bertolasi -->
					<td class="player-no-response">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-no-response">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">Kyrgyzstan</td>
				<tr>
					<th class="question-number">9</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-correct-response">1</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-no-response">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-no-response">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">cobalt</td>
				</tr>
				<tr>
					<th class="question-number">10</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-incorrect-response">&minus;1</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-no-response">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-no-response">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">Fred Hampton</td>
				</tr>
				<tr>
					<th class="question-number">11</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-correct-response">1</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-no-response">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-no-response">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">Eudora Welty</td>
				</tr>
				<tr>
					<th class="question-number">12</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-no-response">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-no-response">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">Stan Getz</td>
				</tr>
				<tr>
					<th class="question-number">13</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-no-response">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-no-response">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">Sam Bankman-Fried</td>
				</tr>
				<tr>
					<th class="question-number">14</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-no-response">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-no-response">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">SMTP</td>
				</tr>
				<tr>
					<th class="question-number">15</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-incorrect-response">&minus;1</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-incorrect-response">&minus;1</td><!-- Anna-Maria Olarov -->
					<td class="player-no-response">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">W. Somerset Maugham</td>
				</tr>
				<tr>
					<th class="question-number">16</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-correct-response">1</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-no-response">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-no-response">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">Assyria</td>
				</tr>
				<tr>
					<th class="question-number">17</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-no-response">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-no-response">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">Francis Bacon (painter)</td>
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="9" class="note">
						Charles Young reached 10 points and therefore sat out through tossup&nbsp;20.
					</td>
				</tr>
				<tr>
					<th class="question-number">18</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-correct-response">1</td><!-- Anna-Maria Olarov -->
					<td class="player-no-response">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">arc length</td>
				</tr>
				<tr>
					<th class="question-number">19</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-correct-response">1</td><!-- Omkar Marathe -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-no-response">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-no-response">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">bodhisattvas</td>
				</tr>
				<tr>
					<th class="question-number">20</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-correct-response">1</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-no-response">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-no-response">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">Apache people</td>
				</tr>
				<tr class="score-check">
					<th class="score-check-label">Scores through 20</th>
					<td class="player-score-check">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-score-check">10</td><!-- Charles Young -->
					<td class="player-score-check">3</td><!-- Soren Gjesfjeld -->
					<td class="player-score-check">7</td><!-- Dwij Bhatt -->
					<td class="player-score-check">4</td><!-- Omkar Marathe -->
					<td class="player-score-check">1</td><!-- Sam Kemeny -->
					<td class="player-score-check">4</td><!-- David Bertolasi -->
					<td class="player-score-check">4</td><!-- Anna-Maria Olarov -->
					<td class="player-score-check">8</td><!-- Sriram Koritala -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="9" class="note">
						Rohan Kher, as Morning Champion, entered the game with a score equal to that of the then-leader, Charles Young: 10.
					</td>
				</tr>
				<tr>
					<th class="question-number">21</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-incorrect-response">&minus;1</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-incorrect-response">&minus;1</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-incorrect-response">&minus;1</td><!-- Sam Kemeny -->
					<td class="player-incorrect-response">&minus;1</td><!-- David Bertolasi -->
					<td class="player-no-response">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-no-response">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">Kartikeya</td>
				</tr>
				<tr>
					<th class="question-number">22</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-incorrect-response">&minus;1</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-no-response">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-correct-response">1</td><!-- Sriram Koritala -->
					<td class="answer">accretion disks</td>
				</tr>
				<tr>
					<th class="question-number">23</td>
					<td class="player-correct-response">1</td><!-- Rohan Kher -->
					<td class="player-incorrect-response">&minus;1</td><!-- Charles Young -->
					<td class="player-incorrect-response">&minus;1</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-no-response">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-no-response">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">Julia Alvarez</td>
				</tr>
				<tr>
					<th class="question-number">24</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-no-response">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-no-response">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">Gaetano Donizetti</td>
				</tr>
				<tr>
					<th class="question-number">25</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-incorrect-response">&minus;1</td><!-- Omkar Marathe -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-no-response">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-no-response">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">functionalism</td>
				</tr>
				<tr>
					<th class="question-number">26</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-correct-response">1</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-no-response">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-no-response">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">Songhai empire</td>
				</tr>
				<tr>
					<th class="question-number">27</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-correct-response">1</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-no-response">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-no-response">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">inductance</td>
				</tr>
				<tr>
					<th class="question-number">28</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-no-response">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-no-response">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">kissing (in art)</td>
				</tr>
				<tr>
					<th class="question-number">29</td>
					<td class="player-correct-response">1</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-no-response">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-no-response">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer"><i>An American Tragedy</i></td>
				</tr>
				<tr>
					<th class="question-number">30</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-correct-response">1</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-no-response">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-no-response">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">Stockholm (in history)</td>
				</tr>
				<tr>
					<th class="question-number">31</td>
					<td class="player-correct-response">1</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-no-response">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-no-response">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">pyruvate</td>
				</tr>
				<tr>
					<th class="question-number">32</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-correct-response">1</td><!-- David Bertolasi -->
					<td class="player-no-response">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-no-response">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">Cumberland (geography common link)</td>
				</tr>
				<tr>
					<th class="question-number">33</td>
					<td class="player-incorrect-response">&minus;1</td><!-- Rohan Kher -->
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-incorrect-response">&minus;1</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-no-response">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-no-response">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer"><i>Orlando Furioso</i></td>
				</tr>
				<tr>
					<th class="question-number">34</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-no-response">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-no-response">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">Erik Satie</td>
				</tr>
				<tr>
					<th class="question-number">35</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-correct-response">1</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-no-response">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-no-response">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">Myles Standish</td>
				</tr>
				<tr>
					<th class="question-number">36</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-correct-response">1</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-no-response">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-no-response">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">power of a point</td>
				</tr>
				<tr>
					<th class="question-number">37</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-incorrect-response">&minus;1</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-incorrect-response">&minus;1</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-no-response">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-correct-response">1</td><!-- Sriram Koritala -->
					<td class="answer">Azerbaijan (current events)</td>
				</tr>
				<tr>
					<th class="question-number">38</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-no-response">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-no-response">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">Richard Brinsley Sheridan</td>
				</tr>
				<tr>
					<th class="question-number">39</td>
					<td class="player-correct-response">1</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-no-response">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-no-response">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-no-response">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">Eighty Years&#8217; War</td>
				</tr>
				<tr>
					<th class="question-number">40</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-no-response">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-incorrect-response">&minus;1</td><!-- Omkar Marathe -->
					<td class="player-no-response">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-no-response">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-no-response">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-correct-response">1</td><!-- Sriram Koritala -->
					<td class="answer">esters</td>
				</tr>
				<tr class="score-check">
					<th class="score-check-label">Scores through 40</th>
					<td class="player-score-check">13</td><!-- Rohan Kher -->
					<td class="player-score-check">13</td><!-- Charles Young -->
					<td class="player-score-check">3</td><!-- Soren Gjesfjeld -->
					<td class="player-score-check">6</td><!-- Dwij Bhatt -->
					<td class="player-score-check">4</td><!-- Omkar Marathe -->
					<td class="player-score-check">1</td><!-- Sam Kemeny -->
					<td class="player-score-check">4</td><!-- David Bertolasi -->
					<td class="player-score-check">4</td><!-- Anna-Maria Olarov -->
					<td class="player-score-check">7</td><!-- Sriram Koritala -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="9" class="note">
						The players with the lowest scores were eliminated until four players remained. Therefore, Soren Gjesfjeld, Omkar Marathe, Sam Kemeny, David Bertolasi, and Anna-Maria Olarov were eliminated. Rohan Kher, Charles Young, Dwij Bhatt, and Sriram Koritala remained.
					</td>
				</tr>
				<tr>
					<th class="question-number">41</td>
					<td class="player-correct-response">1</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-not-in-game">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-not-in-game">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-no-response">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">Bohemia</td>
				</tr>
				<tr>
					<th class="question-number">42</td>
					<td class="player-correct-response">1</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-incorrect-response">&minus;1</td><!-- Dwij Bhatt -->
					<td class="player-not-in-game">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-not-in-game">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-no-response">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">cirrus clouds</td>
				</tr>
				<tr>
					<th class="question-number">43</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-not-in-game">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-not-in-game">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-no-response">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">Yasunari Kawabata</td>
				</tr>
				<tr>
					<th class="question-number">44</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-not-in-game">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-not-in-game">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-no-response">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">Democratic Republic of the Congo (current events)</td>
				</tr>
				<tr>
					<th class="question-number">45</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-not-in-game">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-not-in-game">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-no-response">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">Paul Klee</td>
				</tr>
				<tr>
					<th class="question-number">46</td>
					<td class="player-correct-response">1</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-not-in-game">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-not-in-game">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-no-response">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">Wounded Knee</td>
				</tr>
				<tr>
					<th class="question-number">47</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-not-in-game">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-not-in-game">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-correct-response">1</td><!-- Sriram Koritala -->
					<td class="answer">centromeres</td>
				</tr>
				<tr>
					<th class="question-number">48</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-correct-response">1</td><!-- Dwij Bhatt -->
					<td class="player-not-in-game">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-not-in-game">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-no-response">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">&#8220;The Love Song of J.&nbsp;Alfred Prufrock&#8221;</td>
				</tr>
				<tr>
					<th class="question-number">49</td>
					<td class="player-correct-response">1</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-no-response">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-not-in-game">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-not-in-game">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-no-response">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">monks</td>
				</tr>
				<tr>
					<th class="question-number">50</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-correct-response">1</td><!-- Dwij Bhatt -->
					<td class="player-not-in-game">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-not-in-game">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-no-response">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">onion domes</td>
				</tr>
				<tr class="score-check">
					<th class="score-check-label">Scores through 50</th>
					<td class="player-score-check">17</td><!-- Rohan Kher -->
					<td class="player-score-check">16</td><!-- Charles Young -->
					<td class="player-eliminated">eliminated</td><!-- Soren Gjesfjeld -->
					<td class="player-score-check">7</td><!-- Dwij Bhatt -->
					<td class="player-eliminated">eliminated</td><!-- Omkar Marathe -->
					<td class="player-eliminated">eliminated</td><!-- Sam Kemeny -->
					<td class="player-eliminated">eliminated</td><!-- David Bertolasi -->
					<td class="player-eliminated">eliminated</td><!-- Anna-Maria Olarov -->
					<td class="player-score-check">8</td><!-- Sriram Koritala -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="9" class="note">
						The players with the lowest scores were eliminated until two players remained. Therefore, Dwij Bhatt and Sriram Koritala were eliminated. Rohan Kher and Charles Young remained.
					</td>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<th class="question-number">51</td>
					<td class="player-correct-response">1</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-not-in-game">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-not-in-game">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">powers of 2</td>
				</tr>
				<tr>
					<th class="question-number">52</td>
					<td class="player-correct-response">1</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-not-in-game">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-not-in-game">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">globalization</td>
				</tr>
				<tr>
					<th class="question-number">53</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-not-in-game">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-not-in-game">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">Charles Ives</td>
				</tr>
				<tr>
					<th class="question-number">54</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-not-in-game">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-not-in-game">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer"><i>Wuthering Heights</i></td>
				</tr>
				<tr>
					<th class="question-number">55</td>
					<td class="player-correct-response">1</td><!-- Rohan Kher -->
					<td class="player-incorrect-response">&minus;1</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-not-in-game">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-not-in-game">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">Battle of Megiddo</td>
				</tr>
				<tr>
					<th class="question-number">56</td>
					<td class="player-correct-response">1</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-not-in-game">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-not-in-game">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">electric dipoles</td>
				</tr>
				<tr>
					<th class="question-number">57</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-not-in-game">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-not-in-game">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">Cameroon (geography)</td>
				</tr>
				<tr>
					<th class="question-number">58</td>
					<td class="player-no-response">&nbsp;</td><!-- Rohan Kher -->
					<td class="player-correct-response">1</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-not-in-game">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-not-in-game">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">Eugene O&#8217;Neill</td>
				</tr>
				<tr>
					<th class="question-number">59</td>
					<td class="player-correct-response">1</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-not-in-game">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-not-in-game">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">Sri Lanka (history)</td>
				</tr>
				<tr>
					<th class="question-number">60</td>
					<td class="player-correct-response">1</td><!-- Rohan Kher -->
					<td class="player-no-response">&nbsp;</td><!-- Charles Young -->
					<td class="player-not-in-game">&nbsp;</td><!-- Soren Gjesfjeld -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dwij Bhatt -->
					<td class="player-not-in-game">&nbsp;</td><!-- Omkar Marathe -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sam Kemeny -->
					<td class="player-not-in-game">&nbsp;</td><!-- David Bertolasi -->
					<td class="player-not-in-game">&nbsp;</td><!-- Anna-Maria Olarov -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sriram Koritala -->
					<td class="answer">peroxides</td>
				</tr>
			</tbody>
			<tfoot>
				<tr class="score-check">
					<th class="score-check-label">Final scores</th>
					<td class="player-score-check">23</td><!-- Rohan Kher -->
					<td class="player-score-check">18</td><!-- Charles Young -->
					<td class="player-eliminated">eliminated</td><!-- Soren Gjesfjeld -->
					<td class="player-eliminated">eliminated</td><!-- Dwij Bhatt -->
					<td class="player-eliminated">eliminated</td><!-- Omkar Marathe -->
					<td class="player-eliminated">eliminated</td><!-- Sam Kemeny -->
					<td class="player-eliminated">eliminated</td><!-- David Bertolasi -->
					<td class="player-eliminated">eliminated</td><!-- Anna-Maria Olarov -->
					<td class="player-eliminated">eliminated</td><!-- Sriram Koritala -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
			</tfoot>
		</table>
		
		<p>Rohan Kher of Barrington High School is the champion of the 2023 Scobol Solo. This is the <a href="/2022/">third</a> <a href="/2021/">consecutive</a> championship by a Barrington player.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
