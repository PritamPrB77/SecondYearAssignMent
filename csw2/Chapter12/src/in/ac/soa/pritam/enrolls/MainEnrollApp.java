package in.ac.soa.pritam.enrolls;
//Controller class to demonstrate the system's functionality
public class MainEnrollApp {

	public static void main(String[] args) {
		
		Student1 s1= new Student1("S101","Rama");
		Student1 s2= new Student1("S102","Laxman");
		
		Course c1=new Course("C101","CSW1");
		Course c2=new Course("C102","CSW2");
		
		EnrollmentSystem es=new Enrollment();
		es.enroll(s1,c1);
		es.enroll(s2, c2);
		es.display();
		
		es.drop(s1, c1);
		es.display();
		
		

	}

}
