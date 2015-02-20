package com.scobolsolo.application;

public abstract class AccountDelegate {
	static boolean mayUpdate(final Account argA, final Tournament argT) {
		if (argA == null || argT == null) {
			return false;
		}
		
		if (argA.isAdministrator()) {
			return true;
		}
		
		return argA.getContact().streamStaff().filter(argS -> argS.getTournament() == argT).findAny().isPresent();
	}
}
