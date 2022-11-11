package ship;
import java.util.*;

//Dena Bensinger 
// Program 10: Ship 

public class CruiseShip extends Ship{
	
	// Initialize variables and array list. 
	private int maxPeople;
    private ArrayList<Passenger>passengers;
    
    /**
     * Constructor
     * @param name String value that holds the name of the ship.
     * @param year Int value that holds the year the ship was built. 
     * @param maxPeople Int value that holds the maximum people allowed on the ship.
     * @param Passengers An ArrayList of objects holding the passengers on the ship. 
     */
    public CruiseShip(String name, int year, int maxPeople, ArrayList<Passenger>passengers ) {
    	// Call the parent constructor. 
    	super(name, year);
    	// Input validation: If the maximum amount of people is less than zero, throw an exception. 
    	if (maxPeople<0)
    	throw new IllegalArgumentException("Invalid input: The value must be a non-negative number.");
    	this.maxPeople= maxPeople;
    	this.passengers=passengers;
    	}
    // Constructor
    public CruiseShip(String name, int year, int maxPeople) {
    	this(name, year, maxPeople, new ArrayList<Passenger>());
  
    }
    //Constructor
    public CruiseShip(String name) {
    	this(name, 0,0, new ArrayList<Passenger>());
    }
    //Constructor
    public CruiseShip(String name, int year) {
    	this(name, year, 0, new ArrayList<Passenger>());
    }
    //Constructor
    public CruiseShip(int maxPeople, ArrayList<Passenger>passengers) {
    	this("Unknown", 0, maxPeople, new ArrayList<Passenger>());
    }
    // Copy constructor
    public CruiseShip(CruiseShip cruiseShip2) {
    	this(cruiseShip2.getName(), cruiseShip2.getYear(), cruiseShip2.getMaxPeople(), cruiseShip2.passengers);
    }
    // The setMaxPeople method allows the user to change the maximum amount of people. 
    public void setMaxPeople(int maxPeople) {
    	// Input validation: if max people is less than 0, throw an exception. 
    	if (maxPeople>= 0) {
    	this.maxPeople=maxPeople;}
    	else {
    		throw new IllegalArgumentException();}
    }
    // The setPassengers method allows people to change the passenger.
    public void setPassengers(ArrayList<Passenger>passengers) {
    	this.passengers=passengers;
    }
    // The getMaxPeople method returns the maximum amount of people allowed on the ship.
    public int getMaxPeople() {
    	return maxPeople;
    }
    // The getPassengers method returns the passengers. 
    public ArrayList<Passenger> getPassengers(){
    	return new ArrayList<Passenger>(passengers);
    }
    // The addPassengers method adds a passenger to the passenger array list. 
    public void addPassengers(Passenger p) {
    	
    	// Input validation: If the amount of passengers in the list is greater than or equal to the maxPeople throw an exception.
    	if (passengers.size() >= maxPeople) {
    		throw new ShipFullException();
    	}
    	
    	if (!passengers.contains(p)) {
    		passengers.add(p);
    	}
    	// Input validation: If the passenger is already in the array list of passengers throw an exception. 
    	else { throw new PassengerExistsException();}	
   }
    
    // The toString method returns a String of information about the cruise ship class. 
    @Override
    public String toString() {
    	StringBuilder str= new StringBuilder("\n"+super.toString());
    	str.append("\nMaximum amount of passengers: "+maxPeople);
    	str.append("\n\nPassengers: "+ passengers+"\n" );
    	return str.toString();
    }
 
    }

