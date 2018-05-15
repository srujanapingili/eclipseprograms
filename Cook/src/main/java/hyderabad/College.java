package hyderabad;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class College extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		res.setContentType("text/html");
		try {
			PrintWriter out = res.getWriter();
			ServletConfig sc = getServletConfig();
String s1=sc.getInitParameter("srujana");
out.println("the statement is" + s1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
