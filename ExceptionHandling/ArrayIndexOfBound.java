package ExceptionHandling;

public class ArrayIndexOfBound {

	public static void main(String[] args) 
	{
		int[] a = { 1, 2, 3 };
		try 
		{
			System.out.println(a[2]);
			System.out.println("in try block...");
		} catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("in Catch block...");
			e.printStackTrace();
		}
	}

}
