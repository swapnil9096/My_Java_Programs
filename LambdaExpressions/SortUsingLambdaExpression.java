package LambdaExpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortUsingLambdaExpression {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>(Arrays.asList(3,32,45,65,77,53,83,56,45,3,56,79,99));
		
		al.stream().distinct().sorted().forEach(e -> System.out.print(e+","));
		
		
		
	}

}
