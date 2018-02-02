<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="Home" />
	<jsp:param name="pageDescription" value="Home Page" />
	<jsp:param name="topMenu" value="<%= Menus.TOURNAMENTS().asTopLevel().output(request, \"home\") %>" />
	<jsp:param name="h1" value="Scobol Solo" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>Welcome to Scobol Solo!</p>
		
		<p>Results are available using the menu. Results from 2013 and earlier are, to varying extents, not quite complete, but the original data have been lost and we posted as much as we could.</p>
		
		<p>The 2018 edition of Scobol Solo has not yet been scheduled.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />