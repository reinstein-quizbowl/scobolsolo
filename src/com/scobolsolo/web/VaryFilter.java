package com.scobolsolo.web;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.Filter;
import javax.servlet.FilterConfig;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class VaryFilter implements Filter {
	@Override
	public void init(FilterConfig config) throws ServletException {
		return;
	}
	
	@Override
	public void doFilter(ServletRequest argRequest, ServletResponse argResponse, FilterChain argChain) throws ServletException, IOException {
		HttpServletResponse lclResponse = (HttpServletResponse) argResponse;
		lclResponse.addHeader("Vary", "Accept-Encoding");
		
		argChain.doFilter(argRequest, argResponse);
	}
	
	@Override
	public void destroy() {
		return;
	}
}

