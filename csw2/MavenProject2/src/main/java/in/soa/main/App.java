package in.soa.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.soa.beans.Student;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String config_loc = "/in/soa/resources/ApplicationContext.xml";
		ApplicationContext app = new ClassPathXmlApplicationContext(config_loc);

		Student std1 = (Student) app.getBean("stdId1");
		System.out.println(std1);

		System.out.println("-----------------------");
    }
}
