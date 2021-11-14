<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.Utility" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="Championship Match" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2021()).asTopLevel().output(request, \"home\") %>" />
	<jsp:param name="h1" value="Championship Match" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<section id="intro">
			<p>The Championship Match consists of 60&nbsp;tossups plus possible tiebreakers.</p>
			
			<p>Unlike in the preliminary rounds, all incorrect answers result in a deduction of 1 point. This is true regardless of whether the incorrect answer interrupted the question; it is thus different from ordinary “negs”.</p>
			
			<p>Each player starts with 3&nbsp;points. A player whose score reaches 0 will immediately be removed from the match.</p>
			
			<p>The match will be played by nine players:</p>
			<ul>
				<li>The player who finishes the preliminary rounds 7–0</li>
				<li>The seven players who finish the preliminary rounds 6–1</li>
				<li id="tiebreaker-criterion">
					The player with the highest points per tossup heard (PPTUH) among the players who finish the preliminary rounds 5–2. If there is a tie:
					<ol>
						<li>The player from that group who took their second loss later/latest will be chosen.</li>
						<li>If that still produces a tie, the remaining player who took their first loss later/latest will be chosen.</li>
						<li>If that still produces a tie, the remaining player whose opponents’ collective PPTUH is highest will be chosen.</li>
						<li>If that still produces a tie, additional tossups will be read to the remaining players. A player who gives a correct answer will advance to the Championship Match, while a player who gives an incorrect answer (at any time) will be eliminated.</li>
					</ol>
				</li>
		</section>
		
		<section id="structure">
			<h2>Structure of the Game</h2>
			
			<section id="i">
				<h3>Phase&nbsp;I: Tossups 1–20</h3>
				
				<p>The player who finished 7–0 in the preliminary rounds will not participate in this phase.</p>
				
				<p>If any player reaches a score of 10 during this phase, they will sit out for the rest of the phase.</p>
			</section>
			
			<section id="ii">
				<h3>Phase&nbsp;II: Tossups 21–40</h3>
				
				<p>The player who finished 7–0 in the preliminary rounds enters at tossup 21 with a score equal to that of the leader(s) at the time. All nine players play during this phase.</p>
			</section>
			
			<section id="iii">
				<h3>Phase&nbsp;III: Tossups 41–50</h3>
				
				<p>The five lowest-scoring players will be eliminated after Question 40. To effect this, tiebreaker tossups will be applied as necessary, but they do not count in the overall score of the championship match. Four players thus remain.</p>
			</section>
			
			<section id="iv">
				<h3>Phase&nbsp;IV: Tossups 51–60</h3>
				
				<p>The two lowest-scoring remaining players will be eliminated after Question 50. The tiebreaker procedure is the same as above. Two players thus remain. At the conclusion of the match, tiebreaker tossups will be read as necessary.</p>
			</section>
		</section>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
