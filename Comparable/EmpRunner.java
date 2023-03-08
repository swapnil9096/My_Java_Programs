package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpRunner  {

	public static void main(String[] args) {
		Emp e1=new Emp(30,"Pranav");
		Emp e2=new Emp(35,"Abhi");
		Emp e3=new Emp(45,"Swapnil");	
		Emp e4=new Emp(23,"Mithlesh");
		
		List<Emp> al=new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		System.out.println("Orignal List=> "+al);
		Collections.sort(al);
		System.out.println("Sorted List=>"+al);
	}
}
