package kapil.com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kapil.com.entity.Employee;

public class KapilMain {

	public static void main(String[] args) {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee e = ioc.getBean(Employee.class, "emp");
		System.out.println(e);
	}

}
