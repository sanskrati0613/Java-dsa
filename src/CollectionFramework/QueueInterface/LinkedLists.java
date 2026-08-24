package CollectionFramework.QueueInterface;

import java.util.Queue;
import java.util.LinkedList;

public class LinkedLists {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(10);
		q.offer(20);
		q.offer(30);
		
		System.out.println("Printing entire queue: " + q);
		System.out.println(q.peek());
		System.out.println("Removing: " + q.poll());
		System.out.println("Printing entire queue: " + q);
	}

}
