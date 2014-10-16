package csc301.builderExample;


public class CanadianAddressImpl implements CanadianAddress {

	
	private String apartmentNumber;
	private String streetNumber;
	private String streetName;
	private String streetType;
	private String city;
	private String province;
	private String postalCode;
	
	
	
	public CanadianAddressImpl(String apartmentNumber, String streetNumber,
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
