package com.scobolsolo.opalforms.filter;

import com.siliconage.util.Filter;

import com.scobolsolo.application.Question;

public final class QuestionUnused extends Filter<Question> {
	private static final QuestionUnused ourInstance = new QuestionUnused();
	
	public static QuestionUnused getInstance() {
		return ourInstance;
	}
	
	private QuestionUnused() {
		super();
	}
	
	@Override
	public boolean accept(final Question argQ) {
		return argQ != null && argQ.getPlacementCount() == 0;
	}
}
