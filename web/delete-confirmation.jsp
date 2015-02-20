<%@ page import="org.apache.commons.lang3.StringUtils" %>
<%@ page import="org.apache.commons.lang3.text.WordUtils" %>
<%@ page import="com.google.common.base.Objects" %>
<%
String lclObjectNameLC = StringUtils.replaceChars(Objects.firstNonNull(request.getParameter("class_name"), "object"), '_', ' ').toLowerCase();
String lclObjectNameUC = WordUtils.capitalizeFully(lclObjectNameLC);

String lclTitle = lclObjectNameUC + " Deleted";
%>

<jsp:include page="/template/header.jsp">
    <jsp:param name="pageTitle" value="<%= lclTitle %>" />
    <jsp:param name="pageDescription" value="<%= lclTitle %>" />
	<jsp:param name="h1" value="<%= lclObjectNameUC + \" Deleted\" %>" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>That <%= lclObjectNameLC %> has been deleted.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />