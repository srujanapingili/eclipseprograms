package college;

import java.sql.Connection;
import java.sql.PreparedStatement;
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