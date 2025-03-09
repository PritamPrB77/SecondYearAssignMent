package in.soa.prb.priorityQueue;


import java.util.*;


public class priorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// it uses Heap ds and print  the Heap tree  when we wanna pq
		//by
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.add(3);
		pq.add(1);
		pq.add(2);
		pq.add(5);
		pq.add(4);
	// to print it use heap tree stracture print
	System.out.println(pq);
	System.out.println("head" +pq.element());// thrown exception if elemnt is not present
	System.out.println("head" +pq.peek());// return nullif the q is empty
	
	System.out.println("Size " +pq.size());
	System.out.println("iterating pq");
	
	Iterator<Integer> it=pq.iterator();
	while(it.hasNext()){
		System.out.println(it.next()+" ");
	}
	
	// to  remove element it uses heapify  method to remove
       System.out.println("Remove:"+pq.poll());// thrown exception if elemnt is not present
       System.out.println("Remove:"+pq.remove());// return nullif the q is empty
       System.out.println("is Queue is empty: "+pq.isEmpty());
       System.out.println("is elemt  present "+pq.contains(4));
       System.out.println("is elemt  present "+pq.contains(41));
       pq.clear();
       System.out.println(pq);
	}

}
