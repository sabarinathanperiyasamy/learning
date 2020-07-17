package jav;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Javae {


	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/finaldb");
		
		Statement s = connection.createStatement();
		
		ResultSet rs = s.executeQuery("select * from finaldb");
		
		while(rs.next()) {
			
			System.out.println(rs.getString(1));
		}
			
			
		
		
		
	}

}
