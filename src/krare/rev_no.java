package krare;

public class rev_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              int a=1856;
              int rem;
              int rev=0;
              while(a!=0){
            	  rem=a%10;
            	  rev=rev*10+rem;
            	  a=a/10;
            	  
              }System.out.println(rev);
	}

}
