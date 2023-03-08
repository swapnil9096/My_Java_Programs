package Stack;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer> sl = new Stack();
		sl.push(10);
		sl.push(20);
		sl.push(30);
		sl.push(40);

		System.out.println(sl);
		System.out.println(sl.pop());
		System.out.println(sl);
		System.out.println(sl.peek());
		System.out.println(sl);

		System.out.println(sl.search(40));

	}
}
