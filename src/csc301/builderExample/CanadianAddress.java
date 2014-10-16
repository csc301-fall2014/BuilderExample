package csc301.builderExample;

public interface CanadianAddress {

	// Question: Why are we using String for apartment and street number? 
	public String getApartmentNumber();
	public String getStreetNumber();
	public String getStreetName();
	public String getStreetType();
	public String getCity();
	public String getProvince();
	public String getPostalCode();
	
}
