package csc301.builderExample;

public class CanadianAddressBuilder {

	private String apartmentNumber;
	private String streetNumber;
	private String streetName;
	private String streetType;
	private String city;
	private String province;
	private String postalCode;
	
	
	
	public CanadianAddressBuilder apartmentNumber(String apartmentNumber){
		this.apartmentNumber = apartmentNumber;
		return this;
	}
	
	public CanadianAddressBuilder streetNumber(String streetNumber){
		this.streetNumber = streetNumber;
		return this;
	}
	
	public CanadianAddressBuilder streetName(String streetName){
		this.streetName = streetName;
		return this;
	}
	
	public CanadianAddressBuilder streetType(String streetType){
		this.streetType = streetType;
		return this;
	}
	
	public CanadianAddressBuilder city(String city){
		this.city = city;
		return this;
	}
	
	public CanadianAddressBuilder province(String province){
		this.province = province;
		return this;
	}
	
	public CanadianAddressBuilder postalCode(String postalCode){
		this.postalCode = postalCode;
		return this;
	}
	
	
	public CanadianAddress build(){
		// At this point, we can validate the arguments
		CanadianAddress a = new CanadianAddress();
		a.setApartmentNumber(apartmentNumber);
		a.setStreetNumber(streetNumber);
		a.setStreetName(streetName);
		a.setStreetType(streetType);
		a.setCity(city);
		a.setProvince(province);
		a.setPostalCode(postalCode);
		return a;
	}
	
}
