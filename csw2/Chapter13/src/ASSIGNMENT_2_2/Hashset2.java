package ASSIGNMENT_2_2;

import java.util.HashSet;

public class Hashset2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,1,2,3};
		HashSet<Integer> hs=new HashSet<>();
		
//		for(int  i:arr) {
//			if(hs.contains(i)) {
//				System.out.print(i+" ");
//			}
//			else {
//				hs.add(i);
//			}
//		}
		
		
       for(int i:arr) {
    	    if(!hs.add(i)) {// it return true if elem will added other nwise it return  false for duplicate elemts
    	    	//ex-> if 1 is not present it return truee if duplicate present it return false
    	    	System.out.print(i+" ");
    	    }
       }
       
       System.out.println("\n hasset"+hs);

	}

}
