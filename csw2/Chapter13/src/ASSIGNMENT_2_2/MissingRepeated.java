package ASSIGNMENT_2_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MissingRepeated {
	public static void MissingNumber(HashMap<Integer,Integer> hm ,int[] arr) {
		
		  List<Integer> al=new ArrayList<>();
		  List<Integer> al2=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			
			if(hm.containsKey(arr[i])) {
				al.add(arr[i]);
				
				hm.put(arr[i], hm.get(arr[i])+1);
			}
			else {
				hm.put(arr[i], 1);
			}
			
			 
		}
		System.out.println(hm);
		System.out.println("repeated Element Are"+al);
		for(int i=1;i<=10;i++) {
			if(!hm.containsKey(i)) {
				al2.add(i);
			}
		}
		System.out.println("Missing Elem Are"+al2);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,1,2,10,8,7,3,6,6,7,9};
		HashMap<Integer,Integer> hm=new HashMap<>();
		MissingNumber(hm,arr);

	}
}
