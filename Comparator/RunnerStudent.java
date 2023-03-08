package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RunnerStudent {

	public static void main(String[] args) {
		
		Student s1 = new Student(100, "Virat");
		Student s2 = new Student(20, "Surya");
		Student s3 = new Student(87, "Hardik");
		Student s4 = new Student(34, "Jadeja");
		
		List<Student> al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		System.out.println("Orignal List=>" + al);
		Collections.sort(al, new IdSortAsc());
		System.out.println("Sorted List Acending=> " + al);
		Collections.sort(al, new IdSortDesc());
		System.out.println("Sorted List Decending=> " + al);
		Collections.sort(al,new NameSortAsc());
		System.out.println("Sorted List Acording to Name"+al);
	}

}
