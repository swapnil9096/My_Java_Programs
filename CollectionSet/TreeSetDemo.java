package CollectionSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	// set - ASC order + unique = treesets
	public static void main(String[] args) {
		Set<Integer> s1 = new TreeSet<>();

		s1.add(400);
		s1.add(300);
		s1.add(203);
		s1.add(900);
		s1.add(700);
		s1.add(400);
		s1.add(100);
		s1.add(600);

		System.out.println(s1);
		

	}

}
