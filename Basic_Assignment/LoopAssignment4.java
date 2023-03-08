package Basic_Assignment;
/*o	Print the pattern
o	
o	1010101
o	 10101       
o	  101  
o	   1*/

public class LoopAssignment4 {

	public static void main(String[] args) {
int rows=4;
int noOfSp=5;
int noOfValue1=7;



for(int i=1;i<=rows;i++)
{
	for(int j=1;j<=noOfSp;j++)
	{
		System.out.print(" ");
	}
	for(int k=1;k<=noOfValue1;k++)//2*i-1
	{
		System.out.print(k%2);
		}
	System.out.println();
noOfSp++;
noOfValue1-=2;
}
}
}
