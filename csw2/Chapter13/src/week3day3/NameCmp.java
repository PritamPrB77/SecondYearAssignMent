package week3day3;

import java.util.Comparator;

public class NameCmp implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub,
//		if(o1.getName().compareTo(o2.getName())<-1) {
//			it usesin Sorting methods
//			
//		}
		
//		else if(o1.getAge()>o2.getAge()) {
//			return 1;
//		}
//		return 0;
		
		return o1.getName().compareTo(o2.getName());
	}


}


	


