package com.scobolsolo.output;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.Validate;

import com.scobolsolo.application.Card;
import com.scobolsolo.application.Match;
import com.scobolsolo.application.Phase;
import com.scobolsolo.application.Round;

public class MasterByCardOutputter extends PhaseSpecificLaTeXOutputter {
	public MasterByCardOutputter(final File argOutputFile, final Phase argP) {
		super(argOutputFile, argP);
	}
	
	@Override
	public void outputInternal() {
		getWriter().println("\\documentclass[10pt,landscape]{scobolsolo}");
		getWriter().println("\\newgeometry{top=.5in, bottom=.3in, left=.4in, right=.4in}");
		getWriter().println("\\setlength\\RegularSize{9pt}");
		getWriter().println("\\setlength\\RegularLH{12pt}");
		getWriter().println("\\setlength\\tabcolsep{1pt}");
		getWriter().println();
		getWriter().println("\\begin{document}");
		
		Validate.isTrue(getPhase().isCardSystem());
		final List<Round> lclRounds = getPhase().getRounds();
		
		getWriter().println("\\begin{center}");
		getWriter().println("\\TournamentTitle{" + escape(getTournament().getName()) + "}");
		getWriter().println();
		getWriter().println("\\vspace{12pt}");
		
		getWriter().println("\\rowcolors*{2}{gray}{white}");
		getWriter().print("\\begin{longtable}{|C{0.9cm}|");
		for (@SuppressWarnings("unused") final Round lclR : lclRounds) {
			getWriter().print("C{0.8cm}C{0.8cm}|");
		}
		getWriter().println("}");
		getWriter().println("\\hline");
		
		getWriter().print("\\rowcolor[gray]{0}  \\ColumnHeader{Card} & ");
		Iterator<Round> lclRI = lclRounds.iterator();
		while (lclRI.hasNext()) {
			final Round lclR = lclRI.next();
			getWriter().print("\\multicolumn{2}{c|}{\\ColumnHeader{" + lclR.getName() + "}}");
			
			if (lclRI.hasNext()) {
				getWriter().print(" & ");
			}
		}
		getWriter().println(" \\tabularnewline");
		
		getWriter().print("\\rowcolor[gray]{0} & ");
		lclRI = lclRounds.iterator();
		while (lclRI.hasNext()) {
			@SuppressWarnings("unused") final Round lclR = lclRI.next();
			getWriter().print(" \\SmallColumnHeader{Opp} & \\SmallColumnHeader{Rm}");
			
			if (lclRI.hasNext()) {
				getWriter().print(" & ");
			}
		}
		getWriter().println(" \\tabularnewline");
		getWriter().println("\\hline");
		getWriter().println("\\endhead");
		getWriter().println("\\hline");
		getWriter().println("\\endfoot");
		
		for (final Card lclC : getPhase().getCards()) {
			final Map<Round, Match> lclMatchMap = new HashMap<>(lclRounds.size());
			for (final Match lclM : lclC.getWinningMatchSet()) {
				lclMatchMap.put(lclM.getRound(), lclM);
			}
			for (final Match lclM : lclC.getLosingMatchSet()) {
				lclMatchMap.put(lclM.getRound(), lclM);
			}
			
			getWriter().print(lclC.getShortName() + " & ");
			
			lclRI = lclRounds.iterator();
			while (lclRI.hasNext()) {
				final Round lclRound = lclRI.next();
				
				final Match lclM = lclMatchMap.get(lclRound); // may be null, indicating a bye
				if (lclM == null) {
					getWriter().print(" - & - ");
				} else {
					final Card lclOpponentCard = lclM.getWinningCard() == lclC ? lclM.getLosingCard() : lclM.getWinningCard();
					getWriter().print("\\tiny" + escape(lclOpponentCard.getShortName()) + " & \\tiny " + escape(lclM.getRoom().getShortName()));
				}
				
				if (lclRI.hasNext()) {
					getWriter().print(" & ");
				}
			}
			
			getWriter().println("\\tabularnewline");
		}
		
		getWriter().println("\\end{longtable}");
		getWriter().println("\\end{center}");
		getWriter().println("\\end{document}");
	}
}
