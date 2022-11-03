package only_practice;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int a=15251;
           int temp=a;
           int rev=0,rem;
           while(temp!=0) {
        	   rem=temp%10;
        	   rev=rev*10+rem;
        	   temp=temp/10;
        	   
           }if(rev==a) {
        	   System.out.println("it is pallindrome no");
           }else {
        	   System.out.println("it is not a pallindrome no");
           }
        	   
        	   
           }
           
	}


