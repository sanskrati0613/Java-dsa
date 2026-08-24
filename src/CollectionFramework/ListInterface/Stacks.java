package CollectionFramework.ListInterface;

import java.util.Collection;
import java.util.List;
import java.util.Stack;

import java.util.Iterator;
import java.util.Collections;


public class Stacks {
	public static void main(String[] args) {
		//Collection or List -> interfaces
		
		Stack<Integer> arr = new Stack<>();
		List<Integer> list = new Stack<>();
		Collection<Integer> collection = new Stack<>();
		
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
		
		Stack<Integer> a = new Stack<>();
		a.add(20);
		a.add(10);
		a.add(12);
		a.add(6);
		System.out.println("Before sorting: " + a);
		Collections.sort(a);
		System.out.println("After sorting: " + a);
		Collections.sort(a, Collections.reverseOrder());
		System.out.println("After sorting in desc : " + a);
		
		Stack<Integer> newStack = (Stack<Integer>)a.clone();
		System.out.println("Printing entire new list; " + newStack);
		
		newStack.ensureCapacity(100);
		
		System.out.println(newStack.isEmpty());
		System.out.println(newStack.indexOf(40));
		System.out.println(newStack.indexOf(10));
		
		newStack.push(10);
		System.out.println("Printing entire new list; " + newStack);
		newStack.pop();
		System.out.println("Printing entire new list; " + newStack);
		System.out.println(newStack.search(12));
	}
}


