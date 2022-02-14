// Description: Defined song object for use with songlib
package object;

import java.util.Comparator;

public class Song {
	String name;
	String artist;
	String year;
	String album;
	public Song (String name, String artist, String album, String year) 
	{
		this.name = name;
		this.artist = artist;
		this.album = album;
		this.year = year;
	}
	// GETTERS
	public String getName() 
	{
		return name;
	}
	public String getArtist() 
	{
		return artist;
	}
	public String getAlbum() 
	{
		return album;
	}
	public String getYear() 
	{
		return year;
	}
	// SETTERS
	public void setName(String name) 
	{
		this.name = name;
	}
	public void setArtist(String artist) 
	{
		this.artist = artist;
	}
	public void setYear(String year) 
	{
		this.year = year;
	}
	public void setAlbum(String album) 
	{
		this.album = album;
	}
	// TOSTRING
	public String toString() 
	{
		return "NAME:" + name + "ARTIST:" + artist + "ALBUM:" + album + "YEAR:" + year;
	}
	// COMPARING SONGS
	public static Comparator<Song>titleSort = new Comparator<Song>() // Compares song titles, returns negative int, positive int, or zero
	{
		public int compare(Song deet, Song doot) 
		{
			String title0 = deet.getName().toUpperCase();
			String title1 = doot.getName().toUpperCase();
			return title0.compareTo(title1);
		}
	};
	public static Comparator<Song>artistSort = new Comparator<Song>() // Ditto previous but for artist name
	{
		public int compare(Song deet, Song doot) 
		{
			String name0 = deet.getArtist().toUpperCase();
			String name1 = doot.getArtist().toUpperCase();
			return name0.compareTo(name1);
		}
	};
}
