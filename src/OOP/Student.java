package OOP;

public class Student {

	//Attributes
	public int id;
	public int age;
	public String name;
	public int nos;
	
	//Default constructor
	public Student() {
		System.out.println("Student default constructor called");
	}
	
	//Parameterized constructor
	public Student(int id, int age, String name, int nos) {
		System.out.println("Student parameterised constructor called");
		this.id = id;
		this.age= age;
		this.name = name;
		this.nos = nos;
	}
	
	//Copy constructor
	public Student(Student srcobj) {
		System.out.println("Student copy constructor called");
		this.id = srcobj.id;
		this.age= srcobj.age;
		this.name = srcobj.name;
		this.nos = srcobj.nos;
	}
	
	//Methods Behaviors
	public void study() {
		System.out.println(name + " Studying");
	}
	
	public void sleep() {
		System.out.println(name + " Sleeping");
	}
	
	public void bunk() {
		System.out.println(name + " Bunking");
	}
	
	
	public static void main(String[] args) {
		//Default constructor
		Student A = new Student();
		A.id = 1;
		A.age = 14;
		A.name = "Noon";
		A.nos = 8;
		System.out.println(A.name);
		System.out.println(A.age);
		System.out.println(A.id);
		System.out.println(A.nos);
		
		A.bunk();
		A.study();
		A.sleep();
		
		
		//Parameterized constructor
		Student B = new Student(1, 22, "Sanskrati", 6);
		System.out.println(B.name);
		System.out.println(B.age);
		System.out.println(B.id);
		System.out.println(B.nos);
		
		B.bunk();
		B.study();
		B.sleep();
		
		//Copy constructor
		Student C = new Student(A);
		System.out.println(C.name);
		System.out.println(C.age);
		System.out.println(C.id);
		System.out.println(C.nos);
		
		
		C.bunk();
		C.study();
		C.sleep();
	}
	
}
