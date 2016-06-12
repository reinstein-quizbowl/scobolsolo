package com.scobolsolo.servlets;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.Validate;

import com.opal.TransactionContext;

import com.scobolsolo.application.Account;
import com.scobolsolo.application.Category;
import com.scobolsolo.application.CategoryFactory;
import com.scobolsolo.application.PronunciationGuideSuppression;
import com.scobolsolo.application.PronunciationGuideSuppressionFactory;

public class UpdatePronunciationGuidePreferences extends ScobolSoloControllerServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String RETURN_URL = "/account/";
	
	@Override
	protected String processInternalTwo(final HttpServletRequest argRequest, final HttpSession argSession, final Account argUser) {
		final Set<Category> lclCategoriesToShowPGsFor = CategoryFactory.getInstance().acquireFromHttpRequest(new HashSet<>(), argRequest);
		
		try (TransactionContext lclTC = TransactionContext.createAndActivate()) {
			for (final Category lclC : CategoryFactory.getInstance().createAllArray()) {
				if (lclC.isAllowPronunciationGuideSuppression()) {
					final boolean lclOldSetting = argUser.showPronunciationGuidesFor(lclC);
					final boolean lclNewSetting = lclCategoriesToShowPGsFor.contains(lclC);
					
					if (lclNewSetting == lclOldSetting) {
						// Nothing to do
					} else if (lclNewSetting == false) {
						Validate.isTrue(lclOldSetting);
						
						// We have to add a suppression.
						argUser.addPronunciationGuideSuppression(
							PronunciationGuideSuppressionFactory.getInstance().create().setCategory(lclC)
						);
					} else if (lclNewSetting == true) {
						Validate.isTrue(lclOldSetting == false);
						
						// We have to remove a suppression.
						Collection<PronunciationGuideSuppression> lclPGSes = argUser.streamPronunciationGuideSuppression()
							.filter(argPGS -> argPGS.getCategory() == lclC)
							.collect(Collectors.toList());
						Validate.notEmpty(lclPGSes, "Expected to find a suppression record, but found none for " + argUser.getContact().getName() + " / " + lclC.getCode());
						// lclPGSes should in fact have a size of precisely 1, but if the unique key got violated we can handle it smoothly enough
						for (final PronunciationGuideSuppression lclPGS : lclPGSes) {
							lclPGS.unlink();
						}
					}
				}
			}
			
			lclTC.complete();
		}
		
		return RETURN_URL;
	}
}
