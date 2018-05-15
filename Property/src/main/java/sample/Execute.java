package sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Execute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(Tot.class);
		Demo2 demo=(Demo2) context.getBean("srujana");
		demo.method("html");
		Disk2 disk=(Disk2) context.getBean("sravya");
		disk.method("jhjhj");
		

	}

}
