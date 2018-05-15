package tek.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Helper.class);

		Independent help = (Independent) context.getBean("srujana");
		help.method();

	}

}
