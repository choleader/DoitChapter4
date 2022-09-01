package loop;

public class Continue {

	public static void main(String[] args) {
		
		int num;
		int sum = 0;
		
		for(num = 1; num <= 100; num++) {
			if(num % 2 == 1) {
				continue;
			}
			sum += num;
			
		}
		System.out.println(sum);
	}

}
