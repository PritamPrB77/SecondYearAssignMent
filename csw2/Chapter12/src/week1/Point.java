
package week1;

//24-1-2025
 class point {

	private  int x;
	private  int y;
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
	 p2.display();
	 p1.x=100;
	 p1.display();
	 p1.setX(777);
	 p1.setY(7);
	}
	


}
