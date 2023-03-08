package CollectionSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSEtDemo {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(400);
		set.add(100);
		set.add(null);
		set.add(null); /// null does not have any data type, true/false: literals

		
		Iterator<Integer> itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		System.out.println(set);
		System.out.println(set.getClass().getName());
		
		List<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(20);
		System.out.println("al: " + al);
		
		Set<Integer>  set1=new HashSet<>(al);//to find unique nobs
		System.out.println(set1);
		
		
		
		
		
		
		
	}

}
