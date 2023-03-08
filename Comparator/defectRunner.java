package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class defectRunner {

	public static void main(String[] args) {
		Defect a=new Defect(100,"virat");
		Defect b=new Defect(105,"swapnil");
		Defect c=new Defect(108,"pranav");
		Defect d=new Defect(102,"bangad");
		Defect e=new Defect(109,"surya");
		
		List<Defect> al=new ArrayList<>();
		al.add(a);
		al.add(b);
		al.add(c);
		al.add(d);
		al.add(e);
		System.out.println(al);
		
		Collections.sort(al, new ASCorderDefect());
		System.out.println("Sorted List al: "+al);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
