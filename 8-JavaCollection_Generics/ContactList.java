	import java.util.*;
import java.io.*;
public class ContactList {
	private String file;
	TreeMap< String, Contact > contactList = new TreeMap< String, Contact >(); //Creates a new tree map
	
	ContactList(String fileName) //Constructor
	{
		file = fileName; //Gets the file address
		File f = new File( file );
		if(f.exists() && !f.isDirectory()) //If it already exists, read it
		{ 
		    readFile();
		}
	}
	
	public void addList( Contact contact ) //Writes contacts
	{
		contactList.put( contact.getLast() + " " + contact.getFirst(), contact );
	}
	
	public void removeList( String name ) //Removes contacts
	{
		contactList.remove(name);
	}
	
	public Contact [] displayList() //Returns a contact array so that it can be displayed in the main class
	{
		Contact contact = null;
		Contact allContacts [] = new Contact[contactList.size()]; //Uses the .size method
		int marker = 0;
		for( Map.Entry individual : contactList.entrySet() ) //Loops through and makes the array
		{
			contact = contactList.get( individual.getKey() );
			allContacts[marker] = contact;
			marker++;
		}
		return allContacts; //Returns the array
	}
	
	protected void readFile() //reads the file
	{
		ObjectInputStream in = null; //New input stream
		try
		{
			in = new ObjectInputStream( new BufferedInputStream( new FileInputStream( file ) ) );
				try
				{
					TreeMap contact = (TreeMap< String, Contact >) in.readObject(); //Reads the tree map in the file
					contactList = contact; //Sets it as the tree map for the program
				}
				catch( ClassNotFoundException e ) //Just in case
				{
					System.out.println("Class Not Found Exception Caught!");
				}
		}
		catch( IOException e ) //Just in case
		{
			System.out.println("IO Exception Caught!");
		}
	}
	
	public void writeFile() //writes the contacts into the file for future purposes
	{
		ObjectOutputStream out = null; //Creates an output stream
		try
		{
		out = new ObjectOutputStream( new BufferedOutputStream( new FileOutputStream( file ) ) ); //Puts the data in the file
		out.writeObject(contactList);
		out.close(); //Closes stream and flushes buffer
		}
		catch( IOException e ) //Just in case
		{
			System.out.println("IO Exception Caught!");
		}
	}

	
}
