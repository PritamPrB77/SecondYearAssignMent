package week3day2;


import java.util.*;
public class UserdefinedAL implements Comparable<UserdefinedAL>{
		 private String name;
		 private int age;
	  
		UserdefinedAL(String name, int age){
			this.name=name;
			this.age=age;
		}
		@Override
																										
		public String toString() {
			return "name-  "+ name+ " & age- "+age;
			
		}
		@Override
		public boolean equals(Object obj) {
			UserdefinedAL that=(UserdefinedAL)obj; 
//		we r downcasting to get the override annotation
			if((this.name.equals(that.name))&&(this.age==that.age))
				return true;
			else
				return false;
		}
		
		
		
		@Override
		public int compareTo(UserdefinedAL that) {
			if(this.age<that.age) {
				return -1;
			}
			else if(this.age>that.age) {
				return 1;
			}
			else {
				return 0;
			}
		}
		
		
		//the method below wont work cz we can't use override annotation with it
//		public boolean equals(UserdefinedAL a) {
//			
//			if((name.equals(a.name))&&(age==a.age))
//				return true;
//			else
//				return false;
//		}
		
//		@Override
//		public boolean equals(Object obj) {
//			UserdefinedAL other = (UserdefinedAL) obj;
//			return age == other.age && Objects.equals(name, other.name);
//		}
//		
		
	public static void main(String[] args) {
		 ArrayList<UserdefinedAL>a1=new ArrayList<>();
		 a1.add(new UserdefinedAL("Pritam",180));
		 a1.add(new UserdefinedAL("Priya",18));
		
		 a1.add(new UserdefinedAL("priteeee",7));
		 a1.add(new UserdefinedAL("pr",1));
		 
		 UserdefinedAL a2=new UserdefinedAL("prit",1);
	
		 // print without using iterator
//		 System.out.println(a1); //we need to override toString()
		 
		 //using iterator metod
		 	Iterator<UserdefinedAL> itr= a1.iterator();	
			while(itr.hasNext())
				System.out.println(itr.next());
			
			
			System.out.println(a1.contains(a2));//doesnt work so we need to 0verride the equals()
		    a1.remove(a2); //wont work ,need to override equals()
		 	System.out.println(a1.contains(a2)); 
		 	 System.out.println(a1);
			
		 	 System.out.println("...................");
		 	 Collections.sort(a1);//wont work for  use defined arraylist 
//		 	System.out.println(a1);

			
		 	Iterator<UserdefinedAL> itr1= a1.iterator();	
			while(itr1.hasNext())
				System.out.println(itr1.next());
			
	
	
	}
	
}
