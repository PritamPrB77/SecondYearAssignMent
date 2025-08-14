package in.soa.beans;

public class Airtel implements Sim {
	@Override
	public void calling()
	{
		System.out.println("calling using airtel");
		
	}
	@Override
	public void data()
	{
		System.out.println("data using airtel");
	}
	

}
