<%@ page import="com.opal.cma.OpalForm" %>
<%@ page import="com.opal.cma.OpalMainForm" %>
<%@ page import="com.scobolsolo.application.Account" %>
<%@ page import="com.scobolsolo.application.AccountFactory" %>
<%@ page import="com.scobolsolo.application.Contact" %>
<%@ page import="com.scobolsolo.application.ContactFactory" %>
<%@ page import="com.scobolsolo.application.Tournament" %>
<%@ page import="com.scobolsolo.opalforms.updater.ContactUpdater" %>
<%@ page import="com.scobolsolo.opalforms.validator.AccountValidator" %>
<%@ page import="com.scobolsolo.opalforms.validator.ContactValidator" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.HTMLUtility" %>
<%@ page import="com.scobolsolo.Utility" %>

<%
OpalMainForm<Contact> lclOF = OpalForm.create(
	session,
	request,
	"/OpalFormController",
	ContactFactory.getInstance(),
	"contact_id"
);
lclOF.setUpdaterClass(ContactUpdater.class);
lclOF.setValidatorClass(ContactValidator.class);
lclOF.setDeleteURI("/delete-confirmation.jsp?class_name=contact");

Contact lclC = lclOF.getUserFacing();

String lclTitle = lclC == null ? "Create Contact" : "Edit " + lclC.getName();

String lclCreateAccountString = request.getParameter("create_account");
boolean lclCreateAccount = lclCreateAccountString == null ? false : Boolean.parseBoolean(lclCreateAccountString);
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="<%= lclTitle %>" />
	<jsp:param name="pageDescription" value="<%= lclTitle %>" />
	<jsp:param name="topMenu" value="<%= Menus.ADMIN().asTopLevel().output(request, \"contacts\") %>" />
	<jsp:param name="h1" value="<%= lclTitle %>" />
</jsp:include>

<%= lclOF.open() %><%

if (lclOF.hasErrors()) {
	%><div class="row columns">
		<p class="form-error-intro">Error:</p>
		<div class="form-errors"><%= lclOF.displayResultOrErrors() %></div>
	</div><%
}

%><div class="row">
	<div class="small-12 medium-6 columns">
		<label>
			Name<%= lclOF.text("Name", 30) %>
		</label>
	</div>
	<div class="small-10 medium-5 columns">
		<label>
			Sort as
			<%= lclOF.text("SortBy", 30).style("annotated") %>
			<div class="form-annotation alert-box info">Generally speaking, this should be in the form "last, first".</div>
		</label>
	</div>
	<div class="small-2 medium-1 columns">
		<label>
			Active?
			<%= HTMLUtility.switchWidget(lclOF, "Active") %>
		</label>
	</div>
</div>

<div class="row">
	<div class="small-12 medium-6 columns">
		<label>
			Email address
			<%= lclOF.email("EmailAddress") %>
		</label>
	</div>
	<div class="small-12 medium-6 columns">
		<label>
			Address
			<%= lclOF.textarea("Address", 60, 3) %>
		</label>
	</div>
</div>

<div class="row">
	<div class="small-12 medium-6 columns">
		<label>
			Advance phone number
			<%= lclOF.phone("AdvancePhone") %>
		</label>
	</div>
	<div class="small-12 medium-6 columns">
		<label>
			Day-of phone number
			<%= lclOF.phone("DayOfPhone") %>
		</label>
	</div>
</div>

<div class="row columns">
	<label>
		Note
		<%= lclOF.textarea("Note", 60, 3) %>
	</label>
</div><%

if (lclOF.alreadyExists()) {
	%><div class="row columns">
		<h2 id="activity">Activity</h2>
		
		<dl>
			<dt>Player at&hellip;</dt>
				<dd><%= lclC.getPlayerSet().isEmpty() ? "None" : Utility.makeList(lclC.getPlayerSet(), argP -> "<a href=\"/tournament/player-edit.jsp?player_id=" + argP.getId() + "\">" + argP.getTournament().getName() + " (for " + argP.getSchoolRegistration().getSchool().getName() + ")</a>") %></dd>
			<dt>Primary contact for&hellip;</dt>
				<dd><%= lclC.getMainSchoolRegistrationSet().isEmpty() ? "None" : Utility.makeList(lclC.getMainSchoolRegistrationSet(), argSR -> "<a href=\"/tournament/school-registration-edit.jsp?school_registration_id=" + argSR.getId() + "\">" + argSR.getSchool().getName() + " at " + argSR.getTournament().getName() + "</a>") %></dd>
			<dt>Staff at&hellip;</dt>
				<dd><%= lclC.getStaffSet().isEmpty() ? "None" : Utility.makeList(lclC.getStaffSet(), argS -> "<a href=\"/tournament/staff-edit.jsp?staff_id=" + argS.getId() + "\">" + argS.getTournament().getName() + "</a>") %></dd>
			<dt>Tournament Director of&hellip;</dt>
				<dd><%= lclC.getTournamentDirectorTournamentSet().isEmpty() ? "None" : Utility.makeList(lclC.getTournamentDirectorTournamentSet(), Tournament::getName) %></dd>
		</dl>
	</div><%
	
	if (lclCreateAccount || lclC.getAccount() != null) {
		OpalForm<Account> lclAOF = lclOF.targetForm("Account", AccountFactory.getInstance());
		lclAOF.setValidatorClass(AccountValidator.class);
		
		%><%= lclAOF.open() %>
		<div class="row columns">
			<h2 id="account">Account</h2>
		</div>
		
		<div class="row">
			<div class="small-12 medium-4 columns">
				<label>
					Username<%
					if (lclAOF.isNew()) {
						%><%= lclAOF.text("Username", 30) %><%
					} else {
						%><%= lclAOF.text("Username", 30).style("annotated") %>
						<div class="form-annotation alert-box warning">Don't change this unless you know what you're doing!</div><%
					}
				%></label>
			</div>
			<div class="small-3 medium-2 columns">
				<label>
					Active?
					<%= HTMLUtility.switchWidget(lclAOF, "Active") %>
				</label>
			</div>
			<div class="small-3 medium-2 columns">
				<label>
					<span class="hide-for-medium">Admin?</span>
					<span class="show-for-medium">Administrator?</span>
					<%= HTMLUtility.switchWidget(lclAOF, "Administrator") %>
				</label>
			</div>
			<div class="small-3 medium-2 columns">
				<label>
					Writer?
					<%= HTMLUtility.switchWidget(lclAOF, "Writer") %>
				</label>
			</div>
			<div class="small-3 medium-2 columns">
				<label>
					<span class="hide-for-medium">Messageable?</span>
					<span class="show-for-medium">Receive Unsolicited Messages?</span>
					<%= HTMLUtility.switchWidget(lclAOF, "CanReceiveUnsolicitedMessages") %>
				</label>
			</div>
		</div><%
		
		if (lclAOF.alreadyExists()) {
			%><div class="row columns">
				<a href="contact-reset-password.jsp?account_id=<%= lclAOF.getUserFacing().getId() %>">Reset password</a>
			</div><%
		}
		
		%><%= lclAOF.close() %><%
	} else {
	%><div class="row columns">
		<h2 id="account">Account</h2>
		<p>This contact does not currently have an account. You may <a href="contact-edit.jsp?contact_id=<%= lclC.getId() %>&create_account=true">create one</a>.</p>
	</div><%
	}
}

%><div class="row columns">
	<%= lclOF.submit() %> <%= lclOF.delete() %> <%= lclOF.cancel() %>
</div>

<%= lclOF.close() %>

<jsp:include page="/template/footer.jsp" />
