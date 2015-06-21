package com.scobolsolo.persistence;
import com.scobolsolo.application.StaffRole;
import com.opal.PersistenceException;

public interface StaffRoleOpalFactory extends com.opal.OpalFactory<StaffRole, StaffRoleOpal>, com.opal.OpalFactoryCreator<StaffRole, StaffRoleOpal> {
	public StaffRoleOpal forName(java.lang.String argName) throws PersistenceException;
	public StaffRoleOpal forCode(java.lang.String argCode) throws PersistenceException;
	public StaffRoleOpal forShortName(java.lang.String argShortName) throws PersistenceException;
	public StaffRoleOpal forVeryShortName(java.lang.String argVeryShortName) throws PersistenceException;
}
