package chapter6;

public class FuncPrac2 {

	public static void main(String[] args) {

		System.out.println(getHap(10));
		getHapPrint(10);
		getHapPrint(20);

	}
	public static int getHap(int num) {
		int sum = 0;
		for(int i =1; i<=num; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void getHapPrint(int num) {
		int sum = 0;
		for(int i =1; i<=num; i++) {
			sum += i;
			if (i != num) {
				System.out.print(i + " + ");
			}
			else {
				System.out.print(i + " = ");
			}
		}
		System.out.println(sum);
		
	}

}
