package LambdaExpressions;

import java.util.List;
import java.util.Optional;

public class OptionalClassDemo {

	public static void main(String[] args) {
		List<Integer> list=List.of(1,3,5,7);
		Optional ol=list.stream().filter(e->e%2==0).max((n1,n2)->Integer.compare(n1,n2));
	///	System.out.println(ol.get());//NoSuchElementException
		System.out.println(ol.isEmpty());//true
		System.out.println(ol.isPresent());//false
		System.out.println(ol.orElse(-100000));
		
		//get() is used when you are very sure that it is not going to return null
		List<Integer> list2=List.of(1,3,7,12);
		Optional ol1=list2.stream().filter(e->e%2==0).max((n1,n2)->Integer.compare(n1,n2));
		System.out.println(ol1.get());
		System.out.println(ol1.isEmpty());//false
		System.out.println(ol1.isPresent());//true
		System.out.println(ol1.orElse(-83649));//12
	}

}
