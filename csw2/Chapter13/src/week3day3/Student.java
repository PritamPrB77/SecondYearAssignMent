package week3day3;

import java.util.*;

public class Student {
          
	private int rollno,age;
	private String name;
	Student(int x,int y,String z){
		this.rollno=x;
		this.age=y;
		this.name=z;
	
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", age=" + age + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Student that=(Student)obj;
		
		if(this.age==that.age && this.name==that.name && this.rollno==that.rollno) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> s1=new ArrayList<>();
		s1.add(new Student(1111,-2,"trrtr"));
		s1.add(new Student(2,333,"uu6"));
		s1.add(new Student(11,21,"jnhg"));
		System.out.println(s1);
		
		//soring based on age
//		Collections.sort(s1,new AgeComp());
//		System.out.println(s1);

		//soring based on roolNo
		Collections.sort(s1,new rollComp());
		
		Student[] arr=new Student[5];
//		Arrays.sort(arr,new NameCmp());
		
		for(Student s2:s1) {
			System.out.print(s2.getAge()+" ");
			System.out.print(s2.getName()+" ");
			System.out.print(s2.getRollno()+" ");
			System.out.println();
		}
		System.out.println();
		
		//System.out.println(s1);
		//by creating three class we can implement is in single java file
		//sorts based on name
	Collections.sort(s1,new NameCmp());
	System.out.println(s1);

	
	
	for(Student s2:s1) {
		System.out.print(s2.getAge()+" ");
		System.out.print(s2.getName()+" ");
		System.out.print(s2.rollno+" ");
		System.out.println();
	}
	System.out.println();
	
	
	Student s2=new Student(2,333,"uu6");
		//System.out.println(s1.contains(s2));
	System.out.println(s1.contains(new Student(2,333,"uu6")));// it also return true
	// for strong contain we neewwd to use both hashcode and equals
	
	List<String> s12=new ArrayList<>();
	List<Integer> s13=new ArrayList<>();
	s12.add("apple");
	s12.add("orange");
	s13.add(1);
	s13.add(12);
	s13.add(13);
	String s="hello";
	System.out.println("----------------");
	System.out.println(s12.contains("orange"));
	System.out.println(s.contains("hel"));
	System.out.println(s12.indexOf("orange"));
	System.out.println(s13.indexOf(13));
	
	}

	

	

}
