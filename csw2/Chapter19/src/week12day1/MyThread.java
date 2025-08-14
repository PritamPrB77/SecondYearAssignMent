package week12day1;



public class MyThread extends Thread{
	@Override
	public void run() {
        System.out.println("Task-1");
		System.out.println(getName()+ " is running....");
		//getName() give the thread name
	}
	public static void main(String[] args) {
    MyThread obj1= new MyThread();

    /*
     * In Java, there are two types of threads:

User Thread – Normal thread jo main kaam karta hai.

Daemon Thread – Background thread jo support ka kaam karta hai (jaise garbage collector).

isDaemon() kya karta hai?
Ye method true ya false return karta hai:

true → Agar thread daemon thread hai

false → Agar thread normal user thread hai
     */
    System.out.println(obj1.isDaemon());
    obj1.start();
   	    //single task and multiple thread
	    MyThread obj2= new MyThread();
	    obj2.start();
	}

}


