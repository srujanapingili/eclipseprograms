package car.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Bmw extends HttpServlet {
	public void post(HttpServletRequest req, HttpServletResponse res) {
		res.setContentType("text/html");
		
		ServletContext sc= getServletContext();
		try {
			PrintWriter pc=res.getWriter();
			pc.println("hello");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
