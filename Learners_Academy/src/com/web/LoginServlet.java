package com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() {
        super();
       
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("uname");
		String password = request.getParameter("upass");
		RequestDispatcher dispatcher = null;
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		if (username.equals("admin") && password.equals("password")) {

			HttpSession session = request.getSession();
			session.setAttribute("username", "Saritha");
			session.setMaxInactiveInterval(30 * 60);

			Cookie uname = new Cookie("uname", username);
			uname.setMaxAge(30 * 60);
			response.addCookie(uname);

			response.sendRedirect("UserServlet");
		} else {
			writer.println("<h3 style='color:red'>Invalid Credentials.. Try Again..</h3>");
			dispatcher = request.getRequestDispatcher("login.jsp");
			dispatcher.include(request, response);
		}
	
	}

}
