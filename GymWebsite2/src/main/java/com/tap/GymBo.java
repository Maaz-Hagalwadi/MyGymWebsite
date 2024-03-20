package com.tap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GymBo {
	
	
	public GymBo() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/gym";
			String name = "root";
			String pwd = "root";
			
			connection = DriverManager.getConnection(url,name,pwd);
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}


	private Connection connection;
	private PreparedStatement preparestatement;

	public int save(Gym g) {
		
		
		try {
			String INSERT_QUERY = "INSERT INTO `gymdata` (`name`,`email`,`phone_number`,`age`,`gender`) values(?,?,?,?,?)";
			preparestatement = connection.prepareStatement(INSERT_QUERY);
			
			preparestatement.setString(1,g.getName());
			preparestatement.setString(2,g.getEmail());
			preparestatement.setLong(3, g.getPhone());
			preparestatement.setInt(4, g.getAge());
			preparestatement.setString(5,g.getGender());
			
			int i = preparestatement.executeUpdate();
			
			return i;
			
			
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	

}
