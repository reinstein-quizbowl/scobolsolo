package com.scobolsolo.menu;

import org.apache.commons.lang3.Validate;

import com.scobolsolo.application.Game;
import com.scobolsolo.application.Packet;
import com.scobolsolo.application.Placement;
import com.scobolsolo.application.Player;
import com.scobolsolo.matches.QuestionResponse;

public abstract class GameEntryQuestionMenu {
	public static String outputFoundationMenu(final Game argGame, final String argCurrent, final Player argLeftPlayer, final Player argRightPlayer, final int argCurrentQuestionIndex, final boolean argReplacement, final boolean argOvertime) {
		Validate.notNull(argGame);
		Validate.notBlank(argCurrent);
		Validate.notNull(argLeftPlayer);
		Validate.notNull(argRightPlayer);
		Validate.isTrue(argCurrentQuestionIndex >= -1); // -1 indicates that we're not outputting this in the context of a specific question
		
		final Packet lclPacket = argGame.getMatch().getRound().getPacket();
		
		final StringBuilder lclSB = new StringBuilder();
		lclSB.append("		<h2>").append(argCurrent).append("</h2>");
		if (argCurrentQuestionIndex >= 0) {
			lclSB.append("		<dl class=\"sub-nav\">")
				.append("			<dt>Actions</dt>");
			if (argCurrentQuestionIndex >= 0) {
				lclSB.append("				<dd><a href=\"").append(QuestionResponse.generateQueryString(argGame, argRightPlayer, argLeftPlayer, argCurrentQuestionIndex, argReplacement, argOvertime)).append("\">switch sides</a></dd>");
			}
			if (argReplacement) {
				lclSB.append("				<dd><a href=\"").append(QuestionResponse.generateQueryString(argGame, argLeftPlayer, argRightPlayer, argCurrentQuestionIndex, false, argOvertime)).append("\">cancel replacement</a></dd>");
			} else {
				lclSB.append("				<dd><a href=\"").append(QuestionResponse.generateQueryString(argGame, argLeftPlayer, argRightPlayer, argCurrentQuestionIndex, true, argOvertime)).append("\">replace question</a></dd>");
			}
			lclSB.append("		</dl>");
		}
		
		lclSB.append("		<dl class=\"sub-nav\">")
			.append("			<dt>Question</dt>");
		int lclIndex = 0;
		for (Placement lclRegPL : lclPacket.getRegulationPlacements()) {
			lclSB.append("				<dd").append(!argOvertime && lclIndex == argCurrentQuestionIndex ? " class=\"active\"" : "").append("><a href=\"").append(QuestionResponse.generateQueryString(argGame, argLeftPlayer, argRightPlayer, lclIndex, false, false)).append("\">").append(lclRegPL.getNumber()).append("</a></dd>");
			++lclIndex;
		}
		lclSB.append("		</dl>");
		
		if (argOvertime) {
			lclSB.append("			<dl class=\"sub-nav\">")
				.append("				<dt>Tiebreakers</dt>");
				lclIndex = 0;
				for (Placement lclOTPL : lclPacket.getOvertimePlacements()) {
					lclSB.append("					<dd").append(lclIndex == argCurrentQuestionIndex ? " class=\"active\"" : "").append("><a href=\"").append(QuestionResponse.generateQueryString(argGame, argLeftPlayer, argRightPlayer, lclIndex, false, true)).append("\">").append(lclOTPL.getNumber()).append("</a></dd>");
					++lclIndex;
				}
			lclSB.append("			</dl>");
		}
		
		return lclSB.toString();
	}
}