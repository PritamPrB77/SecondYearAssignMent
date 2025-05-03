package Assignment_Chap_15;

public class Studentt {
	private String name; private String adress; private int rollno;
	Studentt(String name,String adress,int rollno){
		this.adress=adress;
		this.name=name;
		this.rollno=rollno;
	}
	public void setRollNo(int rollno) {
		this.rollno=rollno;
	}
	public int getRollNo() {
		return this.rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	@Override
	protected void finalize() throws Throwable{
		System.out.println("Student with rn"+ this.rollno+"  successfulyy collected");
	}
	
	public static  void printMemoryUSe() {
		long totalmemeory=Runtime.getRuntime().totalMemory();
		long freememory=Runtime.getRuntime().freeMemory();
		long usedmemory=totalmemeory-freememory;
		System.out.println("Heapsize "+ totalmemeory / (1024*1024)+" Mb");
		System.out.println("FreeSpace "+freememory/ (1024*1024)+" Mb");
		System.out.println("usedMemory"+usedmemory/ (1024*1024)+" Mb");
	
	}
	
	public static void main(String[] args) {
		Studentt s1=new Studentt("x","y",12);
		
		Studentt s2=new Studentt("x","y",13);
		Studentt s3=new Studentt("x","y",14);
		Studentt s4=new Studentt("x","y",15);
		
		Studentt s5=new Studentt("x","y",16);
		
		
		s1=s2;
		s4=s5;
		s3=null;
		printMemoryUSe();
		System.gc();
		

		
		
	}

}
