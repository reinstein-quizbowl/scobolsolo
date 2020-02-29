<%@ page import="java.text.DecimalFormat" %>
<%@ page import="java.util.Collections" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.opal.ImplicitTableDatabaseQuery" %>
<%@ page import="com.scobolsolo.application.Tournament" %>
<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2015" />
	<jsp:param name="pageTitle" value="Championship Match" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2015()).asTopLevel().output(request, \"championship-match\") %>" />
	<jsp:param name="h1" value="Championship Match" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>The participants in the Championship Match are the one player who won all seven preliminary matches (the Morning Champion), the seven players who won exactly six of their preliminary matches, and the (one) player who had the highest points per tossup heard among those who won exactly five of their preliminary matches.</p>
		
		<p>Unlike in the preliminary rounds, all incorrect answers result in a deduction of 1&nbsp;point. This is true regardless of whether the incorrect answer interrupted the question; it is thus different from ordinary “negs”.</p>
		
		<p>Each player starts with 3&nbsp;points. A player whose score reaches 0 is immediately removed from the match.</p>
		
		<p>If any player reaches a score of 10 during the first 20&nbsp;tossups, he or she sits out until tossup&nbsp;21.</p>
		
		<p>The Morning Champion sits out for the first 20&nbsp;tossups, and enters at tossup&nbsp;21 with a score equal to that of the leader at that time. After tossup&nbsp;40, the lowest-scoring players are removed until four remain; if necessary, tiebreaker tossups are used, but they do not count in the overall score of the championship match. After tossup&nbsp;50, the lowest-scoring remaining players are eliminated until two remain; the tiebreaker procedure is the same as before. At the conclusion of the match, tiebreaker tossups are read if and as necessary.</p>
		
		<table class="even-spacing unsortable championship-scoresheet" id="championship-match">
			<thead>
				<tr class="player-names">
					<th>&nbsp;</th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1064#player_1323">Ali Saeed</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1062#player_1289">Michael Gislason</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1077#player_1273">John Waldron</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1067#player_1331">Cole Timmerwilke</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1065#player_1308">Jonathan Suh</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1079#player_1352">Ankush Bajaj</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1067#player_1333">Ethan Strombeck</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1077#player_1272">Matthew Lehmann</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1061#player_1274">Jakob Myers</a></th>
					<th class="answer" rowspan="2">Answer</th>
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
					<td class="answer-blank">&nbsp;</td>
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
					<td class="answer">Tiberius</td>
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
					<td class="answer"><i>Troilus and Cressida</i></td>
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
					<td class="answer">John Rawls</td>
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
					<td class="answer">power set</td>
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
					<td class="answer">Pontiac</td>
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
					<td class="answer">Hungarian Dances</td>
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
					<td class="answer">John Dos Passos</td>
				</tr>
				<tr>
					<td class="question-number">8</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-incorrect-response">&minus;1</td><!-- John -->
					<td class="player-incorrect-response">&minus;1</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-incorrect-response">&minus;1</td><!-- Ankush -->
					<td class="player-correct-response">1</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<td class="answer">carboxylic acids</td>
				<tr>
					<td class="question-number">9</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Ali -->
					<td class="player-incorrect-response">&minus;1</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- John -->
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Ankush -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-correct-response">1</td><!-- Jakob -->
					<td class="answer">U.S. Army (current events)</td>
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
					<td class="answer">“I Got Rhythm”</td>
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
					<td class="answer">Mikhail Lermontov</td>
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
					<td class="answer">Very Large Array</td>
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
					<td class="answer">Trinidad and Tobago</td>
				</tr>
				<tr>
					<td class="question-number">14</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-correct-response">1</td><!-- John -->
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-incorrect-response">&minus;1</td><!-- Ankush -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<td class="answer">Fatimid dynasty</td>
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
					<td class="answer">John Ashbery</td>
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
					<td class="answer">reverberation</td>
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
					<td class="answer"><i>The Death of Sardanapalus</i></td>
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
					<td class="player-incorrect-response">&minus;1</td><!-- Jakob -->
					<td class="answer">Ralph Bunche</td>
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
					<td class="answer">Calydonian boar</td>
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
					<td class="answer">aquaporins</td>
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
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<td>&nbsp;</td>
					<td colspan="10" class="note">Ali Saeed, as Morning Champion, entered the game with a score equal to that of the then-leader, Matthew Lehmann: 7.</td>
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
					<td class="answer">geomagnetic reversal</td>
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
					<td class="answer">Burkina Faso</td>
				</tr>
				<tr>
					<td class="question-number">23</td>
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- John -->
					<td class="player-incorrect-response">&minus;1</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Ankush -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<td class="answer">Vincenzo Bellini</td>
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
					<td class="answer">Battle of Gaugamela</td>
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
					<td class="answer">Menander</td>
				</tr>
				<tr>
					<td class="question-number">26</td>
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- John -->
					<td class="player-incorrect-response">&minus;1</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-incorrect-response">&minus;1</td><!-- Ankush -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<td class="answer">Peter Debye</td>
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
					<td class="answer">Nicolas Poussin</td>
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
					<td class="answer">Interstate Commerce Commission</td>
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
					<td class="answer">ahimsa</td>
				</tr>
				<tr>
					<td class="question-number">30</td>
					<td class="player-incorrect-response">&minus;1</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- John -->
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Ankush -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-correct-response">1</td><!-- Jakob -->
					<td class="answer">N. Scott Momaday</td>
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
					<td class="answer">synovial bursae</td>
				</tr>
				<tr>
					<td class="question-number">32</td>
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- John -->
					<td class="player-incorrect-response">&minus;1</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-correct-response">1</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Ankush -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-incorrect-response">&minus;1</td><!-- Jakob -->
					<td class="answer">Cardinal Wolsey</td>
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
					<td class="player-incorrect-response">&minus;1</td><!-- Jakob -->
					<td class="answer">Hyderabad</td>
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
					<td class="answer">Christina Rossetti</td>
				</tr>
				<tr>
					<td class="question-number">35</td>
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-incorrect-response">&minus;1</td><!-- John -->
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-incorrect-response">&minus;1</td><!-- Ankush -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<td class="answer">conjugated molecules</td>
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
					<td class="answer">Gabriel Faur&eacute;</td>
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
					<td class="answer">Antonio Gramsci</td>
				</tr>
				<tr>
					<td class="question-number">38</td>
					<td class="player-correct-response">1</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- John -->
					<td class="player-no-response">&nbsp;</td><!-- Cole -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-incorrect-response">&minus;1</td><!-- Ankush -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<td class="answer"><i>Far from the Madding Crowd</i></td>
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
					<td class="answer">Mersenne primes</td>
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
					<td class="answer">T&uacute;pac Amaru</td>
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
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<td>&nbsp;</td>
					<td colspan="10" class="note">
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
					<td class="answer">Ernst Mach</td>
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
					<td class="answer">the Directory</td>
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
					<td class="answer"><i>Sons and Lovers</i></td>
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
					<td class="answer">Mammoth Cave</td>
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
					<td class="answer">Anton Bruckner</td>
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
					<td class="answer">J.&nbsp;Willard Gibbs</td>
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
					<td class="answer"><i>Death Comes for the Archbishop</i></td>
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
					<td class="answer">elasticity (economics)</td>
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
					<td class="answer">Battle of Tours</td>
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
					<td class="answer">fluorescence</td>
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
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<td>&nbsp;</td>
					<td colspan="10" class="note">
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
					<td class="answer">Ezra Pound</td>
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
					<td class="answer">St.&nbsp;Basil’s Cathedral</td>
				</tr>
				<tr>
					<td class="question-number">53</td>
					<td class="player-correct-response">1</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael -->
					<td class="player-not-in-game">&nbsp;</td><!-- John -->
					<td class="player-incorrect-response">&minus;1</td><!-- Cole -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ankush -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jakob -->
					<td class="answer">Yellow Turban Rebellion</td>
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
					<td class="answer">Pentecost</td>
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
					<td class="answer">transposons</td>
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
					<td class="answer">Oe Kenzaburo</td>
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
					<td class="answer">Massacio</td>
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
					<td class="answer">Free Soil Party</td>
				</tr>
				<tr>
					<td class="question-number">59</td>
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael -->
					<td class="player-not-in-game">&nbsp;</td><!-- John -->
					<td class="player-incorrect-response">&minus;1</td><!-- Cole -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ankush -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jakob -->
					<td class="answer">United Airlines (current events)</td>
				</tr>
				<tr>
					<td class="question-number">60</td>
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael -->
					<td class="player-not-in-game">&nbsp;</td><!-- John -->
					<td class="player-incorrect-response">&minus;1</td><!-- Cole -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ankush -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jakob -->
					<td class="answer">eigenvalues</td>
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
					<td class="answer-blank">&nbsp;</td>
				</tr>
			</tfoot>
		</table>
		
		<p>Ali Saeed of Stevenson High School in Lincolnshire is the champion of the 2015 Scobol Solo.</p>
		
		<p>This is the second consecutive year in which the Morning Champion has also been the overall champion. (<a href="/2014/">2014</a>: Cole Timmerwilke of Auburn in Rockford.) Before that, this had not happened since <a href="/2008/">2008</a> (Siva Sundaram, also of Auburn.)</p>
		
		<p>Stevenson is the fourth school to have fielded at least two winners. Previously, Auburn (Rockford) has fielded Cole Timmerwilke (<a href="/2014/">2014</a>), Lloyd Sy (<a href="/2009/">2009</a> and <a href="/2011/">2011</a>), and Siva Sundaram (<a href="/2008/">2008</a>); New Trier (Winnetka) has fielded Carlo Angiuli (<a href="/2007/">2007</a>) and Matt Keenan (<a href="/2002/">2002</a>); and Wheaton North has fielded Greg Gauthier (<a href="/2007/">2007</a>) and Paul Gauthier (<a href="/2003/">2003</a>).</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
