package AssignmentChap12.CMS;

public class Student {
private int Sid;
private String Sname;
private Collage clg;

public int getSid() {
	return Sid;
}

public void setSid(int sid) {
	Sid = sid;
}

public String getSname() {
	return Sname;
}

public void setSname(String sname) {
	Sname = sname;
}

public Collage getClg() {
	return clg;
}

public void setClg(Collage clg) {
	this.clg = clg;
}

Student(String name,int id,Collage clg){
	this.clg=clg; this.Sname=name; this.Sid=id;
}


public  void DisplayInfo() {
	System.out.println("Name is"+this.Sname);
	System.out.println(" Student  ID is"+this.Sid);
	System.out.println("Collage Details is"+"\n"+this.clg.toString());
	
	
}




}
