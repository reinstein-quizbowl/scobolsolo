<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="Cache Purge" />
	<jsp:param name="pageDescription" value="Cache Purge" />
	<jsp:param name="topMenu" value="<%= Menus.ADMIN().asTopLevel().output(request, \"home\") %>" />
	<jsp:param name="h1" value="Cache Purge" />
</jsp:include>

<div class="row">
	<div class="small-12 columns"><%
		boolean threw;
		
		try {
			Object[] lclIgnored = new Object[Integer.MAX_VALUE - 10];
			threw = false;
		} catch (OutOfMemoryError e) {
			threw = true;
		}
		%><p>All softly-reachable objects in Opal caches should now have been purged.</p><%
		
		if (threw) {
			%><p>An OutOfMemoryError was squashed.</p><%
		} else {
			%><p>No OutOfMemoryError occurred.</p><%
		}
	%></div>
</div>

<jsp:include page="/template/footer.jsp" />
