package AssignMentlambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

interface  customeComparator{
     int sortAsc(String s,String ss);
     
}


public class compARATOR {
public static void main(String[]args) {
	
	List<String> ss=Arrays.asList("x","xxx","xxxxx","xx");
	
//	 int customComparator=(String elem,String elem1)->{ return elem.length()-elem1.length() ;};
	customeComparator  customComp=(String s1,String s2)->{return s2.length()-s1.length() ;};
	
	Collections.sort(ss ,(elem1,elem2)->customComp.sortAsc(elem1,elem2));
	System.out.println(ss);
	
}
}
