package Hash;

import java.util.HashMap;
import java.util.HashSet;

public class isomorphicstring {
   /*
   a string is ismomrphic if its corresponding letter are same like axc->ntp
   but axa->ntp it false and axc-ntn it also false
    */

    public static  boolean CheckIsoMorph(String s1,String s2) {
        // my it attain quadratic t.c due to contains key method tp reduce it
        //we also use hash set
        HashMap<Character, Character> mp = new HashMap<>();
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (mp.containsKey(s1.charAt(i))) {
                if (mp.get(s1.charAt(i)) != s2.charAt(i)) return false;

            }
            else if (mp.containsValue(s2.charAt(i))) return false;
            else {
                mp.put(s1.charAt(i), s2.charAt(i));
            }
        }
        return  true;
    }

    public static  boolean CheckIsoMorph2(String s1,String s2) {

        HashMap<Character, Character> mp = new HashMap<>();
        HashSet<Character> st=new HashSet<>();
        if (s1.length() != s2.length()) return false;


        for (int i = 0; i < s1.length(); i++) {
            if (mp.containsKey(s1.charAt(i))) {
                if (mp.get(s1.charAt(i)) != s2.charAt(i)) return false;

            }
         //   else if (mp.containsValue(s2.charAt(i))) return false;

            else if(!st.add(s2.charAt(i))){//st.add(s2.charAt(i)) --> it
                /*
                Adds the specified element to this set if it is not already present.
                More formally, adds the specified element e to this set if this set
                contains no element e2 such that Objects.equals(e, e2). If this set
                already contains the element, the call leaves the set unchanged and returns false.
                 */
                return  false;
            }
            else {
                mp.put(s1.charAt(i), s2.charAt(i));
                st.add(s2.charAt(i));
            }
        }
        return  true;
    }

    public static void main(String[] args) {
        System.out.println( CheckIsoMorph2("axc","ntp"));
        System.out.println(CheckIsoMorph2("axa","ntp"));
        System.out.println(  CheckIsoMorph2("axc","ntn"));
    }

    }