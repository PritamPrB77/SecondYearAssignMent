package week1;

import java.util.Scanner;

public class employee {
	
	private int salary;
	private String name;
	private int id;
	public static int calSalery=0;
     employee(int Salary,String name,int id) {
    	 this.id=id;
    	 this.name=name; this.salary=salary;
    	 System.out.println("Name is"+this.name+" "+  " id is"+this.id+" "+ " salery is"+ this.salary);
    	
     }
     
     public void setSalary(int salary) {
    	 this.salary=salary;
     }
     public void setname(String name) {
    	 this.name=name;
     }
     public void setid(int id) {
    	 this.id=id;
     }
     
     public int getSalary() {
    	 return this.salary;
     }
     public String getName() {
    	 return this.name;
     }
     public int getid() {
    	 return this.id;
     }
     
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		employee s1[]=new employee[sc.nextInt()];
		
		System.out.println("enter Data");
			for(int i=0;i<s1.length;i++) {
				s1[i]=new  employee(sc.nextInt(),sc.next(),sc.nextInt());
			}
			System.out.println("enter  Data Using Getter  MAthod");	
			
			for(int i=0;i<s1.length;i++) {
				s1[i].setid(sc.nextInt());
				s1[i].setname(sc.next());
				s1[i].setSalary(sc.nextInt());
			}
			System.out.println("print  Data Using setter method  MAthod");	
			for(int i=0;i<s1.length;i++) {
				System.out.println("Name is"+s1[i].getName()+"\n"+"Salery is is "+s1[i].getSalary()+"\n"+
			 "id is"+s1[i].getid());
				
				System.out.println();
			}
			
			//employee calSalery;
			for(int i=0;i<s1.length;i++) {
				calSalery+=s1[i].salary;
			}
			System.out.println("total Salery is"+calSalery);

	}

}
