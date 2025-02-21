package in.ac.soa.pritam.enrolls;
//Interface for Enrollment System to maintain loose coupling
public interface EnrollmentSystem {
	void enroll(Student1 s, Course c);
	void drop(Student1 s, Course c);
	void display();
}
