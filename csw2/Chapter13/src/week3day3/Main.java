package week3day3;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<students> st=new LinkedList<>();
		st.add(new students("Ankit",20,120));
		st.add(new students("Ankita",203,112));
		st.add(new students("Ankiti",120,124));
		st.add(new students("debi",210,102));
		st.add(new students("deba",204,12));
		st.add(new students("deba",2,1223));
		
		Iterator itr=st.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		
		}
		System.out.println();
		
		
		students  sw=new students("debi",210,124);
		System.out.println(st.contains(sw));
		System.out.println(st.get(3).equals(sw));
		// if we compare to an perticular index then it retuirn true else falkse

	}

}
