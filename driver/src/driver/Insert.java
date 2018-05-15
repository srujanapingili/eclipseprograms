package driver;

import java.sql.*;
import java.util.Scanner;

public class Insert {

	public static void main(String[] args) throws SQLException {
		
			try {
				Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","srujana");
			PreparedStatement pre=con.prepareStatement("select * from atlanta");
			ResultSet rs=pre.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+","+rs.getString(2)+","+ rs.getInt(3));
		}
			
			con.close();
			
			
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
			
		}
	}


			
			
	

