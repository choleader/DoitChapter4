package loop;

public class WhileGugudan {

	public static void main(String[] args) {
		
		int i = 2;
		int j = 1;
		
		while(i < 10) {
			j = 1;
			while(j < 10) {
				System.out.println(i+"x"+j+"="+i*j);
				j++;
			}
			i++;
		}

	}

}
