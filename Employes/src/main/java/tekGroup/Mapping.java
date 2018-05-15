package tekGroup;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

public class Mapping {
	Service service = new Service();

	public Details create(HttpServletRequest req) throws SQLException {
		int i = Integer.parseInt(req.getParameter("id"));
		String s1 = req.getParameter("name");
		String s2 = req.getParameter("city");
		Details det = new Details(i, s1, s2);
		service.add(det);
		return det;
	}

	public void get(HttpServletRequest req) {
		int i = Integer.parseInt(req.getParameter("id"));
		service.read(i);

	}

	public void delete(HttpServletRequest req) throws SQLException {
		int i = Integer.parseInt(req.getParameter("id"));
		service.del(i);
	}
}
