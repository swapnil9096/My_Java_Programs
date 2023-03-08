package LambdaExpressions;

import java.util.List;

public class PrintListOfIntegerUsingLambdaExpression {

	public static void main(String[] args) {
		List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
		//list.add(1232);//UnsupportedOperationException: Immutable collection
		//list.set(1,5);//// not supported
		//list.remove(0);
		
		list.stream().forEach(e->System.out.println(e));//labmda expression	
	}

}
