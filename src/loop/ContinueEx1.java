package loop;

import java.util.Scanner;

public class ContinueEx1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int total = 0;
		for(int i = 1; i <= num; i++) {
			if(i % 2 == 1) {
				continue;
			}
			total += i;
		}
		System.out.println("짝수의 합은 " + total +"입니다.");

	}

}
