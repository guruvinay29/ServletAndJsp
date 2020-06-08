package org.jsp.web.dao;

import org.jsp.web.model.Student;

import java.sql.*;

public class StudentDao {
	
	public Student getStudent(int id) {
		
		Student s =  new  Student();
		s.setId(10);
		s.setUsername("sowmyasri");
		s.setFirstname("sowmya");
		s.setLastname("sri");
		s.setAge(19);
		s.setPassword("12345");
		
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=1234");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM `tech-no`.user where id = " + id);
			if (rs.next()) {
				
				s.setId(rs.getInt("id"));
				s.setUsername(rs.getString("username"));
				s.setFirstname(rs.getString("firstname"));
				s.setLastname(rs.getString("lastname"));
				s.setAge(rs.getInt("age"));
				s.setPassword(rs.getString("password"));
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return s;
		
		
	}

}
