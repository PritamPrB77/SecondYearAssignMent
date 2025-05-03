package week8day2;

public class StringExecutionTest {
	
	public static long measureString(int ITERATION,String baseString ) {
//		long start-System.currentTimeMillis();
		long start=System.nanoTime();
		String str=new String();
		for(int i=0;i<ITERATION;i++) 
			str=str.concat(baseString);//create new object every iterations
	   long end=System.nanoTime();
	   return end-start;
	}
	
	public static long measureStringBuffer(int ITERATION,String baseString ) {
		long start=System.nanoTime();
		StringBuffer str=new StringBuffer();
		for(int i=0;i<ITERATION;i++) 
			str=str.append(baseString);//create new object every iterations
	   long end=System.nanoTime();
	   return end-start;
	}
	
	public static long measureStringBuilder(int ITERATION,String baseString ) {
		long start=System.nanoTime();
		StringBuilder str=new StringBuilder();
		for(int i=0;i<ITERATION;i++) 
			str=str.append(baseString);//create new object every iterations
	   long end=System.nanoTime();
	   return end-start;
	}
	
 public static void main(String []args) {
	 
	 int ITERATION=10000;
	 String baseString="SOA University";
//	 Measure Time For String
	 long strTime=measureString(ITERATION,baseString);
//	 Measure Time For StringBuffer
	 long sbfTime=measureStringBuffer(ITERATION,baseString);
//	 Measure Time For StringBuilder
	 long sbTime=measureStringBuilder(ITERATION,baseString);
//	  i nano Sec=a0^6 miliiseconbd
	 System.out.println("String Time  "+ strTime/(int) Math.pow(10, 6)+" milliSec");
	 System.out.println("StringBuffer Time  "+sbfTime/1_000_000+" milliSec");
	 System.out.println("StringBuilder Time  "+ sbTime/(int)Math.pow(10, 6)+" milliSec");
 }

}
