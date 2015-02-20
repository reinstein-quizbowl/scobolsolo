package com.scobolsolo.security;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.Filter;
import javax.servlet.FilterConfig;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @author jonah
 */
public class XFrameOptionsDenyFilter implements Filter {
	@Override
	public void init(final FilterConfig config) throws ServletException {
		return;
	}
	
	@Override
	public void doFilter(final ServletRequest argRequest, final ServletResponse argResponse, final FilterChain argChain) throws ServletException, IOException {
		try {
			final HttpServletResponse lclResponse = (HttpServletResponse) argResponse;
			lclResponse.addHeader("X-Frame-Options", "SAMEORIGIN");
			
			argChain.doFilter(argRequest, argResponse);
		} catch (ClassCastException lclE) {
			// Swallow
		}
	}
	
	@Override
	public void destroy() {
		return;
	}
}

