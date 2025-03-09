package week5day3;

import java.util.*;
import java.util.Map.Entry;


//class IDcomAsc implements Comparator<Integer>{
//
//	@Override
//	public int compare(Integer o1, Integer o2) {
//		// TODO Auto-generated method stub
//		return Integer.compare(o1, o2);
//	}
//
//	
//
//}


class IDcomAsc implements Comparator<Integer>{

	@Override
public int compare(Integer o1, Integer o2) {
//  //TODO Auto-generated method stub
		return Integer.compare(o1, o2);
}
}
//	@Override
//	public int compare(Student o1, Student o2) {
//		// TODO Auto-generated method stub
//		return Integer.compare(o1.getID(), o2.getID());
//	}

	


class IDcomDsc implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o2, o1);
	}

	

}
public class treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		/*
		 * in Map we compare based on key but in list or set we comapre  based on any property
		 * in map if we want to comapre it based on perticular object we can convert its  key type to object and then compare based on that objects'
		 * property so map always follow key  based arranging or sorting
		 */
		Address ad1=new Address(01,"patia",759019);
		Address ad2=new Address(196,"BBSR",759103);
		Address ad3=new Address(69,"cuttack",750560);
		Address ad4=new Address(45,"badgad",759025);
		
		Collage cl1=new Collage("Iter","jagamara");
		Collage cl2=new Collage("kiit","patia");
		Collage cl3=new Collage("Iter","jagamara");
		Collage cl4=new Collage("Iter","Sum");
		
	
		
		
		
	TreeMap<Integer,Student> tm= new TreeMap<>( new  IDcomAsc() );
	  tm.put(1, new Student(1,"ankit",cl1,ad1));
	  tm.put(3, new Student(3,"kiran",cl1,ad1));
	  tm.put(4, new Student(4,"debi",cl1,ad1));
	  tm.put(2 ,new Student(2,"avas",cl1,ad1));
	  
       System.out.println(tm);
       TreeMap<Integer,Student> tm2= new TreeMap<>( new  IDcomDsc() );
           tm2.putAll(tm);
 	  System.out.println(tm2);
	   
 	  
 	  for(Entry<Integer, Student> m:tm2.entrySet()) {
 		  System.out.println(m.getKey()+" "+m.getValue());
 	  }

	}

}
