package Week10;

import java.util.ArrayList;
import java.util.List;

public class LambdaLoop {

	public static void main(String[] args) {
		List<Integer> student=new ArrayList<>();
		student.add(30);
		student.add(40);
		student.add(50);
		student.add(60);
		System.out.println("The mark of each student:");
		student.forEach((x)->System.out.println(x));
		//iterate through the list using forEach
		//print square of each number in the list
		student.forEach((x) -> System.out.println("Square:"+(x*x)));

	}

}
