package week12day1;

class MyThread1 extends Thread{
	@Override
	public void run(){
		System.out.println("Task-1");
		System.out.println(this.getName()+ " is running....");
	}
}
class MyThread2 extends Thread{
	@Override
	public void run(){
		System.out.println("Task-2");
		System.out.println(getName()+ " is running....");
	}
}
public class MultipleTaskThread {

	public static void main(String[] args) {
	MyThread1 t1=new MyThread1();
	t1.start();
	MyThread2 t2= new MyThread2();
	t2.start();
	}

}
