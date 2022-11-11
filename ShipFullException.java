package ship;

// Dena Bensinger 
// Program 10: Ship 

// Create an exception.
public class ShipFullException extends RuntimeException {
	
	// The constructor calls the parent constructor and passes it a message.
	public ShipFullException() {
		super("The ship is full. No more passengers can be added.");
	}
	// The constructor calls the parent constructor and passes it a String value. 
	public ShipFullException(String message) {
		super(message);
	}
	
}
