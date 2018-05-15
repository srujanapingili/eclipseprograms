package driver;

import java.sql.*;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/college?autoConnect=true&useSSL=false", "root", "srujana");
			Statement state = con.createStatement();
			ResultSet rs = state.executeQuery("select * from atlanta");
			while (rs.next()) {
				System.out.println(rs.getInt("mumber") + "," + rs.getString("name") + "," + rs.getString("age"));
			}

			state.execute("DELETE FROM atlanta Where mumber=2");
			state.executeUpdate("insert into atlanta(mumber,name,age)" + "values(6,'snahe',21)");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}