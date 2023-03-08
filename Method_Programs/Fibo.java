package Method_Programs;

public class Fibo {

	int fiboSeries() {
		int n = 0, b = 1, res = 0;
		for (int i = 0; i <= 8; i++) {
			System.out.print(n + ",");

			res = n + b;
			n = b;
			b = res;

		}
		return n;
	}

	public static void main(String[] args) {
		Fibo obj = new Fibo();
		obj.fiboSeries();
	}
}
