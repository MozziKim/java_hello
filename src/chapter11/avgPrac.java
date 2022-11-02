package chapter11;
import java.util.*;


class Grade{
	private int math, science, english;
	private int sum = 0;
	private double avg = 0;

	public Grade(int math, int science, int english){
		this.math = math;
		this.science = science;
		this.english = english;
		sum = math + science + english;

	}
	public double average(){
		
		this.avg = sum/3.0;
		return avg;
		
	}
	
	public String getGrade() {
		if (avg>=90) {
			return "수 입니다.";
		}else if(avg>=80) {
			return "우 입니다.";
		}else if(avg>=70) {
			return "미 입니다.";
		}else if(avg>=60) {
			return "양 입니다.";
		}else {
			return "가 입니다.";
		}
	}
}


public class avgPrac {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("수학, 과학, 영어 순으로 3개의 정수 입력 >> ");
        int math = sc.nextInt();
        int science = sc.nextInt();
        int english = sc.nextInt();
        Grade me = new Grade(math, science, english);
        System.out.println("평균은 "+me.average());
        System.out.println(me.getGrade()); // 수 입니다
        sc.close();

	}

}
