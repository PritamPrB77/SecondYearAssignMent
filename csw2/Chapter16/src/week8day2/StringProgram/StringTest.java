package week8day2.StringProgram;

public class StringTest {

	public static void main(String[] args) {
		//using String literals
		String s1="Java";
		String s2="Java";
		//using new Keywords
		String s3=new String("Java");
		String s4=new String("Java");
		
		//comparison
		System.out.println("s1==s2:"+(s1==s2));
		System.out.println("s3==s4:"+(s3==s4));
		
		//using equals() method
		System.out.println("s1.equals(s2):"+s1.equals(s2));
		System.out.println("s1.equals(s3):"+s1.equals(s3));
		System.out.println("s3.equals(s4):"+s3.equals(s4));
		

	}

}
