package only_practice;



public class swap2 {

	public static void main(String[] args) {
		// swap variable without using 3rd variable
		int a=10;
		int b=20;
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a);
		System.out.println("b="+b);

	}

}
