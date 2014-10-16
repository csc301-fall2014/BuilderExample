package csc301.builderExample;


public class CanadianAddress {

	
	private String apartmentNumber;
	private String streetNumber;
	private String streetName;
	private String streetType;
	private String city;
	private String province;
	private String postalCode;
	
	
	
	public CanadianAddress(String apartmentNumber, String streetNumber,
			String streetName, String streetType, String city, String province,
			String postalCode) {
		this.apartmentNumber = apartmentNumber;
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.streetType = streetType;
		this.city = city;
		this.province = province;
		this.postalCode = postalCode;
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
