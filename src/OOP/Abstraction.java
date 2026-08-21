package OOP;

	abstract class Bird{
		abstract void fly();
		
		abstract void eat();
	}
	
	class Sparrow extends Bird{
		void fly() {
			System.out.println("Sparrow flying");
		}
		
		void eat() {
			System.out.println("Sparrow eating");
		}
	}
	
	class Crow extends Bird{
		void fly() {
			System.out.println("Crow flying");
		}
		
		void eat() {
			System.out.println("Crow eating");
		}
	}
	
public class Abstraction {
	public static void main(String[] args) {
		Bird b = new Sparrow();
		b.eat();
		b.fly();
		
		b = new Crow();
		b.eat();
		b.fly();
	}
}
