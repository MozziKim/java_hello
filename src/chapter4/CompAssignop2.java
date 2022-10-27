package chapter4;

public class CompAssignop2 {

	public static void main(String[] args) {
		short num = 10;
		num = (short)(num + 77L);// 형 변환 안하면 컴파일 오류
		
		int rate = 3;
		rate = (int)(rate * 3.5); //형변환 안하면 컴파일 오류
		
		System.out.println(num); //87
		System.out.println(rate); //10
		
		num= 10;
		num += 77L; //형변환 필요없음.
		rate = 3;
		rate *= 3.5; //형 변환 필요 없음.
		System.out.println(num); //87
		System.out.println(rate); //10
	}

}
