<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="Style Guide" />
	<jsp:param name="pageDescription" value="Style Guide" />
	<jsp:param name="topMenu" value="<%= Menus.QUESTIONS().asTopLevel().output(request, \"style-guide\") %>" />
	<jsp:param name="h1" value="Style Guide" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<h2>Italicization</h2>
		<p>Italicize text by <code class="success">~enclosing it in tildes~</code>.</p>
	</div>
</div>

<div class="row">
	<div class="small-12 columns">
		<h2>Pronunciation guides</h2>
		<p>Write pronunciation guides as follows: <code class="success">\pg{Jonah Greenthal}{JOH-nuh "GREEN"-thawl}</code>. That is: a backslash, the letters <code>pg</code>, the text for which a pronunciation guide is being provided enclosed in <code>curly braces</code>, and the actual pronunciation guide enclosed in <code>curly braces</code>. The pronunciation guide itself should be written according to NAQT's style; <a href="mailto:jonah@jonahgreenthal.com">ask Jonah</a> if you have any questions about that.</p>
	</div>
</div>

<div class="row">
	<div class="small-12 columns">
		<h2>Special characters</h2>
		<p>Use LaTeX coding. Information on diacritics is <a href="http://en.wikibooks.org/wiki/LaTeX/Special_Characters#Escaped_codes">here</a>. Some <a href="http://en.wikibooks.org/wiki/LaTeX/Special_Characters#Other_symbols">other symbols</a> also need to be escaped in special ways (notably including <code>%</code> and <code>$</code>, which you must write as <code class="success">\%</code> and <code class="success">\$</code>, respectively). <a href="mailto:jonah@jonahgreenthal.com">Ask Jonah</a> if you have any questions.</p>
	</div>
</div>

<div class="row">
	<div class="small-12 columns">
		<h2>Math and chemical formulae</h2>
		<p>Use LaTeX coding and enclose the math/formula in dollar signs (<code>$</code>). You can read about how to write formulae in LaTeX <a href="http://en.wikibooks.org/wiki/LaTeX/Mathematics">here</a>, though it's probably easier to just <a href="mailto:jonah@jonahgreenthal.com">ask Jonah</a>.</p>
	</div>
</div>

<div class="row">
	<div class="small-12 columns">
		<h2>Required parts of answer lines</h2>
		<p>Enclose the required part(s) of answer lines in underscores: <code class="success">Abraham _Lincoln_</code></p>
	</div>
</div>

<div class="row">
	<div class="small-12 columns">
		<h2>Alternate answer directives</h2>
		<p>Enclose all alternate answer directives in <code class="success">[square brackets]</code>. Use "or", "accept", "prompt on", and "do not accept or prompt on" exactly as in NAQT style. In fact, everything about answer lines is the same as NAQT style (<a href="mailto:jonah@jonahgreenthal.com">ask Jonah</a> if you have any questions) except that answer lines should not begin with <code class="warning">answer:</code>,  all directives are enclosed in <code class="success">[square brackets]</code> instead of <code class="warning">(parentheses)</code>, required parts of prompts are underlined (i.e., enclosed in <code class="success">_underscores_</code>) rather than enquoted, and titles are italicized (i.e., enclosed in <code class="success">~tildes~</code>) or enquoted as appropriate.</p>
	</div>
</div>

<div class="row">
	<div class="small-12 columns">
		<h2>Quotation marks</h2>
		<p>For double quotes, use ordinary straight quotation marks (<code class="success">"</code>), not curly quotes (<code class="warning">&#8220;</code> and <code class="warning">&#8221;</code>). To produce an apostrophe or closing single quote (<code>&#8217;</code>), use <code class="success">'</code> (i.e., the "ordinary way"). In the unlikely event that you need an opening single quote (<code>&#8216;</code>), use <code class="success">`</code> (just to the left of the <kbd>1</kbd> key).</p>
	</div>
</div>

<div class="row">
	<div class="small-12 columns">
		<h2>Other stuff</h2>
		<p>If you have questions, <a href="mailto:jonah@jonahgreenthal.com">ask Jonah</a>.</p>
	</div>
</div>

<div class="row">
	<div class="small-12 columns">
		<h2>Validation</h2>
		<p>Few or none of these rules are automatically checked, so you're responsible for following them or incurring Jonah's wrath if you fail.</p>
	</div>
</div>

<div class="row">
	<div class="small-12 columns">
		<h2>Warranty</h2>
		<p>These rules may change at any time, though every effort will be made to keep them stable, and to automatically update existing questions if changes are necessary.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
