package week2day1;



class car extends vehicle{
	   
	 
	   
	   public void Start() {
			 // this.model=x; 
			  System.out.println("Vehicle  car Starts");
		  }
		  public void Stops () {
			  System.out.println("vehicle car  Stops");
		  } 
}

class bike extends vehicle {
	   public   void Start() {
			 // this.model=x; 
			  System.out.println("Vehicle  bike Starts");
		  }
		  public void Stops () {
			  System.out.println("vehicle bike  Stops");
		  } 
}

public class vehicle {
	 String model;
	int Price;
	
	
  public  void Start() {
	 // this.model=x; 
	  System.out.println("Vehicle Starts");
  }
  public void Stops () {
	  System.out.println("vehicle Stops");
  }
  
  public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		vehicle s1=new car();//upcasting     child->partent
		s1.Start();
		s1.Stops();
		
		
	
		vehicle s2=new bike();
		s2.Start();s2.Stops();
		vehicle s3=new vehicle();
		s3.Start();
		s3.Stops();
		
		//car s5=new vehicle();//it shownCompileTime Error
		//direct  assigning Object shows Error 
	//car s4=(car) new vehicle();//it shows run Tim error
		//s4.Start();
		//s4.Stops();
		//if method is static it Always called parent class
		car s5=(car) s1;//downcasting parent->child
		
		//refference Shows Correct casting
		s5.Start();
		s5.Stops();

	}
}
  
  
	


