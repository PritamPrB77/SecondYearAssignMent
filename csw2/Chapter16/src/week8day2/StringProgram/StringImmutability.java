package week8day2.StringProgram;

public class StringImmutability {

	public static void main(String[] args) {
		String str="Hello";
		System.out.println("Original String:"+str);
		//trying to modify
		str.concat("Java!!");
		System.out.println("Modify String:"+str);
		//correct ways
		str=str.concat("Python!!");
		System.out.println("Modify String:"+str);
		
		//using charSequence
		CharSequence cs="Immutability";
		System.out.println("char at 3:"+cs.charAt(3));

	}

}
