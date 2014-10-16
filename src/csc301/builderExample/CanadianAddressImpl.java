package csc301.builderExample;


public class CanadianAddressImpl implements CanadianAddress {

	
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

	@Override
	public String getApartmentNumber() {
		return apartmentNumber;
	}

	@Override
	public String getStreetNumber() {
		return streetNumber;
	}

	@Override
	public String getStreetName() {
		return streetName;
	}

	@Override
	public String getStreetType() {
		return streetType;
	}

	@Override
	public String getCity() {
		return city;
	}

	@Override
	public String getProvince() {
		return province;
	}

	@Override
	public String getPostalCode() {
		return postalCode;
	}

}
