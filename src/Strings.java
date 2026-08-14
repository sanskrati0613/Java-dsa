import java.util.Scanner;
public class Strings {

	public static void main(String[] args) {
		
		String firstName = "Sanskrati";
		String lastName = new String("Jain");
		System.out.println(firstName + " " + lastName);
		String s = "Hello";
		s = s + " World";
		System.out.println(s);
		
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		System.out.println(str);

		String st = sc.next();
		System.out.println(st);
		
		sc.close();
		
		String a = "";
		String b = "   ";
		System.out.println(a.length());
		System.out.println(a.isEmpty());
		System.out.println(b.isEmpty());
		System.out.println(b.isBlank());
		
		String c = "My name is Sanskrati";
		System.out.println(c.substring(3,7));
		
		String d = "My, name, is, Sanskrati";
		String[] e = d.split(",");
		for(String f: e) {
			System.out.println(f);
		}
		
		String name = "Hooh";
		String newName = name.replace('h','n');
		System.out.println(newName);
		
		
	}

}
