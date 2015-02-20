<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="Tournament administration" />
	<jsp:param name="topMenu" value="<%= Menus.ADMIN().asTopLevel().output(request, \"tournament-home\") %>" />
	<jsp:param name="h1" value="Tournament administration" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>Use the links above.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />