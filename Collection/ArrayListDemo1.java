package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public final class ArrayListDemo1 {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		Boolean b = al.add(10);// return type of add method
		System.out.println(b);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);

		// access list element using 5 different ways
		System.out.println(al);

		System.out.println("=".repeat(40));

		for (int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i) + ", ");

		}
		System.out.println();
		System.out.println("=".repeat(40));
		for (Integer x : al) {
			System.out.print(x + " ,");
		}
		System.out.println();

		System.out.println("=".repeat(40));

		Iterator<Integer> li = al.iterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("=".repeat(40));

		ListIterator<Integer> li1 = al.listIterator();
		while (li1.hasNext()) {
			System.out.println(li1.next());
		}
		System.out.println("=".repeat(40));

		while (li1.hasPrevious()) {
			System.out.println(li1.previous());
		}

	}

}
