package Assignment2_1;

 class  Student<T>{
	 Student(){
		 
	 }
	private String name;
private	int age;
private	T  rollNumber;
	// private Object rollNumber; // Accepts both Integer and String -->\
	/*
	 * i can also use the above method
	 */
       
	
	Student(String name, int age, T rollNumber){
		this.age=age;this.name=name; this.rollNumber=rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public T getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(T rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", rollNumber=" + rollNumber + "]";
	}
	

}


 public class driver{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s21=new Student();
	Student s1=new Student("xyz",23,34);
		Student s2=new Student("xz",21,"cse30");
		System.out.println(s1);
		System.out.println(s2);

	}
}
