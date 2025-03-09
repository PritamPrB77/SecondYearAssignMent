package week4day2;


import java.util.*;


class customcomp2 implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		   if(o1%2==0 && o2%2!=0) {
			   //even < odd
			   //in min heap it pritize less value so  it return even value
			   return -1;
		   }
		   else if(o1%2!=0 && o2%2==0) {
			   return 1;
			   //in min heap it pritize less value so  it return even value
			  // odd>even
		   }
		  // else return 0;
		   else return o1.compareTo(o2);
		   // it compares between  two even and odd values when they or either even or odd
		   
	}
	
}


class customcomp1 implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return (o1-o2);
	}
	
}


class customcomp implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		//return (o1-o2)*-1;
		return (o2-o1);
	}
	
}
public class PQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,10,8,7,3,4,6,5,9,0};
		PriorityQueue<Integer> pq1=new PriorityQueue<>( );
		for(int i:arr) {
			pq1.add(i);
		}
		//performing min  HEapSort
		System.out.println(pq1);
		//Collections.sort(pq);
		
		
		//performing  max heap
		PriorityQueue<Integer> pq2=new PriorityQueue<>(new customcomp() );
		for(int i:arr) {
			pq2.add(i);
		}
		System.out.println(pq2);
		while(!pq2.isEmpty()) {
			System.out.print(pq2.remove()+" ");
		}
		System.out.println();
		
		// performi9ng prioratize even odd numbers
		PriorityQueue<Integer> pq3=new PriorityQueue<>(new customcomp2() );
		
		for(int i:arr) {
			pq3.add(i);
		}
		
		while(!pq3.isEmpty()) {
			System.out.print(pq3.remove()+" ");
		}
		System.out.println();
		//PriorityQueue<Integer> pq4=new PriorityQueue<>( new customcomp3());
		
		
	}

}
