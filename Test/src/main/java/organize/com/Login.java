package organize.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException {
		res.setContentType("text/html");
		try {
			PrintWriter out = res.getWriter();
			String s1 = req.getParameter("username");
			String s2 = req.getParameter("password");
			if (s2.equals("srujana")) {
				RequestDispatcher dt = req.getRequestDispatcher("second");
				dt.forward(req, res);

			}
			else {
				out.println("wrong password");
				RequestDispatcher rd=req.getRequestDispatcher("/index.html");
				rd.include(req,res);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
