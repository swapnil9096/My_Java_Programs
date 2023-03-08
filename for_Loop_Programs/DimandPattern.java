package for_Loop_Programs;

public class DimandPattern {

	public static void main(String[] args) {
int rows=7 ;
int noOfSp=rows-1;//6 5 4 3 2 1 0 
int noOfStars=1;//1 3 5 7 9 11 13 
 

	for(int r=1;r<=rows;r++)//1 2 3 4 5 6 7
	{
     for(int i=1;i<=noOfSp;i++)
     {
    	 System.out.print(" ");
     }
	for(int j=1;j<=noOfStars;j++)
	{
      System.out.print("*");
	}
	System.out.println();
	noOfSp--;
	
	noOfStars+=2;
}
    noOfStars=(rows*2)-3;//11 9 7 5 3 1 -1
    rows--;//6 5
    noOfSp=1; //1 2  3 4	5	6								
    for(int r=1;r<=rows;r++)
    { 
    for(int i=1;i<=noOfSp;i++)
    {
    		System.out.print(" ");
    }	
    	for(int j=1;j<=noOfStars;j++)
    	{		
    		System.out.print("*");
    	}
    	System.out.println();
    noOfSp++;
    noOfStars-=2;
    
    }
}
	}


