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
	<jsp:param name="tournamentCode" value="2017" />
	<jsp:param name="pageTitle" value="Championship Match" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2017()).asTopLevel().output(request, \"championship-match\") %>" />
	<jsp:param name="h1" value="Championship Match" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>The participants in the Championship Match are the one player who won all 7 preliminary matches (the Morning Champion), the seven players who won 6 of their preliminary matches, and the (one) player who had the highest points per tossup heard among those who won 5 of their preliminary matches.</p>
		
		<p>Unlike in the preliminary rounds, all incorrect answers result in a deduction of 1&nbsp;point. This is true regardless of whether the incorrect answer interrupted the question; it is thus different from ordinary "negs".</p>
		
		<p>Each player starts with 3&nbsp;points. A player whose score reaches 0 is immediately removed from the match.</p>
		
		<p>If any player reaches a score of 10 during the first 20&nbsp;tossups, he or she sits out until tossup&nbsp;21.</p>
		
		<p>The Morning Champion sits out for the first 20&nbsp;tossups, and enters at tossup&nbsp;21 with a score equal to that of the leader at that time. After tossup&nbsp;40, the lowest-scoring players are removed until four remain; if necessary, tiebreaker tossups are used, but they do not count in the overall score of the championship match. After tossup&nbsp;50, the lowest-scoring remaining players are eliminated until two remain; the tiebreaker procedure is the same as before. At the conclusion of the match, tiebreaker tossups are read if and as necessary.</p>
		
		<table class="even-spacing unsortable championship-scoresheet" data-fixed-columns="1">
			<thead>
				<tr class="player-names">
					<th>&nbsp;</th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1122#player_1621">Ethan Strombeck</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1131#player_1653">Matthew Lee</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1142#player_1661">Arjun Nageswaran</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1141#player_1601">Aristotle Vainikos</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1123#player_1559">Wilder Seitz</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1125#player_1560">Ana Pranger</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1119#player_1550">Kevin Kodama</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1118#player_1549">Mitch McCullar</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1124#player_1635">Jaden Lucas</a></th>
					<th class="answer" rowspan="2">Answer</th>
				</tr>
				<tr class="player-schools">
					<th>&nbsp;</th>
					<th class="player-school">Auburn (Rockford)</th><!-- Ethan -->
					<th class="player-school">IMSA (Aurora)</th><!-- Matthew -->
					<th class="player-school">Stevenson (Lincolnshire)</th><!-- Arjun -->
					<th class="player-school">Sandburg (Orland Park)</th><!-- Aristotle -->
					<th class="player-school">Barrington</th><!-- Wilder -->
					<th class="player-school">Latin School (Chicago)</th><!-- Ana -->
					<th class="player-school">Oak Park-River Forest</th><!-- Kevin -->
					<th class="player-school">Williamsville</th><!-- Mitch -->
					<th class="player-school">Carbondale</th><!-- Jaden -->
				</tr>
			</thead>
			<tbody>
				<tr class="score-check">
					<th class="score-check-label">Initial scores</th>
					<td class="player-score-check">&nbsp;</td><!-- Ethan -->
					<td class="player-score-check">3</td><!-- Matthew -->
					<td class="player-score-check">3</td><!-- Arjun -->
					<td class="player-score-check">3</td><!-- Aristotle -->
					<td class="player-score-check">3</td><!-- Wilder -->
					<td class="player-score-check">3</td><!-- Ana -->
					<td class="player-score-check">3</td><!-- Kevin -->
					<td class="player-score-check">3</td><!-- Mitch -->
					<td class="player-score-check">3</td><!-- Jaden -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr>
					<th class="question-number">1</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-correct-response">1</td><!-- Aristotle -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Wilder -->
					<td class="player-no-response">&nbsp;</td><!-- Ana -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Mitch -->
					<td class="player-no-response">&nbsp;</td><!-- Jaden -->
					<td class="answer">closed (math)</td>
				</tr>
				<tr>
					<th class="question-number">2</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-correct-response">1</td><!-- Wilder -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Ana -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Mitch -->
					<td class="player-no-response">&nbsp;</td><!-- Jaden -->
					<td class="answer">trademarks</td>
				</tr>
				<tr>
					<th class="question-number">3</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-correct-response">1</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Wilder -->
					<td class="player-no-response">&nbsp;</td><!-- Ana -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Mitch -->
					<td class="player-no-response">&nbsp;</td><!-- Jaden -->
					<td class="answer">Hiram Bingham</td>
				</tr>
				<tr>
					<th class="question-number">4</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Wilder -->
					<td class="player-no-response">&nbsp;</td><!-- Ana -->
					<td class="player-correct-response">1</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Mitch -->
					<td class="player-no-response">&nbsp;</td><!-- Jaden -->
					<td class="answer">Mishima Yukio</td>
				</tr>
				<tr>
					<th class="question-number">5</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Wilder -->
					<td class="player-no-response">&nbsp;</td><!-- Ana -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Mitch -->
					<td class="player-no-response">&nbsp;</td><!-- Jaden -->
					<td class="answer">Alonzo Church</td>
				</tr>
				<tr>
					<th class="question-number">6</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-correct-response">1</td><!-- Wilder -->
					<td class="player-no-response">&nbsp;</td><!-- Ana -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Mitch -->
					<td class="player-no-response">&nbsp;</td><!-- Jaden -->
					<td class="answer">rondo</td>
				</tr>
				<tr>
					<th class="question-number">7</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Wilder -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Ana -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-correct-response">1</td><!-- Mitch -->
					<td class="player-no-response">&nbsp;</td><!-- Jaden -->
					<td class="answer">Ruth (biblical)</td>
				</tr>
				<tr>
					<th class="question-number">8</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-correct-response">1</td><!-- Wilder -->
					<td class="player-no-response">&nbsp;</td><!-- Ana -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Mitch -->
					<td class="player-no-response">&nbsp;</td><!-- Jaden -->
					<td class="answer">Battle of Zama</td>
				<tr>
					<th class="question-number">9</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Wilder -->
					<td class="player-no-response">&nbsp;</td><!-- Ana -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-correct-response">1</td><!-- Mitch -->
					<td class="player-no-response">&nbsp;</td><!-- Jaden -->
					<td class="answer">Los Angeles (as a literary setting)</td>
				</tr>
				<tr>
					<th class="question-number">10</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Wilder -->
					<td class="player-no-response">&nbsp;</td><!-- Ana -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Mitch -->
					<td class="player-correct-response">1</td><!-- Jaden -->
					<td class="answer">elastic moduli</td>
				</tr>
				<tr>
					<th class="question-number">11</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Wilder -->
					<td class="player-no-response">&nbsp;</td><!-- Ana -->
					<td class="player-correct-response">1</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Mitch -->
					<td class="player-no-response">&nbsp;</td><!-- Jaden -->
					<td class="answer"><i>Cos&igrave; fan tutte</i></td>
				</tr>
				<tr>
					<th class="question-number">12</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-correct-response">1</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Wilder -->
					<td class="player-no-response">&nbsp;</td><!-- Ana -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Mitch -->
					<td class="player-no-response">&nbsp;</td><!-- Jaden -->
					<td class="answer">Nice, France</td>
				</tr>
				<tr>
					<th class="question-number">13</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Wilder -->
					<td class="player-no-response">&nbsp;</td><!-- Ana -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-correct-response">1</td><!-- Mitch -->
					<td class="player-no-response">&nbsp;</td><!-- Jaden -->
					<td class="answer">Samuel Richardson</td>
				</tr>
				<tr>
					<th class="question-number">14</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Wilder -->
					<td class="player-no-response">&nbsp;</td><!-- Ana -->
					<td class="player-correct-response">1</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Mitch -->
					<td class="player-no-response">&nbsp;</td><!-- Jaden -->
					<td class="answer">Safavid dynasty</td>
				</tr>
				<tr>
					<th class="question-number">15</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Wilder -->
					<td class="player-no-response">&nbsp;</td><!-- Ana -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Mitch -->
					<td class="player-no-response">&nbsp;</td><!-- Jaden -->
					<td class="answer">hyphae</td>
				</tr>
				<tr>
					<th class="question-number">16</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Wilder -->
					<td class="player-no-response">&nbsp;</td><!-- Ana -->
					<td class="player-correct-response">1</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Mitch -->
					<td class="player-no-response">&nbsp;</td><!-- Jaden -->
					<td class="answer">UNESCO</td>
				</tr>
				<tr>
					<th class="question-number">17</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-correct-response">1</td><!-- Wilder -->
					<td class="player-no-response">&nbsp;</td><!-- Ana -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Mitch -->
					<td class="player-no-response">&nbsp;</td><!-- Jaden -->
					<td class="answer"><i>Wanderer Above the Sea of Fog</i></td>
				</tr>
				<tr>
					<th class="question-number">18</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Wilder -->
					<td class="player-no-response">&nbsp;</td><!-- Ana -->
					<td class="player-correct-response">1</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Mitch -->
					<td class="player-no-response">&nbsp;</td><!-- Jaden -->
					<td class="answer">Horace</td>
				</tr>
				<tr>
					<th class="question-number">19</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Wilder -->
					<td class="player-no-response">&nbsp;</td><!-- Ana -->
					<td class="player-correct-response">1</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Mitch -->
					<td class="player-no-response">&nbsp;</td><!-- Jaden -->
					<td class="answer">saccharin</td>
				</tr>
				<tr>
					<th class="question-number">20</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-correct-response">1</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Wilder -->
					<td class="player-no-response">&nbsp;</td><!-- Ana -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Mitch -->
					<td class="player-no-response">&nbsp;</td><!-- Jaden -->
					<td class="answer">Aachen</td>
				</tr>
				<tr class="score-check">
					<th class="score-check-label">Scores through 20</th>
					<td class="player-score-check">&nbsp;</td><!-- Ethan -->
					<td class="player-score-check">1</td><!-- Matthew -->
					<td class="player-score-check">4</td><!-- Arjun -->
					<td class="player-score-check">6</td><!-- Aristotle -->
					<td class="player-score-check">1</td><!-- Wilder -->
					<td class="player-score-check">1</td><!-- Ana -->
					<td class="player-score-check">9</td><!-- Kevin -->
					<td class="player-score-check">6</td><!-- Mitch -->
					<td class="player-score-check">4</td><!-- Jaden -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="10" class="note">Ethan Strombeck, as Morning Champion, entered the game with a score equal to that of the then-leader, Kevin Kodama: 9.</td>
				</tr>
				<tr>
					<th class="question-number">21</td>
					<td class="player-correct-response">1</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Wilder -->
					<td class="player-no-response">&nbsp;</td><!-- Ana -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Mitch -->
					<td class="player-no-response">&nbsp;</td><!-- Jaden -->
					<td class="answer">Chihuahua (the state)</td>
				</tr>
				<tr>
					<th class="question-number">22</td>
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-correct-response">1</td><!-- Wilder -->
					<td class="player-no-response">&nbsp;</td><!-- Ana -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Mitch -->
					<td class="player-no-response">&nbsp;</td><!-- Jaden -->
					<td class="answer">Permian period</td>
				</tr>
				<tr>
					<th class="question-number">23</td>
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Wilder -->
					<td class="player-no-response">&nbsp;</td><!-- Ana -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Mitch -->
					<td class="player-no-response">&nbsp;</td><!-- Jaden -->
					<td class="answer"><i>Piers Plowman</i></td>
				</tr>
				<tr>
					<th class="question-number">24</td>
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-correct-response">1</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Wilder -->
					<td class="player-no-response">&nbsp;</td><!-- Ana -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Mitch -->
					<td class="player-no-response">&nbsp;</td><!-- Jaden -->
					<td class="answer">Cnut the Great</td>
				</tr>
				<tr>
					<th class="question-number">25</td>
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-correct-response">1</td><!-- Wilder -->
					<td class="player-no-response">&nbsp;</td><!-- Ana -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Mitch -->
					<td class="player-no-response">&nbsp;</td><!-- Jaden -->
					<td class="answer">maize (American mythology)</td>
				</tr>
				<tr>
					<th class="question-number">26</td>
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Wilder -->
					<td class="player-no-response">&nbsp;</td><!-- Ana -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Mitch -->
					<td class="player-no-response">&nbsp;</td><!-- Jaden -->
					<td class="answer">chelation</td>
				</tr>
				<tr>
					<th class="question-number">27</td>
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Wilder -->
					<td class="player-no-response">&nbsp;</td><!-- Ana -->
					<td class="player-correct-response">1</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Mitch -->
					<td class="player-no-response">&nbsp;</td><!-- Jaden -->
					<td class="answer">Charlotte Perkins Gilman</td>
				</tr>
				<tr>
					<th class="question-number">28</td>
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Wilder -->
					<td class="player-no-response">&nbsp;</td><!-- Ana -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Mitch -->
					<td class="player-no-response">&nbsp;</td><!-- Jaden -->
					<td class="answer">Adam Clayton Powell</td>
				</tr>
				<tr>
					<th class="question-number">29</td>
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Aristotle -->
					<td class="player-correct-response">1</td><!-- Wilder -->
					<td class="player-no-response">&nbsp;</td><!-- Ana -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Mitch -->
					<td class="player-no-response">&nbsp;</td><!-- Jaden -->
					<td class="answer">Mont Sainte-Victoire</td>
				</tr>
				<tr>
					<th class="question-number">30</td>
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-correct-response">1</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Wilder -->
					<td class="player-no-response">&nbsp;</td><!-- Ana -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Mitch -->
					<td class="player-no-response">&nbsp;</td><!-- Jaden -->
					<td class="answer">gluons</td>
				</tr>
				<tr>
					<th class="question-number">31</td>
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Wilder -->
					<td class="player-no-response">&nbsp;</td><!-- Ana -->
					<td class="player-correct-response">1</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Mitch -->
					<td class="player-no-response">&nbsp;</td><!-- Jaden -->
					<td class="answer"><i>Notes from the Underground</i></td>
				</tr>
				<tr>
					<th class="question-number">32</td>
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-correct-response">1</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Wilder -->
					<td class="player-no-response">&nbsp;</td><!-- Ana -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Mitch -->
					<td class="player-no-response">&nbsp;</td><!-- Jaden -->
					<td class="answer">Kris Kobach</td>
				</tr>
				<tr>
					<th class="question-number">33</td>
					<td class="player-correct-response">1</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Wilder -->
					<td class="player-no-response">&nbsp;</td><!-- Ana -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Mitch -->
					<td class="player-no-response">&nbsp;</td><!-- Jaden -->
					<td class="answer">string quartets</td>
				</tr>
				<tr>
					<th class="question-number">34</td>
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-correct-response">1</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Wilder -->
					<td class="player-no-response">&nbsp;</td><!-- Ana -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Mitch -->
					<td class="player-no-response">&nbsp;</td><!-- Jaden -->
					<td class="answer">Great Northern War</td>
				</tr>
				<tr>
					<th class="question-number">35</td>
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-correct-response">1</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Wilder -->
					<td class="player-no-response">&nbsp;</td><!-- Ana -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Mitch -->
					<td class="player-no-response">&nbsp;</td><!-- Jaden -->
					<td class="answer">actin</td>
				</tr>
				<tr>
					<th class="question-number">36</td>
					<td class="player-correct-response">1</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Wilder -->
					<td class="player-no-response">&nbsp;</td><!-- Ana -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Mitch -->
					<td class="player-no-response">&nbsp;</td><!-- Jaden -->
					<td class="answer">Peter Shaffer</td>
				</tr>
				<tr>
					<th class="question-number">37</td>
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Wilder -->
					<td class="player-no-response">&nbsp;</td><!-- Ana -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Mitch -->
					<td class="player-no-response">&nbsp;</td><!-- Jaden -->
					<td class="answer"><i>The Dying Gaul</i></td>
				</tr>
				<tr>
					<th class="question-number">38</td>
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-correct-response">1</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Wilder -->
					<td class="player-no-response">&nbsp;</td><!-- Ana -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Mitch -->
					<td class="player-no-response">&nbsp;</td><!-- Jaden -->
					<td class="answer">Empress Dowager Cixi</td>
				</tr>
				<tr>
					<th class="question-number">39</td>
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Wilder -->
					<td class="player-no-response">&nbsp;</td><!-- Ana -->
					<td class="player-correct-response">1</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Mitch -->
					<td class="player-no-response">&nbsp;</td><!-- Jaden -->
					<td class="answer">relative primality</td>
				</tr>
				<tr>
					<th class="question-number">40</td>
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Matthew -->
					<td class="player-no-response">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Wilder -->
					<td class="player-no-response">&nbsp;</td><!-- Ana -->
					<td class="player-correct-response">1</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Mitch -->
					<td class="player-no-response">&nbsp;</td><!-- Jaden -->
					<td class="answer">pleasure principle</td>
				</tr>
				<tr class="score-check">
					<th class="score-check-label">Scores through 40</th>
					<td class="player-score-check">12</td><!-- Ethan -->
					<td class="player-score-check">4</td><!-- Matthew -->
					<td class="player-score-check">4</td><!-- Arjun -->
					<td class="player-score-check">6</td><!-- Aristotle -->
					<td class="player-score-check">1</td><!-- Wilder -->
					<td class="player-score-check">1</td><!-- Ana -->
					<td class="player-score-check">12</td><!-- Kevin -->
					<td class="player-score-check">5</td><!-- Mitch -->
					<td class="player-score-check">4</td><!-- Jaden -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="10" class="note">
						The five players with the lowest scores were eliminated: Matthew Lee, Arjun Nageswaran, Wilder Seitz, Ana Pranger, and Jaden Lucas.
					</td>
				</tr>
				<tr>
					<th class="question-number">41</td>
					<td class="player-correct-response">1</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Wilder -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ana -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Mitch -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jaden -->
					<td class="answer">Carl Maria von Weber</td>
				</tr>
				<tr>
					<th class="question-number">42</td>
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Wilder -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ana -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Mitch -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jaden -->
					<td class="answer">magnetic dipole moment</td>
				</tr>
				<tr>
					<th class="question-number">43</td>
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-correct-response">1</td><!-- Aristotle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Wilder -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ana -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Mitch -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jaden -->
					<td class="answer">Themistocles</td>
				</tr>
				<tr>
					<th class="question-number">44</td>
					<td class="player-correct-response">1</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Wilder -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ana -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Mitch -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jaden -->
					<td class="answer">Chuck Schumer</td>
				</tr>
				<tr>
					<th class="question-number">45</td>
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Wilder -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ana -->
					<td class="player-correct-response">1</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Mitch -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jaden -->
					<td class="answer">Alexander Pushkin</td>
				</tr>
				<tr>
					<th class="question-number">46</td>
					<td class="player-correct-response">1</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Wilder -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ana -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Mitch -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jaden -->
					<td class="answer">convex (mathematics)</td>
				</tr>
				<tr>
					<th class="question-number">47</td>
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Aristotle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Wilder -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ana -->
					<td class="player-correct-response">1</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Mitch -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jaden -->
					<td class="answer">Thailand (history)</td>
				</tr>
				<tr>
					<th class="question-number">48</td>
					<td class="player-correct-response">1</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Wilder -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ana -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Mitch -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jaden -->
					<td class="answer">John Dewey</td>
				</tr>
				<tr>
					<th class="question-number">49</td>
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Wilder -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ana -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-correct-response">1</td><!-- Mitch -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jaden -->
					<td class="answer">Mario Vargas Llosa</td>
				</tr>
				<tr>
					<th class="question-number">50</td>
					<td class="player-correct-response">1</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Aristotle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Wilder -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ana -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Mitch -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jaden -->
					<td class="answer">peroxisome</td>
				</tr>
				<tr class="score-check">
					<th class="score-check-label">Scores through 50</th>
					<td class="player-score-check">17</td><!-- Ethan -->
					<td class="player-eliminated">eliminated</td><!-- Matthew -->
					<td class="player-eliminated">eliminated</td><!-- Arjun -->
					<td class="player-score-check">5</td><!-- Aristotle -->
					<td class="player-eliminated">eliminated</td><!-- Wilder -->
					<td class="player-eliminated">eliminated</td><!-- Ana -->
					<td class="player-score-check">13</td><!-- Kevin -->
					<td class="player-score-check">6</td><!-- Mitch -->
					<td class="player-eliminated">eliminated</td><!-- Jaden -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="10" class="note">
						The two players with the lowest scores were eliminated: Aristotle Vainikos and Mitch McCullar.
					</td>
				</tr>
				<tr>
					<th class="question-number">51</td>
					<td class="player-correct-response">1</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Wilder -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ana -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Mitch -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jaden -->
					<td class="answer">Ella Fitzgerald</td>
				</tr>
				<tr>
					<th class="question-number">52</td>
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Wilder -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ana -->
					<td class="player-correct-response">1</td><!-- Kevin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Mitch -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jaden -->
					<td class="answer">Paraguay (history)</td>
				</tr>
				<tr>
					<th class="question-number">53</td>
					<td class="player-correct-response">1</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Wilder -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ana -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Mitch -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jaden -->
					<td class="answer"><i>Northanger Abbey</i></td>
				</tr>
				<tr>
					<th class="question-number">54</td>
					<td class="player-correct-response">1</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Wilder -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ana -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Kevin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Mitch -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jaden -->
					<td class="answer">thermosphere</td>
				</tr>
				<tr>
					<th class="question-number">55</td>
					<td class="player-correct-response">1</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Wilder -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ana -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Mitch -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jaden -->
					<td class="answer">Croatia (geography)</td>
				</tr>
				<tr>
					<th class="question-number">56</td>
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Wilder -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ana -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Kevin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Mitch -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jaden -->
					<td class="answer">John Llewellyn Lewis</td>
				</tr>
				<tr>
					<th class="question-number">57</td>
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Wilder -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ana -->
					<td class="player-correct-response">1</td><!-- Kevin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Mitch -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jaden -->
					<td class="answer">Sherman Alexie</td>
				</tr>
				<tr>
					<th class="question-number">58</td>
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Wilder -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ana -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Mitch -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jaden -->
					<td class="answer">racemic mixtures</td>
				</tr>
				<tr>
					<th class="question-number">59</td>
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Wilder -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ana -->
					<td class="player-correct-response">1</td><!-- Kevin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Mitch -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jaden -->
					<td class="answer">Set (the god)</td>
				</tr>
				<tr>
					<th class="question-number">60</td>
					<td class="player-correct-response">1</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Matthew -->
					<td class="player-not-in-game">&nbsp;</td><!-- Arjun -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Wilder -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ana -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Mitch -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jaden -->
					<td class="answer">Titian</td>
				</tr>
			</tbody>
			<tfoot>
				<tr class="score-check">
					<th class="score-check-label">Final scores</th>
					<td class="player-score-check">22</td><!-- Ethan -->
					<td class="player-eliminated">eliminated</td><!-- Matthew -->
					<td class="player-eliminated">eliminated</td><!-- Arjun -->
					<td class="player-eliminated">eliminated</td><!-- Aristotle -->
					<td class="player-eliminated">eliminated</td><!-- Wilder -->
					<td class="player-eliminated">eliminated</td><!-- Ana -->
					<td class="player-score-check">14</td><!-- Kevin -->
					<td class="player-eliminated">eliminated</td><!-- Mitch -->
					<td class="player-eliminated">eliminated</td><!-- Jaden -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
			</tfoot>
		</table>
		
		<p>Ethan Strombeck of Auburn High School in Rockford, Illinois is the champion of the 2017 Scobol Solo. He is the fourth player from Auburn to win the tournament, and it is the fifth time an Auburn player has won (Siva Sundaram, 2008; Lloyd Sy, 2009 and 2011; Cole Timmerwilke, 2014).</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
