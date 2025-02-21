package week3day3;

import java.util.Comparator;

public class AgeComp implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		
		if( o1.getAge()<o2.getAge()) {
			return -1;
		}
		
		
		else if(o1.getAge()>o2.getAge()) {
			return 1;
		}
		return 0;
		

}
}
