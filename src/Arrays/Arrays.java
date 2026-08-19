package Arrays;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		//declaration
		int arr[];
		//allocation
		arr = new int[5];
		//initialize
		int brr[] = {10,20,30};
		
		//System.out.println("Value at index 0 is " + brr[0]);
		
		int n = brr.length;
		for(int index=0; index<=n-1; index++) {
			System.out.println(brr[index]);
		}
		
		//for each loop
		int a[] = {39,56,76,34};
		for(int val: a) {
			System.out.println(val);
		}
		
		//Take input in array
		int b[] = new int[4];
		int N = b.length;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<=N-1; i++) {
			System.out.println("Provide input for index " + i);
			b[i] = sc.nextInt();
		}
		for(int val: b) {
			//System.out.println(val);
			sum += val;
		}
		System.out.println("Sum is: " + sum);
		
		sc.close();
		
		//Maximum of array
		
		int c[] = {23, 65, 34, 78, 24};
		int max = c[0];
		
		for(int val: c) {
			if(val > max) {
				max = val;
			}
		}
		System.out.println("Maximum is: " + max);
	}

}
