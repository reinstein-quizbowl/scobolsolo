<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.Utility" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="Player Instructions" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2020()).asTopLevel().output(request, \"home\") %>" />
	<jsp:param name="h1" value="Player Instructions" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<section id="intro">
			<p>Thanks for playing Scobol Solo! This tournament will take place on the afternoons of December&nbsp;5 and 12. You are expected to play on both dates — please let us know if you can’t!</p>
		</section>
		
		<section id="before">
			<h2>Before the Tournament</h2>
			
			<div class="alert callout">
				<h5>Read and follow these instructions before the tournament! Seriously!</h5>
			</div>
			
			<p>This tournament will take place on Discord, a communication program and platform. Please <a href="https://discord.com/download">download and install Discord</a> (unless you already have it installed). Don’t use the website client; the audio and video quality are better with the installed application.</p>
			
			<p>After you have installed Discord, <a href="https://discord.gg/7a82hwWnZ4">open this link</a>, and if your browser asks you any questions about whether it’s okay to open that link in Discord, tell it that it’s okay. Press the “Join Scobol Solo” button.</p>
			
			<p>Find your name in the “Online” panel in the upper right. Right-click on your name and choose “Change Nickname”. Set your nickname to your full name <a href="/stats/field.jsp?object=2020">the way it is listed here</a>. If your name is not listed there or you want to be listed differently, write to <a href="mailto:reinsteind@yahoo.com">reinsteind@yahoo.com</a>.</p>
			
			<p><strong>Log on to Discord at 1:00&nbsp;pm sharp each Saturday.</strong> Games won’t start until 1:30, but we really need to make sure everyone is present and solve any technical difficulties so that we can start on time. On December&nbsp;5, you will be done around 5:30&nbsp;pm. On December&nbsp;12, you will be done around 4:00&nbsp;pm unless you are one of the top nine players, in which case you will be done around 5:30&nbsp;pm.</p>
			
			<p>Before playing your first game, go to the <i>#honor-pledge</i> channel, read the honor statement, and send a message indicating that you agree to it (or if you have any concerns about it, talk to us).</p>
			
			<section>
				<h3>Each Game</h3>
				
				<p>Moderators will add you to their rooms (Discord channels) for each game.</p>
				
				<p>The moderator will give you a code for BuzzIn.live, which is the system we use for buzzing in. Go to <a href="https://buzzin.live/play">BuzzIn.live/play</a> and enter that code.</p>
				
				<p>Turn on your video (lower left corner of the voice channel) and make sure you can see the moderator and the other player, and that they can see you.</p>
				
				<p><strong>You must keep (at least) one hand visible at all times when questions are being read.</strong> You may not type anything other than to buzz in, you may not use any other device, and you may not communicate with any other people. These are anti-cheating measures.</p>
			</section>
			
			<section>
				<h3>Tournament Structure and Results</h3>
				
				<p>This tournament uses power-matching, which means you will always play someone who has won the same number of matches as you have won and has lost the same number of matches as you have lost. Therefore, as the tournament goes on, you will play opponents who are generally close to your ability.</p>
				
				<p>You will play four matches on December&nbsp;5 and three matches on December&nbsp;12, plus you will play in the Championship Match on December&nbsp;12 if you do well enough. There are eight rounds on December&nbsp;5 and six rounds on December&nbsp;12, so you will be playing about half the time. Usually you will play every other round, but occasionally you might have two consecutive matches or two consecutive breaks. After each game, the moderator will tell you when your next game is. When you are on a break, you can do whatever you want, but <em>be sure to be on time to your next game</em>. Your next game’s moderator will invite you to their game room (channel) on Discord, but that doesn’t do any good if you’re not at your computer, so be sure to pay attention.</p>
				
				<p>We are tracking the results in detail, including by category. The best players in each category will be recognized. You can keep track of the results at <a href="/2020/">scobolsolo.com/2020</a> — feel free to share that link with your family and friends. The categories are physics, chemistry, biology, mathematics, other science; U.S. history, European history, world history, military history; U.S. literature, British literature, world literature, poetry; painting, instrumental classical music, other fine arts; current events, geography, religion and mythology, and social science and philosophy. There are no computation questions and no bonus questions.</p>
			</section>
		</section>
		
		<hr />
		
		<section id="rules">
			<h2>Rules</h2>
			
			<ul>
				<li>Treat all players, staff, spectators, and others with respect.</li>
				<li>Be prepared to start all games on time.</li>
				<li>If you want your coach to watch a match and you know your coach is available and willing, tell the moderator as soon as you are added to the game room/channel. Coaches can only speak during halftime, and they must do so in the room so that everybody can hear what is said.</li>
				<li>Do not post any information on the internet about any specific question. This includes Facebook, Twitter, fora, and all other media, even if you think the post is private; and includes all forms of information: answers, clues, categories, general descriptions, etc. You can post general information like results and statistics, or feelings about the tournament that do not reveal question content; please use the hashtag “#scobolsolo” on Twitter.</li>
				<li>In every match except the Championship Match, the scoring is simply one point for a correct answer (and no other possible scoring — no powers or interrupt penalties).</li>
				<li>When you buzz in, you have 5&nbsp;seconds to start answering. When a question has been finished, there are 5&nbsp;seconds in which to buzz in; if one player answers incorrectly and the other player has not yet attempted to answer, the 5-second period restarts.</li>
				<li>Each game has 20 regulation tossups; if the game is tied after 20, read tossups until a correct answer is given.</li>
				<li>There are no timeouts. The score will be announced after every 5 tossups. If either player or the moderator wants to take a break for one minute after ten questions, that is allowed.</li>
				<li>If you believe you have or your opponent has been ruled incorrect when you or they should have been ruled correct, or if you believe you have or your opponent has been ruled correct when you or they should have been ruled incorrect, politely inform the moderator that you wish to protest. The tournament director will determine a fair resolution. If you wish to lodge a protest, you must do so before either player has left the room, and both players must stay in the room until the protest is resolved.</li>
				<li>If you are in a location with background noise or if your moderator asks you to, you should mute yourself when questions are being read. You will then need to unmute yourself whenever you give an answer. If both you and your moderator decide that muting is not necessary, then you do not need to mute.</li>
				<li>Nine players will advance to the championship: the one player who finishes the preliminary rounds 7–0, the seven who finish 6–1, and the one with the highest points per tossup heard among the players who finished 5–2.</li>
				<li>If you have any problems, tell a moderator or send a message on Discord to David Reinstein or Jonah Greenthal. You can also email them at <a href="mailto:reinsteind@yahoo.com">reinsteind@yahoo.com</a> and <a href="mailto:jonah@jonahgreenthal.com">jonah@jonahgreenthal.com</a>.</li>
			</ul>
		</section>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
