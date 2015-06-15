package com.scobolsolo.persistence;

import com.opal.*;

/**
 * represents a {@code Account} from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from {@code account}.  Do not modify this class directly; instead, alter the permanent storage on which it is based, the Opal configuration file for the project, and/or the {@link com.scobolsolo.application.Account}, and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various {@code forXXX} methods on the {@link com.scobolsolo.application.AccountFactory} factory class.  To create new instances, use the {@code create()} method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link com.opal.TransactionContext}.</p>
 *
 * <p>This interface is not meant to be referenced in user code.  Only the {@link com.scobolsolo.application.Account} and the {@link com.scobolsolo.application.AccountFactory} class should be referenced directly.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface AccountUserFacing extends IdentityUserFacing {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} field in {@code account}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getId() method.</p>
	 *
	 * @return an object value of {@code Id} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.Integer getIdAsObject();

	/**
	 * primitive accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} field in {@code account}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getIdAsObject() method.</p>
	 *
	 * @return the primitive value of {@code Id} (of the current {@link com.opal.TransactionContext})
	 */
	default public int getId() {
		java.lang.Integer lclO = getIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the {@code Id} to the value of {@code argId}
	 *
	 * @param argId the new value of {@code Id}.  May not be <code>null</code>.
	 * <p>The database column {@code id} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argId is null
	 */
	@com.opal.annotation.NotNull
	public void setId(java.lang.Integer argId);

	/**
	 * sets the {@code Id} to the value of {@code argId}
	 *
	 * @param argId the new value of {@code Id}
	 */
	public void setId(int argId);

	/**
	 * object accessor for the {@code Username}
	 *
	 * <p>The {@code Username} field is a direct mapping of the {@code username} field in {@code account}.</p>
	 *
	 * @return an object value of {@code Username} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.String getUsername();

	/**
	 * sets the {@code Username} to the value of {@code argUsername}
	 *
	 * @param argUsername the new value of {@code Username}.  May not be <code>null</code>.
	 * <p>The database column {@code username} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argUsername is null
	 * @throws ArgumentTooLongException if {@code argUsername} is longer than 64 characters
	 * <p>The database column {@code username} is limited to 64 characters.</p>
	 *
	 */
	@com.opal.annotation.NotNull
	@com.opal.annotation.Length(maximum = 64L)
	public void setUsername(java.lang.String argUsername);

	/**
	 * object accessor for the {@code PasswordHash}
	 *
	 * <p>The {@code PasswordHash} field is a direct mapping of the {@code password_hash} field in {@code account}.</p>
	 *
	 * @return an object value of {@code PasswordHash} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.String getPasswordHash();

	/**
	 * sets the {@code PasswordHash} to the value of {@code argPasswordHash}
	 *
	 * @param argPasswordHash the new value of {@code PasswordHash}.  May not be <code>null</code>.
	 * <p>The database column {@code password_hash} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argPasswordHash is null
	 * @throws ArgumentTooLongException if {@code argPasswordHash} is longer than 60 characters
	 * <p>The database column {@code password_hash} is limited to 60 characters.</p>
	 *
	 */
	@com.opal.annotation.NotNull
	@com.opal.annotation.Length(maximum = 60L)
	public void setPasswordHash(java.lang.String argPasswordHash);

	/**
	 * object accessor for the {@code Administrator}
	 *
	 * <p>The {@code Administrator} field is a direct mapping of the {@code administrator} field in {@code account}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isAdministrator() method.</p>
	 *
	 * @return an object value of {@code Administrator} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.Boolean isAdministratorAsObject();

	/**
	 * primitive accessor for the {@code Administrator}
	 *
	 * <p>The {@code Administrator} field is a direct mapping of the {@code administrator} field in {@code account}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the isAdministratorAsObject() method.</p>
	 *
	 * @return the primitive value of {@code Administrator} (of the current {@link com.opal.TransactionContext})
	 */
	default public boolean isAdministrator() {
		java.lang.Boolean lclO = isAdministratorAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the {@code Administrator} to the value of {@code argAdministrator}
	 *
	 * @param argAdministrator the new value of {@code Administrator}.  May not be <code>null</code>.
	 * <p>The database column {@code administrator} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argAdministrator is null
	 */
	@com.opal.annotation.NotNull
	public void setAdministrator(java.lang.Boolean argAdministrator);

	/**
	 * sets the {@code Administrator} to the value of {@code argAdministrator}
	 *
	 * @param argAdministrator the new value of {@code Administrator}
	 */
	public void setAdministrator(boolean argAdministrator);

	/**
	 * object accessor for the {@code Active}
	 *
	 * <p>The {@code Active} field is a direct mapping of the {@code active} field in {@code account}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isActive() method.</p>
	 *
	 * @return an object value of {@code Active} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.Boolean isActiveAsObject();

	/**
	 * primitive accessor for the {@code Active}
	 *
	 * <p>The {@code Active} field is a direct mapping of the {@code active} field in {@code account}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the isActiveAsObject() method.</p>
	 *
	 * @return the primitive value of {@code Active} (of the current {@link com.opal.TransactionContext})
	 */
	default public boolean isActive() {
		java.lang.Boolean lclO = isActiveAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the {@code Active} to the value of {@code argActive}
	 *
	 * @param argActive the new value of {@code Active}.  May not be <code>null</code>.
	 * <p>The database column {@code active} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argActive is null
	 */
	@com.opal.annotation.NotNull
	public void setActive(java.lang.Boolean argActive);

	/**
	 * sets the {@code Active} to the value of {@code argActive}
	 *
	 * @param argActive the new value of {@code Active}
	 */
	public void setActive(boolean argActive);

	/**
	 * @return the {@code com.scobolsolo.application.Contact}
	 * The returned {@code com.scobolsolo.application.Contact} is the {@link UserFacing} object corresponding to the entry in {@code contact} that is referenced by {@code account_id_fkey}.
	 *
	 */
	public com.scobolsolo.application.Contact getContact();
	public void setContact(com.scobolsolo.application.Contact argContact);

	public com.scobolsolo.application.Account copy();

	/** This is a Comparator that can be used to compare Account objects based on their {@code Id} values. */

	public static class IdComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Account> {
		private static final IdComparator ourInstance = new IdComparator();
		public static final IdComparator getInstance() { return ourInstance; }

		private IdComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Account argFirst, com.scobolsolo.application.Account argSecond) {
			return argFirst.getIdAsObject().compareTo(argSecond.getIdAsObject());
		}
	}

	public static class NameComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Account> {
		private static final NameComparator ourInstance = new NameComparator();
		public static final NameComparator getInstance() { return ourInstance; }

		private NameComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Account argFirst, com.scobolsolo.application.Account argSecond) {
			return com.scobolsolo.application.Contact.SortByComparator.getInstance().compare(argFirst.getContact(), argSecond.getContact());
		}
	}

	/** This is a Filter that will pass Account objects if their {@code Active} value is {@code true}. */

	public static class ActiveFilter extends com.siliconage.util.Filter<com.scobolsolo.application.Account> {
		private static final ActiveFilter ourInstance = new ActiveFilter();
		public static final ActiveFilter getInstance() { return ourInstance; }

		private ActiveFilter() { super(); }

		@Override
		public boolean accept(com.scobolsolo.application.Account argObject) {
			if (argObject == null) {
				return false;
			} else {
				return Boolean.TRUE.equals(argObject.isActiveAsObject());
			}
		}
	}

}
