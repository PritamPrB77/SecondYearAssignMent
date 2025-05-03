 package week6day2;

public class exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          try {
        	 
//        	  int num=Integer.parseInt("ABC");
//            System.out.println("Num is"+num);
        	  
        	  throw  new NumberFormatException("Explicitely Number Format Exception");
          }
          catch( NumberFormatException obj) {
        	  System.out.println("caught Exception");
        	  System.out.println(obj.getMessage());
          }
          finally {
        	  System.out.println("mere tak pahanch geya tu");
          }
	}

}
