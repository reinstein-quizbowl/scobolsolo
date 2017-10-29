package com.scobolsolo.menu;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import org.apache.commons.lang3.Validate;

import com.google.common.collect.ImmutableList;

import com.opal.LocalDateCache;

import com.scobolsolo.application.CategoryUse;
import com.scobolsolo.application.Match;
import com.scobolsolo.application.SchoolRegistration;
import com.scobolsolo.application.Staff;
import com.scobolsolo.application.Tournament;
import com.scobolsolo.application.TournamentFactory;

public final class Menus {
	private static final Menus ourInstance = new Menus();
	
	private final Menu myTournamentsPublicMenu;
	private final Menu myTournamentsInternalMenu;
	private final Menu myTournamentsStatsMenu;
	private final Menu myQuestionsMenu;
	private final Map<Tournament, Menu> myStatsMenus = new ConcurrentHashMap<>(TournamentFactory.getInstance().getAll().size());
	private final Map<Tournament, Menu> myTournamentAdminMenus = new ConcurrentHashMap<>(TournamentFactory.getInstance().getAll().size());
	
	private final Menu myAdminMenu;
	
	private Menus() {
		super();
		
		final ImmutableList<Tournament> lclTournaments = ImmutableList.of(
			TournamentFactory._2017(),
			TournamentFactory._2016(),
			TournamentFactory._2015(),
			TournamentFactory._2014()
		);
		
		myTournamentsPublicMenu = new Menu(
			"tournaments",
			"Scobol Solo",
			lclTournaments.stream()
				.map(argT -> new MenuPage(argT.getUniqueString() + "-public", argT.getShortName(), argT.getUrl()))
				.collect(Collectors.toList())
		);
		
		myTournamentsInternalMenu = new Menu(
			"tournaments-admin",
			"Tournament Admin",
			lclTournaments.stream()
				.map(argT -> new MenuPage(argT.getUniqueString() + "-admin", argT.getShortName(), "/tournament/schools.jsp?object=" + argT.getUniqueString()))
				.collect(Collectors.toList())
		);
		
		myTournamentsStatsMenu = new Menu(
			"tournaments-stats",
			"Stats",
			lclTournaments.stream()
				.map(argT -> new MenuPage(argT.getUniqueString() + "-stats", argT.getShortName(), (argT.getDate().isAfter(LocalDateCache.today()) ? "/stats/field.jsp?object=" + argT.getUniqueString() : "/stats/standings.jsp?object=" + argT.getUniqueString())))
				.collect(Collectors.toList())
		);
		
		myQuestionsMenu = new Menu(
			"questions",
			"Questions",
			Arrays.asList(
				new MenuPage("all", "Summary of All", "/questions/"),
				new MenuPage("render-all", "Render All", "/questions/render-all.jsp"),
				new MenuPage("write", "Write", "/questions/question-edit.jsp"),
				new MenuPage("progress", "Progress", "/questions/progress.jsp"),
				new MenuPage("style-guide", "Style Guide", "/questions/style-guide.jsp"),
				new Menu(
					"tournament-packets",
					"Tournament Packet Sets",
					lclTournaments.stream()
						.filter(argT -> argT.getPacketSet().isEmpty() == false)
						.map(argT ->
							new Menu(
								argT.getCode() + "-packets",
								"/tournament/packets.jsp?object=" + argT.getUniqueString(),
								argT.getShortName(),
								argT.streamPacket()
									.sorted()
									.map(argP ->
										new MenuPage(
											argP.getUniqueString(),
											argP.getName(),
											"/tournament/packet-edit.jsp?packet_id=" + argP.getId()
										)
									).collect(Collectors.toList())
							)
						).collect(Collectors.toList())
				)
			)
		);
		
		myAdminMenu = new Menu(
			"admin",
			"Scobol Solo Admin",
			Arrays.asList(
				new MenuPage("tournaments", "Tournaments", "/admin/tournaments.jsp"),
				new MenuPage("schools", "Schools", "/admin/schools.jsp"),
				new MenuPage("contacts", "Contacts", "/admin/contacts.jsp"),
				new MenuPage("Games", "Games", "/admin/games.jsp"),
				new MenuPage("categories", "Categories", "/admin/categories.jsp"),
				myTournamentsInternalMenu,
				new Menu(
					"tournaments-public",
					"Tournaments (Public)",
					myTournamentsPublicMenu
				),
				myTournamentsStatsMenu
			)
		);
	}
	
	public static Menus getInstance() {
		return ourInstance;
	}
	
