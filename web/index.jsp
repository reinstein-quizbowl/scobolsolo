<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="Home" />
	<jsp:param name="pageDescription" value="Home Page" />
	<jsp:param name="topMenu" value="<%= Menus.TOURNAMENTS().asTopLevel().output(request, \"home\") %>" />
	<jsp:param name="h1" value="Scobol Solo" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<section id="next">
			<jsp:include page="/2024/fragment.jsp">
				<jsp:param name="show_header" value="true" />
			</jsp:include>
		</section>
		
		<section id="last">
			<jsp:include page="/2023/fragment.jsp">
				<jsp:param name="show_header" value="true" />
			</jsp:include>
		</section>
		
		<section id="about">
			<h2>About Scobol Solo</h2>
			
			<p>Scobol Solo is a <a href="http://www.pace-nsc.org/what-is-quizbowl-a-primer-and-faq-for-newcomers/">quizbowl</a> tournament for individual players rather than teams as usual. <a href="https://www.qbwiki.com/wiki/David_Reinstein">David Reinstein</a> of New Trier High School (Winnetka, Illinois) has run it every fall since 2001.</p>
			
			<p>Results are available using the menu. Results from 2013 and earlier are, to varying extents, not quite complete, but the original data have been lost and we posted as much as we could.</p>
			
			<p>Information on the background of Scobol Solo and some inter-year records are on the <a href="https://www.qbwiki.com/wiki/Scobol_Solo">QBWiki</a>.</p>
			
			<p>David Reinstein writes most or all of the questions for Scobol Solo. Since 2009 <a href="https://www.qbwiki.com/wiki/Jonah_Greenthal">Jonah Greenthal</a> has edited the set, and in other years some other people have helped write and/or edit.</p>
		</section>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
