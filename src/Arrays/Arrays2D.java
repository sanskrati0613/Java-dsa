package Arrays;
import java.util.Scanner;

public class Arrays2D {

	public static void main(String[] args) {
		
		//declaration
		int [][] arr;
		
		//allocation
		arr = new int [3][4];
		
		//initialize
		int [][] brr = {{1,2},{29,3},{4,7}};
		
		//System.out.println(brr[0][1]);
		
		int rowLength = brr.length;
		int colLength = brr[0].length;
		for(int row=0; row<=rowLength-1; row++) {
			for(int col=0; col<=colLength-1; col++) {
				System.out.print(brr[row][col] + " ");
			}
			System.out.println();
		}
		
		int [][] a = {{1,2},{29,3,4,6},{4,7,9}};
		int rowLen = a.length;
		
		for(int row=0; row<=rowLen-1; row++) {
			int colLen = a[row].length;
			for(int col=0; col<=colLen-1; col++) {
				System.out.print(a[row][col] + " ");
			}
			System.out.println();
		}
		
		
		//Taking input for 2D ragged array
		
		int b [][] = new int [3][];
		b[0] = new int[3];
		b[1] = new int[1];
		b[2] = new int[2];
		
		Scanner sc = new Scanner(System.in);
		for(int row=0; row<b.length; row++) {
			for(int col=0; col<b[row].length; col++) {
				System.out.println("Provide value for row = " + row + ", col = " + col);
				b[row][col] = sc.nextInt();
			}
		}
		for(int row=0; row<b.length; row++) {
			for(int col=0; col<b[row].length; col++) {
				System.out.print(b[row][col] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
