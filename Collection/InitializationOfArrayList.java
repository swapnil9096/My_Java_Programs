package Collection;

import java.util.ArrayList;
import java.util.List;

public class InitializationOfArrayList {

	public static void main(String[] args) {
		List<String> al = new ArrayList<>() {
			{
				add("Pranav");
				add("Abhshek");
				add("Swapnil");

			}
		};

		for (String x : al) {
			System.out.println(x);

		}
		System.out.println("=".repeat(40));
		for (int i = al.size() - 1; i >= 0; i--) {
			System.out.println(al.get(i));
		}
		System.out.println("=".repeat(40));

		List<Integer> al1 = new ArrayList<>(List.of(10, 20, 30, 40, 50));
		al1.add(60);
		for (Integer x : al1)
			System.out.print(x + ", ");
		System.out.println();
		List<Integer> h1 = new ArrayList<>(List.of(22, 33, 44, 55, 66));
		// List<Integer> h2=new ArrayList<>(List.of(22,33,44,55,66));
		List<Integer> h2 = new ArrayList<>() {
			{
				add(22);
				add(33);
				add(44);
				add(55);
				add(66);

			}
		};

		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());
		if (h1.equals(h2)) {
			System.out.println("H1 is equal to H2");
		} else {
			System.out.println("H1 is NOT equal to H2");
		}
	}

}
