package com.scobolsolo.output;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.Validate;

import com.scobolsolo.application.Card;
import com.scobolsolo.application.Match;
import com.scobolsolo.application.Phase;
import com.scobolsolo.application.Round;

public class PlayerCardOutputter extends PhaseSpecificLaTeXOutputter {
	public PlayerCardOutputter(final File argOutputFile, final Phase argP) {
		super(argOutputFile, argP);
	}
	
	@Override
	public void outputInternal() {
		getWriter().println("\\documentclass[11pt]{scobolsolo}");
		getWriter().println("\\usepackage[top=.5in, bottom=.5in, left=.5in, right=.5in]{geometry}");
		getWriter().println();
		getWriter().println("\\begin{document}");
		
		Validate.isTrue(getPhase().isCardSystem());
		
		final Card[] lclCards = getPhase().createCardArray();
		Arrays.sort(lclCards);
		final Card lclFirstCard = lclCards[0];
		final Card lclLastCard = lclCards[lclCards.length - 1];
		Arrays.sort(lclCards, Card.InitialPlayerSchoolNameComparator.getInstance());
		
		final List<Round> lclRounds = getPhase().getRounds();
		
		for (final Card lclC : lclCards) {
			getWriter().println("\\begin{center}");
			getWriter().println("\\TournamentTitle{" + escape(getTournament().getName()) + "}");
			getWriter().println();
			getWriter().println("\\vspace{12pt}");
			getWriter().println();
			getWriter().println("\\CardNumberHeader{" + escape(lclC.getShortName()) + "}");
			getWriter().println();
			
			if (lclC.getInitialPlayer() != null) {
				getWriter().println("\\InitialPossessor{" + escape(lclC.getInitialPlayer().getNameWithSchool()) + "}");
				getWriter().println();
			}
			
			getWriter().println("\\vspace{12pt}");
			getWriter().println();
			getWriter().println("\\CardTradingInstructionsForPlayer{" + escape(lclFirstCard.getShortName()) + "}{" + escape(lclLastCard.getShortName()) + "}");
			getWriter().println();
			getWriter().println("\\vspace{12pt}");
			
			getWriter().println("\\rowcolors*{2}{gray}{white}");
			getWriter().println("\\begin{tabular}{C{3cm}C{3cm}C{3cm}C{3cm}}");
			getWriter().println("\\rowcolor[gray]{0} \\ColumnHeader{Round} & \\ColumnHeader{Time} & \\ColumnHeader{Room} & \\ColumnHeader{Opponent} \\tabularnewline");
			
			final Map<Round, Match> lclMatchMap = new HashMap<>(lclRounds.size());
			for (final Match lclM : lclC.getWinningMatchSet()) {
				lclMatchMap.put(lclM.getRound(), lclM);
			}
			for (final Match lclM : lclC.getLosingMatchSet()) {
				lclMatchMap.put(lclM.getRound(), lclM);
			}
			
			for (final Round lclR : lclRounds) {
				final Match lclM = lclMatchMap.get(lclR); // may be null, indicating a bye
				
				getWriter().print("\\RoundNumber{" + escape(lclR.getShortName()) + "} & ");
				getWriter().print("\\RoundTime{" + escape(lclR.getStartTime()) + "} & ");
				
				if (lclM == null) {
					getWriter().print("\\multicolumn{2}{c}{\\CardBye}");
				} else {
					getWriter().print("\\RoomNumber{" + escape(lclM.getRoom().getShortName()) + "} & ");
					
					if (lclM.isDual()) {
						final Card lclOpponentCard = lclM.getWinningCard() == lclC ? lclM.getLosingCard() : lclM.getWinningCard();
						getWriter().print("\\OpponentCard{" + escape(lclOpponentCard.getShortName()) + "}");
					} // else, leave it blank
				}
				
				getWriter().println("\\tabularnewline");
				
				if (lclR.isLunchAfter()) {
					getWriter().println("\\CardLunchLine");
				}
			}
			
			getWriter().println("\\end{tabular}");
			
			if (lclC.getFinalMessage() != null) {
				getWriter().println();
				getWriter().println("\\vspace{20pt}");
				getWriter().println("\\CardFinalMessage{" + escape(lclC.getFinalMessage()) + "}");
			}
			
			getWriter().println("\\end{center}");
			getWriter().println();
			getWriter().println("\\newpage");
		}
		
		getWriter().println("\\end{document}");
	}
}
