package week4day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



class empSalary implements Comparator< Employee> 
{

	@Override
	public int compare(Employee o1,  Employee o2) {
		// TODO Auto-generated method stub
		
		if( o1.getSalary()<o2.getSalary()) {
			return -1;
		}
		
		
		else if(o1.getSalary()>o2.getSalary()) {
			return 1;
		}
		return 0;
	}
}


 class empID implements Comparator< Employee> {

	@Override
	public int compare( Employee o1,  Employee o2) {

		return o1.getEmpid().compareTo(o2.getEmpid());
	}

}



class Employee{
	private String empid;private String name; private double salary;
	Employee(String empid,String name, double salary){
		this.empid=empid; this.name=name;this.salary=salary;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
	
}


public class Empdriver {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> al=new ArrayList<>();
		al.add(new Employee("s101","ankit",50));
		al.add(new Employee("a102","ankit1",20));
		al.add(new Employee("z103","ankit2",80));
		
		System.out.println(".................IdComp................");
		
		Collections.sort(al,new empID() );
		for( Employee  i:al) {
			System.out.println(i.toString());
		}
		System.out.println(".................Salary................");
		Collections.sort(al,new empSalary() );
		for( Employee  i:al) {
			System.out.println(i.toString());
		}
		

	}

}
