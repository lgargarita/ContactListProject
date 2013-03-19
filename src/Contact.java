/**
 * Defines reusable class "Contact"
 * One object of this class represents a single contact entered by the user
 * comprising of a first name, last name, street, city, state, zip code, country,
 * phone number, e-mail address, and any notes the user may have.
 */
import java.io.Serializable;
import java.util.Scanner;

public class Contact implements Serializable {
	transient Scanner sc;
	/**
	 * Variables for all components of a contact
	 */
	private String firstname;
	private String lastname;
	private String email;
	private String notes;
	private String phone;
	private String street;
	private String city;
	private String state;
	private String zip;
	private String country;

	/**
	 * Constructor assigns variables as null Initializes scanner
	 */
	public Contact() {
		sc = new Scanner(System.in);
		firstname = null;
		lastname = null;
		email = null;
		notes = null;
		phone = null;
		street = null;
		city = null;
		state = null;
		zip = null;
		country = null;
	}

	/**
	 * Prompts user for information and sets the variables
	 */
	// TODO: Add capital letter validation
	public void setContact() {
		System.out.println("Please enter a first name.");
		firstname = sc.nextLine();
		while (firstname == null || firstname.trim().isEmpty()) {
			firstname = "n/a";
		}
		while (lastname == null || lastname.trim().isEmpty()) {
			System.out.println("Please enter a last name.");
			lastname = sc.nextLine();
		}
		System.out.println("Please enter street address.");
		street = sc.nextLine();
		while (street == null || street.trim().isEmpty()) {
			street = "n/a";
		}
		System.out.println("Please enter city.");
		city = sc.nextLine();
		while (city == null || city.trim().isEmpty()) {
			city = "n/a";
		}
		System.out.println("Please enter state.");
		state = sc.nextLine();
		while (state == null || state.trim().isEmpty()) {
			state = "n/a";
		}
		System.out.println("Please enter zip code.");
		zip = sc.nextLine();
		while (zip == null || zip.trim().isEmpty()) {
			zip = "n/a";
		}
		System.out.println("Please enter country.");
		country = sc.nextLine();
		while (country == null || country.trim().isEmpty()) {
			country = "n/a";
		}
		System.out.println("Please enter phone number.");
		phone = sc.nextLine();
		while (phone == null || phone.trim().isEmpty()) {
			phone = "n/a";
		}
		System.out.println("Please enter e-mail address.");
		email = sc.nextLine();
		while (email == null || email.trim().isEmpty()) {
			email = "n/a";
		}
		System.out.println("Please enter notes.");
		notes = sc.nextLine();
		while (notes == null || notes.trim().isEmpty()) {
			notes = "n/a";
		}
	}

	/**
	 * Returns contact entered
	 */
	public String toString() {
		return lastname + "," + firstname + "\n" + street + "\n" + city + ","
				+ state + " " + zip + " " + country + "\n" + "Phone: " + phone
				+ "\n" + "E-mail: " + email + "\n" + "Notes: " + notes;
	}
}
