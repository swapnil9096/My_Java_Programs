package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListFunctions {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>(List.of(1, 2, 3, 4, 5));
		Integer preValue = li.remove(0);
		System.out.println(preValue);// 1
		System.out.println(li);//
		Integer obj = 2;
		boolean res = li.remove(obj);
		System.out.println(res);
		System.out.println(li);
		li.clear();
		System.out.println(li.isEmpty());
		li.add(900);
		System.out.println(li.isEmpty());
		
		List<Integer> li1 = new ArrayList<>(List.of(30,40,50,60));
System.out.println(li);
System.out.println(li1);
li.add(500);
li.add(1000);
li.add(900);


li.addAll(1,li1);
System.out.println(li);
Collections.sort(li);
System.out.println(li);
Collections.reverse(li1);
System.out.println(li);
li.add(100);
System.out.println(li);
System.out.println("100 occurrs n time: " + Collections.frequency(li, 100));
System.out.println("1000 occurrs n time: " + Collections.frequency(li,1000));

System.out.println("min : " + Collections.min(li));
System.out.println("min : " + Collections.max(li));

System.out.println("al.contains(1000) : " + li.contains(1000));
System.out.println("al.contains(10000) : " + li.contains(10000));

System.out.println("li : " + li);
System.out.println("li1 : " + li1);

System.out.println("al.containsAll(al1): " + li.containsAll(li1));

Object[] arr= li.toArray();
for(Object x: arr)
	System.out.println(x);

















	}

}
