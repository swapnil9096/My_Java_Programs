package Basic_Assignment;

/*A student will not be allowed to sit in exam if his/her attendance is less than 75%.
Take following input from user
Number of classes held 
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.
*/
public class IfElseAssignment8 {

	public static void main(String[] args) {
int totClass=873,attendClass=750,perc;
      perc=(attendClass*100)/totClass;
  	System.out.println("percentage of class attended "+perc+" %");

      if(perc>75)
    	  System.out.println("Student is Allowed to Seat in Exam");
      else
      {
    	  System.out.println("Student is NOT Allowed to Seat in Exam");
      }
	}
	{
		
	}

}
