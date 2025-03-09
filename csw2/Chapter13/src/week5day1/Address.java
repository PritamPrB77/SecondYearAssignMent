package week5day1;

import java.util.Set;
import java.util.*;

public class Address {
	
	private int plotNo;private String at; private int post;
	Address(int plotNo,String at,int post){
		this.plotNo=plotNo;
		this.at=at;
		this.post=post;
	}

	public int getPlotNo() {
		return plotNo;
	}

	public void setPlotNo(int plotNo) {
		this.plotNo = plotNo;
	}

	public String getAt() {
		return at;
	}

	public void setAt(String at) {
		this.at = at;
	}

	public int getPost() {
		return post;
	}

	public void setPost(int post) {
		this.post = post;
	}

	@Override
	public String toString() {
		return "Address is [plotNo=" + plotNo + ", at=" + at + ", post=" + post + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Address> tm=new TreeMap<>();
		tm.put("ankit", new Address(01,"patia",759019));
		tm.put("kiran", new Address(196,"BBSR",759103));
		tm.put("brahma", new Address(69,"cuttack",750560));
		tm.put("avas", new Address(45,"badgad",759025));
		
		for(Map.Entry m:tm.entrySet()) {
			System.out.println(" person is  "+m.getKey()+" "+m.getValue());
		}
		System.out.println();
		// it follows   sorting key order by default so output come accordingly
		for(String k:tm.keySet()) {
			System.out.println(k+" "+ tm.get(k));
		}
		
		
		Iterator<Map.Entry<String, Address>> itr= tm.entrySet().iterator();
		while (itr.hasNext()) { 
            Map.Entry<String, Address> entry = itr.next(); 
            System.out.println("Name: " + entry.getKey() + ", Address: " + entry.getValue()); 
        } 

	}

}
