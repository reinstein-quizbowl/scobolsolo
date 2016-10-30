<%@ page import="java.text.DecimalFormat" %>
<%@ page import="java.util.Collections" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.opal.ImplicitTableDatabaseQuery" %>
<%@ page import="com.scobolsolo.application.PlayerRecordV" %>
<%@ page import="com.scobolsolo.application.PlayerRecordVFactory" %>
<%@ page import="com.scobolsolo.application.Tournament" %>
<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2014" />
	<jsp:param name="pageTitle" value="Championship Match" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2014()).asTopLevel().output(request, \"championship-match\") %>" />
	<jsp:param name="h1" value="Championship Match" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>The participants in the Championship Match are the one player who won all 7 preliminary matches (the morning champion), the seven players who won 6 of their preliminary matches, and the (one) player who had the highest points per tossup heard among those who won 5 of their preliminary matches.</p>
		
		<p>Unlike in the preliminary rounds, all incorrect answers result in a deduction of 1&nbsp;point. This is true regardless of whether the incorrect answer interrupted the question; it is thus different from ordinary "negs".</p>
		
		<p>Each player starts with 3&nbsp;points. A player whose score reaches 0 is immediately removed from the match.</p>
		
		<p>If any player reaches a score of 10 during the first 20&nbsp;tossups, he or she sits out until tossup&nbsp;21.</p>
		
		<p>The morning champion sits out for the first 20&nbsp;tossups, and enters at tossup&nbsp;21 with a score equal to that of the leader at that time. After tossup 40, the five players with the lowest score are eliminated; to effect this, tiebreaker tossups are applied as necessary, but they do not count in the overall score of the championship match. Four players thus remain. After tossup 50, the two lowest-scoring remaining players are eliminated; the tiebreaker procedure is the same as before. Two players thus remain. At the conclusion of the match, tiebreaker tossups are read as necessary.</p>
		
		<table class="full-width responsive even-spacing unsortable championship-scoresheet">
			<thead>
				<tr class="player-names">
					<th>&nbsp;</th>
					<th class="player-name">Cole<br />Timmerwilke</th>
					<th class="player-name">Nolan<br />Liu</th>
					<th class="player-name">Evan<br />Pandya</th>
					<th class="player-name">Alston<br />Boyd</th>
					<th class="player-name">Mahir<br />Morshed</th>
					<th class="player-name">Dan<br />Pechi</th>
					<th class="player-name">Andrew<br />Salij</th>
					<th class="player-name">Sunny<br />Chen</th>
					<th class="player-name">James<br />Zhou</th>
				</tr>
				<tr class="player-schools">
					<th>&nbsp;</th>
					<th class="player-school">Auburn (Rockford)</th><!-- Cole -->
					<th class="player-school">Saint&nbsp;Joseph (South&nbsp;Bend, Indiana)</th><!-- Nolan -->
					<th class="player-school">Auburn (Rockford)</th><!-- Evan -->
					<th class="player-school">Bloomington</th><!-- Alston -->
					<th class="player-school">Carbondale</th><!-- Mahir -->
					<th class="player-school">IMSA (Aurora)</th><!-- Dan -->
					<th class="player-school">IMSA (Aurora)</th><!-- Andrew -->
					<th class="player-school">Hinsdale Central</th><!-- Sunny -->
					<th class="player-school">Hinsdale Central</th><!-- James -->
					<th class="answer" rowspan="2">Answer</th>
				</tr>
			</thead>
			<tbody>
				<tr class="score-check">
					<td class="score-check-label">Initial scores</td>
					<td class="player-score-check">&nbsp;</td><!-- Cole -->
					<td class="player-score-check">3</td><!-- Nolan -->
					<td class="player-score-check">3</td><!-- Evan -->
					<td class="player-score-check">3</td><!-- Alston -->
					<td class="player-score-check">3</td><!-- Mahir -->
					<td class="player-score-check">3</td><!-- Dan -->
					<td class="player-score-check">3</td><!-- Andrew -->
					<td class="player-score-check">3</td><!-- Sunny -->
					<td class="player-score-check">3</td><!-- James -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr>
					<td class="question-number">1</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-no-response">&nbsp;</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-correct-response">1</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">methylation</td>
				</tr>
				<tr>
					<td class="question-number">2</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-no-response">&nbsp;</td><!-- Dan -->
					<td class="player-correct-response">1</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">Pre-Raphaelite Brotherhood</td>
				</tr>
				<tr>
					<td class="question-number">3</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-correct-response">1</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-no-response">&nbsp;</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">Roger Taney</td>
				</tr>
				<tr>
					<td class="question-number">4</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-correct-response">1</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-no-response">&nbsp;</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">John B. Watson</td>
				</tr>
				<tr>
					<td class="question-number">5</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-correct-response">1</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-no-response">&nbsp;</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">Federico Fellini</td>
				</tr>
				<tr>
					<td class="question-number">6</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-correct-response">1</td><!-- Mahir -->
					<td class="player-no-response">&nbsp;</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">density</td>
				</tr>
				<tr>
					<td class="question-number">7</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-no-response">&nbsp;</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">Alban Berg</td>
				</tr>
				<tr>
					<td class="question-number">8</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Cole -->
					<td class="player-correct-response">1</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">Honor&eacute; de&nbsp;Balzac</td>
				</tr>
				<tr>
					<td class="question-number">9</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-correct-response">1</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-incorrect-response">&ndash;1</td><!-- James -->
					<td class="answer">Malawi</td>
				</tr>
				<tr>
					<td class="question-number">10</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-correct-response">1</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">"Thanatopsis"</td>
				</tr>
				<tr>
					<td class="question-number">11</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Dan -->
					<td class="player-correct-response">1</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">Navajo code talkers</td>
				</tr>
				<tr>
					<td class="question-number">12</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Evan -->
					<td class="player-correct-response">1</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-incorrect-response">&ndash;1</td><!-- James -->
					<td class="answer">sulfate ion</td>
				</tr>
				<tr>
					<td class="question-number">13</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Evan -->
					<td class="player-correct-response">1</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">Jonathan Franzen</td>
				</tr>
				<tr>
					<td class="question-number">14</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-no-response">&nbsp;</td><!-- Dan -->
					<td class="player-correct-response">1</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">Markov processes</td>
				</tr>
				<tr>
					<td class="question-number">15</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-correct-response">1</td><!-- Mahir -->
					<td class="player-no-response">&nbsp;</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">Namibia</td>
				</tr>
				<tr>
					<td class="question-number">16</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-correct-response">1</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-no-response">&nbsp;</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">Shylock</td>
				</tr>
				<tr>
					<td class="question-number">17</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-correct-response">1</td><!-- Mahir -->
					<td class="player-no-response">&nbsp;</td><!-- Dan -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">al-Aqsa</td>
				</tr>
				<tr>
					<td class="question-number">18</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Cole -->
					<td class="player-correct-response">1</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-no-response">&nbsp;</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">House of Orange-Nassau</td>
				</tr>
				<tr>
					<td class="question-number">19</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-correct-response">1</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-no-response">&nbsp;</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">rings (chemistry)</td>
				</tr>
				<tr>
					<td class="question-number">20</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-no-response">&nbsp;</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-correct-response">1</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">Andrew Cuomo</td>
				</tr>
				<tr class="score-check">
					<td class="score-check-label">Scores through 20</td>
					<td class="player-score-check">8</td><!-- Cole -->
					<td class="player-score-check">5</td><!-- Nolan -->
					<td class="player-score-check">2</td><!-- Evan -->
					<td class="player-score-check">8</td><!-- Alston -->
					<td class="player-score-check">6</td><!-- Mahir -->
					<td class="player-score-check">4</td><!-- Dan -->
					<td class="player-score-check">4</td><!-- Andrew -->
					<td class="player-score-check">6</td><!-- Sunny -->
					<td class="player-score-check">1</td><!-- James -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<td>&nbsp;</td>
					<td colspan="10" class="note">Cole Timmerwilke, as morning champion, entered the game with a score equal to that of the then-leader, Alston Boyd: 10.</td>
				</tr>
				<tr>
					<td class="question-number">21</td>
					<td class="player-incorrect-response">&ndash;1</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Evan -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-no-response">&nbsp;</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">confidence intervals</td>
				</tr>
				<tr>
					<td class="question-number">22</td>
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-no-response">&nbsp;</td><!-- Dan -->
					<td class="player-correct-response">1</td><!-- Andrew -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">raid on Entebbe</td>
				</tr>
				<tr>
					<td class="question-number">23</td>
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-no-response">&nbsp;</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-correct-response">1</td><!-- James -->
					<td class="answer"><i>Three Sisters</i></td>
				</tr>
				<tr>
					<td class="question-number">24</td>
					<td class="player-incorrect-response">&ndash;1</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-no-response">&nbsp;</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">Export-Import Bank</td>
				</tr>
				<tr>
					<td class="question-number">25</td>
					<td class="player-correct-response">1</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-no-response">&nbsp;</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">Catullus</td>
				</tr>
				<tr>
					<td class="question-number">26</td>
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-correct-response">1</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-no-response">&nbsp;</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">Rafael Trujillo</td>
				</tr>
				<tr>
					<td class="question-number">27</td>
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-no-response">&nbsp;</td><!-- Dan -->
					<td class="player-correct-response">1</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">"The Man That Corrupted Hadleyburg"</td>
				</tr>
				<tr>
					<td class="question-number">28</td>
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Mahir -->
					<td class="player-no-response">&nbsp;</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-correct-response">1</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">polarization</td>
				</tr>
				<tr>
					<td class="question-number">29</td>
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-correct-response">1</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-no-response">&nbsp;</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer"><i>The Milkmaid</i></td>
				</tr>
				<tr>
					<td class="question-number">30</td>
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-correct-response">1</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-no-response">&nbsp;</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">bioluminescence</td>
				</tr>
				<tr>
					<td class="question-number">31</td>
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-correct-response">1</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-no-response">&nbsp;</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">Henry S. Moore</td>
				</tr>
				<tr>
					<td class="question-number">32</td>
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-no-response">&nbsp;</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-correct-response">1</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">monosaccharides</td>
				</tr>
				<tr>
					<td class="question-number">33</td>
					<td class="player-incorrect-response">&ndash;1</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-correct-response">1</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">Tasmania</td>
				</tr>
				<tr>
					<td class="question-number">34</td>
					<td class="player-incorrect-response">&ndash;1</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-no-response">&nbsp;</td><!-- Dan -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Andrew -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">L&eacute;on Blum</td>
				</tr>
				<tr>
					<td class="question-number">35</td>
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-no-response">&nbsp;</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-correct-response">1</td><!-- James -->
					<td class="answer"><i>Tess of the D'Urbervilles</i></td>
				</tr>
				<tr>
					<td class="question-number">36</td>
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-correct-response">1</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-no-response">&nbsp;</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">W.&nbsp;E.&nbsp;B&nbsp; Du&nbsp;Bois</td>
				</tr>
				<tr>
					<td class="question-number">37</td>
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-correct-response">1</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-no-response">&nbsp;</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">Sigurd</td>
				</tr>
				<tr>
					<td class="question-number">38</td>
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-no-response">&nbsp;</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-correct-response">1</td><!-- James -->
					<td class="answer">violin concerti</td>
				</tr>
				<tr>
					<td class="question-number">39</td>
					<td class="player-correct-response">1</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-no-response">&nbsp;</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">seafloor spreading</td>
				</tr>
				<tr>
					<td class="question-number">40</td>
					<td class="player-correct-response">1</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-no-response">&nbsp;</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">just war</td>
				</tr>
				<tr class="score-check">
					<td class="score-check-label">Scores through 40</td>
					<td class="player-score-check">7</td><!-- Cole -->
					<td class="player-score-check">5</td><!-- Nolan -->
					<td class="player-score-check">6</td><!-- Evan -->
					<td class="player-score-check">5</td><!-- Alston -->
					<td class="player-score-check">5</td><!-- Mahir -->
					<td class="player-score-check">5</td><!-- Dan -->
					<td class="player-score-check">5</td><!-- Andrew -->
					<td class="player-score-check">6</td><!-- Sunny -->
					<td class="player-score-check">4</td><!-- James -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<td>&nbsp;</td>
					<td colspan="10" class="note">
						A tiebreaker was held to determine which one of the five players tied with 5&nbsp;points would&#151;along with Cole, Evan, and Sunny&#151;continue to the next phase. Mahir answered the first tiebreaker correctly to secure the advancing spot.
					</td>
				</tr>
				<tr>
					<td class="question-number">41</td>
					<td class="player-correct-response">1</td><!-- Cole -->
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-not-in-game">&nbsp;</td><!-- James -->
					<td class="answer">Thailand</td>
				</tr>
				<tr>
					<td class="question-number">42</td>
					<td class="player-correct-response">1</td><!-- Cole -->
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-not-in-game">&nbsp;</td><!-- James -->
					<td class="answer">Castile</td>
				</tr>
				<tr>
					<td class="question-number">43</td>
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-correct-response">1</td><!-- Evan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-not-in-game">&nbsp;</td><!-- James -->
					<td class="answer"><i>To the Lighthouse</i></td>
				</tr>
				<tr>
					<td class="question-number">44</td>
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alston -->
					<td class="player-correct-response">1</td><!-- Mahir -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-not-in-game">&nbsp;</td><!-- James -->
					<td class="answer">solvation</td>
				</tr>
				<tr>
					<td class="question-number">45</td>
					<td class="player-incorrect-response">&ndash;1</td><!-- Cole -->
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dan -->
					<td class="player-correct-response">1</td><!-- Sunny -->
					<td class="player-not-in-game">&nbsp;</td><!-- James -->
					<td class="answer">Akbar the Great</td>
				</tr>
				<tr>
					<td class="question-number">46</td>
					<td class="player-correct-response">1</td><!-- Cole -->
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-not-in-game">&nbsp;</td><!-- James -->
					<td class="answer">Rhine River</td>
				</tr>
				<tr>
					<td class="question-number">47</td>
					<td class="player-correct-response">1</td><!-- Cole -->
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-not-in-game">&nbsp;</td><!-- James -->
					<td class="answer">Gustave Courbet</td>
				</tr>
				<tr>
					<td class="question-number">48</td>
					<td class="player-correct-response">1</td><!-- Cole -->
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-not-in-game">&nbsp;</td><!-- James -->
					<td class="answer">dark matter</td>
				</tr>
				<tr>
					<td class="question-number">49</td>
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-correct-response">1</td><!-- Evan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-not-in-game">&nbsp;</td><!-- James -->
					<td class="answer"><i>The House of the Spirits</i></td>
				</tr>
				<tr>
					<td class="question-number">50</td>
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-correct-response">1</td><!-- Evan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-not-in-game">&nbsp;</td><!-- James -->
					<td class="answer">Sergei Prokofiev</td>
				</tr>
				<tr class="score-check">
					<td class="score-check-label">Scores through 50</td>
					<td class="player-score-check">11</td><!-- Cole -->
					<td class="player-eliminated">eliminated</td><!-- Nolan -->
					<td class="player-score-check">9</td><!-- Evan -->
					<td class="player-eliminated">eliminated</td><!-- Alston -->
					<td class="player-score-check">6</td><!-- Mahir -->
					<td class="player-eliminated">eliminated</td><!-- Dan -->
					<td class="player-eliminated">eliminated</td><!-- Andrew -->
					<td class="player-score-check">7</td><!-- Sunny -->
					<td class="player-eliminated">eliminated</td><!-- James -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<td>&nbsp;</td>
					<td colspan="10" class="note">
						By virtue of having the lowest and second-lowest score among remaining players, Mahir and Sunny were eliminated.<br />
						This is the first time ever that the top two players at Scobol Solo have been from the same school.
					</td>
				</tr>
				<tr>
					<td class="question-number">51</td>
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-correct-response">1</td><!-- Evan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alston -->
					<td class="player-not-in-game">&nbsp;</td><!-- Mahir -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sunny -->
					<td class="player-not-in-game">&nbsp;</td><!-- James -->
					<td class="answer"><i>The Sound and the Fury</i></td>
				</tr>
				<tr>
					<td class="question-number">52</td>
					<td class="player-correct-response">1</td><!-- Cole -->
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alston -->
					<td class="player-not-in-game">&nbsp;</td><!-- Mahir -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sunny -->
					<td class="player-not-in-game">&nbsp;</td><!-- James -->
					<td class="answer">keratin</td>
				</tr>
				<tr>
					<td class="question-number">53</td>
					<td class="player-correct-response">1</td><!-- Cole -->
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alston -->
					<td class="player-not-in-game">&nbsp;</td><!-- Mahir -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sunny -->
					<td class="player-not-in-game">&nbsp;</td><!-- James -->
					<td class="answer">Harpies</td>
				</tr>
				<tr>
					<td class="question-number">54</td>
					<td class="player-correct-response">1</td><!-- Cole -->
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alston -->
					<td class="player-not-in-game">&nbsp;</td><!-- Mahir -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sunny -->
					<td class="player-not-in-game">&nbsp;</td><!-- James -->
					<td class="answer"><i>The Mikado</i></td>
				</tr>
				<tr>
					<td class="question-number">55</td>
					<td class="player-incorrect-response">&ndash;1</td><!-- Cole -->
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alston -->
					<td class="player-not-in-game">&nbsp;</td><!-- Mahir -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sunny -->
					<td class="player-not-in-game">&nbsp;</td><!-- James -->
					<td class="answer">countability</td>
				</tr>
				<tr>
					<td class="question-number">56</td>
					<td class="player-correct-response">1</td><!-- Cole -->
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alston -->
					<td class="player-not-in-game">&nbsp;</td><!-- Mahir -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sunny -->
					<td class="player-not-in-game">&nbsp;</td><!-- James -->
					<td class="answer">Battle of Bosworth Field</td>
				</tr>
				<tr>
					<td class="question-number">57</td>
					<td class="player-correct-response">1</td><!-- Cole -->
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alston -->
					<td class="player-not-in-game">&nbsp;</td><!-- Mahir -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sunny -->
					<td class="player-not-in-game">&nbsp;</td><!-- James -->
					<td class="answer">David Hume</td>
				</tr>
				<tr>
					<td class="question-number">58</td>
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-correct-response">1</td><!-- Evan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alston -->
					<td class="player-not-in-game">&nbsp;</td><!-- Mahir -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sunny -->
					<td class="player-not-in-game">&nbsp;</td><!-- James -->
					<td class="answer">transformers</td>
				</tr>
				<tr>
					<td class="question-number">59</td>
					<td class="player-correct-response">1</td><!-- Cole -->
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alston -->
					<td class="player-not-in-game">&nbsp;</td><!-- Mahir -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sunny -->
					<td class="player-not-in-game">&nbsp;</td><!-- James -->
					<td class="answer">Tammany Hall</td>
				</tr>
				<tr>
					<td class="question-number">60</td>
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-correct-response">1</td><!-- Evan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alston -->
					<td class="player-not-in-game">&nbsp;</td><!-- Mahir -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sunny -->
					<td class="player-not-in-game">&nbsp;</td><!-- James -->
					<td class="answer"><i>Les Fleurs du Mal</i></td>
				</tr>
			</tbody>
			<tfoot>
				<tr class="score-check">
					<td class="score-check-label">Final scores</td>
					<td class="player-score-check">16</td><!-- Cole -->
					<td class="player-eliminated">eliminated</td><!-- Nolan -->
					<td class="player-score-check">12</td><!-- Evan -->
					<td class="player-eliminated">eliminated</td><!-- Alston -->
					<td class="player-eliminated">eliminated</td><!-- Mahir -->
					<td class="player-eliminated">eliminated</td><!-- Andrew -->
					<td class="player-eliminated">eliminated</td><!-- Dan -->
					<td class="player-eliminated">eliminated</td><!-- Sunny -->
					<td class="player-eliminated">eliminated</td><!-- James -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
			</tfoot>
		</table>
		
		<p>Cole Timmerwilke of Auburn High School in Rockford is the champion of the 2014 Scobol Solo.</p>
		
		<p>This is the first time since 2008 that the morning champion has also been the overall champion. (The player in 2008 was Siva Sundaram, also of Auburn.)</p>
		
		<p>Cole is the third Auburn player to win Scobol Solo; in addition to Siva, Lloyd Sy won in both 2009 and 2011.</p>
		
		<p>Auburn is the only high school to have had three winning players or four wins. New Trier and Wheaton North have each fielded two winners (Matt Keenan, 2002, and Carlo Angiuli, 2007; and Paul Gauthier, 2003, and Greg Gauthier, 2007, respectively), and no other school has fielded more than one.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />