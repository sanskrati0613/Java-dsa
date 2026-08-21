package OOP;

interface Fish{
	void swim();
	
	void lost();
}

class Dolphin implements Fish{
	public void swim() {
		System.out.println("Dolphin swimming");
	}
	
	public void lost() {
		System.out.println("Dolphin lost");
	}
}

class Nemo implements Fish{
	public void swim() {
		System.out.println("Nemo swimming");
	}
	
	public void lost() {
		System.out.println("Nemo lost");
	}
}

public class Interfaces {
	public static void doFishStuff(Fish f) {
		f.swim();
		f.lost();
		f.swim();
		f.lost();
		f.swim();
		f.lost();
	}
	public static void main(String[] args) {
		Fish f = new Dolphin();
		doFishStuff(f);
		f = new Nemo();
		doFishStuff(f);
	}
}

