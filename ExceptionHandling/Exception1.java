package ExceptionHandling;

public class Exception1 {
	public static void main(String[] args) {
		System.out.println("start program");
		try {
			System.out.println("inside try program");

			int a = 10;
			System.out.println(a / 0);
		} catch (ArithmeticException e) {
			System.out.println("inside catch program");
			// System.exit(0);
			e.printStackTrace();
		} catch (Exception x) {
			x.printStackTrace();
		} finally {
			System.out.println("Invalid...");
		}
		System.out.println("end program");

	}
}
