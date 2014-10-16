package csc301.builderExample;


public class CanadianAddress {

	
	private String apartmentNumber;
	private String streetNumber;
	private String streetName;
	private String streetType;
	private String city;
	private String province;
	private String postalCode;
	
	
	
	public void setApartmentNumber(String apartmentNumber) {
		this.apartmentNumber = apartmentNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public void setStreetType(String streetType) {
		this.streetType = streetType;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public void setPostalCode(String postalCode) {
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
