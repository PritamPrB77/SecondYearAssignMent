package AssignMentlambda;


//Function interface
interface calculator{
	int operate(int num1,int num2);
}
public class CalculaorDriver {

	public static void main(String[] args) {
		//Lambda expressions
		calculator add =(num1,num2) -> {return (num1 + num2);};
		calculator sub =(num1,num2) -> {return (num1 - num2);};
		calculator mul =(num1,num2) -> {return (num1 * num2);};
		calculator div =(num1,num2) -> {
			if(num2 != 0)
				return num1/num2;
			else
				throw new ArithmeticException("Divide by zero");
		};
		int a=10, b=5;
		System.out.println("Addition:"+add.operate(a,b));
		System.out.println("Subtraction:"+sub.operate(a,b));
		System.out.println("Multiplication:"+mul.operate(a,b));
		try {
			System.out.println("Division:"+div.operate(a,b));
		}
		catch(ArithmeticException e) {
			System.out.println("Error:"+e.getMessage());
		}
	}
}