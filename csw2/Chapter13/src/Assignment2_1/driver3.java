package Assignment2_1;

import java.util.*;

class car implements Comparable<car>{
	private String model,color;
private 	int speed;
	
	car(String model,String color,int speed){
		this.color=color;
		this.speed=speed;
		this.model=model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public int compareTo(car o) {
		car that=(car) o;
		if(this.speed>that.speed) {
			return 1;
		}
		else if(this.speed<that.speed) {
			return -1;
		}
		else return 0;
	}
	
public static void compare(car c1,car c2) {
	if(c1.speed>c2.speed) {
		System.out.println("car "+c1.model+" have greater Speed");
	}
	else if(c1.speed<c2.speed) {
		System.out.println("car "+c2.model+" have greater Speed");
	}
	else {
		System.out.println(" both car "+" have same speed Speed");
	}
}

@Override
public String toString() {
	return "car [model=" + model + ", color=" + color + ", speed=" + speed + "]";
}
	
	
}
public class driver3 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
             car c1=new car("BMW","BLACK",30);
             car c2=new car("aUDI","white",50);
             car c3=new car("BMW","BLACK",30);
             
             
             List<car> al=new ArrayList<>();
             al.add(c1);al.add(c2);

             Iterator<car> itr= al.iterator();	
        		while(itr.hasNext())
        			System.out.println(itr.next());
        		Collections.sort(al);
          System.out.println(al);
          
         car. compare(c1,c2);
             
             
             
	}

	

}
