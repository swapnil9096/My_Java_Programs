package While_Loop_Programs;

public class DimondPattern {

	public static void main(String[] args) {
int rows=7,noOfSp=rows-1,noOfStars=1,i=1,j=1,r=1;
while(i<=rows)
{
	j=1;
	while(j<=noOfSp)
	{
		System.out.print(" ");
		j++;
		
	}
	r=1;
	while(r<=noOfStars)
	{
		System.out.print("*");
		r++;
				
		}
	System.out.println();
	i++;
		noOfSp--;
	noOfStars+=2; 
	
	}


noOfStars=(rows*2)-3;
rows--;
noOfSp=1;
i=1;
while(i<=rows)
{
	j=1;
	while(j<=noOfSp)
		{
			System.out.print(" ");
			j++;
		}
		r=1;
		while(r<=noOfStars)
		{
			System.out.print("*");
			r++;
			}
		System.out.println();	
	
     i++;
	noOfSp++;
	noOfStars-=2;
}	
}
	

}
