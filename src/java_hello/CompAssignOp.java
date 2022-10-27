package java_hello;

public class CompAssignOp {

	public static void main(String[] args) {

		/*
		 * char ch = 'A'; short sh = 100;
		 * 
		 * int result = ch + sh; //short result 로 하면 오류난다.
		 * 
		 * 
		 * System.out.println(result); //결과값: 165
		 * System.out.println(ch); //만약 ch가 65라면 A가 출력되고, 32라면 아무것도 출력되지 않는다.
		 */
		
		/*
		 * float f1 = 0.1f; //실수는 보통 double로 인식하기 때문에 f 꼭 붙여줘야함 long l = 10L;
		 */
		/*
		 * float result = f1+l; 
		 * System.out.println(result); 
		 * //결과값: 10.1 long이 float로 형변환 해서 연산된다.
		 */	

		long result = 10L;
		System.out.println(result);
		
		double pi = 3.14;
		int num = (int)pi; // 명시적 형변환
		
		pi = num;
		System.out.println(num); // 결과값: 3
		
		char sh1 = 'A';
		short sh2 = 1;
		
		char sh3= (char)(sh1 + sh2); //결과값: B (66의 아스키 코드값인 B가 출력)
		
		System.out.println(sh3);
		

	}
}
