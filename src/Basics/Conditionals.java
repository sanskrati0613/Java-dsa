package Basics;
import java.util.Scanner;

public class Conditionals {
	
	public static void main(String[] args) {
		
		//If Statement
		int dailyPractice = 10;
		
		if (dailyPractice >= 6) {
			System.out.println("Good Consistency!");
		}
		
		int age = 19;
		
		if(age>=18) {
			System.out.println("You are eligible to vote");
		}
		
		//If-else Statement
		
		int score = 42;
		
		if(score>=50) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		//If else if 
		
		int marks = 75;
		
		if(marks>=90) {
			System.out.println("Grade A");
		}
		else if(marks>=70 && marks<90){
			System.out.println("Grade B");
		}
		else {
			System.out.println("Fail");
		}
		
		//Nested if else
		
		boolean hasSubscription = true;
		int practicedProblems = 200;
		
		if(hasSubscription) {
			if(practicedProblems>=150) {
				System.out.println("unlocked advanced sheet");
			}
			else {
				System.out.println("practice more");
			}
		}
		else {
			System.out.println("upgrade to premium");
		}
		
		//Ternary operator
		
		int streak = 35;
		
		String status = (streak>=30) ? "Consistent" : "Irregular";
		System.out.println(status);
		
		//Switch
		
		System.out.println("Enter the value of day: ");
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		
		switch(day) {
		case 1: 
			System.out.println("Monday");
			break;
		case 2: 
			System.out.println("Tuesday");
			break;
		case 3: 
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		default:
			System.out.println("Weekend");
		}
		
		sc.close();
		
		
	}
}
