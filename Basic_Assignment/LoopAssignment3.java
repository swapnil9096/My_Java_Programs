package Basic_Assignment;
/*o	Print the following patterns using loop :
o	  *  
o	 *** 
o	*****
o	 *** 
o	  **/

public class LoopAssignment3 {

	public static void main(String[] args) {
int rows=3;
int noOfSp=rows-1;
int noOfStars=1;
for(int i=1;i<=rows;i++)
{
	for(int j=1;j<=noOfSp;j++)
	{
		System.out.print(" ");
	}
	for(int k=1;k<=noOfStars;k++)
	{
		System.out.print("*");
	}
	System.out.println();
	noOfSp--;
	noOfStars+=2;
	
	}

rows=2;
noOfSp=1;
noOfStars=3;
for(int i=1;i<=rows;i++)
{
	for(int j=1;j<=noOfSp;j++)
	{
		System.out.print(" ");
	}
	for(int k=1;k<=noOfStars;k++)
	{
		System.out.print("*");
	}
	System.out.println();
	noOfSp++;
	noOfStars-=2;


	}
	}
}
