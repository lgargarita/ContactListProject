
/**
 * Tests Contact and List classes with console UI
 */

public class TestContactList 
{
	public static void main(String [] args){
		List contactlist = new List();
		
		contactlist.addContact();
		contactlist.addContact();
		System.out.println("Current contacts:");
		contactlist.printContacts();
		
	}
}
