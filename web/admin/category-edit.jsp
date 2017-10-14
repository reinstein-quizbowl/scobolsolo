<%@ page import="com.opal.cma.OpalForm" %>
<%@ page import="com.opal.cma.OpalMainForm" %>
<%@ page import="com.scobolsolo.application.Category" %>
<%@ page import="com.scobolsolo.application.CategoryFactory" %>
<%@ page import="com.scobolsolo.application.CategoryGroup" %>
<%@ page import="com.scobolsolo.application.CategoryGroupFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<%
OpalMainForm<Category> lclOF = OpalForm.create(
	session,
	request,
	"/OpalFormController",
	CategoryFactory.getInstance().forUniqueString(request.getParameter("object")),
	CategoryFactory.getInstance()
);
lclOF.setDeleteURI("/delete-confirmation.jsp?class_name=category");

Category lclC = lclOF.getUserFacing();
if (lclC != null) {
	lclOF.disable("Code");
}

String lclTitle = lclC == null ? "Create Category" : "Edit Category " + lclC.getName();

%>
<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="<%= lclTitle %>" />
	<jsp:param name="pageDescription" value="<%= lclTitle %>" />
	<jsp:param name="topMenu" value="<%= Menus.ADMIN().asTopLevel().output(request, \"categories\") %>" />
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
			Group
			<%= lclOF.<CategoryGroup>dropdown("CategoryGroup") %>
		</label>
	</div>
</div>

<div class="row">
	<div class="small-12 medium-6 columns">
		<label>
			Name
			<%= lclOF.text("Name", 30) %>
		</label>
	</div>
	<div class="small-12 medium-6 columns">
		<label>
			Short name
			<%= lclOF.text("ShortName", 10) %>
		</label>
	</div>
	<div class="small-12 medium-6 columns">
		<label>
			Code
			<%= lclOF.text("Code", 10) %>
		</label>
	</div>
	<div class="small-12 medium-6 columns">
		<label>
			Sequence
			<%= lclOF.number("Sequence") %>
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