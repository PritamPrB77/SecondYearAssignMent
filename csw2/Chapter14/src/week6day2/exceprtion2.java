package week6day2;

public class exceprtion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            RuntimeException arr[]= {
            		
            		//if we remove   Runtime from  RuntimeException --> it shows error because  Exception is base class of other
//            		  it ensure both chckend and unchecked unless at run time it throw at compile time so tu get rid from
//            		 that we use  RuntimeException instead of Exception
            		
            		new ArithmeticException("Arithmatic"),
            		new NumberFormatException("Number Format"),
            		new NullPointerException("Null Pointer Exception")
            		
            };
            
            for(int i=0;i<=2;i++) {
            	try {
            		throw arr[i];
            	}
            	catch( ArithmeticException | NumberFormatException | NullPointerException  e) {
            		System.out.println("caught Exception");
            		System.out.println(e.getMessage());
            	}
            }
	}

}
