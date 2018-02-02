<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2011" />
	<jsp:param name="pageTitle" value="Championship Match" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2011()).asTopLevel().output(request, \"championship-match\") %>" />
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
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1248#player_2143">Nolan Winkler</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1241#player_2152">Lloyd Sy</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1243#player_2174">Srinivas Panchamukhi</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1243#player_2162">Ben Chametzky</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1265#player_2125">Dylan Minarik</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1253#player_2130">Andrew Wang</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1246#player_2275">Webster Guan</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1247#player_2155">Alex Kling</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1266#player_2426">Andrew Van Duyn</a></th>
					<th class="answer" rowspan="2">Answer</th>
				</tr>
				<tr class="player-schools">
					<th>&nbsp;</th>
					<th class="player-school">Loyola Academy (Wilmette)</th><!-- Nolan -->
					<th class="player-school">Auburn (Rockford)</th><!-- Lloyd -->
					<th class="player-school">Carbondale</th><!-- Srinivas -->
					<th class="player-school">Carbondale</th><!-- Ben -->
					<th class="player-school">Belvidere North</th><!-- Cole -->
					<th class="player-school">New Trier (Winnetka)</th><!-- Andrew Wang -->
					<th class="player-school">IMSA (Aurora)</th><!-- Webster -->
					<th class="player-school">Latin School (Chicago)</th><!-- Alex -->
					<th class="player-school">Culver (Indiana)</th><!-- Andrew Van Duyn -->
				</tr>
			</thead>
			<tbody>
				<tr class="score-check">
					<td class="score-check-label">Initial scores</td>
					<td class="player-score-check">&nbsp;</td><!-- Nolan -->
					<td class="player-score-check">3</td><!-- Lloyd -->
					<td class="player-score-check">3</td><!-- Srinivas -->
					<td class="player-score-check">3</td><!-- Ben -->
					<td class="player-score-check">3</td><!-- Dylan -->
					<td class="player-score-check">3</td><!-- Andrew Wang -->
					<td class="player-score-check">3</td><!-- Webster -->
					<td class="player-score-check">3</td><!-- Alex -->
					<td class="player-score-check">3</td><!-- Andrew Van Duyn -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr>
					<td class="question-number">1</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-correct-response">1</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Srinivas -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Webster -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer"><i>Little Dorrit</i></td>
				</tr>
				<tr>
					<td class="question-number">2</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Srinivas -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-correct-response">1</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Webster -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">paraboloid</td>
				</tr>
				<tr>
					<td class="question-number">3</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Srinivas -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-correct-response">1</td><!-- Webster -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">Cooper pair</td>
				</tr>
				<tr>
					<td class="question-number">4</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Srinivas -->
					<td class="player-correct-response">1</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Webster -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">Thebes</td>
				</tr>
				<tr>
					<td class="question-number">5</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Srinivas -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-correct-response">1</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Webster -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Andrew Van Duyn -->
					<td class="answer">Maat</td>
				</tr>
				<tr>
					<td class="question-number">6</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Srinivas -->
					<td class="player-correct-response">1</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Webster -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">Kenya (current events)</td>
				</tr>
				<tr>
					<td class="question-number">7</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Srinivas -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Webster -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-correct-response">1</td><!-- Andrew Van Duyn -->
					<td class="answer"><i>The Master and Margarita</i></td>
				</tr>
				<tr>
					<td class="question-number">8</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Srinivas -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-correct-response">1</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Webster -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">J.&nbsp;S. Mill</td>
				<tr>
					<td class="question-number">9</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Srinivas -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-correct-response">1</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Webster -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">Clarence Gideon (of <i>Gideon v. Wainwright</i>)</td>
				</tr>
				<tr>
					<td class="question-number">10</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Srinivas -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Webster -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Andrew Van Duyn -->
					<td class="answer">chelation</td>
				</tr>
				<tr>
					<td class="question-number">11</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Srinivas -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Ben -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Dylan -->
					<td class="player-correct-response">1</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Webster -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">Myron (sculptor)</td>
				</tr>
				<tr>
					<td class="question-number">12</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Srinivas -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-correct-response">1</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Webster -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">Thomas Bayes</td>
				</tr>
				<tr>
					<td class="question-number">13</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-correct-response">1</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Srinivas -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Webster -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Andrew Van Duyn -->
					<td class="answer">John Dryden</td>
				</tr>
				<tr>
					<td class="question-number">14</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Srinivas -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-correct-response">1</td><!-- Webster -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">ATP synthase</td>
				</tr>
				<tr>
					<td class="question-number">15</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-correct-response">1</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Srinivas -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Webster -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">Etruscan civilization</td>
				</tr>
				<tr>
					<td class="question-number">16</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Srinivas -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-correct-response">1</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Webster -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer"><i>The Gleaners</i></td>
				</tr>
				<tr>
					<td class="question-number">17</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Srinivas -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Webster -->
					<td class="player-correct-response">1</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">Arnold Schoenberg</td>
				</tr>
				<tr>
					<td class="question-number">18</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Srinivas -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Webster -->
					<td class="player-correct-response">1</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer"><i>Main Street</i></td>
				</tr>
				<tr>
					<td class="question-number">19</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Srinivas -->
					<td class="player-correct-response">1</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Webster -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">Alan Turing</td>
				</tr>
				<tr>
					<td class="question-number">20</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Srinivas -->
					<td class="player-correct-response">1</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Webster -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">Chester Nimitz</td>
				</tr>
				<tr class="score-check">
					<td class="score-check-label">Scores through 20</td>
					<td class="player-score-check">&nbsp;</td><!-- Nolan -->
					<td class="player-score-check">5</td><!-- Lloyd -->
					<td class="player-score-check">3</td><!-- Srinivas -->
					<td class="player-score-check">5</td><!-- Ben -->
					<td class="player-score-check">5</td><!-- Dylan -->
					<td class="player-score-check">7</td><!-- Andrew Wang -->
					<td class="player-score-check">4</td><!-- Webster -->
					<td class="player-score-check">5</td><!-- Alex -->
					<td class="player-score-check">1</td><!-- Andrew Van Duyn -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<td>&nbsp;</td>
					<td colspan="10" class="note">Nolan Winkler, as Morning Champion, entered the game with a score equal to that of the then-leader, Andrew Wang: 7.</td>
				</tr>
				<tr>
					<td class="question-number">21</td>
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Srinivas -->
					<td class="player-correct-response">1</td><!-- Ben -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Webster -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">James Frazer</td>
				</tr>
				<tr>
					<td class="question-number">22</td>
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Srinivas -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-correct-response">1</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Webster -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">Battle of Kadesh</td>
				</tr>
				<tr>
					<td class="question-number">23</td>
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-correct-response">1</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Srinivas -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Webster -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">"Thanatopsis"</td>
				</tr>
				<tr>
					<td class="question-number">24</td>
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Srinivas -->
					<td class="player-correct-response">1</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Webster -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">convergent evolution</td>
				</tr>
				<tr>
					<td class="question-number">25</td>
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Srinivas -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Webster -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">Antonio Correggio</td>
				</tr>
				<tr>
					<td class="question-number">26</td>
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-correct-response">1</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Srinivas -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Webster -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">William Styron</td>
				</tr>
				<tr>
					<td class="question-number">27</td>
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Srinivas -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Webster -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">Chebyshev's inequality</td>
				</tr>
				<tr>
					<td class="question-number">28</td>
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-correct-response">1</td><!-- Srinivas -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Webster -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">azide</td>
				</tr>
				<tr>
					<td class="question-number">29</td>
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Srinivas -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Webster -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-correct-response">1</td><!-- Andrew Van Duyn -->
					<td class="answer">Giralamo Savanarola</td>
				</tr>
				<tr>
					<td class="question-number">30</td>
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Srinivas -->
					<td class="player-correct-response">1</td><!-- Ben -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Webster -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">Hungary (geography)</td>
				</tr>
				<tr>
					<td class="question-number">31</td>
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Srinivas -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-correct-response">1</td><!-- Webster -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">incircle</td>
				</tr>
				<tr>
					<td class="question-number">32</td>
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-correct-response">1</td><!-- Srinivas -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Webster -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">Grignard reagent</td>
				</tr>
				<tr>
					<td class="question-number">33</td>
					<td class="player-correct-response">1</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Srinivas -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Webster -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Andrew Van Duyn -->
					<td class="answer">Toyotomi Hideyoshi</td>
				</tr>
				<tr>
					<td class="question-number">34</td>
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Srinivas -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Webster -->
					<td class="player-correct-response">1</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer"><i>Vanity Fair</i></td>
				</tr>
				<tr>
					<td class="question-number">35</td>
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-correct-response">1</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Srinivas -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Webster -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">Sergei Rachmaninoff</td>
				</tr>
				<tr>
					<td class="question-number">36</td>
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Srinivas -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-correct-response">1</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Webster -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">Sons of Liberty</td>
				</tr>
				<tr>
					<td class="question-number">37</td>
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Srinivas -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-correct-response">1</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Webster -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">Oskar Matzerath</td>
				</tr>
				<tr>
					<td class="question-number">38</td>
					<td class="player-incorrect-response">&ndash;1</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Srinivas -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Ben -->
					<td class="player-correct-response">1</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Webster -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">Ishmael (Abrahamic traditions)</td>
				</tr>
				<tr>
					<td class="question-number">39</td>
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-correct-response">1</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Srinivas -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Webster -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer"><i>Lucia di Lammermoor</i></td>
				</tr>
				<tr>
					<td class="question-number">40</td>
					<td class="player-correct-response">1</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Srinivas -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Webster -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">Zeeman effect</td>
				</tr>
				<tr class="score-check">
					<td class="score-check-label">Scores through 40</td>
					<td class="player-score-check">8</td><!-- Nolan -->
					<td class="player-score-check">8</td><!-- Lloyd -->
					<td class="player-score-check">5</td><!-- Srinivas -->
					<td class="player-score-check">6</td><!-- Ben -->
					<td class="player-score-check">7</td><!-- Dylan -->
					<td class="player-score-check">7</td><!-- Andrew Wang -->
					<td class="player-score-check">4</td><!-- Webster -->
					<td class="player-score-check">4</td><!-- Alex -->
					<td class="player-score-check">1</td><!-- Andrew Van Duyn -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<td>&nbsp;</td>
					<td colspan="10" class="note">
						The five players with the lowest scores were eliminated: Srinivas Panchamukhi, Ben Chametzky, Webster Guan, Alex Kling, and Andrew Van Duyn.
					</td>
				</tr>
				<tr>
					<td class="question-number">41</td>
					<td class="player-correct-response">1</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Srinivas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Andrew Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Webster -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">catenary</td>
				</tr>
				<tr>
					<td class="question-number">42</td>
					<td class="player-incorrect-response">&ndash;1</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Srinivas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Webster -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">John Lewis</td>
				</tr>
				<tr>
					<td class="question-number">43</td>
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-correct-response">1</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Srinivas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Webster -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">Charles V of Spain</td>
				</tr>
				<tr>
					<td class="question-number">44</td>
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-correct-response">1</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Srinivas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Webster -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer"><i>Wuthering Heights</i></td>
				</tr>
				<tr>
					<td class="question-number">45</td>
					<td class="player-incorrect-response">&ndash;1</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Srinivas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-correct-response">1</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Webster -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">Linus Pauling</td>
				</tr>
				<tr>
					<td class="question-number">46</td>
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Srinivas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-correct-response">1</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Webster -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">"F&uuml;r Elise"</td>
				</tr>
				<tr>
					<td class="question-number">47</td>
					<td class="player-correct-response">1</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Srinivas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Webster -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">Webster-Ashburton treaty</td>
				</tr>
				<tr>
					<td class="question-number">48</td>
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Srinivas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-correct-response">1</td><!-- Andrew Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Webster -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">conservative forces/fields</td>
				</tr>
				<tr>
					<td class="question-number">49</td>
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-correct-response">1</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Srinivas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Webster -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">Christopher Wren</td>
				</tr>
				<tr>
					<td class="question-number">50</td>
					<td class="player-no-response">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Srinivas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-correct-response">1</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Webster -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer"><i>Light in August</i></td>
				</tr>
				<tr class="score-check">
					<td class="score-check-label">Scores through 50</td>
					<td class="player-score-check">8</td><!-- Nolan -->
					<td class="player-score-check">11</td><!-- Lloyd -->
					<td class="player-eliminated">eliminated</td><!-- Srinivas -->
					<td class="player-eliminated">eliminated</td><!-- Ben -->
					<td class="player-score-check">9</td><!-- Dylan -->
					<td class="player-score-check">7</td><!-- Andrew Wang -->
					<td class="player-eliminated">eliminated</td><!-- Webster -->
					<td class="player-eliminated">eliminated</td><!-- Alex -->
					<td class="player-eliminated">eliminated</td><!-- Andrew Van Duyn -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<td>&nbsp;</td>
					<td colspan="10" class="note">
						The two players with the lowest scores were eliminated: Nolan Winkler and Andrew Wang.
					</td>
				</tr>
				<tr>
					<td class="question-number">51</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-correct-response">1</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Srinivas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Webster -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">War of the Triple Alliance</td>
				</tr>
				<tr>
					<td class="question-number">52</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-correct-response">1</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Srinivas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Webster -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">Paul Klee</td>
				</tr>
				<tr>
					<td class="question-number">53</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-correct-response">1</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Srinivas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Webster -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">endosymbiotic theory</td>
				</tr>
				<tr>
					<td class="question-number">54</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-correct-response">1</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Srinivas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Webster -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer"><i>In Memoriam A.&nbsp;H.&nbsp;H.</i></td>
				</tr>
				<tr>
					<td class="question-number">55</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-correct-response">1</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Srinivas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Webster -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">Heimdall</td>
				</tr>
				<tr>
					<td class="question-number">56</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-correct-response">1</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Srinivas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Webster -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">Franz Boas</td>
				</tr>
				<tr>
					<td class="question-number">57</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Srinivas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Webster -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">Henri Poincar&eacute;</td>
				</tr>
				<tr>
					<td class="question-number">58</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-correct-response">1</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Srinivas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Webster -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">Lima, Peru (history)</td>
				</tr>
				<tr>
					<td class="question-number">59</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-correct-response">1</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Srinivas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Webster -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">cosmic microwave background radiation</td>
				</tr>
				<tr>
					<td class="question-number">60</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Nolan -->
					<td class="player-correct-response">1</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Srinivas -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Webster -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="answer">August Strindberg</td>
				</tr>
			</tbody>
			<tfoot>
				<tr class="score-check">
					<td class="score-check-label">Scores through 60</td>
					<td class="player-eliminated">eliminated</td><!-- Nolan -->
					<td class="player-score-check">20</td><!-- Lloyd -->
					<td class="player-eliminated">eliminated</td><!-- Srinivas -->
					<td class="player-eliminated">eliminated</td><!-- Ben -->
					<td class="player-score-check">8</td><!-- Dylan -->
					<td class="player-eliminated">eliminated</td><!-- Andrew Wang -->
					<td class="player-eliminated">eliminated</td><!-- Webster -->
					<td class="player-eliminated">eliminated</td><!-- Alex -->
					<td class="player-eliminated">eliminated</td><!-- Andrew Van Duyn -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
			</tfoot>
		</table>
		
		<p>Lloyd Sy of Auburn High School (Rockford) is the champion of the 2011 Scobol Solo. It is his second time winning the tournament (<a href="/2009/">2009</a>) and he is the second player from Auburn to win (Siva Sundaram, <a href="/2008/">2008</a>).</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
