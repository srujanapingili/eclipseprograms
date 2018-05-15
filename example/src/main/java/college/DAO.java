package college;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {

	public boolean add(Student stu, Connection con) {
		PreparedStatement state = null;
		boolean flag = false;
		try {
			state = con.prepareStatement("insert into employes(id,name,city) values(?,?,?)");
			state.setInt(1, stu.getId());
			state.setString(2, stu.getName());
			state.setString(3, stu.getCity());

			flag = state.execute();
			System.out.println("inserted");
			ResultSet rs = state.executeQuery("select * from employes");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + rs.getString(2) + rs.getString(3));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (state != null)
					state.close();
			} catch (SQLException e1) {
				try {
					if (con != null)
						con.close();
				} catch (SQLException e2) {
					e2.printStackTrace();
				}
			}
		}
		return flag;
	}
}