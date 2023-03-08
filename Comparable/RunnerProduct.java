package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RunnerProduct {
	public static void main(String[] args) {
		Product a = new Product(100, "vishakha");
		Product b = new Product(199, "samrudhi");
		Product c = new Product(111, "rakhi");
		Product d = new Product(186, "priyanka");
		
		List<Product> al=new ArrayList<>();
		al.add(a);
		al.add(b);
		al.add(c);
		al.add(d);
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al); 
		
	}
}
