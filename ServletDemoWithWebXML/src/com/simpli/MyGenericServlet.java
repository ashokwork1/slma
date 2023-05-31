package com.simpli;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;

public class MyGenericServlet extends GenericServlet implements Servlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		out.println("I am a Generic servlet. Got a request. ");

	}

}
