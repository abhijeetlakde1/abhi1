package krare;

public class star1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int y;
		int z;
           for(x=1;x<=5;x++) {
        	   for(y=5;y>=x;y--) {
        		   System.out.print(" ");
        	   }
        	   for(z=1;z<=x;z++) {
        		   System.out.print(" *");
        	   }
        	   System.out.println();
           }
	}

}
