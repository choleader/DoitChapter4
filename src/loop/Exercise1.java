package loop;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		Scanner sc = new Scanner(System.in);
		
		char operator = sc.next().charAt(0);
		
		if(operator == '+') {
			System.out.println(num1 + num2);
		}
		else if(operator == '-') {
			System.out.println(num1 - num2);
		}
		else if(operator == '*') {
			System.out.println(num1 * num2);
		}
		else if(operator == '/') {
			System.out.println(num1 / num2);
		}
	
		
	}

}
