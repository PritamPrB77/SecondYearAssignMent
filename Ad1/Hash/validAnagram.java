package Hash;

import java.util.HashMap;
//l-1
//by usinh 26 size character array you also do  it
public class validAnagram {
    //a string is anagram if i/p;- silent, listen it retturn true, anagram, gram return false
       //i> length must be equal
    //ii> freq of each char must be same
    //iii>no of char should be extra diff

    public static  boolean checkAnagram(String str1,String str2){

//        HashMap<Character,Integer>mp1=new HashMap<>();
//        HashMap<Character,Integer>mp2=new HashMap<>();
//
//        for (int i = 0; i < str1.length(); i++) {
//            if(mp1.containsKey(str1.charAt(i))){
//                mp1.put(str1.charAt(i),(mp1.get(str1.charAt(i)+1)));
//            }
//            else{
//                mp1.put(str1.charAt(i),1);
//            }
//        }
//        for (int i = 0; i < str2.length(); i++) {
//            if(mp2.containsKey(str2.charAt(i))){
//                mp2.put(str2.charAt(i),(mp2.get(str2.charAt(i)+1)));
//            }
//            else{
//                mp2.put(str2.charAt(i),1);
//            }
//        }

        HashMap<Character,Integer>mp1=makefreq(str1);
        HashMap<Character,Integer>mp2=makefreq(str2);
       if(str1.length()!=str2.length()){
           return false;
       }
        else {
           for(var e:mp1.entrySet()){
               if(!(mp2.containsKey(e.getKey())&&mp2.containsValue(e.getValue()))){
                   return  false;


               }
           }
       }

        return true;


    }
    public static  HashMap<Character,Integer> makefreq(String str1){

        HashMap<Character,Integer>mp1=new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            if(mp1.containsKey(str1.charAt(i))){
//                System.out.println(str1.charAt(i));
                mp1.put(str1.charAt(i),(mp1.get(str1.charAt(i))+1));
            }
            else{
                mp1.put(str1.charAt(i),1);
            }
        }
        return  mp1;
    }

public static  boolean checkAnagram2(String s1, String s2){

        if(s1.length()!=s2.length()) return false;
    HashMap<Character,Integer>mp1=makefreq(s1);
    HashMap<Character,Integer>mp2=makefreq(s2);

    return  mp1.equals(mp2);

}
//we can reduce sc
public static  boolean checkAnagram3(String str1, String str2){
    HashMap<Character,Integer>mp1=makefreq(str1);

    if(str1.length()!=str2.length()) return false;




    for (int i=0;i<str2.length();i++){
        Character ch=str2.charAt(i);
        if(!mp1.containsKey(ch)){
            return  false;
        }

        int a = mp1.get(ch).intValue();
       // System.out.println(ch);
       // System.out.println(a);
        mp1.put(ch,Integer.valueOf(a-1));
    }

    for(Integer i: mp1.values()){
        if(i!=0) return false;
    }
        return true;
}

    public static void main(String[] args) {
        System.out.println(checkAnagram("listenw","silent"));
        System.out.println(checkAnagram("listen","silent"));
        System.out.println(checkAnagram("keen","knee"));
        System.out.println("----");
        System.out.println(checkAnagram2("listenw","silent"));
        System.out.println(checkAnagram2("listen","silent"));
        System.out.println(checkAnagram2("keen","knee"));
        System.out.println("----");

        System.out.println(checkAnagram3("listenw","silent"));
        System.out.println(checkAnagram3("listen","silent"));
     System.out.println(checkAnagram3("keent","kneet"));

    }
}
