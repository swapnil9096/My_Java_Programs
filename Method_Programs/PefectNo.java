package Method_Programs;

public class PefectNo {
	int perNO() {
		int n = 6, sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0)
				sum = sum + i;

		}
		if (n == sum)
			System.out.print("It is perfect no : ");
		else
			System.out.println("It is NOT pefetct no");
		return sum;
	}

	public static void main(String[] args) {
		PefectNo obj = new PefectNo();
		System.out.println(obj.perNO());
	}
}
