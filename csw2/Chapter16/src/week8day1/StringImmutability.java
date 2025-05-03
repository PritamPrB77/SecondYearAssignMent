package week8day1;

import java.util.*;

public class StringImmutability {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String str="Hello";
		
		System.out.println("Original String"+str);
//		try to modify
		str.concat("java");
		System.out.println("Modify String"+str);
//		 Since String is immutable it dont chage the orgina; String
		System.out.println();
		str=str.concat("java");
//		 
		System.out.println("Correct way modifed String is"+str );
		
//		 using charSequence
		
		CharSequence cs="Immutability";
		System.out.println("chat At 3"+cs.charAt(2 ));
		
		
		StringBuffer s1=new StringBuffer("java");
		StringBuffer s2=new StringBuffer("java");
//		 it is mutable and it doesnt override equals and since it is mutable and by new key word it craetes two memory loactiomn
//	with diff adress of s1 and s2
		System.out.println("s1==s2 "+(s1==s2));
	      System.out.println("s1.equals(s2) "+s1.equals(s2));
		StringBuffer s3=s1.append("python");
		System.out.println("s1 is"+s1);
		System.out.println("s3 is"+s3);
		 System.out.println("s1.equals(s2) "+s1.equals(s3));
			System.out.println("s1==s3 "+(s1==s3));
//		 capacity() method
		 /*
		  * 📌 Summary
✔ StringBuilder & StringBuffer do not override equals(), so they compare memory references.
✔ To compare content, use .toString().equals().
✔ Never use == for content comparison of StringBuilder or StringBuffer.
ublic class Main {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");

        System.out.println(sb1.toString().equals(sb2.toString()));  // ✅ true (content comparison)

        StringBuffer sbf1 = new StringBuffer("Hello");
        StringBuffer sbf2 = new StringBuffer("Hello");

        System.out.println(sbf1.toString().equals(sbf2.toString()));  // ✅ true
    }
}
		  * 
		  * 
		  */
		StringBuffer sb1=new StringBuffer();
		System.out.println(sb1.capacity());
		StringBuffer sb2=new StringBuffer("java");
		System.out.println(sb2.capacity());
		StringBuffer sb3=new StringBuffer(1000);
		System.out.println(sb3.capacity());
		
//		capacity expansion
		System.out.println("capacity expansion");
		StringBuffer sb4=new StringBuffer();
		sb4.append("Hell0");
		System.out.println(sb4.capacity());//16
		sb4.append("helewfjerhjhsuujhbevjxcjhbvjdcbvde");
//		 After Exceeding 16 it will be modeified
		System.out.println(sb4.capacity());
//		 New CApacity =(Current capacity*2)+2;
		sb4.trimToSize();
		System.out.println("sb4:"+sb4);
		System.out.println("length"+sb4.length());
//		chatAt()--> at a specific hindi
		System.out.println(sb4.charAt(3));
//		 delete() and deleteCharAt() method
		System.out.println(sb4.delete(2, 5));
//		 removes char form start to (end-1)
		System.out.println(sb4.deleteCharAt(3));
//		 indexOf() and  lastIndexOf()
		System.out.println(sb4.indexOf("e"));//
		System.out.println(sb4.lastIndexOf("e"));
//		 insert() methgods
		System.out.println(sb4.insert(2, "wow"));
//		insert wow at index 2
//		 replace() method
		System.out.println(sb4.replace(2, 4, "new"));;
//		 replace it 2-4 -->nit reaplce the specific String
//		Substrimg()--> method
		
		System.out.println(sb4.substring(2));
		System.out.println(sb4.substring(2,8));
//		 reverse() method
		System.out.println(sb4.reverse());
//		setCharAt() method
		
		sb4.setCharAt(1, 'z');
		
		System.out.println(sb4);
		
		
 
	}
}
