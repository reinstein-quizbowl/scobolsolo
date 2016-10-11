package com.scobolsolo.application;

import java.util.Comparator;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.Predicate;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.tuple.Pair;

import com.google.common.cache.LoadingCache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.collect.ImmutableSet;

import com.scobolsolo.persistence.QuestionUserFacing;

/**
 * This interface may be changed at will.
 *
 * <p>This interface and the {@link QuestionFactory} class are the only two automatically generated files for this type that are intended to be referenced in user code. Other automatically generated files package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */

public interface Question extends QuestionUserFacing {
	public static final int SHOW_PRONUNCIATION_GUIDES = 1 << 0;
	public static final int SHOW_BUZZ_LINKS = 1 << 1;
	
	public static final char[] WORD_BREAKING_CHARACTERS = {' ', '-', '/'};
	
	static final org.apache.log4j.Logger ourLogger = org.apache.log4j.Logger.getLogger(Question.class);
	
	static final LoadingCache<Pair<Question, Integer>, String> ourCachedTextHTML = CacheBuilder.newBuilder()
		.maximumSize(500)
		.build(
			new CacheLoader<Pair<Question, Integer>, String>() {
				@Override
				public String load(Pair<Question, Integer> argPair) {
					Question lclQ = Validate.notNull(argPair.getLeft());
					int lclBitField = argPair.getRight().intValue();
					
					try {
						return latexToHTML(lclQ.getText(), lclBitField, 0);
					} catch (LatexToHTMLConversionException lclE) {
						ourLogger.warn(lclE.getMessage(), lclE);
						return "Couldn't convert: " + lclE.getMessage();
					}
				}
			}
		);
	static final LoadingCache<Pair<Question, Boolean>, String> ourCachedAnswerHTML = CacheBuilder.newBuilder()
		.maximumSize(500)
		.build(
			new CacheLoader<Pair<Question, Boolean>, String>() {
				@Override
				public String load(Pair<Question, Boolean> argPair) {
					Question lclQ = Validate.notNull(argPair.getLeft());
					boolean lclShowPGs = argPair.getRight().booleanValue();
					
					try {
						return latexToHTML(lclQ.getAnswer(), lclShowPGs ? SHOW_PRONUNCIATION_GUIDES : 0, 0);
					} catch (LatexToHTMLConversionException lclE) {
						ourLogger.warn(lclE.getMessage(), lclE);
						return "Couldn't convert: " + lclE.getMessage();
					}
				}
			}
		);
	
	public static final Comparator<Question> CATEGORY_COMPARATOR = Comparator.comparing(Question::getCategory);
	
	default boolean isUsed() {
		return getPlacementCount() > 0;
	}
	
	default boolean isUnused() {
		return getPlacementCount() == 0;
	}
	
	default Placement findPlacement(Tournament argT) {
		return streamPlacement()
			.filter(argPL -> argPL.getTournament() == argT)
			.findFirst().orElse(null);
	}
	
	default SortedSet<Diff> getDiffs() {
		return acquireDiff(new TreeSet<>());
	}
	
	default Diff getCurrentDiff() {
		return streamDiff().max(Comparator.naturalOrder()).orElse(null);
	}
	
	default int getNextRevisionNumber() {
		return 1 + streamDiff().mapToInt(Diff::getRevisionNumber).max().orElse(0);
	}
	
	default String getDescriptionSafe() {
		return ObjectUtils.firstNonNull(
			getDescription(),
			"TBD: " + getStatus().getName()
		);
	}
	
	default String outputTextHTML(final int argBitField) {
		return ourCachedTextHTML.getUnchecked(Pair.of(this, argBitField));
	}
	
	default String outputAnswerHTML(final boolean argShowPGs) {
		return ourCachedAnswerHTML.getUnchecked(Pair.of(this, argShowPGs));
	}
	
