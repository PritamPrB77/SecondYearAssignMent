package in.soa.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.soa.beans.Airtel;
import in.soa.beans.Voda;
import in.soa.beans.sim;

public class MobileApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String config_loc="/in/soa/xml/ApplicationContext.xml";
	 ApplicationContext context= new ClassPathXmlApplicationContext(config_loc);
	 System.out.println("calling Start......");
	
	 
//	 Airtel s=(Airtel) context.getBean("Airtel");
//	 Voda s2= context.getBean("Voda",Voda.class);
////	 Student s2= context.getBean("stdId1",Student.class);
////	 s2.display();                                                                           
////	 s.display();
//	 System.out.println(s + "  callling to \n "+ s2);
	 sim sim1=(sim) context.getBean("Airtel");
	 sim sim2=context.getBean("Voda",sim.class);
	 sim1.calling();
	 System.out.println(sim1 +"calling To"+sim2);
	 
}
	

}
