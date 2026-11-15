<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2026" />
	<jsp:param name="pageTitle" value="Championship Match" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2026()).asTopLevel().output(request, \"championship-match\") %>" />
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
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1571">Matthew Kapinus (morning champion)</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1580">Evan Ting</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1570#player_3717">Elena Whitford</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1574#player_3726">Aatman Shah</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1570#player_3716">Simra Kuchay</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1569#player_3714">Xavier Schultz</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1572#player_3721">Nico Bobis</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1587#player_3769">Jackson Meyer</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1601">Connor Johnson</a></th>
					<%-- <th class="answer" rowspan="2">Answer</th> --%>
				</tr>
				<tr class="player-schools">
					<th>&nbsp;</th>
					<th class="player-school">New Berlin</th><!-- Matthew Kapinus -->
					<th class="player-school">Park Tudor (Indianapolis, IN)</th><!-- Evan Ting -->
					<th class="player-school">Walter Payton (Chicago)</th><!-- Elena Whitford -->
					<th class="player-school">Keith Country Day (Rockford)</th><!-- Aatman Shah -->
					<th class="player-school">Walter Payton (Chicago)</th><!-- Simra Kuchay -->
					<th class="player-school">Bradley-Bourbonnais</th><!-- Xavier Schultz -->
					<th class="player-school">Glenbrook South (Glenview)</th><!-- Nico Bobis -->
					<th class="player-school">Teutopolis</th><!-- Jackson Meyer -->
					<th class="player-school">Downers Grove North</th><!-- Connor Johnson -->
				</tr>
			</thead>
			<tbody>
				<tr class="score-check">
					<th class="score-check-label">Initial scores</th>
					<td class="player-score-check">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-score-check">3</td><!-- Evan Ting -->
					<td class="player-score-check">3</td><!-- Elena Whitford -->
					<td class="player-score-check">3</td><!-- Aatman Shah -->
					<td class="player-score-check">3</td><!-- Simra Kuchay -->
					<td class="player-score-check">3</td><!-- Xavier Schultz -->
					<td class="player-score-check">3</td><!-- Nico Bobis -->
					<td class="player-score-check">3</td><!-- Jackson Meyer -->
					<td class="player-score-check">3</td><!-- Connor Johnson-->
					<%-- <td class="answer-blank">&nbsp;</td> --%>
				</tr>
				<tr>
					<th class="question-number">1</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-incorrect-response">&minus;1</td><!-- Simra Kuchay -->
					<td class="player-correct-response">1</td><!-- Xavier Schultz -->
					<td class="player-no-response">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-no-response">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-no-response">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">2</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-correct-response">1</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-no-response">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-no-response">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-no-response">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">3</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-correct-response">1</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-no-response">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-no-response">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-no-response">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">4</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-no-response">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-correct-response">1</td><!-- Jackson Meyer -->
					<td class="player-no-response">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">5</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-correct-response">1</td><!-- Nico Bobis -->
					<td class="player-no-response">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-no-response">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">6</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-correct-response">1</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-no-response">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-no-response">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-no-response">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">7</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-correct-response">1</td><!-- Nico Bobis -->
					<td class="player-no-response">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-no-response">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">8</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-no-response">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-no-response">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-incorrect-response">&minus;1</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				<tr>
					<th class="question-number">9</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-incorrect-response">&minus;1</td><!-- Aatman Shah -->
					<td class="player-correct-response">1</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-no-response">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-no-response">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-no-response">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">10</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-correct-response">1</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-no-response">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-no-response">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-no-response">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">11</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-no-response">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-no-response">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-correct-response">1</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">12</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-correct-response">1</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-no-response">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-no-response">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-no-response">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">13</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-correct-response">1</td><!-- Nico Bobis -->
					<td class="player-no-response">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-no-response">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">14</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-correct-response">1</td><!-- Aatman Shah -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-no-response">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-no-response">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-no-response">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">15</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-correct-response">1</td><!-- Aatman Shah -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-no-response">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-no-response">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-no-response">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">16</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-correct-response">1</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-no-response">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-no-response">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-no-response">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">17</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-correct-response">1</td><!-- Xavier Schultz -->
					<td class="player-no-response">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-no-response">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-no-response">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">18</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-correct-response">1</td><!-- Nico Bobis -->
					<td class="player-no-response">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-no-response">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">19</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-correct-response">1</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-no-response">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-no-response">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-no-response">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">20</th>
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-no-response">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-no-response">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-no-response">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr class="score-check">
					<th class="score-check-label">Scores through 20</th>
					<td class="player-score-check">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-score-check">6</td><!-- Evan Ting -->
					<td class="player-score-check">5</td><!-- Elena Whitford -->
					<td class="player-score-check">4</td><!-- Aatman Shah -->
					<td class="player-score-check">5</td><!-- Simra Kuchay -->
					<td class="player-score-check">5</td><!-- Xavier Schultz -->
					<td class="player-score-check">7</td><!-- Nico Bobis -->
					<td class="player-score-check">4</td><!-- Jackson Meyer -->
					<td class="player-score-check">3</td><!-- Connor Johnson-->
					<%-- <td class="answer-blank">&nbsp;</td> --%>
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="9" class="note">Matthew Kapinus, as Morning Champion, entered the game with a score equal to that of the then-leader, Nico Bobis: 7.</td>
				</tr>
				<tr>
					<th class="question-number">21</th>
					<td class="player-incorrect-response">&minus;1</td><!-- Matthew Kapinus -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-no-response">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-no-response">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-no-response">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">22</th>
					<td class="player-no-response">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-correct-response">1</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-no-response">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-no-response">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-no-response">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">23</th>
					<td class="player-correct-response">1</td><!-- Matthew Kapinus -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-no-response">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-no-response">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-no-response">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">24</th>
					<td class="player-no-response">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-correct-response">1</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-no-response">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-no-response">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-no-response">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">25</th>
					<td class="player-no-response">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-no-response">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-correct-response">1</td><!-- Jackson Meyer -->
					<td class="player-no-response">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">26</th>
					<td class="player-no-response">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-correct-response">1</td><!-- Aatman Shah -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-no-response">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-no-response">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-no-response">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">27</th>
					<td class="player-no-response">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-correct-response">1</td><!-- Simra Kuchay -->
					<td class="player-incorrect-response">&minus;1</td><!-- Xavier Schultz -->
					<td class="player-no-response">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-no-response">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-no-response">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">28</th>
					<td class="player-no-response">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-correct-response">1</td><!-- Xavier Schultz -->
					<td class="player-no-response">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-no-response">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-no-response">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">29</th>
					<td class="player-no-response">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-correct-response">1</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-no-response">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-no-response">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-no-response">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">30</th>
					<td class="player-incorrect-response">&minus;1</td><!-- Matthew Kapinus -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-correct-response">1</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-no-response">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-no-response">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-incorrect-response">&minus;1</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">31</th>
					<td class="player-no-response">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-correct-response">1</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-incorrect-response">&minus;1</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-no-response">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-no-response">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-no-response">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">32</th>
					<td class="player-no-response">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-correct-response">1</td><!-- Aatman Shah -->
					<td class="player-incorrect-response">&minus;1</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-no-response">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-no-response">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-no-response">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">33</th>
					<td class="player-no-response">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-correct-response">1</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-no-response">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-no-response">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-no-response">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">34</th>
					<td class="player-no-response">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-correct-response">1</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-no-response">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-no-response">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-no-response">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">35</th>
					<td class="player-no-response">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-correct-response">1</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-no-response">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-no-response">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-incorrect-response">&minus;1</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">36</th>
					<td class="player-no-response">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-correct-response">1</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-incorrect-response">&minus;1</td><!-- Nico Bobis -->
					<td class="player-no-response">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-no-response">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">37</th>
					<td class="player-no-response">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-incorrect-response">&minus;1</td><!-- Simra Kuchay -->
					<td class="player-correct-response">1</td><!-- Xavier Schultz -->
					<td class="player-no-response">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-no-response">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-no-response">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">38</th>
					<td class="player-correct-response">1</td><!-- Matthew Kapinus -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-no-response">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-no-response">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-no-response">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">39</th>
					<td class="player-no-response">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-no-response">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-correct-response">1</td><!-- Xavier Schultz -->
					<td class="player-no-response">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-no-response">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-no-response">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">40</th>
					<td class="player-no-response">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-no-response">&nbsp;</td><!-- Evan Ting -->
					<td class="player-incorrect-response">&minus;1</td><!-- Elena Whitford -->
					<td class="player-incorrect-response">&minus;1</td><!-- Aatman Shah -->
					<td class="player-incorrect-response">&minus;1</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-no-response">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-no-response">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-no-response">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr class="score-check">
					<th class="score-check-label">Scores through 40</th>
					<td class="player-score-check">7</td><!-- Matthew Kapinus -->
					<td class="player-score-check">7</td><!-- Evan Ting -->
					<td class="player-score-check">7</td><!-- Elena Whitford -->
					<td class="player-score-check">5</td><!-- Aatman Shah -->
					<td class="player-score-check">7</td><!-- Simra Kuchay -->
					<td class="player-score-check">7</td><!-- Xavier Schultz -->
					<td class="player-score-check">6</td><!-- Nico Bobis -->
					<td class="player-score-check">5</td><!-- Jackson Meyer -->
					<td class="player-score-check">1</td><!-- Connor Johnson-->
					<%-- <td class="answer-blank">&nbsp;</td> --%>
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="9" class="note">
						<p>The players with the lowest scores were eliminated until four players remained. Since five players were tied with a leading score of 7, all players with lower scores were eliminated: Aatman Shah, Nico Bobis, Jackson Meyer, and Connor Johnson.</P>
						<p>Then, tiebreaker questions were played among the four players tied for the lead, to count toward advancement but not in their score.</p>
						<p>Simra Kuchay answered the first tiebreaker question to secure a spot in the next phase.</p>
						<p>Matthew Kapinus answered the second tiebreaker question to secure a spot in the next phase.</p>
						<p>Elena Whitford answered the third tiebreaker question to secure a spot in the next phase.</p>
						<p>Xavier Schultz answered the fourth tiebreaker question to secure the last spot in the next phase. Therefore, Evan Ting was eliminated.</p>
					</td>
				</tr>
				<tr>
					<th class="question-number">41</th>
					<td class="player-correct-response">1</td><!-- Matthew Kapinus -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-not-in-game">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-not-in-game">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">42</th>
					<td class="player-no-response">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-correct-response">1</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-not-in-game">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-not-in-game">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">43</th>
					<td class="player-correct-response">1</td><!-- Matthew Kapinus -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-not-in-game">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-not-in-game">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">44</th>
					<td class="player-no-response">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-correct-response">1</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-not-in-game">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-not-in-game">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">45</th>
					<td class="player-correct-response">1</td><!-- Matthew Kapinus -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-not-in-game">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-not-in-game">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">46</th>
					<td class="player-no-response">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-correct-response">1</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-not-in-game">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-not-in-game">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">47</th>
					<td class="player-correct-response">1</td><!-- Matthew Kapinus -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-not-in-game">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-not-in-game">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">48</th>
					<td class="player-correct-response">1</td><!-- Matthew Kapinus -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-not-in-game">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-not-in-game">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">49</th>
					<td class="player-no-response">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-correct-response">1</td><!-- Xavier Schultz -->
					<td class="player-not-in-game">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-not-in-game">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">50</th>
					<td class="player-no-response">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-no-response">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-correct-response">1</td><!-- Simra Kuchay -->
					<td class="player-no-response">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-not-in-game">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-not-in-game">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr class="score-check">
					<th class="score-check-label">Scores through 50</th>
					<td class="player-score-check">12</td><!-- Matthew Kapinus -->
					<td class="player-eliminated">eliminated</td><!-- Evan Ting -->
					<td class="player-score-check">7</td><!-- Elena Whitford -->
					<td class="player-eliminated">eliminated</td><!-- Aatman Shah -->
					<td class="player-score-check">11</td><!-- Simra Kuchay -->
					<td class="player-score-check">8</td><!-- Xavier Schultz -->
					<td class="player-eliminated">eliminated</td><!-- Nico Bobis -->
					<td class="player-eliminated">eliminated</td><!-- Jackson Meyer -->
					<td class="player-eliminated">eliminated</td><!-- Connor Johnson-->
					<%-- <td class="answer-blank">&nbsp;</td> --%>
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="9" class="note">
						The players with the lowest scores were eliminated until two players remained. Therefore, Elena Whitford and Xavier Schultz were eliminated. Matthew Kapinus and Simra Kuchay remained.
					</td>
				</tr>
				<tr>
					<th class="question-number">51</th>
					<td class="player-no-response">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-correct-response">1</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-not-in-game">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-not-in-game">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">52</th>
					<td class="player-correct-response">1</td><!-- Matthew Kapinus -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-not-in-game">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-not-in-game">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">53</th>
					<td class="player-correct-response">1</td><!-- Matthew Kapinus -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-incorrect-response">&minus;1</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-not-in-game">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-not-in-game">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">54</th>
					<td class="player-no-response">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-correct-response">1</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-not-in-game">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-not-in-game">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">55</th>
					<td class="player-incorrect-response">&minus;1</td><!-- Matthew Kapinus -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-correct-response">1</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-not-in-game">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-not-in-game">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">56</th>
					<td class="player-correct-response">1</td><!-- Matthew Kapinus -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-not-in-game">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-not-in-game">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">57</th>
					<td class="player-no-response">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-correct-response">1</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-not-in-game">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-not-in-game">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">58</th>
					<td class="player-correct-response">1</td><!-- Matthew Kapinus -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-incorrect-response">&minus;1</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-not-in-game">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-not-in-game">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">59</th>
					<td class="player-no-response">&nbsp;</td><!-- Matthew Kapinus -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-correct-response">1</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-not-in-game">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-not-in-game">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
				<tr>
					<th class="question-number">60</th>
					<td class="player-correct-response">1</td><!-- Matthew Kapinus -->
					<td class="player-not-in-game">&nbsp;</td><!-- Evan Ting -->
					<td class="player-not-in-game">&nbsp;</td><!-- Elena Whitford -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aatman Shah -->
					<td class="player-no-response">&nbsp;</td><!-- Simra Kuchay -->
					<td class="player-not-in-game">&nbsp;</td><!-- Xavier Schultz -->
					<td class="player-not-in-game">&nbsp;</td><!-- Nico Bobis -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jackson Meyer -->
					<td class="player-not-in-game">&nbsp;</td><!-- Connor Johnson-->
					<%-- <td class="answer">answer</td> --%>
				</tr>
			</tbody>
			<tfoot>
				<tr class="score-check">
					<th class="score-check-label">Final scores</th>
					<td class="player-score-check">16</td><!-- Matthew Kapinus -->
					<td class="player-eliminated">eliminated</td><!-- Evan Ting -->
					<td class="player-eliminated">eliminated</td><!-- Elena Whitford -->
					<td class="player-eliminated">eliminated</td><!-- Aatman Shah -->
					<td class="player-score-check">14</td><!-- Simra Kuchay -->
					<td class="player-eliminated">eliminated</td><!-- Xavier Schultz -->
					<td class="player-eliminated">eliminated</td><!-- Nico Bobis -->
					<td class="player-eliminated">eliminated</td><!-- Jackson Meyer -->
					<td class="player-eliminated">eliminated</td><!-- Connor Johnson-->
					<%-- <td class="answer-blank">&nbsp;</td> --%>
				</tr>
			</tfoot>
		</table>
		
		<p>Matthew Kapinus of New Berlin Junior-Senior High School is the champion of the 2026 Scobol Solo. He is the first player from New Berlin to make the championship match.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
