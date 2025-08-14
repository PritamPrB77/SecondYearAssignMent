package in.soa.main;
import  org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.soa.beans.Student;
public class Main {
 public static void main(String[]args) {
	 String config_loc="/in/soa/resource/ApplicationContext.xml";
	 ApplicationContext context= new ClassPathXmlApplicationContext(config_loc);
	 //Spring ApplicationContext load karta hai configuration file se aur beans ko initialize karta hai.
	 System.out.println("config is loaded......");
	   
	 Student s=(Student) context.getBean("stdId2");
	 Student s2= context.getBean("stdId1",Student.class);
	 s2.display();
	 s.display();
 }
}



