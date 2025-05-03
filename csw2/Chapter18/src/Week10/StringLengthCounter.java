package Week10;
interface StringProcessor{
	int process(String str);
}
public class StringLengthCounter {

	public static void main(String[] args) {
		StringProcessor obj=(str) -> {return str.length();};

		System.out.println("Length of hello:"+obj.process("Hello"));
		System.out.println("Length of Lambda:"+obj.process("Lambda"));
		System.out.println("Length of Expression:"+obj.process("Expression"));
		
	}

}
