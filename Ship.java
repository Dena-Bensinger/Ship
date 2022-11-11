package ship;

// Dena Bensinger
// Program 10: Ship
public class Ship {
	// Initialize variables.
	String name;
	private int year;
	/**
	 * Constructor 
	 * @param name String value that holds the name of the ship.
	 * @param year Int value that holds the year the ship was built. 
	 */
	public Ship(String name, int year){
		this.name=name;
		// Input validation: if the year entered is less than 0, an exception is thrown.
		if (year<0) 
		throw new IllegalArgumentException
		();
		this.year=year;
		}
	// Constructor
	public Ship(String name) {
		this(name, 0 );
	}
	// Constructor
	public Ship(int year) {
		this("Unknown", year);
	}
	// Constructor
	public Ship() {
		this("Unknown", 0);
	}
	//Copy Constructor
	public Ship(Ship ship2) {
		this(ship2.name, ship2.year);
	}
	// The setName method allows the user to change the name.
	public void setName(String name) {
		this.name = name;
	}
	// The setYear method allows the user to change the year. 
	public void setYear(int year) {
		// Input validation: If the year entered is less than 0, throw an exception. 
		if (year<0)
			throw new IllegalArgumentException();
		this.year=year;
	}
	// The getName method returns the name. 
	public String getName() {
		return name;
	}
	// The getYear method returns the year. 
	public int getYear() {
		return year;
	}
	
	// The toString method returns a String of information about the ship class. 
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder("Ship Details: \n");
		str.append("\nShip Name: "+name);
		str.append("\nYear Built: "+year);
		return str.toString();
	}

	
}
