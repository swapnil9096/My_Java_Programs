package Collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueIterableDemo {

	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("virat");
		pq.add("rohit");
		pq.add("surya");
		pq.add("hardik");

		System.out.println(pq);

		System.out.println(pq.element());
		System.out.println("==".repeat(50));
		
		Iterator<String> it = pq.iterator();
		while (it.hasNext())
		System.out.println(it.next());
		// Retrieves and removes the head of this queue, it throws an exception if queue
		// is empty.
		pq.remove();// it removes tip of elements
		System.out.println(pq);
		System.out.println("==".repeat(50));

		// After removing tip element
		Iterator<String> it2 = pq.iterator();
		while (it2.hasNext())
			System.out.println(it.next());// Concurrent Modification Exception

	}

}
