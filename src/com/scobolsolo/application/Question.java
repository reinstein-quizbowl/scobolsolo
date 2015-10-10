package com.scobolsolo.application;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Comparator;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Map;
import java.util.HashMap;
import java.util.function.Predicate;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.xml.bind.DatatypeConverter;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

import org.scilab.forge.jlatexmath.TeXConstants;
import org.scilab.forge.jlatexmath.TeXFormula;
import org.scilab.forge.jlatexmath.TeXIcon;

import com.scobolsolo.persistence.QuestionUserFacing;

/**
 * This interface may be changed at will.
 *
 * <p>This interface and the {@link QuestionFactory} class are the only two automatically generated files for this type that are intended to be referenced in user code. Other automatically generated files package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */

public interface Question extends QuestionUserFacing {
	static final org.apache.log4j.Logger ourLogger = org.apache.log4j.Logger.getLogger(Question.class);
	
	static final Map<String, String> CACHED_MATH_RENDERS = new HashMap<>(); // We're not using an actual Guava cache because we don't really need to evict old entries
	
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
	
	default Diff getLastChange() {
		SortedSet<Diff> lclDiffs = getDiffs();
		if (lclDiffs.isEmpty()) {
			return null;
		} else {
			return lclDiffs.last();
		}
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
	
	default String outputTextHTML() {
		try {
			return latexToHTML(getText());
		} catch (LatexToHTMLConversionException lclE) {
			return "Couldn't convert: <code>" + lclE.getMessage() + "</code>";
		}
	}
	
	default String outputAnswerHTML() {
		try {
			return latexToHTML(getAnswer());
		} catch (LatexToHTMLConversionException lclE) {
			return "Couldn't convert: <code>" + lclE.getMessage() + "</code>";
		}
	}
	
	public static String latexToHTML(String argS) {
		if (StringUtils.isBlank(argS)) {
			return "&nbsp;";
		} else {
			StringBuilder lclSB = new StringBuilder(2*argS.length()); // lame guess
			
			boolean lclInItalics = false;
			boolean lclInUnderlining = false;
			boolean lclInMath = false;
			boolean lclInAlternateAnswerDirectives = false;
			ENTIRE_STRING:
			for (int lclI = 0; lclI < argS.length(); ++lclI) {
				char lclC = argS.charAt(lclI);
				char lclPrev = lclI == 0 ? ' ' : argS.charAt(lclI - 1); // eh
				char lclNext = lclI == argS.length() - 1 ? ' ' : argS.charAt(lclI + 1); // eh
				
				ENTIRE_STRING_POSSIBILITIES:
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
												if (lclBackslashChar == '`' || lclBackslashChar == '\'' || lclBackslashChar == '^' || lclBackslashChar == '"' || lclBackslashChar == 'H' || lclBackslashChar == '~' || lclBackslashChar == 'c' || lclBackslashChar == 'l' || lclBackslashChar == 'v' || lclBackslashChar == '=') {
													lclCommand = lclCommandSB.toString();
													lclArgs = Arrays.asList(String.valueOf(argS.charAt(lclJ + 1)));
													lclI += 2;
													break;
												} else if (lclBackslashChar == 'O' || lclBackslashChar == 'o') {
													lclCommand = lclCommandSB.toString();
													lclArgs = Collections.emptyList();
													lclI += 1;
													break;
												}
											}
										}
									}
								}
								
