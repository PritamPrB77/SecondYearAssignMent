package Assignment_Chap_15;

import java.util.ArrayList;

public class G1Garbage {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ArrayList<Object> al=new ArrayList<>();
  for(int i=0;i<1000000;i++) {
	  al.add(new Object());
	  if(i%1000==0) {
		  printMemoryUse();
	  }
	  
	
		}
  System.gc();
  System.out.println("After Garbage Collection \n");
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
