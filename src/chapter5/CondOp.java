package chapter5;

public class CondOp {

	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 100;
		
		int big;
		
		big = (num1 > num2)? num1 : num2;
		System.out.println("큰 수: " + big);
		
		//num1 num2 의 차이의 절대값을 구하는 프로그램을 짜시오.
		
		big = (num1 > num2) ? (num1 - num2) : (num2 - num1);
		System.out.println("(절대값)큰 수: " + big);
		
		if((num1 - num2) > 0) {
			System.out.println("(절대값)큰 수 : " + (num1 - num2));
		}else {
			System.out.println("(절대값)큰 수 : " + -(num1 - num2));
		}
		
		if (num1 > num2){
			System.out.println("큰 수 : " + num1);
		}else{
			System.out.println("큰 수 : " + num2);
		}

	}

}
