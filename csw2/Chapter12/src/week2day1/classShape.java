package week2day1;


abstract class shape{
	
	double s1; double s2;
//	shape(){
//		
//	}
	public  shape(double a,double b) {
		this.s1=a;
		this.s2=b;
	}
	abstract public double Area() ;
	
}
 
class Rectangle extends shape{

public Rectangle(double  a,double b) {
	super(a,b); 
//	super();
//	super.s1=a;
//	super.s2=b;
	
}

void set(double  a,double b) {
	super.s1=a;
	super.s2=b;
}
       public double Area() {
    	  return s1*s2;
      }

}


class Trangle extends shape{

public Trangle (double  a,double b) {
	super(a,b);
	
}
       public double Area() {
    	  return 0.5*s1*s2; 
      }

}

public class classShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//shape obj=new shape(); we cant create object of it
		shape obj=new Rectangle(10.0,5.0);
		System.out.println("Area Of Rectangle is  "+obj.Area());
		
		obj=new Trangle(10.0,5.0);
		System.out.println("Area Of Trangle is  "+obj.Area());

	}

}
