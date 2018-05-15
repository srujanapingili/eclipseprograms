package sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Proper {
public static void main(String[] args) {
	

	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	Value value=(Value)context.getBean("srujana");
	value.method();
	
}	
}
