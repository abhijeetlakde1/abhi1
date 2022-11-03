package batch14;

public class day4 {
	int a=10;
	static int b=20;
	
	public void m1() {
		System.out.println("i am method m1");
	}
		public static void m2() {
			System.out.println("i am method m2");
		}
			
	    public static void addition(int a, int b) {
	    	System.out.println(a+b);
	}

	public static void main(String[] args) {
	 
		System.out.println(day4.b);
		 day4.m2();
		 day4 t=new day4();
		 System.out.println(t.a);
		 t.m1();
		 day4.addition(10,10);
		 day4.addition(20,20);
		

	}

}
