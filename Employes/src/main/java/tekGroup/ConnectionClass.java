package tekGroup;

import java.sql.Connection;

public class ConnectionClass {
	private static ConnectionClass connection = null;
	private static Connection con = null;

	private ConnectionClass() {

	}

	public static ConnectionClass getConnetcionClass() {
		if (connection == null) {
			ConnectionClass connectionClass = new ConnectionClass();
			return connectionClass;

		}
		return connection;
	}

	public void setConnection(Connection c) {
		this.con = c;
	}

	public Connection getConnection() {
		return con;
	}
}
