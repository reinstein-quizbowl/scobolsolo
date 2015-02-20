package com.scobolsolo;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;

import com.opal.TransactionManager;

import com.scobolsolo.application.FactoryMap;

public class Initializer extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final org.apache.log4j.Logger ourLogger = org.apache.log4j.Logger.getLogger(Initializer.class.getName());
	
	public Initializer() {
		super();
	}
	
	@Override
	public void init() throws ServletException {
		super.init();
		
		ourLogger.debug("start Initializer.init()");
		try {
			/* THINK: If we do ever get around to allowing the hot redeployment of Java classes, will the below code work?
			 * Or will we possibly end up with a reference to an old OpalFactoryFactory spitting out references to old
			 * Factories when new ones have been released?
			 */
			InitialContext lclC = new InitialContext();
			lclC.bind("FactoryMap", FactoryMap.getInstance());
		} catch (NamingException | RuntimeException lclE) {
			ourLogger.error("Squashing exception in Initializer.init()", lclE);
			lclE.printStackTrace(System.err);
		} finally {
			ourLogger.debug("Initialization complete");
		}
	}
	
	public static void shutdown() {
		ourLogger.debug("Shutting down nicely");
		TransactionManager.getInstance().shutdown();
	}
}
