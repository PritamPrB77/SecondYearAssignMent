package week4day2;

import java.util.Comparator;
import java.util.PriorityQueue;

class customcompAs implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getAge(), o2.getAge());
	}
	
}
class customcompDs implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		//return Integer.compare(o2.getAge(), o1.getAge());
		
		if(o2.getAge()<o1.getAge()) {
			return -1;
		}
		else if(o2.getAge()>o1.getAge()) {
			return 1;
		}
		else return 0;
		// we multiply-1 also
	}
	
}


class Student{
	String name;
	int age;
	Student(String name, int age){
		this.age=age;this.name=name;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
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
}


public class Studentpq {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ascending
		PriorityQueue<Student>  pq=new PriorityQueue<>(new  customcompAs());
		pq.add(new Student("x1",34));
		pq.add(new Student("y1",4));
		pq.add(new Student("z1",24));
		
		System.out.println(pq);
		
		while(!pq.isEmpty()) {
			System.out.println(pq.remove());
		}
		System.out.println();
		
		//Descending
		
		PriorityQueue<Student>  pq2=new PriorityQueue<>(new  customcompDs());
		pq2.add(new Student("x1",34));
		pq2.add(new Student("y1",4));
		pq2.add(new Student("z1",24));
		
		System.out.println(pq2);
		
		while(!pq2.isEmpty()) {
			System.out.println(pq2.remove());
		}
		System.out.println();
		
	}

}
