<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="Instructions" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2016()).asTopLevel().output(request, \"home\") %>" />
	<jsp:param name="h1" value="Instructions" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>Thanks for staffing Scobol Solo!</p>
		
		<h2>Before the tournament</h2>
		<p>If you staffed last year, you already have one, though you might have forgotten your password. Regardless, your username is in the form <code>john.smith</code>, and &mdash; unless you staffed last year and remember your password &mdash; you should <a href="/password-reset/">set your password</a> before the tournament. After that, go to <a href="/account/">your preferences page</a>, where, if you want, you can configure your pronunciation guide preferences (e.g. don't show me pronunciation guides in physics questions). <strong>Please make sure you set your password and log in before the tournament!</strong> If you have any problems, reply to this message.</p>
		
		
		<hr />
		<h2>Saturday morning</h2>
		<p>At the beginning of the day, connect to the wireless network <code>NTHS_Guest</code> and read and agree to New Trier's internet use policies. (You might need to re-connect after a few hours.)</p>
		
		<p>When you're ready to start, go to <a href="/game/">scobolsolo.com/game</a> and log in. You will be shown the games you can enter, which in most cases is just one game: the next game assigned to your room.</p>
		
		<p>When both players are in your room, click on that game, and you'll be asked to choose which player is on which side. After that, you'll be shown the questions, one at a time, like this:</p>
		<p data-open="img1"><a href="#"><img src="1-question.png" style="width: 50%;" /></a></p>
		<div class="large reveal" id="img1" data-reveal>
			<img src="1-question.png" style="width: 1208px; max-width: 1208px; height: 658px;" data-close />
		</div>
		
		
		<hr />
		<h2>Reading questions</h2>
		<p>Read each question. When someone buzzes, click (or tap) on the last word you read (even if you only read part of it), and a menu will pop up, like this:</p>

		<p data-open="img2"><a href="#"><img src="2-buzz-menu.png" style="width: 50%;" /></a></p>
		<div class="large reveal" id="img2" data-reveal>
			<img src="2-buzz-menu.png" style="width: 1164px; max-width: 1164px; height: 408px;" data-close />
		</div>
		
		<p>Click the "correct" or "incorrect" button below the name of the player who buzzed, and that fact will be marked. If that was a wrong answer, keep reading the question, and you can again click/tap to record the other player's buzz. Once the buzzes are recorded, the screen will look like this:</p>
		<p data-open="img3"><a href="#"><img src="3-buzzes-recorded.png" style="width: 50%;" /></a></p>
		<div class="large reveal" id="img3" data-reveal>
			<img src="3-buzzes-recorded.png" style="width: 1164px; max-width: 1164px; height: 408px;" data-close />
		</div>
		
		<p>If you make a mistake in terms of what you click, you can click the "Clear" button at the bottom. If you make a mistake in terms of reading the question, in such a way that the question needs to be replaced, you can click the "replace questions" link near "Actions" right above the question. If players want to switch sides, you can click the "switch sides" link next to "Actions" above the question. You can also use the menu above the question to go back or forward to different questions, though it's unusual for that to be a good idea.</p>
		
		<p>After you've finished with a question, click the "Continue&hellip;" button at the bottom. Nothing is saved until you do this, so don't use the list of question numbers to move forward.</p>
		
		<p>Keep reading questions, recording buzzes, and clicking "Continue&hellip;" until the end of the game. At each quarter, you'll be prompted to announce the score. After 20 questions, you'll be walked through overtime if necessary. When the game is over, you'll be shown the final score, and when and where each player plays next (if applicable). You can then go to your next game to enter (again, if applicable).</p>
		
		<hr />
		<h2>Problems</h2>
		<p>There is a rudimentary messaging system built in to the app; you might receive messages from headquarters, and if you have problems or questions, you can click the envelope icon near the top right corner of the screen (it'll open in a new tab) and message Jonah Greenthal. You can also e-mail <a href="mailto:jonah@jonahgreenthal.com">jonah@jonahgreenthal.com</a> or call or text 847-902-4228 at any time for help.</p>
		
		
		<h2>Thanks again!</h2>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />