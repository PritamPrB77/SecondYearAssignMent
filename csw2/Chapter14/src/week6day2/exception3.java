package week6day2;

import java.io.FileNotFoundException;

public class exception3 {
    public static void Demo() throws FileNotFoundException {
    	
//    	throws clause is for chrcked Exception
    	throw new FileNotFoundException("Explicit throw");
    }
         public static void Demo(int x)  {
    	
//    no need of throw clause for  Unchecked arithmatic exceptiomn
    	throw new ArithmeticException("Exception arithmatic");
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            try {
            	Demo();
            }
            catch(FileNotFoundException e) {
            	System.out.println("caught Exception"+"\n"+e.getMessage());
            }
	}

}
