package com.scobolsolo.menu;

import org.apache.commons.lang3.Validate;

public enum MenuType {
	BOOTSTRAP,
	FOUNDATION;
	
	public static class UnknownMenuTypeException extends RuntimeException {
		private static final long serialVersionUID = 1L;
		
		private final MenuType myMenuType;
		
		public UnknownMenuTypeException(final MenuType argMT) {
			super();
			
			myMenuType = Validate.notNull(argMT);
		}
		
		@Override
		public String getMessage() {
			return "Unknown menu type '" + myMenuType + '\'';
		}
	}
}
