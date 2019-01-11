<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2013" />
	<jsp:param name="pageTitle" value="Championship Match" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2013()).asTopLevel().output(request, \"championship-match\") %>" />
	<jsp:param name="h1" value="Championship Match" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>The participants in the Championship Match are the one player who won all seven preliminary matches (the Morning Champion), the seven players who won exactly six of their preliminary matches, and the (one) player who had the highest points per tossup heard among those who won exactly five of their preliminary matches.</p>
		
		<p>Unlike in the preliminary rounds, all incorrect answers result in a deduction of 1&nbsp;point. This is true regardless of whether the incorrect answer interrupted the question; it is thus different from ordinary “negs”.</p>
		
		<p>Each player starts with 3&nbsp;points. A player whose score reaches 0 is immediately removed from the match.</p>
		
		<p>If any player reaches a score of 10 during the first 20&nbsp;tossups, he or she sits out until tossup&nbsp;21.</p>
		
		<p>The Morning Champion sits out for the first 20&nbsp;tossups, and enters at tossup&nbsp;21 with a score equal to that of the leader at that time. After tossup&nbsp;40, the lowest-scoring players are removed until four remain; if necessary, tiebreaker tossups are used, but they do not count in the overall score of the championship match. After tossup&nbsp;50, the lowest-scoring remaining players are eliminated until two remain; the tiebreaker procedure is the same as before. At the conclusion of the match, tiebreaker tossups are read if and as necessary.</p>
		
		<table class="even-spacing unsortable championship-scoresheet">
			<thead>
				<tr class="player-names">
					<th>&nbsp;</th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=">Jason Asher</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=">Alston Boyd</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=">Maia Karpovich</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=">Greg Krzywicki</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=">Jeeho Lee</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=">Evan Pandya</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=">Pranav Sivakumar</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=">Prerak Trivedi</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=">James Zetterman</a></th>
					<th class="answer" rowspan="2">Answer</th>
				</tr>
				<tr class="player-schools">
					<th>&nbsp;</th>
					<th class="player-school">Stevenson (Lincolnshire)</th><!-- Jason -->
					<th class="player-school">Bloomington</th><!-- Alston -->
					<th class="player-school">IMSA (Aurora)</th><!-- Maia -->
					<th class="player-school">Fenton (Bensenville)</th><!-- Greg -->
					<th class="player-school">Stevenson</th><!-- Jeeho -->
					<th class="player-school">Auburn (Rockford)</th><!-- Evan -->
					<th class="player-school">Barrington</th><!-- Pranav -->
					<th class="player-school">Carbondale</th><!-- Prerak -->
					<th class="player-school">Carbondale</th><!-- James -->
				</tr>
			</thead>
			<tbody>
				<tr class="score-check">
					<td class="score-check-label">Initial scores</td>
					<td class="player-score-check">&nbsp;</td><!-- Jason -->
					<td class="player-score-check">3</td><!-- Alston -->
					<td class="player-score-check">3</td><!-- Maia -->
					<td class="player-score-check">3</td><!-- Greg -->
					<td class="player-score-check">3</td><!-- Jeeho -->
					<td class="player-score-check">3</td><!-- Evan -->
					<td class="player-score-check">3</td><!-- Pranav -->
					<td class="player-score-check">3</td><!-- Prerak -->
					<td class="player-score-check">3</td><!-- James -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr>
					<td class="question-number">1</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jason -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-correct-response">1</td><!-- Maia -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Jeeho -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-no-response">&nbsp;</td><!-- Prerak -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">Lindsey Graham</td>
				</tr>
				<tr>
					<td class="question-number">2</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jason -->
					<td class="player-correct-response">1</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Maia -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Jeeho -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-no-response">&nbsp;</td><!-- Prerak -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">Great Northern War</td>
				</tr>
				<tr>
					<td class="question-number">3</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jason -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Maia -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Jeeho -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-no-response">&nbsp;</td><!-- Prerak -->
					<td class="player-correct-response">1</td><!-- James -->
					<td class="answer">John Constable</td>
				</tr>
				<tr>
					<td class="question-number">4</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jason -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-correct-response">1</td><!-- Maia -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Jeeho -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-no-response">&nbsp;</td><!-- Prerak -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">Bulgaria</td>
				</tr>
				<tr>
					<td class="question-number">5</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jason -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Maia -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Jeeho -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-correct-response">1</td><!-- Prerak -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">phospholipid</td>
				</tr>
				<tr>
					<td class="question-number">6</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jason -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Maia -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-correct-response">1</td><!-- Jeeho -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-no-response">&nbsp;</td><!-- Prerak -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">ester</td>
				</tr>
				<tr>
					<td class="question-number">7</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jason -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Maia -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Jeeho -->
					<td class="player-correct-response">1</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Prerak -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">Zeeman effect</td>
				</tr>
				<tr>
					<td class="question-number">8</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jason -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Maia -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Jeeho -->
					<td class="player-correct-response">1</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-no-response">&nbsp;</td><!-- Prerak -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">J.&nbsp;M. Coetzee</td>
				<tr>
					<td class="question-number">9</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jason -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Maia -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Jeeho -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-no-response">&nbsp;</td><!-- Prerak -->
					<td class="player-correct-response">1</td><!-- James -->
					<td class="answer"><i>Summa Theologica</i></td>
				</tr>
				<tr>
					<td class="question-number">10</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jason -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Maia -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Jeeho -->
					<td class="player-correct-response">1</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-no-response">&nbsp;</td><!-- Prerak -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">Rainer Maria Rilke</td>
				</tr>
				<tr>
					<td class="question-number">11</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jason -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Maia -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Jeeho -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-correct-response">1</td><!-- Prerak -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">migration</td>
				</tr>
				<tr>
					<td class="question-number">12</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jason -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Maia -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Jeeho -->
					<td class="player-correct-response">1</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-no-response">&nbsp;</td><!-- Prerak -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer"><i>Vanity Fair</i></td>
				</tr>
				<tr>
					<td class="question-number">13</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jason -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Maia -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Jeeho -->
					<td class="player-correct-response">1</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-no-response">&nbsp;</td><!-- Prerak -->
					<td class="player-incorrect-response">&ndash;1</td><!-- James -->
					<td class="answer">Arnold Schoenberg</td>
				</tr>
				<tr>
					<td class="question-number">14</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jason -->
					<td class="player-correct-response">1</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Maia -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Jeeho -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-no-response">&nbsp;</td><!-- Prerak -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer"><i>The Glass Menagerie</i></td>
				</tr>
				<tr>
					<td class="question-number">15</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jason -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Maia -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-correct-response">1</td><!-- Jeeho -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-no-response">&nbsp;</td><!-- Prerak -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">orthogonality</td>
				</tr>
				<tr>
					<td class="question-number">16</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jason -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Maia -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Jeeho -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-no-response">&nbsp;</td><!-- Prerak -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">HMS <i>Gasp&eacute;e</i></td>
				</tr>
				<tr>
					<td class="question-number">17</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jason -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Maia -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-correct-response">1</td><!-- Jeeho -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-no-response">&nbsp;</td><!-- Prerak -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">Brasilia</td>
				</tr>
				<tr>
					<td class="question-number">18</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jason -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Maia -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Jeeho -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-correct-response">1</td><!-- Pranav -->
					<td class="player-no-response">&nbsp;</td><!-- Prerak -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">Madagascar</td>
				</tr>
				<tr>
					<td class="question-number">19</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jason -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Maia -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Jeeho -->
					<td class="player-correct-response">1</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-no-response">&nbsp;</td><!-- Prerak -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">Fionn mac&nbsp;Cumhaill</td>
				</tr>
				<tr>
					<td class="question-number">20</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jason -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Alston -->
					<td class="player-correct-response">1</td><!-- Maia -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Jeeho -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Prerak -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">Zhou Enlai</td>
				</tr>
				<tr class="score-check">
					<td class="score-check-label">Scores through 20</td>
					<td class="player-score-check">&nbsp;</td><!-- Jason -->
					<td class="player-score-check">4</td><!-- Alston -->
					<td class="player-score-check">6</td><!-- Maia -->
					<td class="player-score-check">3</td><!-- Greg -->
					<td class="player-score-check">6</td><!-- Jeeho -->
					<td class="player-score-check">9</td><!-- Evan -->
					<td class="player-score-check">4</td><!-- Pranav -->
					<td class="player-score-check">3</td><!-- Prerak -->
					<td class="player-score-check">4</td><!-- James -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<td>&nbsp;</td>
					<td colspan="10" class="note">Jason Asher, as Morning Champion, entered the game with a score equal to that of the then-leader, Evan Pandya: 9.</td>
				</tr>
				<tr>
					<td class="question-number">21</td>
					<td class="player-no-response">&nbsp;</td><!-- Jason -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-correct-response">1</td><!-- Maia -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Jeeho -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-no-response">&nbsp;</td><!-- Prerak -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">Sam Rayburn</td>
				</tr>
				<tr>
					<td class="question-number">22</td>
					<td class="player-correct-response">1</td><!-- Jason -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Maia -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Jeeho -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-no-response">&nbsp;</td><!-- Prerak -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">W.&nbsp;H. Auden</td>
				</tr>
				<tr>
					<td class="question-number">23</td>
					<td class="player-no-response">&nbsp;</td><!-- Jason -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-correct-response">1</td><!-- Maia -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Jeeho -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-no-response">&nbsp;</td><!-- Prerak -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">William Rowan Hamilton</td>
				</tr>
				<tr>
					<td class="question-number">24</td>
					<td class="player-no-response">&nbsp;</td><!-- Jason -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-correct-response">1</td><!-- Maia -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Jeeho -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-no-response">&nbsp;</td><!-- Prerak -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">Hall effect</td>
				</tr>
				<tr>
					<td class="question-number">25</td>
					<td class="player-no-response">&nbsp;</td><!-- Jason -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-correct-response">1</td><!-- Maia -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Jeeho -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-no-response">&nbsp;</td><!-- Prerak -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer"><i>Pictures at an Exhibition</i></td>
				</tr>
				<tr>
					<td class="question-number">26</td>
					<td class="player-no-response">&nbsp;</td><!-- Jason -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Maia -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Jeeho -->
					<td class="player-correct-response">1</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-no-response">&nbsp;</td><!-- Prerak -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer"><i>An Enemy of the People</i></td>
				</tr>
				<tr>
					<td class="question-number">27</td>
					<td class="player-no-response">&nbsp;</td><!-- Jason -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-correct-response">1</td><!-- Maia -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Jeeho -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-no-response">&nbsp;</td><!-- Prerak -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">Isaiah</td>
				</tr>
				<tr>
					<td class="question-number">28</td>
					<td class="player-no-response">&nbsp;</td><!-- Jason -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-correct-response">1</td><!-- Maia -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Jeeho -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-no-response">&nbsp;</td><!-- Prerak -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">Louis Agassiz</td>
				</tr>
				<tr>
					<td class="question-number">29</td>
					<td class="player-no-response">&nbsp;</td><!-- Jason -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Maia -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Jeeho -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-correct-response">1</td><!-- Pranav -->
					<td class="player-no-response">&nbsp;</td><!-- Prerak -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">Battle of Manila Bay</td>
				</tr>
				<tr>
					<td class="question-number">30</td>
					<td class="player-no-response">&nbsp;</td><!-- Jason -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-correct-response">1</td><!-- Maia -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Jeeho -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-no-response">&nbsp;</td><!-- Prerak -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">Mali</td>
				</tr>
				<tr>
					<td class="question-number">31</td>
					<td class="player-incorrect-response">&ndash;1</td><!-- Jason -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Maia -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Jeeho -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-correct-response">1</td><!-- Prerak -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">Clausius-Clapeyron equation</td>
				</tr>
				<tr>
					<td class="question-number">32</td>
					<td class="player-correct-response">1</td><!-- Jason -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Maia -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Jeeho -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-no-response">&nbsp;</td><!-- Prerak -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">Ben Jonson</td>
				</tr>
				<tr>
					<td class="question-number">33</td>
					<td class="player-correct-response">1</td><!-- Jason -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Maia -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Jeeho -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-no-response">&nbsp;</td><!-- Prerak -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">John Singleton Copley</td>
				</tr>
				<tr>
					<td class="question-number">34</td>
					<td class="player-no-response">&nbsp;</td><!-- Jason -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-correct-response">1</td><!-- Maia -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Jeeho -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-no-response">&nbsp;</td><!-- Prerak -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">epigenetics</td>
				</tr>
				<tr>
					<td class="question-number">35</td>
					<td class="player-no-response">&nbsp;</td><!-- Jason -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Maia -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Jeeho -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-no-response">&nbsp;</td><!-- Prerak -->
					<td class="player-correct-response">1</td><!-- James -->
					<td class="answer">Decembrist Revolt</td>
				</tr>
				<tr>
					<td class="question-number">36</td>
					<td class="player-no-response">&nbsp;</td><!-- Jason -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Maia -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Jeeho -->
					<td class="player-correct-response">1</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-no-response">&nbsp;</td><!-- Prerak -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">Jules Massenet</td>
				</tr>
				<tr>
					<td class="question-number">37</td>
					<td class="player-correct-response">1</td><!-- Jason -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Maia -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Jeeho -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-no-response">&nbsp;</td><!-- Prerak -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">Jean Piaget</td>
				</tr>
				<tr>
					<td class="question-number">38</td>
					<td class="player-no-response">&nbsp;</td><!-- Jason -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Maia -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Jeeho -->
					<td class="player-correct-response">1</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-no-response">&nbsp;</td><!-- Prerak -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">Vandals</td>
				</tr>
				<tr>
					<td class="question-number">39</td>
					<td class="player-no-response">&nbsp;</td><!-- Jason -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Maia -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Jeeho -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-correct-response">1</td><!-- Pranav -->
					<td class="player-no-response">&nbsp;</td><!-- Prerak -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer">Turkmenistan</td>
				</tr>
				<tr>
					<td class="question-number">40</td>
					<td class="player-correct-response">1</td><!-- Jason -->
					<td class="player-no-response">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Maia -->
					<td class="player-no-response">&nbsp;</td><!-- Greg -->
					<td class="player-no-response">&nbsp;</td><!-- Jeeho -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-no-response">&nbsp;</td><!-- Prerak -->
					<td class="player-no-response">&nbsp;</td><!-- James -->
					<td class="answer"><i>My &Aacute;ntonia</i></td>
				</tr>
				<tr class="score-check">
					<td class="score-check-label">Scores through 40</td>
					<td class="player-score-check">13</td><!-- Jason -->
					<td class="player-score-check">4</td><!-- Alston -->
					<td class="player-score-check">14</td><!-- Maia -->
					<td class="player-score-check">2</td><!-- Greg -->
					<td class="player-score-check">6</td><!-- Jeeho -->
					<td class="player-score-check">12</td><!-- Evan -->
					<td class="player-score-check">6</td><!-- Pranav -->
					<td class="player-score-check">4</td><!-- Prerak -->
					<td class="player-score-check">5</td><!-- James -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<td>&nbsp;</td>
					<td colspan="10" class="note">
						The five players with the lowest scores were to be eliminated. Alston Boyd, Greg Krzywicki, Prerak Trivedi, and James Zetterman were therefore eliminated. A tiebreaker was held between Jeeho Lee and Pranav Sivakumar to determine who would remain. Pranav won, so Jeeho was eliminated.
					</td>
				</tr>
				<tr>
					<td class="question-number">41</td>
					<td class="player-incorrect-response">&ndash;1</td><!-- Jason -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alston -->
					<td class="player-correct-response">1</td><!-- Maia -->
					<td class="player-not-in-game">&nbsp;</td><!-- Greg -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jeeho -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-not-in-game">&nbsp;</td><!-- Prerak -->
					<td class="player-not-in-game">&nbsp;</td><!-- James -->
					<td class="answer"><i>Rosencrantz and Guildenstern Are Dead</i></td>
				</tr>
				<tr>
					<td class="question-number">42</td>
					<td class="player-no-response">&nbsp;</td><!-- Jason -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Maia -->
					<td class="player-not-in-game">&nbsp;</td><!-- Greg -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jeeho -->
					<td class="player-correct-response">1</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-not-in-game">&nbsp;</td><!-- Prerak -->
					<td class="player-not-in-game">&nbsp;</td><!-- James -->
					<td class="answer">Krishna</td>
				</tr>
				<tr>
					<td class="question-number">43</td>
					<td class="player-correct-response">1</td><!-- Jason -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Maia -->
					<td class="player-not-in-game">&nbsp;</td><!-- Greg -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jeeho -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-not-in-game">&nbsp;</td><!-- Prerak -->
					<td class="player-not-in-game">&nbsp;</td><!-- James -->
					<td class="answer">Mary, Queen of Scots</td>
				</tr>
				<tr>
					<td class="question-number">44</td>
					<td class="player-no-response">&nbsp;</td><!-- Jason -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Maia -->
					<td class="player-not-in-game">&nbsp;</td><!-- Greg -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jeeho -->
					<td class="player-correct-response">1</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-not-in-game">&nbsp;</td><!-- Prerak -->
					<td class="player-not-in-game">&nbsp;</td><!-- James -->
					<td class="answer">telomeres</td>
				</tr>
				<tr>
					<td class="question-number">45</td>
					<td class="player-correct-response">1</td><!-- Jason -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Maia -->
					<td class="player-not-in-game">&nbsp;</td><!-- Greg -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jeeho -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-not-in-game">&nbsp;</td><!-- Prerak -->
					<td class="player-not-in-game">&nbsp;</td><!-- James -->
					<td class="answer">Jackson Pollock</td>
				</tr>
				<tr>
					<td class="question-number">46</td>
					<td class="player-no-response">&nbsp;</td><!-- Jason -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alston -->
					<td class="player-correct-response">1</td><!-- Maia -->
					<td class="player-not-in-game">&nbsp;</td><!-- Greg -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jeeho -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-not-in-game">&nbsp;</td><!-- Prerak -->
					<td class="player-not-in-game">&nbsp;</td><!-- James -->
					<td class="answer">node (wave)</td>
				</tr>
				<tr>
					<td class="question-number">47</td>
					<td class="player-correct-response">1</td><!-- Jason -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Maia -->
					<td class="player-not-in-game">&nbsp;</td><!-- Greg -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jeeho -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-not-in-game">&nbsp;</td><!-- Prerak -->
					<td class="player-not-in-game">&nbsp;</td><!-- James -->
					<td class="answer">Winter War</td>
				</tr>
				<tr>
					<td class="question-number">48</td>
					<td class="player-no-response">&nbsp;</td><!-- Jason -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Maia -->
					<td class="player-not-in-game">&nbsp;</td><!-- Greg -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jeeho -->
					<td class="player-correct-response">1</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-not-in-game">&nbsp;</td><!-- Prerak -->
					<td class="player-not-in-game">&nbsp;</td><!-- James -->
					<td class="answer">Frederic Remington</td>
				</tr>
				<tr>
					<td class="question-number">49</td>
					<td class="player-no-response">&nbsp;</td><!-- Jason -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alston -->
					<td class="player-correct-response">1</td><!-- Maia -->
					<td class="player-not-in-game">&nbsp;</td><!-- Greg -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jeeho -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-not-in-game">&nbsp;</td><!-- Prerak -->
					<td class="player-not-in-game">&nbsp;</td><!-- James -->
					<td class="answer">Greenpeace</td>
				</tr>
				<tr>
					<td class="question-number">50</td>
					<td class="player-no-response">&nbsp;</td><!-- Jason -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Maia -->
					<td class="player-not-in-game">&nbsp;</td><!-- Greg -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jeeho -->
					<td class="player-correct-response">1</td><!-- Evan -->
					<td class="player-no-response">&nbsp;</td><!-- Pranav -->
					<td class="player-not-in-game">&nbsp;</td><!-- Prerak -->
					<td class="player-not-in-game">&nbsp;</td><!-- James -->
					<td class="answer"><i>The Jungle</i></td>
				</tr>
				<tr class="score-check">
					<td class="score-check-label">Scores through 50</td>
					<td class="player-score-check">15</td><!-- Jason -->
					<td class="player-eliminated">eliminated</td><!-- Alston -->
					<td class="player-score-check">17</td><!-- Maia -->
					<td class="player-eliminated">eliminated</td><!-- Greg -->
					<td class="player-eliminated">eliminated</td><!-- Jeeho -->
					<td class="player-score-check">15</td><!-- Evan -->
					<td class="player-score-check">6</td><!-- Pranav -->
					<td class="player-eliminated">eliminated</td><!-- Prerak -->
					<td class="player-eliminated">eliminated</td><!-- James -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<td>&nbsp;</td>
					<td colspan="10" class="note">
						The two players with the lowest scores were to be eliminated. Pranav Sivakumar was therefore eliminated. A tiebreaker was held between Jason Asher and Evan Pandya; Evan won and therefore survived, while Jason was eliminated.
					</td>
				</tr>
				<tr>
					<td class="question-number">51</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jason -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alston -->
					<td class="player-correct-response">1</td><!-- Maia -->
					<td class="player-not-in-game">&nbsp;</td><!-- Greg -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jeeho -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Pranav -->
					<td class="player-not-in-game">&nbsp;</td><!-- Prerak -->
					<td class="player-not-in-game">&nbsp;</td><!-- James -->
					<td class="answer">Pedro Cabral</td>
				</tr>
				<tr>
					<td class="question-number">52</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jason -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alston -->
					<td class="player-correct-response">1</td><!-- Maia -->
					<td class="player-not-in-game">&nbsp;</td><!-- Greg -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jeeho -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Pranav -->
					<td class="player-not-in-game">&nbsp;</td><!-- Prerak -->
					<td class="player-not-in-game">&nbsp;</td><!-- James -->
					<td class="answer">epicureanism</td>
				</tr>
				<tr>
					<td class="question-number">53</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jason -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Maia -->
					<td class="player-not-in-game">&nbsp;</td><!-- Greg -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jeeho -->
					<td class="player-correct-response">1</td><!-- Evan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Pranav -->
					<td class="player-not-in-game">&nbsp;</td><!-- Prerak -->
					<td class="player-not-in-game">&nbsp;</td><!-- James -->
					<td class="answer">Gibbs free energy</td>
				</tr>
				<tr>
					<td class="question-number">54</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jason -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Maia -->
					<td class="player-not-in-game">&nbsp;</td><!-- Greg -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jeeho -->
					<td class="player-correct-response">1</td><!-- Evan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Pranav -->
					<td class="player-not-in-game">&nbsp;</td><!-- Prerak -->
					<td class="player-not-in-game">&nbsp;</td><!-- James -->
					<td class="answer"><i>Crime and Punishment</i></td>
				</tr>
				<tr>
					<td class="question-number">55</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jason -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Maia -->
					<td class="player-not-in-game">&nbsp;</td><!-- Greg -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jeeho -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Evan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Pranav -->
					<td class="player-not-in-game">&nbsp;</td><!-- Prerak -->
					<td class="player-not-in-game">&nbsp;</td><!-- James -->
					<td class="answer">Taft-Hartley Act</td>
				</tr>
				<tr>
					<td class="question-number">56</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jason -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alston -->
					<td class="player-correct-response">1</td><!-- Maia -->
					<td class="player-not-in-game">&nbsp;</td><!-- Greg -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jeeho -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Pranav -->
					<td class="player-not-in-game">&nbsp;</td><!-- Prerak -->
					<td class="player-not-in-game">&nbsp;</td><!-- James -->
					<td class="answer">kite (geometric figure)</td>
				</tr>
				<tr>
					<td class="question-number">57</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jason -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Maia -->
					<td class="player-not-in-game">&nbsp;</td><!-- Greg -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jeeho -->
					<td class="player-correct-response">1</td><!-- Evan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Pranav -->
					<td class="player-not-in-game">&nbsp;</td><!-- Prerak -->
					<td class="player-not-in-game">&nbsp;</td><!-- James -->
					<td class="answer">Charles Baudelaire</td>
				</tr>
				<tr>
					<td class="question-number">58</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jason -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alston -->
					<td class="player-correct-response">1</td><!-- Maia -->
					<td class="player-not-in-game">&nbsp;</td><!-- Greg -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jeeho -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Pranav -->
					<td class="player-not-in-game">&nbsp;</td><!-- Prerak -->
					<td class="player-not-in-game">&nbsp;</td><!-- James -->
					<td class="answer">colon (computer science)</td>
				</tr>
				<tr>
					<td class="question-number">59</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jason -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alston -->
					<td class="player-no-response">&nbsp;</td><!-- Maia -->
					<td class="player-not-in-game">&nbsp;</td><!-- Greg -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jeeho -->
					<td class="player-correct-response">1</td><!-- Evan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Pranav -->
					<td class="player-not-in-game">&nbsp;</td><!-- Prerak -->
					<td class="player-not-in-game">&nbsp;</td><!-- James -->
					<td class="answer">Samuel Barber</td>
				</tr>
				<tr>
					<td class="question-number">60</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Jason -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alston -->
					<td class="player-correct-response">1</td><!-- Maia -->
					<td class="player-not-in-game">&nbsp;</td><!-- Greg -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jeeho -->
					<td class="player-no-response">&nbsp;</td><!-- Evan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Pranav -->
					<td class="player-not-in-game">&nbsp;</td><!-- Prerak -->
					<td class="player-not-in-game">&nbsp;</td><!-- James -->
					<td class="answer">Latvia (geography)</td>
				</tr>
			</tbody>
			<tfoot>
				<tr class="score-check">
					<td class="score-check-label">Scores through 60</td>
					<td class="player-eliminated">eliminated</td><!-- Jason -->
					<td class="player-eliminated">eliminated</td><!-- Alston -->
					<td class="player-score-check">22</td><!-- Maia -->
					<td class="player-eliminated">eliminated</td><!-- Greg -->
					<td class="player-eliminated">eliminated</td><!-- Jeeho -->
					<td class="player-score-check">18</td><!-- Evan -->
					<td class="player-eliminated">eliminated</td><!-- Pranav -->
					<td class="player-eliminated">eliminated</td><!-- Prerak -->
					<td class="player-eliminated">eliminated</td><!-- James -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
			</tfoot>
		</table>
		
		<p>Maia Karpovich of the Illinois Mathematics and Science Academy (Aurora) is the champion of the 2013 Scobol Solo. She is the first champion from IMSA.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
