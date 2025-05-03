package week8day1;

public class StringBufferSplit {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Java @,python?c,css.HTML@");
		StringBuffer s1=new StringBuffer("name name name");
		String[] words= s1.toString().split("[@,?.\t]+");
//		to split split String in String Buffer or builder we have to convert it into tooString
		//print the words
		for(String s:words) {
			System.out.println(s);
		}
	}
}
