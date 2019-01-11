	</section>
	
	<% /* Font Awesome */ %>
	<link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	
	<% /* jQuery */ %>
	<script src="//code.jquery.com/jquery-3.2.1.min.js"></script>
	
	<% /* jQuery UI */ %>
	<script src="//code.jquery.com/ui/1.12.1/jquery-ui.min.js"></script>
	
	<% /* Foundation */ %>
	<script src="/template/foundation/js/foundation.min.js"></script>
	
	<% /* Foundation Datepicker */ %>
	<script src="/template/foundation/datepicker/foundation-datepicker.js"></script>
	
	<% /* Mathjax */ %>
	<script type="text/x-mathjax-config" src="/template/js/mathjax-config.js"></script>
	<script src="//cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.2/MathJax.js?config=TeX-AMS-MML_HTMLorMML"></script>
	
	<% /* Tablesorter */ %>
	<script src="//cdnjs.cloudflare.com/ajax/libs/jquery.tablesorter/2.29.0/js/jquery.tablesorter.min.js"></script> 
	<script src="//cdnjs.cloudflare.com/ajax/libs/jquery.tablesorter/2.29.0/js/widgets/widget-scroller.min.js"></script> 
	
	<% /* Our stuff */ %>
	<script src="/template/document-ready.js"></script><%
	
	String[] lclLoadScripts = request.getParameterValues("loadScript");
	if (lclLoadScripts != null) {
		for (String lclScriptPath : lclLoadScripts) {
			%><script src="<%= lclScriptPath %>"></script><%
		}
	}
	%><br />
	<br />
</body>
</html>