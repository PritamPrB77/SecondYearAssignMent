package librarySystem;

import java.util.Date;

public class DVD extends LibraryResource{
	  private int pagecount;
	  private Date issueDate;
	  private int Duration;
	  DVD(int pagecount, Date isuedate,int Duration,String title,String Author){
		  
		  super(title,Author);
		  this.Duration=Duration;
		  this.issueDate=isuedate;
		  this.pagecount=pagecount;
		  
	  }
	public int getPagecount() {
		return pagecount;
	}
	public void setPagecount(int pagecount) {
		this.pagecount = pagecount;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public int getDuration() {
		return Duration;
	}
	public void setDuration(int duration) {
		Duration = duration;
	}
	@Override
	public void Displaydetails() {
		// TODO Auto-generated method stub
		
		System.out.println(" bookNamn  "+super.getTitle()+"\n"+"book Author is "+ super.getAuthor());
		System.out.println("boook pagecount is "+ this.pagecount);
		System.out.println("boook issueDate is "+ this.issueDate);
		System.out.println("boook Duration is "+ this.Duration);
		
	}
}
