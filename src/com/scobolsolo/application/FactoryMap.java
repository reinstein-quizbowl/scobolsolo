package com.scobolsolo.application;

import com.opal.AbstractFactoryMap;

public class FactoryMap extends AbstractFactoryMap {

	private static final long serialVersionUID = 1L;

	private static final FactoryMap ourInstance = new FactoryMap();

	public static final FactoryMap getInstance() {
		return ourInstance;
	}

	private FactoryMap() {
		super();
	}

	@Override
	protected void initialize() {
		put(com.scobolsolo.application.Game.class, com.scobolsolo.application.GameFactory.getInstance());
		put(com.scobolsolo.application.ResponseType.class, com.scobolsolo.application.ResponseTypeFactory.getInstance());
		put(com.scobolsolo.application.Tournament.class, com.scobolsolo.application.TournamentFactory.getInstance());
		put(com.scobolsolo.application.SchoolYear.class, com.scobolsolo.application.SchoolYearFactory.getInstance());
		put(com.scobolsolo.application.StaffAssignment.class, com.scobolsolo.application.StaffAssignmentFactory.getInstance());
		put(com.scobolsolo.application.CategoryGroup.class, com.scobolsolo.application.CategoryGroupFactory.getInstance());
		put(com.scobolsolo.application.StandbyEntry.class, com.scobolsolo.application.StandbyEntryFactory.getInstance());
		put(com.scobolsolo.application.School.class, com.scobolsolo.application.SchoolFactory.getInstance());
		put(com.scobolsolo.application.Contact.class, com.scobolsolo.application.ContactFactory.getInstance());
		put(com.scobolsolo.application.Player.class, com.scobolsolo.application.PlayerFactory.getInstance());
		put(com.scobolsolo.application.Phase.class, com.scobolsolo.application.PhaseFactory.getInstance());
		put(com.scobolsolo.application.Buzzer.class, com.scobolsolo.application.BuzzerFactory.getInstance());
		put(com.scobolsolo.application.Question.class, com.scobolsolo.application.QuestionFactory.getInstance());
		put(com.scobolsolo.application.WaitlistEntry.class, com.scobolsolo.application.WaitlistEntryFactory.getInstance());
		put(com.scobolsolo.application.Match.class, com.scobolsolo.application.MatchFactory.getInstance());
		put(com.scobolsolo.application.SchoolRegistration.class, com.scobolsolo.application.SchoolRegistrationFactory.getInstance());
		put(com.scobolsolo.application.Diff.class, com.scobolsolo.application.DiffFactory.getInstance());
		put(com.scobolsolo.application.RoundGroup.class, com.scobolsolo.application.RoundGroupFactory.getInstance());
		put(com.scobolsolo.application.Staff.class, com.scobolsolo.application.StaffFactory.getInstance());
		put(com.scobolsolo.application.CategoryUse.class, com.scobolsolo.application.CategoryUseFactory.getInstance());
		put(com.scobolsolo.application.Packet.class, com.scobolsolo.application.PacketFactory.getInstance());
		put(com.scobolsolo.application.Room.class, com.scobolsolo.application.RoomFactory.getInstance());
		put(com.scobolsolo.application.Performance.class, com.scobolsolo.application.PerformanceFactory.getInstance());
		put(com.scobolsolo.application.Round.class, com.scobolsolo.application.RoundFactory.getInstance());
		put(com.scobolsolo.application.Response.class, com.scobolsolo.application.ResponseFactory.getInstance());
		put(com.scobolsolo.application.Placement.class, com.scobolsolo.application.PlacementFactory.getInstance());
		put(com.scobolsolo.application.Category.class, com.scobolsolo.application.CategoryFactory.getInstance());
		put(com.scobolsolo.application.Account.class, com.scobolsolo.application.AccountFactory.getInstance());
		put(com.scobolsolo.application.Card.class, com.scobolsolo.application.CardFactory.getInstance());
		return;
	}

}
