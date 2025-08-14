package AssignMent_19;

public class CalculatorLambdaApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // Define the Operand
		int a=10;
		int b=5;
		// perform arithmetic operations using lambda  expression
		//Addition
		//Runnable->Interface name;
		Runnable run1=()->System.out.println("Addition "+(a+b));
		Thread add= new Thread(run1);
		//Substraction
		Runnable run2=()->System.out.println("Substraction "+(a-b));
		Thread sub=new Thread(run2);
		//Multiplication
		Runnable run3=()->System.out.println("Multiplication"+(a*b));
		Thread mul=new Thread(run3);
		// Division
		Runnable run4=()->{
			if(b!=0) {
				System.out.println("Division Result"+(a/b));
			}
			else {
				//System.out.println("cant divide by zero");
				throw new ArithmeticException("dvdf");
			}
			};
			Thread div=new Thread(run4);
			//start thread
			add.start(); mul.start();sub.start();
			try {
				div.start();
			}
			catch(Exception e) { System.out.println(e.getMessage());}
	}

}
