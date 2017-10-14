<%@ page import="com.opal.cma.OpalForm" %>
<%@ page import="com.opal.cma.OpalMainForm" %>
<%@ page import="com.scobolsolo.application.CategoryGroup" %>
<%@ page import="com.scobolsolo.application.CategoryGroupFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.HTMLUtility" %>

<%
OpalMainForm<CategoryGroup> lclOF = OpalForm.create(
	session,
	request,
	"/OpalFormController",
	CategoryGroupFactory.getInstance().forUniqueString(request.getParameter("object")),
	CategoryGroupFactory.getInstance()
);
lclOF.setDeleteURI("/delete-confirmation.jsp?class_name=category_group");

CategoryGroup lclCG = lclOF.getUserFacing();
if (lclCG != null) {
	lclOF.disable("Code");
}

String lclTitle = lclCG == null ? "Create Category Group" : "Edit Category Group " + lclCG.getName();
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