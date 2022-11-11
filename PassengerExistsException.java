package ship;

// Dena Bensinger
// Program 10: Ship

//Create an exception
public class PassengerExistsException extends RuntimeException {
	
	// Constructor calls the parent constructor (of RuntimeException).
	public PassengerExistsException() {
		super("The passenger is already on the list and cannot be added again.");
	}
	// Constructor calls the parent constructor (of RuntimeException) and passes it a string method.
	public PassengerExistsException(String message) {
		super(message);
	}

}
