package driver;

import java.sql.*;

public class Movies {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","srujana");
			Statement state=(Statement) con.createStatement();
			ResultSet rs= state.executeQuery("select * from college");
			while(rs.next()) {
				System.out.println(rs.getInt("serialNum")+"," + rs.getString("movies") +"," +  rs.getString("status"));
			}
		}catch(Exception e) {
			e.printStackTrace();
			
		}

	}

}
