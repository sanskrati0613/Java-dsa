package Basics;

public class Operators {

	public static void main(String[] args) {
		//Arithmetic
		int a = 25;
		int b = 15;
		
		int total = a+b;
		int difference  = a-b;
		int product = a*b;
		int division = a/b;
		int modulo = a%b;
		
		System.out.println(total);
		System.out.println(difference);
		System.out.println(product);
		System.out.println(division);
		System.out.println(modulo);
		
		//Relational
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		
		//Logical
		boolean completedDSA = false;
		boolean completedCore = true;
		
		System.out.println(completedDSA && completedCore);
		System.out.println(completedDSA || completedCore);
		System.out.println(!completedCore);
		
		//Unary
		int activeUsers = 100;
		
		int prefix = ++activeUsers;
		int postfix = activeUsers++;
		
		System.out.println(prefix);
		System.out.println(postfix);
		System.out.println(activeUsers);

	}

}
