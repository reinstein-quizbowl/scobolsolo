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

<style type="text/css">
	#championship-match * {
		text-align: center;
		vertical-align: middle;
	}
	
	tr.player-names, tr.player-names * {
		padding-bottom: 0 !important;
		border-bottom: 0 !important;
	}
	
	tr.player-names th, tr.player-names td {
		vertical-align: bottom !important;
	}
	
	tr.player-schools, tr.player-schools * {
		padding-top: 0 !important;
		border-top: 0 !important;
	}
	
	tr.player-schools th, tr.player-schools td {
		vertical-align: top !important;
	}
	
	.player-school {
		font-size: 67%;
	}
	
	.question-number, .score-check-label {
		font-weight: 700;
	}
	
	td.player-not-in-game {
		background-color: #ccc;
	}
	
	td.player-correct-response {
		background-color: #43aC6a; /* $success-color */
	}
	
	td.player-incorrect-response {
		background-color: #f08a24; /* $warning-color */
	}
	
	tr.score-check, tr.note {
		border-top: 1px solid #999;
		border-bottom: 1px solid #999;
		background-color: #a0d3e8; /* $info-color */
	}
	
	.player-score-check {
		font-weight: 700;
	}
	
	.note {
		font-style: italic;
	}
</style>

<div class="row">
	<div class="small-12 columns">
		<p>The participants in the Championship Match are the one player who won all 7 preliminary matches (the morning champion), the seven players who won 6 of their preliminary matches, and the (one) player who had the highest points per tossup heard among those who won 5 of their preliminary matches.</p>
		
		<p>Unlike in the preliminary rounds, all incorrect answers result in a deduction of 1&nbsp;point. This is true regardless of whether the incorrect answer interrupted the question; it is thus different from ordinary "negs".</p>
		
		<p>Each player starts with 3&nbsp;points. A player whose score reaches 0 is immediately removed from the match.</p>
		
		<p>If any player reaches a score of 10 during the first 20&nbsp;tossups, he or she sits out until tossup&nbsp;21.</p>
		
		<p>The morning champion sits out for the first 20&nbsp;tossups, and enters at tossup&nbsp;21 with a score equal to that of the leader at that time. After tossup 40, the five players with the lowest score are eliminated; to effect this, tiebreaker tossups are applied as necessary, but they do not count in the overall score of the championship match. Four players thus remain. After tossup 50, the two lowest-scoring remaining players are eliminated; the tiebreaker procedure is the same as before. Two players thus remain. At the conclusion of the match, tiebreaker tossups are read as necessary.</p>
		
		<table class="full-width responsive even-spacing unsortable" id="championship-match">
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
				</tr>
				<tr>
					<td class="question-number">7</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-incorrect-response">1</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-no-response">&nbsp;</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
				</tr>
				<tr>
					<td class="question-number">8</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Cole -->
					<td class="player-correct-response">1</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-incorrect-response">&#150;1</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
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
					<td class="player-incorrect-response">&#150;1</td><!-- James -->
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
				</tr>
				<tr>
					<td class="question-number">12</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-incorrect-response">&#150;1</td><!-- Evan -->
					<td class="player-correct-response">1</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-incorrect-response">&#150;1</td><!-- James -->
				</tr>
				<tr>
					<td class="question-number">13</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-incorrect-response">&#150;1</td><!-- Evan -->
					<td class="player-correct-response">1</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
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
				</tr>
				<tr>
					<td class="question-number">17</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-correct-response">1</td><!-- Mahir -->
					<td class="player-no-response">&nbsp;</td><!-- Dan -->
					<td class="player-incorrect-response">&#150;1</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
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
				</tr>
				<tr class="note">
					<td>&nbsp;</td>
					<td colspan="9" class="note">Cole Timmerwilke, as morning champion, entered the game with a score equal to that of the then-leader, Alston Boyd: 10.</td>
				</tr>
				<tr>
					<td class="question-number">21</td>
					<td class="player-incorrect-response">&#150;1</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-incorrect-response">&#150;1</td><!-- Evan -->
					<td class="player-incorrect-response">&#150;1</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-no-response">&nbsp;</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
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
					<td class="player-incorrect-response">&#150;1</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
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
				</tr>
				<tr>
					<td class="question-number">24</td>
					<td class="player-incorrect-response">&#150;1</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-incorrect-response">&#150;1</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-no-response">&nbsp;</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
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
				</tr>
				<tr>
					<td class="question-number">27</td>
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-incorrect-response">&#150;1</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-no-response">&nbsp;</td><!-- Dan -->
					<td class="player-correct-response">1</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
				</tr>
				<tr>
					<td class="question-number">28</td>
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-incorrect-response">&#150;1</td><!-- Mahir -->
					<td class="player-no-response">&nbsp;</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-correct-response">1</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
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
				</tr>
				<tr>
					<td class="question-number">33</td>
					<td class="player-incorrect-response">&#150;1</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-correct-response">1</td><!-- Dan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew -->
					<td class="player-no-response">&nbsp;</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
				</tr>
				<tr>
					<td class="question-number">34</td>
					<td class="player-incorrect-response">&#150;1</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-incorrect-response">&#150;1</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-no-response">&nbsp;</td><!-- Dan -->
					<td class="player-incorrect-response">&#150;1</td><!-- Andrew -->
					<td class="player-incorrect-response">&#150;1</td><!-- Sunny -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
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
				</tr>
				<tr class="note">
					<td>&nbsp;</td>
					<td colspan="9" class="note">
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
				</tr>
				<tr>
					<td class="question-number">45</td>
					<td class="player-incorrect-response">&#150;1</td><!-- Cole -->
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Mahir -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dan -->
					<td class="player-correct-response">1</td><!-- Sunny -->
					<td class="player-not-in-game">&nbsp;</td><!-- James -->
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
				</tr>
				<tr class="note">
					<td>&nbsp;</td>
					<td colspan="9" class="note">
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
				</tr>
				<tr>
					<td class="question-number">55</td>
					<td class="player-incorrect-response">&#150;1</td><!-- Cole -->
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alston -->
					<td class="player-not-in-game">&nbsp;</td><!-- Mahir -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Sunny -->
					<td class="player-not-in-game">&nbsp;</td><!-- James -->
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