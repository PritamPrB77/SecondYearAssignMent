package AssignMentlambda;

  interface StringProcessor{
	 int process(String s);
}

public class Main {
 public static void main(String [] args) {
//	StringProcessor res =(s)-> s.length();
	// System.out.println(res.process("Hello")); 
	 StringProcessor obj=(String s)->{return s.length();};
	 System.out.println(obj.process("Hello")); 
	 
 }
}
