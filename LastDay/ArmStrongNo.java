package LastDay;

public class ArmStrongNo {
	public static void main(String[] args) {
		int n = 15;
		int orgNo = n;
		int pow = String.valueOf(n).length();
		System.out.println(pow);
		double sum = 0;
		while (n != 0) {
			int r = n % 10;
			sum = sum + Math.pow(r, pow);// 9
			n = n / 10;
		}
		if (orgNo == sum) {
			System.out.println("It is ArmStrong no");
		} else {
			System.out.println("It is Not ArmString No");
		}
	}
}
