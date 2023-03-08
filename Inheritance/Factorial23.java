package Inheritance;

public class Factorial23 {

	public static void main(String[] args) {
		Factorial23 obj = new Factorial23();
		// System.out.println(obj.factorial());
		obj.factorial();
	}

	void factorial() {
		int n = 6, fact = 1;
		for (int i = n; i >= 1; i--) {
			fact = fact * i;
		}
		System.out.println(fact);
		// return fact;
	}
}
