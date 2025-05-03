package Week10;
interface Greeting{
	String Greet();
}
public class GreetingExample {

	public static void main(String[] args) {
		//Lambda expression saying hello
		Greeting obj1=()->{return "Hello Everyone!!";};
		//Lambda expression saying good evening
		Greeting obj2=()->{return "Good Evening!!";};
		
		System.out.println(obj1.Greet());
		System.out.println(obj2.Greet());

	}

}
