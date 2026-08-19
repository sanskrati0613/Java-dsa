package Basics;

public class Variable {

	public static void main(String[] args) {
		//create //declare
		int age;
		//assign value
		age=10;
		age=11; 
		System.out.println(age);
		
		//define or initialize
		int totalMarks = 120;
		System.out.println(totalMarks);
		
		//Case Sensitive
		int weight = 80;
		int WEIGHT = 90;
		System.out.println(weight);
		System.out.println(WEIGHT);

		//Starting letter
		int marks = 20;
		int Marks = 30;
		int _marks = 40;
		int $marks = 50;
		
		//Subsequent letters
		int height5 = 21;
		int height_ = 21;
		int height$ = 21;
		
		//No reserved Keywords
		//int class = 22;
		int main = 22;	//main is not a reserved keyword
		System.out.println(main);
		
		//camelCase
		int myVariable = 19;
		System.out.println(myVariable);
		
		//constants
		int DAYS_IN_YEAR = 365;
		
		
		
		
		
	}

}
