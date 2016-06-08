package com.scobolsolo;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.naming.spi.NamingManager;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;
import org.apache.log4j.SimpleLayout;

import com.siliconage.database.DirectConnectionPoolFactory;
import com.siliconage.naming.SimpleInitialContextFactoryBuilder;

import com.opal.TransactionManager;

public class Standalone {
	private static final Logger ourLogger = Logger.getLogger(Standalone.class);
	
	protected Standalone() {
		throw new UnsupportedOperationException();
	}
	
	public static void initialize() throws ClassNotFoundException, NamingException {
		initialize(null);
	}
	
	public static void initialize(final Priority argPriority) throws ClassNotFoundException, NamingException {
		createDataSource();
		createConsoleLogger(argPriority);
	}
	
	public static void createDataSource() throws ClassNotFoundException, NamingException {
		Class.forName("net.sourceforge.jtds.jdbc.Driver");
		NamingManager.setInitialContextFactoryBuilder(new SimpleInitialContextFactoryBuilder());
		final Context lclC = new InitialContext();
		lclC.bind(
			"java:comp/env/ScobolSoloDataSource",
			DirectConnectionPoolFactory.getInstance().create(
				"jdbc:postgresql://127.0.0.1:5432/scobolsolo",
				ScobolSoloConfiguration.getInstance().getString("DATABASE_USERNAME"),
				ScobolSoloConfiguration.getInstance().getString("DATABASE_PASSWORD")
			)
		);
		
		lclC.bind("java:comp/env/opal/localdatecache/start", "2000-01-01");
		lclC.bind("java:comp/env/opal/localdatecache/end",  "2020-01-01");
	}
	
	public static void createConsoleLogger() {
		createConsoleLogger(Level.WARN);
	}
	
	public static void createConsoleLogger(final Priority argPriority) {
		Priority lclPriority = argPriority;
		if (lclPriority == null) {
			lclPriority = Level.WARN;
		}
		
		final ConsoleAppender lclAppender = new ConsoleAppender(new SimpleLayout(), ConsoleAppender.SYSTEM_ERR);
		lclAppender.setName("ScobolSoloAppender");
		lclAppender.setThreshold(lclPriority);
		lclAppender.activateOptions();
		
		Logger.getRootLogger().addAppender(lclAppender);
	}
	
	public static void shutdown() {
		ourLogger.debug("Shutting down TransactionManager.");
		TransactionManager.getInstance().shutdown();
		ourLogger.debug("Shut down TransactionManager.");
	}
}
