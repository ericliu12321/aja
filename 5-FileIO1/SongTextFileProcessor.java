import java.io.*;
public class SongTextFileProcessor implements SongReader, SongWriter {
	private String textFile;
	
	public void setTextFile( String file ) //Gets the text file address
	{
		textFile = file;
	}
	
	public void writeSong ( Song song ) //Method for writing in the text file
	{
		PrintWriter out = null;
		try
		{ //Creates the new writer
			out = new PrintWriter ( new BufferedWriter ( new FileWriter( textFile, true)));
			String title = song.getSongTitle(); //Gets the components from the song class
			String artist = song.getSongArtist();
			String genre = song.getSongGenre();
			out.println("The title of the song is: " + title); //Writes this in the text file
			out.println("The artist of the song is: " + artist);
			out.println("The genre of the song is: " + genre);
		}
		catch ( IOException e )
		{
			System.out.println( "Text File Not Created!"); //Just in case
		}
		finally
		{
			out.close(); //Closes stream and flushes buffer
		}
	}
	
	public void readSong ()
	{
		BufferedReader in = null; //Creates a buffered reader
		String line = null;
		
		try
		{
			in = new BufferedReader( new FileReader( textFile ) );
			while( (line = in.readLine()) != null ) //Displays everything
			{
				System.out.println(line);
			}
			in.close();
		}
		catch ( IOException e )
		{
			System.out.println("IOException Caught!"); //Just in case
		}
	}
	
}
