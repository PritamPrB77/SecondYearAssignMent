package week3day3;
import java.util.*;
public class linkedlist {
	

	
		public static void main(String []args) {
			LinkedList<String> ll=new LinkedList<>();
			ll.add("java");
			ll.add("Python");
			ll.add("C++");
			
//			System.out.println(ll);
			Iterator itr=ll.iterator();
			while(itr.hasNext()) {
				System.out.print(itr.next()+" ");
			}
			System.out.println();
			System.out.println(ll.size());
			
			//To add first
			ll.addFirst("Ruby");
			//To add last
			ll.addLast("C#");
			
			System.out.println(ll.getFirst());
			System.out.println(ll.getLast());
			
			ll.removeFirst();
			ll.removeLast();
			
			Iterator itr2=ll.descendingIterator();
			while(itr2.hasNext()) {
				System.out.print(itr2.next()+" ");
			}
			///se how linkedList Behave like An Queue
			//fifo
			System.out.println();
			LinkedList<Integer> q=new LinkedList<>();
			for(int i=0;i<5;i++) {
				q.addLast(i);
			}
			System.out.println(q);
			System.out.println(q.removeFirst());
			System.out.println(q);
			System.out.println(q.removeFirst());
			System.out.println(q);
			//se how linkedList Behave like An Stack
			//lifo
			System.out.println();
			LinkedList<Integer> stk=new LinkedList<>();
			for(int i=0;i<5;i++) {
				stk.addFirst(i);
			}
			System.out.println(stk);
			System.out.println(stk.removeFirst());
			System.out.println(stk);
			System.out.println(stk.removeFirst());
			System.out.println(stk);
		
		}
	}


