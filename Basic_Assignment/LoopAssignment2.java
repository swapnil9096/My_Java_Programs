package Basic_Assignment;

/*o	Print the following patterns using loop :
o	a.
o	*
o	**
o	***
o	****
*/
public class LoopAssignment2 {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
