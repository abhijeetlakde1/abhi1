package array;

public class a2 {

	public static void main(String[] args) {
		// 2d array
		// declaration
//		int [][]a;
//		int[][] a;
//		int [] [] a;
//		int[][]a;
//		int [][]a;
		
		int[][] a;
		//creation
		
		a=new int[3][4];
		
		//ist[]=row
		//2nd []=colum
		
		//declaration + creation
		
		int[][] b=new int[3][4];
		 // initilization
		b[0][0]=10;
		b[1][3]=40;
		
		System.out.println(b[0][1]); //default 0
		System.out.println(b[1][3]);//40
		
		//declaration+ creation+initilization
		
		int[][] c= {{10,20,30},{11,22,33}};
		System.out.println(c[1][2]);
		
		
		
		

	}

}
