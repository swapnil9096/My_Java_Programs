package Method_Programs;

public class ArmstrongNo {

	public static void main(String[] args) {
		ArmstrongNo arms = new ArmstrongNo();
		arms.arm();
	}

	int arm() {
		int i, n1, n2, n3, sum, first, second, third;
		for (i = 100; i <= 500; i++) {
			n1 = i / 100 % 10;
			n2 = i / 10 % 10;
			n3 = i % 10;

			first = n1 * n1 * n1;
			second = n2 * n2 * n2;
			third = n3 * n3 * n3;

			sum = first + second + third;
			if (i == sum) {
				System.out.println(i + " ");

			}

		}

		return i;
	}

}
