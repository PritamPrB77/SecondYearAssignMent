package week4day3;

import java.util.*;

public class Treeeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tree set
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(9);
		ts.add(2);
		ts.add(8);
		ts.add(4);
		ts.add(4);
		ts.add(11);
		ts.add(6);
		ts.add(1);
		System.out.println("Tree Set is"+ts);
		Iterator<Integer> it=ts.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		// bReverse order
		System.out.println("reverse order"+ ts.descendingSet());
		System.out.println(" Traversing descending order");
		Iterator<Integer> itr=ts.descendingIterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
           
		// retrive and remoVE THE FIRST  AND LAST ELEMENT
		// RETUIRN NULL IF treeset IS EMPTY
		System.out.println(" LOWEST VALUE"+ts.pollFirst());
		System.out.println(" highest VALUE"+ts.pollLast());
		System.out.println("tree set is+ "+ts);
		// retrive and  THE FIRST  AND LAST ELEMENT
        // RETUIRN Exception treeset  IS EMPTY
		System.out.println(" LOWEST VALUE"+ts.first());
		System.out.println(" highest VALUE"+ts.last());
		System.out.println("tree set is+ "+ts);
		
		//Hashet to tree set
		
		int arr[]= {21,23,43,53,22,65};
		HashSet<Integer> hs=new HashSet<>();
		LinkedHashSet<Integer> lhss=new LinkedHashSet<>();
		for(int i:arr) {
			hs.add(i);
			lhss.add(i);
		}
		System.out.println("Hashset is"+ hs);
		System.out.println(lhss);
		TreeSet<Integer> tts=new TreeSet<>(hs);
		System.out.println(" Hashset To TreeSet"+ tts);
		//since hashset is unorderd , treesort follow sorted order
		TreeSet<Integer> ttss=new TreeSet<>(lhss);
		System.out.println(" linkedHashset To TreeSet"+ ttss);
		 //since linkedhashset is unorderd , treesort follow  Sorted order
		// in tree set
	}

}
