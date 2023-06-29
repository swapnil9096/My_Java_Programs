package Daily_Programs;

public class TokenReverse {

	public static void main(String[] args) {
		String str = "Java Is Awesome";
		String[] tokens = str.split(" ");
		for (int i = tokens.length-1 ; i >=0; i--) {
			System.out.print(tokens[i]+ " ");
		}

	}

}
