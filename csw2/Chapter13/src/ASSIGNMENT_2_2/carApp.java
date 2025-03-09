package ASSIGNMENT_2_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class car implements Comparable{
	private int modelno,stock; private String name;
	  car( int modelno, String name,int stock)
	  {
		  this.modelno=modelno;
		  this.stock=stock;
		  this.name=name;
	  }
	  
	@Override
	public String toString() {
		return "car [modelno=" + modelno + ", stock=" + stock + ", name=" + name + "]";
	}

	public int getModelno() {
		return modelno;
	}
	public void setModelno(int modelno) {
		this.modelno = modelno;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		car that=(car)o;
		return Integer.compare(this.stock, that.stock);
	}
}


public class carApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<car> al=new ArrayList<>();
		al.add(new car(2017 ,",Audi,", 45));
		al.add(new car(2013 ,",Creta,", 10   ));
		al.add( new car(2015 ,",BMW,", 55));
		al.add(new car(2020 ,",MG 13,", 13 ));
		al.add(new car(2018 ,",Kia 20 ,",20 ));
		
		
	
		
		for( car i:al) {
			System.out.println(i);
		}
	
		System.out.println();
		Collections.sort(al);
		for( car i:al) {
			System.out.println(i);
		
		}
		
		
	}

}
