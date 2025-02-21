package GenericClasses;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListexample {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al1=new ArrayList<>();
		al1.add(21);
		al1.add(23);
		al1.add(233);
		al1.add(231);
		al1.add(2312);
       System.out.println("Total items:"+al1.size());	
       System.out.println(al1);
        for(int  i:al1) {
        	System.out.println(i);
        }
        
        
        System.out.println();
        System.out.println("Ques Comes Print The aRYY usING iTERATOR mETHOD");
        Iterator itr =al1.iterator();
         while(itr.hasNext()) {
        	 System.out.println(itr.next());
         }

	}

}
