package Basic_Assignment;
/*Print the following pattern on the screen
*****
 *** 
  *  
 *** 
******/

public class Assignment3 
{

	public static void main(String[] args)
	{
      int rows=3;
      int noOfStars=5;
      int noOfSp=1;
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
      noOfStars=3;
      noOfSp=3;
      rows=2;
      for(int i=1;i<=rows;i++)
      {
    	  for(int j=1;j<noOfSp;j++)
    	  {
    		  System.out.print(" ");
      	  }
    	  for(int k=1;k<=noOfStars;k++)
    	  {
    		  System.out.print("*");
            }
    	  System.out.println( );
         noOfSp--;
         noOfStars+=2;
 	}

	}
}

