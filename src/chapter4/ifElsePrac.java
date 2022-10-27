package chapter4;

import java.util.Scanner;

public class ifElsePrac {

	public static void main(String[] args) {
		/*
		 * int n1 = 5; int n2 = 7;
		 * 
		 * if(n1 < n2) { System.out.println("n1 < n2 is true"); }
		 * 
		 * if(n1 == n2) { System.out.println("n1 == n2 is true"); } else {
		 * System.out.println("n1 == n2 is false"); }
		 */
		int kor;
		int eng;
		int math;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수 : ");
		kor = sc.nextInt();
		System.out.println("영어 점수 : ");
		eng = sc.nextInt();
		System.out.println("수학 점수 : ");
		math = sc.nextInt();
		
		sc.close();
		
		int total = kor + eng + math;
		double avg = total/3.0;
		
		if (avg >= 90) {
			System.out.println("성적은 '수'입니다.");
		}
		else if (avg >= 80) {
			System.out.println("성적은 '우' 입니다.");
		}
		else if (avg >= 70) {
			System.out.println("성적은 '미' 입니다.");
		}
		else if (avg >= 60) {
			System.out.println("성적은 '양' 입니다.");
		}
		else {
			System.out.println("성적은 '가' 입니다.");
		}

	}

}
