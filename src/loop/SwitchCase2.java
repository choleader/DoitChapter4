package loop;

import java.util.Scanner;

public class SwitchCase2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String medal = scanner.nextLine();
		int ranking;
		
		switch(medal)	{
		case "Gold" : System.out.println("�ݸ޴��Դϴ�.");
		break;
		case "Silver" : System.out.println("���޴��Դϴ�.");
		break;
		case "Bronze" : System.out.println("���޴��Դϴ�.");
		break;
		default : System.out.println("�޴��� �����ϴ�.");
		}
		

	}

}
