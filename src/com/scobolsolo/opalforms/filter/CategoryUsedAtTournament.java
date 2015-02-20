package com.scobolsolo.opalforms.filter;

import com.siliconage.util.Filter;

import com.scobolsolo.application.Category;
import com.scobolsolo.application.CategoryUse;
import com.scobolsolo.application.Tournament;

public class CategoryUsedAtTournament extends Filter<Category> {
	private final Tournament myTournament;
	
	public CategoryUsedAtTournament(final Tournament argT) {
		super();
		
		myTournament = argT; // may be null
	}
	
	@Override
	public boolean accept(final Category argC) {
		if (argC == null) {
			return false;
		}
		
		if (getTournament() == null) {
			return true;
		}
		
		for (final CategoryUse lclCU : argC.createCategoryUseArray()) {
			if (lclCU.getTournament() == getTournament()) {
				return true;
			}
		}
		
		return false;
	}
	
	public Tournament getTournament() {
		return myTournament;
	}
}
