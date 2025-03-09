package ASSIGNMENT_2_2;


import java.util.HashMap;

public class AnagramCheck {
	public static 	HashMap<Character,Integer> map(String s){
		HashMap<Character,Integer> hm=new HashMap<>();
//		for(int i=0;i<s.length();i++) {
//			if(hm.containsKey(s.charAt(i))) {
//				hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
//				
//			}
//			else {
//				hm.put(s.charAt(i), 1);
//				
//			}
//		}
		
		// we converting String to Character Array and comapare  each element of char array
		for(char i:s.toCharArray()) {
			if(hm.containsKey(i)) {
				hm.put(i, hm.get(i)+1);
			}
			else {
				hm.put(i, 1);
			}
		}
		return hm;
	}
	
	public static boolean  classCheckAnagram(String s,String s2) {
		HashMap<Character,Integer> hm=map(s);
		HashMap<Character,Integer> hm2=map(s2);
		System.out.println(hm);
		System.out.println(hm2);
		
		if(s.length()!=s2.length())
            {     return false;

             }
		
		for(int i=0;i<s.length();i++) {
			if(!(hm.get(s.charAt(i))==hm2.get(s.charAt(i)))) {
				return false;
			}
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(classCheckAnagram("listen","silent"));

	}

}
