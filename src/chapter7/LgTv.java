package chapter7;
class TV{
	String name;
	int year;
	int size;
	
	TV(String name, int year, int size){
		this.name = name;
		this.year = year;
		this.size = size;
	}
	void show(){
		System.out.println(name + "에서 만든" + year +"년 형 " + size + "인치 TV");
	}
}
public class LgTv {

	public static void main(String[] args) {
		 TV myTV = new TV("LG", 2017, 32); //LG에서 만든 2017년 32인치
		 myTV.show();
	}

}