	public static Menu ADMIN() {
		return ourInstance.myAdminMenu;
	}
	
	public static Menu TOURNAMENTS() {
		return ourInstance.myTournamentsPublicMenu;
	}
	
	public static Menu QUESTIONS() {
		return ourInstance.myQuestionsMenu;
	}
	
	public static Menu stats(final Tournament argTourn) {
		Validate.notNull(argTourn);
		
		return ourInstance.myStatsMenus.computeIfAbsent(argTourn,
			argT -> {
				final List<MenuItem> lclItems = new ArrayList<>(7);
				
				final LocalDate lclTodayDate = LocalDateCache.today();
				final LocalDate lclTournamentDate = argT.getDate();
				final boolean lclFuture = lclTournamentDate.isAfter(lclTodayDate);
				final boolean lclSoon = lclFuture && lclTournamentDate.minusDays(6).isBefore(lclTodayDate);
				final boolean lclToday = lclTournamentDate.equals(lclTodayDate);
				final boolean lclPast = lclTournamentDate.isBefore(lclTodayDate);
				
				if (lclFuture) {
					lclItems.add(new MenuPage("registrations", "Registrations", "/stats/registrations.jsp?object=" + argT.getUniqueString()));
					lclItems.add(new MenuPage("field", "Field", "/stats/field.jsp?object=" + argT.getUniqueString()));
				}
				
				if (lclPast || lclToday) {
					lclItems.add(new MenuPage("field", "Field", "/stats/field.jsp?object=" + argT.getUniqueString()));
					lclItems.add(new MenuPage("standings", "Standings", "/stats/standings.jsp?object=" + argT.getUniqueString()));
					
					List<MenuPage> lclPointsByCategory = new ArrayList<>(argT.getCategoryUseSet().size() + 1);
					CategoryUse[] lclCUs = argT.createCategoryUseArray();
					Arrays.sort(lclCUs, CategoryUse.CATEGORY_COMPARATOR);
					for (CategoryUse lclCU : lclCUs) {
						lclPointsByCategory.add(new MenuPage("points-" + lclCU.getCategory().getCode(), lclCU.getCategory().getName(), "/stats/category.jsp?object=" + argT.getUniqueString() + "&category_code=" + lclCU.getCategory().getCode()));
					}
					lclItems.add(new Menu(argT.getUniqueString() + "-points-by-category", "Points by Category", lclPointsByCategory));
					
					
					List<MenuPage> lclPlayerDetailsBySchool = argT.streamSchoolRegistration()
						.filter(argSR -> argSR.streamPlayer().anyMatch(argP -> argP.isExhibition() == false))
						.sorted(SchoolRegistration.SchoolShortNameComparator.getInstance())
						.map(argSR -> new MenuPage("player-detail-" + argSR.getId(), argSR.getSchool().getShortName(), "/stats/player-detail.jsp?school_registration_id=" + argSR.getId()))
						.collect(Collectors.toList());
					lclItems.add(new Menu(argT.getUniqueString() + "-player-detail", "Player Details", lclPlayerDetailsBySchool));
					
					lclItems.add(new MenuPage("conversion-by-category", "Conversion", "/stats/conversion-by-category.jsp?object=" + argT.getUniqueString()));
					
					if (argT.hasPublicQuestions()) {
						lclItems.add(new MenuPage("conversion-by-question", "Conversion by Question", "/stats/conversion-by-question.jsp?object=" + argT.getUniqueString()));
						if (argT.getQuestionDownloadUrl() != null) {
							lclItems.add(new MenuPage("download-questions", "Download Questions", argT.getQuestionDownloadUrl()));
						}
					}
				}
				
				if (lclSoon || lclToday) {
					lclItems.add(new MenuPage("coming-up-next", "Coming Up Next", "/stats/coming-up-next.jsp?object=" + argT.getUniqueString()));
				}
				
				if (lclPast || lclToday) {
					if (argT.getChampionshipMatchUrl() != null) {
						lclItems.add(new MenuPage("championship-match", "Championship", argT.getChampionshipMatchUrl()));
					}
				}
				
				return new Menu(argT.getUniqueString() + "-stats", argT.getName(), lclItems);
			}
		);
	}
	
	private static final int MAXIMUM_MATCHES_TO_SHOW_IN_MENU = 5;
	
