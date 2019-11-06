<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.Utility" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="Instructions" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2019()).asTopLevel().output(request, \"home\") %>" />
	<jsp:param name="h1" value="Instructions" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<section id="intro">
			<p>Thanks for working at Scobol Solo!</p>
		</section>
		
		<section id="before">
			<h2>Before the tournament</h2>
			
			<p>You’ll need to set up your account. If you have worked at Scobol Solo in the last few years, your username and password are the same; if you’ve forgotten it, you can <a href="/password-reset/">reset it</a>. If you didn’t, your username is in the form <code>pat.smith</code>, and you should <a href="/password-reset/">set your password</a> before the tournament.</p>
			
			<p>Make sure you can log in: Go to <a href="/account/">your preferences page</a>, which will force you to log in. If you want, you can configure your pronunciation guide preferences (e.g. “don’t show me pronunciation guides in physics questions”). <strong>Please make sure you set your password and log in before the tournament!</strong> If you have any problems, <a href="#problems">contact Jonah Greenthal</a> with the details.</p>
			
			<p>Especially if you’re using a tablet or haven’t worked at Scobol Solo in the last few years, before the tournament you should also go to <a href="/account/question-demo.jsp">the
			question demo page</a> to make sure that the interface for reading questions and entering answers (described below) works correctly. If you have any problems, <a href="#problems">contact Jonah Greenthal</a> with the details.</p>
		</section>
		
		<hr />
		
		<section id="saturday-morning">
		<h2>Saturday morning</h2>
			<p>At the beginning of the day, connect to the wireless network <code>NTHS_Guest</code> and read and agree to New Trier’s internet use policies. (You might need to re-connect every few hours. If you’re using a laptop provided by New Trier, you might not need to do this.)</p>
			
			<p>When you’re ready to start, go to <a href="/game/">scobolsolo.com/game</a> and log in. You will be shown the games you can enter, which in most cases is just one game: the next game assigned to your room.</p>
			
			<p>When both players are in your room, click on that game, and you’ll be asked to choose which player is on which side. After that, you’ll be shown the questions, one at a time, like this:</p>
			<p data-open="img1"><a href="#"><img src="1-question.png" style="width: 50%;" /></a></p>
			<div class="large reveal" id="img1" data-reveal>
				<img src="1-question.png" style="width: 1182px; max-width: 1182px; height: 648px;" data-close />
			</div>
		</section>
		
		<hr />
		
		<section id="reading-questions">
			<h2>Reading questions</h2>
			<p>Read each question. When someone buzzes, click (or tap) on the last word you read (even if you only read part of it), and a menu will pop up, like this:</p>
	
			<p data-open="img2"><a href="#"><img src="2-buzz-menu.png" style="width: 50%;" /></a></p>
			<div class="large reveal" id="img2" data-reveal>
				<img src="2-buzz-menu.png" style="width: 1169px; max-width: 1169px; height: 376px;" data-close />
			</div>
			
			<p>Click the “correct” or “incorrect” button below the name of the player who buzzed, and that fact will be marked. If that was a wrong answer, keep reading the question, and you can again click/tap to record the other player’s buzz. Once the buzzes are recorded, the screen will look like this:</p>
			<p data-open="img3"><a href="#"><img src="3-buzzes-recorded.png" style="width: 50%;" /></a></p>
			<div class="large reveal" id="img3" data-reveal>
				<img src="3-buzzes-recorded.png" style="width: 1169px; max-width: 1169px; height: 376px;" data-close />
			</div>
			
			<p>If you make a mistake in terms of what you click, you can click the “Clear” button at the bottom. If you make a mistake in terms of reading the question, in such a way that the question needs to be replaced, you can click the “replace questions” link near “Actions” right above the question. If players want to switch sides, you can click the “switch sides” link next to “Actions” above the question. You can also use the menu above the question to go back or forward to different questions, though it’s unusual for that to be a good idea.</p>
			
			<p>After you’ve finished with a question, click the “Continue&hellip;” button at the bottom. Nothing is saved until you do this, so don’t use the list of question numbers to move forward.</p>
			
			<p>Keep reading questions, recording buzzes, and clicking “Continue&hellip;” until the end of the game. At each quarter, you’ll be prompted to announce the score. After 20 questions, you’ll be walked through overtime if necessary. When the game is over, you’ll be shown the final score, and when and where each player plays next (if applicable). You can then go to your next game to enter (again, if applicable).</p>
		</section>
		
		<hr />
		
		<section id="problems">
			<h2>Problems</h2>
			<p>There is a rudimentary messaging system built in to the app; you might receive messages from headquarters, and if you have problems or questions, you can click the envelope icon near the top right corner of the screen (it’ll open in a new tab) and message Jonah Greenthal. You can also e-mail <a href="mailto:jonah@jonahgreenthal.com">jonah@jonahgreenthal.com</a> or call or text 847-902-4228 at any time for help.</p>
		</section>
		
		<h2>Thanks again!</h2>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
