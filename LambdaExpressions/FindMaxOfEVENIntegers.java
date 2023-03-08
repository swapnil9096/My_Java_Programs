package LambdaExpressions;

import java.util.List;
import java.util.Optional;

public class FindMaxOfEVENIntegers {

	public static void main(String[] args) {
Optional<Integer> ol = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream().filter(e -> e % 2 == 0)
				.max((n1, n2) -> Integer.compare(n1, n2));
		System.out.println(ol.get());
		
		// if even no is not present in the list, then try finding max from even numbers
		
		Optional<Integer> ol1 = List.of(1,5,3,9,23,67,53,89,33,89,23).stream().filter(e->e%2==0)
				.max((n1,n2)->Integer.compare(n1,n2));
		//System.out.println(ol1.get());// no value present//shows Exception
		System.out.println(ol1.orElse(-34));
	}

}
