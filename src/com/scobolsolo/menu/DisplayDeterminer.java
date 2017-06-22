package com.scobolsolo.menu;

import com.scobolsolo.application.Account;

@FunctionalInterface
public interface DisplayDeterminer {
	public static final DisplayDeterminer Always = argA -> true;
	public static final DisplayDeterminer Never = argA -> false;
	public static final DisplayDeterminer ToAdministrators = argA -> argA != null && argA.isActive() && argA.isAdministrator();	
	public static final DisplayDeterminer ToLoggedInUsers = argA -> argA != null && argA.isActive();
	
	public boolean display(final Account argA);
}
