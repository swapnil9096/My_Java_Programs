package LambdaExpressions;

import java.util.stream.IntStream;

public class FindSquareOFFirst10Numbers {
public static void main(String[] args) {
	//IntStream.range(1, 11).map(e->e*e).forEach(e->System.out.println(e+","));
	IntStream.range(1, 11).map(e->e*e).forEach(System.out::println);
	
	
}
}
