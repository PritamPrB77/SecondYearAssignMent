package week4day3;



import java.util.*;

public class Set {
         
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		var z=89;
		HashSet<String> hs=new HashSet<>();
		hs.add("java");
		hs.add("python");
		hs.add("c++");
		hs.add("c");
		hs.add("Rust");
		hs.add("python");
		hs.add("java");
		hs.add("python");
		System.out.println("Hashset"+hs);
		System.out.println("Hashset size "+hs.size());
		System.out.println("Search"+hs.contains("java"));
		System.out.println("Remove"+hs.remove(1));
		System.out.println("Hashset"+hs);
		//it is stores data based on hash function so  it is un-indexed and it return false if we pass index
		//it cant worksindex based but list works in index
		System.out.println("remove c"+hs.remove("c"));
		System.out.println("Hashset"+hs);
		
		System.out.println("Iterable HAshset");
		Iterator<String> itr= hs.iterator();// diff between iterator  and iterable
		     while(itr.hasNext()) {
		    	 System.out.print(itr.next()+" ");
		     }
		     System.out.println();
		//creating HAshset from ArrayList
		     ArrayList<String> al=new ArrayList<>();
		     al.add("csw1");
		     al.add("c");
		      al.add("Rust");
				al.add("python");
				al.add("java");
				al.add("python");
				System.out.println("ArrayList"+al);
				
				
				HashSet<String> hs2=new HashSet<>();
				for(String i:al) {
					hs2.add(i);
				}
				System.out.println(hs2);
				
				
	}

}
