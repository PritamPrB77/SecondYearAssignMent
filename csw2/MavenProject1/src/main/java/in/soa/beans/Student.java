package in.soa.beans;

public class Student {
   private int rollno;
   private String name;
   private Adress addr;
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
// since it return object better to add tostring in Adress class   by overridng that we directly print it
public Adress getAddr() {
	return addr;
}
public void setAddr(Adress addr) {
	this.addr = addr;
}
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", addr=" + addr + "]";
}
   
}
