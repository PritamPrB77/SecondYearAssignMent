package librarySystem;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class book extends LibraryResource{
  private int pagecount;
  private LocalDate issueDate;
  private int Duration;
  book(int pagecount, LocalDate localDate,int Duration,String title,String Author){
	  
	  super(title,Author);
	  this.Duration=Duration;
	  this.issueDate=localDate;
	  this.pagecount=pagecount;
	  
  }



public int getPagecount() {
	return pagecount;
}
public void setPagecount(int pagecount) {
	this.pagecount = pagecount;
}
public LocalDate getIssueDate() {
	return issueDate;
}
public void setIssueDate(LocalDate issueDate) {
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
