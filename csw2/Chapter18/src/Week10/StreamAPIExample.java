package Week10;

import java.util.Arrays;
import java.util.List;

public class StreamAPIExample {

	public static void main(String[] args) {
		List<Integer> num=Arrays.asList(1,2,4,3,5,6,7,8);
		num.stream()
				      .filter(n->n%2 != 0)
				             .sorted()
				             .map(n -> n*2)
				             .forEach( (n)-> System.out.println(n));			             
	}
}
