package WEAK3DAY1;



import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListexample {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al1=new ArrayList<>();
		al1.add(21);
		al1.add(23);
		al1.add(233);
		al1.add(231);
		al1.add(2312);
       System.out.println("Total items:"+al1.size());	
       
       // tRAVERSING aRRAYlIST IN aRRAY fORMAT
       System.out.println(al1);
       
       
       // tRAVERSING aRRAYlIST uSING fOR EACHlOOP
        for(int  i:al1) {
        	System.out.println(i);
        }
     // tRAVERSING aRRAYlIST uSING fOR LOOP
        for(int  i=0;i<al1.size();i++) {
        	System.out.print(al1.get(i)+" ");
        }
        
        System.out.println();
        System.out.println();
        // tRAVERSING aRRAYlIST uSING iTERATOR
        System.out.println("Ques Comes Print The aRYY usING iTERATOR mETHOD");
        Iterator itr =al1.iterator();
         while(itr.hasNext()) {
        	 System.out.println(itr.next());
         }
         
         
         System.out.println(" Is ArrayList Is empty"+ al1.isEmpty());
         // Remove At Specific Index
         al1.remove(3);
         System.out.println(al1);
         
         //remove(Object a)//remkove occurance of list
         al1.remove("23");// passing Object To remove that Object
         System.out.println(al1);
         //al1.clear();
         
         System.out.println(al1);
         System.out.println("Search:"+al1.contains(21));
         
         
         
         
         

	}

}

