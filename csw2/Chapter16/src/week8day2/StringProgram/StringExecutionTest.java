package week8day2.StringProgram;

public class StringExecutionTest {

	public static void main(String[] args) {
		int ITERATIONS=10000;
		String baseString="SOA University";
		//Measure time for String
		long strTime=measueString(ITERATIONS,baseString);
		//Measure time for StringBuffer
		long sbfTime=measureStringBuffer(ITERATIONS,baseString);
		//Measure time for StringBuilder
		long sbTime=measureStringBuilder(ITERATIONS,baseString);
		
		System.out.println("String Time:"+strTime/1_000_000+" ms");
		System.out.println("StringBuffer Time:"+sbfTime/1_000_000+" ms");
		System.out.println("StringBuilder Time:"+sbTime/1_000_000+"ms ");
	}
	public static long measueString(int iterations, String baseString) {
		//long start=System.currentTimeMillis();
		long start=System.nanoTime();
		String str=new String();
		for(int i=0; i<iterations; i++)
			str=str.concat(baseString);//creates new object every iteration
		long end=System.nanoTime();
		return end-start;
	}
	public static long measureStringBuffer(int iterations, String baseString) {
		long start=System.nanoTime();
		StringBuffer sbf=new StringBuffer();
		for(int i=0; i<iterations; i++)
			sbf.append(baseString);
		long end=System.nanoTime();
		return end-start;
	}
	public static long measureStringBuilder(int iterations, String baseString) {
		long start=System.nanoTime();
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<iterations; i++)
			sb.append(baseString);
		long end=System.nanoTime();
		return end-start;
	}
}
