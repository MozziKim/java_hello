package chapter8;

public class RockScissorsPaper {
	private int computer;
	private String me;
	
	public RockScissorsPaper(String itsMe){
		this.me = itsMe;
	}
	public void getResult() {
		computer = (int) (Math.random() * 3 + 1);
		
		if(computer == 1 ) {
			System.out.println("컴퓨터: 가위");
		}else if(computer == 2) {
			System.out.println("컴퓨터: 바위");
		}else {
			System.out.println("컴퓨터: 보");
		}
		
		if((me.equals("가위")) && (computer == 1)) {
			System.out.println("비겼습니다.");
		}else if((me.equals("가위")) && (computer == 2)) {
			System.out.println("졌습니다.");
		}else if((me.equals("가위")) && (computer == 3)) {
			System.out.println("이겼습니다.");
			
		}else if((me.equals("바위")) && (computer == 1)) {
			System.out.println("이겼습니다.");
		}else if((me.equals("바위")) && (computer == 2)) {
			System.out.println("비겼습니다.");
		}else if((me.equals("바위")) && (computer == 3)) {
			System.out.println("졌습니다.");
			
		}else if((me.equals("보")) && (computer == 1)) {
			System.out.println("졌습니다.");
		}else if((me.equals("보")) && (computer == 2)) {
			System.out.println("이겼습니다.");
		}else if((me.equals("보")) && (computer == 3)) {
			System.out.println("비겼습니다.");
		}
	}
}
