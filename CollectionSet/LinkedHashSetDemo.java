package CollectionSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		Set<Integer> s1= new LinkedHashSet<>();
		s1.add(100);
		s1.add(200);
		s1.add(300);
		s1.add(150);
		s1.add(700);
		s1.add(200);
		s1.add(800);
		
		
		System.out.println(s1);
		
		// oder and unique element
		//Duplicate is not allowed
		
	}

}
