/**
 *Menu class contains static methods for loading data and for printing the menu to console
 */
import java.util.Scanner;

public class Menu {
	private static int choice;
	private static List contactlist = new List();
	
	/**
	 * Loads data from save file
	 */
	
	private static void loadData(){
		contactlist.loadData();
	}//by Larry
	
	/**
	 *Prints the menu to console 
	 */
		
	public static void printMenu() {
		Scanner console = new Scanner(System.in);
		System.out.println("What would you like to do?" + "\n"
				+ "1: Enter a new Contact" + "\n" + "2: Retrieve a Contact"
				+ "\n" + "3: Print a Contact List" + "\n" + "4: Save and quit"+"\n");

		do {
			System.out.println("Please enter a number from 1-4");
			while (!console.hasNextInt()) {
				System.out.println("That's not a number! Please enter a number from 1-4");
				console.next();
			}
			choice = console.nextInt();
		} while (choice < 1 || choice > 4);

		switch (choice) {
		case 1:
			System.out.println("--- Enter New Contact ---"+"\n");
			contactlist.addContact(); 
			break;
		case 2:
			int choice2;
			System.out.println("Retrieve contacts by..." + "\n"
					+ "1: Last Name" + "\n" + "2: E-mail address" + "\n"
					+ "3: Zip Code");
			do {
				System.out.println("Please enter a number from 1-3");
				while (!console.hasNextInt()) {
					System.out.println("That's not a number! Please enter a number from 1-3");
					console.next();
				}
				choice2 = console.nextInt();
			} while (choice2 < 1 || choice2 > 3);
			switch (choice2) {
			case 1:
				contactlist.searchByLastName();
				break;
			case 2:
				contactlist.searchByEmail();
				break;
			case 3:
				contactlist.searchByZip();
				break;
			}
			break;
		case 3:
			contactlist.printContacts();
			break;
		case 4:
			contactlist.saveData();
			System.out.println("Thank you for choosing QualitySoft!");
			break;
		default:
			System.out.println("Invalid Response. Please try again.");
			choice = console.nextInt();

		}// By Miran
		console.close();
	}

}
