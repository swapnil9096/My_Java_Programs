package Array_Programs;

public class RevArray {

	public static void main(String[] args) {
		int[] a = new int[4];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		for (int i = a.length - 1; i >= 0; i--) 
		{
			System.out.print(a[i]);
		}

	}
}
