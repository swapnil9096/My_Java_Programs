package Enum;

public class hello2 {
	static int minimumCoin(String s)
	{
		int n = s.length()-1;
		
		
		int dp[] = new int[n];
		
		if (s.charAt(n - 1) == '0')
		{
		dp[n - 1] = 0;
		}
		else {
		dp[n - 1] = 1;
		}

		for (int i = n - 2; i >= 0; i--) {
		if (s.charAt(i) == '0')
			dp[i] = dp[i + 1];
		if (s.charAt(i) == '1') {

			dp[i] = 2 + dp[i + 1];
			dp[i] = Math.min(dp[i], n - i);
		}
		}
		
		
		
		int ans = dp[0];
		for (int i = 0; i < n - 1; i++) {

		ans = Math.min(ans, i + 1 + dp[i + 1]);
		}

		ans = Math.min(ans, n);
		return ans;
	}

	public static void main (String[] args) 
	{
		String str = "21";
		int coins = minimumCoin(str);
		System.out.println(coins);
	}
	
	
	
	
	
	
	
	
	
	
}
