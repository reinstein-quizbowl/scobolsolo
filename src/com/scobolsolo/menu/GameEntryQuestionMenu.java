package com.scobolsolo.menu;

import org.apache.commons.lang3.Validate;

import com.scobolsolo.application.Game;
import com.scobolsolo.application.Packet;
import com.scobolsolo.application.Placement;
import com.scobolsolo.application.Player;
import com.scobolsolo.matches.QuestionResponse;

public final class GameEntryQuestionMenu {
	private GameEntryQuestionMenu() {
		throw new UnsupportedOperationException();
	}
	
	public static String outputFoundationMenu(final Game argGame, final String argCurrent, final Player argLeftPlayer, final Player argRightPlayer, final int argCurrentQuestionIndex, final boolean argReplacement, final boolean argReplacementAvailable, final boolean argOvertime) {
		Validate.notNull(argGame);
		Validate.notBlank(argCurrent);
		Validate.notNull(argLeftPlayer);
		Validate.notNull(argRightPlayer);
		Validate.isTrue(argCurrentQuestionIndex >= -1); // -1 indicates that we're not outputting this in the context of a specific question
		
		final Packet lclPacket = argGame.getMatch().getRound().getPacket();
		
		final StringBuilder lclSB = new StringBuilder();
		lclSB.append("		<h2>").append(argCurrent).append("</h2>");
		if (argCurrentQuestionIndex >= 0) {
			lclSB.append("		<ul class=\"menu\">")
				.append("			<li class=\"menu-text\">Actions</li>")
				.append("			<li><a href=\"").append(QuestionResponse.generateQueryString(argGame, argRightPlayer, argLeftPlayer, argCurrentQuestionIndex, argReplacement, argOvertime)).append("\">switch sides</a></li>");
			if (argReplacement) {
				lclSB.append("		<li><a href=\"").append(QuestionResponse.generateQueryString(argGame, argLeftPlayer, argRightPlayer, argCurrentQuestionIndex, false, argOvertime)).append("\">cancel replacement</a></li>");
			} else if (argReplacementAvailable) {
				lclSB.append("		<li><a href=\"").append(QuestionResponse.generateQueryString(argGame, argLeftPlayer, argRightPlayer, argCurrentQuestionIndex, true, argOvertime)).append("\">replace question</a></li>");
			}
			lclSB.append("		</ul>");
		}
		
		lclSB.append("		<ul class=\"menu\">")
			.append("			<li class=\"menu-text\">Question</li>");
		int lclIndex = 0;
		for (final Placement lclRegPL : lclPacket.getRegulationPlacements()) {
			lclSB.append("		<li").append(!argOvertime && lclIndex == argCurrentQuestionIndex ? " class=\"active\"" : "").append("><a href=\"").append(QuestionResponse.generateQueryString(argGame, argLeftPlayer, argRightPlayer, lclIndex, false, false)).append("\">").append(lclRegPL.getNumber()).append("</a></li>");
			++lclIndex;
		}
		lclSB.append("		</ul>");
		
		if (argOvertime) {
			lclSB.append("		<ul class=\"menu\">")
				.append("			<li class=\"menu-text\">Tiebreakers</li>");
				lclIndex = 0;
				for (final Placement lclOTPL : lclPacket.getOvertimePlacements()) {
					lclSB.append("				<li").append(lclIndex == argCurrentQuestionIndex ? " class=\"active\"" : "").append("><a href=\"").append(QuestionResponse.generateQueryString(argGame, argLeftPlayer, argRightPlayer, lclIndex, false, true)).append("\">").append(lclOTPL.getNumber()).append("</a></li>");
					++lclIndex;
				}
			lclSB.append("		</ul>");
		}
		
		return lclSB.toString();
	}
}