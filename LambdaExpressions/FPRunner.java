package LambdaExpressions;

import java.util.List;

public class FPRunner {
	static void myPrint(String i) {
		System.out.println(i);
	}

	public static void main(String[] args) {
		List<String> list = List.of("kutra", "dukkar", "manjar", "pillu");
		printFp(list);
		printBasic(list);
		myPrint("bangad");
		
		
	}

	private static void printBasic( List<String> list) {
		for (String x : list)
			System.out.println(x);
	}

	private static void printFp(List<String> list) {
		list.stream().forEach(
		// (element->System.out.println(element)
//	System.out::println;  //Method reference
				FPRunner::myPrint);
	}

}
