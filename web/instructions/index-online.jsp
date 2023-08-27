<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.Utility" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="Instructions" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2020()).asTopLevel().output(request, \"home\") %>" />
	<jsp:param name="h1" value="Instructions" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<section id="intro">
			<p>Thanks for working at Scobol Solo!</p>
		</section>
		
		<section id="before">
			<h2>Before the Tournament</h2>
			
			<div class="alert callout">
				<h5>Read and follow these instructions before the tournament! Seriously!</h5>
			</div>
			
			<section>
				<h3>This Website</h3>
				<p>This website (scobolsolo.com) will be used for you to receive the questions, learn what players you should have in your “room” (Discord channel) when, enter results, and tell players where to go next.</p>
				
				<p>You’ll need to set up your scobolsolo.com account. If you have worked at Scobol Solo in the last few years, your username and password are the same; if you’ve forgotten it, you can <a href="/password-reset/">reset it</a>. If you haven’t, we created an account for you; your username is in the form <code>pat.smith</code>, and you should <a href="/password-reset/">set your password</a> before the tournament.</p>
				
				<p>Make sure you can log in: Go to <a href="/account/">your preferences page</a>, which will force you to log in. If you want, you can configure your pronunciation guide preferences (e.g. “don’t show me pronunciation guides in physics questions”). <strong>Please make sure you set your password and log in before the tournament!</strong> If you have any problems, <a href="#problems">contact Jonah Greenthal</a> with the details.</p>
				
				<p>Especially if you’re using a tablet or haven’t worked at Scobol Solo in the last few years, before the tournament you should also go to <a href="/account/question-demo.jsp">the question demo page</a> to make sure that the interface for reading questions and entering answers (described below) works correctly. If you have any problems, <a href="#problems">contact Jonah Greenthal</a> with the details.</p>
			</section>
			
			<section>
				<h3>Discord</h3>
				
				<p>The tournament’s “game rooms” will be channels on Discord, a communication program and platform. To set it up…</p>
				
				<ol>
					<li><a href="https://discord.com/download">Download and install Discord</a> (unless you already have it installed). Don’t use the website client; the audio and video quality are better with the installed application.</li>
					<li>
						Click the <i class="fa fa-cog"></i> button near the lower left to open “User Settings”.
						<ul>
							<li>
								Go to “Voice &amp; Video” and make the following changes:
								<ul>
									<li>Make sure “Input Mode” is set to “Voice Activity”</li>
									<li>Turn “Automatically determine input sensitivity” off</li>
									<li>Drag the slider below “Automatically determine input sensitivity” all the way to the left</li>
								</ul>
							</li>
							<li>Go to “Notifications” and turn “Enable Desktop Notifications” off. (Unless you use Discord for other things and know you want this on. We don’t really care whether you have this on, we’re just suggesting turning it off for the casual Discord user.)</li>
						</ul>
						Now you can press the <i class="fa fa-times-circle"></i> button in the upper right to close “User Settings”.
					</li>
					<li><a href="https://discord.gg/7a82hwWnZ4">Open this link</a>, and if your browser asks you any questions about whether it’s okay to open that link in Discord, tell it that it’s okay. Press the “Join Scobol Solo” button.</li>
					<li>
						Find your name in the “Online” panel in the upper right. Right-click on your name and choose “Change Nickname”. Set your nickname to
						<blockquote><code>Pat Smith (moderator)</code></blockquote>
						except with your full name instead of Pat’s.
					</li>
				</ol>
			</section>
			
			<section>
				<h3>BuzzIn.live</h3>
				
				<p>This tournament will use <a href="https://buzzin.live">BuzzIn.live</a> for players to buzz in. You don’t need to do anything related to this in advance of the tournament, but feel free to play around with the site if you’d like.</p>
			</section>
		</section>
		
		<hr />
		
		<section id="during">
			<h2>During the Tournament</h2>
			
			<section>
				<h3>At the Beginning of Each Day</h3>
				
				<p><a href="/game/">Log in to scobolsolo.com/game</a>. You will be shown the games you can enter, which is usually just one game, namely the next (first) game assigned to your room.</p>
				
				<p>Sign in to Discord. Enter your voice channel (game room).</p>
			</section>
			
			<section>
				<h3>For Each Game</h3>
				
				<p>Once you know who will be playing in your room (from <a href="/game/">scobolsolo.com/game</a>):</p>
				
				<p>In Discord, scroll to the name of your voice channel (<code>room-1-voice</code>, etc.), right-click on its name, and click “Edit Channel”, then “Permissions”. Add both players with the permissions “View Channel”, “Connect”, “Speak”, and “Video”. Be sure to save. Then make sure you’re in your voice channel and your video is on (if it’s not, then on the bottom left click “Video”).</p>
				
				<p>Go to <a href="https://buzzin.live/">BuzzIn.live</a> and…</p>
				<ol>
					<li>Click “Create Game”.</li>
					<li>Click “Create” in the Free Tier panel.</li>
					<li>Tell the players the game code.</li>
				</ol>
				
				<p>Welcome the players and conduct a buzzer check. If a player asks for their coach to be added to the game, do so (the same way you added the players).</p>
				
				<p>Conduct the game, primarily using scobolsolo.com. You’ll need to identify one player as the left player and one as the right player; it doesn’t matter what you choose. <strong>Players are required to keep (at least) one hand visible at all times</strong> and may not type anything other than to buzz. If you are suspicious of anything, or you have any questions at any time, find David Reinstein or Jonah Greenthal in the <code>control-room</code> channel. If you have question feedback, give it in the <code>question-feedback</code> channel.</p>
			
				<p>During the game, you’ll be shown the questions, one at a time, as shown below. There are more details on this further down the page.</p>
				<p data-open="img1"><a href="#"><img src="1-question.png" style="width: 50%;" /></a></p>
				<div class="large reveal" id="img1" data-reveal>
					<img src="1-question.png" style="width: 1182px; max-width: 1182px; height: 648px;" data-close />
				</div>
				
				<p>Don’t forget to clear the buzzer system after each buzz. If the first player to buzz in during the reading of a question is incorrect and the other player also buzzed in, ask the other player if they want to give their answer now or withdraw their buzz to hear more of the question. If you have already read the entire question, then the buzz cannot be withdrawn, so tell the other player they have 5&nbsp;seconds in which to answer.</p>
				
				<p>When the game is over, be sure to tell players when their next game is. Go to “Permissions” for your audio channel and remove both players by clicking the player’s name on the left, scrolling down, and clicking the red “Remove” box on the bottom. Click “End Game” in BuzzIn.live. Then prepare for your next game (if you have one).</p>
			</section>
		</section>
		
		<hr />
		
		<section id="rules">
			<h2>Rules</h2>
			
			<ul>
				<li>Treat all players, staff, spectators, and others with respect.</li>
				<li>Keep matches moving. They are expected to last no more than 25&nbsp;minutes each. Do not waste time between questions, offer your opinions, etc.</li>
				<li>Do not post any information on the internet about any specific question. This includes Facebook, Twitter, fora, and all other media, even if you think the post is private; and includes all forms of information: answers, clues, categories, general descriptions, etc. You can post general information like results and statistics, or feelings about the tournament that do not reveal question content; please use the hashtag “#scobolsolo” on Twitter.</li>
				<li>In every match except the Championship Match, the scoring is simply one point for a correct answer (and no other possible scoring — no powers or interrupt penalties).</li>
				<li>When a player buzzes in, they have 5&nbsp;seconds to start answering. When a question has been finished, there are 5&nbsp;seconds in which to buzz in; if one player answers incorrectly and the other player has not yet attempted to answer, the 5-second period restarts.</li>
				<li>Each game has 20 regulation tossups; if the game is tied after 20, read tossups until a correct answer is given.</li>
				<li>There are no timeouts. The score will be announced after every 5 tossups. If either player or the moderator wants to take a break for one minute after ten questions, that is allowed; during that time, coaches may coach, but everyone must stay in the room so that everyone can hear what is being said.</li>
				<li>If a player protests, make sure you understand all the facts of the protest, and give the information in the control room. Do not attempt to decide a protest on your own. Protests must be lodged before either player has left the room, and both players must stay in the room until the protest is resolved.</li>
				<li>If there is too much background noise from a player’s environment, tell the player to mute themself. The player will have to unmute themself each time they give an answer.</li>
			</ul>
		</section>
		
		<hr />
		
		<section id="reading-questions">
			<h2>Reading Questions</h2>
			
			<p>Read each question as presented on the screen. When someone buzzes, click (or tap) on the last word you read (even if you only read part of it), and a menu will pop up, like this:</p>
	
			<p data-open="img2"><a href="#"><img src="2-buzz-menu.png" style="width: 50%;" /></a></p>
			<div class="large reveal" id="img2" data-reveal>
				<img src="2-buzz-menu.png" style="width: 1169px; max-width: 1169px; height: 376px;" data-close />
			</div>
			
			<p>Click the “correct” or “incorrect” button below the name of the player who buzzed, and that fact will be marked. If that was a wrong answer, keep reading the question, and you can again click/tap to record the other player’s buzz. Once the buzzes are recorded, the screen will look like this:</p>
			<p data-open="img3"><a href="#"><img src="3-buzzes-recorded.png" style="width: 50%;" /></a></p>
			<div class="large reveal" id="img3" data-reveal>
				<img src="3-buzzes-recorded.png" style="width: 1169px; max-width: 1169px; height: 376px;" data-close />
			</div>
			
			<p>If you make a mistake in terms of what you click, you can click the “Clear” button at the bottom. If you make a mistake in terms of reading the question, in such a way that the question needs to be replaced, you can click the “replace questions” link near “Actions” right above the question. You can also use the menu above the question to go back or forward to different questions, though it’s unusual for that to be a good idea.</p>
			
			<p>After you’ve finished with a question, click the “Continue&hellip;” button at the bottom. Nothing is saved until you do this, so don’t use the list of question numbers to move forward.</p>
			
			<p>Keep reading questions, recording buzzes, and clicking “Continue&hellip;” until the end of the game. At each quarter, you’ll be prompted to announce the score. After 20 questions, you’ll be walked through overtime if necessary. When the game is over, you’ll be shown the final score, and when and where each player plays next (if applicable). You can then go to your next game to enter (again, if applicable).</p>
		</section>
		
		<hr />
		
		<section id="questions">
			<h2>Questions/Problems</h2>
			
			<p>If you have any questions or problems, find David Reinstein or Jonah Greenthal in the <code>control-room</code> channel. You can also use the messaging system built into scobolsolo.com, or email them at <a href="mailto:david@reinsteinquizbowl.com">david@reinsteinquizbowl.com</a> and <a href="mailto:jonah@jonahgreenthal.com">jonah@jonahgreenthal.com</a> respectively, but Discord is probably the most convenient method for both you and them.</p>
		</section>
		
		<h2>Thanks again!</h2>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
