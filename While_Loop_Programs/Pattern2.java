package While_Loop_Programs;

public class Pattern2 {

	public static void main(String[] args) {
int i=1,j=1;
while(i<=4)
{
	j=1;
	while(j<=i)
	{
		j++;
		System.out.print("*");
	}
	i++;
	System.out.println();
}

	}

}
