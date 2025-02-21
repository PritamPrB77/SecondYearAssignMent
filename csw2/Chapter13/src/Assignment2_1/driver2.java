package Assignment2_1;

import java.util.*;

class book implements Comparable<book>{
	String bookid,name;
	Double bookprice;
	book(String bookid,String name, double price){
		this.bookid=bookid;this.bookprice=price; this.name=name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bookid, bookprice, name);
	}

	@Override
	public boolean equals(Object obj) {
		book that=(book)obj;
               if(this.bookid==that.bookid&& this.bookprice==that.bookprice&&this.name==that.name) {
            	   return true;
               }
               return false;
	}

	@Override
	public String toString() {
		return "book [bookid=" + bookid + ", name=" + name + ", bookprice=" + bookprice + "]";
	}
	public String getBookid() {
		return bookid;
	}
	public void setBookid(String bookid) {
		this.bookid = bookid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBookprice() {
		return bookprice;
	}
	public void setBookprice(double bookprice) {
		this.bookprice = bookprice;
	}

	@Override
	public int compareTo(book o) {
		// TODO Auto-generated method stub
		
		book that=(book) o;
		if(this.bookprice>that.bookprice) {
			return 1;
		}
		else if(this.bookprice<that.bookprice) {
			return -1;
		}
		else return 0;
	}
	
	public static void  compare(book s1,book s2) {
		book s12=(book) s1;
		book s13=(book) s2;
		if(s12.bookprice.compareTo(s13.bookprice)==1) {
			System.out.println(s12.name+"price is greater that"+s13.name);
		}
		else if(s12.bookprice.compareTo(s13.bookprice)==-1) {
			System.out.println(s12.name+"price is smaller than"+s13.name);
		}
		else {
			System.out.println("both are equal");
		}
		
	}
	


	
}





public class driver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  book s1=new book("s101","csw",2000);
  book s3=new book("s101","csw",2000);
  book s2=new book("s102","Ad",3456);
     System.out.println(s1+"\n"+s2+"\n");
//  
//   System.out.println(s2);
     List<book> al=new ArrayList<>();
     al.add(s1);al.add(s2);

     Iterator<book> itr= al.iterator();	
		while(itr.hasNext())
			System.out.println(itr.next());
		Collections.sort(al);
  System.out.println(al);
  
           book .compare(s1,s3);
	}

	
	

}
