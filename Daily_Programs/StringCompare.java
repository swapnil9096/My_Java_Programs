package Daily_Programs;

//WAP to compare two strings without using equals() and compareTo() method
public class StringCompare {

	public static void main(String[] args) {
		String s1 = "Sswapnil";
		String s2 = new String("SSwapnil");

		if (s1.length() != s2.length()) {
			System.out.println(s1 + " Is NOT equal to " + s2);
		}
		boolean flag = true;
		
		for (int i = 0; i < s2.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println(s1 + " is equal to " + s2);
		} else
			System.out.println(s1 + " Is NOT equal to " + s2);

	}
}
//OUTPUT=Swapnil Is NOT equal to SWail