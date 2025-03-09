package week5day1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HasMapExample {
// map is not apart of collections
	// we cant use iteartor here Also
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<Integer,String> mp=new HashMap<>();
        mp.put(1, "java");
        mp.put(2, "python");
        mp.put(3, "rust");
        mp.put(4, "c");
        mp.put(5, "c++");
        mp.put(3, "rustee");// it update the map
        
        System.out.println(" Hash MAp is:"+mp);
        
        // traverse Using entryset()
        System.out.println("Iterating Hash map");
        for(Map.Entry m:mp.entrySet()) {
        	System.out.println(" key is"+m.getKey()+"  value is"+m.getValue());
        }
    	
		System.out.println("iterating Hashmap using keyset");
		
		//traverse using keyset
		for(Integer k:mp.keySet()) {
			System.out.println(k+" "+mp.get(k));
		}
		// remove element
		
		//System.out.println(mp.remove("c"));// it return null if elemnt key not present
		//System.out.println(mp.remove(4,"c"));
		//System.out.println(mp.remove(4));
		for(Integer k:mp.keySet()) {
			System.out.println(k+" "+mp.get(k));
		}
		System.out.println("key exit :"+mp.containsKey(4));
		System.out.println("value exit :"+mp.containsValue("c"));
		
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
		lhm.put(17,"Java");
		lhm.put(18,"c");
		lhm.put(19,"javascrpt");
		lhm.put(20,"Java");
		System.out.println("lINKEDhASHMaP");
		for(Integer k:lhm.keySet()) {
			System.out.println(k+" "+lhm.get(k));
		}
		
		TreeMap<Integer,String> tm=new TreeMap<>();
		tm.put(17,"Java");
		tm.put(19,"CN");
		tm.put(18,"c");
		tm.put(20,"Java");
		tm.put(18,"RUST");
		
		
		System.out.println("TREE MAP");
		for(Map.Entry m: tm.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
        
	}

}
