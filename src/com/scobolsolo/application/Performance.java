package com.scobolsolo.application;

import com.opal.*;

/**
 * represents a <code>Performance</code> from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from the database table <code>performance</code>.  Do not modify this class directly; instead, alter the database table on which it is based and/or the Opal configuration file for the project and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various <code>forXXX</code> methods on the {@link PerformanceFactory} factory class.  To create new instances, use the <code>create()</code> method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link TransactionContext}.</p>
 *
 * <p>This interface and the {@link PerformanceFactory} class (the ones in the <code>com.scobolsolo.application</code> package) are the only two automatically generated files for the table that are intended to be referenced in user code. Other automatically generated files (namely those in the <code>com.scobolsolo.persistence</code> package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface Performance extends IdentityUserFacing {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the Id
	 *
	 * <p>The Id field is a direct mapping of the <code>id</code> database column in the table <code>performance</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getId() method.</p>
	 *
	 * @return an object value of Id (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getIdAsObject();
	/**
	 * primitive accessor for the Id
	 *
	 * <p>The Id field is a direct mapping of the <code>id</code> database column in the table <code>performance</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getIdAsObject() method.</p>
	 *
	 * @return the primitive value of Id (of the current {@link TransactionContext})
	 */
	default public int getId() {
		java.lang.Integer lclO = getIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the Id to the value of <code>argId</code>
	 *
	 * @param argId the new value of Id.  May not be <code>null</code>.
	 * <p>The database column <code>id</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argId is null
	 */
	@com.opal.annotation.NotNull
	public void setId(java.lang.Integer argId);

	/**
	 * sets the Id to the value of <code>argId</code>
	 *
	 * @param argId the new value of Id
	 */
	public void setId(int argId);

	/**
	 * object accessor for the GameId
	 *
	 * <p>The GameId field is a direct mapping of the <code>game_id</code> database column in the table <code>performance</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getGameId() method.</p>
	 *
	 * @return an object value of GameId (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getGameIdAsObject();
	/**
	 * primitive accessor for the GameId
	 *
	 * <p>The GameId field is a direct mapping of the <code>game_id</code> database column in the table <code>performance</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getGameIdAsObject() method.</p>
	 *
	 * @return the primitive value of GameId (of the current {@link TransactionContext})
	 */
	default public int getGameId() {
		java.lang.Integer lclO = getGameIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the GameId to the value of <code>argGameId</code>
	 *
	 * @param argGameId the new value of GameId.  May not be <code>null</code>.
	 * <p>The database column <code>game_id</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argGameId is null
	 */
	@com.opal.annotation.NotNull
	public void setGameId(java.lang.Integer argGameId);

	/**
	 * sets the GameId to the value of <code>argGameId</code>
	 *
	 * @param argGameId the new value of GameId
	 */
	public void setGameId(int argGameId);

	/**
	 * object accessor for the PlayerId
	 *
	 * <p>The PlayerId field is a direct mapping of the <code>player_id</code> database column in the table <code>performance</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getPlayerId() method.</p>
	 *
	 * @return an object value of PlayerId (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getPlayerIdAsObject();
	/**
	 * primitive accessor for the PlayerId
	 *
	 * <p>The PlayerId field is a direct mapping of the <code>player_id</code> database column in the table <code>performance</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the getPlayerIdAsObject() method.</p>
	 *
	 * @return the primitive value of PlayerId (of the current {@link TransactionContext})
	 */
	default public int getPlayerId() {
		java.lang.Integer lclO = getPlayerIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the PlayerId to the value of <code>argPlayerId</code>
	 *
	 * @param argPlayerId the new value of PlayerId.  May not be <code>null</code>.
	 * <p>The database column <code>player_id</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argPlayerId is null
	 */
	@com.opal.annotation.NotNull
	public void setPlayerId(java.lang.Integer argPlayerId);

	/**
	 * sets the PlayerId to the value of <code>argPlayerId</code>
	 *
	 * @param argPlayerId the new value of PlayerId
	 */
	public void setPlayerId(int argPlayerId);

	/**
	 * @return the <code>Game</code>
	 * The returned <code>Game</code> is the {@link UserFacing} object corresponding to the row in the <code>game</code> that is referenced by the foreign key <code>performance_game_id_fkey</code>.
	 *
	 */
	public Game getGame();
	public void setGame(Game argGame);

	/**
	 * @return the <code>Player</code>
	 * The returned <code>Player</code> is the {@link UserFacing} object corresponding to the row in the <code>player</code> that is referenced by the foreign key <code>performance_player_id_fkey</code>.
	 *
	 */
	public Player getPlayer();
	public void setPlayer(Player argPlayer);

	public int getResponseCount();
	public java.util.Iterator<Response> createResponseIterator();

	public java.util.stream.Stream<Response> streamResponse();

	public void addResponse(Response argResponse);
	public void removeResponse(Response argResponse);
	public void clearResponse();

	default public <T extends java.util.Collection<? super Response>> T acquireResponse(T argC) {
		org.apache.commons.lang3.Validate.notNull(argC);
		java.util.Iterator<Response> lclI = createResponseIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public Response[] createResponseArray() {
		int lclLength = getResponseCount();
		Response[] lclA = new Response[lclLength];
		int lclIndex = 0;
		java.util.Iterator<Response> lclI = createResponseIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public Performance copy();

	default public com.scobolsolo.application.Response findResponse(com.scobolsolo.application.Placement argA) {
		return com.scobolsolo.application.PerformanceDelegate.findResponse(this, argA);
	}

	/** This is a Comparator that can be used to compare Performance objects based on their Id values. */

	public static class IdComparator extends com.siliconage.util.NullSafeComparator<Performance> {
		private static final IdComparator ourInstance = new IdComparator();
		public static final IdComparator getInstance() { return ourInstance; }

		private IdComparator() { super(); }

		@Override
		public int compareInternal(Performance argFirst, Performance argSecond) {
			return argFirst.getIdAsObject().compareTo(argSecond.getIdAsObject());
		}
	}

}
