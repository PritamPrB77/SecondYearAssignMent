package Assignment3;


class CustomCheckedException extends Exception { 
public CustomCheckedException(String message) { 
super(message); 
} 
} 

public class exp8 {

	
	    public static void main(String[] args) { 
	        try { 
	            checkValue(10); 
	        } catch (CustomCheckedException e) { 
	            System.out.println("Caught CustomCheckedException: " + 
	       e.getMessage()); 
	        } 
	    } 
	 
	    public static void checkValue(int value) throws CustomCheckedException,ArithmeticException { 
	        if (value <0) { 
	            throw new CustomCheckedException("NegeTive NUmber Error"); 
	        } 
	        System.out.println(value);
	    }


}
