package org.jsp.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class LoginDao {

	String url = "jdbc:mysql://localhost:3306?user=root&password=1234";
	String sql = "SELECT * FROM `tech-no`.user where username=? and password=?";

	public boolean check(String uname, String pass) {

		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url);
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, uname);
			statement.setString(2, pass);
			ResultSet rs = statement.executeQuery();
			if (rs.next()) {

				return true;
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return false;

	}
}
