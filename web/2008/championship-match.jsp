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
	<jsp:param name="tournamentCode" value="2008" />
	<jsp:param name="pageTitle" value="Championship Match" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2008()).asTopLevel().output(request, \"championship-match\") %>" />
	<jsp:param name="h1" value="Championship Match" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>The participants in the Championship Match are the one player who won all seven preliminary matches (the Morning Champion), the seven players who won exactly six of their preliminary matches, and the (one) player who won the Desperation Shot, a difficult written test taken by all the players who won exactly five of their preliminary matches.</p>
		
		<p>Unlike in the preliminary rounds, all incorrect answers result in a deduction of 1&nbsp;point. This is true regardless of whether the incorrect answer interrupted the question; it is thus different from ordinary "negs".</p>
		
		<p>Each player starts with 3&nbsp;points. A player whose score reaches 0 is immediately removed from the match.</p>
		
		<p>If any player reaches a score of 10 during the first 20&nbsp;tossups, he or she sits out until tossup&nbsp;21.</p>
		
		<p>The Morning Champion sits out for the first 20&nbsp;tossups, and enters at tossup&nbsp;21 with a score equal to that of the leader at that time. After tossup&nbsp;40, the lowest-scoring players are removed until four remain; if necessary, tiebreaker tossups are used, but they do not count in the overall score of the championship match. After tossup&nbsp;50, the lowest-scoring remaining players are eliminated until two remain; the tiebreaker procedure is the same as before. At the conclusion of the match, tiebreaker tossups are read if and as necessary.</p>
		
		<p>Questions 1, 21, and 41 are handout questions. Each player can choose whether or not to count each handout. Players who choose to count the handout receive 1&nbsp;point for a completely correct handout, and &ndash;1 point for a handout that is not completely correct.</p>
		
		<table class="even-spacing unsortable championship-scoresheet">
			<thead>
				<tr class="player-names">
					<th>&nbsp;</th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1151#player_1711">Calvin Quilty</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1150#player_1721">Michael Jiang</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1164#player_1750">Alex Cash</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1152#player_1716">Tony Cao</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1157#player_1700">Joe Ahmad</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1170#player_1718">Isa Domin</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1160#player_1694">Krystle Leung</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1149#player_1708">Ben Cohen</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1150#player_1692">Siva Sundaram</a></th>
					<th class="answer" rowspan="2">Answer</th>
				</tr>
				<tr class="player-schools">
					<th>&nbsp;</th>
					<th class="player-school">Bloomington</th><!-- Calvin -->
					<th class="player-school">Auburn (Rockford)</th><!-- Michael -->
					<th class="player-school">Wheaton Warrenville South</th><!-- Alex -->
					<th class="player-school">Carbondale</th><!-- Tony -->
					<th class="player-school">Loyola Academy (Wilmette)</th><!-- Joe -->
					<th class="player-school">Niles North (Skokie)</th><!-- Isa -->
					<th class="player-school">Naperville Central</th><!-- Krystle -->
					<th class="player-school">New Trier (Winnetka)</th><!-- Ben -->
					<th class="player-school">Auburn</th><!-- Siva -->
				</tr>
			</thead>
			<tbody>
				<tr class="score-check">
					<th class="score-check-label">Initial scores</th>
					<td class="player-score-check">3</td><!-- Calvin -->
					<td class="player-score-check">3</td><!-- Michael -->
					<td class="player-score-check">3</td><!-- Alex -->
					<td class="player-score-check">3</td><!-- Tony -->
					<td class="player-score-check">3</td><!-- Joe -->
					<td class="player-score-check">3</td><!-- Isa -->
					<td class="player-score-check">3</td><!-- Krystle -->
					<td class="player-score-check">3</td><!-- Ben -->
					<td class="player-score-check">&nbsp;</td><!-- Siva -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr>
					<th class="question-number">1</td>
					<td class="player-no-response">&nbsp;</td><!-- Calvin -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Krystle -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-not-in-game">&nbsp;</td><!-- Siva -->
					<td class="answer">[Handout]</td>
				</tr>
				<tr>
					<th class="question-number">2</td>
					<td class="player-no-response">&nbsp;</td><!-- Calvin -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Krystle -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-not-in-game">&nbsp;</td><!-- Siva -->
					<td class="answer">Stewart's theorem</td>
				</tr>
				<tr>
					<th class="question-number">3</td>
					<td class="player-no-response">&nbsp;</td><!-- Calvin -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Krystle -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-not-in-game">&nbsp;</td><!-- Siva -->
					<td class="answer"><i>Wide Sargasso Sea</i></td>
				</tr>
				<tr>
					<th class="question-number">4</td>
					<td class="player-no-response">&nbsp;</td><!-- Calvin -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Krystle -->
					<td class="player-correct-response">1</td><!-- Ben -->
					<td class="player-not-in-game">&nbsp;</td><!-- Siva -->
					<td class="answer">Dmitri Medvedev</td>
				</tr>
				<tr>
					<th class="question-number">5</td>
					<td class="player-no-response">&nbsp;</td><!-- Calvin -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Krystle -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-not-in-game">&nbsp;</td><!-- Siva -->
					<td class="answer">sarcoma</td>
				</tr>
				<tr>
					<th class="question-number">6</td>
					<td class="player-no-response">&nbsp;</td><!-- Calvin -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-correct-response">1</td><!-- Krystle -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-not-in-game">&nbsp;</td><!-- Siva -->
					<td class="answer">Vincenzo Bellini</td>
				</tr>
				<tr>
					<th class="question-number">7</td>
					<td class="player-no-response">&nbsp;</td><!-- Calvin -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Krystle -->
					<td class="player-correct-response">1</td><!-- Ben -->
					<td class="player-not-in-game">&nbsp;</td><!-- Siva -->
					<td class="answer">Wilmot Proviso</td>
				</tr>
				<tr>
					<th class="question-number">8</td>
					<td class="player-no-response">&nbsp;</td><!-- Calvin -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Krystle -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-not-in-game">&nbsp;</td><!-- Siva -->
					<td class="answer">Computation: charged particle in cyclotron</td>
				<tr>
					<th class="question-number">9</td>
					<td class="player-no-response">&nbsp;</td><!-- Calvin -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Krystle -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Ben -->
					<td class="player-not-in-game">&nbsp;</td><!-- Siva -->
					<td class="answer">"nominal"</td>
				</tr>
				<tr>
					<th class="question-number">10</td>
					<td class="player-no-response">&nbsp;</td><!-- Calvin -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Krystle -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-not-in-game">&nbsp;</td><!-- Siva -->
					<td class="answer">Ptah</td>
				</tr>
				<tr>
					<th class="question-number">11</td>
					<td class="player-no-response">&nbsp;</td><!-- Calvin -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Krystle -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-not-in-game">&nbsp;</td><!-- Siva -->
					<td class="answer">Francisco Rodriguez</td>
				</tr>
				<tr>
					<th class="question-number">12</td>
					<td class="player-no-response">&nbsp;</td><!-- Calvin -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Krystle -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-not-in-game">&nbsp;</td><!-- Siva -->
					<td class="answer">Computation: area of shape given vertices' coordinates</td>
				</tr>
				<tr>
					<th class="question-number">13</td>
					<td class="player-incorrect-response">&ndash;1</td><!-- Calvin -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Krystle -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-not-in-game">&nbsp;</td><!-- Siva -->
					<td class="answer">Plotinus</td>
				</tr>
				<tr>
					<th class="question-number">14</td>
					<td class="player-no-response">&nbsp;</td><!-- Calvin -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-correct-response">1</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Krystle -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-not-in-game">&nbsp;</td><!-- Siva -->
					<td class="answer">The Miller (<i>Canterbury Tales</i>)</td>
				</tr>
				<tr>
					<th class="question-number">15</td>
					<td class="player-no-response">&nbsp;</td><!-- Calvin -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Krystle -->
					<td class="player-correct-response">1</td><!-- Ben -->
					<td class="player-not-in-game">&nbsp;</td><!-- Siva -->
					<td class="answer">Hokkaido</td>
				</tr>
				<tr>
					<th class="question-number">16</td>
					<td class="player-no-response">&nbsp;</td><!-- Calvin -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Krystle -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-not-in-game">&nbsp;</td><!-- Siva -->
					<td class="answer">Computation: solving an equation with radicals</td>
				</tr>
				<tr>
					<th class="question-number">17</td>
					<td class="player-no-response">&nbsp;</td><!-- Calvin -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Krystle -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-not-in-game">&nbsp;</td><!-- Siva -->
					<td class="answer">Paolo Uccello</td>
				</tr>
				<tr>
					<th class="question-number">18</td>
					<td class="player-no-response">&nbsp;</td><!-- Calvin -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Krystle -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-not-in-game">&nbsp;</td><!-- Siva -->
					<td class="answer">propanol</td>
				</tr>
				<tr>
					<th class="question-number">19</td>
					<td class="player-no-response">&nbsp;</td><!-- Calvin -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-correct-response">1</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Krystle -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-not-in-game">&nbsp;</td><!-- Siva -->
					<td class="answer">Edward Albee</td>
				</tr>
				<tr>
					<th class="question-number">20</td>
					<td class="player-no-response">&nbsp;</td><!-- Calvin -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Krystle -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Ben -->
					<td class="player-not-in-game">&nbsp;</td><!-- Siva -->
					<td class="answer">Battle of Cr&eacute;cy</td>
				</tr>
				<tr class="score-check">
					<th class="score-check-label">Scores through 20</th>
					<td class="player-score-check">2</td><!-- Calvin -->
					<td class="player-score-check">2</td><!-- Michael -->
					<td class="player-score-check">2</td><!-- Alex -->
					<td class="player-score-check">5</td><!-- Tony -->
					<td class="player-score-check">3</td><!-- Joe -->
					<td class="player-score-check">3</td><!-- Isa -->
					<td class="player-score-check">3</td><!-- Krystle -->
					<td class="player-score-check">4</td><!-- Ben -->
					<td class="player-score-check">&nbsp;</td><!-- Siva -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="10" class="note">Siva Sundaram, as Morning Champion, entered the game with a score equal to that of the then-leader, Tony Cao: 5.</td>
				</tr>
				<tr>
					<th class="question-number">21</td>
					<td class="player-no-response">&nbsp;</td><!-- Calvin -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Tony -->
					<td class="player-correct-response">1</td><!-- Joe -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Krystle -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Siva -->
					<td class="answer">[Worksheet]</td>
				</tr>
				<tr>
					<th class="question-number">22</td>
					<td class="player-no-response">&nbsp;</td><!-- Calvin -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Krystle -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-correct-response">1</td><!-- Siva -->
					<td class="answer">Computation: complex numbers</td>
				</tr>
				<tr>
					<th class="question-number">23</td>
					<td class="player-no-response">&nbsp;</td><!-- Calvin -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Krystle -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-correct-response">1</td><!-- Siva -->
					<td class="answer">Mario Vargas Llosa</td>
				</tr>
				<tr>
					<th class="question-number">24</td>
					<td class="player-no-response">&nbsp;</td><!-- Calvin -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Krystle -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Siva -->
					<td class="answer">Kirkuk</td>
				</tr>
				<tr>
					<th class="question-number">25</td>
					<td class="player-no-response">&nbsp;</td><!-- Calvin -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Krystle -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Siva -->
					<td class="answer">apoptosis</td>
				</tr>
				<tr>
					<th class="question-number">26</td>
					<td class="player-no-response">&nbsp;</td><!-- Calvin -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Krystle -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Siva -->
					<td class="answer">Tomaso Albinoni</td>
				</tr>
				<tr>
					<th class="question-number">27</td>
					<td class="player-no-response">&nbsp;</td><!-- Calvin -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Krystle -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-correct-response">1</td><!-- Siva -->
					<td class="answer">Interstate Commerce Commission</td>
				</tr>
				<tr>
					<th class="question-number">28</td>
					<td class="player-no-response">&nbsp;</td><!-- Calvin -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Krystle -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Siva -->
					<td class="answer">Compton effect</td>
				</tr>
				<tr>
					<th class="question-number">29</td>
					<td class="player-no-response">&nbsp;</td><!-- Calvin -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Tony -->
					<td class="player-correct-response">1</td><!-- Joe -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Krystle -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Siva -->
					<td class="answer">dactyl</td>
				</tr>
				<tr>
					<th class="question-number">30</td>
					<td class="player-no-response">&nbsp;</td><!-- Calvin -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Krystle -->
					<td class="player-correct-response">1</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Siva -->
					<td class="answer">Nestor</td>
				</tr>
				<tr>
					<th class="question-number">31</td>
					<td class="player-no-response">&nbsp;</td><!-- Calvin -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Krystle -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Siva -->
					<td class="answer">George Bailey</td>
				</tr>
				<tr>
					<th class="question-number">32</td>
					<td class="player-no-response">&nbsp;</td><!-- Calvin -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Krystle -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-correct-response">1</td><!-- Siva -->
					<td class="answer">Computation: trigonometry in a cube</td>
				</tr>
				<tr>
					<th class="question-number">33</td>
					<td class="player-no-response">&nbsp;</td><!-- Calvin -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Krystle -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-correct-response">1</td><!-- Siva -->
					<td class="answer">George Berkeley</td>
				</tr>
				<tr>
					<th class="question-number">34</td>
					<td class="player-no-response">&nbsp;</td><!-- Calvin -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-correct-response">1</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Krystle -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Siva -->
					<td class="answer">Oliver Goldsmith</td>
				</tr>
				<tr>
					<th class="question-number">35</td>
					<td class="player-no-response">&nbsp;</td><!-- Calvin -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Krystle -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Siva -->
					<td class="answer">albedo</td>
				</tr>
				<tr>
					<th class="question-number">36</td>
					<td class="player-no-response">&nbsp;</td><!-- Calvin -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Krystle -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Siva -->
					<td class="answer">Computation: fitting a cubic equation to points</td>
				</tr>
				<tr>
					<th class="question-number">37</td>
					<td class="player-incorrect-response">&ndash;1</td><!-- Calvin -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Krystle -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Siva -->
					<td class="answer">Jean Arp</td>
				</tr>
				<tr>
					<th class="question-number">38</td>
					<td class="player-no-response">&nbsp;</td><!-- Calvin -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Krystle -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Siva -->
					<td class="answer">Jablonski diagram</td>
				</tr>
				<tr>
					<th class="question-number">39</td>
					<td class="player-no-response">&nbsp;</td><!-- Calvin -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-no-response">&nbsp;</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Krystle -->
					<td class="player-correct-response">1</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Siva -->
					<td class="answer">Bret Harte</td>
				</tr>
				<tr>
					<th class="question-number">40</td>
					<td class="player-no-response">&nbsp;</td><!-- Calvin -->
					<td class="player-no-response">&nbsp;</td><!-- Michael -->
					<td class="player-no-response">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Isa -->
					<td class="player-no-response">&nbsp;</td><!-- Krystle -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Siva -->
					<td class="answer">Akbar</td>
				</tr>
				<tr class="score-check">
					<th class="score-check-label">Scores through 40</th>
					<td class="player-score-check">1</td><!-- Calvin -->
					<td class="player-score-check">2</td><!-- Michael -->
					<td class="player-score-check">2</td><!-- Alex -->
					<td class="player-score-check">6</td><!-- Tony -->
					<td class="player-score-check">5</td><!-- Joe -->
					<td class="player-score-check">2</td><!-- Isa -->
					<td class="player-score-check">3</td><!-- Krystle -->
					<td class="player-score-check">4</td><!-- Ben -->
					<td class="player-score-check">8</td><!-- Siva -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="10" class="note">
						The five players with the lowest scores were eliminated: Calvin Quilty, Michael Jiang, Alex Cash, Isa Domin, and Krystle Leung.
					</td>
				</tr>
				<tr>
					<th class="question-number">41</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Calvin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-not-in-game">&nbsp;</td><!-- Isa -->
					<td class="player-not-in-game">&nbsp;</td><!-- Krystle -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Siva -->
					<td class="answer">[Worksheet]</td>
				</tr>
				<tr>
					<th class="question-number">42</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Calvin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-not-in-game">&nbsp;</td><!-- Isa -->
					<td class="player-not-in-game">&nbsp;</td><!-- Krystle -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Siva -->
					<td class="answer">Computation: probabilities</td>
				</tr>
				<tr>
					<th class="question-number">43</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Calvin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-not-in-game">&nbsp;</td><!-- Isa -->
					<td class="player-not-in-game">&nbsp;</td><!-- Krystle -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-correct-response">1</td><!-- Siva -->
					<td class="answer"><i>Dubliners</i></td>
				</tr>
				<tr>
					<th class="question-number">44</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Calvin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-not-in-game">&nbsp;</td><!-- Isa -->
					<td class="player-not-in-game">&nbsp;</td><!-- Krystle -->
					<td class="player-correct-response">1</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Siva -->
					<td class="answer">David Axelrod</td>
				</tr>
				<tr>
					<th class="question-number">45</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Calvin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-not-in-game">&nbsp;</td><!-- Isa -->
					<td class="player-not-in-game">&nbsp;</td><!-- Krystle -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Siva -->
					<td class="answer">introns</td>
				</tr>
				<tr>
					<th class="question-number">46</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Calvin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Tony -->
					<td class="player-correct-response">1</td><!-- Joe -->
					<td class="player-not-in-game">&nbsp;</td><!-- Isa -->
					<td class="player-not-in-game">&nbsp;</td><!-- Krystle -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Siva -->
					<td class="answer"><i>The Art of Fugue</i></td>
				</tr>
				<tr>
					<th class="question-number">47</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Calvin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-not-in-game">&nbsp;</td><!-- Isa -->
					<td class="player-not-in-game">&nbsp;</td><!-- Krystle -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Siva -->
					<td class="answer"><i>Dartmouth v. Woodward</i></td>
				</tr>
				<tr>
					<th class="question-number">48</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Calvin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-not-in-game">&nbsp;</td><!-- Isa -->
					<td class="player-not-in-game">&nbsp;</td><!-- Krystle -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-correct-response">1</td><!-- Siva -->
					<td class="answer">Gauss's law</td>
				</tr>
				<tr>
					<th class="question-number">49</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Calvin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-no-response">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-not-in-game">&nbsp;</td><!-- Isa -->
					<td class="player-not-in-game">&nbsp;</td><!-- Krystle -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-correct-response">1</td><!-- Siva -->
					<td class="answer">fallacies</td>
				</tr>
				<tr>
					<th class="question-number">50</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Calvin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-correct-response">1</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-not-in-game">&nbsp;</td><!-- Isa -->
					<td class="player-not-in-game">&nbsp;</td><!-- Krystle -->
					<td class="player-no-response">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Siva -->
					<td class="answer">Michael Servetus</td>
				</tr>
				<tr class="score-check">
					<th class="score-check-label">Scores through 50</th>
					<td class="player-eliminated">eliminated</td><!-- Calvin -->
					<td class="player-eliminated">eliminated</td><!-- Michael -->
					<td class="player-eliminated">eliminated</td><!-- Alex -->
					<td class="player-score-check">6</td><!-- Tony -->
					<td class="player-score-check">6</td><!-- Joe -->
					<td class="player-eliminated">eliminated</td><!-- Isa -->
					<td class="player-eliminated">eliminated</td><!-- Krystle -->
					<td class="player-score-check">3</td><!-- Ben -->
					<td class="player-score-check">11</td><!-- Siva -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<td>&nbsp;</td>
					<td colspan="10" class="note">
						The two remaining players with the lowest scores were to be eliminated. Ben Cohen was therefore eliminated. As Tony Cao and Joe Ahmad were tied, a tiebreaker was held to determine which would remain in the game. The first tiebreaker (Amy Lowell) went dead. Joe answered the second one (Laoco&ouml;n) correctly, so Ben was eliminated and Joe continued.
					</td>
				</tr>
				<tr>
					<th class="question-number">51</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Calvin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-not-in-game">&nbsp;</td><!-- Isa -->
					<td class="player-not-in-game">&nbsp;</td><!-- Krystle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Siva -->
					<td class="answer"><i>Tapestry</i> (Carole King album)</td>
				</tr>
				<tr>
					<th class="question-number">52</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Calvin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-not-in-game">&nbsp;</td><!-- Isa -->
					<td class="player-not-in-game">&nbsp;</td><!-- Krystle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Siva -->
					<td class="answer">Computation: vector projection</td>
				</tr>
				<tr>
					<th class="question-number">53</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Calvin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tony -->
					<td class="player-correct-response">1</td><!-- Joe -->
					<td class="player-not-in-game">&nbsp;</td><!-- Isa -->
					<td class="player-not-in-game">&nbsp;</td><!-- Krystle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Siva -->
					<td class="answer">Noam Chomsky</td>
				</tr>
				<tr>
					<th class="question-number">54</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Calvin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-not-in-game">&nbsp;</td><!-- Isa -->
					<td class="player-not-in-game">&nbsp;</td><!-- Krystle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Siva -->
					<td class="answer">"Ode on Melancholy"</td>
				</tr>
				<tr>
					<th class="question-number">55</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Calvin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-not-in-game">&nbsp;</td><!-- Isa -->
					<td class="player-not-in-game">&nbsp;</td><!-- Krystle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-no-response">&nbsp;</td><!-- Siva -->
					<td class="answer">"epoch" (astronomy and geology)</td>
				</tr>
				<tr>
					<th class="question-number">56</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Calvin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-not-in-game">&nbsp;</td><!-- Isa -->
					<td class="player-not-in-game">&nbsp;</td><!-- Krystle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-correct-response">1</td><!-- Siva -->
					<td class="answer">Computation: solving an equation involving fractions</td>
				</tr>
				<tr>
					<th class="question-number">57</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Calvin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-not-in-game">&nbsp;</td><!-- Isa -->
					<td class="player-not-in-game">&nbsp;</td><!-- Krystle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-correct-response">1</td><!-- Siva -->
					<td class="answer">Praxiteles</td>
				</tr>
				<tr>
					<th class="question-number">58</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Calvin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-not-in-game">&nbsp;</td><!-- Isa -->
					<td class="player-not-in-game">&nbsp;</td><!-- Krystle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Siva -->
					<td class="answer">Hund's rule</td>
				</tr>
				<tr>
					<th class="question-number">59</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Calvin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-not-in-game">&nbsp;</td><!-- Isa -->
					<td class="player-not-in-game">&nbsp;</td><!-- Krystle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-incorrect-response">&ndash;1</td><!-- Siva -->
					<td class="answer"><i>Daisy Miller</i></td>
				</tr>
				<tr>
					<th class="question-number">60</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Calvin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Michael -->
					<td class="player-not-in-game">&nbsp;</td><!-- Alex -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tony -->
					<td class="player-no-response">&nbsp;</td><!-- Joe -->
					<td class="player-not-in-game">&nbsp;</td><!-- Isa -->
					<td class="player-not-in-game">&nbsp;</td><!-- Krystle -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ben -->
					<td class="player-correct-response">1</td><!-- Siva -->
					<td class="answer">Porfirio D&iacute;az</td>
				</tr>
			</tbody>
			<tfoot>
				<tr class="score-check">
					<th class="score-check-label">Final scores</th>
					<td class="player-eliminated">eliminated</td><!-- Calvin -->
					<td class="player-eliminated">eliminated</td><!-- Michael -->
					<td class="player-eliminated">eliminated</td><!-- Alex -->
					<td class="player-eliminated">eliminated</td><!-- Tony -->
					<td class="player-score-check">7</td><!-- Joe -->
					<td class="player-eliminated">eliminated</td><!-- Isa -->
					<td class="player-eliminated">eliminated</td><!-- Krystle -->
					<td class="player-eliminated">eliminated</td><!-- Ben -->
					<td class="player-score-check">10</td><!-- Siva -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
			</tfoot>
		</table>
		
		<p>Siva Sundaram of Auburn High School in Rockford, Illinois is the champion of the 2008 Scobol Solo. He is the first player from Auburn to win the tournament.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
