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
	<jsp:param name="tournamentCode" value="2016" />
	<jsp:param name="pageTitle" value="Championship Match" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2016()).asTopLevel().output(request, \"championship-match\") %>" />
	<jsp:param name="h1" value="Championship Match" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>The participants in the Championship Match are the one player who won all seven preliminary matches (the Morning Champion), the seven players who won exactly six of their preliminary matches, and the (one) player who had the highest points per tossup heard among those who won exactly five of their preliminary matches.</p>
		
		<p>Unlike in the preliminary rounds, all incorrect answers result in a deduction of 1&nbsp;point. This is true regardless of whether the incorrect answer interrupted the question; it is thus different from ordinary "negs".</p>
		
		<p>Each player starts with 3&nbsp;points. A player whose score reaches 0 is immediately removed from the match.</p>
		
		<p>If any player reaches a score of 10 during the first 20&nbsp;tossups, he or she sits out until tossup&nbsp;21.</p>
		
		<p>The Morning Champion sits out for the first 20&nbsp;tossups, and enters at tossup&nbsp;21 with a score equal to that of the leader at that time. After tossup&nbsp;40, the lowest-scoring players are removed until four remain; if necessary, tiebreaker tossups are used, but they do not count in the overall score of the championship match. After tossup&nbsp;50, the lowest-scoring remaining players are eliminated until two remain; the tiebreaker procedure is the same as before. At the conclusion of the match, tiebreaker tossups are read if and as necessary.</p>
		
		<table class="even-spacing unsortable championship-scoresheet" data-fixed-columns="1">
			<thead>
				<tr class="player-names">
					<th>&nbsp;</th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1091#player_1416">Matthew Lehmann</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1110#player_1418">John Banta</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1096#player_1436">Jack Mayer</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1090#player_1491">Ali Saeed</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1089#player_1524">Ethan Strombeck</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1091#player_1417">John Waldron</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1092#player_1470">Lily Hamer</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1112#player_1512">Aristotle Vainikos</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1107#player_1454">Jakob Myers</a></th>
					<th class="answer" rowspan="2">Answer</th>
				</tr>
				<tr class="player-schools">
					<th>&nbsp;</th>
					<th class="player-school">Barrington</th><!-- Matthew -->
					<th class="player-school">Lake Forest</th><!-- John B. -->
					<th class="player-school">Loyola Academy</th><!-- Jack -->
					<th class="player-school">Stevenson (Lincolnshire)</th><!-- Ali -->
					<th class="player-school">Auburn (Rockford)</th><!-- Cole -->
					<th class="player-school">Barrington</th><!-- John W. -->
					<th class="player-school">Homewood-Flossmoor</th><!-- Lily -->
					<th class="player-school">Sandburg (Orland Park)</th><!-- Aristotle -->
					<th class="player-school">Naperville North</th><!-- Jakob -->
				</tr>
			</thead>
			<tbody>
				<tr class="score-check">
					<td class="score-check-label">Initial scores</td>
					<td class="player-score-check">&nbsp;</td><!-- Matthew -->
					<td class="player-score-check">3</td><!-- John B. -->
					<td class="player-score-check">3</td><!-- Jack -->
					<td class="player-score-check">3</td><!-- Ali -->
					<td class="player-score-check">3</td><!-- Ethan -->
					<td class="player-score-check">3</td><!-- John W. -->
					<td class="player-score-check">3</td><!-- Lily -->
					<td class="player-score-check">3</td><!-- Aristotle -->
					<td class="player-score-check">3</td><!-- Jakob -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr>
					<td class="question-number">1</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- John B. -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-no-response">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-correct-response">1</td><!-- Jakob -->
					<td class="answer">Franz Leh&aacute;r</td>
				</tr>
				<tr>
					<td class="question-number">2</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- John B. -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="player-correct-response">1</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-no-response">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<td class="answer">Hartford Convention</td>
				</tr>
				<tr>
					<td class="question-number">3</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- John B. -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="player-correct-response">1</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-no-response">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<td class="answer">genetic drift</td>
				</tr>
				<tr>
					<td class="question-number">4</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- John B. -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="player-correct-response">1</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-no-response">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<td class="answer">Manuel Puig</td>
				</tr>
				<tr>
					<td class="question-number">5</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- John B. -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-no-response">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<td class="answer">Lev Vygotsky</td>
				</tr>
				<tr>
					<td class="question-number">6</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- John B. -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-correct-response">1</td><!-- John W. -->
					<td class="player-no-response">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<td class="answer">Josef Mengele</td>
				</tr>
				<tr>
					<td class="question-number">7</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-incorrect-response">&ndash;1</td><!-- John B. -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<td class="answer">Arcangelo Corelli</td>
				</tr>
				<tr>
					<td class="question-number">8</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- John B. -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-correct-response">1</td><!-- John W. -->
					<td class="player-no-response">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<td class="answer">quantum entanglement</td>
				<tr>
					<td class="question-number">9</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- John B. -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-no-response">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-correct-response">1</td><!-- Jakob -->
					<td class="answer">Lake Tanganyika</td>
				</tr>
				<tr>
					<td class="question-number">10</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- John B. -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="player-correct-response">1</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-no-response">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<td class="answer">Nick Adams</td>
				</tr>
				<tr>
					<td class="question-number">11</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- John B. -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-correct-response">1</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-no-response">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<td class="answer"><i>The Swing</i></td>
				</tr>
				<tr>
					<td class="question-number">12</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- John B. -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-correct-response">1</td><!-- John W. -->
					<td class="player-no-response">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<td class="answer">rank (math)</td>
				</tr>
				<tr>
					<td class="question-number">13</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- John B. -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-no-response">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-correct-response">1</td><!-- Jakob -->
					<td class="answer">Hero Twins</td>
				</tr>
				<tr>
					<td class="question-number">14</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- John B. -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-no-response">&nbsp;</td><!-- Lily -->
					<td class="player-correct-response">1</td><!-- Aristotle -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Jakob -->
					<td class="answer">Song dynasty</td>
				</tr>
				<tr>
					<td class="question-number">15</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- John B. -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="player-correct-response">1</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-no-response">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<td class="answer">spiders (poetry)</td>
				</tr>
				<tr>
					<td class="question-number">16</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- John B. -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-correct-response">1</td><!-- John W. -->
					<td class="player-no-response">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<td class="answer">rift (earth science)</td>
				</tr>
				<tr>
					<td class="question-number">17</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- John B. -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-correct-response">1</td><!-- John W. -->
					<td class="player-no-response">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<td class="answer">FARC</td>
				</tr>
				<tr>
					<td class="question-number">18</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- John B. -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-no-response">&nbsp;</td><!-- Lily -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Aristotle -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Jakob -->
					<td class="answer">Braxton Bragg</td>
				</tr>
				<tr>
					<td class="question-number">19</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- John B. -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-no-response">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-correct-response">1</td><!-- Jakob -->
					<td class="answer"><i>Man and Superman</i>, replaced with <i>The Waste Land</i></td>
				</tr>
				<tr>
					<td class="question-number">20</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- John B. -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-incorrect-response">&ndash;1</td><!-- John W. -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Lily -->
					<td class="player-correct-response">1</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<td class="answer">proteins</td>
				</tr>
				<tr class="score-check">
					<td class="score-check-label">Scores through 20</td>
					<td class="player-score-check">&nbsp;</td><!-- Matthew -->
					<td class="player-score-check">2</td><!-- John B. -->
					<td class="player-score-check">3</td><!-- Jack -->
					<td class="player-score-check">6</td><!-- Ali -->
					<td class="player-score-check">3</td><!-- Ethan -->
					<td class="player-score-check">7</td><!-- John W. -->
					<td class="player-score-check">1</td><!-- Lily -->
					<td class="player-score-check">4</td><!-- Aristotle -->
					<td class="player-score-check">5</td><!-- Jakob -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<td>&nbsp;</td>
					<td colspan="10" class="note">Matthew Lehmann, as Morning Champion, entered the game with a score equal to that of the then-leader, John Waldron: 7.</td>
				</tr>
				<tr>
					<td class="question-number">21</td>
					<td class="player-incorrect-response">&ndash;1</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- John B. -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-correct-response">1</td><!-- John W. -->
					<td class="player-no-response">&nbsp;</td><!-- Lily -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<td class="answer">Stern-Gerlach experiment</td>
				</tr>
				<tr>
					<td class="question-number">22</td>
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- John B. -->
					<td class="player-correct-response">1</td><!-- Jack -->
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-no-response">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<td class="answer">Mithras</td>
				</tr>
				<tr>
					<td class="question-number">23</td>
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- John B. -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-no-response">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-correct-response">1</td><!-- Jakob -->
					<td class="answer">Harry Hopkins</td>
				</tr>
				<tr>
					<td class="question-number">24</td>
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- John B. -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="player-correct-response">1</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-no-response">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<td class="answer">Ng&utilde;g&itilde; wa Thiong'o</td>
				</tr>
				<tr>
					<td class="question-number">25</td>
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- John B. -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="player-correct-response">1</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-no-response">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<td class="answer">Carl Seyfert</td>
				</tr>
				<tr>
					<td class="question-number">26</td>
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- John B. -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-no-response">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-correct-response">1</td><!-- Jakob -->
					<td class="answer">Gunnar Myrdal</td>
				</tr>
				<tr>
					<td class="question-number">27</td>
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- John B. -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-no-response">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Jakob -->
					<td class="answer">Arnulfo Arias Madrid</td>
				</tr>
				<tr>
					<td class="question-number">28</td>
					<td class="player-correct-response">1</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- John B. -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<td class="answer">Paul Verlaine</td>
				</tr>
				<tr class="note">
					<td>&nbsp;</td>
					<td colspan="10" class="note">
						As Lily Hamer's score reached 0, she was eliminated.
					</td>
				</tr>
				<tr>
					<td class="question-number">29</td>
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- John B. -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<td class="answer">Paolo Veronese</td>
				</tr>
				<tr>
					<td class="question-number">30</td>
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- John B. -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-correct-response">1</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<td class="answer">double-replacement reaction</td>
				</tr>
				<tr>
					<td class="question-number">31</td>
					<td class="player-correct-response">1</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- John B. -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<td class="answer">Battle of Poltava</td>
				</tr>
				<tr>
					<td class="question-number">32</td>
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- John B. -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-correct-response">1</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Jakob -->
					<td class="answer">Badlands National Park</td>
				</tr>
				<tr>
					<td class="question-number">33</td>
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- John B. -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="player-correct-response">1</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<td class="answer">Isaac Alb&eacute;niz</td>
				</tr>
				<tr>
					<td class="question-number">34</td>
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- John B. -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="player-correct-response">1</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<td class="answer"><i>Mourning Becomes Electra</i></td>
				</tr>
				<tr>
					<td class="question-number">35</td>
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- John B. -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-correct-response">1</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<td class="answer">sampling (statistics)</td>
				</tr>
				<tr>
					<td class="question-number">36</td>
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- John B. -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-correct-response">1</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<td class="answer">Steve Bannon</td>
				</tr>
				<tr>
					<td class="question-number">37</td>
					<td class="player-incorrect-response">&ndash;1</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- John B. -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Jakob -->
					<td class="answer">Pope Clement VII</td>
				</tr>
				<tr>
					<td class="question-number">38</td>
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- John B. -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="player-correct-response">1</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<td class="answer">Zadie Smith</td>
				</tr>
				<tr>
					<td class="question-number">39</td>
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- John B. -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-correct-response">1</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<td class="answer">Jean Arp</td>
				</tr>
				<tr>
					<td class="question-number">40</td>
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- John B. -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-correct-response">1</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<td class="answer">disulfide bonds</td>
				</tr>
				<tr class="score-check">
					<td class="score-check-label">Scores through 40</td>
					<td class="player-score-check">7</td><!-- Matthew -->
					<td class="player-score-check">1</td><!-- John B. -->
					<td class="player-score-check">4</td><!-- Jack -->
					<td class="player-score-check">9</td><!-- Ali -->
					<td class="player-score-check">4</td><!-- Ethan -->
					<td class="player-score-check">11</td><!-- John W. -->
					<td class="player-eliminated">eliminated</td><!-- Lily -->
					<td class="player-score-check">4</td><!-- Aristotle -->
					<td class="player-score-check">4</td><!-- Jakob -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<td>&nbsp;</td>
					<td colspan="10" class="note">
						The four remaining players with the lowest scores were eliminated. As Jack Mayer, Ethan Strombeck, Aristotle Vainikos, and Jakob Myers were tied, a tiebreaker was held to determine which would remain in the game. Jakob won the tiebreaker (Niger in history), so Jack, Ethan, and Aristotle were eliminated. John Banta was also eliminated.
					</td>
				</tr>
				<tr>
					<td class="question-number">41</td>
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- John B. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<td class="answer">Ellen Johnson Sirleaf</td>
				</tr>
				<tr>
					<td class="question-number">42</td>
					<td class="player-correct-response">1</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- John B. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<td class="answer">cross product</td>
				</tr>
				<tr>
					<td class="question-number">43</td>
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- John B. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-correct-response">1</td><!-- Jakob -->
					<td class="answer">trombone</td>
				</tr>
				<tr>
					<td class="question-number">44</td>
					<td class="player-correct-response">1</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- John B. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<td class="answer">Mikhail Bulgakov</td>
				</tr>
				<tr>
					<td class="question-number">45</td>
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- John B. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-correct-response">1</td><!-- Jakob -->
					<td class="answer">Daughters of the American Revolution</td>
				</tr>
				<tr>
					<td class="question-number">46</td>
					<td class="player-correct-response">1</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- John B. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<td class="answer">apoptosis</td>
				</tr>
				<tr>
					<td class="question-number">47</td>
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- John B. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="player-correct-response">1</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<td class="answer">Hans Holbein the Younger</td>
				</tr>
				<tr>
					<td class="question-number">48</td>
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- John B. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-correct-response">1</td><!-- Jakob -->
					<td class="answer">John Greenleaf Whittier</td>
				</tr>
				<tr>
					<td class="question-number">49</td>
					<td class="player-correct-response">1</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- John B. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<td class="answer">Jonah (prophet)</td>
				</tr>
				<tr>
					<td class="question-number">50</td>
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- John B. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-correct-response">1</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<td class="answer">Gupta dynasty</td>
				</tr>
				<tr class="score-check">
					<td class="score-check-label">Scores through 50</td>
					<td class="player-score-check">11</td><!-- Matthew -->
					<td class="player-eliminated">eliminated</td><!-- John B. -->
					<td class="player-eliminated">eliminated</td><!-- Jack -->
					<td class="player-score-check">8</td><!-- Ali -->
					<td class="player-eliminated">eliminated</td><!-- Ethan -->
					<td class="player-score-check">12</td><!-- John W. -->
					<td class="player-eliminated">eliminated</td><!-- Lily -->
					<td class="player-eliminated">eliminated</td><!-- Aristotle -->
					<td class="player-score-check">6</td><!-- Jakob -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<td>&nbsp;</td>
					<td colspan="10" class="note">
						The two players with the lowest scores were eliminated: Jakob Myers and Ali Saeed.
					</td>
				</tr>
				<tr>
					<td class="question-number">51</td>
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- John B. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-correct-response">1</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jakob -->
					<td class="answer">lattice energy</td>
				</tr>
				<tr>
					<td class="question-number">52</td>
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- John B. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-incorrect-response">&ndash;1</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jakob -->
					<td class="answer">Cleisthenes</td>
				</tr>
				<tr>
					<td class="question-number">53</td>
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- John B. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jakob -->
					<td class="answer">Dill Harris</td>
				</tr>
				<tr>
					<td class="question-number">54</td>
					<td class="player-correct-response">1</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- John B. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jakob -->
					<td class="answer">Thomas Tallis</td>
				</tr>
				<tr>
					<td class="question-number">55</td>
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- John B. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-correct-response">1</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jakob -->
					<td class="answer">New Brunswick</td>
				</tr>
				<tr>
					<td class="question-number">56</td>
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- John B. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-correct-response">1</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jakob -->
					<td class="answer">barrier (mixed science)</td>
				</tr>
				<tr>
					<td class="question-number">57</td>
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- John B. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-incorrect-response">&ndash;1</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jakob -->
					<td class="answer">Gran Chaco War</td>
				</tr>
				<tr>
					<td class="question-number">58</td>
					<td class="player-correct-response">1</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- John B. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jakob -->
					<td class="answer">Anne Bront&euml;</td>
				</tr>
				<tr>
					<td class="question-number">59</td>
					<td class="player-correct-response">1</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- John B. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jakob -->
					<td class="answer">Baruch Spinoza</td>
				</tr>
				<tr>
					<td class="question-number">60</td>
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- John B. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-correct-response">1</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jakob -->
					<td class="answer">Hendrik Lorentz</td>
				</tr>
				<tr class="score-check">
					<td class="score-check-label">Scores through 60</td>
					<td class="player-score-check">14</td><!-- Matthew -->
					<td class="player-eliminated">eliminated</td><!-- John B. -->
					<td class="player-eliminated">eliminated</td><!-- Jack -->
					<td class="player-eliminated">eliminated</td><!-- Ali -->
					<td class="player-eliminated">eliminated</td><!-- Ethan -->
					<td class="player-score-check">14</td><!-- John W. -->
					<td class="player-eliminated">eliminated</td><!-- Lily -->
					<td class="player-eliminated">eliminated</td><!-- Aristotle -->
					<td class="player-eliminated">eliminated</td><!-- Jakob -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<td>&nbsp;</td>
					<td colspan="10" class="note">
						A tiebreaker question was read.
					</td>
				</tr>
				<tr>
					<td class="question-number">61</td>
					<td class="player-incorrect-response">&ndash;1</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- John B. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jakob -->
					<td class="answer">neural crest</td>
				</tr>
			</tbody>
			<tfoot>
				<tr class="score-check">
					<td class="score-check-label">Final scores</td>
					<td class="player-score-check">13</td><!-- Matthew -->
					<td class="player-eliminated">eliminated</td><!-- John B. -->
					<td class="player-eliminated">eliminated</td><!-- Jack -->
					<td class="player-eliminated">eliminated</td><!-- Ali -->
					<td class="player-eliminated">eliminated</td><!-- Ethan -->
					<td class="player-score-check">14</td><!-- John W. -->
					<td class="player-eliminated">eliminated</td><!-- Lily -->
					<td class="player-eliminated">eliminated</td><!-- Aristotle -->
					<td class="player-eliminated">eliminated</td><!-- Jakob -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
			</tfoot>
		</table>
		
		<p>John Waldron of Barrington High School is the champion of the 2016 Scobol Solo. He is the first player from Barrington to win the tournament.</p>
		
		<p>This is the second consecutive year in which Barrington High School has had two players in the finals; the previous time was in 2015, and it was the same two players.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
