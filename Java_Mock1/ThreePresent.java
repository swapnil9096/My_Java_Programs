package Java_Mock1;

public class ThreePresent {

	public static void main(String[] args) {
		int n = 1234, f = 3, i = 0;
		for (; n > 0;) 
		{
			i = n % 10;
			if (i == f)
			{
				System.out.println(i + " : is a duplicate no");
			}
			
		}
	}

}
