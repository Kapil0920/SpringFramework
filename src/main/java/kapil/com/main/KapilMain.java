package kapil.com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kapil.com.entity.Employee;

public class KapilMain {

	public static void main(String[] args) {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		Employee e = (Employee)ioc.getBean("emp");
		
		
		Employee e2 = (Employee)ioc.getBean("emp2");
//		System.out.println(e);
		System.out.println(e2);
		
		
		
		
		
		
		Hello World
		
	}

}
 