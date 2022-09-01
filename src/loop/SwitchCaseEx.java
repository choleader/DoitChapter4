package loop;

import java.util.Scanner;

public class SwitchCaseEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int floor = sc.nextInt();
		
		switch(floor) {
		case 1 : System.out.println("1층 약국입니다.");
			break;
		case 2 : System.out.println("2층 헬스장입니다.");
			break;
		case 3 : System.out.println("3층 정형외과입니다.");
			break;
		case 4 : System.out.println("4층 PC방입니다.");
			break;
		case 5 : System.out.println("5층 노래방입니다.");
		break;
		default : System.out.println("없는 층입니다.");
		}

	}

}
