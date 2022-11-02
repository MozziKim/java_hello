package chapter5;

public class breakBasic2 {

	public static void main(String[] args) {
	
		int num = 0;
		int count = 0;
		while ((num++)<100) {
			if(((num % 5) != 0 || (num % 7) != 0))
				continue; //5,7의 배수가 아니라면 나머지 건너뛰고 위로 이동
			count++; //5,7의 배수인 경우 실행
			System.out.println(num); //5,7의 배수인 겨우만 실행
		}
		System.out.println("1~100까지 숫자 중 5의 배수이자 7의 배수인 숫자 갯수 : " + count);
		
	}

}
