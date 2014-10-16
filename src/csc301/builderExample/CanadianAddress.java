package csc301.builderExample;


public class CanadianAddress {
	
	
	public static class Builder {

		private String apartmentNumber;
		private String streetNumber;
		private String streetName;
		private String streetType;
		private String city;
		private String province;
		private String postalCode;
		
		
		public Builder apartmentNumber(String apartmentNumber){
			this.apartmentNumber = apartmentNumber;
			return this;
		}
		
		public Builder streetNumber(String streetNumber){
			this.streetNumber = streetNumber;
			return this;
		}
		
		public Builder streetName(String streetName){
			this.streetName = streetName;
			return this;
		}
		
		public Builder streetType(String streetType){
			this.streetType = streetType;
			return this;
		}
		
		public Builder city(String city){
			this.city = city;
			return this;
		}
		
		public Builder province(String province){
			this.province = province;
			return this;
		}
		
		public Builder postalCode(String postalCode){
			this.postalCode = postalCode;
			return this;
		}
		
		
		public CanadianAddress build(){
			// We can validate the arguments, before creating a CanadianAddress instance. 
			return new CanadianAddress(this);
		}
		
	}
	
	
	

	
	private String apartmentNumber;
	private String streetNumber;
	private String streetName;
	private String streetType;
	private String city;
	private String province;
	private String postalCode;
	
	
	
	private CanadianAddress(Builder builder) {
		this.apartmentNumber = builder.apartmentNumber;
		this.streetNumber = builder.streetNumber;
		this.streetName = builder.streetName;
		this.streetType = builder.streetType;
		this.city = builder.city;
		this.province = builder.province;
		this.postalCode = builder.postalCode;
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
