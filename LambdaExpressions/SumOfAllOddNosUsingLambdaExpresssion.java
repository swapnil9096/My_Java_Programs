package LambdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class SumOfAllOddNosUsingLambdaExpresssion {
	public static void main(String[] args) {
		List<Integer> al=new ArrayList<>(List.of(13,24,25,64,73,53,34));
		int sum= al.stream().filter(o->o%2==0).reduce(0,(n1,n2)->(n1+n2));
		System.out.println(sum);
		
		//for multiplication 
		int sum1= al.stream().filter(o->o%2==0).reduce(0,(n1,n2)->(n1*n2));
		System.out.println(sum);
		
	}
}
