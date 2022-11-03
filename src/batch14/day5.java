package batch14;

public class day5 {

	public static void Addition(int a,int b) {
		//int g=10;
		//int h=20;
		System.out.println(a+b);
	}
	public void Substraction(int a,int b) {
		System.out.println(a-b);
	}
	public void multiplication(int a,int b) {
		System.out.println(a*b);
	}
	public static void division(int a,int b) {
		
		System.out.println(a/b);
	}
	public static void main(String[] args) {
//		System.out.println(g+h);
		day5 test=new day5();
		test.Addition(40,10);
		test.Substraction(50,10);
		test.multiplication(8,10);
		test.division(20,2);
	
		
	}

}
