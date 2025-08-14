package week13day1;

public class mainAppp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SharedNumber numPrintter =new SharedNumber();
		 OddThread o=new OddThread(numPrintter);
		EvenThread e=new EvenThread(numPrintter);
	
		 o.start();
		 e.start(); 
	}

}
