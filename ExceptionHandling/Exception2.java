package ExceptionHandling;

public class Exception2 {
	public static void main(String[] args) throws InterruptedException {
		b();
	}

	static void b() throws InterruptedException {
		System.out.println("Inside b method");
		c();
	}

	static void c() throws InterruptedException  {
		System.out.println("Inside c method");
		d();
		throw new RuntimeException("Invalid....");
	}

	static void d() throws InterruptedException  {
		System.out.println("Inside d method");

		Thread.sleep(4000);

	}
}
