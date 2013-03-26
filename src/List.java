/**
 *One object of this class represents an array of Contact objects
 *which can be added to, searched, sorted, printed, and saved to disk
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Scanner;

public class List implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int SIZE = 100;
	private int count;
	private Contact[] list;
	private Scanner console;
	private Contact newcontact;

	/**
	 * Constructor initializes array and sets count to zero
	 */
	public List() {
		count = 0;
		list = new Contact[SIZE];
		console = new Scanner(System.in);
	}

	/**
	 * Clears the array for the purpose of testing saving and loading methods
	 */
	public void clearArray() {
		Arrays.fill(list, null);
	}

	/**
	 * Creates new Contact object and adds to array in order of entry
	 * Verifies whether or not entry is correct and starts over when
	 */
	public void addContact() {
		char confirm;
		boolean s = true;
		boolean d;
		this.newcontact = new Contact();
		while (s) {
			this.newcontact.setContact();
			System.out.println("You entered:" + "\n" + "\n"+ this.newcontact.toString() + "\n" + "\n" + "Is this correct?");
			d = true;
			while (d) {
				confirm = console.next().toLowerCase().charAt(0);
				if (confirm == 'y') {
					list[count] = this.newcontact;
					count++;
					System.out.println("Contact added!");
					d = false;
					s = false;
				} else if (confirm == 'n') {
					newcontact.clearContacts();
					d = false;
				} else {
					System.out.println("Please enter \"y\" for yes or \"n\" for no.");
				}
			}
			Menu.printMenu();
		}

	}
		

	/**
	 * Searches the array by last name and prints results to console
	 */
	public void searchByLastName() {
		String search;
		int results = 0;
		System.out.println("Please enter a last name.");
		search = console.next();
		for (int i = 0; i < list.length && list[i] != null; i++){
			if (search.toLowerCase().equals(list[i].getLastName().toLowerCase())){
				results++;
				System.out.println(list[i]+"\n");
			}
		}
		System.out.println("\n"+results+" contacts found."+"\n");
		Menu.printMenu();
	}

	/**
	 * Searches the array by e-mail address and displays results to console
	 */
	public void searchByEmail() {
		String search;
		int results = 0;
		System.out.println("Please enter an e-mail address.");
		search = console.next();
		for (int i = 0; i < list.length && list[i] != null; i++){
			if (search.toLowerCase().equals(list[i].getEmail().toLowerCase())){
				results++;
				System.out.println(list[i]+"\n");
			}
		}
		System.out.println("\n"+results+" contacts found."+"\n");
		Menu.printMenu();
	}


	/**
	 * Searches the array by zip code and displays results to console
	 */
	public void searchByZip() {
		String search;
		int results = 0;
		System.out.println("Please enter a zip code.");
		search = console.next();
		for (int i = 0; i < list.length && list[i] != null; i++){
			if (search.equals(list[i].getZip())){
				results++;
				System.out.println(list[i]+"\n");
			}
		}
		System.out.println("\n"+results+" contacts found."+"\n");
		Menu.printMenu();
	}


	/**
	 * Prints entire contact list
	 */
	public void printContacts() {
		//Arrays.sort(list);
		for (int i = 0; i < list.length && list[i] != null; i++) {
				System.out.println(list[i]);
				System.out.println();
			}
		Menu.printMenu();
	}
	
	/**
	 * Saves array and count value to file named "contactData"
	 */
	public void saveData() {
		FileOutputStream outFile;
		ObjectOutputStream outObject;

		try {
			outFile = new FileOutputStream("contactData");
			outObject = new ObjectOutputStream(outFile);
			outObject.writeObject(list);
			outObject.writeObject(count);
			outFile.close();
			outObject.close();
		} catch (IOException ioe) {
			System.out.println("Error writing objects to the file: "+ ioe.getMessage());
		}
	}

	/**
	 * Reads from contactData save file
	 */
	public void loadData() {
		FileInputStream inFile;
		ObjectInputStream inObject;
		try {
			inFile = new FileInputStream("contactData");
			inObject = new ObjectInputStream(inFile);
			list = (Contact[]) inObject.readObject();
			count = (int) inObject.readObject();
			inFile.close();
			inObject.close();
		} catch (IOException ioe) {
			System.out.println("Error reading from the file: "+ ioe.getMessage());
		} catch (ClassNotFoundException cnfe) {
			System.out.println("Error in casting to Rectangle: " + cnfe);

		}
	}
}
