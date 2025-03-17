package com.siddique.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.siddique.dao.UserDao;

public class LoginServlet extends HttpServlet{

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		try {
			if(UserDao.validateUser(email, password)) {
				HttpSession session = req.getSession();
				session.setAttribute("user", email);
				res.sendRedirect("home.jsp");
			} else {
				res.getWriter().println("Invalid credentials!");
			}
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
