package loop;

public class Q3 {

	public static void main(String[] args) {
		int i;
		int j;
		
		for(i = 2; i < 10; i++) {
			for(j = 1; ; j++) {
				if(j > i) {
					break;
				}
				System.out.println(i + "X" + j + "=" + i*j);
			}
		System.out.println(" ");
			
		}


	}

}
