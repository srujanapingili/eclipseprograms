package tekGroup;

import java.awt.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeDetails extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "srujana");
			ConnectionClass c = ConnectionClass.getConnetcionClass();
			c.setConnection(con);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		Mapping map = new Mapping();
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		int i = Integer.parseInt(req.getParameter("cmd"));
		if (i == 1) {
			try {
				map.create(req);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else if (i == 2) {
			map.get(req);
			pw.println("selected the query");
		} else if (i == 3) {
			Service service=new Service();
			try {
				ArrayList a= service.getAll(req);
				pw.println(a);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			pw.println("getting all the elements:");

		} else {
			try {
				map.delete(req);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			pw.println("deleting all the elements:");

		}

	}
}