	public static Menu staff(final Staff argS) {
		Validate.notNull(argS);
		// We don't cache these menus because they change as games are entered.
		
		final Tournament lclT = argS.getTournament();
		final String lclMenuTitle;
		if (argS.getStaffAssignmentSet().size() == 1) {
			lclMenuTitle = lclT.getName() + ": " + argS.getStaffAssignmentSet().iterator().next().getRoom().getName();
		} else {
			lclMenuTitle = argS.getContact().getName() + " @ " + lclT.getName();
		}
		
		List<Match> lclMatches = argS.findMatches();
		lclMatches.sort(Match.ENTERING_PRIORITY_COMPARATOR);
		
		if (lclMatches.size() > MAXIMUM_MATCHES_TO_SHOW_IN_MENU) {
			lclMatches = lclMatches.subList(0, MAXIMUM_MATCHES_TO_SHOW_IN_MENU);
		}
		
		final List<MenuItem> lclMenuItems = new ArrayList<>(2 + lclMatches.size());
		if (argS.getContact().getAccount() != null && argS.getContact().getAccount().isAdministrator()) {
			lclMenuItems.add(new MenuPage("all-matches", "All Matches", "/game/all.jsp?object=" + lclT.getUniqueString()));
		}
		lclMenuItems.add(new MenuPage("my-matches", "My Matches", "/game/index.jsp?object=" + lclT.getUniqueString()));
		for (final Match lclM : lclMatches) {
			lclMenuItems.add(new MenuPage("match-" + lclM.getUniqueString(), lclM.getRound().getName(), "/game/sides.jsp?match_id=" + lclM.getId()));
		}
		
		return new Menu(argS.getUniqueString() + "-staff", lclMenuTitle, lclMenuItems);
	}
	
	public static Menu tournamentAdmin(final Tournament argTourn) {
		Validate.notNull(argTourn);
		
		return ourInstance.myTournamentAdminMenus.computeIfAbsent(
			argTourn,
			argT -> new Menu(
				argT.getUniqueString() + "-admin",
				argT.getName(),
				Arrays.asList(
					new Menu(
						argT.getUniqueString() + "-admin-registration",
						"Registration",
						Arrays.asList(
							new MenuPage("schools-" + argT.getUniqueString(), "Schools", "/tournament/schools.jsp?object=" + argT.getUniqueString()),
							new MenuPage("players-" + argT.getUniqueString(), "Players", "/tournament/players.jsp?object=" + argT.getUniqueString()),
							new MenuPage("waitlist-" + argT.getUniqueString(), "Waitlist", "/tournament/waitlist.jsp?object=" + argT.getUniqueString()),
							new MenuPage("standby-" + argT.getUniqueString(), "Standby", "/tournament/standby.jsp?object=" + argT.getUniqueString())
						)
					),
					new MenuPage("staff-" + argT.getUniqueString(), "Staff", "/tournament/staff.jsp?object=" + argT.getUniqueString()),
					new Menu(
						argT.getUniqueString() + "-communications",
						"Communications",
						Arrays.asList(
							new MenuPage("email-" + argT.getUniqueString(), "Send Email", "/tournament/email.jsp?object=" + argT.getUniqueString()),
							new MenuPage("message-" + argT.getUniqueString(), "Message Staff", "/tournament/message.jsp?object=" + argT.getUniqueString())
						)
					),
					new Menu(
						argT.getUniqueString() + "-admin-games",
						"Games",
						Arrays.asList(
							new MenuPage("rounds-" + argT.getUniqueString(), "Rounds", "/tournament/rounds.jsp?object=" + argT.getUniqueString()),
							new MenuPage("rooms-" + argT.getUniqueString(), "Rooms", "/tournament/rooms.jsp?object=" + argT.getUniqueString()),
							new MenuPage("games-" + argT.getUniqueString(), "Games", "/games/index.jsp?object=" + argT.getUniqueString()),
							new MenuPage("paperwork-" + argT.getUniqueString(), "Paperwork", "/tournament/paperwork.jsp?object=" + argT.getUniqueString())
						)
					),
					new Menu(
						argT.getUniqueString() + "-admin-questions",
						"Questions",
						Arrays.asList(
							new MenuPage("categories-" + argT.getUniqueString(), "Categories", "/tournament/categories.jsp?object=" + argT.getUniqueString()),
							new MenuPage("packets-" + argT.getUniqueString(), "Packets", "/tournament/packets.jsp?object=" + argT.getUniqueString())
						)
					),
					new Menu(
						"stats-" + argT.getUniqueString(),
						"Stats",
						stats(argT)
					),
					new Menu(
						"admin",
						"Admin",
						ADMIN(),
						DisplayDeterminer.ToAdministrators
					)
				)
			)
		);
	}
}
