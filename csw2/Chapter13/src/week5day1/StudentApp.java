package week5day1;
import java.util.*;

class rollCompare implements Comparator<Student>{

	

	@Override
	public int compare(Student o1, Student o2) {
		
		// TODO Auto-generated method stub
		return Integer.compare(o1.getRollNo(), o2.getRollNo());
	}
	
}

class AgeCompare implements Comparator<Student>{
          
	

	@Override
	public int compare(Student o1, Student o2) {
		                         
		// TODO Auto-generated method stub
		return Integer.compare(o1.getAge(), o2.getAge());
	}
	
}
class Student {
	private String name;private int age,rollNo;
	Student(String name,int age,int rollNo){
		this.name=name;
		this.age=age;
		this.rollNo=rollNo;
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
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", rollNo=" + rollNo + "]"+"\n";
	}
//	@Override
//     public int compareTo(Object o) {
//    	 Student that=(Student)o;
//		return Integer.compare(this.rollNo,that.rollNo);
//    	 
//     }
	@Override
	public int hashCode() {
		return Objects.hash(age, name, rollNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Objects.equals(name, other.name) && rollNo == other.rollNo;
	}
	
}




public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> ts=new TreeSet<>(new  rollCompare());
		// if  we dont use new  rollCompare() --> it shows class cast exception
		ts.add(new Student("a",23,1));
		ts.add(new Student("b",14,2));
		ts.add(new Student("f",21,6));
		ts.add(new Student("e",9,5));
		ts.add(new Student("c",28,3));
		ts.add(new Student("d",34,4));
		ts.add(new Student("f",21,6));
		System.out.println(ts);
		
		Student s1= new Student("a",23,1);
		Student s2= new Student("n",211,65);
		Student s3=new Student("f",21,6);
		System.out.println(" is  treeset Cntain"+ s1+"  ..."+ts.contains(s1));
		System.out.println(ts);
		System.out.println("///////////////////");
		System.out.println(ts.remove(s2));
		System.out.println(ts);  // if elem not exit it wilnoit  remoe anyting only return false
		System.out.println("///////////////////");
		System.out.println(ts.remove(s3));
		System.out.println(ts); // it return true and delete it
		
		//Collections.sort(ts,new AgeCompare());
		
		
		System.out.println(ts);
	
		
   
	}

}
