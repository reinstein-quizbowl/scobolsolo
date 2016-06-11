package com.scobolsolo.web;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletContextEvent;

import com.opal.TransactionManager;

import com.scobolsolo.application.FactoryMap;

public class ServerListener implements ServletContextListener {
	private static final org.apache.log4j.Logger ourLogger = org.apache.log4j.Logger.getLogger(ServerListener.class.getName());
	
	public ServerListener() {
		super();
	}
	
	@Override
	public void contextInitialized(ServletContextEvent argE) {
		ourLogger.info("Beginning initialization");
		
		try {
			/* THINK: If we do ever get around to allowing the hot redeployment of Java classes, will the below code work?
			 * Or will we possibly end up with a reference to an old OpalFactoryFactory spitting out references to old
			 * Factories when new ones have been released?
			 */
			final InitialContext lclC = new InitialContext();
			lclC.bind("FactoryMap", FactoryMap.getInstance());
		} catch (NamingException | RuntimeException lclE) {
			ourLogger.error("Squashing exception in Initializer.init()", lclE);
			lclE.printStackTrace(System.err);
		} finally {
			ourLogger.debug("Initialization complete");
		}
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent argE) {
		ourLogger.info("Beginning destruction");
		
		// Shut down the TransactionManager
		TransactionManager.getInstance().shutdown();
		
		// De-register the JDBC driver (and any others)
		Enumeration<Driver> lclDrivers = DriverManager.getDrivers();
		while (lclDrivers.hasMoreElements()) {
			Driver lclDriver = lclDrivers.nextElement();
			try {
				DriverManager.deregisterDriver(lclDriver);
				ourLogger.info("Deregistering driver " + lclDriver);
			} catch (SQLException lclE) {
				ourLogger.error("Error deregistering driver " + lclDriver, lclE);
			}
		}
		
		ourLogger.info("Destruction complete");
	}
}
