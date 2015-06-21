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
	 * @return an object value of {@code Id} (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.Integer getIdAsObject();

	/**
	 * primitive accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} database column in the table {@code account}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getIdAsObject() method.</p>
	 *
	 * @return the primitive value of {@code Id} (of the current {@link TransactionContext})
	 */
	default public int getId() {
		java.lang.Integer lclO = getIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the {@code Id} to the value of {@code argId}
	 *
	 * @param argId the new value of {@code Id}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code id} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argId is null
	 */
	@com.opal.annotation.NotNull
	public com.scobolsolo.application.Account setId(java.lang.Integer argId);

	/**
	 * sets the {@code Id} to the value of {@code argId}
	 *
	 * @param argId the new value of {@code Id}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Account setId(int argId);

	/**
	 * object accessor for the {@code Username}
	 *
	 * <p>The {@code Username} field is a direct mapping of the {@code username} field in {@code account}.</p>
	 *
	 * @return an object value of {@code Username} (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.String getUsername();

	/**
	 * sets the {@code Username} to the value of {@code argUsername}
	 *
	 * @param argUsername the new value of {@code Username}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code username} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argUsername is null
	 * @throws ArgumentTooLongException if {@code argUsername} is longer than 64 characters
	 * <p>The database column {@code username} is limited to 64 characters.</p>
	 *
	 */
	@com.opal.annotation.NotNull
	@com.opal.annotation.Length(maximum = 64L)
	public com.scobolsolo.application.Account setUsername(java.lang.String argUsername);

	/**
	 * object accessor for the {@code PasswordHash}
	 *
	 * <p>The {@code PasswordHash} field is a direct mapping of the {@code password_hash} field in {@code account}.</p>
	 *
	 * @return an object value of {@code PasswordHash} (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.String getPasswordHash();

	/**
	 * sets the {@code PasswordHash} to the value of {@code argPasswordHash}
	 *
	 * @param argPasswordHash the new value of {@code PasswordHash}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code password_hash} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argPasswordHash is null
	 * @throws ArgumentTooLongException if {@code argPasswordHash} is longer than 60 characters
	 * <p>The database column {@code password_hash} is limited to 60 characters.</p>
	 *
	 */
	@com.opal.annotation.NotNull
	@com.opal.annotation.Length(maximum = 60L)
	public com.scobolsolo.application.Account setPasswordHash(java.lang.String argPasswordHash);

	/**
	 * object accessor for the {@code Administrator}
	 *
	 * <p>The {@code Administrator} field is a direct mapping of the {@code administrator} field in {@code account}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isAdministrator() method.</p>
	 *
	 * @return an object value of {@code Administrator} (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.Boolean isAdministratorAsObject();

	/**
	 * primitive accessor for the {@code Administrator}
	 *
	 * <p>The {@code Administrator} field is a direct mapping of the {@code administrator} database column in the table {@code account}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the isAdministratorAsObject() method.</p>
	 *
	 * @return the primitive value of {@code Administrator} (of the current {@link TransactionContext})
	 */
	default public boolean isAdministrator() {
		java.lang.Boolean lclO = isAdministratorAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the {@code Administrator} to the value of {@code argAdministrator}
	 *
	 * @param argAdministrator the new value of {@code Administrator}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code administrator} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argAdministrator is null
	 */
	@com.opal.annotation.NotNull
	public com.scobolsolo.application.Account setAdministrator(java.lang.Boolean argAdministrator);

	/**
	 * sets the {@code Administrator} to the value of {@code argAdministrator}
	 *
	 * @param argAdministrator the new value of {@code Administrator}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Account setAdministrator(boolean argAdministrator);

	/**
	 * object accessor for the {@code Active}
	 *
	 * <p>The {@code Active} field is a direct mapping of the {@code active} field in {@code account}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isActive() method.</p>
	 *
	 * @return an object value of {@code Active} (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.Boolean isActiveAsObject();

	/**
	 * primitive accessor for the {@code Active}
	 *
	 * <p>The {@code Active} field is a direct mapping of the {@code active} database column in the table {@code account}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the isActiveAsObject() method.</p>
	 *
	 * @return the primitive value of {@code Active} (of the current {@link TransactionContext})
	 */
	default public boolean isActive() {
		java.lang.Boolean lclO = isActiveAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the {@code Active} to the value of {@code argActive}
	 *
	 * @param argActive the new value of {@code Active}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code active} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argActive is null
	 */
	@com.opal.annotation.NotNull
	public com.scobolsolo.application.Account setActive(java.lang.Boolean argActive);

	/**
	 * sets the {@code Active} to the value of {@code argActive}
	 *
	 * @param argActive the new value of {@code Active}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Account setActive(boolean argActive);

	/**
	 * object accessor for the {@code Writer}
	 *
	 * <p>The {@code Writer} field is a direct mapping of the {@code writer} field in {@code account}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isWriter() method.</p>
	 *
	 * @return an object value of {@code Writer} (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.Boolean isWriterAsObject();

	/**
	 * primitive accessor for the {@code Writer}
	 *
	 * <p>The {@code Writer} field is a direct mapping of the {@code writer} database column in the table {@code account}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the isWriterAsObject() method.</p>
	 *
	 * @return the primitive value of {@code Writer} (of the current {@link TransactionContext})
	 */
	default public boolean isWriter() {
		java.lang.Boolean lclO = isWriterAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the {@code Writer} to the value of {@code argWriter}
	 *
	 * @param argWriter the new value of {@code Writer}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code writer} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argWriter is null
	 */
	@com.opal.annotation.NotNull
	public com.scobolsolo.application.Account setWriter(java.lang.Boolean argWriter);

	/**
	 * sets the {@code Writer} to the value of {@code argWriter}
	 *
	 * @param argWriter the new value of {@code Writer}
	 * @return itself, so that mutators may be chained fluently
	 */
	public com.scobolsolo.application.Account setWriter(boolean argWriter);

	/**
	 * @return the {@code com.scobolsolo.application.Contact}
	 * The returned {@code com.scobolsolo.application.Contact} is the {@link UserFacing} object corresponding to the entry in {@code contact} that is referenced by {@code account_id_fkey}.
	 *
	 */
	public com.scobolsolo.application.Contact getContact();
	public com.scobolsolo.application.Account setContact(com.scobolsolo.application.Contact argContact);

	public int getWriterQuestionCount();
	public java.util.Iterator<com.scobolsolo.application.Question> createWriterQuestionIterator();

	public java.util.stream.Stream<com.scobolsolo.application.Question> streamWriterQuestion();

	public void addWriterQuestion(com.scobolsolo.application.Question argQuestion);
	public void removeWriterQuestion(com.scobolsolo.application.Question argQuestion);
	public void clearWriterQuestion();

	default public <T extends java.util.Collection<? super com.scobolsolo.application.Question>> T acquireWriterQuestion(T argC) {
		if (argC == null) { throw new IllegalArgumentException("Target Collection is null."); }
		java.util.Iterator<com.scobolsolo.application.Question> lclI = createWriterQuestionIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public com.scobolsolo.application.Question[] createWriterQuestionArray() {
		int lclLength = getWriterQuestionCount();
		com.scobolsolo.application.Question[] lclA = new com.scobolsolo.application.Question[lclLength];
		int lclIndex = 0;
		java.util.Iterator<com.scobolsolo.application.Question> lclI = createWriterQuestionIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

	public int getEditorDiffCount();
	public java.util.Iterator<com.scobolsolo.application.Diff> createEditorDiffIterator();

	public java.util.stream.Stream<com.scobolsolo.application.Diff> streamEditorDiff();

	public void addEditorDiff(com.scobolsolo.application.Diff argDiff);
	public void removeEditorDiff(com.scobolsolo.application.Diff argDiff);
	public void clearEditorDiff();

	default public <T extends java.util.Collection<? super com.scobolsolo.application.Diff>> T acquireEditorDiff(T argC) {
		if (argC == null) { throw new IllegalArgumentException("Target Collection is null."); }
		java.util.Iterator<com.scobolsolo.application.Diff> lclI = createEditorDiffIterator();
		while (lclI.hasNext()) {
			argC.add(lclI.next());
		}
		return argC;
	}

	default public com.scobolsolo.application.Diff[] createEditorDiffArray() {
		int lclLength = getEditorDiffCount();
		com.scobolsolo.application.Diff[] lclA = new com.scobolsolo.application.Diff[lclLength];
		int lclIndex = 0;
		java.util.Iterator<com.scobolsolo.application.Diff> lclI = createEditorDiffIterator();
		while (lclI.hasNext()) {
			lclA[lclIndex++] = lclI.next();
		}
		return lclA;
	}

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
			return com.scobolsolo.application.Contact.SortByComparator.getInstance().compare(argFirst.getContact(),  argSecond.getContact());
		}
	}

}
