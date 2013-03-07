/**
 * Defines reusable class "Contact"
 * Sets variables for contact components
 * 
 */
import java.util.*;

public class Contact{
	/**
	 * Variables for all components of a contact
	 */
	private String FirstName;
	private String LastName;
	private String Email;
	private String Notes;
	private String Phone;

	private String street;
	private String city;
	private String state;
	private String zip;
	private String country;
	/**
	 * Constructor to set default string values to variables
	 */
	public Contact()
	{
		//Assign default variables when new Contact object created
	}
	/**
	 * Prompts user for information and sets the variables
	 */
	public void setContact(){
		System.out.println("PROMPT USER, SET CONTACT VARIABLES");
	}
	/**
	 * Stores contact in array
	 */
	public void storeContact(){
		System.out.println("STORE CONTACT TO ARRAY");
	}
}
	
