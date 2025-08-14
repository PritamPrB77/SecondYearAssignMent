package in.soa.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.soa.beans.Student;
/**
 * Hello world!
 * All method will called/ entry point of all the operations
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        String config_loc="/in/soa/resources/ApplicationContext.xml";
        ApplicationContext app=new ClassPathXmlApplicationContext(config_loc);
        Student std1=(Student) app.getBean("std1");
        System.out.println(std1);
        Student std2=(Student) app.getBean("std2");
        System.out.println(std2);
        
    }
}
