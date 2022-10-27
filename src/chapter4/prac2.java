package chapter4;

public class prac2 {

	public static void main(String[] args) {

		int num = 77;
		boolean result;
		
		result = ((num % 2 == 0) && (num % 7) == 0) && ((num % 11) == 0);
		System.out.println("77은 짝수이고 7의 배수이고 11의 배수인가? : " + result + "\n");
		
		int num1 = 0;
		int num2 = 0;
		
		result = ((num1 += 10 ) < 0 ) && ((num2 += 10 ) > 0);
		System.out.println("result : " + result);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		result = ((num1 += 10) > 0 ) || ((num2 += 10) > 0);
		System.out.println("\nresult : " + result);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		int kor = 90;
		int math = 70;
		int eng = 80;
		int total = kor + math + eng;
		double avg = total / 3.0; //소수점 표시하기위해 3.0으로 한다.

		System.out.println("국어 : " + kor + "\n수학 : " + math + "\n영어: " + eng 
		+ "\n총점 : " + total + "\n평균 : " + avg);  
	}

}
