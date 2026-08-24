package CollectionFramework.SetInterface;

import java.util.HashSet;
import java.util.Set;

public class HashSets {

	public static void main(String[] args) {
		Set<Integer> st1 = new HashSet<>();
		st1.add(10);
		st1.add(10);
		st1.add(10);
		st1.add(20);
		st1.add(30);
		System.out.println("Printing entire set1: " + st1);
		
		Set<Integer> st2 = new HashSet<>();
		st2.add(10);
		st2.add(20);
		st2.add(20);
		st2.add(20);
		st2.add(40);
		st2.add(50);
		System.out.println("Printing entire set2: " + st2);
		
		st1.retainAll(st2);
		
		System.out.println("Printing entire set1 later: " + st1);
		System.out.println(st1.containsAll(st2));
		System.out.println(st2.containsAll(st1));
		
		
		HashSet<Student> set = new HashSet<>();
		
		Student s1 = new Student(1,"Noon");
		Student s2 = new Student(1,"Noon");
		Student s3 = new Student(1,"Noon");
		set.add(s1);
		set.add(s2);
		set.add(s3);
		System.out.println(set);
	}

}
