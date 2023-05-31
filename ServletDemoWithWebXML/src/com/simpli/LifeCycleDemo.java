package com.simpli;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class LifeCycleDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String strABC;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init();
		System.out.println("Inside Init method");

		strABC = config.getInitParameter("ABC");
		System.out.println("Init parameter ABC has value = " + strABC);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Inside doGet method");
		PrintWriter out = response.getWriter();

		// get the ServletContext object.
		// only one ServletContext is there for the entire application
		ServletContext sc = request.getServletContext();

		out.println("I am deployed on " + sc.getServerInfo());
		out.println("I am listening  on port  " + request.getServerPort());

		// process the servlet config init parameter.
		out.println("Servlet Init parameter ABC has value = " + strABC);

		String strXYZ = sc.getInitParameter("XYZ");
		out.println("Context Param XYZ has value = " + strXYZ);

		// process the data submitted by the client.
		// see doPost method
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// process the data submitted by the client.
		
		// process single valued parameters
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		// process single valued parameters (like checkboxes)
		String[] hobbies = request.getParameterValues("hobbies");

		PrintWriter out = response.getWriter();
		out.println("Thank you, " + name + ". Your age is " + age);
		out.println("You hobbies are:");
		for(String hobby: hobbies) {
			out.println("<br>"+hobby);
		}
	}

	@Override
	public void destroy() {
		System.out.println("Inside Destroy method");
		super.destroy();
	}

}
