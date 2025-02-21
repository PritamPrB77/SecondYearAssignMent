package AssignmentChap12.CMS;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collage clg1=new Collage("soa", "sum");
		Collage clg2=new Collage("soa", "khandgiri");
		
		Student s1=new Student("x1",01,clg1);
		
		Student s2=new Student("x2",02,clg2);
		
s1.DisplayInfo();
System.out.println();
s2.DisplayInfo();
	}

}
