package loop;

public class Q5 {

	public static void main(String[] args) {
		
		for(int j = 0; j < 4; j++) {
			for(int i = 0; i < 3-j; i++) {
				System.out.print(" ");
			}
			for(int k = 0; k < 2*j+1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int a = 0; a < 4 ; a++ ) {
			for(int b = 0; b < a+1; b++) {
				System.out.print(" ");
			}
			for(int c = 0; c < 5-2*a; c++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	
	}

}
