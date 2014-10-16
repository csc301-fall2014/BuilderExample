package csc301.builderExample;


/**
 * Starter code, missing most of the implementation.
 */
public class CanadianAddressImpl implements CanadianAddress {

	
	private String apartmentNumber;
	private String streetNumber;
	private String streetName;
	private String streetType;
	private String city;
	private String province;
	private String postalCode;
	
	
	public CanadianAddressImpl(String fullAddress) {
		parseAddress(fullAddress);
	}
	
	
	
	private void parseAddress(String fullAddress) {
		// Parse the address somehow, and populate the various
		// instance variables ...
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
