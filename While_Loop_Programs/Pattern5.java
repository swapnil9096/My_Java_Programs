package While_Loop_Programs;

public class Pattern5 {

	public static void main(String[] args) {
		int i=1,j=1;
		while(i<=5)
		{
			j=1;
		  while(j<=i)
		  {j++;
			  System.out.print(i);
		  }
		  i++;
		 System.out.println();
		}
	}

}
