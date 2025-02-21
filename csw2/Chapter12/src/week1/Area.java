package week1;

public class Area {
		//24-1-2025
	
		//pritected due to single inheritance
	    protected int len;
	    protected int wid;
	    
		public int getLen() {
			return len;
		}
		public void setLen(int len) {
			this.len = len;
		}
		public int getWid() {
			return wid;
		}
		public void setWid(int wid) {
			this.wid = wid;
		}
		public void showArea() {
			 System.out.println("Area = "+ (len*wid));
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub

		}

	}



 