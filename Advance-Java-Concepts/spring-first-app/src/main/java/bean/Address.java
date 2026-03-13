package bean;

public class Address {
	private String city;
	private String country;
	private int zip;

	public Address() {

	}

	public Address(String city, String country, int zip) {
		super();
		this.city = city;
		this.country = country;
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}
}