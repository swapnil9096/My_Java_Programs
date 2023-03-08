package LastDay;

public class ArmStrongNoUsingMethod {

	public static void main(String[] args) {

		int n = 1;
		int cnt = 0, total = 15;
		while (cnt < total)
		{
			if (isPrime(n)) 
			{
				System.out.println(n);
				cnt++;
			}
			n++;
		}
	}

	private static boolean isPrime(int n) {
		int orgNo = n;
		int pow = String.valueOf(n).length();
		double sum = 0;
		while (n != 0)
		{
			int rem = n % 10;
			sum = sum + Math.pow(rem, pow);
			n=n/10;
		}
		if (sum==orgNo) 
			return true;
		 else
			return false;
	}

}
