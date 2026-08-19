package Functions;

public class Methods {
	
	public static void printTable() {
		for(int i=1; i<=10;i++) {
			int ans = 2 * i;
			System.out.println("-> " + ans);
		}
	}
	
	public static void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	public static int multiply(int a, int b) {
		int product = a*b;
		return product;
	}
	
	public static int multiply(int a, int b, int c) {
		int product = a*b*c;
		return product;
	}
	
	public static void solve(int num) {
		System.out.println("inside solve: " + num);
		num = num*10;
		System.out.println("inside solve: " + num);
	}
	
	public static int getMaximum(int a, int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	
	public static float calculatePercentage(int obtained, int total) {
		float percentage = ((float)obtained/total)*100;
		return percentage;
	}
	
	public static void main(String[] args) {
		System.out.println("Table of 2");
		printTable();
		System.out.println("Bye");
		
		sum(2, 3);
		
		int result = multiply(5, 2);
		System.out.println(result);
		
		int result2 = multiply(5, 2, 6);
		System.out.println(result2);
		
		int num = 5;
		System.out.println("inside main: " + num);
		solve(num);
		System.out.println("inside main: " + num);
		
		int max = getMaximum(4, 6);
		System.out.println(max);
		
		float scored = calculatePercentage(250, 500);
		System.out.println(scored);
	}

}
