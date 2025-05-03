package week7day2;

import java.util.ArrayList;

public class MemoryTestLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ArrayList<Object> al=new ArrayList<>();
  for(int i=0;i<1000000;i++) {
	  al.add(new Object());
	  if(i%1000==0) {
		  printMemoryUse();
	  }
  }
//  Explicit call gc
//   after garbage collected it defragment the memory and show some portion of it show it shows less
//  
//  
  /* initially it 
   * Heapsize 126 Mb
FreeSpace 124 Mb
usedMemory1 Mb 

then memory used increases and after cleaning it will show some part of memeory by defragmenting the memory
not whole memory 

// you see that memory used will increasing after increasing calls
///
   */
//  Heapsize 10 Mb
//  FreeSpace 9 Mb
//  usedMemory0 Mb
  
  
  
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
