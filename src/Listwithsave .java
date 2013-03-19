/**
 * Defines reusable class List
 * Creates array of Contact objects to store contacts
 * Has methods for searching and saving to and reading from file
 */

public class List {
	
	private static final int SIZE = 100;
	private int count;
	Contact[] list;
	
	public List(){
		list = new Contact[SIZE];
		count = 0;
	}
	/**
	 * Adds contact to array
	 * @param new 
	 */
	public void addContact(){

		Contact newcontact = new Contact();
		newcontact.setContact();
		list[count] = newcontact;
		count++;
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
		for (int i = 0; i <= count; i++){
				System.out.println(list[i]);
				System.out.println();
		}
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
	public void SaveData(){
		ObjectOutputStream outObject;
		  FileOutputStream outFile;
	      try  {
	         outFile = new FileOutputStream("outFile");     
	         outObject = new ObjectOutputStream(outFile);
	         outObject.writeObject(list);
	         outFile.close();
	         outObject.close();     

	      } catch (IOException ioe)  {
	         System.out.println ("Error writing objects to the file: "+ ioe.getMessage());
	      }
	      }
	 
		
		/**
		 * Reads from file
		 */

			public void loadData(){
				System.out.println("READ FROM FILE");
				ObjectInputStream inObject;
				FileInputStream inFile;
				try {
					inFile = new FileInputStream("outFile");
					inObject = new ObjectInputStream(inFile);
					list = (Contlist[]) inObject.readObject();
					inFile.close();
					inObject.close();
				} catch (IOException ioe) {
					System.out.println("You have no stored data.");
				} catch (ClassNotFoundException cnfe) {
					System.out.print("");
}
