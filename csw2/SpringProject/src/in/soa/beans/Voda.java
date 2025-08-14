package in.soa.beans;

public class Voda implements sim {
	private String Sname ; private int sid;
	@Override
	public String toString() {
		return "Voda [Sname=" + Sname + ", sid=" + sid + "]";
	}

	public String getSname() {
		return Sname;
	}

	public void setSname(String sname) {
		Sname = sname;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}


	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("calling from voda....");
	}

	@Override
	public void data() {
		this.calling();
	System.out.println(this);
		
	}
	
}
