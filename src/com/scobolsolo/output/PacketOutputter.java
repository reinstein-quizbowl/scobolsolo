package com.scobolsolo.output;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

import com.scobolsolo.application.Packet;
import com.scobolsolo.application.Placement;
import com.scobolsolo.application.Question;
import com.scobolsolo.ScobolSoloConfiguration;
import com.scobolsolo.Utility;

public class PacketOutputter extends TournamentSpecificLaTeXOutputter {
	private final Packet myPacket;
	
	public PacketOutputter(final Packet argPacket) {
		super(makeFile(argPacket, false), argPacket.getTournament());
		
		myPacket = argPacket; // null-checked by makeFile()
	}
	
	public Packet getPacket() {
		return myPacket;
	}
	
	@Override
	public void outputInternal() {
		final List<Placement> lclRegulation = getPacket().getRegulationPlacements();
		final List<Placement> lclOvertime = getPacket().getOvertimePlacements();
		
		getWriter().println("\\documentclass[12pt]{scobolsolopacket}");
		getWriter().println();
		getWriter().println("\\def\\theTournament{" + escape(getPacket().getTournament().getName()) + "}");
		getWriter().println("\\def\\thePacket{" + escape(getPacket().getNameWithRound()) + "}");
		getWriter().println();
		getWriter().println("\\begin{document}");
		getWriter().println();
		getWriter().println("\\begin{tossups}");
		getWriter().println();
		
		// #1 the placement ID, #2 the in-packet number, #3 the value 1 for overtime or 0 for regulation, #4 the previous placement ID if defined or -1 if not, #5 and the next placement ID if defined or -1 if not
		
		for (int lclI = 0; lclI < lclRegulation.size(); ++lclI) {
			final Placement lclPL = lclRegulation.get(lclI);
			if (lclPL.isEmpty()) {
				continue;
			}
			
			final Placement lclPrev = lclI == 0 ? null : lclRegulation.get(lclI - 1);
			
			Placement lclNext;
			if (lclI < lclRegulation.size() - 1) {
				lclNext = lclRegulation.get(lclI + 1);
			} else if (lclOvertime.isEmpty()) {
				lclNext = null;
			} else {
				lclNext = lclOvertime.get(0);
			}
			
			final List<String> lclTossupEnvironmentArguments = Arrays.asList(
				lclPL.getIdAsObject().toString(),
				lclPL.getNumberAsObject().toString(),
				"0", // regulation
				lclPrev == null ? "-1" : lclPrev.getIdAsObject().toString(),
				lclNext == null ? "-1" : lclNext.getIdAsObject().toString()
			);
			
			final Question lclQ = Validate.notNull(lclPL.getQuestion());
			
			getWriter().println("\\begin{tossup}{" + StringUtils.join(lclTossupEnvironmentArguments, "}{") + "}");
			getWriter().println("\t\\question{" + questionTextToLatex(lclQ.getText()) + "}");
			getWriter().println("\t\\answer{" + answerLineToLatex(lclQ.getAnswer()) + "}");
			getWriter().println("\\end{tossup}");
			getWriter().println();
			
			if (lclNext == null || lclI == lclRegulation.size() - 1) { // We have to check separately because we fudged lclNext as the first overtime tossup for navigation arrow purposes
				// Last of regulation
				if (lclOvertime.isEmpty()) {
					getWriter().println("\\packetOver");
					getWriter().println();
				} else {
					getWriter().println("\\regulationOver");
					getWriter().println();
				}
			} else {
				if (lclPL.isScorecheckAfter()) {
					getWriter().println("\\scorecheck");
					getWriter().println();
				}
			}
		}
		
		if (!lclOvertime.isEmpty()) {
			for (int lclI = 0; lclI < lclOvertime.size(); ++lclI) {
				final Placement lclPL = lclOvertime.get(lclI);
				if (lclPL.isEmpty()) {
					continue;
				}
				
				Placement lclPrev;
				if (lclI == 0) {
					if (lclRegulation.isEmpty()) {
						lclPrev = null;
					} else {
						lclPrev = lclRegulation.get(lclRegulation.size() - 1);
					}
				} else {
					lclPrev = lclOvertime.get(lclI - 1);
				}
				
				final Placement lclNext = lclI == lclOvertime.size() - 1 ? null : lclOvertime.get(lclI + 1);
				
				final List<String> lclTossupEnvironmentArguments = Arrays.asList(
					lclPL.getIdAsObject().toString(),
					lclPL.getNumberAsObject().toString(),
					"1", // overtime
					lclPrev == null ? "-1" : lclPrev.getIdAsObject().toString(),
					lclNext == null ? "-1" : lclNext.getIdAsObject().toString()
				);
				
				final Question lclQ = Validate.notNull(lclPL.getQuestion());
				
				getWriter().println("\\begin{tossup}{" + StringUtils.join(lclTossupEnvironmentArguments, "}{") + "}");
				getWriter().println("\t\\question{" + questionTextToLatex(lclQ.getText()) + "}");
				getWriter().println("\t\\answer{" + answerLineToLatex(lclQ.getAnswer()) + "}");
				getWriter().println("\\end{tossup}");
				getWriter().println();
				
				if (lclNext == null) {
					getWriter().println("\\overtimeOver");
				} else {
					if (lclPL.isScorecheckAfter()) {
						getWriter().println("\\scorecheckInOvertime");
						getWriter().println();
					}
				}
			}
		}
		
		getWriter().println();
		getWriter().println("\\end{tossups}");
		getWriter().println();
		getWriter().println("\\end{document}");
	}
	
