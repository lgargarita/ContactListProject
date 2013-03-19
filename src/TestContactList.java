
/**
 * Tests Contact and List classes with console UI
 */

public class TestContactList 
{
	public static void main(String [] args){
		List contactlist = new List();
		contactlist.addContact();
		contactlist.addContact();
		contactlist.saveData();
		contactlist.clearArray();
		contactlist.loadData();
		System.out.println("Current contacts: ");
		System.out.println();
		contactlist.printContacts();
	}
}

/*
Please enter a first name.
John
Please enter a last name.
Doe
Please enter street address.
123 Fake St.
Please enter city.
Los Altos Hills
Please enter state.
CA
Please enter zip code.
94022
Please enter country.
USA
Please enter phone number.
(408)555-1212
Please enter e-mail address.
jdoe@fhda.edu
Please enter notes.
n/a
Please enter a first name.
Jane
Please enter a last name.
Doe
Please enter street address.
12 Paper St.
Please enter city.
Los Angeles
Please enter state.
CA
Please enter zip code.
55555
Please enter country.
USA
Please enter phone number.
(408)928-2344
Please enter e-mail address.
jane.doe@fhda.edu
Please enter notes.
Very nice lady.
Current contacts: 

Doe,John
123 Fake St.
Los Altos Hills,CA 94022 USA
Phone: (408)555-1212
E-mail: jdoe@fhda.edu
Notes: n/a

Doe,Jane
12 Paper St.
Los Angeles,CA 55555 USA
Phone: (408)928-2344
E-mail: jane.doe@fhda.edu
Notes: Very nice lady.

null
*/
