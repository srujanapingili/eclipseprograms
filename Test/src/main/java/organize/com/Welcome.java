package organize.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Welcome extends HttpServlet{
	/**
	 * 
	 */
	

	public void doPost(HttpServletRequest req,HttpServletResponse res) {
		res.setContentType("text/html");
		try {
			PrintWriter out=res.getWriter();
			String s3=req.getParameter("username");
			out.println("welcome" + s3);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
