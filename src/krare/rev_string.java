package krare;

public class rev_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             String a="abhijeet";
             String rev="";
             System.out.println(a.length());
             for(int i=a.length()-1;i>=0;i--) {
            	 rev=rev+a.charAt(i);
             }
             System.out.println(rev);
	}

}
