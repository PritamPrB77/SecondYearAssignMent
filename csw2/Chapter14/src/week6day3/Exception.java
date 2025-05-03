package week6day3;

public class Exception {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
//		String arr[]= {"1","2","3","ankit" };
		//String arr[]= null;
		String arr[]= {"1", "2", "3","ankit" };
		try {
			 int brr[]=convertToint(arr);
				for(int num:brr) {
					System.out.println("number is"+num);
					
				}
		}
		catch(NumberFormatException | NullPointerException e ) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static int[] convertToint(String[]s) {
		if(s==null) 
			throw new NullPointerException("Array is null");
		int i=0;
		int arr[]=new int [s.length];
		for(String j:s) {
			 
			try {
				arr[i++]=Integer.parseInt(j);
			}
			catch(NumberFormatException e) {
				System.out.println("exception caught");
				//throw new NumberFormatException("String cant be converted");
				System.out.println(e.getMessage());
				break;
		}
			}
		
		return arr;
			
	}

}
