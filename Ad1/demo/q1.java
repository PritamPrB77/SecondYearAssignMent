package demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
//set Inteface
//in hash set all elements afre unordered
//it uses Hashing Internally

public class q1 {
//    public static void main(String[] args) {
////        HashSet  <Integer> st=new HashSet<>();
////        st.add(1);
////        st.add(2);
////        st.add(3);
////        System.out.println(st);//1,2,3
////        st.add(1);
////        st.add(2);
////        st.add(2);
////        System.out.println(st);//1,2,3
////        st.remove(2);
////        System.out.println(st.contains(2));
////        System.out.println(st.size());
//    }


}

//MAP interface
//mapping in key value  pairs
class map{
    public static void main(String[] args) {
        Map<Integer,String > map=new HashMap<>();
        map.put(1,"riya");
        map.put(2,"radha");
        map.put(3,"ram");
        map.put(4,"sriya");
        map.put(5,"riyaan");
        System.out.println(map);
        System.out.println(map.containsKey(7));
        System.out.println(map.containsValue("riya"));
    }
}