package While_Loop_Programs;

public class HashPattern {

	public static void main(String[] args) {
int i=1,j=1,c=1,k=1;
while(i<=5)
{
	j=1;
	while(j<=c/2)
	{
		System.out.print("*");
		
		j++;
	}
	System.out.print("#");
	k=1;
		while(k<=c/2)
		{

			System.out.print("*");	
			k++;
		}
		i++;
		c+=2;
		System.out.println();
}
	}

}
