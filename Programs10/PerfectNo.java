package Programs10;

public class PerfectNo {
	public static void main(String[] args) {
		
		int no = 6,sum = 0;
		
		for(int i = 1 ;i < no ; i++)
		{
			if(no % i == 0)
			{
				sum = sum + i ;
			}
		}
		
		if(no == sum)
			System.out.println("It is perfect no");
		else
			System.out.println("It is NOT perfect number");
	}
}
