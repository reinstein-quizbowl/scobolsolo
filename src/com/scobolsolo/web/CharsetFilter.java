package com.scobolsolo.web;

import java.io.IOException;
import java.util.Set;

import javax.servlet.Filter;
import javax.servlet.FilterConfig;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.Validate;

import com.google.common.collect.ImmutableSet;

/**
 * @author jonah
 * Semi-copied from http://stackoverflow.com/questions/138948/how-to-get-utf-8-working-in-java-webapps
 */
public class CharsetFilter implements Filter {
	public static final String DEFAULT_ENCODING = "UTF-8";
	private static final Set<String> EXCLUDES = ImmutableSet.of("/tournament/GeneratePaperwork", "/tournament/OutputPackets");
	// private static final org.apache.log4j.Logger ourLogger = org.apache.log4j.Logger.getLogger(CharsetFilter.class.getName());
	
	@Override
	public void init(FilterConfig argConfig) throws ServletException {
		return;
	}
	
	@Override
	public void doFilter(ServletRequest argRequest, ServletResponse argResponse, FilterChain argChain) throws IOException, ServletException {
		Validate.notNull(argRequest);
		Validate.notNull(argResponse);
		Validate.notNull(argChain);
		
		if (applyTo(argRequest)) {
			// Respect the client-specified character encoding (see HTTP specification section 3.4.1)
			if (argRequest.getCharacterEncoding() == null) {
				argRequest.setCharacterEncoding(DEFAULT_ENCODING);
			}
			
			argResponse.setCharacterEncoding(DEFAULT_ENCODING);
		}
		
		argChain.doFilter(argRequest, argResponse);
	}
	
	@Override
	public void destroy() {
		return;
	}
	
	private static final boolean applyTo(ServletRequest argRequest) {
		if (argRequest instanceof HttpServletRequest) {
			HttpServletRequest lclRequest = (HttpServletRequest) argRequest;
			
			return EXCLUDES.contains(lclRequest.getRequestURI()) == false;
		} else {
			return true;
		}
	}
}

