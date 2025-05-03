package week8day2.StringProgram;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("Java");
		StringBuffer s2=new StringBuffer("Java");
		//equals method
		System.out.println("s1==s2:"+(s1==s2));
		System.out.println("s1.equals.(s2):"+s1.equals(s2));
		//StringBuffer does not override equals()
		
		//append() method
		StringBuffer s3=s1.append("Python");
		System.out.println(s1.length());
		System.out.println("s1.equals(s3):"+s1.equals(s3));
		
		//capacity() method
		StringBuffer sb1=new StringBuffer();
		System.out.println(sb1.capacity());
		StringBuffer sb2=new StringBuffer("Java");
		System.out.println(sb2.capacity());//20
		StringBuffer sb3=new StringBuffer(1000);
		System.out.println(sb3.capacity());
		
		//capacity expansion
		StringBuffer sb4=new StringBuffer();
		sb4.append("Hello ");
		System.out.println(sb4.capacity());//16
		sb4.append(" hello javaa ");
		System.out.println(sb4);
		System.out.println(sb4.capacity());
		//New capacity=(current capacity *2)+2
		sb4.trimToSize();
		System.out.println("sb4:"+sb4);
		System.out.println(sb4.length());
		
		//charAt() at a specific index
		System.out.println(sb4.charAt(3));//l
		//delete() and deleteCharAt() methods
		System.out.println(sb4.delete(2, 5));
		//removes char from start to (end-1)
		System.out.println(sb4.deleteCharAt(3));
		
		//indexOf() and lasIndexOf()
		System.out.println(sb4.indexOf("e"));//returns first Occurrence
		System.out.println(sb4.lastIndexOf("e"));
		
		//insert() method
		System.out.println(sb4.insert(2, "wow"));
		//insert wow at index 2
		
		//replace() method
		System.out.println(sb4.replace(2, 5, "new"));
		//replaces 2-4
		
		//substring() method
		System.out.println(sb4.substring(2, 5));
		System.out.println(sb4.substring(2));
		
		//reverse() method
		System.out.println(sb4.reverse());
		
		//setCharAt() method
		sb4.setCharAt(1, 'z');
		System.out.println(sb4);
		

	}

}
