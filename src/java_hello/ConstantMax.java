package java_hello;

public class ConstantMax {

	public static void main(String[] args) {
		// 반지름이 10인 원의 넓이를 구하느 프로그램을 짜시오.
		int radius = 10;
		final double PI = 3.14;
		
		System.out.println("반지름이 10인 원의 넓이 : " + PI * radius * radius);
		
		//센세
		double radius1 = 10.0;
		double PI1 = 3.14;
		System.out.println("반지름이 10인 원의 넓이 : " + PI1 * radius1 * radius1
				);

	}

}
