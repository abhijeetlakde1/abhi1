package only_practice;

public class leap_year2 {

	public static void main(String[] args) {
		// leap year small program
		int year=2016;
		if((year%400==0) || (year%4==0 && year%100!=0)) {
		System.out.println("its a leap year");
		}else {
			System.out.println("its not a leap year");
		}

	}

}
