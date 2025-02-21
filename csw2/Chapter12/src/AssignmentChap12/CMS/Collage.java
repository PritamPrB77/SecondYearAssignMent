package AssignmentChap12.CMS;

public class Collage {
	private String Cname;
	private String cLoc;
	public Collage( String name,String string) {
		this.Cname=name; this.cLoc=string;
	}
	public String getCname() {
		return Cname;
	}

	public void setCname(String cname) {
		Cname = cname;
	}


	public String getcLoc() {
		return cLoc;
	}


	public void setcLoc(String cLoc) {
		this.cLoc = cLoc;
	}

public String toString() {
	return " clgName "+this.Cname+" Loacted At"+this.cLoc;
}


}
