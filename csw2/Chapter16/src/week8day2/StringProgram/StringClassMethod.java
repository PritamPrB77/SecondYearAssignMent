package week8day2.StringProgram;

public class StringClassMethod {

	public static void main(String[] args) {
		String str=" Mayur Ramgir ";
		System.out.println(str.length());//returns the length of string
		System.out.println(str.isEmpty());//true if str length is 0
		System.out.println(str.trim());
		
		String s1="java";
		String s2="JAVA";
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equalsIgnoreCase(s2));//true
		
		//compareTo() method compares 2 string lexicographically
		String s3="javaa";
		String s4="javaA";
		System.out.println(s3.compareTo(s4));
		System.out.println(s3.compareToIgnoreCase(s4));
		
		//concatenation "+" operator and concat() method
		String s5="Mayur";
		String s6=" Ramgir";
		System.out.println(s5+s6);
		System.out.println("Hallo"+" World");
		System.out.println(s5+10);//Mayur10
		System.out.println(s5+10+20);//Mayur1020
		System.out.println(10+20+s5);//30Mayur
		System.out.println(10+s5+20);//10Mayur20
		System.out.println(s5+10/2);//Mayur5
		//System.out.println(s5+10-5);//error
		System.out.println(s5.concat(s6));
		
		//join() method
		//join(charSequence delimeter, charSequence ... elements)
		System.out.println(String.join(";", s5,s6));
		System.out.println(String.join("@", s5,s6,s1,s2));
		
		//split() method
		//used to split string into a array of substring based on specified delimeters
		String st="My,Favorite,Programming,Language,is,Java";
		String[] strArr=st.split(",");
		for(String s:strArr)
			System.out.println(s);
		//split() with +ve number
		//The delimiter will be applied max of (no-1)
		String st1="I@Love@@Java@Programming@@";
		String[] strArr1=st1.split("@",3);
		for(String s:strArr1)
			System.out.println(s);
		//split() with -ve number
		//it will be applied as many times as possible
		String[] strArr2=st1.split("@",-1);
		for(String s:strArr2)
			System.out.println(s);
		//split() with zero
		//it will be applied as many times as possible only
		//trailing empty space is discarded
		String[] strArr3=st1.split("@",0);
		for(String s:strArr3)
			System.out.println(s);
		//split() with regular expression
		String myStr="My,Favorite@Programming?,Lanuage.Java";
		String[] strArr4=myStr.split("[,.?@]+");
		for(String s:strArr4)
			System.out.println(s);
		//subSequence(int begin, int end)
		//return charSequence excluding end
		String s="This is a demo String";
		System.out.println(s.subSequence(3, 9));
		//substring(int begin)
		//substring(int begin, int end)
		System.out.println(s.substring(3));
		System.out.println(s.substring(3, 9));
		
		//replace(char old, char new)
		String MyStr="this is demo";
		System.out.println(MyStr.replace("is","was"));
		System.out.println(MyStr.replaceFirst("is","was"));
		System.out.println(MyStr.replaceAll("is(.)","was"));
		System.out.println(MyStr.replaceAll("is(.*)", "was"));
		//indexOf() method
		String strr="Mayur Ramgir";
		System.out.println(strr.indexOf('M'));//0
		System.out.println(strr.indexOf("ay"));//1
		System.out.println(strr.lastIndexOf('a'));//7
		System.out.println(strr.charAt(3));
		System.out.println(strr.contains("ay"));
		System.out.println(strr.startsWith("Ma"));
		System.out.println(strr.endsWith("r"));
		
		//case conversion()
		System.out.println(strr.toUpperCase());
		System.out.println(strr.toLowerCase());
		
		//valueOf()--> converts value to string
		int a=10, b=20;
		String aa=String.valueOf(a);
		String bb=String.valueOf(b);
		System.out.println(a+b);//30
		System.out.println(aa+bb);//1020
		
		//toCharArray()--> converts to char sequence
		char[] cArr=strr.toCharArray();
		for(char c:cArr)
			System.out.println(c);
		
		
	}

}
