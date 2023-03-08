package While_Loop_Programs;

public class HashSquare {

	public static void main(String[] args) {
		int i=1,j=1;
		while(i<=10)
		{
			j=1;
			while(j<=10)
			{
				if(i>=2 && j>=2 && i<=9 && j<=9)
					System.out.print("#");
				else
					System.out.print("*");
				j++;
			}
			i++;
			System.out.println();
	}

}}
