package chapter11;

class Song {
	String title;
	String artist;
	int year;
	String country;
	 
	public Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	public void show() {
		System.out.println(year+"년"+country+"국적의"+artist+"가 부른"+title);
	}
	
}

public class songprac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song song = new Song("Dancing Queen","ABBA",1978,"스웨덴");//1978년 스웨덴국적의 ABBA가 부른 Dancing Queen
		song.show();
	}

}
