package week5day2;

import java.util.*;
import java.util.Map.Entry;

public class charfreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="aaaaabbbbbbbbcccccccc";
		LinkedHashMap<Character,Integer> hm=new LinkedHashMap<>();
		LinkedList<Character> ll=new LinkedList<>();
		
		int maxCharfreq=0;
		for(int i=0;i<s.length();i++) {
			if(hm.containsKey(s.charAt(i))) {
				hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
				maxCharfreq=Math.max(maxCharfreq, hm.get(s.charAt(i)));
			}
			else {
				hm.put(s.charAt(i), 1);
				maxCharfreq=Math.max(maxCharfreq, hm.get(s.charAt(i)));
			}
		}
		 
		for(Character e:hm.keySet()) {
			if(hm.get(e)==maxCharfreq) {
				ll.add(e);
			}
		}
		System.out.println(ll);
	
       }
		
		   
		
		
		
	}


