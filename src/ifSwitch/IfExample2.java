package ifSwitch;

public class IfExample2 {
	public static void main(String[] args) {
		
		int age = 18;
		int charge;
		
		if(age < 8) {
			charge = 0;
			System.out.println("미취학 아동입니다.");
		}
		else if(age < 14) {
			charge = 2000;
			System.out.println("초등학생입니다.");
		}
		else if(age < 17) {
			charge = 3000;
			System.out.println("중학생입니다.");
		}
		
		else if(age <20) {
			charge = 4000;
			System.out.println("고등학생입니다.");
		}
		else {
			charge = 100000000;
			System.out.println("성인입니다.");
		}
		System.out.println("입장료는" + charge + "원 입니다.");
		
		
		
		
	}
}
