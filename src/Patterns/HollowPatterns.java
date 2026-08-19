package Patterns;

public class HollowPatterns {
	
	public static void hollowRectangle() {
		int row = 4;
		int col = 6;
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=col; j++) {
				if(i==1 || j==1 || i==row || j==col) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public static void hollowRightTriangle() {
		int n = 5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				if(i==n || j==1 || i==j) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public static void hollowPyramid() {
//		int n=5;
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=n-i; j++) {
//				System.out.print("  ");
//			}
//			if(i==1 || i==n) {
//				for(int j=1; j<=2*i-1; j++) {
//				System.out.print("* ");
//				}
//			}
//			else {
//				System.out.print("* ");
//				for(int j=1; j<=2*i-3; j++) {
//					System.out.print("  ");
//				}
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=2*n-1; j++) {
				if(j==1 || j==2*i-1 || i==n) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public static void hollowDiamond() {
		int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=2*n-1; j++) {
				if(j==1 || j==2*i-1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for(int i=1; i<=n-1; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("  ");
			}
			if(i==n-1) {
				System.out.print("* ");
			}else {
				System.out.print("* ");
				for(int j=1; j<=2*(n-i)-3; j++) {
					System.out.print("  ");
				}
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		hollowRectangle();
		
		hollowRightTriangle();
		
		hollowPyramid();
		
		hollowDiamond();
		
	}

}
