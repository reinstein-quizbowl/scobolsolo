package com.scobolsolo.opalforms.updater;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Stack;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

import com.google.common.collect.ImmutableBiMap;

import com.opal.LocalDateCache;
import com.opal.cma.OpalFormUpdater;
import com.opal.cma.Validator;

import com.scobolsolo.application.Account;
import com.scobolsolo.application.AccountFactory;
import com.scobolsolo.application.Category;
import com.scobolsolo.application.Diff;
import com.scobolsolo.application.DiffFactory;
import com.scobolsolo.application.Question;
import com.scobolsolo.application.QuestionStatus;
import com.scobolsolo.application.QuestionStatusFactory;

public class QuestionUpdater extends OpalFormUpdater<Question> {
	// private static final org.apache.log4j.Logger ourLogger = org.apache.log4j.Logger.getLogger(QuestionUpdater.class);
	
	private Category myInitialCategory = null;
	private QuestionStatus myInitialStatus = null;
	private String myInitialText = null;
	private String myInitialAnswer = null;
	private String myInitialNote = null;
	
	public QuestionUpdater(final HttpServletRequest argRequest, final String argPrefix, final String argParameterName) {
		super(argRequest, argPrefix, argParameterName);
	}
	
	public QuestionUpdater(final HttpServletRequest argRequest, final String argPrefix, final String argParameterName, final Validator<Question> argValidator) {
		super(argRequest, argPrefix, argParameterName, argValidator);
	}
	
	public QuestionUpdater(final HttpServletRequest argRequest, final String argPrefix, final Validator<Question> argValidator) {
		super(argRequest, argPrefix, argValidator);
	}
	
	@Override
	protected void beforeUpdate() {
		final Question lclQ = getUserFacing();
		
		if (lclQ != null && !lclQ.isNew()) {
			myInitialCategory = lclQ.getCategory();
			myInitialStatus = lclQ.getStatus();
			myInitialText = lclQ.getText();
			myInitialAnswer = lclQ.getAnswer();
			myInitialNote = lclQ.getNote();
		}
	}
	
	@Override
	protected void processSpecial() {
		final Question lclQ = Validate.notNull(getUserFacing());
		
		final Account lclUser = getUser();
		Validate.isTrue(lclUser.isWriter(), "User is not a writer!");
		
		if (lclQ.isNew() && lclQ.getWriter() == null) {
			lclQ.setWriter(lclUser);
		}
		
		if (lclQ.isNew() && lclQ.getStatus() == null) {
			if (lclQ.getText() == null) {
				lclQ.setStatus(QuestionStatusFactory.ANSWER_CHOSEN());
			} else {
				lclQ.setStatus(QuestionStatusFactory.DRAFTED()); // This is the database column's default, so this line isn't necessary. But I like being clear.
			}
		}
		
		if (lclQ.getText() == null && lclQ.getStatus() == QuestionStatusFactory.ANSWER_CHOSEN()) {
			lclQ.setText("Answer claim only");
		} else {
			if (lclQ.getText() == null) {
				addError("Text", "You must input question text.");
			} else {
				validateSyntax("Text", lclQ.getText());
			}
		}
		
		if (lclQ.getAnswer() == null) {
			addError("Answer", "You must input the answer line.");
		} else {
			validateSyntax("Answer", lclQ.getAnswer());
			
			if (lclQ.getAnswer().contains("_") == false) {
				addError("Answer", "The answer must have at least one required portion.");
			}
		}
	}
	
	@Override
	protected void afterUpdate() {
		if (hasErrors()) {
			return;
		}
		
		final Question lclQ = Validate.notNull(getUserFacing());
		
		final Account lclUser = getUser();
		Validate.isTrue(lclUser.isWriter(), "User is not a writer!");
		
		final String lclRemark = StringUtils.trimToNull(getPrefixedParameter("DiffRemark"));
		
		final boolean lclChange = 
			lclQ.isNew() ||
			myInitialCategory != lclQ.getCategory() ||
			myInitialStatus != lclQ.getStatus() ||
			!Objects.equals(myInitialText, lclQ.getText()) ||
			!Objects.equals(myInitialAnswer, lclQ.getAnswer()) ||
			!Objects.equals(myInitialNote, lclQ.getNote()) ||
			lclRemark != null ||
			false; // final irrelevant line so that all the above ones can end with || and I don't have to muck around with the last one being different
		
		if (lclChange) {
			final int lclRevisionNumber = lclQ.getNextRevisionNumber();
			
			DiffFactory.getInstance().create()
				.setQuestion(lclQ)
				.setRevisionNumber(lclRevisionNumber)
				.setEditor(lclUser)
				.setCategory(lclQ.getCategory())
				.setStatus(lclQ.getStatus())
				.setText(lclQ.getText())
				.setAnswer(lclQ.getAnswer())
				.setNote(lclQ.getNote())
				.setRemark(lclRemark)
				.setEditDistance(StringUtils.getLevenshteinDistance(ObjectUtils.firstNonNull(myInitialText, ""), lclQ.getText()))
				.setTimestamp(LocalDateCache.now());
			
			lclQ.recache();
		}
	}
	
