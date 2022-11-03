package only_practice;

public class leap_year {

	public static void main(String[] args) {
		// for leap year it should be divisible by 400 or divisible by 4 but should notbe divisible by 100
		int year=2037;
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					System.out.println("its a leap year");
				}else {
					System.out.println("its not a leap year");
				}
			
			}else {
				System.out.println("its a leap year");
			}
			
		}else {
			System.out.println("its not a leap year");
		}

	}

}
