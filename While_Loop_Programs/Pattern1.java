package While_Loop_Programs;

public class Pattern1 {

	public static void main(String[] args) {
int i=1,j=1,k=1;
while(i<=4)
{
	j=1;
	while(j<=i)
	{
		j++;
		System.out.print(k++);
	}
	i++;
	System.out.println();
}

	}

}
