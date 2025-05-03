package week7day2;

public class Student {
String name;
  public Student(String name) {
	  this.name=name;
  }
  
  public void display() {
	  System.out.println(" Student name "+this.name);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             new Student("MauyrRamgit").display();
//            anynomous object  without refference
             System.gc();
	}
	@Override
	protected void finalize()  throws Throwable{
		System.out.println(this.name +"  sucessfully garbage collected");
	}  

}
