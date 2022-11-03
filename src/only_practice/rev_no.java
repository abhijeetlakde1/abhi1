package only_practice;

public class rev_no {

	public static void main(String[] args) {
		// reverse a no
		int a=1536;
		int rem;
		int rev=0;
		while (a!=0) {
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		System.out.println(rev);
		}

	}


