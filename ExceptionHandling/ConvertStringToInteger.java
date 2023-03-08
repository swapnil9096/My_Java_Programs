package ExceptionHandling;

public class ConvertStringToInteger {

	public static void main(String[] args) {
		String s = "sr1234";
		try {
			int no = Integer.parseInt(s);
			System.out.println("The No Is = " + (no + 5));
		} catch (NumberFormatException e) {
			System.out.println("The given string can not converted into integer");
		}
	}

}
