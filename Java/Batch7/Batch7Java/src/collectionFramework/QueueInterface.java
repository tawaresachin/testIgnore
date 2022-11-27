package collectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {

	public static void main(String[] args) {
		Queue q = new LinkedList();
		
		q.add(1);
		q.add("test");
		q.add('A');
		q.add(null);
		q.add(true);
		
		System.out.println("elements in queue: "+q);
		
		//find top element in queue (FIFO- but don't delete)
		Object val = q.peek();
		System.out.println("Top element in queue: "+val);
		System.out.println("Elements in queue after peek: "+q);
		
		//poll operation (retrieve first element & delete from queue)
		Object val1 = q.poll();
		System.out.println("element after first poll: "+ val1);
		System.out.println("Elements in queue after poll: "+q);
	}
}
