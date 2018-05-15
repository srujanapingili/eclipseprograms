package tekGroup;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

public class Service {

	public boolean add(Details de) throws SQLException {
		PreparedStatement state = null;
		Connection con = null;
		boolean b = false;
		ConnectionClass c = ConnectionClass.getConnetcionClass();

		try {
			con = c.getConnection();
			state = con.prepareStatement("insert into employes(id,name,city) values(?,?,?)");
			state.setInt(1, de.getA());
			state.setString(2, de.getName());
			state.setString(3, de.getCity());
			b = state.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (state != null) {
					state.close();
				}
			} catch (SQLException e1) {
				try {
					if (con != null) {
						con.close();
					}
				} catch (SQLException e2) {
					e2.printStackTrace();
				}
			}
		}
		return b;
	}
	public void read(int i) {
		PreparedStatement state = null;
		Connection con = null;
		boolean b = false;
		ConnectionClass c = ConnectionClass.getConnetcionClass();
		try {
			con = c.getConnection();
			state = con.prepareStatement("select * from employes where id=?");
			state.setInt(1, i);
			ResultSet rs = state.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString(2) + rs.getString(3));
			}
			state.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public ArrayList getAll(HttpServletRequest req) throws SQLException {
		PreparedStatement state = null;
		Connection con = null;
		boolean b = false;
		ConnectionClass c = ConnectionClass.getConnetcionClass();
		con = c.getConnection();
		state = con.prepareStatement("select * from employes");
		ResultSet rs = state.executeQuery();
		ArrayList<String> al=new ArrayList<String>();
		while (rs.next()) {
		al.add(rs.getString(2));
		al.add(rs.getString(3));
		}
		state.close();
		con.close();
		return al;
		
	}
	public void del(int i) throws SQLException {
		PreparedStatement state = null;
		Connection con = null;
		boolean b = false;
		ConnectionClass c = ConnectionClass.getConnetcionClass();
		con = c.getConnection();
		state = con.prepareStatement("delete from employes where id=?");
		state.setInt(1, i);
		state.executeUpdate();
		state.close();
		con.close();
	}
}
