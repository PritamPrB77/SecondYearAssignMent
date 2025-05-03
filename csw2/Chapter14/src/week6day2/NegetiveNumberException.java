//package week6day2;
//
//
// public  class NegetiveNumberException extends Exception{
//	private int num;
//	NegetiveNumberException(int num){
//	this.num=num;
//		
//	}
//	@Override
//	public String toString() {
//		return "NegetiveNumberException [num=" + num + "]";
//	}
//
//
///*
// * User Defined exceptions are checked exceptions because they are extended with Exception class which is super class for all the
// *  exceptions occured,where as unchecked exceptions are extended with run time Exceptions
//
//A user-defined exception can be either a checked or unchecked exception depending on whether it extends the Exception class (checked) or the RuntimeException class (unchecked) in the programming language; essentially, you decide whether to force the caller to handle it at compile time by making it checked or not by choosing the parent class to extend. 
//Key points about user-defined exceptions and checked/unchecked status:
//Checked exceptions:
//If you want to ensure that the caller of a method handles a potential error condition, you should create a user-defined exception that extends the Exception class, making it a checked exception.
//Unchecked exceptions:
//If you want to indicate a programming error that the caller might not be able to recover from, you should create a user-defined exception that extends RuntimeException, making it an unchecked exception. 
// */
//
//
//	public static  void check( int a) throws  NegetiveNumberException {
//		
//		if(a<0) {
//			throw new NegetiveNumberException("Number cant be -v2");
//			
//		}
//		System.out.println("returniung form function");
//	}
//
//	public static void main(String[] args)  {
//		// TODO Auto-generated method stub
//		
//		try {
//			check(-45);
//		}
//		catch(NegetiveNumberException e) {
//			System.out.println("Exception caught");
//			System.out.println(e.getMessage());
//		}
//
//	}
//
//}
