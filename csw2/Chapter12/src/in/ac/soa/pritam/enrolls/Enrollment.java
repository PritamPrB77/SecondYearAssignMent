package in.ac.soa.pritam.enrolls;
//Enrollment class implementing EnrollmentSystem interface
public class Enrollment implements EnrollmentSystem {
	private Student1 st;
	private Course co;
	
	@Override
	public void enroll(Student1 st, Course co) {  
		this.st=st;
		this.co=co;
		System.out.println("Enrollment Student: "+( st.getsName()+" in course "+co.getcName()));
	}
	@Override
	public void drop(Student1 st, Course co) {
		this.st=null;
		this.co=null;
		System.out.println("Drop student: "+st.getsName()+ " from course "+co.getcName());
	}
	@Override
	public void display() {
		if(st != null && co!= null) {
			System.out.println("Enrollment DEtails:");
			System.out.println("Students: "+st.getsName()+", Course: "+co.getcName());
		}
		else
			System.out.println("No enrollment details");		
	}
	
	
}
