<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2010" />
	<jsp:param name="pageTitle" value="Championship Match" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2010()).asTopLevel().output(request, \"championship-match\") %>" />
	<jsp:param name="h1" value="Championship Match" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>The participants in the Championship Match are the one player who won all seven preliminary matches (the Morning Champion), the seven players who won exactly six of their preliminary matches, and the (one) player who won the Desperation Shot, a difficult written test taken by all the players who won exactly five of their preliminary matches.</p>
		
		<p>Unlike in the preliminary rounds, all incorrect answers result in a deduction of 1&nbsp;point. This is true regardless of whether the incorrect answer interrupted the question; it is thus different from ordinary "negs".</p>
		
		<p>Each player starts with 3&nbsp;points. A player whose score reaches 0 is immediately removed from the match.</p>
		
		<p>If any player reaches a score of 10 during the first 20&nbsp;tossups, he or she sits out until tossup&nbsp;21.</p>
		
		<p>The Morning Champion sits out for the first 20&nbsp;tossups, and enters at tossup&nbsp;21 with a score equal to that of the leader at that time. After tossup&nbsp;40, the lowest-scoring players are removed until four remain; if necessary, tiebreaker tossups are used, but they do not count in the overall score of the championship match. After tossup&nbsp;50, the lowest-scoring remaining players are eliminated until two remain; the tiebreaker procedure is the same as before. At the conclusion of the match, tiebreaker tossups are read if and as necessary.</p>
		
		<table class="even-spacing unsortable championship-scoresheet">
			<thead>
				<tr class="player-names">
					<th>&nbsp;</th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1216#player_2153">Lloyd Sy</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1232#player_2163">Ben Chametzky</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1226#player_2176">Kevin Malis</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1227#player_2139">Andrew Deveau</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1226#player_2141">Zach Blumenfeld</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1226#player_2388">Jacob Rebnord</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1218#player_2427">Andrew Van Duyn</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1222#player_2131">Andrew Wang</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1215#player_2142">Ben Carbery</a></th>
					<th class="answer" rowspan="2">Answer</th>
				</tr>
				<tr class="player-schools">
					<th>&nbsp;</th>
					<th class="player-school">Auburn (Rockford)</th><!-- Lloyd -->
					<th class="player-school">Carbondale</th><!-- Ben Chametzky -->
					<th class="player-school">Stevenson (Lincolnshire)</th><!-- Kevin -->
					<th class="player-school">St.&nbsp;Ignatius (Chicago)</th><!-- Andrew Deveau -->
					<th class="player-school">Stevenson</th><!-- Zach -->
					<th class="player-school">Stevenson</th><!-- Jacob -->
					<th class="player-school">Culver (Indiana)</th><!-- Andrew Van Duyn -->
					<th class="player-school">New Trier (Winnetka)</th><!-- Andrew Wang -->
					<th class="player-school">Oak Park-River Forest</th><!-- Ben Carbery -->
				</tr>
			</thead>
			<tbody>
				<tr class="score-check">
					<th class="score-check-label">Initial scores</th>
					<td class="player-score-check">3</td><!-- Lloyd -->
					<td class="player-score-check">3</td><!-- Ben Chametzky -->
					<td class="player-score-check">3</td><!-- Kevin -->
					<td class="player-score-check">3</td><!-- Andrew Deveau -->
					<td class="player-score-check">3</td><!-- Zach -->
					<td class="player-score-check">3</td><!-- Jacob -->
					<td class="player-score-check">3</td><!-- Andrew Van Duyn -->
					<td class="player-score-check">3</td><!-- Andrew Wang -->
					<td class="player-score-check">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr>
					<th class="question-number">1</td>
					<td class="player-correct-response">1</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Andrew Deveau -->
					<td class="player-no-response">&nbsp;</td><!-- Zach -->
					<td class="player-no-response">&nbsp;</td><!-- Jacob -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer">Wallace Stevens</td>
				</tr>
				<tr>
					<th class="question-number">2</td>
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-correct-response">1</td><!-- Andrew Deveau -->
					<td class="player-no-response">&nbsp;</td><!-- Zach -->
					<td class="player-no-response">&nbsp;</td><!-- Jacob -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer">George Stokes</td>
				</tr>
				<tr>
					<th class="question-number">3</td>
					<td class="player-incorrect-response">&ndash;1</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-no-response">&nbsp;</td><!-- Zach -->
					<td class="player-no-response">&nbsp;</td><!-- Jacob -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-correct-response">1</td><!-- Andrew Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer">lemniscate</td>
				</tr>
				<tr>
					<th class="question-number">4</td>
					<td class="player-incorrect-response">&ndash;1</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-correct-response">1</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-no-response">&nbsp;</td><!-- Zach -->
					<td class="player-no-response">&nbsp;</td><!-- Jacob -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer">George Soros</td>
				</tr>
				<tr>
					<th class="question-number">5</td>
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-correct-response">1</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-no-response">&nbsp;</td><!-- Zach -->
					<td class="player-no-response">&nbsp;</td><!-- Jacob -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer">Fred Korematsu</td>
				</tr>
				<tr>
					<th class="question-number">6</td>
					<td class="player-correct-response">1</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-no-response">&nbsp;</td><!-- Zach -->
					<td class="player-no-response">&nbsp;</td><!-- Jacob -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer">Joan Mir&oacute;</td>
				</tr>
				<tr>
					<th class="question-number">7</td>
					<td class="player-incorrect-response">&ndash;1</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Zach -->
					<td class="player-no-response">&nbsp;</td><!-- Jacob -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-correct-response">1</td><!-- Andrew Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer">amorphous solids</td>
				</tr>
				<tr>
					<th class="question-number">8</td>
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-correct-response">1</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-no-response">&nbsp;</td><!-- Zach -->
					<td class="player-no-response">&nbsp;</td><!-- Jacob -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer"><i>The Remains of the Day</i></td>
				<tr>
					<th class="question-number">9</td>
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Ben Chametzky -->
					<td class="player-correct-response">1</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-no-response">&nbsp;</td><!-- Zach -->
					<td class="player-no-response">&nbsp;</td><!-- Jacob -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer">Battle of Aegospotami</td>
				</tr>
				<tr>
					<th class="question-number">10</td>
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-correct-response">1</td><!-- Ben Chametzky -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-no-response">&nbsp;</td><!-- Zach -->
					<td class="player-no-response">&nbsp;</td><!-- Jacob -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer">imam</td>
				</tr>
				<tr>
					<th class="question-number">11</td>
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-no-response">&nbsp;</td><!-- Zach -->
					<td class="player-no-response">&nbsp;</td><!-- Jacob -->
					<td class="player-correct-response">1</td><!-- Andrew Van Duyn -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer">quasar</td>
				</tr>
				<tr>
					<th class="question-number">12</td>
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-correct-response">1</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-no-response">&nbsp;</td><!-- Zach -->
					<td class="player-no-response">&nbsp;</td><!-- Jacob -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer">Wassily Kandinsky</td>
				</tr>
				<tr>
					<th class="question-number">13</td>
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-correct-response">1</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-no-response">&nbsp;</td><!-- Zach -->
					<td class="player-no-response">&nbsp;</td><!-- Jacob -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer"><i>Cry, the Beloved Country</i></td>
				</tr>
				<tr>
					<th class="question-number">14</td>
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-correct-response">1</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-no-response">&nbsp;</td><!-- Zach -->
					<td class="player-no-response">&nbsp;</td><!-- Jacob -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer">positivism</td>
				</tr>
				<tr>
					<th class="question-number">15</td>
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-correct-response">1</td><!-- Andrew Deveau -->
					<td class="player-no-response">&nbsp;</td><!-- Zach -->
					<td class="player-no-response">&nbsp;</td><!-- Jacob -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer">Sinn Fein</td>
				</tr>
				<tr>
					<th class="question-number">16</td>
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-correct-response">1</td><!-- Ben Chametzky -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-no-response">&nbsp;</td><!-- Zach -->
					<td class="player-no-response">&nbsp;</td><!-- Jacob -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer">parallel lines</td>
				</tr>
				<tr>
					<th class="question-number">17</td>
					<td class="player-incorrect-response">&ndash;1</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-correct-response">1</td><!-- Andrew Deveau -->
					<td class="player-no-response">&nbsp;</td><!-- Zach -->
					<td class="player-no-response">&nbsp;</td><!-- Jacob -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer">Bowman's capsule</td>
				</tr>
				<tr>
					<th class="question-number">18</td>
					<td class="player-correct-response">1</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-no-response">&nbsp;</td><!-- Zach -->
					<td class="player-no-response">&nbsp;</td><!-- Jacob -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer"><i>Angels in America</i></td>
				</tr>
				<tr>
					<th class="question-number">19</td>
					<td class="player-correct-response">1</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-no-response">&nbsp;</td><!-- Zach -->
					<td class="player-no-response">&nbsp;</td><!-- Jacob -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer">Anton Bruckner</td>
				</tr>
				<tr>
					<th class="question-number">20</td>
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-correct-response">1</td><!-- Zach -->
					<td class="player-no-response">&nbsp;</td><!-- Jacob -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer">Ecuador</td>
				</tr>
				<tr class="score-check">
					<th class="score-check-label">Scores through 20</th>
					<td class="player-score-check">9</td><!-- Lloyd -->
					<td class="player-score-check">4</td><!-- Ben Chametzky -->
					<td class="player-score-check">9</td><!-- Kevin -->
					<td class="player-score-check">5</td><!-- Andrew Deveau -->
					<td class="player-score-check">3</td><!-- Zach -->
					<td class="player-score-check">3</td><!-- Jacob -->
					<td class="player-score-check">4</td><!-- Andrew Van Duyn -->
					<td class="player-score-check">5</td><!-- Andrew Wang -->
					<td class="player-score-check">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="10" class="note">Ben Carbery, as Morning Champion, entered the game with a score equal to that of the then-leaders, Lloyd Sy and Kevin Malis: 9.</td>
				</tr>
				<tr>
					<th class="question-number">21</td>
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-correct-response">1</td><!-- Andrew Deveau -->
					<td class="player-no-response">&nbsp;</td><!-- Zach -->
					<td class="player-no-response">&nbsp;</td><!-- Jacob -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer">thermite reaction</td>
				</tr>
				<tr>
					<th class="question-number">22</td>
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-no-response">&nbsp;</td><!-- Zach -->
					<td class="player-no-response">&nbsp;</td><!-- Jacob -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-correct-response">1</td><!-- Ben Carbery -->
					<td class="answer"><i>Timon of Athens</i></td>
				</tr>
				<tr>
					<th class="question-number">23</td>
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-correct-response">1</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-no-response">&nbsp;</td><!-- Zach -->
					<td class="player-no-response">&nbsp;</td><!-- Jacob -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer">Samuel Barber</td>
				</tr>
				<tr>
					<th class="question-number">24</td>
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-correct-response">1</td><!-- Andrew Deveau -->
					<td class="player-no-response">&nbsp;</td><!-- Zach -->
					<td class="player-no-response">&nbsp;</td><!-- Jacob -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer">transitive property</td>
				</tr>
				<tr>
					<th class="question-number">25</td>
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-no-response">&nbsp;</td><!-- Zach -->
					<td class="player-no-response">&nbsp;</td><!-- Jacob -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-correct-response">1</td><!-- Ben Carbery -->
					<td class="answer">Battle of Fredericksburg</td>
				</tr>
				<tr>
					<th class="question-number">26</td>
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-correct-response">1</td><!-- Andrew Deveau -->
					<td class="player-no-response">&nbsp;</td><!-- Zach -->
					<td class="player-no-response">&nbsp;</td><!-- Jacob -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer">electroweak unification</td>
				</tr>
				<tr>
					<th class="question-number">27</td>
					<td class="player-correct-response">1</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-no-response">&nbsp;</td><!-- Zach -->
					<td class="player-no-response">&nbsp;</td><!-- Jacob -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer">"Ode to a Nightingale"</td>
				</tr>
				<tr>
					<th class="question-number">28</td>
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-correct-response">1</td><!-- Andrew Deveau -->
					<td class="player-no-response">&nbsp;</td><!-- Zach -->
					<td class="player-no-response">&nbsp;</td><!-- Jacob -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer">Poisson distribution</td>
				</tr>
				<tr>
					<th class="question-number">29</td>
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-correct-response">1</td><!-- Andrew Deveau -->
					<td class="player-no-response">&nbsp;</td><!-- Zach -->
					<td class="player-no-response">&nbsp;</td><!-- Jacob -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer">Entente Cordiale</td>
				</tr>
				<tr>
					<th class="question-number">30</td>
					<td class="player-incorrect-response">&ndash;1</td><!-- Lloyd -->
					<td class="player-correct-response">1</td><!-- Ben Chametzky -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-no-response">&nbsp;</td><!-- Zach -->
					<td class="player-no-response">&nbsp;</td><!-- Jacob -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer"><i>The Tales of Hoffmann</td>
				</tr>
				<tr>
					<th class="question-number">31</td>
					<td class="player-correct-response">1</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-no-response">&nbsp;</td><!-- Zach -->
					<td class="player-no-response">&nbsp;</td><!-- Jacob -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer"><i>The Libation Bearers</i></td>
				</tr>
				<tr>
					<th class="question-number">32</td>
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-no-response">&nbsp;</td><!-- Zach -->
					<td class="player-no-response">&nbsp;</td><!-- Jacob -->
					<td class="player-correct-response">1</td><!-- Andrew Van Duyn -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer">Cherokee nation</td>
				</tr>
				<tr>
					<th class="question-number">33</td>
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-correct-response">1</td><!-- Ben Chametzky -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Andrew Deveau -->
					<td class="player-no-response">&nbsp;</td><!-- Zach -->
					<td class="player-no-response">&nbsp;</td><!-- Jacob -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer">endospore</td>
				</tr>
				<tr>
					<th class="question-number">34</td>
					<td class="player-correct-response">1</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-no-response">&nbsp;</td><!-- Zach -->
					<td class="player-no-response">&nbsp;</td><!-- Jacob -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer"><i>Meditations on First Philosophy</i></td>
				</tr>
				<tr>
					<th class="question-number">35</td>
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-no-response">&nbsp;</td><!-- Zach -->
					<td class="player-no-response">&nbsp;</td><!-- Jacob -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-correct-response">1</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer">"Rabbit" Angstrom</td>
				</tr>
				<tr>
					<th class="question-number">36</td>
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-correct-response">1</td><!-- Zach -->
					<td class="player-no-response">&nbsp;</td><!-- Jacob -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer">Mauritania</td>
				</tr>
				<tr>
					<th class="question-number">37</td>
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-no-response">&nbsp;</td><!-- Zach -->
					<td class="player-no-response">&nbsp;</td><!-- Jacob -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-correct-response">1</td><!-- Ben Carbery -->
					<td class="answer">Alexander&nbsp;I of Russia</td>
				</tr>
				<tr>
					<th class="question-number">38</td>
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-no-response">&nbsp;</td><!-- Zach -->
					<td class="player-no-response">&nbsp;</td><!-- Jacob -->
					<td class="player-correct-response">1</td><!-- Andrew Van Duyn -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer">Cambrian period</td>
				</tr>
				<tr>
					<th class="question-number">39</td>
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-correct-response">1</td><!-- Ben Chametzky -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-no-response">&nbsp;</td><!-- Zach -->
					<td class="player-no-response">&nbsp;</td><!-- Jacob -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer">Jean-Honor&eacute; Fragonard</td>
				</tr>
				<tr>
					<th class="question-number">40</td>
					<td class="player-no-response">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-no-response">&nbsp;</td><!-- Zach -->
					<td class="player-no-response">&nbsp;</td><!-- Jacob -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer">Inari Okami</td>
				</tr>
				<tr class="score-check">
					<th class="score-check-label">Scores through 40</th>
					<td class="player-score-check">5</td><!-- Lloyd -->
					<td class="player-score-check">7</td><!-- Ben Chametzky -->
					<td class="player-score-check">9</td><!-- Kevin -->
					<td class="player-score-check">9</td><!-- Andrew Deveau -->
					<td class="player-score-check">4</td><!-- Zach -->
					<td class="player-score-check">3</td><!-- Jacob -->
					<td class="player-score-check">6</td><!-- Andrew Van Duyn -->
					<td class="player-score-check">4</td><!-- Andrew Wang -->
					<td class="player-score-check">12</td><!-- Ben Carbery -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="10" class="note">
						The five players with the lowest scores were eliminated: Ben Chametzky, Zach Blumenfeld, Jacob Rebnord, Andrew Van Duyn, and Andrew Wang.
					</td>
				</tr>
				<tr>
					<th class="question-number">41</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-correct-response">1</td><!-- Andrew Deveau -->
					<td class="player-not-in-game">&nbsp;</td><!-- Zach -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jacob -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer">group (algebraic structure)</td>
				</tr>
				<tr>
					<th class="question-number">42</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-correct-response">1</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-not-in-game">&nbsp;</td><!-- Zach -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jacob -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer"><i>Cat on a Hot Tin Roof</i></td>
				</tr>
				<tr>
					<th class="question-number">43</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Lloyd -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Ben Chametzky -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-not-in-game">&nbsp;</td><!-- Zach -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jacob -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Ben Carbery -->
					<td class="answer">thalamus</td>
				</tr>
				<tr>
					<th class="question-number">44</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Lloyd -->
					<td class="player-correct-response">1</td><!-- Ben Chametzky -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-not-in-game">&nbsp;</td><!-- Zach -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jacob -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer">Battle of Manila Bay</td>
				</tr>
				<tr>
					<th class="question-number">45</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-not-in-game">&nbsp;</td><!-- Zach -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jacob -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-correct-response">1</td><!-- Ben Carbery -->
					<td class="answer">James (New Testament common link)</td>
				</tr>
				<tr>
					<th class="question-number">46</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-correct-response">1</td><!-- Kevin -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Andrew Deveau -->
					<td class="player-not-in-game">&nbsp;</td><!-- Zach -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jacob -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Ben Carbery -->
					<td class="answer">Bangladesh (current events)</td>
				</tr>
				<tr>
					<th class="question-number">47</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Andrew Deveau -->
					<td class="player-not-in-game">&nbsp;</td><!-- Zach -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jacob -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer">achromatic lenses</td>
				</tr>
				<tr>
					<th class="question-number">48</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-correct-response">1</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-not-in-game">&nbsp;</td><!-- Zach -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jacob -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer"><i>The Red and the Black</i></td>
				</tr>
				<tr>
					<th class="question-number">49</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-not-in-game">&nbsp;</td><!-- Zach -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jacob -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-correct-response">1</td><!-- Ben Carbery -->
					<td class="answer">Schmalkaldic League</td>
				</tr>
				<tr>
					<th class="question-number">50</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Lloyd -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-correct-response">1</td><!-- Andrew Deveau -->
					<td class="player-not-in-game">&nbsp;</td><!-- Zach -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jacob -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer"><i>The Kiss</i> (art common link)</td>
				</tr>
				<tr class="score-check">
					<th class="score-check-label">Scores through 50</th>
					<td class="player-eliminated">eliminated</td><!-- Lloyd -->
					<td class="player-score-check">7</td><!-- Ben Chametzky -->
					<td class="player-score-check">12</td><!-- Kevin -->
					<td class="player-score-check">8</td><!-- Andrew Deveau -->
					<td class="player-eliminated">eliminated</td><!-- Zach -->
					<td class="player-eliminated">eliminated</td><!-- Jacob -->
					<td class="player-eliminated">eliminated</td><!-- Andrew Van Duyn -->
					<td class="player-eliminated">eliminated</td><!-- Andrew Wang -->
					<td class="player-score-check">12</td><!-- Ben Carbery -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<td>&nbsp;</td>
					<td colspan="10" class="note">
						The two remaining players with the lowest scores were eliminated: Ben Chametzky and Andrew Deveau.
					</td>
				</tr>
				<tr>
					<th class="question-number">51</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-not-in-game">&nbsp;</td><!-- Zach -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jacob -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-correct-response">1</td><!-- Ben Carbery -->
					<td class="answer">William Butler Yeats</td>
				</tr>
				<tr>
					<th class="question-number">52</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-not-in-game">&nbsp;</td><!-- Zach -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jacob -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-correct-response">1</td><!-- Ben Carbery -->
					<td class="answer">Edward Sapir</td>
				</tr>
				<tr>
					<th class="question-number">53</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-not-in-game">&nbsp;</td><!-- Zach -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jacob -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-correct-response">1</td><!-- Ben Carbery -->
					<td class="answer">Menes</td>
				</tr>
				<tr>
					<th class="question-number">54</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-correct-response">1</td><!-- Kevin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-not-in-game">&nbsp;</td><!-- Zach -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jacob -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer">Georg Cantor</td>
				</tr>
				<tr>
					<th class="question-number">55</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-correct-response">1</td><!-- Kevin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-not-in-game">&nbsp;</td><!-- Zach -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jacob -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Ben Carbery -->
					<td class="answer">ductility</td>
				</tr>
				<tr>
					<th class="question-number">56</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-not-in-game">&nbsp;</td><!-- Zach -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jacob -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-correct-response">1</td><!-- Ben Carbery -->
					<td class="answer">Whiskey Rebellion</td>
				</tr>
				<tr>
					<th class="question-number">57</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-correct-response">1</td><!-- Kevin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-not-in-game">&nbsp;</td><!-- Zach -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jacob -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer"><i>The Ambassadors</i></td>
				</tr>
				<tr>
					<th class="question-number">58</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-correct-response">1</td><!-- Kevin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-not-in-game">&nbsp;</td><!-- Zach -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jacob -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer">Samuel Butler</td>
				</tr>
				<tr>
					<th class="question-number">59</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-correct-response">1</td><!-- Kevin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-not-in-game">&nbsp;</td><!-- Zach -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jacob -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer">Dmitri Shostakovich</td>
				</tr>
				<tr>
					<th class="question-number">60</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Lloyd -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben Chametzky -->
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Deveau -->
					<td class="player-not-in-game">&nbsp;</td><!-- Zach -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jacob -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Van Duyn -->
					<td class="player-not-in-game">&nbsp;</td><!-- Andrew Wang -->
					<td class="player-no-response">&nbsp;</td><!-- Ben Carbery -->
					<td class="answer">Dmitri Shostakovich</td>
				</tr>
			</tbody>
			<tfoot>
				<tr class="score-check">
					<th class="score-check-label">Final scores</th>
					<td class="player-eliminated">eliminated</td><!-- Lloyd -->
					<td class="player-eliminated">eliminated</td><!-- Ben Chametzky -->
					<td class="player-score-check">17</td><!-- Kevin -->
					<td class="player-eliminated">eliminated</td><!-- Andrew Deveau -->
					<td class="player-eliminated">eliminated</td><!-- Zach -->
					<td class="player-eliminated">eliminated</td><!-- Jacob -->
					<td class="player-eliminated">eliminated</td><!-- Andrew Van Duyn -->
					<td class="player-eliminated">eliminated</td><!-- Andrew Wang -->
					<td class="player-score-check">15</td><!-- Ben Carbery -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
			</tfoot>
		</table>
		
		<p>Kevin Malis of Stevenson High School in Lincolnshire, Illinois is the champion of the 2010 Scobol Solo. He is the first player from Stevenson to win the tournament.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
