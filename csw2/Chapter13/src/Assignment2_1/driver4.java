package Assignment2_1;

import java.util.Arrays;
import java.util.Collections;

class Student1 implements Comparable<Student1>{
	String name;
	int rn,totalmark;
	Student1(String name,int rn,int  totalmark){
		this.name=name;
		this.rn=rn;
		this.totalmark=totalmark;
	}
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", rn=" + rn + ", totalmark=" + totalmark + "]";
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRn() {
		return rn;
	}
	public void setRn(int rn) {
		this.rn = rn;
	}
	public int getTotalmark() {
		return totalmark;
	}
	public void setTotalmark(int totalmark) {
		this.totalmark = totalmark;
	}
	@Override
	/*
	 * Sort by age (Ascending)

   Raj (21) and Sneha (21) come before Amit (22).
  If Age is Same, Sort by name (Alphabetically)

    Between Raj (21) and Sneha (21), "Raj" comes before "Sneha".
    If Name is Also Same, Sort by rollNumber (Ascending)

    Between Amit (22, 101) and Amit (22, 103), 101 comes first.
    
     Limitations of Comparable
    Sirf ek sorting logic define kar sakta hai (compareTo method).
   Agar multiple sorting orders chahiye, toh Comparator better hai!
	 */
	public int compareTo(Student1 o) {
		Student1 that=(Student1) o;
		 int rncomparesion = Integer.compare(this.rn, that.rn);
	        if (rncomparesion != 0) return rncomparesion;

	        // 2️⃣ If Age is Equal, Compare by Name
	        int nameComparison = this.name.compareTo(that.name);
	        
	        if (nameComparison != 0) return nameComparison;

	        // 3️⃣ If Name is Also Equal, Compare by Roll Number
	        return Integer.compare(this.totalmark, that.totalmark);
	}
	
           public static  boolean lins(Student1[] arr,String name) {
        	   
        	   for(Student1 i:arr) {
        		   if(i.getName()==name) {
        			   return true;
        		   }
        	   }
        	   return false;
                	 
             }
           
           
           
           
           
           public static void bubbleSort(Student1[]arr) {
        	   int n=arr.length;
        	   
        	   for(int i=0;i<n-1;i++) {
        		   for(int j=0;j<n-i-1;j++) {
        			   if(arr[j].rn>arr[j+1].rn) {
        				   Student1 temp=arr[j];
        				   arr[j]=arr[j+1];
        				   arr[j+1]=temp;
        			   }
        		   }
        	   }
        	   
           }
	
}



public class driver4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Student1[] arr= new Student1[3];
		arr[0]=new Student1("laxmi",101,340);
		arr[1]=new Student1("rudra",10,340);
		arr[2]=new Student1("aarvati",101,340);
		
	for(Student1 i:arr) {
		System.out.println(i.toString());
	}
	
	
	
	
	System.out.println();
		Arrays.sort(arr);
		//to sort the Array  by compare method we also use compareTo method
		for(Student1 i:arr) {
			System.out.println(i.toString());
		}
		
	System.out.println(	Student1.lins(arr,"laxmi"));
		System.out.println(Student1.lins(arr,"laxmiii"));
		
		
		Student1.bubbleSort(arr);
		for(Student1 i:arr) {
			System.out.println(i.toString());
		}
		
		
	}

}
