package com.scobolsolo.application;

import com.opal.*;

/**
 * represents a <code>Account</code> from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from the database table <code>account</code>.  Do not modify this class directly; instead, alter the database table on which it is based and/or the Opal configuration file for the project and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various <code>forXXX</code> methods on the {@link AccountFactory} factory class.  To create new instances, use the <code>create()</code> method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link TransactionContext}.</p>
 *
 * <p>This interface and the {@link AccountFactory} class (the ones in the <code>com.scobolsolo.application</code> package) are the only two automatically generated files for the table that are intended to be referenced in user code. Other automatically generated files (namely those in the <code>com.scobolsolo.persistence</code> package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface Account extends IdentityUserFacing {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the Id
	 *
	 * <p>The Id field is a direct mapping of the <code>id</code> database column in the table <code>account</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getId() method.</p>
	 *
	 * @return an object value of Id (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Integer getIdAsObject();
	/**
	 * primitive accessor for the Id
	 *
	 * <p>The Id field is a direct mapping of the <code>id</code> database column in the table <code>account</code>.</p>
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
	 * object accessor for the Username
	 *
	 * <p>The Username field is a direct mapping of the <code>username</code> database column in the table <code>account</code>.</p>
	 *
	 * @return an object value of Username (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.String getUsername();
	/**
	 * sets the Username to the value of <code>argUsername</code>
	 *
	 * @param argUsername the new value of Username.  May not be <code>null</code>.
	 * <p>The database column <code>username</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argUsername is null
	 * @throws ArgumentTooLongException if <code>argUsername</code> is longer than 64 characters
	 * <p>The database column <code>username</code> is limited to 64 characters.</p>
	 *
	 */
	@com.opal.annotation.NotNull
	@com.opal.annotation.Length(maximum = 64L)
	public void setUsername(java.lang.String argUsername);

	/**
	 * object accessor for the PasswordHash
	 *
	 * <p>The PasswordHash field is a direct mapping of the <code>password_hash</code> database column in the table <code>account</code>.</p>
	 *
	 * @return an object value of PasswordHash (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.String getPasswordHash();
	/**
	 * sets the PasswordHash to the value of <code>argPasswordHash</code>
	 *
	 * @param argPasswordHash the new value of PasswordHash.  May not be <code>null</code>.
	 * <p>The database column <code>password_hash</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argPasswordHash is null
	 * @throws ArgumentTooLongException if <code>argPasswordHash</code> is longer than 60 characters
	 * <p>The database column <code>password_hash</code> is limited to 60 characters.</p>
	 *
	 */
	@com.opal.annotation.NotNull
	@com.opal.annotation.Length(maximum = 60L)
	public void setPasswordHash(java.lang.String argPasswordHash);

	/**
	 * object accessor for the Administrator
	 *
	 * <p>The Administrator field is a direct mapping of the <code>administrator</code> database column in the table <code>account</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isAdministrator() method.</p>
	 *
	 * @return an object value of Administrator (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Boolean isAdministratorAsObject();
	/**
	 * primitive accessor for the Administrator
	 *
	 * <p>The Administrator field is a direct mapping of the <code>administrator</code> database column in the table <code>account</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the isAdministratorAsObject() method.</p>
	 *
	 * @return the primitive value of Administrator (of the current {@link TransactionContext})
	 */
	default public boolean isAdministrator() {
		java.lang.Boolean lclO = isAdministratorAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the Administrator to the value of <code>argAdministrator</code>
	 *
	 * @param argAdministrator the new value of Administrator.  May not be <code>null</code>.
	 * <p>The database column <code>administrator</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argAdministrator is null
	 */
	@com.opal.annotation.NotNull
	public void setAdministrator(java.lang.Boolean argAdministrator);

	/**
	 * sets the Administrator to the value of <code>argAdministrator</code>
	 *
	 * @param argAdministrator the new value of Administrator
	 */
	public void setAdministrator(boolean argAdministrator);

	/**
	 * object accessor for the Active
	 *
	 * <p>The Active field is a direct mapping of the <code>active</code> database column in the table <code>account</code>.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isActive() method.</p>
	 *
	 * @return an object value of Active (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */

	public java.lang.Boolean isActiveAsObject();
	/**
	 * primitive accessor for the Active
	 *
	 * <p>The Active field is a direct mapping of the <code>active</code> database column in the table <code>account</code>.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an <code>int</code> rather than an <code>Integer</code>; to retrieve the value as an object, use the isActiveAsObject() method.</p>
	 *
	 * @return the primitive value of Active (of the current {@link TransactionContext})
	 */
	default public boolean isActive() {
		java.lang.Boolean lclO = isActiveAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the Active to the value of <code>argActive</code>
	 *
	 * @param argActive the new value of Active.  May not be <code>null</code>.
	 * <p>The database column <code>active</code> to which this field is mapped is <code>NOT NULL</code>.</p>
	 *
	 * @throws IllegalNullArgumentException if argActive is null
	 */
	@com.opal.annotation.NotNull
	public void setActive(java.lang.Boolean argActive);

	/**
	 * sets the Active to the value of <code>argActive</code>
	 *
	 * @param argActive the new value of Active
	 */
	public void setActive(boolean argActive);

	/**
	 * @return the <code>Contact</code>
	 * The returned <code>Contact</code> is the {@link UserFacing} object corresponding to the row in the <code>contact</code> that is referenced by the foreign key <code>account_id_fkey</code>.
	 *
	 */
	public Contact getContact();
	public void setContact(Contact argContact);

	public Account copy();

	default public boolean mayUpdate(com.scobolsolo.application.Tournament argA) {
		return com.scobolsolo.application.AccountDelegate.mayUpdate(this, argA);
	}

	/** This is a Comparator that can be used to compare Account objects based on their Id values. */

	public static class IdComparator extends com.siliconage.util.NullSafeComparator<Account> {
		private static final IdComparator ourInstance = new IdComparator();
		public static final IdComparator getInstance() { return ourInstance; }

		private IdComparator() { super(); }

		@Override
		public int compareInternal(Account argFirst, Account argSecond) {
			return argFirst.getIdAsObject().compareTo(argSecond.getIdAsObject());
		}
	}

	public static class NameComparator extends com.siliconage.util.NullSafeComparator<Account> {
		private static final NameComparator ourInstance = new NameComparator();
		public static final NameComparator getInstance() { return ourInstance; }

		private NameComparator() { super(); }

		@Override
		public int compareInternal(Account argFirst, Account argSecond) {
			return com.scobolsolo.application.Contact.SortByComparator.getInstance().compare(argFirst.getContact(), argSecond.getContact());
		}
	}

	/** This is a Filter that will pass Account objects if their Active value is <code>true</code>. */

	public static class ActiveFilter extends com.siliconage.util.Filter<Account> {
		private static final ActiveFilter ourInstance = new ActiveFilter();
		public static final ActiveFilter getInstance() { return ourInstance; }

		private ActiveFilter() { super(); }

		@Override
		public boolean accept(Account argObject) {
			if (argObject == null) {
				return false;
			} else {
				return Boolean.TRUE.equals(argObject.isActiveAsObject());
			}
		}
	}

}
