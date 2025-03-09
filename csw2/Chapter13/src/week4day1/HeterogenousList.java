package week4day1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HeterogenousList {

	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<>();
		al.add("String");
		al.add(123);
		al.add(3.14);
		al.add(true);
		System.out.println(al);
		
		//Convert ArrayList to array
		ArrayList<String> list = new ArrayList<>();
		list.add("java");
		list.add("c");
		list.add("Python");
		
		String[] items= list.toArray(new String[list.size()]);
		for(String s:items)
			System.out.print(s+" ");
		//Convert Array to ArrayList
		String[] arr={"os","cn","ai","c"};

		List <String>list2= new ArrayList<String>();
		list2 = Arrays.asList(arr);
		System.out.println("LIst ="+list2);
		
		
		list.addAll(list2);
		System.out.println(list);
				
				
	}

}
