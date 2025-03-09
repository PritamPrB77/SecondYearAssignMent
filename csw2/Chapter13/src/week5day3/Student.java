package week5day3;

public class Student {
	private int ID;
	private String name;
	private Collage clg;
	private   Address address;
	Student(int ID,String name,Collage clg,Address address){
		this.ID=ID;
		this.name=name;
		this.clg=clg;
		this.address=address;
		
	}
	@Override
	public String toString() {
		return "Student [ID=" + ID + ", name=" + name + ", clg="+ clg + ", address=" + address + "]"+"\n";
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Collage getClg() {
		return clg;
	}
	public void setClg(Collage clg) {
		this.clg = clg;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}


}
