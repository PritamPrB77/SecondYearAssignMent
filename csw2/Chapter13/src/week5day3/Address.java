package week5day3;

public class Address {
  private int plotNo,post;
  private String at;
   public    Address(int plotNo,String at,int post){
    	   this.at=at; this.plotNo=plotNo;
    	   this.post=post;
    	   
       }
	
	@Override
	public String toString() {
		return "Address [plotNo=" + plotNo + ", post=" + post + ", at=" + at + "]";
	}
	public int getPlotNo() {
		return plotNo;
	}
	public void setPlotNo(int plotNo) {
		this.plotNo = plotNo;
	}
	public int getPost() {
		return post;
	}
	public void setPost(int post) {
		this.post = post;
	}
	public String getAt() {
		return at;
	}
	public void setAt(String at) {
		this.at = at;
	}
  
}
