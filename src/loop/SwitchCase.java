package loop;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		char medalColor;
		int rank = scanner.nextInt();
		
		switch(rank) {
		case 1 : medalColor = 'G';
		break;
		
		case 2 : medalColor = 'S';
		break;
		
		case 3 : medalColor = 'B';
		break;
		
		default : medalColor = 'A';
		}
		
		System.out.println("순위는" + rank + "등 이며" + "메달 색은" + medalColor + "입니다.");

	}

}
