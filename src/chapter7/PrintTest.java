package chapter7;

class StarPrint{
	int num;
	
	public void printTriangle(int num) {
		this.num = num;
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void printReverseTriangle(int num) {
		this.num = num;
		for(int i=1; i<=num; i++) {
			for(int j=num; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}


public class PrintTest {
	public static void main(String[] args) {
		StarPrint strPrint = new StarPrint();
		strPrint.printTriangle(3);
		System.out.println();
		strPrint.printReverseTriangle(3); 

	}

}
