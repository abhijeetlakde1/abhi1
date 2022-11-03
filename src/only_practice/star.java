
package only_practice;

public class star {

	public static void main(String[] args) {
		// star pattern program
		for(int x=1;x<=5;x++) {
			
			for(int y=4;y>=x;y--) {
				System.out.print(" ");
			}
			for(int z=1;z<=x;z++) {
				System.out.print(" *");
			}
			System.out.println();
		}

	}

}
