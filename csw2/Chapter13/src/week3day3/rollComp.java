package week3day3;

import java.util.Comparator;

public class rollComp implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		
//		if( o1.getRollno()<o2.getRollno()) {
//			return -1;
//		}
//		
//		
//		else if(o1.getRollno()>o2.getRollno()) {
//			return 1;
//		}
//		return 0;
		
		
		return Integer.compare(o1.getRollno(), o2.getRollno());
	}


}

