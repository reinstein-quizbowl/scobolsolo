<%@ page import="com.google.common.collect.SortedSetMultimap" %>
<%@ page import="com.google.common.collect.TreeMultimap" %>
<%@ page import="com.scobolsolo.application.Account" %>
<%@ page import="com.scobolsolo.application.Category" %>
<%@ page import="com.scobolsolo.application.CategoryGroup" %>
<%@ page import="com.scobolsolo.application.CategoryGroupFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="Account Home" />
	<jsp:param name="pageDescription" value="Account Home" />
	<jsp:param name="topMenu" value="<%= Menus.TOURNAMENTS().asTopLevel().output(request, \"account\") %>" />
	<jsp:param name="h1" value="Account Home &amp; Preferences" />
</jsp:include>

<div class="row">
	<div class="small-12 columns"><%
		Account lclUser = Account.demand(request);
		%><p>You are logged in as <%= lclUser.getContact().getName() %> (<code><%= lclUser.getUsername() %></code>).</p>
		
		<p>You may <a href="change-password.jsp">change your password</a> or <a href="question-demo.jsp">access a demo of how moderating works with this system</a>.</p>
	</div>
</div>

<form action="UpdatePronunciationGuidePreferences" method="post">
	<div class="row">
		<div class="small-12 columns">
			<h2>Pronunciation Guide Preferences</h2>
			<p>You can choose to show or not show pronunciation guides in different categories.</p>
		</div>
	</div>
	<div class="row"><%
		SortedSetMultimap<CategoryGroup, Category> lclGrouped = TreeMultimap.create();
		for (CategoryGroup lclCG : CategoryGroupFactory.getInstance().getAll()) {
			for (Category lclC : lclCG.getCategorySet()) {
				if (lclC.isActive()) {
					if (lclC.isAllowPronunciationGuideSuppression()) {
						lclGrouped.put(lclCG, lclC);
					}
				}
			}
		}
		
		for (CategoryGroup lclCG : lclGrouped.keySet()) {
			%><div class="small-12 medium-6 columns">
				<fieldset class="fieldset">
					<legend><%= lclCG.getName() %></legend><%
					for (Category lclC : lclGrouped.get(lclCG)) {
						%><label>
							<input type="checkbox" name="category_code" value="<%= lclC.getCode() %>" <%= lclUser.showPronunciationGuidesFor(lclC) ? "checked=\"checked\"" : "" %>>&nbsp;Show pronunciation guides for <%= lclC.getName() %>
						</label><%
					}
				%></fieldset>
			</div><%
		}
	%></div>
	<div class="row">
		<div class="small-12 columns">
			<div class="submit btn-group btn-group-1">
				<input type="submit" value="Save" />
			</div>
		</div>
	</div>
</form>

<jsp:include page="/template/footer.jsp" />