<%@ page import="java.time.LocalDate" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="org.apache.commons.lang3.Validate" %>
<%@ page import="com.opal.LocalDateCache" %>
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
		final DateTimeFormatter lclDateFormatter = DateTimeFormatter.ofPattern("eeee, MMMM d, yyyy");
		
		final LocalDate lclDate = lclT.getDate();
		final LocalDate lclToday = LocalDateCache.today();
		
		final String lclDateDescription, lclFieldDescription;
		String lclHaveEnteredSingularSchoolSingularPlayer, lclHaveEnteredSingularSchoolPluralPlayer, lclHaveEnteredPluralSchoolPluralPlayer;
		
		final int lclSchoolCount = (int) lclT.streamSchoolRegistration()
			.filter(it -> it.getFullPlayerCount() > 0)
			.count();
		final int lclPlayerCount = lclT.streamSchoolRegistration()
			.mapToInt(SchoolRegistration::getFullPlayerCount)
			.sum();
		
		if (lclDate.equals(lclToday)) {
			lclDateDescription = "is being held today, " + lclDateFormatter.format(lclDate);
			if (lclPlayerCount == 0) {
				// This won't happen
				lclFieldDescription = "No one has registered.";
			} else if (lclPlayerCount == 1) {
				// This won't happen
				lclFieldDescription = "There is one player.";
			} else {
				lclFieldDescription = "There are " + lclPlayerCount + " players from " + (lclSchoolCount == 1 ? "one school" : lclSchoolCount + " schools") + ":";
			}
		} else if (lclDate.isBefore(lclToday)) {
			lclDateDescription = "was held on " + lclDateFormatter.format(lclDate);
			if (lclPlayerCount == 0) {
				// This won't happen
				lclFieldDescription = "No one played.";
			} else if (lclPlayerCount == 1) {
				// This won't happen
				lclFieldDescription = "There was one player.";
			} else {
				lclFieldDescription = "There were " + lclPlayerCount + " players from " + (lclSchoolCount == 1 ? "one school" : lclSchoolCount + " schools") + ":";
			}
		} else {
			lclDateDescription = "will be held on " + lclDateFormatter.format(lclDate);
			if (lclPlayerCount == 0) {
				lclFieldDescription = "No one has registered yet.";
			} else if (lclPlayerCount == 1) {
				lclFieldDescription = "So far, one player has registered:";
			} else {
				lclFieldDescription = "So far, " + lclPlayerCount + " players from " + (lclSchoolCount == 1 ? "one school" : lclSchoolCount + " schools") + " have registered.";
			}
		}
		
		%><p><%= lclT.getName() %> <%= lclDateDescription %>. <%= lclFieldDescription %></p><%
		
		if (lclT.getSchoolRegistrationSet().isEmpty() == false) {
			List<WaitlistEntry> lclWEs = new ArrayList<>();
			List<StandbyEntry> lclSEs = new ArrayList<>();
			
			SchoolRegistration[] lclSRs = lclT.createSchoolRegistrationArray();
			Arrays.sort(lclSRs, SchoolRegistration.SchoolNameComparator.getInstance());
			
			for (SchoolRegistration lclSR : lclSRs) {
				lclWEs.addAll(lclSR.getWaitlistEntrySet());
				lclSEs.addAll(lclSR.getStandbyEntrySet());
				
				if (lclSR.getFullPlayerCount() == 0) {
					// Only has waitlist or standby entries
					continue;
				}
				
				%><h2 id="<%= lclSR.getId() %>">
					<a class="no-highlight" href="/stats/player-detail.jsp?school_registration_id=<%= lclSR.getId() %>">
						<%= lclSR.getSchool().getExplainedName() %>
					</a>
				</h2>
				<ul><%
					Player[] lclPlayers = lclSR.createPlayerArray();
					Arrays.sort(lclPlayers, Player.NameComparator.getInstance());
					for (Player lclP : lclPlayers) {
						%><li>
							<a class="no-highlight" href="/stats/player-detail.jsp?school_registration_id=<%= lclSR.getId() %>#player_<%= lclP.getId() %>"><%= lclP.getContact().getName() %></a><%
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
			
			if (!lclT.getDate().isBefore(lclToday)) {
				if (!lclWEs.isEmpty()) {
					lclWEs.sort(null);
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
					lclSEs.sort(null);
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