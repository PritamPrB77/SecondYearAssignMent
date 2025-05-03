package week7day3;

public class StringClassMethod {

	public static void main(String[] args) {
		// String str="";
		String str = "  Mayur Ramgirir ";
		System.out.println(str.length());
		System.out.println(str.isEmpty());
		System.out.println(str.trim()); // it delete the space at starting and end
		String s1 = "java";
		String s2 = "JAVA";
		System.out.println(s1.equals(s2));// false
		System.out.println(s1.equalsIgnoreCase(s2));// true
		// compareTo( );
		String s3 = "java";
		String s4 = "jBvA";
		System.out.println(s3.compareTo(s4));
		// System.out.println(s3.compareToIgnoreCase(s4));
		// conatenation "+" operator and concat() method
		String s5 = "mayiur";
		String s6 = "Ramgirir";
		System.out.println(s5 + s6);
		System.out.println("Hello" + "World");
		System.out.println(s5 + 10 + 20);
		System.out.println(10 + 20 + s5);
		System.out.println(20 + s5 + 10);
		System.out.println(s5 + 10);
		System.out.println(s5 + 10 / 2); // it works based on priority
		System.out.println(s5 + 10 * 5);
		// System.out.println(s5+10-6); // error due to minus because + and - has same
		// priority and we cant minus 5 from an string
		System.out.println(s5.concat(s6));
		// join() method
		// join (charsequence delimeter,charSequence...elements
		System.out.println(String.join(";", s5, s6));
		System.out.println(String.join("@", s5, s6, s1));
		// split() method
		// used to split String into array of substring;
		String st = "My, Favorite,programming,Langua ,is,javage";
		String[] strarr = st.split(",");
		System.out.println(strarr+"------------------------------");
		for (String s : strarr) {
			System.out.println(s);
		}
		String str1 = "I@LOVe@@java@programming@@@@@";
		String[] strArr1 = str1.split("@", 3);
		for (String s : strArr1) {
			System.out.println(s);
		}
//	  String []  strArr2=str1.split("@",-1);
//	  for(String s:strArr2) {
//		  System.out.println(s);
//	  }
		// split with -ve no
		// as many times as possible
/*
 * 
 * symbol ke basis pe str1 string ko split kar do.

-1 ka matlab hai:

No limit on number of splits.

Trailing empty strings bhi preserve karo.
limit	Behaviour
>0	Maximum limit splits karoge
=0	All splits but trailing empty strings hataoge
<0	Unlimited splits and preserve empty strings
🎯 Final Words:
split("@", -1) ka matlab:

"@" ke according tod do aur agar end mein khaali parts aaye to unko bhi include karo"

Isliye "abc@def@ghi@@" ka output 5 elements ka array hota hai, jisme 2 empty strings bhi hote hain!

Bhai chaho to main iska ek chhota diagram bhi bana ke dikhata hoon jisme "@" ke positions aur splits clearly show karta hoon.
Batao chahiye kya? 📈😎
 */
		String[] strarr2 = str1.split("@", -1);

		for (String s : strarr2) {
			System.out.println(s+"   ,");
		}

		// split with zero
		// as many times as possible only the last trailing empty space is discareded

		String[] strarr3 = str1.split("@", 0);

		for (String s : strarr3) {
			System.out.println(s);
		}

//       split() with regex

    String mystr = "MY,Favorite@Programming?,Language.java";
	String[] strArr4 = mystr.split("[, . ? @ ]+");
	/*
		 * Breakdown of "[, . ? @ ]+"
[,] → Matches a comma ,

[.] → Matches a dot (period) .

[?] → Matches a question mark ?

[@] → Matches an at symbol @

[ ] → Matches a space

+ → Matches one or more occurrences of any of these characters
		 */
//      + -> used for one occurance and multiple occurance of the charcter and apply split at that places
		for (String s : strArr4) {
			System.out.println(s);
		}

//       subsequence(int begin,int end)--> nit start from begin upto end not include end
//       return charsequence exclusing end

		String ss = " this is a demo String";
		System.out.println(ss.subSequence(3, 9)); // 3 to 8
//       substring (int begin);
//      substring (int begin,int end);
		System.out.println(ss.substring(3));
		System.out.println(ss.substring(3, 9));
//		replace(charold,char,new)
		String Mystrr = "this is demo";
		System.out.println(Mystrr.replace("is", "was"));
		System.out.println(Mystrr.replaceFirst("is", "was"));

		System.out.println("=========");
		System.out.println(Mystrr.replaceAll("is(.)", "was"));
//		System.out.println(Mystrr.replaceAll("is(*)", "was"));
		
//      --> all the char  followeing a single character will  replace by was
//      -->(.) is for single chacater
//      -->(.*) is for all the character

		System.out.println(Mystrr.replaceAll("is(.*)", "was"));

//       indexOf Method();
		String stt = "Mayur Ramgir";
		System.out.println(stt.indexOf('M'));
		System.out.println(stt.indexOf("ay"));
		System.out.println(stt.lastIndexOf('a'));
		System.out.println(stt.charAt(3));
		System.out.println(stt.contains("ay"));
		System.out.println(stt.startsWith("M"));
		System.out.println(stt.endsWith("r"));

//		 case conversion
		System.out.println(stt.toLowerCase());
		System.out.println(stt.toUpperCase());

// valueOf()--> converts value to String
		int a = 10, b = 20;
		String aa = String.valueOf(a);
		String bb = String.valueOf(b);
		System.out.println(a + b);
		System.out.println(aa + bb);
		
//		// toCharArray()--converts to charsequence
		
		char[] cArr=stt.toCharArray();
		for(char e:cArr) {
			System.out.println(e);
		}
		
	}
}
