package com.scobolsolo.opalforms.updater;

import java.time.LocalDateTime;
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
import com.scobolsolo.application.Diff;
import com.scobolsolo.application.Question;
import com.scobolsolo.application.QuestionStatusFactory;

public class DiffUpdater extends OpalFormUpdater<Diff> {
	// private static final org.apache.log4j.Logger ourLogger = org.apache.log4j.Logger.getLogger(DiffUpdater.class);
	
	public DiffUpdater(final HttpServletRequest argRequest, final String argPrefix, final String argParameterName) {
		super(argRequest, argPrefix, argParameterName);
	}
	
	public DiffUpdater(final HttpServletRequest argRequest, final String argPrefix, final String argParameterName, final Validator<Diff> argValidator) {
		super(argRequest, argPrefix, argParameterName, argValidator);
	}
	
	public DiffUpdater(final HttpServletRequest argRequest, final String argPrefix, final Validator<Diff> argValidator) {
		super(argRequest, argPrefix, argValidator);
	}
	
	@Override
	protected void processSpecial() {
		final Diff lclD = getUserFacing();
		if (lclD != null) {
			final Question lclQ = Validate.notNull(lclD.getQuestion());
			
			if (StringUtils.isBlank(lclD.getText()) && lclD.getStatus() == QuestionStatusFactory.ANSWER_CHOSEN()) {
				lclD.setText("Answer claim only");
			} else {
				if (StringUtils.isBlank(lclD.getText())) {
					addError("Text", "You must input question text.");
				} else {
					validateSyntax("Text", lclD.getText());
				}
			}
			
			if (StringUtils.isBlank(lclD.getAnswer())) {
				addError("Answer", "You must input the answer line.");
			} else {
				validateSyntax("Answer", lclD.getAnswer());
				
				if (lclD.getStatus() != QuestionStatusFactory.ANSWER_CHOSEN() && lclD.getAnswer().contains("_") == false) {
					addError("Answer", "The answer must have at least one required portion.");
				}
			}
			
			lclD.setRevisionNumber(lclQ.getDiffSet().size()) // which will include this Diff
				.setEditor(getUser())
				.setTimestamp(LocalDateCache.now());
			
			final Diff lclPrevious = lclQ.getCurrentDiff();
			if (lclPrevious == null) {
				lclD.setEditDistance(0);
			} else {
				lclD.setEditDistance(
					StringUtils.getLevenshteinDistance(
						ObjectUtils.firstNonNull(lclD.getText(), ""),
						ObjectUtils.firstNonNull(lclPrevious.getText(), "")
					)
				);
			}
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
		boolean lclInMath = false;
		
		int lclI = 0;
		for (char lclC : argTextToValidate.toCharArray()) {
			if (lclPrevChar == '\\') {
				// The character is escaped, so we don't care about its balance; it's being used for something else
			} else {
				if (lclInMath && lclC == '_') {
					// Underscore means something different in math mode, and it doesn't have to be balanced
					// ourLogger.debug("In math mode; ignoring _");
					++lclI;
					continue;
				}
				
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
			
			if (lclC == '$') {
				lclInMath = !lclInMath;
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
