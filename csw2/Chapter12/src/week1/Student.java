package week1;


//24-1-2025
public class student {
 private int sid;
 private String sname;
 private Collage col;
 
 
 student(int id, String name, Collage c){
	   this.sid=id;
	   this.sname=name;
	   this.col=c;
	   
 }
 public void showdetail() {
	   System.out.println("Student id = "+sid);
	   System.out.println("Student name= "+sname);
	   System.out.println("Collage name = "+ col.getCname());
	   System.out.println("Collage location = "+col.getClocation());
	   
;   }
	public static void main(String[] args) {
		Collage c1 =new Collage ("ITER","BBSR");
		student s1= new student(12,"Ankit",c1);
//		s1.col.setCname("IIT Bhubaneswar");
		s1.showdetail();
		

	}

}
