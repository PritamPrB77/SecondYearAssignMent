package week7day2;

public class MemoryTest {
      int var1;double var2;
      MemoryTest(int var1,double var2){
    	  this.var1=var1;this.var2=var2;
      }
	@Override
	public String toString() {
		return "MemoryTest [var1=" + var1 + ", var2=" + var2 + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Before Objevct Creation: \n ");
       printMemoryUse();
       MemoryTest t1=new MemoryTest(4,5.5);
       MemoryTest t2=new MemoryTest(20,20.5);
       System.out.println("After Objevct Creation:  \n");
       printMemoryUse();
//        making object UnReachable
       t1=t2;//re-assigning the refference
       t2 =null;// nullified the refference
       System.gc();// calling gc
       System.out.println(" After Garbage Collection:  \n");
       printMemoryUse();
       
	}
	@Override
	protected void finalize() throws Throwable{
		System.out.println(this.var1+" successfully garbate collected");
	}
	public static void  printMemoryUse() {
		long  totalMemory=Runtime.getRuntime().totalMemory();
		long  freeMemory=Runtime.getRuntime().freeMemory();
		long usedmemory=totalMemory-freeMemory;
		System.out.println("Heapsize "+totalMemory / (1024*1024)+" Mb");
		System.out.println("FreeSpace "+freeMemory/ (1024*1024)+" Mb");
		System.out.println("usedMemory"+usedmemory/ (1024*1024)+" Mb");
		
		
	}
	

}
