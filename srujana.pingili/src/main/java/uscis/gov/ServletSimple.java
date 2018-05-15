package uscis.gov;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.Mapping;

public class ServletSimple extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	public ServletSimple() {

	}

	public void init(ServletConfig config) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/college?autoConnect=true&useSSL=false", "root", "srujana");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
doPost(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

	Mapping map=new Mapping();
	map.retriveStu(request, response);
	}

}
