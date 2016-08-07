import java.util.Scanner;
public class Assignment5 {
	public static void main ( String [] args )
	{
		Scanner input = new Scanner( System.in ); //Creates a scanner for inputs
		SongTextFileProcessor processor = new SongTextFileProcessor(); //Creates a SongTextFileProcessor
		System.out.println();
		System.out.print("What is the text file that you want to put the songs in: ");
		String file = input.nextLine(); //Finds the text file to write on
		processor.setTextFile( file ); //Sets the text file
		System.out.println();
		System.out.print("What is the title of the song: ");
		String title = input.nextLine(); //Finds all the components of the song
		System.out.println();
		System.out.print("What is the artist of the song: ");
		String artist = input.nextLine();
		System.out.println();
		System.out.print("What is the genre of the song: ");
		String genre = input.nextLine();
		System.out.println();
		Song song = new Song( title, artist, genre ); //Creates the song
		processor.writeSong(song); //Writes the song in a text file
		System.out.println("Displaying the Song in the Text File!");
		System.out.println();
		processor.readSong(); //Displays the song
	}
}
