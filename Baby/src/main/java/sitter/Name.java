package sitter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Name extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) {

		String s1 = req.getParameter("srujana");
		try {
			res.sendRedirect("https://www.google.co.in/#q=" + s1);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
