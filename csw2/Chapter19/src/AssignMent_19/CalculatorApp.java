package AssignMent_19;

class AddThread extends Thread{
	private int a,b;
	public AddThread(int a, int b) {
		this.a=a;
		this.b=b;	
	}
	public void run() {
		System.out.println("Addition result is = "+ (a+b));
	}
}
class Substhread extends Thread{
	private int a,b;
	public Substhread(int a, int b) {
		this.a=a;
		this.b=b;	
	}
	public void run() {
		System.out.println("Substraction result is = "+ (a-b));
	}
}
class MultiPlication extends Thread{
	private int a,b;
	public  MultiPlication(int a, int b) {
		this.a=a;
		this.b=b;	
	}
	public void run() {
		System.out.println("Multiplication result is = "+ (a*b));
	}
}
class DivThread extends Thread{
	private int a,b;
	public DivThread(int a, int b) {
		this.a=a;
		this.b=b;	
	}
	public void run() {
		if(b!=0) {
			System.out.println("Division result is = "+ (a/b));
		}
		else
			System.out.println("Division can not be possible");
	}
}


public class CalculatorApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddThread add = new AddThread(10,5);
		Substhread sub = new Substhread(8,3);
		MultiPlication mul = new MultiPlication (4,6);
		DivThread div = new DivThread(9,3);
		add.start();
		sub.start();
		mul.start();
		div.start();

	}
}
