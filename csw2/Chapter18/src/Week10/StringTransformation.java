package Week10;

import java.util.function.Function;

public class StringTransformation {
	//Define a higher order function
	public static Function<String,String> transformString(){
		return str -> str.toUpperCase();
	}
	public static void main(String[] args) {
		//calling higher order function
		Function<String,String> upperStr=transformString();
		String s1="java program";
		//passing arguments to higher order function
		String s2=upperStr.apply(s1);
		System.out.println("Transform string:"+s2);
	}
}
