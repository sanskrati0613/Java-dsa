package CollectionFramework.QueueInterface;

import java.util.Queue;
import java.util.PriorityQueue;

public class PriorityQueues {

	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<>();  //Priority to lowest number default behavior
		Queue<Integer> p = new PriorityQueue<>((a,b)->b-a);  //Priority to highest number
		pq.offer(40);
		pq.offer(20);
		pq.offer(10);
		pq.offer(30);
		System.out.println("Printing entire queue(default): " + pq);
		System.out.println(pq.poll());
		System.out.println("Printing entire queue(default): " + pq);
		
		p.offer(40);
		p.offer(20);
		p.offer(10);
		p.offer(30);
		System.out.println("Printing entire queue: " + p);
		System.out.println(p.poll());
		System.out.println("Printing entire queue: " + p);
	}

}
