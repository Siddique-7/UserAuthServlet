package com.siddique.servlet;

import com.siddique.dao.UserDao;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServlet extends HttpServlet{
	

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
	
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		
		try {
			if(UserDao.registerUser(username, password, email)) {
				res.sendRedirect("login.html");
			} else {
				res.getWriter().println("Registrationn failed!");
			}
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
