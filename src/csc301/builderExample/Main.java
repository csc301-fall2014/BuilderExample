package csc301.builderExample;

public class Main {

	public static void main(String[] args) {
		
		CanadianAddress a = new CanadianAddressBuilder().apartmentNumber("1A")
				.streetNumber("123-2").streetName("Main")
				.streetType("Ave").city("Toronto").province("ON")
				.postalCode("M2K 7R1").build();
		
		// Do something with our address instance ...
		System.out.println(a);
		
	}

}
