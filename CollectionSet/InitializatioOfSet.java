package CollectionSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InitializatioOfSet {
	public static void main(String[] args) {

		Set<Integer> s1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
		Set<Integer> s2 = new HashSet<>(Arrays.asList(1, 2, 3));
		// ArrayList=> preservs order, duplicate allowed, 1/many null allowed,
		// heterogeneous data type, dynamically grow/shrik
		// ArrayList=> insertion to the last element,reading
		// LinkedList=> do not use AL: insertion in middle of the AL, deletion/updation
		// of element in the middle of AL

		List<Integer> al = new ArrayList<>(List.of(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9));
		Set<Integer> s3 = new HashSet(al);
		System.out.println(s3);

		Set<Integer> s4 = new HashSet<>(List.of(10, 20, 30));
		Set<Integer> s5 = new HashSet<>(s4);

		System.out.println(s4);
		System.out.println(s5);

		s1.removeAll(s2);// s1-s2 remove common elemets
		System.out.println("S1: " + s1);// 4 5

		s1.retainAll(s2);// common elements betw s1 s2 1 2 3
		System.out.println("S1: " + s1);

		System.out.println(s1.isEmpty());

	}
}
