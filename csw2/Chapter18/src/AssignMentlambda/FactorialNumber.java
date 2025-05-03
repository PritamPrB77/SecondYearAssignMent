package AssignMentlambda;

import java.util.function.Function;

public class FactorialNumber {
	public static Function<Integer,Integer> factorial(){
		return n -> {
			if(n==0 || n==1)
				return 1;
			else {
				int result=1;
				for(int i=2;i<=n;i++)
					result=result*i;
				return result;
			}
		};
	}
	public static void main(String[] args) {
		//calling higher order function
		Function<Integer,Integer> result=factorial();
		//passing argument to higher order function
		int output=result.apply(5);
		System.out.println("Factorial:"+output);
	}
}
