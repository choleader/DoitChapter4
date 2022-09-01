package loop;

import java.util.Scanner;

public class IfExScannerEx2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		char grade;
		
		if(score >= 90) {
			grade = 'A';
		}
		
		else if(score >= 80) {
			grade = 'B';
		}
		
		else if(score >= 70) {
			grade = 'C';
		}
		
		else if(score >= 60) {
			grade = 'D';
		}
		
		else if(score >= 80) {
			grade = 'E';
		}
		
		else {
			grade = 'F';
		}
		
		System.out.println("이 사람의 점수는 " +score+ "점이고 "+grade+"학점입니다." );
		
		

	}
}