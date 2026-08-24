package CollectionFramework.ListInterface;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

import java.util.Iterator;
import java.util.Collections;


public class ArrayLists {
	public static void main(String[] args) {
		//Collection or List -> interfaces
		
		//ArrayList -> concrete class
		ArrayList<Integer> arr = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		Collection<Integer> collection = new ArrayList<>();
		
		arr.add(10);
		arr.add(20);
		arr.add(30);
		System.out.println(arr);
		arr.remove(0);
		System.out.println(arr);
		
		list.add(101);
		list.add(102);
		
		arr.addAll(list);
		System.out.println(arr);
		arr.removeAll(list);
		System.out.println(arr);
		System.out.println(arr.size());
		System.out.println(list);
		list.clear();
		System.out.println(list.size());
		
		Iterator<Integer> iterator = arr.iterator();
		while(iterator.hasNext()) {
			System.out.println("Element: " + iterator.next());
		}
		
		list.add(11);
		list.add(12);
		list.add(13);
		System.out.println(list.get(0));
		list.set(0, 100);
		System.out.println(list.get(0));
		
		list.toArray();
		
		System.out.println(arr.contains(20));
		
		ArrayList<Integer> a = new ArrayList<>();
		a.add(20);
		a.add(10);
		a.add(12);
		a.add(6);
		System.out.println("Before sorting: " + a);
		Collections.sort(a);
		System.out.println("After sorting: " + a);
		Collections.sort(a, Collections.reverseOrder());
		System.out.println("After sorting in desc : " + a);
		
		ArrayList<Integer> newlist = (ArrayList<Integer>)a.clone();
		System.out.println("Printing entire new list; " + newlist);
		
		newlist.ensureCapacity(100);
		
		System.out.println(newlist.isEmpty());
		System.out.println(newlist.indexOf(40));
		System.out.println(newlist.indexOf(10));
	}
}
