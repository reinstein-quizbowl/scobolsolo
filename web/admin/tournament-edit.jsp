<%@ page import="com.opal.cma.OpalForm" %>
<%@ page import="com.opal.cma.OpalMainForm" %>
<%@ page import="com.scobolsolo.application.Contact" %>
<%@ page import="com.scobolsolo.application.ContactFactory" %>
<%@ page import="com.scobolsolo.application.Room" %>
<%@ page import="com.scobolsolo.application.School" %>
<%@ page import="com.scobolsolo.application.Tournament" %>
<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.opalforms.updater.TournamentUpdater" %>
<%@ page import="com.scobolsolo.HTMLUtility" %>

<%
OpalMainForm<Tournament> lclOF = OpalForm.create(
	session,
	request,
	"/OpalFormController",
	TournamentFactory.getInstance().forUniqueString(request.getParameter("object")),
	TournamentFactory.getInstance()
);
lclOF.setUpdaterClass(TournamentUpdater.class);
lclOF.setDeleteURI("/delete-confirmation.jsp?class_name=tournament");

Tournament lclT = lclOF.getUserFacing();
if (lclT != null) {
	lclOF.disable("Code");
}

String lclTitle = lclT == null ? "Create Tournament" : "Edit " + lclT.getName();

%>
<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="<%= lclTitle %>" />
	<jsp:param name="pageDescription" value="<%= lclTitle %>" />
	<jsp:param name="topMenu" value="<%= Menus.ADMIN().asTopLevel().output(request, \"tournaments\") %>" />
	<jsp:param name="h1" value="<%= lclTitle %>" />
</jsp:include>

<%= lclOF.open() %><%
if (lclOF.hasErrors()) {
	%><div class="row">
		<div class="small-12 columns">
			<p class="form-error-intro">Error:</p>
			<div class="form-errors"><%= lclOF.displayResultOrErrors() %></div>
		</div>
	</div><%
}

%><div class="row">
	<div class="small-12 medium-6 large-4 columns">
		<label>
			Name
			<%= lclOF.text("Name", 30) %>
		</label>
	</div>
	<div class="small-12 medium-6 large-4 columns">
		<label>
			Short name
			<%= lclOF.text("ShortName", 10) %>
		</label>
	</div>
	<div class="small-12 medium-6 large-4 columns">
		<label>
			Code
			<%= lclOF.text("Code", 10) %>
		</label>
	</div>
	
	<div class="small-12 medium-6 large-4 columns">
		<label>
			Date
			<%= lclOF.date("Date") %>
		</label>
	</div>
	<div class="small-12 medium-6 large-4 columns">
		<label>
			Site
			<%= lclOF.dropdown("SiteSchool", School.NameComparator.getInstance()) %>
		</label>
	</div>
	<div class="small-12 medium-6 large-4 columns">
		<label>
			Tournament director
			<%= lclOF.dropdown("TournamentDirectorContact", Contact.NameComparator.getInstance()).filter(Contact::isActive) %>
		</label>
	</div>
	
	<div class="small-12 medium-6 large-4 columns">
		<label>
			Home page
			<%= lclOF.text("Url", 60) %>
		</label>
	</div>
	<div class="small-12 medium-6 large-4 columns">
		<label>
			Championship match page
			<%= lclOF.text("ChampionshipMatchUrl", 60) %>
		</label>
	</div>
	<div class="small-12 medium-6 large-4 columns">
		<label>
			Question download URL
			<%= lclOF.text("QuestionDownloadUrl", 60) %>
		</label>
	</div>
	
	<div class="small-12 medium-6 large-4 columns">
		<label>
			Control room
			<%= lclOF.<Room>dropdown("ControlRoom").filter(argR -> argR == null || argR.getTournament() == lclT) %>
		</label>
	</div>
	<div class="small-12 medium-6 large-2 columns">
		<label>
			Registration open?
			<%= HTMLUtility.switchWidget(lclOF, "RegistrationOpen") %>
		</label>
	</div>
	<div class="small-12 medium-6 large-2 columns">
		<label>
			Is tiebreaker sudden death?
			<%= HTMLUtility.switchWidget(lclOF, "TiebreakerSuddenDeath") %>
		</label>
	</div>
	<div class="small-12 medium-6 large-2 columns">
		<label>
			Questions complete?
			<%= HTMLUtility.switchWidget(lclOF, "QuestionsComplete") %>
		</label>
	</div>
	<div class="small-12 medium-6 large-2 columns">
		<label>
			Online stats?
			<%= HTMLUtility.switchWidget(lclOF, "OnlineStats") %>
		</label>
	</div>
</div>

<div class="row">
	<div class="small-12 columns">
		<label>
			School message (use raw LaTeX)
			<%= lclOF.textarea("SchoolMessage", 120, 16) %>
		</label>
	</div>
</div>

<div class="row">
	<div class="small-12 columns">
		<label>
			Player message (use raw LaTeX)
			<%= lclOF.textarea("PlayerMessage", 120, 16) %>
		</label>
	</div>
</div>

<div class="row">
	<div class="small-12 columns">
		<label>
			Staff message (use raw LaTeX)
			<%= lclOF.textarea("StaffMessage", 120, 16) %>
		</label>
	</div>
</div>

<div class="row">
	<div class="small-12 columns">
		<label>
			Championship rules (use raw LaTeX)
			<%= lclOF.textarea("ChampionshipRules", 120, 16) %>
		</label>
	</div>
</div>

<div class="row">
	<div class="small-12 columns">
		<label>
			Replacement question social media policy (use raw LaTeX)
			<%= lclOF.textarea("ReplacementQuestionSocialMediaPolicy", 120, 3) %>
		</label>
	</div>
</div>

<div class="row">
	<div class="small-12 columns">
		<%= lclOF.submit() %> <%= lclOF.delete() %> <%= lclOF.cancel() %>
	</div>
</div>

<%= lclOF.close() %>

<jsp:include page="/template/footer.jsp" />