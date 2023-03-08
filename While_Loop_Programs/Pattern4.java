package While_Loop_Programs;

public class Pattern4 {

	public static void main(String[] args) {
		int i=1,j=1;
		while(i<=5)
		{
			j=1;
			while(j<=i)
			{
				
				System.out.print(j++);
			}
			i++;
			System.out.println();
		}
	}

}