	public static String makeFilename(final Packet argP, final boolean argMultipleTournaments) {
		Validate.notNull(argP);
		
		if (argMultipleTournaments) {
			return Utility.cleanFilename(argP.getTournament().getShortName() + '-' + argP.getName()) + ".tex";
		} else {
			return Utility.cleanFilename(argP.getName()) + ".tex";
		}
	}
	
	public static File makeFile(final Packet argP, final boolean argMultipleTournaments) {
		Validate.notNull(argP);
		
		return new File(ScobolSoloConfiguration.getInstance().getString("DATA_DIRECTORY") + File.separator + ScobolSoloConfiguration.getInstance().getString("OUTPUTTED_PACKETS_SUBDIRECTORY") + File.separator + makeFilename(argP, argMultipleTournaments));
	}
	
	public static String questionTextToLatex(final String argQuestionText) {
		Validate.notNull(argQuestionText);
		
		final StringBuilder lclSB = new StringBuilder(argQuestionText.length() + 100); // half-assed guess
		
		boolean lclInItalics = false;
		boolean lclInDoubleQuotes = false;
		boolean lclUnderlining = false;
		boolean lclInMath = false;
		
		char lclPrev = ' ';
		for (final char lclC : argQuestionText.toCharArray()) {
			switch (lclC) {
				case '$':
					if (lclPrev == '\\') {
						lclSB.append(lclC);
					} else {
						lclInMath = !lclInMath;
						lclSB.append(lclC);
					}
					break;
				
				case '~':
					if (lclPrev == '\\') {
						lclSB.append(lclC);
					} else {
						if (lclInItalics) {
							lclSB.append('}');
							lclInItalics = false;
						} else {
							lclSB.append("\\textit{");
							lclInItalics = true;
						}
					}
					break;
				
				case '"':
					if (lclPrev == '\\') {
						lclSB.append(lclC);
					} else {
						if (lclInDoubleQuotes) {
							lclSB.append("''");
							lclInDoubleQuotes = false;
						} else {
							lclSB.append("``");
							lclInDoubleQuotes = true;
						}
					}
					break;
				
				case '\u201C':
					lclSB.append("``");
					lclInDoubleQuotes = true;
					break;
				
				case '\u201D':
					lclSB.append("''");
					lclInDoubleQuotes = false;
					break;
				
				case '\u2018':
					lclSB.append("`");
					break;
				
				case '\u2019':
					lclSB.append("'");
					break;
				
				case '\u2013':
					lclSB.append("--");
					break;
				
				case '\u2014':
					lclSB.append("---");
					break;
				
				case '_':
					if (lclInMath) {
						lclSB.append('_');
					} else {
						if (lclUnderlining) {
							lclSB.append('}');
							lclUnderlining = false;
						} else {
							lclSB.append("\\req{");
							lclUnderlining = true;
						}
					}
					break;
				
				case '&':
					lclSB.append("\\&");
					break;
				
				case '*':
					if (lclPrev == '\\' || lclInMath) {
						lclSB.append('*');
					} else {
						lclSB.append("{\\syl}");
					}
					break;
				
				case '>':
					if (lclInMath) {
						lclSB.append('>');
					} else {
						lclSB.append('~');
					}
					break;
				
				default:
					lclSB.append(lclC);
			}
			
			lclPrev = lclC;
		}
		
		return lclSB.toString().trim();
	}
	
	public static String answerLineToLatex(final String argAnswerLine) {
		Validate.notNull(argAnswerLine);
		
		return questionTextToLatex(argAnswerLine);
	}
}
