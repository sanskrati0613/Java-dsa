package Patterns;

public class NumericalPatterns {

	public static void numericRightTriangle() {
		int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	public static void numericTriangle() {
		int n=5;
		int count=1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}
	}
	
	public static void alphabeticTriangle() {
		int n=5;
		for(int i=1; i<=n; i++) {
			char ch = 'A';
			for(int j=1; j<=i; j++) {
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}
	}
	
	public static void alphabeticReverseTriangle() {
		int n=5;
		for(int i=1; i<=n; i++) {
			char ch = 'E';
			for(int j=1; j<=i; j++) {
				System.out.print(ch + " ");
				ch--;
			}
			System.out.println();
		}
	}
	
	public static void numericPyramid() {
		int n=4;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(j + " ");
			}
			int decRowValue=i-1;
			for(int j=1; j<=i-1; j++) {
				System.out.print(decRowValue + " ");
				decRowValue--;
			}
			System.out.println();
			
		}
	}
	
	public static void alphabeticPyramid() {
		int n=4;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print("  ");
			}
			char ch = 'A';
			for(int j=1; j<=i; j++) {
				System.out.print(ch + " ");
				ch++;
			}
			ch-=2;
			for(int j=1; j<=i-1; j++) {
				System.out.print(ch + " ");
				ch--;
			}
			System.out.println();
			
		}
	}
	
	public static void main(String[] args) {
		
		numericRightTriangle();
		
		numericTriangle();
		
		alphabeticTriangle();
		
		alphabeticReverseTriangle();
		
		numericPyramid();
		
		alphabeticPyramid();

	}

}
