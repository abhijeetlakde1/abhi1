package krare;

public class check_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a=19;
         int b=0;
         for(int i=2;i<=a-1;i++) {
        	 if(a%i==0) {
        		 b=b+1;
        	 }
        	 if(b>0) {
        		 System.out.println("it is not a prime no");
        		 
        	 }else {
        		 System.out.println("it is prime no");
        	 }
         }
         
         
	}

}
