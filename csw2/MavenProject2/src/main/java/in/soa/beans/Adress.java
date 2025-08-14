package in.soa.beans;

public class Adress {
	private int houseNo;
	private String city;
	private int pin;


	public Adress(int houseNo, String city, int pin) {
		super();
		this.houseNo = houseNo;
		this.city = city;
		this.pin = pin;
	}


	@Override
	public String toString() {
		return "Adress [houseNo=" + houseNo + ", city=" + city + ", pin=" + pin + "]";
	}

}
