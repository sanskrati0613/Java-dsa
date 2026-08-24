package CollectionFramework.QueueInterface;

import java.util.Deque;
import java.util.ArrayDeque;

public class ArrayDeques {

	public static void main(String[] args) {
		Deque<Integer> q = new ArrayDeque<>();
		q.add(10);
		q.offer(20);
		q.offerFirst(0);
		q.offerLast(30);
		
		System.out.println("Printing entire queue: " + q);
		System.out.println(q.peek());
		System.out.println("Removing: " + q.pollFirst());
		System.out.println("Removing: " + q.pollLast());
		System.out.println("Printing entire queue: " + q);
		System.out.println(q.size());
	}

}
