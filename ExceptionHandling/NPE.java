package ExceptionHandling;

public class NPE {
	public static void main(String[] args) {
		String s = null;
		try {
			System.out.println(s.length());// gives null point exception
			System.out.println("In Try block....");
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("In Catch block...");
		}
		// oprrating an variable contain null value so NPE

	}
}
