package ship;
import java.time.*;

//Dena Bensinger
//Program 10: Ship

public class Person {
	
	// Initialize variables.
	private String firstName;
	private String lastName;
	private Gender gender;
	private LocalDate birthdate;
	private Address address;
	
	// Constructor. Accepts birthdate as a String and converts it to local date. 
	public Person(String f, String l, Gender g, Address add, String birthdate) {
		this(f, l, g, add, LocalDate.parse(birthdate));
	}
	// Constructor that receives all of the address fields separately, and creates an Address object. 
	public Person(String f, String l, Gender g, String s, String c, String state, String zip, String birthdate) {
		this(f, l, g, new Address (s,c, state, zip), LocalDate.parse(birthdate));
	}
	/**
	 * Constructor
	 * @param f String value that holds the person's first name.
	 * @param l String value that holds the person's last name.
	 * @param g Gender - either M for male or F for female.
	 * @param add Address object that holds the person's address information.
	 * @param birthdate LocalDate object that holds the person's birthday. 
	 */
	public Person(String f, String l, Gender g, Address add, LocalDate birthdate) {
		this.firstName=f;
		this.lastName=l;
		this.gender=g;
		this.address=add;
		this.birthdate=birthdate;
	}
	// Copy constructor.
	public Person(Person p) {
		this(p.firstName, p.lastName,p.gender, p.address, p.birthdate);
		
	}
	// The getFirstName method returns a String. 
	public String getFirstName() {
		return firstName;
	}
	// The getLastName method returns a String. 
	public String getLastName() {
		return lastName;
	}
	// The getGender method returns a Gender value. 
	public Gender getGender() {
		return gender;
	}
	// The getBirthDate method returns a LocalDate. 
	public LocalDate getBirthDate() {
		return birthdate;
	}
	// The getAddress method returns an Address. 
	public Address getAddress(){
		return address;
	}
	// The setter allows the user to set the last name.
	public void setLastName(String last) {
		this.lastName = last;
	}
	// The setter allows the user to set the address.
	public void setAddress(Address addr) {
		this.address= addr;
	}
	
	// The toString method returns a String of information about the person.
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder("\n\nFirst Name: "+ firstName);
		str.append("\nLast Name: "+lastName);
		str.append("\nGender: "+gender);
		str.append("\nBirthdate: "+birthdate);
		str.append("\n\nAddress Information: "+ address);
		return str.toString();
		}
	// The equals methods compares the birthday, first name, and last name to see if there are 2 of the same people. 
	@Override
	public boolean equals(Object o){
		if (this==o)
			return true;
		if(o== null)
			return false;
		if (getClass() != o.getClass())
			return false;
		Person other = (Person) o;
		if (birthdate==null) {
			if (other.birthdate != null)
				return false;}
		else if (!birthdate.equals(other.birthdate))
			return false;
			if (firstName==null) {
				if (other.firstName != null)
					return false;}
			else if (!firstName.equals(other.firstName))
				return false;
			if (lastName == null) {
				if (other.lastName != null)
					return false;}
			else if (!lastName.equals(other.lastName))
				return false;
		return true;
			}
		
	}
