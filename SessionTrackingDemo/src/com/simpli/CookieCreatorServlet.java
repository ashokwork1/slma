package com.simpli;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CookieCreator")
public class CookieCreatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		PrintWriter out = response.getWriter();
		
		// Create the cookies.
		Cookie c1 = new Cookie("userTracker","100005");
		response.addCookie(c1);
		
		Cookie c2 = new Cookie("userRewardPoint","200");
		response.addCookie(c2);
		
		out.println("Create two cookies");

	}

}