	@Override
	protected void beforeDelete() {
		if (getUser().isAdministrator()) {
			final Question lclQ = Validate.notNull(getUserFacing());
			if (lclQ.isUsed()) {
				addError("This question has been used in a tournament, so it cannot be deleted.");
				return;
			} else {
				Validate.isTrue(lclQ.getPlacementSet().isEmpty());
				lclQ.getDiffSet().clear();
			}
		} else {
			addError("Only administrators may delete questions.");
		}
	}
	
	private Account getUser() {
		return Validate.notNull(AccountFactory.getInstance().forUsername(getUsername()));
	}
	
	protected void validateSyntax(final String argFieldName, final String argTextToValidate) {
		Validate.notBlank(argFieldName);
		Validate.notBlank(argTextToValidate);
		
		validateBalance(argFieldName, argTextToValidate);
	}
	
	// When updating this, be sure to update the description in the (potential) error message at the end of validateBalance()
	public static final ImmutableBiMap<Character, Character> BALANCED_CHARACTER_PAIRS = ImmutableBiMap.<Character, Character>builder()
		.put('(', ')')
		.put('[', ']')
		.put('{', '}')
		.put('"', '"')
		.put('_', '_')
		.put('$', '$')
		.put('~', '~')
		.build();
	
	protected boolean match(char argOpener, char argCloser) {
		return BALANCED_CHARACTER_PAIRS.containsKey(argOpener) && BALANCED_CHARACTER_PAIRS.get(argOpener).charValue() == argCloser;
	}
	
	protected void validateBalance(final String argFieldName, final String argTextToValidate) {
		Validate.notBlank(argFieldName);
		Validate.notBlank(argTextToValidate);
		
		Stack<Character> lclStack = new Stack<>();
		boolean lclError = false;
		
		char lclPrevChar = ' ';
		
		int lclI = 0;
		for (char lclC : argTextToValidate.toCharArray()) {
			if (lclPrevChar == '\\') {
			} else {
				if (BALANCED_CHARACTER_PAIRS.containsKey(lclC)) {
					if (lclStack.isEmpty()) {
						// It's definitely an opener.
						// ourLogger.debug(lclC + " at " + lclI + " must be an opener");
						lclStack.push(lclC);
					} else if (BALANCED_CHARACTER_PAIRS.get(lclC).charValue() == lclC) {
						// It's a character that could be either an opener or a closer
						if (lclStack.peek().charValue() == lclC) {
							// We've already used it as an opener, so this must be a closer
							// ourLogger.debug("Treating " + lclC + " at " + lclI + " as a closer");
							char lclOpener = lclStack.pop().charValue();
							if (match(lclOpener, lclC) == false) {
								lclError = true;
								break;
							}
						} else {
							// It must be an opener.
							// ourLogger.debug("Treating " + lclC + " at " + lclI + " as an opener");
							lclStack.push(lclC);
						}
					} else {
						// Something is open.
						if (match(lclStack.peek().charValue(), lclC)) {
							// This closes it.
							// ourLogger.debug(lclC + " at " + lclI + " closes the top of the current stack, which is " + lclStack);
							lclStack.pop();
						} else {
							// This opens something new.
							// ourLogger.debug(lclC + " at " + lclI + " opens a new layer of nesting; the current stack is " + lclStack);
							lclStack.push(lclC);
						}
						
					}
				} else if (BALANCED_CHARACTER_PAIRS.inverse().containsKey(lclC)) {
					// It must be a closer
					if (lclStack.isEmpty()) {
						// ourLogger.debug(lclC + " at " + lclI + " seems to be an opener, but nothing is open; the stack is empty");
						lclError = true;
						break;
					} else {
						char lclOpener = lclStack.pop().charValue();
						// ourLogger.debug(lclC + " at " + lclI + " seems to be a closer, but the present opener is " + lclOpener + " and the remaining stack is " + lclStack);
						if (match(lclOpener, lclC) == false) {
							lclError = true;
							break;
						}
					}
				}
			}
			
			lclPrevChar = lclC;
			++lclI;
		}
		
		lclError = lclError || lclStack.isEmpty() == false;
		
		if (lclError) {
			addError(argFieldName, "In the " + argFieldName.toLowerCase() + ", parentheses, square brackets, curly braces, double quotes, underscores, dollar signs, and italicization tildes must be balanced correctly: " + lclStack + ".");
		}
	}
}
