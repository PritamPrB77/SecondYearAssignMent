 package week8day2.StringProgram;
 
 class Student{
	 private String name;
	 private int age;
	 private String dob;
	public Student(String name, int age, String dob) {
		this.name = name;
		this.age = age;
		this.dob = dob;
	}
 }
 class Employee{
	 private String name;
	 private int age;
	 private String dob;
	public Employee(String name, int age, String dob) {
		this.name = name;
		this.age = age;
		this.dob = dob;
	}
	public String generatePassword() {
		String[] parts=dob.split("/");
		String years=parts[2];
		//String[] names=dob.split(" ");
		//String lastName=names[1];
		String lastName=name.substring(name.lastIndexOf(" ")+1);
		return lastName + years;
	}
	
	public Object createObject(String name,String dob,int age6) {
		
		Student s1=new Student(name,age6,dob);
		return s1;
		
	}
	
	//Methods to print details
	public void printDetails() {
		String[] names=name.split(" ");
		String firstName=names[0];
		String lastName=names[names.length-1];
		String middleName="";
		if(names.length >2 )
			middleName=name.substring(firstName.length()+1,name.length()-lastName.length());
		System.out.println("First Name:"+firstName);
		System.out.println("Middle Name:"+middleName);
		System.out.println("Last Name:"+lastName);
		System.out.println("DOB:"+dob.replace("/", "-"));
		System.out.println("Age:"+age);
	}
	 
 }
public class StringPassword {

	public static void main(String[] args) {
		Employee emp=new Employee("Ramesh Kumar Mishra",30,"23/07/1993");
		String password=emp.generatePassword();
		System.out.println("Password is:"+password);
		System.out.println("\nDetails:");
		emp.printDetails();

	}

}
