package chapter5;

public class starprac {

	public static void main(String[] args) {
		
		for(int i=5; i>=1; i--) { //5 4 3 2 1
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i<=5; i++) { //1 2 3 4 5
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i<=5; i++) { //5 4 3 2 1
			for(int j=5; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		//나
		for(int i=1; i<=5; i++) { //1 2 3 4 5
			for(int j=5; j>=1; j--) {
				if(j>i) {
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		//센세
		for(int i=1; i<=5; i++) {
			for(int j=5; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
