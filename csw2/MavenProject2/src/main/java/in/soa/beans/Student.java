package in.soa.beans;


public class Student {
   private int rollno;
   private String name;
   private Adress addr;

// since it return object better to add tostring in Adress class   by overridng that we directly print it

public Student(int rollno, String name, Adress addr) {
	
	this.rollno = rollno;
	this.name = name;
	this.addr = addr;
}

@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", addr=" + addr + "]";
}
   
}
