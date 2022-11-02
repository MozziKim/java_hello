package chapter6;

public class FuncPrac {

	public static void main(String[] args) {
		starPrint(3);
		
		starPrint(7);
		System.out.println("성적은 " + grade(avg(100,95,95)) + "입니다.");
	}
	
	public static void starPrint(int num) {
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
	}
	
	public static double avg(int kor, int eng, int math) {
		
		return (kor + eng +  math) / 3.0;
	}
	
	public static char grade(double avg) {
		char ch = ' ';
		
		if(avg>= 90) {
			ch = '수';
		}else if(avg>= 80) {
			ch = '우';
		}else if(avg>= 70) {
			ch = '미';
		}else if(avg>= 60) {
			ch = '양';
		}else{
			ch = '가';
		}
		return ch;
	}

}
