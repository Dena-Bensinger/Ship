package ship;
// Dena Bensinger
// Program 10: Ship

public class Address {
	
	// Initialize variables. 
	private String street;
	private String city;
	private String state;
	private String zipcode;
	
	/**
	 * Constructor
	 * @param street String value that holds the street name. 
	 * @param city String value that holds the name of the city.
	 * @param state String value that holds the state.
	 * @param zip String value that holds the ZIP. 
	 */
	public Address(String street, String city, String state, String zip) {
		this.street = street;
		this.city=city;
		this.state=state;
		this.zipcode=zip;
	}
	// The getStreet method returns the name of the street. 
	public String getStreet() {
		return street;
	}
	// The getCity method returns the name of the city. 
	public String getCity() {
		return city;
	}
	
	// The getState method returns the name of the state. 
	public String getState() {
		return state;
		
	}// The getZip method returns the ZIP. 
	public String getZip() {
		return zipcode;
	}
	
	// The toString method returns a String of information about the address.
	@Override
	public String toString() {
		StringBuilder str= new StringBuilder("\nStreet "+street);
		str.append("\nCity: "+ city);
		str.append("\nState: "+state);
		str.append("\nZipcode: "+zipcode);
		
		return str.toString();
	}
}
