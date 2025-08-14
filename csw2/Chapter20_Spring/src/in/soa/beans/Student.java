package in.soa.beans;

public class Student {
	//Attributs ,Getter &Setter
  private String name;
  private int rollno;
  private String email;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public void display() {
	System.out.println("Name:"+name);
	System.out.println("RollNo,"+rollno);
	System.out.println("email"+email);
}
}
