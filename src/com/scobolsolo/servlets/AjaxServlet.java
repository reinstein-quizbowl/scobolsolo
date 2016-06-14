package com.scobolsolo.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.Validate;

import com.google.gson.JsonObject;

import com.scobolsolo.application.Account;

public abstract class AjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest argRequest, HttpServletResponse argResponse) throws ServletException, IOException {
		processOrEmpty(argRequest, argResponse);
	}
	
	@Override
	protected void doPost(HttpServletRequest argRequest, HttpServletResponse argResponse) throws ServletException, IOException {
		processOrEmpty(argRequest, argResponse);
	}
	
	protected void processOrEmpty(HttpServletRequest argRequest, HttpServletResponse argResponse) throws ServletException, IOException {
		Account lclUser = Account.determineCurrent(argRequest); // might be null
		
		JsonObject lclJson = null;
		try {
			lclJson = process(argRequest, argResponse, lclUser);
			if (lclJson == null) {
				lclJson = new JsonObject();
			}
		} catch (Exception lclE) {
			throw new ServletException(lclE);
		}
		
		Validate.notNull(lclJson);
		
		argResponse.setContentType("application/json");
		
		argResponse.getWriter().write(lclJson.toString());
	}
	
	protected abstract JsonObject process(final HttpServletRequest argRequest, final HttpServletResponse argResponse, final Account argUser) throws ServletException, IOException;
}
