package ship;
// Dena Bensinger
// Program 10: Ship

public class Passenger extends Person {
	
	// Initialize variables.
	private String passportID;
	private int luggagePieces;
	
	/**
	 * Constructor
	 * @param f String first name.
	 * @param l String last name.
	 * @param g Gender gender.
	 * @param addr Address address.
	 * @param birthdate String birth date.
	 * @param passportID String passport ID.
	 * @param luggage int luggage. 
	 */
	public Passenger(String f, String l, Gender g, Address addr, String birthdate, String passportID, int luggage) {
		// Call parent constructor and pass it the necessary fields. 
		super(f, l, g, addr, birthdate);
		this.passportID= passportID;
		
		// Input validation: If the number is less than 0, throw an exception. 
		if (luggage <0)
			throw new IllegalArgumentException();
		this.luggagePieces= luggage;
		
	}
	// Copy constructor
	public Passenger(Passenger p) {
		super(p);
		this.passportID= p.passportID;
		this.luggagePieces= p.luggagePieces;
	}
	
	// The toString() method  returns a String of information about the passenger. 
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder(super.toString());
		str.append("\nPassport ID: "+  passportID);
		str.append("\nAmount of Luggage: "+luggagePieces+"\n");
		return str.toString();
	}
	
	// The equals method compares the passport IDs. 
	@Override
	public boolean equals(Object o) {
		if (this==o)
			return true;
		if (o==null)
			return false;
		if (getClass() != o.getClass())
			return false;
		Passenger other = (Passenger) o;
		if (passportID == null) {
			if (other.passportID != null)
				return false;}
		else if (!passportID.equals(other.passportID))
			return false;
		return true;
		
		
		}
	}


