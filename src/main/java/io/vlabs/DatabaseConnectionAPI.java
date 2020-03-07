package io.vlabs;

import java.sql.*;

public class DatabaseConnectionAPI {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vivek","root","root");
			Statement statement = con.createStatement();	
			ResultSet resultSet = statement.executeQuery("select * from name");
			while(resultSet.next()) {
				System.out.println(resultSet.getString(1)+"<-->"+resultSet.getString(2)+"<-->"+resultSet.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
