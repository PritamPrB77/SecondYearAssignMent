package ASSIGNMENT_2_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class user implements Comparable{
	private String name;private int age;
	user(String name,int age){
		this.name=name; this.age=age;
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
	@Override
	public String toString() {
		return "user [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		user that=(user)o;
		return Integer.compare(this.getAge(), that.getAge());
	}

}



public class ArrayListUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<user> al=new ArrayList<>();
		al.add(new user("x",34));
		al.add(new user("y",24));
		al.add(new user("z",19));
		al.add(new user("p",56));
		
		for( user i:al) {
			System.out.print(i);
		}
		System.out.println();
		Collections.sort(al);
		for( user i:al) {
			System.out.print("name is"+i.getName()+" age is"+i.getAge()+"   "   );
			System.out.println();
		}
		
		

	}

}
