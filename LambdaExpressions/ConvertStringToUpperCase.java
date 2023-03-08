package LambdaExpressions;

import java.util.List;

public class ConvertStringToUpperCase {

	public static void main(String[] args) {
		List<String> list= List.of("Apple","Banna","Manago","santra");
		list.stream().map(u->u.toUpperCase()).forEach(u-> System.out.println(u + ","));
	}

}
