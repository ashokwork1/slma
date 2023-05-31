package com.simpli;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

import org.hibernate.*;

@WebServlet("/init")
public class InitDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.println("<html><body>");

		// STEP 1: Get a Session (connection) from the Session Factory class
		SessionFactory factory = HibernateUtil.getSessionFactory();

		Session session = factory.openSession();

		out.println("Hibernate Session opened.<br>");

		session.close();

		out.println("Hibernate Session closed.<br>");

		// STEP 2 execute the HQL commands
		// for now we will only test if the connection is establised with MySQL server.

		out.println("</body></html>");

	}

}
