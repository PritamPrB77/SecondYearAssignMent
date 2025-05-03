package AssignMentlambda;

import java.util.function.Function;

public class squareOFNumber {
	
	public static Function<Integer,Integer> calculatesquare(){
		return x -> x*x;
	}
	public static void main(String[]args) {
		Function<Integer,Integer> square =calculatesquare();
		System.out.println("Square of Number is "+square.apply(3));
	}
}
