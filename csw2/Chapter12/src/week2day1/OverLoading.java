package week2day1;

public class OverLoading {
	
	//public void show(int x) {System.out.println(" int show"+"\t"+x);}
	public void show(double x){System.out.println(" double show"+"\t"+x);}
	public void show(float x){System.out.println(" float show"+"\t"+x);}
	public void show(long x){System.out.println(" long show"+"\t"+x);}
	public void show(String x){System.out.println(" String show"+"\t"+x);}
	public void show(int x,float y){System.out.println("  show x,y"+"\t"+"x= "+x+" y="+y);}
	
	public static void main(String[] args) {
		OverLoading  ol=new OverLoading ();
		ol.show("String");
		ol.show(34);
		ol.show(3.5);
		ol.show(3.4f);
		ol.show('a');//type Promotion
		ol.show(23,6.7f);
	}
}
