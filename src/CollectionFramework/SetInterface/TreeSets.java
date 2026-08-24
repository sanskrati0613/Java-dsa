package CollectionFramework.SetInterface;

import java.util.TreeSet;
import java.util.Set;

public class TreeSets {

	public static void main(String[] args) {
		Set<Integer> st = new TreeSet<>();
		st.add(40);
		st.add(10);
		st.add(10);
		st.add(20);
		st.add(30);
		System.out.println("Printing entire set: " + st);

	}

}