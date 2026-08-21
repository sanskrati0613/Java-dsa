package OOP;

public class Calculator {

	int add(int a, int b) {
		return a+b;
	}
	
	//overloading add
	int add(int a, int b, int c) {
		return a+b+c;
	}
	
	double add(int a, int b , double c){
		return a+b+c;
	}
	
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.add(2, 3));
		System.out.println(c.add(2, 3, 7));
		System.out.println(c.add(2, 3, 7.6));
	}
	
}

