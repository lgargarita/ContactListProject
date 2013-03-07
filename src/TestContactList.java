/**
 * Tests Contact and List classes with console UI
 */
import java.util.*;

public class TestContactList 
{
	public static void main (String [] args)
	{
		List contactlist = new List();
		Scanner console = new Scanner(System.in);
		int choice;	
		
		System.out.println("Welcome to the QualitySoft Address Book!" + "\n");
		System.out.println("What would you like to do?" + "\n" + "1: Enter a new Contact" + "\n" + "2: Retrieve a Contact" + "\n" + "3: Print a Contact List" + "\n" + "4: Quit");
		
		do{
			System.out.println("Please enter a number from 1-4");
				while (!console.hasNextInt()){
					System.out.println("That's not a number! Please enter a number from 1-4");
					console.next();
				}
				choice = console.nextInt();
		}
		while (choice < 1 || choice > 4);
		
		
		switch (choice)
			{
				case 1:
					Contact newContact = new Contact();
					newContact.setContact();
					newContact.storeContact();
					break;
				case 2:
					int choice2;
					System.out.println("Retrieve contacts by..."+"\n"+"1: Last Name"+"\n"+"2: E-mail address"+"\n"+"3: Zip Code");
					do{
						System.out.println("Please enter a number from 1-3");
							while (!console.hasNextInt()){
								System.out.println("That's not a number! Please enter a number from 1-3");
								console.next();
							}
							choice2 = console.nextInt();
					}
					while (choice2 < 1 || choice2 > 3);
					switch (choice2){
						case 1: contactlist.searchByLastName();
								break;
						case 2: contactlist.searchByEmail();
								break;
						case 3: contactlist.searchByZip();
								break;
						}
					break;
				case 3:
					contactlist.printContacts();
					break;
				case 4:
					contactlist.saveToFile();
					break;
				default:
					System.out.println("Invalid Response. Please try again.");
					choice = console.nextInt();
					
			}
		console.close();
	}
}
/*
Welcome to the QualitySoft Address Book!

What would you like to do?
1: Enter a new Contact
2: Retrieve a Contact
3: Print a Contact List
4: Quit
Please enter a number from 1-4
1
PROMPT USER, SET CONTACT VARIABLES
STORE CONTACT TO ARRAY

Welcome to the QualitySoft Address Book!

What would you like to do?
1: Enter a new Contact
2: Retrieve a Contact
3: Print a Contact List
4: Quit
Please enter a number from 1-4
2
Retrieve contacts by...
1: Last Name
2: E-mail address
3: Zip Code
Please enter a number from 1-3
1
DISPLAY CONTACTS BY LAST NAME

Welcome to the QualitySoft Address Book!

What would you like to do?
1: Enter a new Contact
2: Retrieve a Contact
3: Print a Contact List
4: Quit
Please enter a number from 1-4
2
Retrieve contacts by...
1: Last Name
2: E-mail address
3: Zip Code
Please enter a number from 1-3
2
DISPLAY CONTACTS BY EMAIL ADDRESS

Welcome to the QualitySoft Address Book!

What would you like to do?
1: Enter a new Contact
2: Retrieve a Contact
3: Print a Contact List
4: Quit
Please enter a number from 1-4
2
Retrieve contacts by...
1: Last Name
2: E-mail address
3: Zip Code
Please enter a number from 1-3
3
DISPLAY CONTACTS BY ZIP CODE

Welcome to the QualitySoft Address Book!

What would you like to do?
1: Enter a new Contact
2: Retrieve a Contact
3: Print a Contact List
4: Quit
Please enter a number from 1-4
3
PRINT ALL CONTACTS

Welcome to the QualitySoft Address Book!

What would you like to do?
1: Enter a new Contact
2: Retrieve a Contact
3: Print a Contact List
4: Quit
Please enter a number from 1-4
4
QUIT AND SAVE TO FILE
*/

