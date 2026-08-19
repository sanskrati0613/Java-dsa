package Patterns;

public class SolidPatterns {
	
	public static void solidSquare() {
		int n= 4;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void solidRectangle() {
		 int n=3;
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=5; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
	}
	 
	public static void solidRightTriangle() {
		int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void solidRhombus() {
		int n=5;
		for(int i = 1; i<=n; i++) {
				for(int j=1; j<=n-i; j++) {
					System.out.print(" ");
				}
			
				for(int j=1; j<=n; j++) {
					System.out.print("* ");
				}
				System.out.println();
		
		}
	}
	
	public static void InvertedRightTriangle() {
		int n=5;
		for( int i=1; i<=5; i++) {
			for(int j=1; j<=n-i+1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void solidPyramid() {
		int n=5;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("* ");
			}
//			for(int j=1; j<=i-1; j++) {
//				System.out.print("* ");
//			}
			System.out.println();
		}
	}
	
	public static void solidInvertedPyramid() {
		int n=4;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i-1; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=2*n-2*i+1; j++) {
				System.out.print("* ");
			}
//			for(int j=1; j<=n-i+1; j++) {		//Using one loop instead of two
//				System.out.print("* ");
//			}
//			for(int j=1; j<=n-i; j++) {
//				System.out.print("* ");
//			}
			
			System.out.println();
		}
	}
	
	public static void solidDiamond() {
		int n=4;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=2; i<=n; i++) {
			for(int j=1; j<=i-1; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=2*n-2*i+1; j++) {
				System.out.print("* ");
			}	
			System.out.println();
		}
	}
	
	public static void solidHourGlass() {
		int n=4;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i-1; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=2*n-2*i+1; j++) {
				System.out.print("* ");
			}	
			System.out.println();
		}
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void solidButterFly() {
		int n=4;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			for(int j=1; j<=2*n-2*i; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for( int i=1; i<=n; i++) {
			for(int j=1; j<=n-i+1; j++) {
				System.out.print("* ");
			}
			for(int j=1; j<=2*i-2; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=n-i+1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		
		solidSquare();

		solidRectangle();
        
		solidRightTriangle();
        
		solidRhombus();
		
		InvertedRightTriangle(); 
		
		solidPyramid();
		
		solidInvertedPyramid();
		
		solidDiamond();
		
		solidHourGlass();
		
		solidButterFly();
		
	}

}
