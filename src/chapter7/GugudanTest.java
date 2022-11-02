package chapter7;

class Gugudan{
	int num;
	void printGugu(int num) {
		for(int i=2; i<=num; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
			System.out.println();
		}
	}
}

public class GugudanTest {

	public static void main(String[] args) {
		Gugudan gugudan = new Gugudan();
		gugudan.printGugu(10); //1단부터 10단까지 출력
		System.out.println("====================================");
		gugudan.printGugu(20); //1단부터 20단까지 출력

	}

}
