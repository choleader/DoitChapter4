package loop;

import java.util.Scanner;

public class SwitchCaseEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int floor = sc.nextInt();
		
		switch(floor) {
		case 1 : System.out.println("1�� �౹�Դϴ�.");
			break;
		case 2 : System.out.println("2�� �ｺ���Դϴ�.");
			break;
		case 3 : System.out.println("3�� �����ܰ��Դϴ�.");
			break;
		case 4 : System.out.println("4�� PC���Դϴ�.");
			break;
		case 5 : System.out.println("5�� �뷡���Դϴ�.");
		break;
		default : System.out.println("���� ���Դϴ�.");
		}

	}

}
