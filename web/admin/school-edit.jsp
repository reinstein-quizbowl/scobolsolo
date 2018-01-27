<%@ page import="com.opal.cma.OpalForm" %>
<%@ page import="com.opal.cma.OpalMainForm" %>
<%@ page import="com.scobolsolo.application.School" %>
<%@ page import="com.scobolsolo.application.SchoolFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.HTMLUtility" %>

<%
OpalMainForm<School> lclOF = OpalForm.create(
	session,
	request,
	"/OpalFormController",
	SchoolFactory.getInstance(),
	"school_id"
);
lclOF.setDeleteURI("/delete-confirmation.jsp?class_name=school");

School lclS = lclOF.getUserFacing();

String lclTitle = lclS == null ? "Create School" : "Edit " + lclS.getName();

%>
<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="<%= lclTitle %>" />
	<jsp:param name="pageDescription" value="<%= lclTitle %>" />
	<jsp:param name="topMenu" value="<%= Menus.ADMIN().asTopLevel().output(request, \"schools\") %>" />
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
			Very short name
			<%= lclOF.text("VeryShortName", 6) %>
		</label>
	</div>
</div>

<div class="row">
	<div class="small-12 columns">
		<label>
			Location
			<%= lclOF.text("Location", 30).style("annotated") %>
			<div class="form-annotation alert-box info">Generally, this is the name of the city the school is in. If the school's name contains the city, leave this blank. If the school is in another state, append a comma, a space, and the name of the state.</div>
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
</div>

<div class="row">
	<div class="small-12 columns">
		<%= lclOF.submit() %> <%= lclOF.delete() %> <%= lclOF.cancel() %>
	</div>
</div>

<%= lclOF.close() %>

<jsp:include page="/template/footer.jsp" />