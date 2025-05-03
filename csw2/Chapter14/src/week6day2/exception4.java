package week6day2;

class MyException extends Exception{
	public MyException(String s) {
		super(s);
		System.out.println("this is MyException");
		
		// class name   be written then it shows Underline
//		 different clas  give different result
	}
}

public class exception4  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
    	  throw  new MyException("My Own Exception");
      }
      
      catch(MyException e) {
    	  System.out.println(e.getMessage());
    	  e.printStackTrace();
//    	  e.printStackTrace();
      }
      
      finally {
    	  System.out.println("rest part");
      }
	}

}
