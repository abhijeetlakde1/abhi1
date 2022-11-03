package batch14;

public class day3 {
	static int d=15; //static/class var
	int c=220;      //instance var/non static var
	public static void main(String[]args) {
		int g=50; //local var
		System.out.println(g);
		System.out.println(d); //direct call
		System.out.println(day3.d); // classname.datamember
		
		day3 t1=new day3(); //obj
		System.out.println(t1.c);
		// classname referencename=new Classname();
	}
	

}
