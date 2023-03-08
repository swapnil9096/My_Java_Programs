package Enum;

import java.util.HashMap;

public class Hello {

	static int max_ref; 
	static int _lis2(int arr[], int n)
	{
		if (n == 1)
			return 1;

		
		int res, max_ending_here = 0;

	
		for (int i = 1; i < n; i++) {
			res = _lis2(arr, i);
			if (arr[i - 1] < arr[n - 1]
				&& res + 1 > max_ending_here)
				max_ending_here = res + 1;
		}

		
		if (max_ref < max_ending_here)
			max_ref = max_ending_here;

		return max_ending_here;
	}

//=============	
	
	static int _lis1(int arr[], int n)
	{
		if (n == 1)
			return 1;

		
		int res, max_ending_here = 1;

	
		for (int i = 1; i < n; i++) {
			res = _lis1(arr, i);
			if (arr[i - 1] < arr[n - 1]
				&& res + 1 > max_ending_here)
				max_ending_here = res + 1;
		}

		
		if (max_ref < max_ending_here)
			max_ref = max_ending_here;

		return max_ending_here;
	}

//	======
	static int _lis3(int arr[], int n)
	{
		// base case
		if (n == 1)
			return 1;

		
		int res, max_ending_here =0;

	
		for (int i = 1; i < n; i++) {
			res = _lis3(arr, i);
			if (arr[i-1] < arr[n-1]
				&& res + 1 > max_ending_here)
				max_ending_here = res + 1;
		}

		
		if (max_ref < max_ending_here)
			max_ref = max_ending_here;

		return max_ending_here;
	}
	
//	=============
	static int lis2(int arr[], int n)
	{
		max_ref = 1;

		_lis2(arr, n);

		return max_ref;
	}
	static int lis3(int arr[], int n)
	{
		max_ref = 1;

		_lis3(arr, n-1);

		return max_ref;
	}

	static int lis1(int arr[], int n)
	{
		max_ref = 1;

		_lis1(arr, n);

		return max_ref;
	}
	
	//================
			static int gcd(int a, int b)
			{
				if (a == 0)
					return b;
				return gcd(b % a, a);
			}

			static int findGCD(int arr[], int n)
			{
				int result = arr[0];
				for (int element: arr){
					result = gcd(result, element);

					if(result == 1)
					{
					return 1;
					}
				}

				return result;
			}

			
			
			public static int maxLengthSub(int[] arr)
			{
				
				int max_val = 0;
				
				HashMap<Integer, Integer> map = new HashMap<>();

				for (int i = 0; i < arr.length; i++)
				{
					
					int temp = 0;
					if (map.containsKey(arr[i] - 1))
					{
						temp = map.get(arr[i] - 1);
					}

					if (map.containsKey(arr[i]))
					{
						temp = Math.max(temp, map.get(arr[i]));
					}
					
					if (map.containsKey(arr[i] + 1))
					{
						temp = Math.max(temp, map.get(arr[i] + 1));
					}
					temp++;
					if (temp > max_val)
					{
						max_val = temp;
					}
					map.put(arr[i], temp);
				}
				
				return max_val;
			}
			
				
	public static void main(String args[])
	{
		int arr1[] = {4,4,3};
		int n1 = arr1.length;
		
		int arr2[] = {6,4,5,8};
		int n2 = arr2.length;
		
		int arr3[] = {3,4,6,8};
		int n3 = arr3.length;
		
		System.out.println("Length of lis is " + lis1(arr1, n1)//1
						+ "\n");
		System.out.println("Length of lis is " + lis2(arr2, n2)//2
		+ "\n");
		System.out.println("Length of lis is " + lis3(arr3, n3)//3
		+ "\n");
		
		System.out.println("==".repeat(40));
		
		System.out.println(findGCD(arr1, n1));
		System.out.println(findGCD(arr2, n2));
		System.out.println(findGCD(arr3, n3));
		
		System.out.println("==".repeat(40));
		
		System.out.println(maxLengthSub(arr1));
		System.out.println(maxLengthSub(arr2));
		System.out.println(maxLengthSub(arr3));
	}
}














