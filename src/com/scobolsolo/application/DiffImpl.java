package com.scobolsolo.application;

import com.scobolsolo.persistence.DiffOpal;
import com.scobolsolo.persistence.AccountOpal;
import com.scobolsolo.persistence.QuestionOpal;
import com.scobolsolo.persistence.QuestionStatusOpal;
import com.scobolsolo.persistence.CategoryOpal;

public class DiffImpl extends com.opal.AbstractIdentityImpl<Diff, DiffOpal> implements Diff {
	private final DiffOpal myDiffOpal;

	public DiffImpl(DiffOpal argDiffOpal) {
		super();
		myDiffOpal = org.apache.commons.lang3.Validate.notNull(argDiffOpal);
	}

	protected DiffOpal getDiffOpal() {
		return myDiffOpal;
	}

	@Override
	protected com.opal.IdentityOpal<? extends Diff> getOpal() {
		return getDiffOpal();
	}

	@Override
	protected com.opal.IdentityOpal<? extends Diff> getBottomOpal() {
		return getDiffOpal();
	}

	@Override
	public java.lang.Integer getIdAsObject() {
		return getDiffOpal().getIdAsObject();
	}

	@Override
	public DiffImpl setId(java.lang.Integer argId) {
		getDiffOpal().setId(argId);
		return this;
	}

	@Override
	public DiffImpl setId(int argId) {
		getDiffOpal().setId(argId);
		return this;
	}

	@Override
	public java.lang.Integer getEditorAccountIdAsObject() {
		return getDiffOpal().getEditorAccountIdAsObject();
	}

	@Override
	public DiffImpl setEditorAccountId(java.lang.Integer argEditorAccountId) {
		getDiffOpal().setEditorAccountId(argEditorAccountId);
		return this;
	}

	@Override
	public DiffImpl setEditorAccountId(int argEditorAccountId) {
		getDiffOpal().setEditorAccountId(argEditorAccountId);
		return this;
	}

	@Override
	public java.lang.String getText() {
		return getDiffOpal().getText();
	}

	@Override
	public DiffImpl setText(java.lang.String argText) {
		getDiffOpal().setText(argText);
		return this;
	}

	@Override
	public java.lang.String getAnswer() {
		return getDiffOpal().getAnswer();
	}

	@Override
	public DiffImpl setAnswer(java.lang.String argAnswer) {
		getDiffOpal().setAnswer(argAnswer);
		return this;
	}

	@Override
	public java.lang.String getNote() {
		return getDiffOpal().getNote();
	}

	@Override
	public DiffImpl setNote(java.lang.String argNote) {
		getDiffOpal().setNote(argNote);
		return this;
	}

	@Override
	public java.lang.String getRemark() {
		return getDiffOpal().getRemark();
	}

	@Override
	public DiffImpl setRemark(java.lang.String argRemark) {
		getDiffOpal().setRemark(argRemark);
		return this;
	}

	@Override
	public java.lang.Integer getEditDistanceAsObject() {
		return getDiffOpal().getEditDistanceAsObject();
	}

	@Override
	public DiffImpl setEditDistance(java.lang.Integer argEditDistance) {
		getDiffOpal().setEditDistance(argEditDistance);
		return this;
	}

	@Override
	public DiffImpl setEditDistance(int argEditDistance) {
		getDiffOpal().setEditDistance(argEditDistance);
		return this;
	}

	@Override
	public java.time.LocalDateTime getTimestamp() {
		return getDiffOpal().getTimestamp();
	}

	@Override
	public DiffImpl setTimestamp(java.time.LocalDateTime argTimestamp) {
		getDiffOpal().setTimestamp(argTimestamp);
		return this;
	}

	@Override
	public java.lang.Integer getQuestionIdAsObject() {
		return getDiffOpal().getQuestionIdAsObject();
	}

	@Override
	public DiffImpl setQuestionId(java.lang.Integer argQuestionId) {
		getDiffOpal().setQuestionId(argQuestionId);
		return this;
	}

	@Override
	public DiffImpl setQuestionId(int argQuestionId) {
		getDiffOpal().setQuestionId(argQuestionId);
		return this;
	}

	@Override
	public java.lang.Integer getRevisionNumberAsObject() {
		return getDiffOpal().getRevisionNumberAsObject();
	}

	@Override
	public DiffImpl setRevisionNumber(java.lang.Integer argRevisionNumber) {
		getDiffOpal().setRevisionNumber(argRevisionNumber);
		return this;
	}

	@Override
	public DiffImpl setRevisionNumber(int argRevisionNumber) {
		getDiffOpal().setRevisionNumber(argRevisionNumber);
		return this;
	}

	@Override
	public java.lang.String getQuestionStatusCode() {
		return getDiffOpal().getQuestionStatusCode();
	}

	@Override
	public DiffImpl setQuestionStatusCode(java.lang.String argQuestionStatusCode) {
		getDiffOpal().setQuestionStatusCode(argQuestionStatusCode);
		return this;
	}

	@Override
	public java.lang.String getCategoryCode() {
		return getDiffOpal().getCategoryCode();
	}

	@Override
	public DiffImpl setCategoryCode(java.lang.String argCategoryCode) {
		getDiffOpal().setCategoryCode(argCategoryCode);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** Access to the Account object created from diff through reference diff_editor_account_id_fkey */

	@Override
	public Account getEditor() {
		AccountOpal lclAccountOpal = getDiffOpal().getEditorOpal();
		return lclAccountOpal == null ? null : lclAccountOpal.getUserFacing();
	}

	@Override
	public Diff setEditor(Account argAccount) {
		getDiffOpal().setEditorOpal(argAccount == null ? null : ((AccountImpl) argAccount).getAccountOpal());
		return this;
	}

	/** Access to the Question object created from diff through reference diff_question_id_fkey */

	@Override
	public Question getQuestion() {
		QuestionOpal lclQuestionOpal = getDiffOpal().getQuestionOpal();
		return lclQuestionOpal == null ? null : lclQuestionOpal.getUserFacing();
	}

	@Override
	public Diff setQuestion(Question argQuestion) {
		getDiffOpal().setQuestionOpal(argQuestion == null ? null : ((QuestionImpl) argQuestion).getQuestionOpal());
		return this;
	}

	/** Access to the QuestionStatus object created from diff through reference diff_question_status_code_fkey */

	@Override
	public QuestionStatus getStatus() {
		QuestionStatusOpal lclQuestionStatusOpal = getDiffOpal().getStatusOpal();
		return lclQuestionStatusOpal == null ? null : lclQuestionStatusOpal.getUserFacing();
	}

	@Override
	public Diff setStatus(QuestionStatus argQuestionStatus) {
		getDiffOpal().setStatusOpal(argQuestionStatus == null ? null : ((QuestionStatusImpl) argQuestionStatus).getQuestionStatusOpal());
		return this;
	}

	/** Access to the Category object created from diff through reference diff_category_code_fkey */

	@Override
	public Category getCategory() {
		CategoryOpal lclCategoryOpal = getDiffOpal().getCategoryOpal();
		return lclCategoryOpal == null ? null : lclCategoryOpal.getUserFacing();
	}

	@Override
	public Diff setCategory(Category argCategory) {
		getDiffOpal().setCategoryOpal(argCategory == null ? null : ((CategoryImpl) argCategory).getCategoryOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public void unlink() {
		getDiffOpal().unlink();
	}

	@Override
	public void reload() {
		getDiffOpal().reload();
	}

	@Override
	public Diff copy() {
		return getDiffOpal().copy().getUserFacing();
	}

}
