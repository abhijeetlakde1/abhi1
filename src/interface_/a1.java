package interface_;

interface inter{
	
	void m1();  //by default it will consider a public abstract 
	
	int a=10; //by default it will consider as public static final
	
	// java 8th version
  default void m2() {
	  
  }
  static void m3() {  //by default it will consider as public
	  
  }
  //java 9th version
  private void m4() {
	  
  }
  
  
}




public class a1 implements inter {
	
	public void m1() {
		System.out.println("i am m1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a1 z=new a1();
		
          z.m1();
          z.m2();
          
          
	}

}
