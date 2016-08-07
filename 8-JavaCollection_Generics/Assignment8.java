import java.util.Scanner;
public class Assignment8 {

	public static void main(String[] args) {
		
		int choice = 0;
		Scanner input = new Scanner( System.in ); //Creates all necessary scanners
		Scanner input2 = new Scanner( System.in );
		
		System.out.print("What is the file that you want the information to be stored in: "); //Gets the file
		String file = input2.nextLine();
		ContactList contactList = new ContactList( file ); //Uses constructor
		
		while(choice != 4) //Gives user options to choose from, if it's four, it means they quit
		{
			System.out.println();
			System.out.println("1. Add Contact"); //Options
			System.out.println("2. Display all Contacts");
			System.out.println("3. Remove Contact");
			System.out.println("4. Quit");
			System.out.print("What would you like to to: ");
			choice = input.nextInt();
			System.out.println();
			if(choice == 1) //User wants to add a contact
			{
				System.out.print("What is the First Name of the contact: ");
				String first = input2.nextLine(); //Finds all the components of the contact
				System.out.println();
				System.out.print("What is the Last Name of the contact: ");
				String last = input2.nextLine();
				System.out.println();
				System.out.print("What is the phone number of the contact: ");
				String phone = input2.nextLine();
				System.out.println();
				System.out.print("What is the email of the contact: ");
				String email = input2.nextLine();
				Contact contact = new Contact( first, last, phone, email ); //Creates the contact
				contactList.addList(contact); //Writes the contact
			}
			
			else if(choice == 2) //User wants to display contacts
			{
				System.out.println();
				System.out.println("Displaying the Contacts!");
				Contact display [] = contactList.displayList(); //Displays the contact
				for( Contact contact : display )
				{
					System.out.println("The name of the contact is: " + contact.getFirst() + " " + contact.getLast());
					System.out.println("The phone number of the contact is: " + contact.getPhone());
					System.out.println("The email of the contact is: " + contact.getEmail());
					System.out.println();
				}
			}
			
			else if(choice == 3) //User wants to delete a contact
			{
				System.out.println();
				System.out.print("What is the last name of the person that you want to delete (last name then first name): ");
				String name = input2.nextLine(); //Gets the key for the tree map object
				contactList.removeList(name); //Removes the contact
			}
			else if(choice == 4) //The user wants to exit the program
			{
				contactList.writeFile(); //Writes the contacts into the file
				System.out.println("Thank you for using this program!");
			}
			
			else //If the user enters something that doesn't make sense
				System.out.println("Sorry, that is not a valid input!");
		}
		
	}

}
