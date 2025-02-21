package week2day1;






interface vehicle1{
	public static final int x = 0;//it cant have normal variable so it cant have constructor
	
	void accelerate();
       void breaak();
       
	

}
class car1 implements vehicle1{

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("car acceleratyed");
		
	}

	@Override
	public void breaak() {
		// TODO Auto-generated method stub
		System.out.println("car break");
		
	}
	
}

class bike1 implements vehicle1{

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("bike acceleratyed");
		
	}
	public void accelerate(int s) {
		// TODO Auto-generated method stub
		System.out.println("bike acceleratyed");
		
	}
	public void accelerate(int s,int d) {
		// TODO Auto-generated method stub
		System.out.println("bike acceleratyed");
		
	}

	@Override
	public void breaak() {
		// TODO Auto-generated method stub
		System.out.println("bike break");
		
	}
	
}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using itnerface refference we create abject And Get metrhods
		
		vehicle1 v1=new car1();
		v1.accelerate();
		v1.breaak();
		vehicle1 v2=new bike1();
		
		v2.accelerate();
		v2.breaak();
	}

}