								BACKSLASH_COMMAND_POSSIBILITIES:
								switch (lclCommand) {
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
										Validate.isTrue(lclArgs.size() == 0);
										lclSB.append("&Oslash;");
										break;
									case "\\o": // slash-through
										Validate.isTrue(lclArgs.size() == 0);
										case "o": lclSB.append("&oslash;");
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
									case "\\pg":
										Validate.isTrue(lclArgs.size() == 2, "lclArgs = " + lclArgs);
										lclSB.append("<span class=\"has-pronunciation-guide\">").append(latexToHTML(lclArgs.get(0))).append("</span>&nbsp;<span class=\"pronunciation-guide\">").append(latexToHTML(lclArgs.get(1))).append("</span>");
										break;
									case "\\textsubscript":
										Validate.isTrue(lclArgs.size() == 1);
										lclSB.append("<sub>").append(lclArgs.get(0)).append("</sub>");
										break;
									case "\\textsuperscript":
										Validate.isTrue(lclArgs.size() == 1);
										lclSB.append("<sup>").append(lclArgs.get(0)).append("</sup>");
										break;
									default: throw new LatexToHTMLConversionException("We don't know how to process the command '" + lclCommand + "' / " + lclArgs);
								}
						}
						
						break;
					case '$': // FIXME: This will break if the math portion contains \$
						if (lclInMath) {
							// It's the end.
						} else {
							String lclMath = argS.substring(lclI+1, argS.indexOf("$", lclI+1));
							String lclEncodedLatex;
							if (!CACHED_MATH_RENDERS.containsKey(lclMath)) {
								TeXFormula lclFormula = new TeXFormula(lclMath);
								TeXIcon lclIcon = lclFormula.createTeXIcon(TeXConstants.STYLE_DISPLAY, 18);
								BufferedImage lclImage = new BufferedImage(lclIcon.getIconWidth(), lclIcon.getIconHeight(), BufferedImage.TYPE_4BYTE_ABGR);
								
								// Trim the image
								int lclFirstNonWhiteX = 0;
								int lclFirstNonWhiteY = 0;
								Y_COORDS_FWD:
								for (int lclY = 0; lclY < lclImage.getHeight(); ++lclY) {
									X_COORDS_FWD:
									for (int lclX = 0; lclX < lclImage.getWidth(); ++lclX) {
										Color lclPixelColor = new Color(lclImage.getRGB(lclX, lclY));
										if (!lclPixelColor.equals(Color.WHITE)) {
											lclFirstNonWhiteX = lclX;
											lclFirstNonWhiteY = lclY;
											break Y_COORDS_FWD;
										}
									}
								}
								
								int lclLastNonWhiteX = lclImage.getWidth() - 1;
								int lclLastNonWhiteY = lclImage.getHeight() - 1;
								Y_COORDS_BWD:
								for (int lclY = lclImage.getHeight() - 1; lclY >= 0; --lclY) {
									X_COORDS_BWD:
									for (int lclX = lclImage.getWidth() - 1; lclX >= 0; --lclX) {
										Color lclPixelColor = new Color(lclImage.getRGB(lclX, lclY));
										if (!lclPixelColor.equals(Color.WHITE)) {
											lclLastNonWhiteX = lclX;
											lclLastNonWhiteY = lclY;
											break Y_COORDS_BWD;
										}
									}
								}
								
								lclImage = lclImage.getSubimage(lclFirstNonWhiteX, lclFirstNonWhiteY, lclLastNonWhiteX - lclFirstNonWhiteX, lclLastNonWhiteY - lclFirstNonWhiteY);
								
								lclIcon.paintIcon(null, lclImage.getGraphics(), 0, 0);
								try {
									ByteArrayOutputStream lclMathOut = new ByteArrayOutputStream();
									ImageIO.write(lclImage, "png", lclMathOut);
									lclEncodedLatex = DatatypeConverter.printBase64Binary(lclMathOut.toByteArray());
									CACHED_MATH_RENDERS.put(lclMath, lclEncodedLatex);
								} catch (IOException lclIOE) {
									ourLogger.error("Could not write math image", lclIOE);
									lclSB.append(lclMath);
								}
							}
							
							lclSB.append("<img class=\"math\" src=\"data:image/png;base64,").append(CACHED_MATH_RENDERS.get(lclMath)).append("\" alt=\"").append(lclMath).append("\" />");
							
							lclI += lclMath.length();
						}
						lclInMath = !lclInMath;
						break;
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
						lclSB.append("&middot;");
						break;
					default:
						lclSB.append(lclC);
				}
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
}
