package loop;

import java.util.Scanner;

public class IfExScannerEx1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char gender = sc.next().charAt(0);
		
		
		
		if(gender == 'F') {
			System.out.println("�����Դϴ�.");
		}
		else if(gender == 'M') {
			System.out.println("�����Դϴ�.");
		}
	}

}
