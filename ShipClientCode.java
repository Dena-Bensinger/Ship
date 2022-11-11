package ship;
import java.util.*;

// Dena Bensinger 
// Program 10: Ship

public class ShipClientCode {
	public static void main(String[] args) {
		// Create a scanner object.
		Scanner keyboard = new Scanner(System.in);
		// Initialize array lists. 
		ArrayList<CargoShip>cargoList= new ArrayList<CargoShip>();
		ArrayList<CruiseShip>cruiseList= new ArrayList<CruiseShip>();
		
		// Initialize again to "yes"
		String again = "yes";
		
		// Loop will keep looping as long as again = yes. 
		while(again.equalsIgnoreCase("yes")){
			
			// Call the menu method and return the value to option. 
			int option = menu();
			
			// Different methods will be called, depending on the number the user entered. 
			if (option ==1) {
				// call the addCargo method and pass it the cargo array list. 
				addCargo(cargoList);}
			else if (option ==2) {
				// call the addCruise method and pass it the cruise array list. 
				addCruise(cruiseList);}
			else if(option ==3) {
				// call the displayCargo method and pass it the cargo array list. 
				displayCargo(cargoList);}
			else {
				// call the displayCruise method and pass it the cruise array list. 
				displayCruise(cruiseList);}
			
		// prompt the user to decided if they want to view the menu again or not. 
		System.out.println("Would you like to view the menu again? (Enter yes or no) ");
		again = keyboard.nextLine();}
		}
	
		// menu method displays the different options to the user. 
		public static int menu(){
		Scanner keyboard= new Scanner(System.in);
		System.out.println("1. Add a cargo ship to the list.");
		System.out.println("2. Add a cruise ship to the list. ");
		System.out.println("3. Display the list of cargo ships. ");
		System.out.println("4. Display the list of cruise ships. ");
		
		System.out.println("\nChoose an option: ");
		int choice= keyboard.nextInt();
		// input validation. if the user doesn't choose 1, 2, 3, or 4, an exception is thrown. 
		if (choice <1 || choice >4)
			throw new IllegalArgumentException("Enter a number from 1-4: ");
		// choice is returned and assigned to option. 
		return choice;}
		
		// The addCargo method receives an array list, and adds a cargo ship to the list. 
		public static void addCargo(ArrayList<CargoShip>cargoList) {
			Scanner keyboard = new Scanner(System.in);
			String again= "yes";
			// As long as again ="yes", the user can add another cargo ship to the list. 
			while(again.equalsIgnoreCase("yes")) {
				System.out.println("Enter the name of the cargo ship: ");
				String name = keyboard.nextLine();
				System.out.println("Enter the year the ship was built: ");
				int year = keyboard.nextInt();
				// Input validation.
				if (year < 1900)
					throw new IllegalArgumentException("Invalid input. The earliest year the ship could have been built in is 1900.");
				System.out.println("Enter the cargo capacity: ");
				int capacity= keyboard.nextInt();
				// Input validation. 
				if (capacity <0) {
					throw new IllegalArgumentException();}
				// If the list doesn't contain the cargo ship, it is added to the list. 
				if (!cargoList.contains(new CargoShip(name, year, capacity))) {
				cargoList.add(new CargoShip(name, year, capacity));
				} 
				// If it does, it asks the user if they want to add a duplicate or not. 
				else {
					System.out.println("That ship already exists. Would you like to add a duplicate? (Enter yes or no)");
					String duplicate = keyboard.nextLine();
					if (duplicate.equalsIgnoreCase("yes"))
					cargoList.add(new CargoShip(name, year, capacity));}
				keyboard.nextLine();
				
				// Prompt the user if they would like to add another ship to the list or not.
				System.out.println("Would you like to add another cargo ship to the list? Enter yes or no: ");
				again= keyboard.nextLine();	
				}
				}
		
