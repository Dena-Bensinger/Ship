package ship;
// Dena Bensinger
// Program 10: Ship

public class CargoShip extends Ship{
	
	// Initialize variables.
	private int cargoCap;
	
	/**
	 * Constructor 
	 * @param name String value that holds the name of the ship. 
	 * @param year int value that holds the year the ship was built. 
	 * @param cargoCap int value that holds the cargo capacity.
	 */
	public CargoShip(String name, int year, int cargoCap) {
		super(name, year);
		
		// Input validation: If the number entered is less than 0, throw an exception. 
		if (cargoCap <0)
			throw new IllegalArgumentException("The capacity cannot be negative.");
		this.cargoCap= cargoCap;
	}
	// Constructor
	public CargoShip(String name) {
		this(name,0,0);
	}
	// Constructor
	public CargoShip(int cargoCap) {
		this("Unkown", 0, cargoCap);
	}
	// Copy constructor
	public CargoShip(CargoShip cargoShip2) {
		this(cargoShip2.getName(), cargoShip2.getYear(),
				cargoShip2.getCargoCap());
	}
	
	// The setCargoCap method allows the user to set the capacity. 
	public void setCargoCap(int cargoCap) {
		// Input validation: The cargoCap will only be set if the value is not negative. 
		if (cargoCap >=0) {
		this.cargoCap = cargoCap;}
		else throw new IllegalArgumentException();
	}
	// The getCargoCap method returns the cargo capacity. 
	public int getCargoCap() {
		return cargoCap;
	}
	
	// The toString method returns a String of information about the cargo ship class. 
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder("\nShip Information: \n");
		str.append("\nName: "+ getName());
		str.append("\nCargo capacity: "+ cargoCap);
		return str.toString();
	}
	
}
