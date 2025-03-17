package com.siddique.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private static final String url = "jdbc:oracle:thin:@localhost:1521:siddique1";
	private static final String user = "C##MUHAMMAD";
	private static final String password = "muhammad";
	
	public static Connection getConnection() throws SQLException{
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			return DriverManager.getConnection(url, user, password);
		} catch(ClassNotFoundException e) {
			throw new SQLException("oracle jdbc driver is not found", e);
		}
	}
	
	public static void main(String[] args) {
	    try (Connection con = getConnection()) {
	        System.out.println("Database connected successfully!");
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

	
}
