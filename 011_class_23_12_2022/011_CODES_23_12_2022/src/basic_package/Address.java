package basic_package;

public class Address {
	String city, state, country;
	int pin;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String city, String state, String country, int pin) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
		this.pin = pin;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getCountry() {
		return country;
	}
	public int getPin() {
		return pin;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}

}
