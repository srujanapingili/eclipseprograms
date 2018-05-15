package constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Run {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		First pa = context.getBean("p", First.class);
		System.out.println(pa);
		Second par = context.getBean("s", Second.class);
		System.out.println(par);
	}

}
