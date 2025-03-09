package ASSIGNMENT_2_2;
import java.util.*;
public class treeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   TreeSet<Integer> treeSet = new TreeSet<>(); 
	        Scanner sc = new Scanner(System.in); 
	        treeSet.add(10); 
	        treeSet.add(20); 
	        treeSet.add(30); 
	        treeSet.add(40); 
	        treeSet.add(50); 
	        System.out.println("Elements of the TreeSet:"); 
	        for (Integer element : treeSet) { 
	            System.out.print(element + " "); 
	        } 
	        System.out.print("\n\nEnter a number to check: "); 
	        int numberToCheck = sc. nextInt(); 
	        if (treeSet.contains(numberToCheck)) { 
	            System.out.println("Number " + numberToCheck + " exists in the TreeSet."); 
	        } else { 
	            System.out.println("Number " + numberToCheck + " does not exist in the TreeSet."); 
	        } 
	        System.out.print("\nEnter a number to remove: "); 
	        int numberToRemove = sc.nextInt(); 
	        if (treeSet.remove(numberToRemove)) { 
	            System.out.println("Number " + numberToRemove + " removed from the TreeSet."); 
	        } else { 
	            System.out.println("Number " + numberToRemove + " does not exist in the TreeSet."); 
	        } 
	        System.out.println("\nUpdated elements of the TreeSet:"); 
	        for (Integer element : treeSet) { 
	            System.out.print(element + " "); 
	        } 
	}

}
