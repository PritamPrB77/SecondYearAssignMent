package AssignmentChap12;



interface vehicle{
	public static final int x = 0;
	//it cant have normal variable so it cant have constructor
	
	void accelerate();
       void breaak();
       
	

}
class car1 implements vehicle{

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("car acceleratyed");
		
	}
	public void accelerate(int speed,int duration) {
		// TODO Auto-generated method stub
		System.out.println("car accelerate with speed"+speed+" duration "+duration);
		
	}

	@Override
	public void breaak() {
		// TODO Auto-generated method stub
		System.out.println("car break");
		
	}
	
}

class bicycle implements vehicle{

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("bike acceleratyed");
		
	}
	public void accelerate(int s) {
		// TODO Auto-generated method stub
		System.out.println("bike acceleratyed with speed"+s);
		
	}
	public void accelerate(int speed,int dduration) {
		// TODO Auto-generated method stub
		System.out.println("bike accelerate with speed km/h"+speed+" duration "+dduration);
		
	}

	@Override
	public void breaak() {
		// TODO Auto-generated method stub
		System.out.println("bike break");
		
	}
	
}


public class VehicleApp {
	
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//using itnerface refference we create abject And Get metrhods
			
			vehicle v1=new car1();
			
			car1 c1=new car1();
			c1.accelerate(20,30);
			v1.accelerate();
		//	v1.accelerate(40,30);
			v1.breaak();
			vehicle v2=new bicycle();
			
	     bicycle s1=new bicycle();
	     s1.accelerate(40);
			v2.accelerate();
			v2.breaak();
		

	}

}
