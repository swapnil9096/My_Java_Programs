package LambdaExpressions;

import java.util.List;
import java.util.Optional;

public class FindMaxNo {

	public static void main(String[] args) {
		Optional<Integer> ol=List.of(12,5,4,8,23,67,54,89,32,89,23).stream()
				.max((n1,n2)->Integer.compare(n1,n2));
		System.out.println(ol.get());
		
		
		
		// for minimum
		Optional<Integer> olMin=List.of(12,5,4,8,23,67,54,89,32,89,23).stream()
				.min((n1,n2)->Integer.compare(n1,n2));
		
		System.out.println(olMin.get());
		
	}

}
