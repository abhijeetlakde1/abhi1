package only_practice;

public class reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method 
String A="chnandrashekhar";
String rev="";
   for(int i=A.length()-1;i>=0;i--) {
	   
	   rev=rev+A.charAt(i);   
	   
   }
   System.out.println(rev);

	}

}
