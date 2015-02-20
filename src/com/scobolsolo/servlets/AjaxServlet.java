package com.scobolsolo.servlets;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import org.apache.commons.lang3.Validate;

import com.google.gson.JsonElement;

import com.scobolsolo.AccountUtility;
import com.scobolsolo.application.Account;

public abstract class AjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(final HttpServletRequest argRequest, final HttpServletResponse argResponse) throws ServletException, IOException {
		final Account lclUser = AccountUtility.getLoggedInAccount(argRequest); // might be null
		
		argResponse.setContentType("application/json");
		
		final JsonElement lclJson = Validate.notNull(process(argRequest, argResponse, lclUser));
		
		argResponse.getWriter().write(lclJson.toString());
	}
	
	protected abstract JsonElement process(final HttpServletRequest argRequest, final HttpServletResponse argResponse, final Account argUser) throws ServletException, IOException;
}
