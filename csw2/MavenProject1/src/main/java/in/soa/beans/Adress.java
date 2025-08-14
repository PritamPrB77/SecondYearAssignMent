package in.soa.beans;

public class Adress {
	private int houseNo;
	private String city;
	private int pin;

	public int getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Adress [houseNo=" + houseNo + ", city=" + city + ", pin=" + pin + "]";
	}

}
