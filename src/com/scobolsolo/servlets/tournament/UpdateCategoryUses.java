package com.scobolsolo.servlets.tournament;

import java.util.Map;
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
	protected String processInternalTwo(final HttpServletRequest argRequest, final HttpSession argSession, final Account argUser) throws Exception {
		final Tournament lclT = Validate.notNull(TournamentFactory.getInstance().fromHttpRequest(argRequest));
		Validate.isTrue(argUser.mayUpdate(lclT), "Not authorized");
		
		final Category[] lclCs = CategoryFactory.getInstance().createAllArray();
		
		final Map<Category, CategoryUse> lclCurrentlyInUse = new ConcurrentHashMap<>(lclCs.length); // Why did I use a ConcurrentHashMap here instead of a regular HashMap?
		for (final CategoryUse lclCU : lclT.createCategoryUseArray()) {
			lclCurrentlyInUse.put(lclCU.getCategory(), lclCU);
		}
		
		try (TransactionContext lclTC = TransactionContext.createAndActivate()) {
			for (final Category lclC : lclCs) {
				final CategoryUse lclCU = lclCurrentlyInUse.get(lclC);
				if (lclCU == null) {
					// The combination is not currently possible.
					final String lclParam = argRequest.getParameter(lclC.getCode());
					if (lclParam != null) {
						// The user decided to make it possible. We create an object representing that fact.
						Validate.isTrue(Boolean.parseBoolean(lclParam));
						final CategoryUse lclNewCU = CategoryUseFactory.getInstance().create();
						lclNewCU.setCategory(lclC);
						lclNewCU.setTournament(lclT);
					} else {
						// The input decided to keep it not-possible. We do nothing.
					}
				} else {
					// The category is currently in use.
					final String lclParam = argRequest.getParameter(lclC.getCode());
					if (lclParam == null) {
						// The input decided to make it not-possible. We delete the object that currently exists.
						lclCU.unlink();
					} else {
						// It's possible according to the user input, too. Just to be safe, we'll make sure the parameter value is consistent with that.
						Validate.isTrue(Boolean.parseBoolean(lclParam));
					}
				}
			}
			
			lclTC.complete();
		}
		
		return RETURN_URL + "?object=" + lclT.getUniqueString();
	}
}
