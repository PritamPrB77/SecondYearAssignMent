package week6day2;



public class qn1 extends Exception{
	private int x;
	public qn1(int x){
		this.x=x;
	}
	
	
	public String toString() {
		return"Custom exception thrown num="+x;
	}
	
	public static void chech(int x) throws qn1 {
		System.out.println("check x="+x);
		if(x<0)
			throw new qn1 (x);
		System.out.println("returning from the function");
	}
	
	
	
	
	
	public static void main(String[] args) {
		try {
			chech(10);
			 chech(-12);
		}
		catch(qn1 e) {
			System.out.println("Excepton found");
			System.out.println(e);
			
		}
		finally {
			System.out.println("rest part..");
		}

	}

}

