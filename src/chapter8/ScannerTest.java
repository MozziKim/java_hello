package chapter8;
import java.util.*;

public class ScannerTest {
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("가위, 바위, 보 중에 하나를 내세요.");
			Scanner sc = new Scanner(System.in);
			String ans = sc.next();
			
			RockScissorsPaper game = new RockScissorsPaper(ans);
	        game.getResult();
	        
	        System.out.println("계속하시겠습니까? Y/N");
	        char replay = sc.next().charAt(0);
	        if (replay == 'y' || replay == 'Y') {
	        	continue;
	        }else {
	        	break;
	        }
		}
		System.out.println("게임을 종료합니다.");
	}

}

