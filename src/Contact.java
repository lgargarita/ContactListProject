/**
 * Defines reusable class "Contact"
 * One object of this class represents a single contact entered by the user
 * comprising of a first name, last name, street, city, state, zip code, country,
 * phone number, e-mail address, and any notes the user may have.
 */
import java.util.*;

public class Contact{
	/**
	 * Variables for all components of a contact
	 */
	private String firstname;
	private String lastname;
	private String street;
	private String city;
	private String state;
	private String zip;
	private String country;
	private String email;
	private String notes;
	private String phone;
	
	/**
	 * Constructor to set default string values to variables
	 */
	public Contact(){
		//Assign default variables when new Contact object created
	}
	/**
	 * Prompts user for information and sets the variables
	 */
	public void setContact(){
		System.out.println("PROMPT USER, SET CONTACT VARIABLES");
	}
	public String toString(){
		return "FORMATTED CONTACT INFORMATION";
	}
}
	

