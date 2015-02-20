package com.scobolsolo.security;

import java.security.Principal;

import org.apache.catalina.realm.DataSourceRealm;

/* IMPORTANT: For this class to work, it and BCrypt.class must be put in a jar and deployed to
 * $CATALINA_HOME/lib.  The name I originally used was scobolsolo-bcrypt.jar.  This is NOT CURRENTLY
 * DONE by the build script, so if you make changes, you'll need to make the jar manually and
 * deploy it. 
 */
public class BCryptDataSourceRealm extends DataSourceRealm {
	@Override
	public Principal authenticate(final String argUsername, final String argCredentials) {
		try {
			final String lclHashedPassword = getPassword(argUsername);
			if (argCredentials == null || lclHashedPassword == null) {
				return null;
			}
			
			if (checkBCrypt(argCredentials, lclHashedPassword)) {
				return getPrincipal(argUsername);
			}
			
			return null;
		} catch (Exception lclE) {
			lclE.printStackTrace(System.out);
			throw lclE;
		}
	}
	
	private static boolean checkBCrypt(final String argProvidedPassword, final String argStoredHash) {
		return argProvidedPassword != null && BCrypt.checkpw(argProvidedPassword, argStoredHash);
	}
}