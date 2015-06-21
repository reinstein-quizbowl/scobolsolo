package com.scobolsolo.persistence.postgres;
import javax.sql.DataSource;
import javax.naming.NamingException;
import javax.naming.InitialContext;
import com.opal.PersistenceException;
import com.scobolsolo.persistence.*;

public class PostgresOpalFactoryFactory extends OpalFactoryFactory {
	private static final PostgresOpalFactoryFactory ourInstance = new PostgresOpalFactoryFactory();

	public static final PostgresOpalFactoryFactory getSpecificInstance() { return ourInstance; }

	private static final String DATA_SOURCE_NAME="java:comp/env/ScobolSoloDataSource";

	private DataSource myDataSource;

	@Override
	public PlayerCategoryPointVOpalFactory getPlayerCategoryPointVOpalFactory() {
		return PostgresPlayerCategoryPointVOpalFactory.getInstance();
	}

	@Override
	public GameOpalFactory getGameOpalFactory() {
		return PostgresGameOpalFactory.getInstance();
	}

	@Override
	public PlayerMatchVOpalFactory getPlayerMatchVOpalFactory() {
		return PostgresPlayerMatchVOpalFactory.getInstance();
	}

	@Override
	public PlacementConversionVOpalFactory getPlacementConversionVOpalFactory() {
		return PostgresPlacementConversionVOpalFactory.getInstance();
	}

	@Override
	public ResponseTypeOpalFactory getResponseTypeOpalFactory() {
		return PostgresResponseTypeOpalFactory.getInstance();
	}

	@Override
	public TournamentOpalFactory getTournamentOpalFactory() {
		return PostgresTournamentOpalFactory.getInstance();
	}

	@Override
	public SchoolYearOpalFactory getSchoolYearOpalFactory() {
		return PostgresSchoolYearOpalFactory.getInstance();
	}

	@Override
	public StaffAssignmentOpalFactory getStaffAssignmentOpalFactory() {
		return PostgresStaffAssignmentOpalFactory.getInstance();
	}

	@Override
	public CategoryGroupOpalFactory getCategoryGroupOpalFactory() {
		return PostgresCategoryGroupOpalFactory.getInstance();
	}

	@Override
	public StandbyEntryOpalFactory getStandbyEntryOpalFactory() {
		return PostgresStandbyEntryOpalFactory.getInstance();
	}

	@Override
	public SchoolOpalFactory getSchoolOpalFactory() {
		return PostgresSchoolOpalFactory.getInstance();
	}

	@Override
	public ContactOpalFactory getContactOpalFactory() {
		return PostgresContactOpalFactory.getInstance();
	}

	@Override
	public PlayerOpalFactory getPlayerOpalFactory() {
		return PostgresPlayerOpalFactory.getInstance();
	}

	@Override
	public PhaseOpalFactory getPhaseOpalFactory() {
		return PostgresPhaseOpalFactory.getInstance();
	}

	@Override
	public BuzzerOpalFactory getBuzzerOpalFactory() {
		return PostgresBuzzerOpalFactory.getInstance();
	}

	@Override
	public QuestionOpalFactory getQuestionOpalFactory() {
		return PostgresQuestionOpalFactory.getInstance();
	}

	@Override
	public WaitlistEntryOpalFactory getWaitlistEntryOpalFactory() {
		return PostgresWaitlistEntryOpalFactory.getInstance();
	}

	@Override
	public GameVOpalFactory getGameVOpalFactory() {
		return PostgresGameVOpalFactory.getInstance();
	}

	@Override
	public CategoryConversionVOpalFactory getCategoryConversionVOpalFactory() {
		return PostgresCategoryConversionVOpalFactory.getInstance();
	}

	@Override
	public MatchOpalFactory getMatchOpalFactory() {
		return PostgresMatchOpalFactory.getInstance();
	}

	@Override
	public SchoolRegistrationOpalFactory getSchoolRegistrationOpalFactory() {
		return PostgresSchoolRegistrationOpalFactory.getInstance();
	}

	@Override
	public DiffOpalFactory getDiffOpalFactory() {
		return PostgresDiffOpalFactory.getInstance();
	}

	@Override
	public RoundGroupOpalFactory getRoundGroupOpalFactory() {
		return PostgresRoundGroupOpalFactory.getInstance();
	}

	@Override
	public StaffOpalFactory getStaffOpalFactory() {
		return PostgresStaffOpalFactory.getInstance();
	}

	@Override
	public CategoryUseOpalFactory getCategoryUseOpalFactory() {
		return PostgresCategoryUseOpalFactory.getInstance();
	}

	@Override
	public PacketOpalFactory getPacketOpalFactory() {
		return PostgresPacketOpalFactory.getInstance();
	}

	@Override
	public RoomOpalFactory getRoomOpalFactory() {
		return PostgresRoomOpalFactory.getInstance();
	}

	@Override
	public PlayerPointVOpalFactory getPlayerPointVOpalFactory() {
		return PostgresPlayerPointVOpalFactory.getInstance();
	}

	@Override
	public PerformanceOpalFactory getPerformanceOpalFactory() {
		return PostgresPerformanceOpalFactory.getInstance();
	}

	@Override
	public RoundOpalFactory getRoundOpalFactory() {
		return PostgresRoundOpalFactory.getInstance();
	}

	@Override
	public ResponseOpalFactory getResponseOpalFactory() {
		return PostgresResponseOpalFactory.getInstance();
	}

	@Override
	public StaffRoleOpalFactory getStaffRoleOpalFactory() {
		return PostgresStaffRoleOpalFactory.getInstance();
	}

	@Override
	public PlayerRecordVOpalFactory getPlayerRecordVOpalFactory() {
		return PostgresPlayerRecordVOpalFactory.getInstance();
	}

	@Override
	public PlacementOpalFactory getPlacementOpalFactory() {
		return PostgresPlacementOpalFactory.getInstance();
	}

	@Override
	public CategoryOpalFactory getCategoryOpalFactory() {
		return PostgresCategoryOpalFactory.getInstance();
	}

	@Override
	public AccountOpalFactory getAccountOpalFactory() {
		return PostgresAccountOpalFactory.getInstance();
	}

	@Override
	public CardOpalFactory getCardOpalFactory() {
		return PostgresCardOpalFactory.getInstance();
	}

	public String getDataSourceName() {
		return DATA_SOURCE_NAME;
	}

	public synchronized DataSource getDataSource() throws PersistenceException {
		if (myDataSource == null) {
			try {
				InitialContext lclC = new InitialContext();
				myDataSource = (DataSource) lclC.lookup(getDataSourceName());
				if (myDataSource == null) {
					throw new IllegalStateException("Could not get DataSource from the InitialContext");
				}
			} catch (NamingException lclE) {
				throw new PersistenceException("Could not get DataSource", lclE);
			}
		}
		return myDataSource;
	}
}
