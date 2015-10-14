package com.scobolsolo.output;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.tuple.Pair;

import com.scobolsolo.application.Packet;
import com.scobolsolo.application.Placement;
import com.scobolsolo.application.Question;
import com.scobolsolo.application.Tournament;
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
		List<Placement> lclPLs = Arrays.asList(getPacket().createPlacementArray());
		lclPLs.sort(null);
		
		int lclFirstNumber = lclPLs.stream()
			.filter(Placement::isFilled)
			.mapToInt(Placement::getNumber)
			.min().orElse(0);
		
		getWriter().println("\\documentclass[12pt]{scobolsolopacket}");
		getWriter().println();
		getWriter().println("\\def\\theTournament{" + escape(getPacket().getTournament().getName()) + "}");
		getWriter().println("\\def\\thePacket{" + escape(getPacket().getNameWithRound()) + "}");
		getWriter().println("\\def\\theFirstNumber{" + lclFirstNumber + "}");
		getWriter().println();
		getWriter().println("\\begin{document}");
		getWriter().println();
		getWriter().println("\\begin{tossups}");
		getWriter().println();
		
		for (Placement lclPL : lclPLs) {
			if (lclPL.isEmpty()) {
				continue;
			}
			Question lclQ = Validate.notNull(lclPL.getQuestion());
			
			getWriter().println("\\begin{tossup}");
			getWriter().println("\t\\question{" + questionTextToLatex(lclQ.getText()) + "}");
			getWriter().println("\t\\answer{" + answerLineToLatex(lclQ.getAnswer()) + "}");
			getWriter().println("\\end{tossup}");
			getWriter().println();
		}
		
		getWriter().println();
		getWriter().println("\\end{tossups}");
		getWriter().println();
		getWriter().println("\\end{document}");
	}
	
	public static String makeFilename(Packet argP, boolean argMultipleTournaments) {
		Validate.notNull(argP);
		
		if (argMultipleTournaments) {
			return Utility.cleanFilename(argP.getTournament().getShortName() + '-' + argP.getName()) + ".tex";
		} else {
			return Utility.cleanFilename(argP.getName()) + ".tex";
		}
	}
	
	public static File makeFile(Packet argP, boolean argMultipleTournaments) {
		Validate.notNull(argP);
		
		return new File(ScobolSoloConfiguration.getInstance().getString("DATA_DIRECTORY") + File.separator + ScobolSoloConfiguration.getInstance().getString("OUTPUTTED_PACKETS_SUBDIRECTORY") + File.separator + makeFilename(argP, argMultipleTournaments));
	}
	
	public static String questionTextToLatex(String argQuestionText) {
		Validate.notNull(argQuestionText);
		
		StringBuilder lclSB = new StringBuilder(argQuestionText.length() + 100); // half-assed guess
		
		boolean lclInItalics = false;
		boolean lclInDoubleQuotes = false;
		boolean lclUnderlining = false;
		boolean lclInMath = false;
		
		char lclPrev = ' ';
		for (char lclC : argQuestionText.toCharArray()) {
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
				
				case '_':
					if (!lclInMath) {
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
					lclSB.append("{\\syl}");
					break;
				
				default:
					lclSB.append(lclC);
			}
			
			lclPrev = lclC;
		}
		
		return lclSB.toString();
	}
	
	public static String answerLineToLatex(String argAnswerLine) {
		Validate.notNull(argAnswerLine);
		
		return questionTextToLatex(argAnswerLine);
	}
}
