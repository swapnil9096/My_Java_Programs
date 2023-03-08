package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductRunner {
public static void main(String[] args) {
	Product a=new Product(10,"vishakha");
	Product b=new Product(60,"samrudhi");
	Product c=new Product(40,"swapnil");
	Product d=new Product(50,"pranav");
	
	List<Product> al=new ArrayList<>();
	al.add(a);
	al.add(b);
	al.add(c);
	al.add(d);
	System.out.println(al);

	Collections.sort(al, new AscProduct());
	System.out.println(al);
	
}
}