		// The addCruise method receives an array list and adds cruise ships to it. 
		public static void addCruise(ArrayList<CruiseShip>cruiseList) {
			Scanner keyboard = new Scanner(System.in);
			String again = "yes";
			// While again = yes, the user can add a cruise ship to the list. 
			while (again.equalsIgnoreCase("yes")) {
				System.out.println("Enter the name of the cruise ship: ");
				String name = keyboard.nextLine();
				System.out.println("Enter the year the ship was built: ");
				int year = keyboard.nextInt();
				System.out.println("Enter the maximum number of passengers: ");
				int max= keyboard.nextInt();
				// Input validation.
				if (max<0)
					throw new IllegalArgumentException();
				keyboard.nextLine();
				// If the cruise ship list doesn't contain the cruise ship entered, it is added to the list. 
				if (!cruiseList.contains(new CruiseShip(name, year, max))) {
					cruiseList.add(new CruiseShip(name, year, max));}
					// If it already exists, the user is prompted whether they would like to add a duplicate or not.
					 else {
						System.out.println("That ship already exists. Would you like to add a duplicate? (Enter yes or no)");
						String duplicate = keyboard.nextLine();
						if (duplicate.equalsIgnoreCase("yes"))
						cruiseList.add(new CruiseShip(name, year, max));}
				// The user is prompted if they would like to add a passenger to the ship. 
				System.out.println("Would you like to add a passenger to cruise ship \""+ name+"\" ? (Enter yes or no) ");
				String addp = keyboard.nextLine();
				while(addp.equalsIgnoreCase("yes")) {
					// call the add method and pass it the cruise array list. 
					add(cruiseList);
					System.out.println("\nWould you like to add another passenger to the ship? (Enter yes or no) ");
					addp=keyboard.nextLine();}
				System.out.println("\nWould you like to add another cruise ship to the list? (Enter yes or no) ");
				again = keyboard.nextLine();
					
				}
		}
		// the add method receives an array list and adds a passenger to the list. 
			public static void add(ArrayList<CruiseShip>cruiseList) {
				Scanner keyboard= new Scanner(System.in);
				System.out.println("\nPassenger's General Information: ");
				System.out.println("\nEnter the passenger's first name: ");
				String fname= keyboard.nextLine();
				System.out.println("Enter the passenger's last name: ");
				String lname= keyboard.nextLine();
				System.out.println("Enter the passenger's gender: (Enter M for male or F for female)");
				String stringGender= keyboard.nextLine().toUpperCase();
				Gender gender = Gender.valueOf(stringGender);
				System.out.println("\nPassenger's Address Information: ");
				System.out.println("\nStreet: ");
				String street = keyboard.nextLine();
				System.out.println("City: ");
				String city= keyboard.nextLine();
				System.out.println("State: ");
				String state= keyboard.nextLine();
				System.out.println("Zipcode: ");
				String zip = keyboard.nextLine();
				Address addr = new Address(street, city, state, zip);
				System.out.println("\nPassenger's Personal Information: ");
				System.out.println("\nBirthdate: (YYYY-MM-DD)");
				String birthdate= keyboard.nextLine();
				System.out.println("Passport ID: ");
				String id= keyboard.nextLine();
				System.out.println("Enter the number of pieces of luggage: ");
				int luggage = keyboard.nextInt();
				// Input validation.
				if (luggage <0)
					throw new IllegalArgumentException();
				// The passenger is added to the list. If they already exist on the list or if the ship is full, an exception is thrown.
				try {
					cruiseList.get(cruiseList.size()-1).addPassengers(new Passenger(fname, lname, gender, addr, birthdate, id, luggage ));
				}
				catch (PassengerExistsException e) {
					System.out.println("Error: The passenger already exists. ");
				} 
				catch(ShipFullException e) {
					System.out.println("You cannot add a passenger since the ship is full. ");
				}
				
			}
			// The displayCargo method receives an array list and displays the cargo ships in the list. 
			public static void displayCargo(ArrayList<CargoShip>cargoList) {
				System.out.println("Below is the list of cargo ships: \n");
				for (int i=0; i<cargoList.size(); i++) {
					System.out.println("Cargo ship #"+(i+1)+": \n"+cargoList.get(i).toString()+"\n\n");
				}
				System.out.println();
				
			}
			// The displayCruise method receives an array list and displays the cruise ships (along with their passengers) in the list. 
			public static void displayCruise(ArrayList<CruiseShip>cruiseList) {
				System.out.println("Below is the list of cruise ships: ");
				for (int i=0; i<cruiseList.size(); i++) {
					System.out.println("\nCruise ship #"+(i+1)+": \n"+cruiseList.get(i).toString()+"\n");
				}
			}
				
		}
	