	default void recache() {
		ourCachedTextHTML.refresh(Pair.of(this, 0));
		ourCachedTextHTML.refresh(Pair.of(this, SHOW_PRONUNCIATION_GUIDES));
		ourCachedTextHTML.refresh(Pair.of(this, SHOW_BUZZ_LINKS));
		ourCachedTextHTML.refresh(Pair.of(this, SHOW_PRONUNCIATION_GUIDES | SHOW_BUZZ_LINKS));
		
		ourCachedAnswerHTML.refresh(Pair.of(this, true));
		ourCachedAnswerHTML.refresh(Pair.of(this, false));
	}
	
	static String startBuzzLink(final int argIndex) {
		Validate.isTrue(argIndex >= 0);
		
		return "<span class=\"originally-buzzable\" id=\"buzzIndex" + argIndex + "\" data-buzz-index=\"" + argIndex + "\">";
	}
	
	static String endBuzzLink(@SuppressWarnings("unused") final int argIndex) {
		Validate.isTrue(argIndex >= 0);
		
		return "</span>";
	}
	
	public static String latexToHTML(final String argS, final int argBitField, final int argStartIndex) {
		if (StringUtils.isBlank(argS)) {
			return "&nbsp;";
		} else {
			final StringBuilder lclSB = new StringBuilder(2*argS.length()); // lame guess
			
			final boolean lclShowPGs = showPGs(argBitField);
			final boolean lclShowBuzzLinks = showBuzzLinks(argBitField);
			
			boolean lclInItalics = false;
			boolean lclInUnderlining = false;
			boolean lclInMath = false;
			int lclBracketNesting = 0;
			
			boolean lclInBuzzable = false;
			if (lclShowBuzzLinks) {
				lclSB.append(startBuzzLink(argStartIndex));
				lclInBuzzable = true;
			}
			
			// ENTIRE_STRING:
			for (int lclI = 0; lclI < argS.length(); ++lclI) {
				char lclC = argS.charAt(lclI);
				
				// If we're at an end of argS, we use ' ' as a placeholder. Getting into boxed primitives just for this doesn't seem worthwhile.
				char lclPrev = lclI == 0 ? ' ' : argS.charAt(lclI - 1);
				char lclNext = lclI + 1 > argS.length() - 1 ? ' ' : argS.charAt(lclI + 1);
				char lclTwoNext = lclI + 2 > argS.length() - 1 ? ' ' : argS.charAt(lclI + 2);
				
				
				
				if (lclShowBuzzLinks && lclInBuzzable && isWordBreakingCharacter(lclC)) {
					lclSB.append(endBuzzLink(argStartIndex + lclI));
					lclInBuzzable = false;
				}
				
				if (lclInMath) {
					if (lclC == '$') {
						if (lclPrev == '\\') {
							lclSB.append("\\$");
						} else {
							lclSB.append("\\)</span>");
							lclInMath = false;
						}
					} else {
						lclSB.append(lclC);
					}
				} else {
					// ENTIRE_STRING_POSSIBILITIES:
					switch (lclC) {
						case '\\':
							switch (lclNext) {
								case '%':
								case '$':
								case '{':
								case '}':
									lclSB.append(lclNext);
									++lclI;
									break;
								case '\\':
									lclSB.append("<br />");
									++lclI;
									break;
								case ',':
								case ';': // \, and \; are thin spaces that for HTML purposes we'll treat as equivalent
									lclSB.append("&thinsp;");
									++lclI;
									break;
								default:
									String lclCommand = null;
									StringBuilder lclCommandSB = new StringBuilder();
									StringBuilder lclCurrentArg = new StringBuilder();
									List<String> lclArgs = new ArrayList<>();
									
									boolean lclCommandDone = false;
									int lclBraceDepth = 0;
									BACKSLASH_PORTION:
									for (int lclJ = lclI; lclJ < argS.length(); ++lclJ) {
										char lclBackslashChar = argS.charAt(lclJ);
										char lclNextBackslashChar = lclJ == argS.length() - 1 ? ' ' : argS.charAt(lclJ + 1);
										if (lclCommandDone) {
											BACKSLASH_ARG_PORTION_POSSIBILITIES:
											switch (lclBackslashChar) {
												case '{':
													++lclBraceDepth;
													if (lclBraceDepth == 1) {
														// We're starting a new argument
														break;
													} else {
														// We've got a braced bit in an existing argument
														lclCurrentArg.append('{');
														break;
													}
												case '}':
													--lclBraceDepth;
													if (lclBraceDepth == 0) {
														// This is a top-level argument
														lclArgs.add(lclCurrentArg.toString());
														lclCurrentArg = new StringBuilder();
														lclI = lclJ;
														if (lclNextBackslashChar == '{') {
															// We're going from one argument to the next
															break BACKSLASH_ARG_PORTION_POSSIBILITIES;
														} else {
															// We're done with this argument
															break BACKSLASH_PORTION;
														}
													} else {
														// This is something within an argument
														lclCurrentArg.append('}');
														break;
													}
												default:
													lclCurrentArg.append(lclBackslashChar);
											}
										} else {
											if (lclBackslashChar == '{' || lclBackslashChar == ' ') {
												lclCommandDone = true;
												lclCommand = lclCommandSB.toString();
												--lclJ;
											} else {
												lclCommandSB.append(lclBackslashChar);
												if (lclCommandSB.length() <= 2) {
													if (lclBackslashChar == '`' || lclBackslashChar == '\'' || lclBackslashChar == '^' || lclBackslashChar == '"' || lclBackslashChar == '~' || lclBackslashChar == '=') {
														lclCommand = lclCommandSB.toString();
														lclArgs = Arrays.asList(String.valueOf(argS.charAt(lclJ + 1)));
														lclI += 2;
														break;
													} else if (lclBackslashChar == 'O' || lclBackslashChar == 'o') {
														lclCommand = lclCommandSB.toString();
														lclArgs = Collections.emptyList();
														if (lclNextBackslashChar == ' ') {
															lclI += 2;
														} else if (lclNextBackslashChar == '{') {
															lclI += 3;
														}
														break;
													}
												}
											}
										}
									}
									
									// BACKSLASH_COMMAND_POSSIBILITIES:
									switch (lclCommand) {
										case "\\&": // ampersand
											Validate.isTrue(lclArgs.isEmpty());
											lclSB.append("&amp;");
											++lclI;
											break;
										case "\\`": // grave accent
											Validate.isTrue(lclArgs.size() == 1);
											lclSB.append('&').append(lclArgs.get(0)).append("grave;");
											break;
										case "\\'": // acute accent
											Validate.isTrue(lclArgs.size() == 1);
											lclSB.append('&').append(lclArgs.get(0)).append("acute;");
											break;
										case "\\^": // circumflex
											Validate.isTrue(lclArgs.size() == 1);
											lclSB.append('&').append(lclArgs.get(0)).append("circ;");
											break;
										case "\\\"": // umlaut
											Validate.isTrue(lclArgs.size() == 1);
											lclSB.append('&').append(lclArgs.get(0)).append("uml;");
											break;
										case "\\H": // double acute accent
											Validate.isTrue(lclArgs.size() == 1);
											switch (lclArgs.get(0)) {
												case "O": lclSB.append("&#336;"); break;
												case "o": lclSB.append("&#337;"); break;
												case "U": lclSB.append("&#368;"); break;
												case "u": lclSB.append("&#369;"); break;
												case "Y": lclSB.append("&#1266;"); break;
												case "y": lclSB.append("&#1267;"); break;
												default: throw new LatexToHTMLConversionException("We don't know how to put a double acute accent on '" + lclArgs.get(0) + '\'');
											}
											break;
										case "\\~": // tilde
											Validate.isTrue(lclArgs.size() == 1);
											lclSB.append('&').append(lclArgs.get(0)).append("tilde;");
											break;
										case "\\c": // cedilla
											Validate.isTrue(lclArgs.size() == 1);
											switch (lclArgs.get(0)) {
												case "C": lclSB.append("&Ccedil;"); break;
												case "c": lclSB.append("&ccedil;"); break;
												case "S": lclSB.append("&#536;"); break;
												case "s": lclSB.append("&#537;"); break;
												default: throw new LatexToHTMLConversionException("We don't know how to put a cedilla on '" + lclArgs.get(0) + '\'');
											}
											break;
										case "\\l": // stroked L
											Validate.isTrue(lclArgs.size() == 1);
											switch (lclArgs.get(0)) {
												case "L": lclSB.append("&#321;"); break;
												case "l": lclSB.append("&#322;"); break;
												default: throw new LatexToHTMLConversionException("We don't know how to put a stroke on '" + lclArgs.get(0) + '\'');
											}
											break;
										case "\\v": // caron/hacek
											Validate.isTrue(lclArgs.size() == 1);
											lclSB.append('&').append(lclArgs.get(0)).append("caron;");
											break;
										case "\\O": // slash-through
											Validate.isTrue(lclArgs.isEmpty());
											lclSB.append("&Oslash;");
											break;
										case "\\o": // slash-through
											Validate.isTrue(lclArgs.isEmpty());
											lclSB.append("&oslash;");
											break;
										case "\\=": // macron
											Validate.isTrue(lclArgs.size() == 1);
											switch (lclArgs.get(0)) {
												case "A" : lclSB.append("&#256;"); break;
												case "a" : lclSB.append("&#257;"); break;
												case "E" : lclSB.append("&#274;"); break;
												case "e" : lclSB.append("&#275;"); break;
												case "I" : lclSB.append("&#298;"); break;
												case "i" : lclSB.append("&#299;"); break;
												case "O" : lclSB.append("&#332;"); break;
												case "o" : lclSB.append("&#333;"); break;
												case "U" : lclSB.append("&#362;"); break;
												case "u" : lclSB.append("&#363;"); break;
												case "Y" : lclSB.append("&#562;"); break;
												case "y" : lclSB.append("&#563;"); break;
												default: throw new LatexToHTMLConversionException("We don't know how to put a macron on '" + lclArgs.get(0) + '\'');
											}
											break;
										case "\\dot": // dot over the letter
											Validate.isTrue(lclArgs.size() == 1);
											switch (lclArgs.get(0)) {
												case "C" : lclSB.append("&#266;"); break;
												case "c" : lclSB.append("&#267;"); break;
												case "E" : lclSB.append("&#278;"); break;
												case "e" : lclSB.append("&#279;"); break;
												case "Z" : lclSB.append("&#379;"); break;
												case "z" : lclSB.append("&#380;"); break;
												default: throw new LatexToHTMLConversionException("We don't know how to put a dot over '" + lclArgs.get(0) + '\'');
											}
											break;
										case "\\dh": // lowercase thorn
											Validate.isTrue(lclArgs.isEmpty());
											lclSB.append("&eth;");
											lclI += 3;
											break;
										case "\\DH": // capital thorn
											Validate.isTrue(lclArgs.isEmpty());
											lclSB.append("&ETH;");
											lclI += 3;
											break;
										case "\\ldots": // ellipsis
											Validate.isTrue(lclArgs.isEmpty());
											lclSB.append("&hellip;");
											lclI += 6;
											break;
										case "\\pg":
											Validate.isTrue(lclArgs.size() == 2, "lclArgs = " + lclArgs);
											if (lclShowPGs) {
												lclSB.append("<span class=\"has-pronunciation-guide\">")
													.append(latexToHTML(lclArgs.get(0), argBitField, lclI))
													.append("</span>&nbsp;<span class=\"pronunciation-guide\">")
													.append(latexToHTML(lclArgs.get(1), argBitField, lclI))
													.append("</span>");
											} else {
												lclSB.append(latexToHTML(lclArgs.get(0), argBitField, lclI));
											}
											break;
										case "\\textsubscript":
											Validate.isTrue(lclArgs.size() == 1);
											lclSB.append("<sub>").append(lclArgs.get(0)).append("</sub>");
											break;
										case "\\textsuperscript":
											Validate.isTrue(lclArgs.size() == 1);
											lclSB.append("<sup>").append(lclArgs.get(0)).append("</sup>");
											break;
										case "\\texttt":
											Validate.isTrue(lclArgs.size() == 1);
											lclSB.append("<code>").append(lclArgs.get(0)).append("</code>");
											break;
										default: throw new LatexToHTMLConversionException("We don't know how to process the command '" + lclCommand + "' / " + lclArgs);
									}
							}
							break;
						
						case '[':
							++lclBracketNesting;
							lclSB.append('[');
							break;
						case ']':
							--lclBracketNesting;
							lclSB.append(']');
							break;
						case '$':
							Validate.isTrue(lclInMath == false);
							lclSB.append("<span class=\"latex\">\\(");
							lclInMath = true;
							break;
						case '`':
							lclSB.append('\''); // and the website will convert it into &#8216;
							break;
						case '-':
							if (lclNext == '-') {
								if (lclTwoNext == '-') { // ---
									lclSB.append("&mdash;");
									lclI += 2;
									break;
								} else { // just --
									lclSB.append("&ndash;");
									lclI++;
									break;
								}
							} else {
								lclSB.append(lclC);
								break;
							}
						
						case '~':
							if (lclInItalics) {
								lclSB.append("</i>");
							} else {
								lclSB.append("<i>");
							}
							lclInItalics = !lclInItalics;
							break;
						
						case '_':
							if (lclInUnderlining) {
								lclSB.append("</u>");
							} else {
								lclSB.append("<u>");
							}
							lclInUnderlining = !lclInUnderlining;
							break;
						
						case '*':
							if (lclShowPGs) {
								lclSB.append("&middot;");
							}
							break;
						
						case '&':
							lclSB.append("&amp;");
							break;
						
						default:
							lclSB.append(lclC);
					}
				}
				
				if (lclShowBuzzLinks && !lclInBuzzable && isWordBreakingCharacter(lclC)) {
					lclSB.append(startBuzzLink(argStartIndex + lclI));
					lclInBuzzable = true;
				}
			}
			
			if (lclInItalics) {
				throw new LatexToHTMLConversionException("Italics are not closed");
			}
			if (lclInUnderlining) {
				throw new LatexToHTMLConversionException("Underlining is not closed");
			}
			if (lclInMath) {
				throw new LatexToHTMLConversionException("Math is not closed");
			}
			if (lclBracketNesting > 0) {
				throw new LatexToHTMLConversionException("Square brackets are not nested correctly");
			}
			
			if (lclShowBuzzLinks) {
				lclSB.append(endBuzzLink(argStartIndex + argS.length()));
				lclInBuzzable = false; // Doesn't matter at this point, but it feels right to write.
			}
			
			return lclSB.toString();
		}
	}
	
