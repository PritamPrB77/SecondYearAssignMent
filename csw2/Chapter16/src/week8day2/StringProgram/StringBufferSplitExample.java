package week8day2.StringProgram;

public class StringBufferSplitExample {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Java@,Python?C.CSS.HTML@");
		
		String[] words=sb.toString().split("[@,?.]+");
		//print the words
		for(String s:words) {
			System.out.println(s);
		}
		StringBuilder sbb=new StringBuilder("a,b,c,d,e,f");
		String word2[]=sbb.toString().split("[,]+");
		for(String s:word2) {
			System.out.println(s);
		}

	}

}
