package Collection;

import java.util.ArrayList;

public class ArrayListMethods {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		ArrayList<Integer> al2 = new ArrayList<>();
		al2.add(500);
		al2.add(5000);

		al.add(1, 100);
		System.out.println(al);
		al.addAll(0, al2);
		al.addAll(al.size(), al2);
		System.out.println(al);

		Integer h = al.remove(0);
		System.out.println(h);
		System.out.println(al);

		Integer o = 100;
		boolean b = al.remove(o);
		System.out.println(b);
		System.out.println(al);

		o = 200;
		b = al.remove(o);
		System.out.println(b);
		System.out.println(al);

		Integer pEle = al.set(1, 300);
		System.out.println(pEle);
		System.out.println(al);

	}
}
