package chapter7;

class Song{
	String title;
	String artist;
	int year;
	String country;

    public Song(int year, String country, String artist, String title) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.country = country;
    }
	public void Show() {

		System.out.println(year + "년 " + country  + " 국적의 " + artist +"가 부른 " + title +"\n" );
	}
}


public class SongTest {

	public static void main(String[] args) {

		Song song = new Song(1978,"스웨덴","ABBA","Dancing Queen");
		song.Show();

	}

}
