package Method_Programs;

public class Palindrome {
	public static void main(String[] args) {

		palindrome();
	}

	public static void palindrome() {
		String str = "ROTATOR";
		String str1 = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			str1 = str1 + str.charAt(i);
		}
		if (str.equals(str1)) {
			System.out.println(str + " String is Palindrome");
		} else {
			System.out.println(str + " String is NOT Palindrome");
		}

	}
}
