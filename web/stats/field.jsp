<%@ page import="java.time.LocalDate" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="org.apache.commons.lang3.Validate" %>
<%@ page import="com.scobolsolo.application.*" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<%
Tournament lclT = Validate.notNull(TournamentFactory.getInstance().forUniqueString(request.getParameter("object")));
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="<%= lclT.getCode() %>" />
	<jsp:param name="pageTitle" value="Field" />
	<jsp:param name="topMenu" value="<%= Menus.stats(lclT).asTopLevel().output(request, \"field\") %>" />
	<jsp:param name="h1" value="<%= lclT.getCode() + \" Field\" %>" />
	<jsp:param name="h1Id" value="field" />
</jsp:include>

<div class="row">
	<div class="small-12 columns"><%
		DateTimeFormatter lclDTF = DateTimeFormatter.ofPattern("eeee, MMMM d, yyyy");
		
		LocalDate lclDate = lclT.getDate();
		LocalDate lclToday = LocalDate.now();
		
		String lclHoldingString, lclHaveYetEntered;
		String lclHaveEnteredSingularSchoolSingularPlayer, lclHaveEnteredSingularSchoolPluralPlayer, lclHaveEnteredPluralSchoolPluralPlayer;
		
		if (lclDate.equals(lclToday)) {
			lclHoldingString = "is being held today, " + lclDTF.format(lclDate);
			lclHaveYetEntered = "entered players";
			
			lclHaveEnteredSingularSchoolSingularPlayer = "school has entered a player";
			lclHaveEnteredSingularSchoolPluralPlayer = "school has entered players";
			lclHaveEnteredPluralSchoolPluralPlayer = "schools have entered players";
		} else if (lclDate.isBefore(lclToday)) {
			lclHoldingString = "was held on " + lclDTF.format(lclDate);
			lclHaveYetEntered = "entered players";
			
			lclHaveEnteredSingularSchoolSingularPlayer = "school entered a player";
			lclHaveEnteredSingularSchoolPluralPlayer = "school entered players";
			lclHaveEnteredPluralSchoolPluralPlayer = "schools entered players";
		} else if (lclDate.isAfter(lclToday)) {
			lclHoldingString = "will be held on " + lclDTF.format(lclDate);
			lclHaveYetEntered = "have yet entered players";
			
			lclHaveEnteredSingularSchoolSingularPlayer = "school has entered a player";
			lclHaveEnteredSingularSchoolPluralPlayer = "school has entered players";
			lclHaveEnteredPluralSchoolPluralPlayer = "schools have entered players";
		} else {
			throw new IllegalStateException();
		}
		
		%><p><%= lclT.getName() %> <%= lclHoldingString %>.</p><%
		
		if (lclT.getSchoolRegistrationCount() == 0) {
			%><p>No schools <%= lclHaveYetEntered %>.</p><%
		} else {
			List<WaitlistEntry> lclWEs = new ArrayList<>();
			List<StandbyEntry> lclSEs = new ArrayList<>();
			
			if (lclT.getSchoolRegistrationCount() == 1) {
				SchoolRegistration lclSR = Validate.notNull(lclT.createSchoolRegistrationIterator().next());
				
				if (lclSR.getFullPlayerCount() == 0) {
					// Nothing
				} else if (lclSR.getFullPlayerCount() == 1) {
					%><p>The following <%= lclHaveEnteredSingularSchoolSingularPlayer %>:</p><%
				} else {
					%><p>The following <%= lclHaveEnteredSingularSchoolPluralPlayer %>:</p><%
				}
			} else {
				%><p>The following <%= lclHaveEnteredPluralSchoolPluralPlayer %>:</p><%
			}
			
			SchoolRegistration[] lclSRs = lclT.createSchoolRegistrationArray();
			Arrays.sort(lclSRs, SchoolRegistration.SchoolNameComparator.getInstance());
			
			for (SchoolRegistration lclSR : lclSRs) {
				lclSR.acquireWaitlistEntry(lclWEs);
				lclSR.acquireStandbyEntry(lclSEs);
				
				if (lclSR.getFullPlayerCount() == 0) {
					// Only has waitlist or standby entries
					continue;
				}
				
				%><h2 id="<%= lclSR.getId() %>"><a class="subtle-highlight" href="player-detail.jsp?object=<%= lclT.getUniqueString() %>#school_<%= lclSR.getSchool().getId() %>"><%= lclSR.getSchool().getExplainedName() %></a></h2>
				<ul><%
					Player[] lclPlayers = lclSR.createPlayerArray();
					Arrays.sort(lclPlayers, Player.NameComparator.getInstance());
					for (Player lclP : lclPlayers) {
						%><li>
							<a class="subtle-highlight" href="player-detail.jsp?object=<%= lclT.getUniqueString() %>#player_<%= lclP.getId() %>"><%= lclP.getContact().getName() %></a><%
							if (lclP.getSchoolYear() != null) {
								if (lclP.isExhibition()) {
									%> (<%= lclP.getSchoolYear().getName() %>; exhibition)<%
								} else {
									%> (<%= lclP.getSchoolYear().getName() %>)<%
								}
							} else {
								if (lclP.isExhibition()) {
									%> (exhibition)<%
								}
							}
						%></li><%
					}
					if (lclSR.getSpotsReserved() > 0) {
						%><li><%= lclSR.getSpotsReserved() == 1 ? "One player" : String.valueOf(lclSR.getSpotsReserved()) + " players" %> to be named later</li><%
					}
				%></ul><%
			}
			
			if (!lclT.getDate().isBefore(LocalDate.now())) {
				if (!lclWEs.isEmpty()) {
					lclWEs.sort(WaitlistEntry.SequenceComparator.getInstance());
					%><h1 id="waitlist">Waitlist</h1>
					<p>The following <%= lclWEs.size() == 1 ? "entry is" : "entries are" %> waitlisted<%= lclWEs.size() > 1 ? ", in the following order" : "" %>:</p>
					<<%= lclWEs.size() == 1 ? "ul" : "ol" %>><%
						for (WaitlistEntry lclWE : lclWEs) {
							%><li>
								<%= lclWE.getPlayerCount() == 1 ? "One player " : String.valueOf(lclWE.getPlayerCount()) + " players " %>
								from <%= lclWE.getSchoolRegistration().getSchool().getExplainedName() %>
							</li><%
						}
					%></<%= lclWEs.size() == 1 ? "ul" : "ol" %>><%
				}
				
				if (!lclSEs.isEmpty()) {
					lclSEs.sort(StandbyEntry.SequenceComparator.getInstance());
					%><h1 id="standby">Standby</h1>
					<p>The following <%= lclSEs.size() == 1 ? "entry is" : "entries are" %> on the standby list<%= lclSEs.size() > 1 ? ", in the following order" : "" %>:</p>
					<<%= lclSEs.size() == 1 ? "ul" : "ol" %>><%
						for (StandbyEntry lclSE : lclSEs) {
							%><li>
								<%= lclSE.getPlayerCount() == 1 ? "One player " : String.valueOf(lclSE.getPlayerCount()) + " players " %>
								from <%= lclSE.getSchoolRegistration().getSchool().getExplainedName() %>
							</li><%
						}
					%></<%= lclSEs.size() == 1 ? "ul" : "ol" %>><%
				}
			}
		}
	%></div>
</div>

<jsp:include page="/template/footer.jsp" />