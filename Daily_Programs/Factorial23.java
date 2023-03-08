package Daily_Programs;

public class Factorial23 {
	public static void main(String[] args) {
		int n = 5, fact = 1;
		for (int i = n; i >= 1; i--) {
			fact = i * fact;// 6 30 120...
		}
		System.out.print(fact);
	}
}
