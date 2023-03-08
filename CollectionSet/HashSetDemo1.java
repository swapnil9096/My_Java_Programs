package CollectionSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo1 {
	// Collections always work on non primitive data type

	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<>();
		// unorder, unique set of elements
		boolean a = s1.add(100);
		System.out.println(a);
		a = s1.add(300);
		System.out.println(a);
		a = s1.add(400);
		System.out.println(a);
		a = s1.add(200);
		System.out.println(a);
		a = s1.add(100);
		System.out.println(a);
		a = s1.add(500);
		System.out.println(a);

		System.out.println(s1);

		for (Integer x : s1)
			System.out.println(x);

		Iterator<Integer> itr = s1.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

	}

}
