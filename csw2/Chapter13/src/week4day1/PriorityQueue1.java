package week4day1;

import java.util.*;


class customComparator implements Comparator<Integer> {
//to override the reverse order by userdefined method we use this method
	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		int comp=(o1-o2);
		return comp*-1;
	}
	
}
public class PriorityQueue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,10,8,7,3,4,6,5,9};
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		//PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		//by default min heap to convert it to max heapwe use collection.reverseOrder
	
		
		
		for(int i:arr) {
			pq.add(i);
		}
		System.out.println(pq);
	  while(!pq.isEmpty()) {
			System.out.println(pq.poll()+" is deleted");
			
		}
		System.out.println(pq);
	}

}
