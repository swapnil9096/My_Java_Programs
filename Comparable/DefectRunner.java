package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DefectRunner {

	public static void main(String[] args) {
		Defect a=new Defect(1,"virat");
		Defect b=new Defect(9,"surya");
		Defect c=new Defect(5,"anuj");
		
		List<Defect> al=new ArrayList<>();
		al.add(a);
		al.add(b);
		al.add(c);
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
	}

}
