import java.io.*;
public class SongBinaryFileProcessor implements SongReader, SongWriter {
	private String binaryFile;
	private int numberOfSongs = 3; //Adds three each time a new song is created (look at setNumberOfSongs method
	private String numberOfSongsString = "3"; //String form
	private DataOutputStream out; //Creates a universal Data Output Stream for all methods to see
	
	public void setBinaryFile( String file )
	{
		binaryFile = file; //Gets the binary file address
	}
	
	public void writeSong( Song song )
	{
		try
		{
			out = new DataOutputStream( new BufferedOutputStream( new FileOutputStream( binaryFile, true ) ) );
			String title = song.getSongTitle(); //Gets the components from the song class
			String artist = song.getSongArtist();
			String genre = song.getSongGenre();
			setNumberOfSongs(); //Gets the song number
			out.writeChars("The title of song " + numberOfSongsString + " is: " + title + "_"); //Writes the components
			out.writeChars("The artist of song " + numberOfSongsString + " is: " + artist + "_"); //"_" is used as a marker
			out.writeChars("The genre of song " + numberOfSongsString + " is: " + genre + "_"); //Adds one to numberOfSongs each time it hits "_"
			out.close(); //Closes buffer
		}
		catch( IOException e ) //Just in case
		{
			System.out.println("IO Exception caught!");
		}
	}
	
	public char[] readSong()
	{
		DataInputStream in = null;
		char character; //For display purposes
		char[] output = null;
		try
		{
			in = new DataInputStream( new BufferedInputStream( new FileInputStream( binaryFile ) ) ); //Creates a new Data Input Stream
			int number = in.available(); //Finds number of bytes
			int numberOfChars = number/2; //Gets the number of characters
			output = new char[numberOfChars]; //Creates the array based off of the number of characters
			for( int i = 0; i<numberOfChars; i++ ) //Sets the array
			{
				character = in.readChar();
				output[i] = character;
			}
			in.close(); //Closes the stream
		}
		catch( IOException e ) //Just in case
		{
			System.out.println("IO Exception caught!");
		}
		return output;
	}
	
	protected void setNumberOfSongs() //Finds the number of song objects (this is not required, but makes it look better)
	{
		DataInputStream in = null; //Makes a new input stream
		char character;
		try
		{
			in = new DataInputStream( new BufferedInputStream( new FileInputStream( binaryFile ) ) );
			int number = in.available(); //Gets the number of characters
			for( int i = 0; i<number/2; i++ )
			{
				character = in.readChar();
				if(character == '_') //Since each song object always has three '_', then gets the number of song objects based off of them
					numberOfSongs++;
			}
			numberOfSongs = numberOfSongs/3; //Divides by three since there are three '_''s for one song objects
			numberOfSongsString = Integer.toString(numberOfSongs); //Changes it into a String
		}
		catch(IOException e ) //Just in case
		{
			System.out.println("IOException Caught!");
		}
	}

}
