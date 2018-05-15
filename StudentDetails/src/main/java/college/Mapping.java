package college;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Mapping {
	
	public Student studata(HttpServletRequest req) {
	int i=Integer.parseInt(req.getParameter("id"));
		String s2=req.getParameter("name");
	String s3=req.getParameter("city");
 Student stu=new Student(i,s2,s3);
StudentService service=new StudentService();
service.save(stu,req);
return stu;
}
}