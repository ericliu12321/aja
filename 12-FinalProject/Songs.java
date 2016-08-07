
public class Songs {
	
	private String title; //Has all the necessary components of a song
	private String artist;
	private String price;
	
	Songs( String t, String a, String p ) //Constructor for when a song is created
	{
		title = t;
		artist = a;
		price = p;
	}

	public String getTitle() { //All necessary getters and setters
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
}
