package week2Day3;

 class laptop {
	private int price;
	private String model;
	
	
 public int getPrice() {
		return price;
	}

	public void setPrice(int price) {this.price = price;}

	public String getModel() {return model;}

	public void setModel(String model) {this.model = model;}
@Override
   public String toString() {
	   return model+" "+price;
   }
 
}
 public class laptopMain{
	public static void main(String [] args) {
		 
		laptop obj=new laptop();
		laptop obj1=new laptop();
		laptop obj2=new laptop();
		obj.setModel("BMw");
		obj.setPrice(50000000);
		System.out.println(obj.getModel());
		
		System.out.println(obj);
		System.out.println(obj.toString());
		System.out.println(obj1);
		System.out.println(obj2);
		
	 }
}
 
 