package college;

import java.sql.Connection;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

public class StudentService {

	public void save(Student stu, HttpServletRequest req) {
		ServletContext context = req.getSession().getServletContext();
		Object obj = context.getAttribute("connect");
		Connection c = (Connection) obj;

		DAO dao = new DAO();
		boolean b = dao.add(stu, c);
	}

}
