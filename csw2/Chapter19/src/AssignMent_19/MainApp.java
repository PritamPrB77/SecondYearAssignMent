package AssignMent_19;

class  Nsum extends Thread{

	public void Nsum( ){
	    synchronized(this){
		int sum=0;
		for(int i=0;i<=100;i++) sum+=i;
		System.out.println("Sum Of n Natural Number"+sum);
	  }
		
	}
	@Override public void run () {
		  Nsum();
	}
	
}

class   MPtable extends Thread{
  int num;
	public void MPtable( ){
	    synchronized(this){
	
		  for( int i=1;i<=10;i++)  System.out.println( num+" *"+ i+" ="+(num*i));
	  }
		
	}
	@Override public void run () {
		MPtable();
	}
	
}

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// we can dome it using lamda function
//		Nsum s1= new Nsum();
//		s1.start();
//		MPtable s2=new MPtable();
//		s2.num=5;
//		s2.start();
		
		Runnable run1=()-> System.out.println((100*(100+1))/2);
		Thread nn=new Thread(run1);
		Runnable run2=()->  { 
			for( int i=1;i<=10;i++)  
				System.out.println(5+" *"+ i+" ="+(5*i));
		};
		
		
		Thread nn2=new Thread(run2);
		nn.start();
		nn2.start();
		

	}

}
