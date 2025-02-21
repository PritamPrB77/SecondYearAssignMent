package week2Day3;

import java.util.Objects;

public class bookclass {
	private String name;
	private int id,price;
	bookclass(String name,int id, int price){
		this.name=name;
		this.id=id;
		this.price=price;
		
	}
	@Override
	public String toString() {
		return "" +"name is "+this.name+" id is "+ this.id+" price is "+this.price;
	}
@Override
	public boolean equals(Object s) {
		
		bookclass that=(bookclass)s;
		if((this.name==that.name)&& (this.price==that.price)) {
			return true;
		}
		
		else return false;
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(this.name,price);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bookclass s1=new bookclass("csw",01,10000);
		bookclass s2=new bookclass("csw",01,10000);
		bookclass s3=new bookclass("Ad",01,14560);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(" hash code of s1"+s1.hashCode());
		System.out.println(" hash code of s1"+s2.hashCode());
		System.out.println(" hash code of s1"+s3.hashCode());

	}

}
