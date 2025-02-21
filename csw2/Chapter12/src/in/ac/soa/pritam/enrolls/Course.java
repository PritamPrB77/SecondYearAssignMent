package in.ac.soa.pritam.enrolls;

public class Course {
	private String cId;
	private String cName;
	
	public Course(String cId,String cName) {
		this.cId=cId;
		this.cName=cName;
	}
	public String getcId() {
		return cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcId(String cId) {
		this.cId = cId;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
}
