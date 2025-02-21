package week1;



//24-1-2025
public class vol extends Area {  
		private int height;
			
	    public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		 void showvol() {
			 System.out.println("Volume = "+ (len*wid*height));
		 }
	public static void main(String[] args) {
		vol v = new vol();
		v.setLen(3);
		v.setWid(4);
		v.setHeight(5);
		v.showArea();
		v.showvol();

	}

}
