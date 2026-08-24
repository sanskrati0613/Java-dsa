package CollectionFramework.ListInterface;

import java.util.Collection;
import java.util.List;
import java.util.LinkedList;

import java.util.Iterator;
import java.util.Collections;

public class LinkedLists {

	public static void main(String[] args) {
		//Collection or List -> interfaces
		
				//LinkedList -> concrete class
				LinkedList<Integer> list = new LinkedList<>();
				List<Integer> list2 = new LinkedList<>();
				Collection<Integer> collection = new LinkedList<>();
				
				list.add(10);
				list.add(20);
				list.add(30);
				System.out.println(list);
				list.remove(0);
				System.out.println(list);
				
				list2.add(101);
				list2.add(102);
				
				list.addAll(list2);
				System.out.println(list);
				list.removeAll(list2);
				System.out.println(list);
				System.out.println(list.size());
				System.out.println(list2);
				list2.clear();
				System.out.println(list2.size());
				
				Iterator<Integer> iterator = list.iterator();
				while(iterator.hasNext()) {
					System.out.println("Element: " + iterator.next());
				}
				
				list2.add(11);
				list2.add(12);
				list2.add(13);
				System.out.println(list2.get(0));
				list2.set(0, 100);
				System.out.println(list2.get(0));
				
				list2.toArray();
				
				System.out.println(list.contains(20));
				
				LinkedList<Integer> a = new LinkedList<>();
				a.add(20);
				a.add(10);
				a.add(12);
				a.add(20);
				a.add(6);
				System.out.println("Before sorting: " + a);
				Collections.sort(a);
				System.out.println("After sorting: " + a);
				Collections.sort(a, Collections.reverseOrder());
				System.out.println("After sorting in desc : " + a);
				
				LinkedList<Integer> newlist = (LinkedList<Integer>)a.clone();
				System.out.println("Printing entire new list: " + newlist);

				
				System.out.println(newlist.isEmpty());
				System.out.println(newlist.indexOf(40));
				System.out.println(newlist.indexOf(10));
				
				LinkedList<Integer> b = new LinkedList<>();
				b.add(20);
				b.add(10);
				b.add(12);
				b.add(20);
				b.add(6);
				b.add(20);
				b.add(20);
				System.out.println("Printing entire list: " + b);
				
				System.out.println(b.lastIndexOf(20));
				
				b.addFirst(1);
				System.out.println("Printing entire list: " + b);
				b.addLast(1);
				System.out.println("Printing entire list: " + b);
				b.removeFirst();
				b.removeLast();
				b.remove(0);
				System.out.println("Printing entire list: " + b);
				System.out.println(b.getFirst());
				System.out.println(b.getLast());
				System.out.println(b.peek());
				System.out.println(b.poll());
				System.out.println("Printing entire list after polling: " + b);
				b.offer(5);
				System.out.println("Printing entire list: " + b);
	}

}
