package Assignment_Chap_15;



public class RunTimeClasss {
	private int var1;private double var2;
     RunTimeClasss(int var1,double var2){
   	  this.var1=var1;this.var2=var2;
     }
	@Override
	public String toString() {
		return "MemoryTest [var1=" + var1 + ", var2=" + var2 + "]";
	}
	public int getVar1() {
		return var1;
	}
	public void setVar1(int var1) {
		this.var1 = var1;
	}
	public double getVar2() {
		return var2;
	}
	public void setVar2(double var2) {
		this.var2 = var2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Before Objevct Creation: \n ");
      printMemoryUse();
       RunTimeClasss t1=new    RunTimeClasss(4,5.5);
        RunTimeClasss t2=new    RunTimeClasss(20,20.5);
 t2.setVar1(45);
 t1.setVar1(45);
 t2.setVar2(35.55);
      System.out.println("After Objevct Creation:  \n");
      printMemoryUse();
//       making object UnReachable
      t1=t2;//re-assigning the refference
      t2=null;// nullified the refference
    
      System.gc();// calling gc
      System.out.println(" After Garbage Collection:  \n");
      printMemoryUse();
      
	}
	public static void  printMemoryUse() {
		long  totalMemory=Runtime.getRuntime().totalMemory();
		long  freeMemory=Runtime.getRuntime().freeMemory();
		long usedmemory=totalMemory-freeMemory;
		System.out.println("Heapsize "+totalMemory / (1024*1024)+" Mb");
		System.out.println("FreeSpace "+freeMemory/ (1024*1024)+" Mb");
		System.out.println("usedMemory"+usedmemory/ (1024*1024)+" Mb");
		
		
	}
	
	protected void finalize() throws Throwable{
		System.out.println(" successfully gc collectess"+ this.var1+ this.var2);
	}
}
