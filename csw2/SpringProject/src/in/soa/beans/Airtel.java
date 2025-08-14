package in.soa.beans;



public class Airtel implements sim {
 private int Sid;
 private String Sname;
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

	@Override
public String toString() {
	return "Airtel [Sid=" + Sid + ", Sname=" + Sname + "]";
}

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("calling from airtel");
	}

	@Override
	public void data() {
		this.calling();
	System.out.println(this);
		
	}

}
