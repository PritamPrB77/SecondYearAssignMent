package StringAssignMent;

public class Stringg {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before memory Object Craetion is");
		 printMemoryUse();
		String s1="java", s2="java";
		String s3=new String("java");
		String s4=new String("java");
	      System.out.println("s1==s2 is  "+(s1==s2)); 
	      // Here () in (s1==s2) is important due to String conactenation and pritritize value
	      System.out.println("s1==s3  "+(s1==s3));// same here also
	      System.out.println("s3==s4  "+(s3==s4));// same here also
	      System.out.println("s1.equals(s3) "+s1.equals(s3));
	      System.out.println("s1.equals(s2) "+s1.equals(s2));
	      System.out.println("s3.equals(s4 ) "+s3.equals(s4));
	  	System.out.println("After memory Object Craetion is");
		 printMemoryUse();
		  	System.out.println("After Garabge cleatr Craetion is");
		  	System.gc();
			 printMemoryUse();
	}
	
	public static void  printMemoryUse() {
		long  totalMemory=Runtime.getRuntime().totalMemory();
		long  freeMemory=Runtime.getRuntime().freeMemory();
		long usedmemory=totalMemory-freeMemory;
		System.out.println("Heapsize "+totalMemory / (1024*1024)+" Mb");
		System.out.println("FreeSpace "+freeMemory/ (1024*1024)+" Mb");
		System.out.println("usedMemory"+usedmemory/ (1024*1024)+" Mb\n");
		
		
	}


}
