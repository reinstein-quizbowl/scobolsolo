package com.scobolsolo.persistence;

import com.opal.AbstractOpalFactoryFactory;

public abstract class OpalFactoryFactory extends AbstractOpalFactoryFactory {
	public static OpalFactoryFactory getInstance() { return com.scobolsolo.persistence.postgres.PostgresOpalFactoryFactory.getSpecificInstance(); }

	public abstract PlayerCategoryPointVOpalFactory getPlayerCategoryPointVOpalFactory();
	public abstract GameOpalFactory getGameOpalFactory();
	public abstract PlayerMatchVOpalFactory getPlayerMatchVOpalFactory();
	public abstract PlacementConversionVOpalFactory getPlacementConversionVOpalFactory();
	public abstract ResponseTypeOpalFactory getResponseTypeOpalFactory();
	public abstract TournamentOpalFactory getTournamentOpalFactory();
	public abstract SchoolYearOpalFactory getSchoolYearOpalFactory();
	public abstract StaffAssignmentOpalFactory getStaffAssignmentOpalFactory();
	public abstract CategoryGroupOpalFactory getCategoryGroupOpalFactory();
	public abstract StandbyEntryOpalFactory getStandbyEntryOpalFactory();
	public abstract SchoolOpalFactory getSchoolOpalFactory();
	public abstract ContactOpalFactory getContactOpalFactory();
	public abstract PlayerOpalFactory getPlayerOpalFactory();
	public abstract PhaseOpalFactory getPhaseOpalFactory();
	public abstract BuzzerOpalFactory getBuzzerOpalFactory();
	public abstract QuestionOpalFactory getQuestionOpalFactory();
	public abstract WaitlistEntryOpalFactory getWaitlistEntryOpalFactory();
	public abstract GameVOpalFactory getGameVOpalFactory();
	public abstract CategoryConversionVOpalFactory getCategoryConversionVOpalFactory();
	public abstract MatchOpalFactory getMatchOpalFactory();
	public abstract SchoolRegistrationOpalFactory getSchoolRegistrationOpalFactory();
	public abstract DiffOpalFactory getDiffOpalFactory();
	public abstract RoundGroupOpalFactory getRoundGroupOpalFactory();
	public abstract StaffOpalFactory getStaffOpalFactory();
	public abstract CategoryUseOpalFactory getCategoryUseOpalFactory();
	public abstract PacketOpalFactory getPacketOpalFactory();
	public abstract RoomOpalFactory getRoomOpalFactory();
	public abstract PlayerPointVOpalFactory getPlayerPointVOpalFactory();
	public abstract PerformanceOpalFactory getPerformanceOpalFactory();
	public abstract RoundOpalFactory getRoundOpalFactory();
	public abstract ResponseOpalFactory getResponseOpalFactory();
	public abstract PlayerRecordVOpalFactory getPlayerRecordVOpalFactory();
	public abstract PlacementOpalFactory getPlacementOpalFactory();
	public abstract CategoryOpalFactory getCategoryOpalFactory();
	public abstract AccountOpalFactory getAccountOpalFactory();
	public abstract CardOpalFactory getCardOpalFactory();
}
