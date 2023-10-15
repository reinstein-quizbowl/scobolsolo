package com.scobolsolo.persistence;

import com.opal.AbstractOpalFactoryFactory;

public abstract class OpalFactoryFactory extends AbstractOpalFactoryFactory {
	public static OpalFactoryFactory getInstance() { return com.scobolsolo.persistence.postgres.PostgresOpalFactoryFactory.getSpecificInstance(); }

	public abstract GameOpalFactory getGameOpalFactory();
	public abstract PronunciationGuideSuppressionOpalFactory getPronunciationGuideSuppressionOpalFactory();
	public abstract PlacementConversionVOpalFactory getPlacementConversionVOpalFactory();
	public abstract ResponseTypeOpalFactory getResponseTypeOpalFactory();
	public abstract QuestionStatusOpalFactory getQuestionStatusOpalFactory();
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
	public abstract CategoryConversionVOpalFactory getCategoryConversionVOpalFactory();
	public abstract MatchOpalFactory getMatchOpalFactory();
	public abstract SchoolRegistrationOpalFactory getSchoolRegistrationOpalFactory();
	public abstract DiffOpalFactory getDiffOpalFactory();
	public abstract StaffOpalFactory getStaffOpalFactory();
	public abstract CategoryUseOpalFactory getCategoryUseOpalFactory();
	public abstract PacketOpalFactory getPacketOpalFactory();
	public abstract MessageOpalFactory getMessageOpalFactory();
	public abstract RoomOpalFactory getRoomOpalFactory();
	public abstract PerformanceOpalFactory getPerformanceOpalFactory();
	public abstract RoundOpalFactory getRoundOpalFactory();
	public abstract ResponseOpalFactory getResponseOpalFactory();
	public abstract StaffRoleOpalFactory getStaffRoleOpalFactory();
	public abstract PlacementOpalFactory getPlacementOpalFactory();
	public abstract CategoryOpalFactory getCategoryOpalFactory();
	public abstract AccountOpalFactory getAccountOpalFactory();
	public abstract CardOpalFactory getCardOpalFactory();
}
