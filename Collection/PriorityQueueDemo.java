package Collection;

import java.util.PriorityQueue;

/*PriorityQueue doesn’t permit null.
We can’t create a PriorityQueue of Objects that are non-comparable
The head of this queue is the least element with respect to the specified ordering. If multiple elements are tied for the least value, the head is one of those elements — ties are broken arbitrarily.
Since PriorityQueue is not thread-safe, java provides PriorityBlockingQueue class that implements the BlockingQueue interface to use in a java multithreading environment.
The queue retrieval operations poll,  remove,  peek, and element access the element at the head of the queue.
It inherits methods from Collection, and Object class.
 */
public class PriorityQueueDemo {

	public static void main(String[] args) {
		// Creating empty priority queue
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		// Adding items to the pQueue using add()
		pq.add(9);
		pq.add(3);
		pq.add(8);
		pq.add(1);//tip
		pq.add(6);
		
		System.out.println(pq);
		// Printing the top element of PriorityQueue
		System.out.println(pq.peek());//1
		// Printing the top element and removing it
		// from the PriorityQueue container
		System.out.println(pq.poll());
		System.out.println(pq);
		
		// Printing the top element again
		System.out.println(pq.peek());//only pointing tip element
		System.out.println(pq);
		
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
