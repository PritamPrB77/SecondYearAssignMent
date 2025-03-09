package week5day3;

public class Collage {
	
	private String cName,cLoc;

	Collage(String cName,String cLoc){
		this.cName=cName; this.cLoc=cLoc;
	
		
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcLoc() {
		return cLoc;
	}
	public void setcLoc(String cLoc) {
		this.cLoc = cLoc;
	}

	@Override
	public String toString() {
		return "Student [cName=" + cName + ", cLoc=" + cLoc +  "]";
	}

}
