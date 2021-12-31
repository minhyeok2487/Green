package prac04;

class Song {
	String title;
	String artist;
	int year;
	String country;
	
	public Song() {}
	
	public Song(String title, String artist, 
			int year, String country) 
	{
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	public void show() {
		System.out.printf("%d년 %s의 %s가 부른 %s", year, country, artist, title);
	}
}


public class SongMain {

	public static void main(String[] args) {
		Song Song = new Song("Dancing Queen", "ABBA", 1978, "스웨덴 국적");
		Song.show();
	}

}
