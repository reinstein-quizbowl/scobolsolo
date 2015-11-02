package com.scobolsolo;

import java.io.IOException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.siliconage.config.Configuration;

public class ScobolSoloConfiguration extends Configuration {
	private static final long serialVersionUID = 1L;
	
	private static final String[] ourAdditionalPropertiesFileNames = {"authentication.properties"};
	
	private static ScobolSoloConfiguration ourInstance = new ScobolSoloConfiguration();
	
	protected ScobolSoloConfiguration() {
		super();
		
		for (final String lclPropFileName : ourAdditionalPropertiesFileNames) {
			try {
				loadFromProperties(lclPropFileName);
			} catch (IOException lclIOE) {
				throw new RuntimeException("Could not load " + lclPropFileName, lclIOE);
			}
		}
	}
	
	@Override
	protected String getApplicationPropertiesFilename() {
		return "application.properties";
	}
	
	@Override
	public String getConfigurationTableName() {
		return null;
	}
	
	public static ScobolSoloConfiguration getInstance() {
		return ourInstance;
	}
	
	@Override
	public synchronized DataSource getDataSource() {
		try {
			final Context lclC = new InitialContext();
			return (DataSource) lclC.lookup("java:comp/env/ScobolSoloDataSource");
		} catch (NamingException lclE) {
			throw new RuntimeException("Exception thrown trying to find a data source bound to ScobolSoloDataSource in the InitialContext", lclE);
		}
	}
}
