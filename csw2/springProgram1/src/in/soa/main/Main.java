package in.soa.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.soa.beans.Student;
public class Main {
	public static void main(String[] args) {
		String config_loc="/in/soa/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);// spring container start
		System.out.println("Config is loaded");
		Student s = (Student) context.getBean("stdId");
		s.display();
		System.out.println("=================");
		Student s2 = context.getBean("stdId2",Student.class);
		System.out.println("Name: "+ s2.getName());
		System.out.println("Roll: "+s2.getRollno());
		System.out.println("Email: "+s2.getEmail());
	}

}
