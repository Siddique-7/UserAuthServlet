package com.siddique.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {

	public static boolean registerUser(String username, String password, String email) throws SQLException {
		
		try(Connection con = DBConnection.getConnection();
				PreparedStatement ps = con.prepareStatement("INSERT INTO USERS(username, password, email) VALUES (?, ?, ?)")){
		
			ps.setString(1, username);
			ps.setString(2, password);
			ps.setString(3, email);
			
			
			return ps.executeUpdate() > 0;		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
	public static boolean validateUser(String email, String password) throws SQLException{
		
		try(Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM USERS WHERE email = ? AND password = ?")){
			
			ps.setString(1, email);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			return rs.next();		
		}
	 catch(Exception e) {
		e.printStackTrace();
	}
		return false;	
   }
}











