package collectionsPractice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import typesOfMethod.TestClass;

public class QueuesCollection {

	public static void main(String[] args) {
		Queue q = new LinkedList();
		TestClass test = new TestClass();
		// adding objects 
		q.add(10);
		q.add('A');
		q.add("Batch#6");
		q.add(test);
		q.add(null);
		q.add(false);
		System.out.println(q);
		// remove objects
		q.remove(test);
		System.out.println(q);
		//get size of queue
		int size = q.size();
		System.out.println(size);
		//Iterating queue
		Iterator itr = q.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//Queues operations(FIFO)- Peek, Poll
		Object obj = q.peek();  // for retrieval
		System.out.println(obj);
		
		System.out.println(q);
		Object x = q.poll();	//for deletion
		System.out.println(x);
		System.out.println(q);
	}
}
