package WEAK3DAY1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al1=new ArrayList<>();
		al1.add(23);
		al1.add(0);
		al1.add(23);
		al1.add(0);
		al1.add(233);
		al1.add(20);
		al1.add(2);
		al1.add(89);
		System.out.println(al1);
		//Soring in Ascending Ordere
		//Collections.sort(al1);
		System.out.println(al1);
		//Soring in  Reverse Order
		
		Collections.sort(al1,Collections.reverseOrder());
		System.out.println(al1);
	}

}
