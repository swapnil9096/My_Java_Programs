package for_Loop_Programs;

public class HashPattern { 

	public static void main(String[] args) {
		int c=1;//3,5,7
   for(int i=1;i<=5 ;i++)//3,4
{ 
	for(int j=1; j<=(c/2);j++)
	{
		System.out.print("*");
	}
		System.out.print("#"); 
		
	for (int k=1;k<=(c/2);k++)  
{
	System.out.print("*");
}

c+=2;
System.out.println();
	}
	

}}
