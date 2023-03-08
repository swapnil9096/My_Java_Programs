package Daily_Programs;

public class Palindrome {

	public static void main(String[] args) {
		String orgStr = "MADAM";
		String revStr = "";
		for (int i = orgStr.length() - 1; i >= 0; i--) {
			revStr = revStr + orgStr.charAt(i);//MADAM
		}
		if (orgStr.equals(revStr)) {
			System.out.print("'" + orgStr + "'" + " String is Palindrome ");
		} else {
			System.out.print("Not palindrome");
		}
	}

}