	public static class PlacingFilter implements Predicate<Question> {
		private final Placement myPlacement;
		
		public PlacingFilter(Placement argPL) {
			myPlacement = argPL; // may be null
		}
		
		public Placement getPlacement() {
			return myPlacement;
		}
		
		@Override
		public boolean test(Question argQ) {
			Validate.notNull(argQ);
			
			if (argQ.isUsed()) {
				return false;
			} else {
				if (getPlacement() == null) {
					return true;
				} else {
					return argQ.getCategory() == getPlacement().getCategory();
				}
			}
		}
	}
	
	
	public static class StatusFilter implements Predicate<QuestionStatus> { // This is a static class because we want it to be able to exist without an instance of Question, for use in an OpalForm that is creating a new Question
		private final Account myUser;
		private final QuestionStatus myStartingStatus;
		
		public StatusFilter(Account argUser, Question argQ) {
			myUser = Validate.notNull(argUser);
			
			if (argQ == null) { // a new Question
				myStartingStatus = null;
			} else {
				myStartingStatus = argQ.getStatus();
			}
		}
		
		public Account getUser() {
			return myUser;
		}
		
		public QuestionStatus getStartingStatus() {
			return myStartingStatus;
		}
		
		@Override
		public boolean test(QuestionStatus argNewStatus) {
			Validate.notNull(argNewStatus);
			
			if (getUser().isAdministrator()) {
				return true;
			} else if (!getUser().isWriter()) {
				return false;
			} else {
				if (getStartingStatus() == null) {
					if (argNewStatus == QuestionStatusFactory.ANSWER_CHOSEN()) {
						return true;
					} else if (argNewStatus == QuestionStatusFactory.DRAFTED()) {
						return true;
					} else if (argNewStatus == QuestionStatusFactory.READY_FOR_REVIEW()) {
						return true;
					} else if (argNewStatus == QuestionStatusFactory.APPROVED()) {
						return false;
					} else {
						throw new IllegalArgumentException("Unknown target status " + argNewStatus.getCode());
					}
				} else if (getStartingStatus() == QuestionStatusFactory.ANSWER_CHOSEN()) {
					if (argNewStatus == QuestionStatusFactory.ANSWER_CHOSEN()) {
						return true;
					} else if (argNewStatus == QuestionStatusFactory.DRAFTED()) {
						return true;
					} else if (argNewStatus == QuestionStatusFactory.READY_FOR_REVIEW()) {
						return true;
					} else if (argNewStatus == QuestionStatusFactory.APPROVED()) {
						return false;
					} else {
						throw new IllegalArgumentException("Unknown target status " + argNewStatus.getCode());
					}
				} else if (getStartingStatus() == QuestionStatusFactory.DRAFTED()) {
					if (argNewStatus == QuestionStatusFactory.ANSWER_CHOSEN()) {
						return true;
					} else if (argNewStatus == QuestionStatusFactory.DRAFTED()) {
						return true;
					} else if (argNewStatus == QuestionStatusFactory.READY_FOR_REVIEW()) {
						return true;
					} else if (argNewStatus == QuestionStatusFactory.APPROVED()) {
						return false;
					} else {
						throw new IllegalArgumentException("Unknown target status " + argNewStatus.getCode());
					}
				} else if (getStartingStatus() == QuestionStatusFactory.READY_FOR_REVIEW()) {
					if (argNewStatus == QuestionStatusFactory.ANSWER_CHOSEN()) {
						return true;
					} else if (argNewStatus == QuestionStatusFactory.DRAFTED()) {
						return true;
					} else if (argNewStatus == QuestionStatusFactory.READY_FOR_REVIEW()) {
						return true;
					} else if (argNewStatus == QuestionStatusFactory.APPROVED()) {
						return true;
					} else {
						throw new IllegalArgumentException("Unknown target status " + argNewStatus.getCode());
					}
				} else if (getStartingStatus() == QuestionStatusFactory.APPROVED()) {
					return false;
				} else {
					throw new IllegalArgumentException("Unknown starting status " + getStartingStatus().getCode());
				}
			}
		}
	}
	
	public static class LatexToHTMLConversionException extends IllegalArgumentException {
		private static final long serialVersionUID = 1L;
		
		public LatexToHTMLConversionException() {
			super();
		}
		
		public LatexToHTMLConversionException(String argMessage) {
			super(argMessage);
		}
		
		public LatexToHTMLConversionException(String argMessage, Throwable argCause) {
			super(argMessage, argCause);
		}
		
		public LatexToHTMLConversionException(Throwable argCause) {
			super(argCause);
		}
	}
	
	static boolean showPGs(int argBitField) {
		return (argBitField & SHOW_PRONUNCIATION_GUIDES) != 0;
	}
	
	static boolean showBuzzLinks(int argBitField) {
		return (argBitField & SHOW_BUZZ_LINKS) != 0;
	}
	
	static boolean isWordBreakingCharacter(char argC) {
		for (char lclWBC : WORD_BREAKING_CHARACTERS) {
			if (lclWBC == argC) {
				return true;
			}
		}
		return false;
	}
}
