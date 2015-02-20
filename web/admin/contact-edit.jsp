<%@ page import="com.opal.cma.OpalForm" %>
<%@ page import="com.opal.cma.OpalMainForm" %>
<%@ page import="com.scobolsolo.application.Account" %>
<%@ page import="com.scobolsolo.application.AccountFactory" %>
<%@ page import="com.scobolsolo.application.Contact" %>
<%@ page import="com.scobolsolo.application.ContactFactory" %>
<%@ page import="com.scobolsolo.opalforms.updater.ContactUpdater" %>
<%@ page import="com.scobolsolo.opalforms.validator.AccountValidator" %>
<%@ page import="com.scobolsolo.opalforms.validator.ContactValidator" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.HTMLUtility" %>

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
	%><div class="row">
		<div class="small-12 columns">
			<p class="form-error-intro">Error:</p>
			<div class="form-errors"><%= lclOF.errors() %></div>
		</div>
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
			Sort by
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
			<%= lclOF.text("EmailAddress", 30) %>
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
			<%= lclOF.text("AdvancePhone", 10) %>
		</label>
	</div>
	<div class="small-12 medium-6 columns">
		<label>
			Day-of phone number
			<%= lclOF.text("DayOfPhone", 10) %>
		</label>
	</div>
</div>

<div class="row">
	<div class="small-12 columns">
		<label>
			Note
			<%= lclOF.textarea("Note", 60, 3) %>
		</label>
	</div>
</div><%

if (lclC != null && (lclCreateAccount || lclC.getAccount() != null)) {
	OpalForm<Account> lclAOF = lclOF.targetForm("Account", AccountFactory.getInstance());
	lclAOF.setValidatorClass(AccountValidator.class);
	
	%><h2 id="account">Account</h2>
	<%= lclAOF.open() %><%
	if (lclAOF.hasErrors()) {
		%><p>Error:</p><%
		%><%= lclAOF.errors() %><%
	}
	
	%><div class="row">
		<div class="small-8 columns">
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
		<div class="small-2 columns">
			<label>
				Active?
				<%= HTMLUtility.switchWidget(lclAOF, "Active") %>
			</label>
		</div>
		<div class="small-2 columns">
			<label>
				<span class="show-for-small-only">Admin?</span>
				<span class="show-for-medium-up">Administrator?</span>
				<%= HTMLUtility.switchWidget(lclAOF, "Administrator") %>
			</label>
		</div>
	</div>
	
	<%= lclAOF.close() %><%
} else if (lclC != null && lclC.getAccount() == null) {
	%><div class="row">
		<div class="small-12 columns">
			<h2 id="account">Account</h2>
			<p>This contact does not currently have an account. You may <a href="contact-edit.jsp?contact_id=<%= lclC.getId() %>&create_account=true">create one</a>.</p>
		</div>
	</div><%
}

%><div class="row">
	<div class="small-12 columns">
		<%= lclOF.submit() %> <%= lclOF.delete() %> <%= lclOF.cancel() %>
	</div>
</div>

<%= lclOF.close() %>

<jsp:include page="/template/footer.jsp" />