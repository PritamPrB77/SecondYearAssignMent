package in.soa.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.soa.beans.Sim;

public class Mobile {

	public static void main(String[] args) {
//	/imp
		String config_loc="/in/soa/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_loc); 
		System.out.println("Config is loaded");
		
		//Sim sim = context.getBean("sim1",Sim.class);
		Sim sim =(Sim)context.getBean("sim1");
		sim.calling();
		sim.data();
		
		Sim sim2=(Sim)context.getBean("sim2");
		sim2.calling();
		sim2.data();
		

	}

}
