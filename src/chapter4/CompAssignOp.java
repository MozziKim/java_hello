package chapter4;

public class CompAssignOp {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		
		/* double c = a/b; 결과값 : 0.0. */
//		double c = a/(double)b; 결과값: 0.75
		double c = (double)(a/b); //결과값; 0.0 -> 형변환 전에 계산먼저 하기 때문에 
		
		System.out.println(c);
	}

}
