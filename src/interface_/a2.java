package interface_;

import javax.swing.DefaultBoundedRangeModel;

interface inter1{
	default void m1() {
		System.out.println("m1");
	}
}
	interface inter2 {
		 default void m2() {
			 System.out.println("m2");
			 
		 }
	}
public class a2 implements inter1,inter2 {
	 void m3() {
		 System.out.println("m3");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               a2 z=new a2();
               
               z.m1();
               z.m2();
               z.m3();
	}

}
