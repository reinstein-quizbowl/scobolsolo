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
	<jsp:param name="tournamentCode" value="2015" />
	<jsp:param name="pageTitle" value="Championship Match" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2015()).asTopLevel().output(request, \"championship-match\") %>" />
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
					<th class="player-name">Ali<br />Saeed</th>
					<th class="player-name">Michael<br />Gislason</th>
					<th class="player-name">John<br />Waldron</th>
					<th class="player-name">Cole<br />Timmerwilke</th>
					<th class="player-name">Jonathan<br />Suh</th>
					<th class="player-name">Ankush<br />Bajaj</th>
					<th class="player-name">Ethan<br />Strombeck</th>
					<th class="player-name">Matthew<br />Lehmann</th>
					<th class="player-name">Jakob<br />Myers</th>
				</tr>
				<tr class="player-schools">
					<th>&nbsp;</th>
					<th class="player-school">Stevenson (Lincolnshire)</th><!-- Ali -->
					<th class="player-school">Homewood-Flossmoor</th><!-- Michael -->
					<th class="player-school">Barrington</th><!-- John -->
					<th class="player-school">Auburn (Rockford)</th><!-- Cole -->
					<th class="player-school">Wheaton Warrenville South</th><!-- Jonathan -->
					<th class="player-school">Hinsdale Central</th><!-- Ethan -->
					<th class="player-school">Auburn</th><!-- Ankush -->
					<th class="player-school">Barrington</th><!-- Matthew -->
					<th class="player-school">Naperville North</th><!-- Jakob -->
				</tr>
			</thead>
			<tbody>
				<tr class="score-check">
					<td class="score-check-label">Initial scores</td>
					<td class="player-score-check">&nbsp;</td><!-- Ali -->
					<td class="player-score-check">3</td><!-- Michael -->
					<td class="player-score-check">3</td><!-- John -->
					<td class="player-score-check">3</td><!-- Cole -->
					<td class="player-score-check">3</td><!-- Jonathan -->
					<td class="player-score-check">3</td><!-- Ethan -->
					<td class="player-score-check">3</td><!-- Ankush -->
					<td class="player-score-check">3</td><!-- Matthew -->
					<td class="player-score-check">3</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">1</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-correct-response">1</td><!-- John -->
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Ankush -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">2</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- John -->
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Ankush -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-correct-response">1</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">3</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- John -->
					<td class="player-correct-response">1</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Ankush -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">4</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- John -->
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Ankush -->
					<td class="player-correct-response">1</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">5</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-correct-response">1</td><!-- John -->
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Ankush -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">6</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- John -->
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-correct-response">1</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Ankush -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">7</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- John -->
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Ankush -->
					<td class="player-correct-response">1</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">8</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-incorrect-response">&ndash;1</td><!-- John -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Ankush -->
					<td class="player-correct-response">1</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">9</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Ali -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- John -->
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Ankush -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-correct-response">1</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">10</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- John -->
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Ankush -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-correct-response">1</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">11</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- John -->
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ankush -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-correct-response">1</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">12</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Ali -->
					<td class="player-correct-response">1</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- John -->
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ankush -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">13</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- John -->
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ankush -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-correct-response">1</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">14</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-correct-response">1</td><!-- John -->
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Ankush -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">15</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- John -->
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Ankush -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">16</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-correct-response">1</td><!-- John -->
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Ankush -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">17</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- John -->
					<td class="player-correct-response">1</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Ankush -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">18</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- John -->
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Ankush -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">19</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- John -->
					<td class="player-correct-response">1</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Ankush -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">20</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- John -->
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-correct-response">1</td><!-- Ankush -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr class="score-check">
					<td class="score-check-label">Scores through 20</td>
					<td class="player-score-check">&nbsp;</td><!-- Ali -->
					<td class="player-score-check">3</td><!-- Michael -->
					<td class="player-score-check">6</td><!-- John -->
					<td class="player-score-check">5</td><!-- Cole -->
					<td class="player-score-check">3</td><!-- Jonathan -->
					<td class="player-score-check">2</td><!-- Ethan -->
					<td class="player-score-check">4</td><!-- Ankush -->
					<td class="player-score-check">7</td><!-- Matthew -->
					<td class="player-score-check">6</td><!-- Jakob -->
				</tr>
				<tr class="note">
					<td>&nbsp;</td>
					<td colspan="9" class="note">Ali Saeed, as morning champion, entered the game with a score equal to that of the then-leader, Matthew Lehmann: 7.</td>
				</tr>
				<tr>
					<td class="question-number">21</td>
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- John -->
					<td class="player-correct-response">1</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Ankush -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">22</td>
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- John -->
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Ankush -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-correct-response">1</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">23</td>
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- John -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Ankush -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">24</td>
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- John -->
					<td class="player-correct-response">1</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Ankush -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">25</td>
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- John -->
					<td class="player-correct-response">1</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Ankush -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">26</td>
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- John -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Ankush -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">27</td>
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- John -->
					<td class="player-correct-response">1</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Ankush -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">28</td>
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- John -->
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-correct-response">1</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Ankush -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">29</td>
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- John -->
					<td class="player-correct-response">1</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Ankush -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">30</td>
					<td class="player-incorrect-response">&ndash;1</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- John -->
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Ankush -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-correct-response">1</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">31</td>
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- John -->
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-correct-response">1</td><!-- Ankush -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">32</td>
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- John -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-correct-response">1</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Ankush -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">33</td>
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- John -->
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-correct-response">1</td><!-- Ankush -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">34</td>
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- John -->
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Ankush -->
					<td class="player-correct-response">1</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">35</td>
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-incorrect-response">&ndash;1</td><!-- John -->
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Ankush -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">36</td>
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- John -->
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-correct-response">1</td><!-- Ankush -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">37</td>
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- John -->
					<td class="player-correct-response">1</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Ankush -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">38</td>
					<td class="player-correct-response">1</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- John -->
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Ankush -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">39</td>
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- John -->
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-correct-response">1</td><!-- Ankush -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">40</td>
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- John -->
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Ankush -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-correct-response">1</td><!-- Jakob -->
				</tr>
				<tr class="score-check">
					<td class="score-check-label">Scores through 40</td>
					<td class="player-score-check">7</td><!-- Ali -->
					<td class="player-score-check">3</td><!-- Michael -->
					<td class="player-score-check">5</td><!-- John -->
					<td class="player-score-check">8</td><!-- Cole -->
					<td class="player-score-check">4</td><!-- Jonathan -->
					<td class="player-score-check">3</td><!-- Ethan -->
					<td class="player-score-check">5</td><!-- Ankush -->
					<td class="player-score-check">8</td><!-- Matthew -->
					<td class="player-score-check">7</td><!-- Jakob -->
				</tr>
				<tr class="note">
					<td>&nbsp;</td>
					<td colspan="9" class="note">
						The five players with the lowest scores were eliminated: Michael Gislason, John Waldron, Jonathan Suh, Ankush Bajaj, and Ethan Strombeck. Thus, Ali Saeed, Cole Timmerwilke, Matthew Lehmann, and Jakob Myers remained in the game.
					</td>
				</tr>
				<tr>
					<td class="question-number">41</td>
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael -->
					<td class="player-not-in-game">&nbsp;</td><!-- John -->
					<td class="player-correct-response">1</td><!-- Cole -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ankush -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">42</td>
					<td class="player-correct-response">1</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael -->
					<td class="player-not-in-game">&nbsp;</td><!-- John -->
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ankush -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">43</td>
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael -->
					<td class="player-not-in-game">&nbsp;</td><!-- John -->
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ankush -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">44</td>
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael -->
					<td class="player-not-in-game">&nbsp;</td><!-- John -->
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ankush -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-correct-response">1</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">45</td>
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael -->
					<td class="player-not-in-game">&nbsp;</td><!-- John -->
					<td class="player-correct-response">1</td><!-- Cole -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ankush -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">46</td>
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael -->
					<td class="player-not-in-game">&nbsp;</td><!-- John -->
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ankush -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-correct-response">1</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">47</td>
					<td class="player-correct-response">1</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael -->
					<td class="player-not-in-game">&nbsp;</td><!-- John -->
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ankush -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">48</td>
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael -->
					<td class="player-not-in-game">&nbsp;</td><!-- John -->
					<td class="player-correct-response">1</td><!-- Cole -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ankush -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">49</td>
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael -->
					<td class="player-not-in-game">&nbsp;</td><!-- John -->
					<td class="player-correct-response">1</td><!-- Cole -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ankush -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">50</td>
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael -->
					<td class="player-not-in-game">&nbsp;</td><!-- John -->
					<td class="player-correct-response">1</td><!-- Cole -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ankush -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr class="score-check">
					<td class="score-check-label">Scores through 50</td>
					<td class="player-score-check">9</td><!-- Ali -->
					<td class="player-eliminated">eliminated</td><!-- Michael -->
					<td class="player-eliminated">eliminated</td><!-- John -->
					<td class="player-score-check">13</td><!-- Cole -->
					<td class="player-eliminated">eliminated</td><!-- Jonathan -->
					<td class="player-eliminated">eliminated</td><!-- Ethan -->
					<td class="player-eliminated">eliminated</td><!-- Ankush -->
					<td class="player-score-check">9</td><!-- Matthew -->
					<td class="player-score-check">8</td><!-- Jakob -->
				</tr>
				<tr class="note">
					<td>&nbsp;</td>
					<td colspan="9" class="note">
						As Ali Saeed and Matthew Lehmann were tied, a tiebreaker was held to determine which would remain in the game. Ali won the tiebreaker, so Matthew was eliminated. Jakob Myers was also eliminated. Ali and Cole Timmerwilke thus remained in the game.
					</td>
				</tr>
				<tr>
					<td class="question-number">51</td>
					<td class="player-correct-response">1</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael -->
					<td class="player-not-in-game">&nbsp;</td><!-- John -->
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ankush -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">52</td>
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael -->
					<td class="player-not-in-game">&nbsp;</td><!-- John -->
					<td class="player-correct-response">1</td><!-- Cole -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ankush -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">53</td>
					<td class="player-correct-response">1</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael -->
					<td class="player-not-in-game">&nbsp;</td><!-- John -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Cole -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ankush -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">54</td>
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael -->
					<td class="player-not-in-game">&nbsp;</td><!-- John -->
					<td class="player-correct-response">1</td><!-- Cole -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ankush -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">55</td>
					<td class="player-correct-response">1</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael -->
					<td class="player-not-in-game">&nbsp;</td><!-- John -->
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ankush -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">56</td>
					<td class="player-correct-response">1</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael -->
					<td class="player-not-in-game">&nbsp;</td><!-- John -->
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ankush -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">57</td>
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael -->
					<td class="player-not-in-game">&nbsp;</td><!-- John -->
					<td class="player-correct-response">1</td><!-- Cole -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ankush -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">58</td>
					<td class="player-correct-response">1</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael -->
					<td class="player-not-in-game">&nbsp;</td><!-- John -->
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ankush -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">59</td>
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael -->
					<td class="player-not-in-game">&nbsp;</td><!-- John -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Cole -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ankush -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jakob -->
				</tr>
				<tr>
					<td class="question-number">60</td>
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael -->
					<td class="player-not-in-game">&nbsp;</td><!-- John -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Cole -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ankush -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jakob -->
				</tr>
			</tbody>
			<tfoot>
				<tr class="score-check">
					<td class="score-check-label">Final scores</td>
					<td class="player-score-check">14</td><!-- Ali -->
					<td class="player-eliminated">eliminated</td><!-- Michael -->
					<td class="player-eliminated">eliminated</td><!-- John -->
					<td class="player-score-check">13</td><!-- Cole -->
					<td class="player-eliminated">eliminated</td><!-- Jonathan -->
					<td class="player-eliminated">eliminated</td><!-- Ankush -->
					<td class="player-eliminated">eliminated</td><!-- Ethan -->
					<td class="player-eliminated">eliminated</td><!-- Matthew -->
					<td class="player-eliminated">eliminated</td><!-- Jakob -->
				</tr>
			</tfoot>
		</table>
		
		<p>Ali Saeed of Stevenson High School in Lincolnshire is the champion of the 2015 Scobol Solo.</p>
		
		<p>This is the second consecutive year in which the morning champion has also been the overall champion. (Last year: Cole Timmerwilke of Auburn.) Before that, this had not happened since 2008 (Siva Sundaram, also of Auburn.)</p>
		
		<p>Stevenson is the fourth school to have fielded at least two winners. Previously, Auburn has fielded Cole Timmerwilke (2014), Lloyd Sy (2009 and 2011), and Siva Sundaram (2008); New Trier has fielded Carlo Angiuli (2007) and Matt Keenan (2002); and Wheaton North has fielded Greg Gauthier (2007) and Paul Gauthier (2003).</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />