package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionDemo {
	public static void main(String[] args) {
		List al = new ArrayList();

		al.add(10);
		al.add(true);
		al.add(12.3f);
		al.add(23.23);
		al.add('a');
		al.add("String");

		System.out.println(al);

		ArrayList<Integer> al1 = new ArrayList() {
			{
				add(10);
				add(20);
				add(30);
				add(40);
			}
		};

		ArrayList<Integer> al2 = new ArrayList() {
			{
				add(60);
				add(70);

			}
		};
		al2.addAll(2, al1);
		System.out.println(al2);

		ArrayList<String> list = new ArrayList<String>();
		list.add("ravi");
		list.add("Swapnil");
		list.add("vishakha");

		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

		list.add(1, "Vishakha");
		System.out.println(list);

		list.add(1, "virat");
		System.out.println(list);

		list.set(2, "kolhi");
		System.out.println(list);

		list.contains(itr);
		System.out.println(list);

		list.remove(0);
		System.out.println(list);
		list.remove("Vishakha");
		System.out.println(list);

		System.out.println(list.size());

		System.out.println(al1);

		for (int x : al1)
			System.out.println(x);
		System.out.println("==".repeat(40));

		for (int i = 0; i <= al1.size() - 1; i++)
			System.out.println(al1.get(i));
		System.out.println("=".repeat(40));

		for (int i = al1.size() - 1; i >= 0; i--)
			System.out.println(al1.get(i));

	}
}
