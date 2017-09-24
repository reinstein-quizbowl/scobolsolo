package com.scobolsolo.servlets.tournament;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.Validate;

import com.opal.TransactionContext;

import com.scobolsolo.application.Account;
import com.scobolsolo.application.Category;
import com.scobolsolo.application.CategoryFactory;
import com.scobolsolo.application.CategoryUse;
import com.scobolsolo.application.CategoryUseFactory;
import com.scobolsolo.application.Tournament;
import com.scobolsolo.application.TournamentFactory;
import com.scobolsolo.servlets.ScobolSoloControllerServlet;

public class UpdateCategoryUses extends ScobolSoloControllerServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String RETURN_URL = "/tournament/categories.jsp";
	
	@Override
	protected String processInternalTwo(final HttpServletRequest argRequest, final HttpSession argSession, final Account argUser) {
		final Tournament lclT = Validate.notNull(TournamentFactory.getInstance().fromHttpRequest(argRequest));
		Validate.isTrue(argUser.mayActAsTournamentDirector(lclT), "Not authorized");
		
		final Set<Category> lclCs = CategoryFactory.getInstance().getAll();
		
		final Map<Category, CategoryUse> lclCurrentlyInUse = new ConcurrentHashMap<>(lclCs.size()); // THINK: Why did I use a ConcurrentHashMap here instead of a regular HashMap?
		for (final CategoryUse lclCU : lclT.getCategoryUseSet()) {
			lclCurrentlyInUse.put(lclCU.getCategory(), lclCU);
		}
		
		try (TransactionContext lclTC = TransactionContext.createAndActivate()) {
			for (final Category lclC : lclCs) {
				final CategoryUse lclExistingUse = lclCurrentlyInUse.get(lclC);
				final boolean lclUse = getBooleanParameter(argRequest, lclC.getCode());
				final int lclNeeds = getOptionalIntParameter(argRequest, lclC.getCode() + "_needs", -1);
				
				if (lclExistingUse == null) {
					// The combination is not currently possible.
					
					if (lclUse) {
						
						// The user decided to make it possible. We create an object representing that fact.
						CategoryUseFactory.getInstance().create()
							.setCategory(lclC)
							.setTournament(lclT)
							.setNeeds(lclNeeds > 0 ? lclNeeds : null);
					} else {
						// The input decided to keep it not-possible. We do nothing.
					}
				} else {
					// The category is currently in use.
					
					if (!lclUse) {
						// The input decided to make it not-possible. We delete the object that currently exists.
						lclExistingUse.unlink();
					} else {
						// It's being kept possible
						
						// Update the needs
						lclExistingUse.setNeeds(lclNeeds > 0 ? lclNeeds : null);
					}
				}
			}
			
			lclTC.complete();
		}
		
		return RETURN_URL + "?object=" + lclT.getUniqueString();
	}
}
