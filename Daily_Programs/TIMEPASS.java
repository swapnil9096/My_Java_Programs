package Daily_Programs;

public class TIMEPASS {
	public static void main(String[] args) {
		String s1 = "Swapnil", s2 = "Swapnil";

		for (int i = 0; i < s1.length() && i < s2.length(); i++) {
			int a = s1.charAt(i);
			int b = s2.charAt(i);

			if (a != b ||s1.length() != s2.length()) {
				System.out.println("s1 is Not equal to s2");
				break;
			} else if (a == b) {
				System.out.println("s1 is  equal to s2");
				break;
			}

	}

} }
