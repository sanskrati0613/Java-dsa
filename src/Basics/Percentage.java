package Basics;
import java.util.Scanner;

public class Percentage {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter marks of Subject 1: ");
		int s1 = sc.nextInt();
		
		System.out.print("Enter marks of Subject 2: ");
		int s2 = sc.nextInt();
		
		System.out.print("Enter marks of Subject 3: ");
		int s3 = sc.nextInt();
		
		System.out.print("Enter marks of Subject 4: ");
		int s4 = sc.nextInt();
		
		System.out.print("Enter marks of Subject 5: ");
		int s5 = sc.nextInt();
		
		int min = s1;
		
		if(s2<min) {
			min = s2;
		}
		if(s3<min) {
			min = s3;
		}
		if(s4<min) {
			min = s4;
		}
		if(s5<min) {
			min = s5;
		}
		
		int total = s1+s2+s3+s4+s5-min;
		double percentage = (total/400.0)*100;
		
		System.out.println("Percentage is " + percentage + "%");
		
		sc.close();
		
	}

}
