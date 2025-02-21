package AssignmentChap12;



public class point {

	private  int x,y;
	//private  int y;
	 point(int x, int y){
		 this.x=x;
		 this.y=y;
	 }
	 point(point p){
		 this.x=p.x;
		 this.y=p.y;
	 }
	 public int getX() {
		return x;	
	}
	public void setX(int x) {
		this.x = x;
		System.out.println("x value = "+ x);
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;	
		System.out.println("y value = "+ y);
	}
	void display() {
		 System.out.println("x value = "+ x);
		 System.out.println("y value = "+ y);
	 }
	public static void main(String[] args) {
	 point p1 = new point(5,10);
	 p1.display();
 point p2 = new point (p1);
//	 point p2=p1;--> if we Give Direct Refference Then Changing One Object Affect Other 
 // Instead of Doing that We use Copy constructor methosd
 // it prevent Object Modification concepts Allows The Use of Object.clone method
	 p2.display();
	 
	 System.out.println();
	 p1.x=100;
	 p1.display();
	// p1.setX(777);
	 
	 
	// p1.display();
	 System.out.println();
	 p2.setY(7);
	 System.out.println();
	  p1.display();
	  p2.display();
	}

}
