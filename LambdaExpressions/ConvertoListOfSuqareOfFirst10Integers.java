package LambdaExpressions;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConvertoListOfSuqareOfFirst10Integers {

	public static void main(String[] args) {
		
		// First 10 integers
		// boxed converts from pipeline to stream
		List<Integer> list1= IntStream.range(1, 11).map(square->square*square).boxed().collect(Collectors.toList());
		System.out.println(list1);
		
		// List of user input Integers
		List<Integer> list2 =List.of(2,3,4,5,6,7).stream().map(x->x * x).collect(Collectors.toList());
		System.out.println(list2);
			
		Set<Integer> set= List.of(2,3,4,5,6,8).stream().map(s->s*s).collect(Collectors.toSet());
		System.out.println(set);
	}

}
