package chapter6;

public class fffffffffffffff {

	public static void main(String[] args) {
		for(int i=7; i>0; i--){
			if(i % 2 != 0) {
				for(int j=1; j<=i; j++){
					System.out.print("*");
				}
				System.out.print("(" + i + ")");
				System.out.println();
			}
			else {
				continue;
			}
		}
	}


}
