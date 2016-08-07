import java.util.Scanner;
public class Assignment6 {
	public static void main ( String [] args )
	{
		Scanner input = new Scanner( System.in );
		Scanner input2 = new Scanner( System.in );
		Scanner input3 = new Scanner( System.in );//Creates scanners for inputs
		SongBinaryFileProcessor processor = new SongBinaryFileProcessor(); //Creates a SongTextFileProcessor
		int choice = 0; //Allows the user to choose what to do next
		System.out.println();
		
		System.out.print("What is the binary file that you want to put the songs in: ");
		String file = input3.nextLine(); //Finds the binary file to write on
		processor.setBinaryFile( file ); //Sets the binary file
		
		while(choice != 3) //Gives user options to choose from, if it's three, it means they quit
		{
			System.out.println();
			System.out.println("1. Add Song"); //Options
			System.out.println("2. Display all Songs");
			System.out.println("3. Quit");
			System.out.print("What would you like to to: ");
			choice = input.nextInt();
			System.out.println();
			if(choice == 1) //User wants to add a song
			{
				System.out.print("What is the title of the song: ");
				String title = input2.nextLine(); //Finds all the components of the song
				System.out.println();
				System.out.print("What is the artist of the song: ");
				String artist = input2.nextLine(); //Finds all the components of the song
				System.out.println();
				System.out.print("What is the genre of the song: ");
				String genre = input2.nextLine(); //Finds all the components of the song
				Song song = new Song( title, artist, genre ); //Creates the song
				processor.writeSong(song); //Writes the song in a binary file
			}
			
			else if(choice == 2) //User wants to display songs
			{
				System.out.println("Displaying the Song in the Binary File!");
				char display [] = processor.readSong(); //Displays the song
				for( int i = 0; i < display.length; i++ )
				{
					if(display[i] == '_')
						System.out.println();
					else
						System.out.print(display[i]);
				}
			}
			
			else if(choice == 3) //The user wants to exit the program
			{
				System.out.println("Thank you for using this program!");
			}
			
			else //If the user enters something that doesn't make sense
				System.out.println("Sorry, that is not a valid input!");
		}
	}
}
