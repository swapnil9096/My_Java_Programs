package While_Loop_Programs;

public class PerfectNo {

	public static void main(String[] args) 
	{
	int i=1,n=7,sum=0;
	while(i<n)
	{
		if(n%i==0)
		{
			sum=sum+i;
					}
		i++;
	}
	if(sum==n)
	{
		System.out.print(n+" It is PerfectNo");
	}
	else
		System.out.print(n+ " It is NOT Perfect No");
	}

}
