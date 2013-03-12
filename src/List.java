/**
 * Defines reusable class List
 * Creates array of Contact objects to store contacts
 * Has methods for searching and saving to and reading from file
 */

public class List {
	
	private static final int SIZE = 100;
	private Contact[] list = new Contact[SIZE];
	
	public void addContact(){
		System.out.println("ADD CONTACT TO LIST");
	}
	/**
	 * Searches the array by last name and prints results to console
	 */
	public void searchByLastName(){
		System.out.println("DISPLAY CONTACTS BY LAST NAME"); //TODO display all contacts with specified last name
	}
	/**
	 * Searches the array by e-mail address and displays results to console
	 */
	public void searchByEmail(){
		System.out.println("DISPLAY CONTACTS BY EMAIL ADDRESS");; //TODO display all contacts with specified e-mail address
	}
	/**
	 * Searches the array by zip code and displays results to console
	 */
	public void searchByZip(){
		System.out.println("DISPLAY CONTACTS BY ZIP CODE"); //TODO display all contacts with specified zip code
	}
	/**
	 * Prints entire contact list
	 */
	public void printContacts(){
		System.out.println("PRINT ALL CONTACTS"); //TODO Prints all contacts sorted by last name
	}
	/**
	 * Saves array to file
	 */
	public void saveToFile(){
		System.out.println("QUIT AND SAVE TO FILE"); //TODO Saves to file
	}
	/**
	 * Reads from file
	 */
	public void readFile(){
		System.out.println("READ FROM FILE");
	}
}
