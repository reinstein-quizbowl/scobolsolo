<%@ page import="com.google.common.collect.SortedSetMultimap" %>
<%@ page import="com.google.common.collect.TreeMultimap" %>
<%@ page import="com.scobolsolo.application.Account" %>
<%@ page import="com.scobolsolo.application.Diff" %>
<%@ page import="com.scobolsolo.application.Placement" %>
<%@ page import="com.scobolsolo.application.PlacementFactory" %>
<%@ page import="com.scobolsolo.application.Question" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="Account Home" />
	<jsp:param name="pageDescription" value="Account Home" />
	<jsp:param name="topMenu" value="<%= Menus.TOURNAMENTS().asTopLevel().output(request, \"account\") %>" />
	<jsp:param name="h1" value="Question Demo" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>The following screen demonstrates what entering one question from a game looks like in our system. Click on a word to represent the fact that a player buzzed on the word, and you then be able to indicate whether the player gave a answer. If you make a mistake, use the <code>Clear</code> button.</p>
		
		<p>When you are using this at the actual tournament, there will be a menu to navigate to an earlier question if necessary, an option to switch the players&#8217; positions, facilities for using replacement questions in case you make a mistake, and sometimes reminders to announce the score.</p>
		
		<p>If you encounter any problems with this demo, please email Jonah Greenthal at <a href="mailto:jonah@jonahgreenthal.com">jonah@jonahgreenthal.com</a>; specify what type of device (computer, tablet, or phone), operating system, and browser (including version) you are using.</p>
		
		<hr />
	</div>
</div>

<div class="row">
	<div class="small-12 columns">
		<p>Every question screen will have this information:</p>
		<p>You are reading a sample round, question&nbsp;#1. On your left is John Smith; on your right is Jane Doe.</p>
		<p>The score going into this question is John Smith 0, Jane Doe 0.</p>
	</div>
</div>

<div class="row">
	<div class="small-12 columns"><%
		
		Placement lclBasePL = PlacementFactory.getInstance().forId(2374); // 2016 Solo packet 1, question 1
		Diff lclDiff = lclBasePL.getQuestion().getCurrentDiff();
		
		%><p class="question-text"><%= Question.outputTextHTML(lclDiff, Question.SHOW_BUZZ_LINKS | Question.SHOW_PRONUNCIATION_GUIDES) %></p>
		
		<p class="question-answer"><%= Question.outputAnswerHTML(lclDiff, true) %></p>
	</div>
</div>
<div class="row">
	<div class="small-12 columns">
		<button class="disabled button" id="continueButton" disabled="disabled" onclick="goOn()">Continue&hellip; (n/a for demo)</button>
		<button class="button" id="clearButton" onclick="clearResponses()">Clear</button>
	</div>
</div>

<div id="buzzMenuContainer"></div>

<script>
	var lclOriginalData = {
		'game_id': 0,
		'replacement': false,
		'overtime': false,
		'index': 0,
		'base_placement_id': <%= lclBasePL.getId() %>,
		'replacement_placement_id': null,
		'diff_id': <%= lclDiff.getId() %>,
		'left': {
			'player_id': 0,
			'name': 'John Smith',
			'buzzed': false
		},
		'right': {
			'player_id': 0,
			'name': 'Jane Doe',
			'buzzed': false
		}
	};
	
	function cloneData(argData) {
		return JSON.parse(JSON.stringify(argData));
	}
	
	var lclData = cloneData(lclOriginalData);
</script>

<jsp:include page="/template/footer.jsp">
	<jsp:param name="loadScript" value="/game/response.js" />
</jsp:include>
