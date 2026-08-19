package Basics;

public class DataTypes {
	
	public static void main(String[] args) {
		
		//Numeric DT - short, byte, int, long
		
		byte num1 = 127;
		//byte num2 = 500;	//Out of range
		System.out.println(num1);
		//System.out.println(num2);
		
		short num2 = 32767;
		System.out.println(num2);
		
		int num3 = 50000;
		System.out.println(num3);
		long num4 = 736483757;
		System.out.println(num4);
		
		//Floating DT
		float num5 = 3.14f;
		System.out.println(num5);
		
		double num6 = 3.14123913;
		System.out.println(num6);
		
		// Char, Boolean
		boolean eligibleToVote = true;
		System.out.println(eligibleToVote);
		
		char ch = 'a';
		System.out.println("My first character is " + ch);
		System.out.println("My first character is " + (char)(ch+2) );
		
		//Implicit type conversion
		byte num7 = 127;
		long newNum7 = num7;
		System.out.println(newNum7);
		
		//Explicit type conversion
		long value1 = 123456778;
		int value2 =(int)value1;
		System.out.println(value2);
		
	}
	
}
