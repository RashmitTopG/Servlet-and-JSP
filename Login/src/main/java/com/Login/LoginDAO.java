package com.Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {

	public boolean check(String user , String pass) throws ClassNotFoundException, SQLException {
		
		
		String sql = "SELECT * from login WHERE username = ? & password = ?";
		String url = "jdbc:mysql://localhost:3306/login";
		String username = "root";
		String password = "root";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username , password);
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1,user);
		st.setString(2,pass);
		
		ResultSet rs = st.executeQuery();
		if(rs.next()) {
			return true; 
		}
		return false;
	} 
}
 