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

public class List implements Serializable {

	private static final int SIZE = 100;
	private int count;
	Contact[] list;

	/**
	 * Constructor initializes array and sets count to zero
	 */
	public List() {
		list = new Contact[SIZE];
		count = 0;
	}

	/**
	 * Clears the array for the purpose of testing saving and loading methods
	 */
	public void clearArray() {
		Arrays.fill(list, null);
	}

	/**
	 * Creates new Contact object and adds to array in order of entry
	 */
	public void addContact() {
		Contact newcontact = new Contact();
		newcontact.setContact();
		list[count] = newcontact;
		count++;
	}

	/**
	 * Searches the array by last name and prints results to console
	 */
	public void searchByLastName() {
		System.out.println("DISPLAY contactsOut BY LAST NAME"); // TODO display
																// all
																// contactsOut
																// with
																// specified
																// last name
	}

	/**
	 * Searches the array by e-mail address and displays results to console
	 */
	public void searchByEmail() {
		System.out.println("DISPLAY contactsOut BY EMAIL ADDRESS");
		; // TODO display all contactsOut with specified e-mail address
	}

	/**
	 * Searches the array by zip code and displays results to console
	 */
	public void searchByZip() {
		System.out.println("DISPLAY contactsOut BY ZIP CODE"); // TODO display
																// all
																// contactsOut
																// with
																// specified zip
																// code
	}

	/**
	 * Prints entire contact list
	 */
	public void printContacts() {
		for (int i = 0; i <= count; i++) {
			System.out.println(list[i]);
			System.out.println();
		}
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
			System.out.println("Error writing objects to the file: "
					+ ioe.getMessage());
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
			System.out.println("Error reading from the file: "
					+ ioe.getMessage());
		} catch (ClassNotFoundException cnfe) {
			System.out.println("Error in casting to Rectangle: " + cnfe);

		}
	}
}

