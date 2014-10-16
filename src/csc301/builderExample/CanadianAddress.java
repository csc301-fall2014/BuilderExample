package csc301.builderExample;


public class CanadianAddress {

	
	private String apartmentNumber;
	private String streetNumber;
	private String streetName;
	private String streetType;
	private String city;
	private String province;
	private String postalCode;
	
	
	public CanadianAddress(String fullAddress) {
		parseAddress(fullAddress);
	}
	
	
	
	private void parseAddress(String fullAddress) {
		// Parse the address somehow, and populate the various
		// instance variables ...
	}



	
	public String getApartmentNumber() {
		return apartmentNumber;
	}
	
	public String getStreetNumber() {
		return streetNumber;
	}
	
	public String getStreetName() {
		return streetName;
	}
	
	public String getStreetType() {
		return streetType;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getProvince() {
		return province;
	}
	
	public String getPostalCode() {
		return postalCode;
	}

}
