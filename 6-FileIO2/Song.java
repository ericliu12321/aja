
public class Song {
	private String title;
	private String artist;
	private String genre;
	Song( String t, String a, String g ) //Song constructor
	{
		title = t;
		artist = a;
		genre = g;
	}
	public String getSongTitle() //All the necessary getters
	{
		return title;
	}
	public String getSongArtist()
	{
		return artist;
	}
	public String getSongGenre()
	{
		return genre;
	}
}
