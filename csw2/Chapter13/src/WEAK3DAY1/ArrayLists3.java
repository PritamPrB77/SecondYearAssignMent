package WEAK3DAY1;
import java.util.*;


class course{
	int cid;
	String cname;
	int clectCount;
	course(int x,String y, int z){
		this.cid=x;this.clectCount=z; this.cname=y;
	}
	
	
	



public  String toString  () {
	return "[ cid "+ this.cid+" cName is "+this.cname+" clectcount "+this.clectCount+"  ]";
}
}

public class ArrayLists3 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<course> s1=new ArrayList<>();
		
		System.out.println("Enter the size of Arralist And add element");
		int a=2;
		System.out.println("enter");
		for(int i=0;i<a;i++) {
			s1.add(new course(sc.nextInt(),sc.next(),sc.nextInt()));
		}
		Iterator<course> itr=s1.iterator()	;
		
		System.out.println(s1);
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
