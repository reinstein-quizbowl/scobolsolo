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
		<p>The participants in the Championship Match are the one player who won all 7 preliminary matches (the morning champion), the seven players who won 6 of their preliminary matches, and the (one) player who had the highest points per tossup heard among those who won 5 of their preliminary matches.</p>
		
		<p>Unlike in the preliminary rounds, all incorrect answers result in a deduction of 1&nbsp;point. This is true regardless of whether the incorrect answer interrupted the question; it is thus different from ordinary "negs".</p>
		
		<p>Each player starts with 3&nbsp;points. A player whose score reaches 0 is immediately removed from the match.</p>
		
		<p>If any player reaches a score of 10 during the first 20&nbsp;tossups, he or she sits out until tossup&nbsp;21.</p>
		
		<p>The morning champion sits out for the first 20&nbsp;tossups, and enters at tossup&nbsp;21 with a score equal to that of the leader at that time. After tossup 40, the five players with the lowest score are eliminated; to effect this, tiebreaker tossups are applied as necessary, but they do not count in the overall score of the championship match. Four players thus remain. After tossup 50, the two lowest-scoring remaining players are eliminated; the tiebreaker procedure is the same as before. Two players thus remain. At the conclusion of the match, tiebreaker tossups are read as necessary.</p>
		
		<table class="full-width responsive even-spacing unsortable championship-scoresheet">
			<thead>
				<tr class="player-names">
					<th>&nbsp;</th>
					<th class="player-name">Matthew Lehmann</th>
					<th class="player-name">John Banta</th>
					<th class="player-name">Jack Mayer</th>
					<th class="player-name">Ali Saeed</th>
					<th class="player-name">Ethan Strombeck</th>
					<th class="player-name">John Waldron</th>
					<th class="player-name">Lily Hamer</th>
					<th class="player-name">Aristotle Vainikos</th>
					<th class="player-name">Jakob Myers</th>
					<!-- <th class="answer" rowspan="2">Answer</th> --><!-- when restoring this, don't forget to change the colspans -->
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
					<th class="player-school">Carl Sandburg</th><!-- Aristotle -->
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
					<!-- <td class="answer-blank">&nbsp;</td> -->
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
					<!-- <td class="answer"></td> -->
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
					<!-- <td class="answer"></td> -->
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
					<!-- <td class="answer"></td> -->
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
					<!-- <td class="answer"></td> -->
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
					<!-- <td class="answer"></td> -->
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
					<!-- <td class="answer"></td> -->
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
					<!-- <td class="answer"></td> -->
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
					<!-- <td class="answer"></td> -->
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
					<!-- <td class="answer"></td> -->
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
					<!-- <td class="answer"></td> -->
				</tr>
				<tr>
					<td class="question-number">11</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- John B. -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-correct-response">1</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<!-- <td class="answer"></td> -->
				</tr>
				<tr>
					<td class="question-number">12</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- John B. -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Lily -->
					<td class="player-correct-response">1</td><!-- John W. -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<!-- <td class="answer"></td> -->
				</tr>
				<tr>
					<td class="question-number">13</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- John B. -->
					<td class="player-no-response">&nbsp;</td><!-- Jack -->
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-correct-response">1</td><!-- Jakob -->
					<!-- <td class="answer"></td> -->
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
					<!-- <td class="answer"></td> -->
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
					<!-- <td class="answer"></td> -->
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
					<!-- <td class="answer"></td> -->
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
					<!-- <td class="answer"></td> -->
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
					<!-- <td class="answer"></td> -->
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
					<!-- <td class="answer"></td> -->
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
					<!-- <td class="answer"></td> -->
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
					<!-- <td class="answer-blank">&nbsp;</td> -->
				</tr>
				<tr class="note">
					<td>&nbsp;</td>
					<td colspan="9" class="note">Mathew Lehmann, as morning champion, entered the game with a score equal to that of the then-leader, John Waldron: 7.</td>
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
					<!-- <td class="answer"></td> -->
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
					<!-- <td class="answer"></td> -->
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
					<!-- <td class="answer"></td> -->
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
					<!-- <td class="answer"></td> -->
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
					<!-- <td class="answer"></td> -->
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
					<!-- <td class="answer"></td> -->
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
					<!-- <td class="answer"></td> -->
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
					<!-- <td class="answer"></td> -->
				</tr>
				<tr class="note">
					<td>&nbsp;</td>
					<td colspan="9" class="note">
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
					<!-- <td class="answer"></td> -->
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
					<!-- <td class="answer"></td> -->
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
					<!-- <td class="answer"></td> -->
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
					<!-- <td class="answer"></td> -->
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
					<!-- <td class="answer"></td> -->
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
					<!-- <td class="answer"></td> -->
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
					<!-- <td class="answer"></td> -->
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
					<!-- <td class="answer"></td> -->
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
					<!-- <td class="answer"></td> -->
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
					<!-- <td class="answer"></td> -->
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
					<!-- <td class="answer"></td> -->
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
					<!-- <td class="answer"></td> -->
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
					<!-- <td class="answer-blank">&nbsp;</td> -->
				</tr>
				<tr class="note">
					<td>&nbsp;</td>
					<td colspan="9" class="note">
						The four remaining players with the lowest scores were eliminated. As Jack Mayer, Ethan Strombeck, Aristotle Vainikos, and Jakob Myers were tied, a tiebreaker was held to determine which would remain in the game. Jakob won the tiebreaker, so Jack, Ethan, and Aristotle were eliminated. John Banta was also eliminated.
					</td>
				</tr>
				<tr>
					<td class="question-number">41</td>
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- John B. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<!-- <td class="answer"></td> -->
				</tr>
				<tr>
					<td class="question-number">42</td>
					<td class="player-correct-response">1</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- John B. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<!-- <td class="answer"></td> -->
				</tr>
				<tr>
					<td class="question-number">43</td>
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- John B. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-correct-response">1</td><!-- Jakob -->
					<!-- <td class="answer"></td> -->
				</tr>
				<tr>
					<td class="question-number">44</td>
					<td class="player-correct-response">1</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- John B. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<!-- <td class="answer"></td> -->
				</tr>
				<tr>
					<td class="question-number">45</td>
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- John B. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-correct-response">1</td><!-- Jakob -->
					<!-- <td class="answer"></td> -->
				</tr>
				<tr>
					<td class="question-number">46</td>
					<td class="player-correct-response">1</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- John B. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<!-- <td class="answer"></td> -->
				</tr>
				<tr>
					<td class="question-number">47</td>
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- John B. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="player-correct-response">1</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<!-- <td class="answer"></td> -->
				</tr>
				<tr>
					<td class="question-number">48</td>
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- John B. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-correct-response">1</td><!-- Jakob -->
					<!-- <td class="answer"></td> -->
				</tr>
				<tr>
					<td class="question-number">49</td>
					<td class="player-correct-response">1</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- John B. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<!-- <td class="answer"></td> -->
				</tr>
				<tr>
					<td class="question-number">50</td>
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- John B. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="player-no-response">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-correct-response">1</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Jakob -->
					<!-- <td class="answer"></td> -->
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
					<!-- <td class="answer-blank">&nbsp;</td> -->
				</tr>
				<tr class="note">
					<td>&nbsp;</td>
					<td colspan="9" class="note">
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
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-correct-response">1</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jakob -->
					<!-- <td class="answer"></td> -->
				</tr>
				<tr>
					<td class="question-number">52</td>
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- John B. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-incorrect-response">&ndash;1</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jakob -->
					<!-- <td class="answer"></td> -->
				</tr>
				<tr>
					<td class="question-number">53</td>
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- John B. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jakob -->
					<!-- <td class="answer"></td> -->
				</tr>
				<tr>
					<td class="question-number">54</td>
					<td class="player-correct-response">1</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- John B. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jakob -->
					<!-- <td class="answer"></td> -->
				</tr>
				<tr>
					<td class="question-number">55</td>
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- John B. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-correct-response">1</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jakob -->
					<!-- <td class="answer"></td> -->
				</tr>
				<tr>
					<td class="question-number">56</td>
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- John B. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-correct-response">1</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jakob -->
					<!-- <td class="answer"></td> -->
				</tr>
				<tr>
					<td class="question-number">57</td>
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- John B. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-incorrect-response">&ndash;1</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jakob -->
					<!-- <td class="answer"></td> -->
				</tr>
				<tr>
					<td class="question-number">58</td>
					<td class="player-correct-response">1</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- John B. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jakob -->
					<!-- <td class="answer"></td> -->
				</tr>
				<tr>
					<td class="question-number">59</td>
					<td class="player-correct-response">1</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- John B. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-no-response">&nbsp;</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jakob -->
					<!-- <td class="answer"></td> -->
				</tr>
				<tr>
					<td class="question-number">60</td>
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- John B. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jack -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ali -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-correct-response">1</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jakob -->
					<!-- <td class="answer"></td> -->
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
					<!-- <td class="answer-blank">&nbsp;</td> -->
				</tr>
				<tr class="note">
					<td>&nbsp;</td>
					<td colspan="9" class="note">
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
					<td class="player-not-in-game">&nbsp;</td><!-- Lily -->
					<td class="player-not-in-game">&nbsp;</td><!-- John W. -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jakob -->
					<!-- <td class="answer"></td> -->
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
					<td class="player-eliminated">eliminated</td><!-- Lily -->
					<td class="player-score-check">14</td><!-- John W. -->
					<td class="player-eliminated">eliminated</td><!-- Aristotle -->
					<td class="player-eliminated">eliminated</td><!-- Jakob -->
					<!-- <td class="answer-blank">&nbsp;</td> -->
				</tr>
			</tfoot>
		</table>
		
		<p>John Waldron of Barrington High School is the champion of the 2016 Scobol Solo. He is the first player from Barrington to win the tournament.</p>
		
		<p>This is the second consecutive year in which Barrington High School has had two players in the finals; the previous time was in 2015, and it was the same two players.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />