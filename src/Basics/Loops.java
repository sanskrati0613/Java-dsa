package Basics;

public class Loops {

	public static void main(String[] args) {
		
		//For loop
		
		for(int i=1; i<=5; i++) {
			System.out.println("Value " + i);
		}
		for(int i=1; i<5; i++) {
			System.out.println("Sanskrati");
		}
		for(int i=1; i<=10; i+=2) {
			System.out.println(i);
		}
		
		//Nested loop
		
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				System.out.println("i is " + i + ", j is " + j);
			}
		}
		
		//Break
		
		for(int i=1; i<=10; i++) {
			if(i == 5) {
				break;
			}
			System.out.println(i);
		}
		
		//Continue
		
		for(int i=1; i<=10; i++) {
			if(i == 5) {
				continue;
			}
			System.out.println(i);
		}
		
		//While loop
		
		int i=1;
		while(i<=5) {
			System.out.println("Noon");
			i++;
		}
		
		//Nested while loop
		
		int j=1;
		while(j<=2) {
			int k=1;		//Update for each row
			while(k<=3) {
				System.out.println("j is " + j + ", k is " + k);
				k++;
			}
			j++;
		}
		
		//Do while loop
		
		int e=1;
		do {
			System.out.println(e);
			e++;
		}while(e<1);
		
		//Practice
		
		for(int num=50; num<=100; num++) {
			if(num%7 == 0) {
				System.out.println(num);
			}
		}
		
		//Prime
		
		for(int p=2; p<=100; p++) {
			int count=0;
			for(int q=2; q<p; q++) {
				if(p%q == 0) {
					count++;
				}
			}
			if(count == 0) {
				System.out.println(p);
			}
		}
		
		//Multiples of  n
		
		int n=2;
		for(int r=1; r<=10; r++){
			System.out.print(r * n + " ");
		}

	}

}
